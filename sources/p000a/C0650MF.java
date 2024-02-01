package p000a;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.MF */
/* loaded from: classes.dex */
public final class C0650MF {

    /* renamed from: N */
    public static final HashMap f2088N = new HashMap();

    /* renamed from: P */
    public FileChannel f2089P;

    /* renamed from: h */
    public final File f2090h;

    /* renamed from: v */
    public final Lock f2091v;

    /* renamed from: z */
    public final boolean f2092z;

    public C0650MF(String str, File file, boolean z) {
        File file2;
        Lock lock;
        this.f2092z = z;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.f2090h = file2;
        HashMap hashMap = f2088N;
        synchronized (hashMap) {
            Object obj = hashMap.get(str);
            if (obj == null) {
                obj = new ReentrantLock();
                hashMap.put(str, obj);
            }
            lock = (Lock) obj;
        }
        this.f2091v = lock;
    }

    /* renamed from: h */
    public final void m1455h() {
        try {
            FileChannel fileChannel = this.f2089P;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f2091v.unlock();
    }

    /* renamed from: z */
    public final void m1456z(boolean z) {
        this.f2091v.lock();
        if (z) {
            File file = this.f2090h;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f2089P = channel;
            } catch (IOException e) {
                this.f2089P = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }
}
