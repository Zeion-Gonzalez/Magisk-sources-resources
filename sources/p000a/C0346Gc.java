package p000a;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.system.Os;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.Gc */
/* loaded from: classes.dex */
public final class C0346Gc extends AbstractC1145VQ {

    /* renamed from: N */
    private static InterfaceC1798hr f1162N;

    /* renamed from: P */
    public static final C0382HH f1163P = new C0382HH();

    /* renamed from: Q */
    private static AbstractC1026TE f1164Q = AbstractC1026TE.f3430z;

    /* renamed from: u */
    private static InterfaceC0431IA f1165u;

    /* renamed from: h */
    private final String f1166h;

    /* renamed from: v */
    private ActivityManager f1167v;

    public C0346Gc() {
        this(null);
        AbstractC1530cs.f4727z.m1158o(new C1668fN());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [a.ru] */
    /* renamed from: E */
    public final ActivityManager.RunningAppProcessInfo m746E(int i) {
        Object obj;
        BufferedReader bufferedReader;
        Object obj2;
        boolean z;
        ActivityManager activityManager = this.f1167v;
        if (activityManager == null) {
            activityManager = null;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        while (i > 1) {
            Iterator it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
            if (runningAppProcessInfo != null) {
                return runningAppProcessInfo;
            }
            if (Os.stat("/proc/" + i).st_uid == 0) {
                return null;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File(AbstractC2441tz.m4190Q("/proc/", i, "/status"))), AbstractC2047ma.f6374z);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            try {
                C1228Wy c1228Wy = new C1228Wy(bufferedReader);
                if (!(c1228Wy instanceof C2333ru)) {
                    c1228Wy = new C2333ru(c1228Wy);
                }
                Iterator it2 = c1228Wy.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((String) obj2).startsWith("PPid:")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                String str = (String) obj2;
                if (str == null) {
                    AbstractC1292YB.m2659R(bufferedReader, null);
                    return null;
                }
                i = Integer.parseInt(AbstractC1269Xn.m2580Uf(str.substring(5)).toString());
                AbstractC1292YB.m2659R(bufferedReader, null);
            } finally {
            }
        }
        return null;
    }

    /* renamed from: f */
    private final <T> T m749f(T t, InterfaceC1459bP interfaceC1459bP) {
        try {
            return (T) interfaceC1459bP.mo93z();
        } catch (Throwable th) {
            AbstractC1530cs.f4727z.mo1160v(th);
            return t;
        }
    }

    @Override // p000a.AbstractC1145VQ
    /* renamed from: N */
    public ComponentName mo755N() {
        return new ComponentName(getPackageName(), this.f1166h);
    }

    @Override // p000a.AbstractC1145VQ
    /* renamed from: o */
    public void mo756o() {
        Object obj = AbstractC0865QC.f2950z;
        this.f1167v = (ActivityManager) AbstractC1375Zj.m2770h(this, ActivityManager.class);
    }

    @Override // p000a.AbstractC1145VQ
    /* renamed from: u */
    public IBinder mo757u(Intent intent) {
        return new BinderC1942kY(this);
    }

    public C0346Gc(Object obj) {
        String name = obj != null ? obj.getClass().getName() : null;
        this.f1166h = name == null ? C0346Gc.class.getName() : name;
    }
}
