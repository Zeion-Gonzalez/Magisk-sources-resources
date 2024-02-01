package p000a;

import android.os.Build;
import android.os.Process;

/* renamed from: a.LC */
/* loaded from: classes.dex */
public abstract class AbstractC0598LC {

    /* renamed from: h */
    public static final int f1920h;

    /* renamed from: z */
    public static final String f1921z;

    static {
        boolean z;
        String str;
        boolean z2 = true;
        if (Build.SUPPORTED_64_BIT_ABIS.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
            if (strArr.length != 0) {
                z2 = false;
            }
            if (!z2) {
                str = strArr[0];
                f1921z = str;
                f1920h = Process.myUid() / 100000;
            }
        }
        str = null;
        f1921z = str;
        f1920h = Process.myUid() / 100000;
    }
}
