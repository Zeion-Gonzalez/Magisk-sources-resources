package p000a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: a.oj */
/* loaded from: classes.dex */
public abstract class AbstractC2159oj {

    /* renamed from: P */
    public static final C2698yx f6625P;

    /* renamed from: h */
    public static final ThreadPoolExecutor f6626h;

    /* renamed from: v */
    public static final Object f6627v;

    /* renamed from: z */
    public static final C0519Jm f6628z = new C0519Jm(16);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1347ZD());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f6626h = threadPoolExecutor;
        f6627v = new Object();
        f6625P = new C2698yx();
    }

    /* renamed from: z */
    public static C1846ik m3771z(String str, Context context, C2226py c2226py, int i) {
        int i2;
        C0519Jm c0519Jm = f6628z;
        Typeface typeface = (Typeface) c0519Jm.m1210z(str);
        if (typeface != null) {
            return new C1846ik(typeface);
        }
        try {
            C0073BQ m992E = AbstractC0438II.m992E(context, c2226py);
            int i3 = m992E.f310S;
            int i4 = 1;
            Object obj = m992E.f309R;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                C0980SO[] c0980soArr = (C0980SO[]) obj;
                if (c0980soArr != null && c0980soArr.length != 0) {
                    for (C0980SO c0980so : c0980soArr) {
                        int i5 = c0980so.f3307N;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                            i2 = -3;
                        }
                    }
                    i4 = 0;
                }
                i2 = i4;
            }
            if (i2 != 0) {
                return new C1846ik(i2);
            }
            Typeface mo135I = AbstractC1731gb.f5459z.mo135I(context, (C0980SO[]) obj, i);
            if (mo135I != null) {
                c0519Jm.m1208h(str, mo135I);
                return new C1846ik(mo135I);
            }
            return new C1846ik(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1846ik(-1);
        }
    }
}
