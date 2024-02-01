package p000a;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: a.gb */
/* loaded from: classes.dex */
public abstract class AbstractC1731gb {

    /* renamed from: h */
    public static final C0519Jm f5458h;

    /* renamed from: z */
    public static final C2196pM f5459z;

    static {
        C2196pM c0067bk;
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c0067bk = new C2608x5();
        } else if (i >= 28) {
            c0067bk = new C1683fe();
        } else if (i >= 26) {
            c0067bk = new C0391HQ();
        } else {
            if (i >= 24) {
                Method method = C1395a9.f4397q;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c0067bk = new C1395a9();
                }
            }
            c0067bk = new C0067BK();
        }
        f5459z = c0067bk;
        f5458h = new C0519Jm(16);
    }

    /* renamed from: h */
    public static String m3265h(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r3.equals(r5) == false) goto L15;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m3266z(android.content.Context r15, p000a.InterfaceC2362sR r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, p000a.AbstractC2703z2 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1731gb.m3266z(android.content.Context, a.sR, android.content.res.Resources, int, java.lang.String, int, int, a.z2, boolean):android.graphics.Typeface");
    }
}
