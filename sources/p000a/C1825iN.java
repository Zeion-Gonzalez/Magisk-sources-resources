package p000a;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Executor;

/* renamed from: a.iN */
/* loaded from: classes.dex */
public final class C1825iN {

    /* renamed from: N */
    public final File f5706N;

    /* renamed from: P */
    public final byte[] f5707P;

    /* renamed from: Q */
    public final String f5708Q;

    /* renamed from: W */
    public byte[] f5709W;

    /* renamed from: h */
    public final Executor f5710h;

    /* renamed from: o */
    public C0836Pa[] f5711o;

    /* renamed from: u */
    public boolean f5712u;

    /* renamed from: v */
    public final InterfaceC0310Fv f5713v;

    /* renamed from: z */
    public final AssetManager f5714z;

    public C1825iN(AssetManager assetManager, ExecutorC0051B0 executorC0051B0, String str, File file) {
        byte[] bArr;
        C1665fK c1665fK = AbstractC1292YB.f4140W;
        this.f5712u = false;
        this.f5714z = assetManager;
        this.f5710h = executorC0051B0;
        this.f5713v = c1665fK;
        this.f5708Q = str;
        this.f5706N = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = AbstractC2575wW.f7855C;
                    break;
                case 26:
                    bArr = AbstractC2575wW.f7875Z;
                    break;
                case 27:
                    bArr = AbstractC2575wW.f7857F;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC2575wW.f7873X;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC2575wW.f7878e;
                    break;
            }
            this.f5707P = bArr;
        }
        bArr = null;
        this.f5707P = bArr;
    }

    /* renamed from: z */
    public final FileInputStream m3381z(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                switch (((C1665fK) this.f5713v).f5200S) {
                    case 14:
                        break;
                    default:
                        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                        break;
                }
            }
            return null;
        }
    }
}
