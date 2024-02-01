package p000a;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.WeakHashMap;

/* renamed from: a.A1 */
/* loaded from: classes.dex */
public final class C0001A1 {

    /* renamed from: B */
    public float f0B;

    /* renamed from: C */
    public float f1C;

    /* renamed from: D */
    public ColorStateList f2D;

    /* renamed from: E */
    public Typeface f3E;

    /* renamed from: F */
    public float f4F;

    /* renamed from: G */
    public ColorStateList f5G;

    /* renamed from: H */
    public boolean f6H;

    /* renamed from: HL */
    public float f7HL;

    /* renamed from: I */
    public float f8I;

    /* renamed from: J */
    public CharSequence f9J;

    /* renamed from: K */
    public float f10K;

    /* renamed from: L */
    public int f11L;

    /* renamed from: M */
    public ColorStateList f12M;

    /* renamed from: N */
    public final RectF f13N;

    /* renamed from: O */
    public final TextPaint f14O;

    /* renamed from: P */
    public final Rect f15P;

    /* renamed from: R */
    public float f17R;

    /* renamed from: S */
    public float f18S;

    /* renamed from: T */
    public TimeInterpolator f19T;

    /* renamed from: U */
    public Typeface f20U;

    /* renamed from: V */
    public float f22V;

    /* renamed from: X */
    public Bitmap f24X;

    /* renamed from: Yd */
    public float f26Yd;

    /* renamed from: Z */
    public float f27Z;

    /* renamed from: b */
    public float f28b;

    /* renamed from: c */
    public CharSequence f29c;

    /* renamed from: d */
    public boolean f30d;

    /* renamed from: f */
    public Typeface f32f;

    /* renamed from: g */
    public Typeface f33g;

    /* renamed from: h */
    public float f34h;

    /* renamed from: i */
    public int[] f35i;

    /* renamed from: j */
    public float f36j;

    /* renamed from: k */
    public Typeface f37k;

    /* renamed from: l */
    public float f38l;

    /* renamed from: m */
    public float f39m;

    /* renamed from: n */
    public final TextPaint f40n;

    /* renamed from: nP */
    public StaticLayout f42nP;

    /* renamed from: od */
    public CharSequence f44od;

    /* renamed from: p */
    public float f45p;

    /* renamed from: q */
    public float f46q;

    /* renamed from: qn */
    public float f47qn;

    /* renamed from: r */
    public C1926kD f48r;

    /* renamed from: s */
    public Typeface f49s;

    /* renamed from: t */
    public float f50t;

    /* renamed from: v */
    public final Rect f52v;

    /* renamed from: w */
    public float f53w;

    /* renamed from: x */
    public TimeInterpolator f54x;

    /* renamed from: y */
    public Typeface f55y;

    /* renamed from: z */
    public final View f56z;

    /* renamed from: Q */
    public int f16Q = 16;

    /* renamed from: u */
    public int f51u = 16;

    /* renamed from: o */
    public float f43o = 15.0f;

    /* renamed from: W */
    public float f23W = 15.0f;

    /* renamed from: Y */
    public final TextUtils.TruncateAt f25Y = TextUtils.TruncateAt.END;

    /* renamed from: e */
    public final boolean f31e = true;

    /* renamed from: nF */
    public final int f41nF = 1;

    /* renamed from: zx */
    public final float f57zx = 1.0f;

    /* renamed from: UZ */
    public final int f21UZ = 1;

