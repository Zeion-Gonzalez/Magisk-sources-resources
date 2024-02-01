package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: a.py */
/* loaded from: classes.dex */
public final class C2226py {

    /* renamed from: N */
    public Object f6842N;

    /* renamed from: P */
    public final Object f6843P;

    /* renamed from: Q */
    public Object f6844Q;

    /* renamed from: h */
    public int f6845h;

    /* renamed from: u */
    public Object f6846u;

    /* renamed from: v */
    public final Object f6847v;

    /* renamed from: z */
    public final /* synthetic */ int f6848z;

    public C2226py(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C0099Bw c0099Bw, Rect rect) {
        this.f6848z = 2;
        AbstractC1843ih.m3430W(rect.left);
        AbstractC1843ih.m3430W(rect.top);
        AbstractC1843ih.m3430W(rect.right);
        AbstractC1843ih.m3430W(rect.bottom);
        this.f6847v = rect;
        this.f6843P = colorStateList2;
        this.f6842N = colorStateList;
        this.f6844Q = colorStateList3;
        this.f6845h = i;
        this.f6846u = c0099Bw;
    }

    /* renamed from: h */
    public static C2226py m3862h(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0863Q8.f2935g);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList m1812H = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 4);
            ColorStateList m1812H2 = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 9);
            ColorStateList m1812H3 = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            C0099Bw c0099Bw = new C0099Bw(C0099Bw.m210z(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C1012T(0)));
            obtainStyledAttributes.recycle();
            return new C2226py(m1812H, m1812H2, m1812H3, dimensionPixelSize, c0099Bw, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* renamed from: G */
    public final void m3863G(PorterDuff.Mode mode) {
        if (((C2380sl) this.f6844Q) == null) {
            this.f6844Q = new C2380sl(0);
        }
        C2380sl c2380sl = (C2380sl) this.f6844Q;
        c2380sl.f7310P = mode;
        c2380sl.f7313z = true;
        m3871z();
    }

    /* renamed from: N */
    public final void m3864N(AttributeSet attributeSet, int i) {
        ColorStateList m1767W;
        Object obj = this.f6847v;
        View view = (View) obj;
        Context context = view.getContext();
        int[] iArr = AbstractC0483J5.f1602J;
        C2709z9 m4639S = C2709z9.m4639S(context, attributeSet, iArr, i);
        AbstractC2446u3.m4215M(view, view.getContext(), iArr, attributeSet, (TypedArray) m4639S.f8534h, i);
        try {
            if (m4639S.m4645V(0)) {
                this.f6845h = m4639S.m4646W(0, -1);
                C1982lH c1982lH = (C1982lH) this.f6843P;
                Context context2 = ((View) obj).getContext();
                int i2 = this.f6845h;
                synchronized (c1982lH) {
                    m1767W = c1982lH.f6151z.m1767W(context2, i2);
                }
                if (m1767W != null) {
                    m3868o(m1767W);
                }
            }
            if (m4639S.m4645V(1)) {
                AbstractC1548d9.m3012q((View) obj, m4639S.m4647h(1));
            }
            if (m4639S.m4645V(2)) {
                AbstractC1548d9.m3010k((View) obj, AbstractC1888jY.m3508v(m4639S.m4648o(2, -1), null));
            }
        } finally {
            m4639S.m4651w();
        }
    }

    /* renamed from: P */
    public final PorterDuff.Mode m3865P() {
        Object obj = this.f6844Q;
        if (((C2380sl) obj) != null) {
            return (PorterDuff.Mode) ((C2380sl) obj).f7310P;
        }
        return null;
    }

    /* renamed from: Q */
    public final void m3866Q() {
        this.f6845h = -1;
        m3868o(null);
        m3871z();
    }

    /* renamed from: W */
    public final void m3867W(ColorStateList colorStateList) {
        if (((C2380sl) this.f6844Q) == null) {
            this.f6844Q = new C2380sl(0);
        }
        C2380sl c2380sl = (C2380sl) this.f6844Q;
        c2380sl.f7312v = colorStateList;
        c2380sl.f7311h = true;
        m3871z();
    }

    /* renamed from: o */
    public final void m3868o(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C2380sl) this.f6842N) == null) {
                this.f6842N = new C2380sl(0);
            }
            C2380sl c2380sl = (C2380sl) this.f6842N;
            c2380sl.f7312v = colorStateList;
            c2380sl.f7311h = true;
        } else {
            this.f6842N = null;
        }
        m3871z();
    }

    public final String toString() {
        switch (this.f6848z) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f6847v) + ", mProviderPackage: " + ((String) this.f6843P) + ", mQuery: " + ((String) this.f6842N) + ", mCertificates:");
                for (int i = 0; i < ((List) this.f6844Q).size(); i++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f6844Q).get(i);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f6845h);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public final void m3869u(int i) {
        ColorStateList colorStateList;
        this.f6845h = i;
        C1982lH c1982lH = (C1982lH) this.f6843P;
        if (c1982lH != null) {
            Context context = ((View) this.f6847v).getContext();
            synchronized (c1982lH) {
                colorStateList = c1982lH.f6151z.m1767W(context, i);
            }
        } else {
            colorStateList = null;
        }
        m3868o(colorStateList);
        m3871z();
    }

    /* renamed from: v */
    public final ColorStateList m3870v() {
        Object obj = this.f6844Q;
        if (((C2380sl) obj) != null) {
            return (ColorStateList) ((C2380sl) obj).f7312v;
        }
        return null;
    }

    /* renamed from: z */
    public final void m3871z() {
        boolean z;
        View view = (View) this.f6847v;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = 0;
            if (((C2380sl) this.f6842N) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (((C2380sl) this.f6846u) == null) {
                    this.f6846u = new C2380sl(i);
                }
                C2380sl c2380sl = (C2380sl) this.f6846u;
                c2380sl.f7312v = null;
                c2380sl.f7311h = false;
                c2380sl.f7310P = null;
                c2380sl.f7313z = false;
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                ColorStateList m3015u = AbstractC1548d9.m3015u(view);
                if (m3015u != null) {
                    c2380sl.f7311h = true;
                    c2380sl.f7312v = m3015u;
                }
                PorterDuff.Mode m3011o = AbstractC1548d9.m3011o(view);
                if (m3011o != null) {
                    c2380sl.f7313z = true;
                    c2380sl.f7310P = m3011o;
                }
                if (c2380sl.f7311h || c2380sl.f7313z) {
                    C1982lH.m3594N(background, c2380sl, view.getDrawableState());
                    i = 1;
                }
                if (i != 0) {
                    return;
                }
            }
            C2380sl c2380sl2 = (C2380sl) this.f6844Q;
            if (c2380sl2 != null) {
                C1982lH.m3594N(background, c2380sl2, view.getDrawableState());
                return;
            }
            C2380sl c2380sl3 = (C2380sl) this.f6842N;
            if (c2380sl3 != null) {
                C1982lH.m3594N(background, c2380sl3, view.getDrawableState());
            }
        }
    }

    public C2226py(View view) {
        this.f6848z = 0;
        this.f6845h = -1;
        this.f6847v = view;
        this.f6843P = C1982lH.m3597z();
    }

    public C2226py(String str, String str2, String str3, List list) {
        this.f6848z = 1;
        this.f6847v = str;
        this.f6843P = str2;
        this.f6842N = str3;
        list.getClass();
        this.f6844Q = list;
        this.f6845h = 0;
        this.f6846u = str + "-" + str2 + "-" + str3;
    }
}
