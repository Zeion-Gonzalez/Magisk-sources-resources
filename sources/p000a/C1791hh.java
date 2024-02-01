package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: a.hh */
/* loaded from: classes.dex */
public final class C1791hh {

    /* renamed from: G */
    public int f5632G = 0;

    /* renamed from: M */
    public int f5633M = -1;

    /* renamed from: N */
    public C2380sl f5634N;

    /* renamed from: P */
    public C2380sl f5635P;

    /* renamed from: Q */
    public C2380sl f5636Q;

    /* renamed from: S */
    public boolean f5637S;

    /* renamed from: V */
    public Typeface f5638V;

    /* renamed from: W */
    public final C0180DU f5639W;

    /* renamed from: h */
    public C2380sl f5640h;

    /* renamed from: o */
    public C2380sl f5641o;

    /* renamed from: u */
    public C2380sl f5642u;

    /* renamed from: v */
    public C2380sl f5643v;

    /* renamed from: z */
    public final TextView f5644z;

    public C1791hh(TextView textView) {
        this.f5644z = textView;
        this.f5639W = new C0180DU(textView);
    }

    /* renamed from: Q */
    public static void m3331Q(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        boolean z;
        int i3;
        CharSequence subSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i4 >= 30) {
                AbstractC2706z6.m4634z(editorInfo, text);
                return;
            }
            text.getClass();
            if (i4 >= 30) {
                AbstractC2706z6.m4634z(editorInfo, text);
                return;
            }
            int i5 = editorInfo.initialSelStart;
            int i6 = editorInfo.initialSelEnd;
            if (i5 > i6) {
                i = i6 + 0;
            } else {
                i = i5 + 0;
            }
            if (i5 > i6) {
                i2 = i5 - 0;
            } else {
                i2 = i6 + 0;
            }
            int length = text.length();
            if (i >= 0 && i2 <= length) {
                int i7 = editorInfo.inputType & 4095;
                if (i7 != 129 && i7 != 225 && i7 != 18) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (length <= 2048) {
                        AbstractC0795Op.m1845dG(editorInfo, text, i, i2);
                        return;
                    }
                    int i8 = i2 - i;
                    if (i8 > 1024) {
                        i3 = 0;
                    } else {
                        i3 = i8;
                    }
                    int i9 = 2048 - i3;
                    int min = Math.min(text.length() - i2, i9 - Math.min(i, (int) (i9 * 0.8d)));
                    int min2 = Math.min(i, i9 - min);
                    int i10 = i - min2;
                    if (Character.isLowSurrogate(text.charAt(i10))) {
                        i10++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
                        min--;
                    }
                    int i11 = min2 + i3 + min;
                    if (i3 != i8) {
                        subSequence = TextUtils.concat(text.subSequence(i10, i10 + min2), text.subSequence(i2, min + i2));
                    } else {
                        subSequence = text.subSequence(i10, i11 + i10);
                    }
                    int i12 = min2 + 0;
                    AbstractC0795Op.m1845dG(editorInfo, subSequence, i12, i3 + i12);
                    return;
                }
            }
            AbstractC0795Op.m1845dG(editorInfo, null, 0, 0);
        }
    }

    /* renamed from: v */
    public static C2380sl m3332v(Context context, C1982lH c1982lH, int i) {
        ColorStateList m1767W;
        synchronized (c1982lH) {
            m1767W = c1982lH.f6151z.m1767W(context, i);
        }
        if (m1767W != null) {
            C2380sl c2380sl = new C2380sl(0);
            c2380sl.f7311h = true;
            c2380sl.f7312v = m1767W;
            return c2380sl;
        }
        return null;
    }

    /* renamed from: G */
    public final void m3333G(ColorStateList colorStateList) {
        boolean z = false;
        if (this.f5641o == null) {
            this.f5641o = new C2380sl(z ? 1 : 0);
        }
        C2380sl c2380sl = this.f5641o;
        c2380sl.f7312v = colorStateList;
        if (colorStateList != null) {
            z = true;
        }
        c2380sl.f7311h = z;
        this.f5640h = c2380sl;
        this.f5643v = c2380sl;
        this.f5635P = c2380sl;
        this.f5634N = c2380sl;
        this.f5636Q = c2380sl;
        this.f5642u = c2380sl;
    }

    /* renamed from: M */
    public final void m3334M(PorterDuff.Mode mode) {
        boolean z = false;
        if (this.f5641o == null) {
            this.f5641o = new C2380sl(z ? 1 : 0);
        }
        C2380sl c2380sl = this.f5641o;
        c2380sl.f7310P = mode;
        if (mode != null) {
            z = true;
        }
        c2380sl.f7313z = z;
        this.f5640h = c2380sl;
        this.f5643v = c2380sl;
        this.f5635P = c2380sl;
        this.f5634N = c2380sl;
        this.f5636Q = c2380sl;
        this.f5642u = c2380sl;
    }

    /* renamed from: N */
    public final void m3335N(Context context, int i) {
        String m4640G;
        C2709z9 c2709z9 = new C2709z9(context, context.obtainStyledAttributes(i, AbstractC0483J5.f1614f));
        boolean m4645V = c2709z9.m4645V(14);
        TextView textView = this.f5644z;
        if (m4645V) {
            textView.setAllCaps(c2709z9.m4652z(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (c2709z9.m4645V(0) && c2709z9.m4643P(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m3337V(context, c2709z9);
        if (i2 >= 26 && c2709z9.m4645V(13) && (m4640G = c2709z9.m4640G(13)) != null) {
            AbstractC1948kg.m3560P(textView, m4640G);
        }
        c2709z9.m4651w();
        Typeface typeface = this.f5638V;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f5632G);
        }
    }

    /* renamed from: P */
    public final void m3336P(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        float f;
        float f2;
        float f3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Paint.FontMetricsInt fontMetricsInt;
        int i2;
        int resourceId;
        int i3;
        TextView textView = this.f5644z;
        Context context = textView.getContext();
        C1982lH m3597z = C1982lH.m3597z();
        int[] iArr = AbstractC0483J5.f1618o;
        C2709z9 m4639S = C2709z9.m4639S(context, attributeSet, iArr, i);
        AbstractC2446u3.m4215M(textView, textView.getContext(), iArr, attributeSet, (TypedArray) m4639S.f8534h, i);
        int m4646W = m4639S.m4646W(0, -1);
        if (m4639S.m4645V(3)) {
            this.f5640h = m3332v(context, m3597z, m4639S.m4646W(3, 0));
        }
        if (m4639S.m4645V(1)) {
            this.f5643v = m3332v(context, m3597z, m4639S.m4646W(1, 0));
        }
        if (m4639S.m4645V(4)) {
            this.f5635P = m3332v(context, m3597z, m4639S.m4646W(4, 0));
        }
        if (m4639S.m4645V(2)) {
            this.f5634N = m3332v(context, m3597z, m4639S.m4646W(2, 0));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (m4639S.m4645V(5)) {
            this.f5636Q = m3332v(context, m3597z, m4639S.m4646W(5, 0));
        }
        if (m4639S.m4645V(6)) {
            this.f5642u = m3332v(context, m3597z, m4639S.m4646W(6, 0));
        }
        m4639S.m4651w();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0483J5.f1614f;
        if (m4646W != -1) {
            C2709z9 c2709z9 = new C2709z9(context, context.obtainStyledAttributes(m4646W, iArr2));
            if (!z3 && c2709z9.m4645V(14)) {
                z = c2709z9.m4652z(14, false);
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            m3337V(context, c2709z9);
            if (c2709z9.m4645V(15)) {
                str = c2709z9.m4640G(15);
                i3 = 26;
            } else {
                i3 = 26;
                str = null;
            }
            if (i4 >= i3 && c2709z9.m4645V(13)) {
                str2 = c2709z9.m4640G(13);
            } else {
                str2 = null;
            }
            c2709z9.m4651w();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        C2709z9 c2709z92 = new C2709z9(context, context.obtainStyledAttributes(attributeSet, iArr2, i, 0));
        if (!z3 && c2709z92.m4645V(14)) {
            z = c2709z92.m4652z(14, false);
            z2 = true;
        }
        if (c2709z92.m4645V(15)) {
            str = c2709z92.m4640G(15);
        }
        String str3 = str;
        if (i4 >= 26 && c2709z92.m4645V(13)) {
            str2 = c2709z92.m4640G(13);
        }
        String str4 = str2;
        if (i4 >= 28 && c2709z92.m4645V(0) && c2709z92.m4643P(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m3337V(context, c2709z92);
        c2709z92.m4651w();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        Typeface typeface = this.f5638V;
        if (typeface != null) {
            if (this.f5633M == -1) {
                textView.setTypeface(typeface, this.f5632G);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            AbstractC1948kg.m3560P(textView, str4);
        }
        if (str3 != null) {
            if (i4 >= 24) {
                AbstractC1415aa.m2842h(textView, AbstractC1415aa.m2843z(str3));
            } else {
                AbstractC1989lQ.m3600v(textView, AbstractC0828PR.m1931z(str3.split(",")[0]));
            }
        }
        int[] iArr3 = AbstractC0483J5.f1611W;
        C0180DU c0180du = this.f5639W;
        Context context2 = c0180du.f553G;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0180du.f558W;
        AbstractC2446u3.m4215M(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i);
        if (obtainStyledAttributes.hasValue(5)) {
            c0180du.f563z = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f2 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f3 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = obtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                c0180du.f557Q = C0180DU.m353h(iArr4);
                c0180du.m357o();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (c0180du.m356W()) {
            if (c0180du.f563z == 1) {
                if (!c0180du.f561u) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f2 == -1.0f) {
                        i2 = 2;
                        f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i2 = 2;
                    }
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    c0180du.m354G(f2, f3, f);
                }
                c0180du.m358u();
            }
        } else {
            c0180du.f563z = 0;
        }
        if (AbstractC1586ds.f4874h && c0180du.f563z != 0) {
            int[] iArr5 = c0180du.f557Q;
            if (iArr5.length > 0) {
                if (AbstractC1948kg.m3563z(textView) != -1.0f) {
                    AbstractC1948kg.m3561h(textView, Math.round(c0180du.f556P), Math.round(c0180du.f555N), Math.round(c0180du.f562v), 0);
                } else {
                    AbstractC1948kg.m3562v(textView, iArr5, 0);
                }
            }
        }
        C2709z9 c2709z93 = new C2709z9(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int m4646W2 = c2709z93.m4646W(8, -1);
        if (m4646W2 != -1) {
            drawable = m3597z.m3598h(context, m4646W2);
        } else {
            drawable = null;
        }
        int m4646W3 = c2709z93.m4646W(13, -1);
        if (m4646W3 != -1) {
            drawable2 = m3597z.m3598h(context, m4646W3);
        } else {
            drawable2 = null;
        }
        int m4646W4 = c2709z93.m4646W(9, -1);
        if (m4646W4 != -1) {
            drawable3 = m3597z.m3598h(context, m4646W4);
        } else {
            drawable3 = null;
        }
        int m4646W5 = c2709z93.m4646W(6, -1);
        if (m4646W5 != -1) {
            drawable4 = m3597z.m3598h(context, m4646W5);
        } else {
            drawable4 = null;
        }
        int m4646W6 = c2709z93.m4646W(10, -1);
        if (m4646W6 != -1) {
            drawable5 = m3597z.m3598h(context, m4646W6);
        } else {
            drawable5 = null;
        }
        int m4646W7 = c2709z93.m4646W(7, -1);
        if (m4646W7 != -1) {
            drawable6 = m3597z.m3598h(context, m4646W7);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] m3601z = AbstractC1989lQ.m3601z(textView);
                Drawable drawable7 = m3601z[0];
                if (drawable7 == null && m3601z[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = m3601z[1];
                    }
                    Drawable drawable8 = m3601z[2];
                    if (drawable4 == null) {
                        drawable4 = m3601z[3];
                    }
                    AbstractC1989lQ.m3599h(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] m3601z2 = AbstractC1989lQ.m3601z(textView);
            if (drawable5 == null) {
                drawable5 = m3601z2[0];
            }
            if (drawable2 == null) {
                drawable2 = m3601z2[1];
            }
            if (drawable6 == null) {
                drawable6 = m3601z2[2];
            }
            if (drawable4 == null) {
                drawable4 = m3601z2[3];
            }
            AbstractC1989lQ.m3599h(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (c2709z93.m4645V(11)) {
            ColorStateList m4647h = c2709z93.m4647h(11);
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC2005lj.m3630Q(textView, m4647h);
            } else if (textView instanceof InterfaceC1984lJ) {
                ((InterfaceC1984lJ) textView).mo783N(m4647h);
            }
        }
        if (c2709z93.m4645V(12)) {
            fontMetricsInt = null;
            PorterDuff.Mode m3508v = AbstractC1888jY.m3508v(c2709z93.m4648o(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC2005lj.m3633u(textView, m3508v);
            } else if (textView instanceof InterfaceC1984lJ) {
                ((InterfaceC1984lJ) textView).mo784Q(m3508v);
            }
        } else {
            fontMetricsInt = null;
        }
        int m4643P = c2709z93.m4643P(15, -1);
        int m4643P2 = c2709z93.m4643P(18, -1);
        int m4643P3 = c2709z93.m4643P(19, -1);
        c2709z93.m4651w();
        if (m4643P != -1) {
            AbstractC1843ih.m3403EC(textView, m4643P);
        }
        if (m4643P2 != -1) {
            AbstractC1843ih.m3427U8(textView, m4643P2);
        }
        if (m4643P3 != -1) {
            AbstractC1843ih.m3430W(m4643P3);
            if (m4643P3 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(m4643P3 - r1, 1.0f);
            }
        }
    }

    /* renamed from: V */
    public final void m3337V(Context context, C2709z9 c2709z9) {
        String m4640G;
        Typeface create;
        Typeface typeface;
        this.f5632G = c2709z9.m4648o(2, this.f5632G);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int m4648o = c2709z9.m4648o(11, -1);
            this.f5633M = m4648o;
            if (m4648o != -1) {
                this.f5632G = (this.f5632G & 2) | 0;
            }
        }
        if (!c2709z9.m4645V(10) && !c2709z9.m4645V(12)) {
            if (c2709z9.m4645V(1)) {
                this.f5637S = false;
                int m4648o2 = c2709z9.m4648o(1, 1);
                if (m4648o2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m4648o2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m4648o2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f5638V = typeface;
                return;
            }
            return;
        }
        this.f5638V = null;
        int i2 = c2709z9.m4645V(12) ? 12 : 10;
        int i3 = this.f5633M;
        int i4 = this.f5632G;
        if (!context.isRestricted()) {
            try {
                Typeface m4649u = c2709z9.m4649u(i2, this.f5632G, new C0355Go(this, i3, i4, new WeakReference(this.f5644z)));
                if (m4649u != null) {
                    if (i >= 28 && this.f5633M != -1) {
                        m4649u = AbstractC1842ig.m3396z(Typeface.create(m4649u, 0), this.f5633M, (this.f5632G & 2) != 0);
                    }
                    this.f5638V = m4649u;
                }
                this.f5637S = this.f5638V == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5638V != null || (m4640G = c2709z9.m4640G(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f5633M == -1) {
            create = Typeface.create(m4640G, this.f5632G);
        } else {
            create = AbstractC1842ig.m3396z(Typeface.create(m4640G, 0), this.f5633M, (this.f5632G & 2) != 0);
        }
        this.f5638V = create;
    }

    /* renamed from: W */
    public final void m3338W(int i) {
        C0180DU c0180du = this.f5639W;
        if (c0180du.m356W()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = c0180du.f553G.getResources().getDisplayMetrics();
                    c0180du.m354G(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c0180du.m358u()) {
                        c0180du.m360z();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(AbstractC2441tz.m4188N("Unknown auto-size text type: ", i));
            }
            c0180du.f563z = 0;
            c0180du.f556P = -1.0f;
            c0180du.f555N = -1.0f;
            c0180du.f562v = -1.0f;
            c0180du.f557Q = new int[0];
            c0180du.f559h = false;
        }
    }

    /* renamed from: h */
    public final void m3339h() {
        C2380sl c2380sl = this.f5640h;
        TextView textView = this.f5644z;
        if (c2380sl != null || this.f5643v != null || this.f5635P != null || this.f5634N != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m3342z(compoundDrawables[0], this.f5640h);
            m3342z(compoundDrawables[1], this.f5643v);
            m3342z(compoundDrawables[2], this.f5635P);
            m3342z(compoundDrawables[3], this.f5634N);
        }
        if (this.f5636Q == null && this.f5642u == null) {
            return;
        }
        Drawable[] m3601z = AbstractC1989lQ.m3601z(textView);
        m3342z(m3601z[0], this.f5636Q);
        m3342z(m3601z[2], this.f5642u);
    }

    /* renamed from: o */
    public final void m3340o(int[] iArr, int i) {
        C0180DU c0180du = this.f5639W;
        if (c0180du.m356W()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0180du.f553G.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0180du.f557Q = C0180DU.m353h(iArr2);
                if (!c0180du.m357o()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0180du.f561u = false;
            }
            if (c0180du.m358u()) {
                c0180du.m360z();
            }
        }
    }

    /* renamed from: u */
    public final void m3341u(int i, int i2, int i3, int i4) {
        C0180DU c0180du = this.f5639W;
        if (c0180du.m356W()) {
            DisplayMetrics displayMetrics = c0180du.f553G.getResources().getDisplayMetrics();
            c0180du.m354G(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0180du.m358u()) {
                c0180du.m360z();
            }
        }
    }

    /* renamed from: z */
    public final void m3342z(Drawable drawable, C2380sl c2380sl) {
        if (drawable == null || c2380sl == null) {
            return;
        }
        C1982lH.m3594N(drawable, c2380sl, this.f5644z.getDrawableState());
    }
}
