package p000a;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: a.lo */
/* loaded from: classes.dex */
public abstract class AbstractC2010lo extends C2194pK {

    /* renamed from: G */
    public static Class f6242G = null;

    /* renamed from: M */
    public static Field f6243M = null;

    /* renamed from: V */
    public static Field f6244V = null;

    /* renamed from: W */
    public static Method f6245W = null;

    /* renamed from: o */
    public static boolean f6246o = false;

    /* renamed from: N */
    public C2739zj f6247N;

    /* renamed from: P */
    public C2739zj[] f6248P;

    /* renamed from: Q */
    public C2621xJ f6249Q;

    /* renamed from: u */
    public C2739zj f6250u;

    /* renamed from: v */
    public final WindowInsets f6251v;

    public AbstractC2010lo(C2621xJ c2621xJ, WindowInsets windowInsets) {
        super(c2621xJ);
        this.f6247N = null;
        this.f6251v = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: U */
    private static void m3638U() {
        try {
            f6245W = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f6242G = cls;
            f6243M = cls.getDeclaredField("mVisibleInsets");
            f6244V = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f6243M.setAccessible(true);
            f6244V.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f6246o = true;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: k */
    private C2739zj m3639k(int i, boolean z) {
        C2739zj c2739zj = C2739zj.f8590N;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c2739zj = C2739zj.m4675z(c2739zj, m3649g(i2, z));
            }
        }
        return c2739zj;
    }

    /* renamed from: s */
    private C2739zj m3640s(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f6246o) {
                m3638U();
            }
            Method method = f6245W;
            if (method != null && f6242G != null && f6243M != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f6243M.get(f6244V.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return C2739zj.m4673h(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    /* renamed from: y */
    private C2739zj m3641y() {
        C2621xJ c2621xJ = this.f6249Q;
        if (c2621xJ != null) {
            return c2621xJ.f8107z.mo1089o();
        }
        return C2739zj.f8590N;
    }

    /* renamed from: E */
    public void m3642E(C2739zj c2739zj) {
        this.f6250u = c2739zj;
    }

    @Override // p000a.C2194pK
    /* renamed from: G */
    public final C2739zj mo3643G() {
        if (this.f6247N == null) {
            WindowInsets windowInsets = this.f6251v;
            this.f6247N = C2739zj.m4673h(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f6247N;
    }

    @Override // p000a.C2194pK
    /* renamed from: I */
    public void mo3644I(C2621xJ c2621xJ) {
        this.f6249Q = c2621xJ;
    }

    @Override // p000a.C2194pK
    /* renamed from: P */
    public void mo3645P(View view) {
        C2739zj m3640s = m3640s(view);
        if (m3640s == null) {
            m3640s = C2739zj.f8590N;
        }
        m3642E(m3640s);
    }

    @Override // p000a.C2194pK
    /* renamed from: Q */
    public C2739zj mo3646Q(int i) {
        return m3639k(i, false);
    }

    @Override // p000a.C2194pK
    /* renamed from: R */
    public boolean mo3647R() {
        return this.f6251v.isRound();
    }

    @Override // p000a.C2194pK
    /* renamed from: V */
    public C2621xJ mo3648V(int i, int i2, int i3, int i4) {
        C2196pM c2196pM = new C2196pM(C2621xJ.m4514o(null, this.f6251v));
        ((AbstractC1522cj) c2196pM.f6755R).mo2380u(C2621xJ.m4513Q(mo3643G(), i, i2, i3, i4));
        ((AbstractC1522cj) c2196pM.f6755R).mo2375N(C2621xJ.m4513Q(mo1089o(), i, i2, i3, i4));
        return c2196pM.m3817R();
    }

    @Override // p000a.C2194pK
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f6250u, ((AbstractC2010lo) obj).f6250u);
        }
        return false;
    }

    /* renamed from: g */
    public C2739zj m3649g(int i, boolean z) {
        int i2;
        C0591L2 mo3811N;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i != 1) {
            C2739zj c2739zj = null;
            if (i != 2) {
                C2739zj c2739zj2 = C2739zj.f8590N;
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i != 128) {
                                    return c2739zj2;
                                }
                                C2621xJ c2621xJ = this.f6249Q;
                                if (c2621xJ != null) {
                                    mo3811N = c2621xJ.f8107z.mo3811N();
                                } else {
                                    mo3811N = mo3811N();
                                }
                                if (mo3811N != null) {
                                    int i7 = Build.VERSION.SDK_INT;
                                    DisplayCutout displayCutout = mo3811N.f1906z;
                                    if (i7 >= 28) {
                                        i3 = AbstractC1839id.m3391P(displayCutout);
                                    } else {
                                        i3 = 0;
                                    }
                                    if (i7 >= 28) {
                                        i4 = AbstractC1839id.m3392Q(displayCutout);
                                    } else {
                                        i4 = 0;
                                    }
                                    if (i7 >= 28) {
                                        i5 = AbstractC1839id.m3390N(displayCutout);
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i7 >= 28) {
                                        i6 = AbstractC1839id.m3394v(displayCutout);
                                    }
                                    return C2739zj.m4673h(i3, i4, i5, i6);
                                }
                                return c2739zj2;
                            }
                            return mo3810M();
                        }
                        return mo3813u();
                    }
                    return mo3812W();
                }
                C2739zj[] c2739zjArr = this.f6248P;
                if (c2739zjArr != null) {
                    c2739zj = c2739zjArr[AbstractC1843ih.m3425T(8)];
                }
                if (c2739zj != null) {
                    return c2739zj;
                }
                C2739zj mo3643G = mo3643G();
                C2739zj m3641y = m3641y();
                int i8 = mo3643G.f8591P;
                if (i8 > m3641y.f8591P) {
                    return C2739zj.m4673h(0, 0, 0, i8);
                }
                C2739zj c2739zj3 = this.f6250u;
                if (c2739zj3 != null && !c2739zj3.equals(c2739zj2) && (i2 = this.f6250u.f8591P) > m3641y.f8591P) {
                    return C2739zj.m4673h(0, 0, 0, i2);
                }
                return c2739zj2;
            }
            if (z) {
                C2739zj m3641y2 = m3641y();
                C2739zj mo1089o = mo1089o();
                return C2739zj.m4673h(Math.max(m3641y2.f8594z, mo1089o.f8594z), 0, Math.max(m3641y2.f8593v, mo1089o.f8593v), Math.max(m3641y2.f8591P, mo1089o.f8591P));
            }
            C2739zj mo3643G2 = mo3643G();
            C2621xJ c2621xJ2 = this.f6249Q;
            if (c2621xJ2 != null) {
                c2739zj = c2621xJ2.f8107z.mo1089o();
            }
            int i9 = mo3643G2.f8591P;
            if (c2739zj != null) {
                i9 = Math.min(i9, c2739zj.f8591P);
            }
            return C2739zj.m4673h(mo3643G2.f8594z, 0, mo3643G2.f8593v, i9);
        }
        if (z) {
            return C2739zj.m4673h(0, Math.max(m3641y().f8592h, mo3643G().f8592h), 0, 0);
        }
        return C2739zj.m4673h(0, mo3643G().f8592h, 0, 0);
    }

    @Override // p000a.C2194pK
    /* renamed from: w */
    public void mo3650w(C2739zj[] c2739zjArr) {
        this.f6248P = c2739zjArr;
    }
}
