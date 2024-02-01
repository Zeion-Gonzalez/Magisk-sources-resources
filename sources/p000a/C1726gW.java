package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* renamed from: a.gW */
/* loaded from: classes.dex */
public final class C1726gW {

    /* renamed from: G */
    public ColorStateList f5433G;

    /* renamed from: M */
    public float f5434M;

    /* renamed from: N */
    public final float f5435N;

    /* renamed from: P */
    public final int f5436P;

    /* renamed from: Q */
    public final float f5437Q;

    /* renamed from: R */
    public Typeface f5438R;

    /* renamed from: S */
    public boolean f5439S = false;

    /* renamed from: V */
    public final int f5440V;

    /* renamed from: W */
    public final float f5441W;

    /* renamed from: h */
    public final String f5442h;

    /* renamed from: o */
    public final boolean f5443o;

    /* renamed from: u */
    public final float f5444u;

    /* renamed from: v */
    public final int f5445v;

    /* renamed from: z */
    public final ColorStateList f5446z;

    public C1726gW(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0863Q8.f2941p);
        this.f5434M = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f5433G = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 3);
        AbstractC0795Op.m1812H(context, obtainStyledAttributes, 4);
        AbstractC0795Op.m1812H(context, obtainStyledAttributes, 5);
        this.f5445v = obtainStyledAttributes.getInt(2, 0);
        this.f5436P = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f5440V = obtainStyledAttributes.getResourceId(i2, 0);
        this.f5442h = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f5446z = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 6);
        this.f5435N = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f5437Q = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f5444u = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0863Q8.f2934f);
        this.f5443o = obtainStyledAttributes2.hasValue(0);
        this.f5441W = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: N */
    public final void m3257N(Context context, TextPaint textPaint, AbstractC2703z2 abstractC2703z2) {
        m3259Q(context, textPaint, abstractC2703z2);
        ColorStateList colorStateList = this.f5433G;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f5446z;
        textPaint.setShadowLayer(this.f5444u, this.f5435N, this.f5437Q, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0021 A[ORIG_RETURN, RETURN] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3258P(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f5440V
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal r0 = p000a.AbstractC0985ST.f3319z
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = p000a.AbstractC0985ST.m2160v(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1726gW.m3258P(android.content.Context):boolean");
    }

    /* renamed from: Q */
    public final void m3259Q(Context context, TextPaint textPaint, AbstractC2703z2 abstractC2703z2) {
        if (m3258P(context)) {
            m3261u(context, textPaint, m3260h(context));
            return;
        }
        m3263z();
        m3261u(context, textPaint, this.f5438R);
        m3262v(context, new C0045Av(this, context, textPaint, abstractC2703z2));
    }

    /* renamed from: h */
    public final Typeface m3260h(Context context) {
        if (this.f5439S) {
            return this.f5438R;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m2159h = AbstractC0985ST.m2159h(context, this.f5440V);
                this.f5438R = m2159h;
                if (m2159h != null) {
                    this.f5438R = Typeface.create(m2159h, this.f5445v);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f5442h, e);
            }
        }
        m3263z();
        this.f5439S = true;
        return this.f5438R;
    }

    /* renamed from: u */
    public final void m3261u(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface m1870t = AbstractC0795Op.m1870t(context.getResources().getConfiguration(), typeface);
        if (m1870t != null) {
            typeface = m1870t;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f5445v;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f5434M);
        if (this.f5443o) {
            textPaint.setLetterSpacing(this.f5441W);
        }
    }

    /* renamed from: v */
    public final void m3262v(Context context, AbstractC2703z2 abstractC2703z2) {
        if (m3258P(context)) {
            m3260h(context);
        } else {
            m3263z();
        }
        int i = this.f5440V;
        if (i == 0) {
            this.f5439S = true;
        }
        if (this.f5439S) {
            abstractC2703z2.mo91G5(this.f5438R, true);
            return;
        }
        try {
            C1245XF c1245xf = new C1245XF(this, abstractC2703z2);
            ThreadLocal threadLocal = AbstractC0985ST.f3319z;
            if (context.isRestricted()) {
                c1245xf.m4630U8(-4);
            } else {
                AbstractC0985ST.m2160v(context, i, new TypedValue(), 0, c1245xf, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f5439S = true;
            abstractC2703z2.mo92Pm(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f5442h, e);
            this.f5439S = true;
            abstractC2703z2.mo92Pm(-3);
        }
    }

    /* renamed from: z */
    public final void m3263z() {
        String str;
        Typeface typeface = this.f5438R;
        int i = this.f5445v;
        if (typeface == null && (str = this.f5442h) != null) {
            this.f5438R = Typeface.create(str, i);
        }
        if (this.f5438R == null) {
            int i2 = this.f5436P;
            this.f5438R = i2 != 1 ? i2 != 2 ? i2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f5438R = Typeface.create(this.f5438R, i);
        }
    }
}
