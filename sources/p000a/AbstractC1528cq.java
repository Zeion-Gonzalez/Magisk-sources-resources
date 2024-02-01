package p000a;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: a.cq */
/* loaded from: classes.dex */
public abstract class AbstractC1528cq {

    /* renamed from: P */
    public final int f4720P;

    /* renamed from: h */
    public final Class f4721h;

    /* renamed from: v */
    public final int f4722v;

    /* renamed from: z */
    public final int f4723z;

    public AbstractC1528cq(int i, Class cls, int i2, int i3) {
        this.f4723z = i;
        this.f4721h = cls;
        this.f4720P = i2;
        this.f4722v = i3;
    }

    /* renamed from: z */
    public static boolean m2970z(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    /* renamed from: h */
    public final Object m2971h(View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= this.f4722v) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2588wm c2588wm = (C2588wm) this;
            int i = c2588wm.f7918N;
            switch (i) {
                case AbstractC0795Op.f2698E /* 0 */:
                    return c2588wm.m4465P(view);
                case 1:
                    switch (i) {
                        case 1:
                            return AbstractC1412aX.m2835h(view);
                        default:
                            return AbstractC0569Kg.m1288h(view);
                    }
                case 2:
                    switch (i) {
                        case 1:
                            return AbstractC1412aX.m2835h(view);
                        default:
                            return AbstractC0569Kg.m1288h(view);
                    }
                default:
                    return c2588wm.m4465P(view);
            }
        }
        Object tag = view.getTag(this.f4723z);
        if (this.f4721h.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    /* renamed from: v */
    public final void m2972v(View view, Object obj) {
        boolean z;
        boolean m2970z;
        C1555dG c1555dG;
        if (Build.VERSION.SDK_INT >= this.f4722v) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = ((C2588wm) this).f7918N;
            switch (i) {
                case AbstractC0795Op.f2698E /* 0 */:
                    Boolean bool = (Boolean) obj;
                    switch (i) {
                        case AbstractC0795Op.f2698E /* 0 */:
                            AbstractC1412aX.m2830G(view, bool.booleanValue());
                            return;
                        default:
                            AbstractC1412aX.m2837u(view, bool.booleanValue());
                            return;
                    }
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i) {
                        case 1:
                            AbstractC1412aX.m2836o(view, charSequence);
                            return;
                        default:
                            AbstractC0569Kg.m1287Q(view, charSequence);
                            return;
                    }
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i) {
                        case 1:
                            AbstractC1412aX.m2836o(view, charSequence2);
                            return;
                        default:
                            AbstractC0569Kg.m1287Q(view, charSequence2);
                            return;
                    }
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i) {
                        case AbstractC0795Op.f2698E /* 0 */:
                            AbstractC1412aX.m2830G(view, bool2.booleanValue());
                            return;
                        default:
                            AbstractC1412aX.m2837u(view, bool2.booleanValue());
                            return;
                    }
            }
        }
        Object m2971h = m2971h(view);
        int i2 = ((C2588wm) this).f7918N;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                Boolean bool3 = (Boolean) m2971h;
                Boolean bool4 = (Boolean) obj;
                switch (i2) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        m2970z = m2970z(bool3, bool4);
                        break;
                    default:
                        m2970z = m2970z(bool3, bool4);
                        break;
                }
            case 1:
                CharSequence charSequence3 = (CharSequence) m2971h;
                CharSequence charSequence4 = (CharSequence) obj;
                switch (i2) {
                    case 1:
                        m2970z = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        m2970z = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
            case 2:
                CharSequence charSequence5 = (CharSequence) m2971h;
                CharSequence charSequence6 = (CharSequence) obj;
                switch (i2) {
                    case 1:
                        m2970z = TextUtils.equals(charSequence5, charSequence6);
                        break;
                    default:
                        m2970z = TextUtils.equals(charSequence5, charSequence6);
                        break;
                }
            default:
                Boolean bool5 = (Boolean) m2971h;
                Boolean bool6 = (Boolean) obj;
                switch (i2) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        m2970z = m2970z(bool5, bool6);
                        break;
                    default:
                        m2970z = m2970z(bool5, bool6);
                        break;
                }
        }
        if ((!m2970z) != false) {
            View.AccessibilityDelegate m4226v = AbstractC2446u3.m4226v(view);
            if (m4226v == null) {
                c1555dG = null;
            } else if (m4226v instanceof C0080BX) {
                c1555dG = ((C0080BX) m4226v).f313z;
            } else {
                c1555dG = new C1555dG(m4226v);
            }
            if (c1555dG == null) {
                c1555dG = new C1555dG();
            }
            AbstractC2446u3.m4221V(view, c1555dG);
            view.setTag(this.f4723z, obj);
            AbstractC2446u3.m4225u(view, this.f4720P);
        }
    }
}