    public C0001A1(View view) {
        this.f56z = view;
        TextPaint textPaint = new TextPaint(129);
        this.f14O = textPaint;
        this.f40n = new TextPaint(textPaint);
        this.f15P = new Rect();
        this.f52v = new Rect();
        this.f13N = new RectF();
        m11u(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: Q */
    public static float m1Q(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = AbstractC1090US.f3564z;
        return ((f2 - f) * f3) + f;
    }

    /* renamed from: z */
    public static int m2z(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* renamed from: G */
    public final boolean m3G(Typeface typeface) {
        C1926kD c1926kD = this.f48r;
        if (c1926kD != null) {
            c1926kD.f5989I = true;
        }
        if (this.f55y != typeface) {
            this.f55y = typeface;
            Typeface m1870t = AbstractC0795Op.m1870t(this.f56z.getContext().getResources().getConfiguration(), typeface);
            this.f33g = m1870t;
            if (m1870t == null) {
                m1870t = this.f55y;
            }
            this.f37k = m1870t;
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final void m4M(float f) {
        int m5N;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f34h) {
            this.f34h = f;
            float f2 = this.f52v.left;
            Rect rect = this.f15P;
            float m1Q = m1Q(f2, rect.left, f, this.f54x);
            RectF rectF = this.f13N;
            rectF.left = m1Q;
            rectF.top = m1Q(this.f22V, this.f18S, f, this.f54x);
            rectF.right = m1Q(r1.right, rect.right, f, this.f54x);
            rectF.bottom = m1Q(r1.bottom, rect.bottom, f, this.f54x);
            this.f8I = m1Q(this.f17R, this.f53w, f, this.f54x);
            this.f46q = m1Q(this.f22V, this.f18S, f, this.f54x);
            m7V(f);
            C2174oz c2174oz = AbstractC1090US.f3562h;
            this.f47qn = 1.0f - m1Q(0.0f, 1.0f, 1.0f - f, c2174oz);
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            View view = this.f56z;
            AbstractC2397t8.m4115M(view);
            this.f7HL = m1Q(1.0f, 0.0f, f, c2174oz);
            AbstractC2397t8.m4115M(view);
            ColorStateList colorStateList = this.f12M;
            ColorStateList colorStateList2 = this.f5G;
            TextPaint textPaint = this.f14O;
            if (colorStateList != colorStateList2) {
                m5N = m2z(m5N(colorStateList2), m5N(this.f12M), f);
            } else {
                m5N = m5N(colorStateList);
            }
            textPaint.setColor(m5N);
            float f3 = this.f39m;
            float f4 = this.f38l;
            if (f3 != f4) {
                f3 = m1Q(f4, f3, f, c2174oz);
            }
            textPaint.setLetterSpacing(f3);
            this.f1C = m1Q(0.0f, this.f50t, f, null);
            this.f45p = m1Q(0.0f, this.f0B, f, null);
            this.f36j = m1Q(0.0f, this.f10K, f, null);
            int m2z = m2z(m5N(null), m5N(this.f2D), f);
            this.f11L = m2z;
            textPaint.setShadowLayer(this.f1C, this.f45p, this.f36j, m2z);
            AbstractC2397t8.m4115M(view);
        }
    }

    /* renamed from: N */
    public final int m5N(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f35i;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: P */
    public final float m6P() {
        TextPaint textPaint = this.f40n;
        textPaint.setTextSize(this.f23W);
        textPaint.setTypeface(this.f37k);
        textPaint.setLetterSpacing(this.f39m);
        return -textPaint.ascent();
    }

    /* renamed from: V */
    public final void m7V(float f) {
        m12v(f, false);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4115M(this.f56z);
    }

    /* renamed from: W */
    public final void m8W(ColorStateList colorStateList) {
        if (this.f12M != colorStateList || this.f5G != colorStateList) {
            this.f12M = colorStateList;
            this.f5G = colorStateList;
            m10o(false);
        }
    }

    /* renamed from: h */
    public final boolean m9h(CharSequence charSequence) {
        C0678Mp c0678Mp;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        boolean z = true;
        if (AbstractC0095Bq.m199P(this.f56z) != 1) {
            z = false;
        }
        if (this.f31e) {
            if (z) {
                c0678Mp = AbstractC0690N3.f2332P;
            } else {
                c0678Mp = AbstractC0690N3.f2334v;
            }
            return c0678Mp.m887h(charSequence, charSequence.length());
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10o(boolean r17) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0001A1.m10o(boolean):void");
    }

    /* renamed from: u */
    public final void m11u(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f55y;
            if (typeface != null) {
                this.f33g = AbstractC0795Op.m1870t(configuration, typeface);
            }
            Typeface typeface2 = this.f3E;
            if (typeface2 != null) {
                this.f20U = AbstractC0795Op.m1870t(configuration, typeface2);
            }
            Typeface typeface3 = this.f33g;
            if (typeface3 == null) {
                typeface3 = this.f55y;
            }
            this.f37k = typeface3;
            Typeface typeface4 = this.f20U;
            if (typeface4 == null) {
                typeface4 = this.f3E;
            }
            this.f49s = typeface4;
            m10o(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x010c, code lost:
    
        if (r12.f6H != false) goto L182;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12v(float r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0001A1.m12v(float, boolean):void");
    }
}
