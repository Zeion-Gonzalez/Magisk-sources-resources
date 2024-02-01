package p000a;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: a.te */
/* loaded from: classes.dex */
public final class C2423te extends AbstractC1522cj {

    /* renamed from: N */
    public static Field f7419N = null;

    /* renamed from: Q */
    public static boolean f7420Q = false;

    /* renamed from: o */
    public static boolean f7421o = false;

    /* renamed from: u */
    public static Constructor f7422u;

    /* renamed from: P */
    public C2739zj f7423P;

    /* renamed from: v */
    public WindowInsets f7424v;

    public C2423te() {
        this.f7424v = m4174W();
    }

    /* renamed from: W */
    private static WindowInsets m4174W() {
        if (!f7420Q) {
            try {
                f7419N = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f7420Q = true;
        }
        Field field = f7419N;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!f7421o) {
            try {
                f7422u = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            f7421o = true;
        }
        Constructor constructor = f7422u;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // p000a.AbstractC1522cj
    /* renamed from: N */
    public void mo2375N(C2739zj c2739zj) {
        this.f7423P = c2739zj;
    }

    @Override // p000a.AbstractC1522cj
    /* renamed from: h */
    public C2621xJ mo2378h() {
        m2946z();
        C2621xJ m4514o = C2621xJ.m4514o(null, this.f7424v);
        C2739zj[] c2739zjArr = this.f4700h;
        C2194pK c2194pK = m4514o.f8107z;
        c2194pK.mo3650w(c2739zjArr);
        c2194pK.mo1090q(this.f7423P);
        return m4514o;
    }

    @Override // p000a.AbstractC1522cj
    /* renamed from: u */
    public void mo2380u(C2739zj c2739zj) {
        WindowInsets windowInsets = this.f7424v;
        if (windowInsets != null) {
            this.f7424v = windowInsets.replaceSystemWindowInsets(c2739zj.f8594z, c2739zj.f8592h, c2739zj.f8593v, c2739zj.f8591P);
        }
    }

    public C2423te(C2621xJ c2621xJ) {
        super(c2621xJ);
        this.f7424v = c2621xJ.m4518u();
    }
}
