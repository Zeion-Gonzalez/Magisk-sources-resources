package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: a.yr */
/* loaded from: classes.dex */
public final class C2694yr extends C2281qz implements Drawable.Callback, InterfaceC0879QU {

    /* renamed from: F3 */
    public static final int[] f8440F3 = {16842910};

    /* renamed from: gv */
    public static final ShapeDrawable f8441gv = new ShapeDrawable(new OvalShape());

    /* renamed from: B */
    public Drawable f8442B;

    /* renamed from: BO */
    public float f8443BO;

    /* renamed from: BX */
    public final Path f8444BX;

    /* renamed from: D */
    public float f8445D;

    /* renamed from: EC */
    public float f8446EC;

    /* renamed from: EQ */
    public boolean f8447EQ;

    /* renamed from: Fu */
    public int f8448Fu;

    /* renamed from: G5 */
    public final PointF f8449G5;

    /* renamed from: HL */
    public boolean f8450HL;

    /* renamed from: Ha */
    public final Paint f8451Ha;

    /* renamed from: K */
    public ColorStateList f8452K;

    /* renamed from: KM */
    public int f8453KM;

    /* renamed from: L */
    public ColorStateList f8454L;

    /* renamed from: LN */
    public ColorStateList f8455LN;

    /* renamed from: Lq */
    public final Context f8456Lq;

    /* renamed from: M6 */
    public PorterDuffColorFilter f8457M6;

    /* renamed from: O */
    public ColorStateList f8458O;

    /* renamed from: O4 */
    public int f8459O4;

    /* renamed from: Pm */
    public final Paint.FontMetrics f8460Pm;

    /* renamed from: Rh */
    public ColorFilter f8461Rh;

    /* renamed from: Ry */
    public int f8462Ry;

    /* renamed from: S3 */
    public TextUtils.TruncateAt f8463S3;

    /* renamed from: T */
    public CharSequence f8464T;

    /* renamed from: T0 */
    public ColorStateList f8465T0;

    /* renamed from: U8 */
    public float f8466U8;

    /* renamed from: UZ */
    public float f8467UZ;

    /* renamed from: W9 */
    public WeakReference f8468W9;

    /* renamed from: Yd */
    public ColorStateList f8469Yd;

    /* renamed from: ZH */
    public float f8470ZH;

    /* renamed from: b */
    public Drawable f8471b;

    /* renamed from: d */
    public float f8472d;

    /* renamed from: d2 */
    public final C0131CY f8473d2;

    /* renamed from: d3 */
    public int f8474d3;

    /* renamed from: dG */
    public int f8475dG;

    /* renamed from: dx */
    public float f8476dx;

    /* renamed from: fH */
    public boolean f8477fH;

    /* renamed from: fc */
    public boolean f8478fc;

    /* renamed from: he */
    public float f8479he;

    /* renamed from: hs */
    public boolean f8480hs;

    /* renamed from: i */
    public float f8481i;

    /* renamed from: j */
    public ColorStateList f8482j;

    /* renamed from: j5 */
    public PorterDuff.Mode f8483j5;

    /* renamed from: l */
    public boolean f8484l;

    /* renamed from: m */
    public boolean f8485m;

    /* renamed from: n */
    public float f8486n;

    /* renamed from: n0 */
    public float f8487n0;

    /* renamed from: nB */
    public int f8488nB;

    /* renamed from: nF */
    public Drawable f8489nF;

    /* renamed from: nP */
    public RippleDrawable f8490nP;

    /* renamed from: oI */
    public final RectF f8491oI;

    /* renamed from: od */
    public boolean f8492od;

    /* renamed from: qn */
    public float f8493qn;

    /* renamed from: t */
    public boolean f8494t;

    /* renamed from: tJ */
    public int f8495tJ;

    /* renamed from: x */
    public ColorStateList f8496x;

    /* renamed from: yF */
    public int f8497yF;

    /* renamed from: zd */
    public int[] f8498zd;

    /* renamed from: zx */
    public ColorStateList f8499zx;

    public C2694yr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131952700);
        this.f8472d = -1.0f;
        this.f8451Ha = new Paint(1);
        this.f8460Pm = new Paint.FontMetrics();
        this.f8491oI = new RectF();
        this.f8449G5 = new PointF();
        this.f8444BX = new Path();
        this.f8448Fu = 255;
        this.f8483j5 = PorterDuff.Mode.SRC_IN;
        this.f8468W9 = new WeakReference(null);
        m3930M(context);
        this.f8456Lq = context;
        C0131CY c0131cy = new C0131CY(this);
        this.f8473d2 = c0131cy;
        this.f8464T = "";
        c0131cy.f451z.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f8440F3;
        setState(iArr);
        if (!Arrays.equals(this.f8498zd, iArr)) {
            this.f8498zd = iArr;
            if (m4609Z()) {
                m4605J(getState(), iArr);
            }
        }
        this.f8480hs = true;
        int[] iArr2 = AbstractC0567Ke.f1845z;
        f8441gv.setTint(-1);
    }

    /* renamed from: C */
    public static void m4599C(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: f */
    public static boolean m4600f(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: r */
    public static boolean m4601r(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: E */
    public final float m4602E() {
        return this.f8478fc ? m3928G() : this.f8472d;
    }

    /* renamed from: F */
    public final boolean m4603F() {
        return this.f8494t && this.f8442B != null;
    }

    /* renamed from: H */
    public final void m4604H(boolean z) {
        if (this.f8494t != z) {
            boolean m4603F = m4603F();
            this.f8494t = z;
            boolean m4603F2 = m4603F();
            if (m4603F != m4603F2) {
                if (m4603F2) {
                    m4612g(this.f8442B);
                } else {
                    m4599C(this.f8442B);
                }
                invalidateSelf();
                m4608Y();
            }
        }
    }

    /* renamed from: J */
    public final boolean m4605J(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f8482j;
        if (colorStateList2 != null) {
            i = colorStateList2.getColorForState(iArr, this.f8475dG);
        } else {
            i = 0;
        }
        int m3931N = m3931N(i);
        boolean z6 = true;
        if (this.f8475dG != m3931N) {
            this.f8475dG = m3931N;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f8454L;
        if (colorStateList3 != null) {
            i2 = colorStateList3.getColorForState(iArr, this.f8459O4);
        } else {
            i2 = 0;
        }
        int m3931N2 = m3931N(i2);
        if (this.f8459O4 != m3931N2) {
            this.f8459O4 = m3931N2;
            onStateChange = true;
        }
        int m228h = AbstractC0106C4.m228h(m3931N2, m3931N);
        if (this.f8488nB != m228h) {
            z = true;
        } else {
            z = false;
        }
        if (this.f7021S.f4613v == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            this.f8488nB = m228h;
            m3934R(ColorStateList.valueOf(m228h));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f8458O;
        if (colorStateList4 != null) {
            i3 = colorStateList4.getColorForState(iArr, this.f8474d3);
        } else {
            i3 = 0;
        }
        if (this.f8474d3 != i3) {
            this.f8474d3 = i3;
            onStateChange = true;
        }
        if (this.f8455LN != null && AbstractC0567Ke.m1283v(iArr)) {
            i4 = this.f8455LN.getColorForState(iArr, this.f8497yF);
        } else {
            i4 = 0;
        }
        if (this.f8497yF != i4) {
            this.f8497yF = i4;
            if (this.f8477fH) {
                onStateChange = true;
            }
        }
        C1726gW c1726gW = this.f8473d2.f449u;
        if (c1726gW != null && (colorStateList = c1726gW.f5433G) != null) {
            i5 = colorStateList.getColorForState(iArr, this.f8495tJ);
        } else {
            i5 = 0;
        }
        if (this.f8495tJ != i5) {
            this.f8495tJ = i5;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i7 : state) {
                if (i7 == 16842912) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z3 && this.f8450HL) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f8447EQ != z4 && this.f8489nF != null) {
            float m4613s = m4613s();
            this.f8447EQ = z4;
            if (m4613s != m4613s()) {
                onStateChange = true;
                z5 = true;
            } else {
                z5 = false;
                onStateChange = true;
            }
        } else {
            z5 = false;
        }
        ColorStateList colorStateList5 = this.f8465T0;
        if (colorStateList5 != null) {
            i6 = colorStateList5.getColorForState(iArr, this.f8462Ry);
        } else {
            i6 = 0;
        }
        if (this.f8462Ry != i6) {
            this.f8462Ry = i6;
            ColorStateList colorStateList6 = this.f8465T0;
            PorterDuff.Mode mode = this.f8483j5;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f8457M6 = porterDuffColorFilter;
        } else {
            z6 = onStateChange;
        }
        if (m4601r(this.f8442B)) {
            z6 |= this.f8442B.setState(iArr);
        }
        if (m4601r(this.f8489nF)) {
            z6 |= this.f8489nF.setState(iArr);
        }
        if (m4601r(this.f8471b)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z6 |= this.f8471b.setState(iArr3);
        }
        int[] iArr4 = AbstractC0567Ke.f1845z;
        if (m4601r(this.f8490nP)) {
            z6 |= this.f8490nP.setState(iArr2);
        }
        if (z6) {
            invalidateSelf();
        }
        if (z5) {
            m4608Y();
        }
        return z6;
    }

    /* renamed from: U */
    public final float m4606U() {
        if (m4609Z()) {
            return this.f8479he + this.f8493qn + this.f8476dx;
        }
        return 0.0f;
    }

    /* renamed from: X */
    public final boolean m4607X() {
        return this.f8492od && this.f8489nF != null && this.f8447EQ;
    }

    /* renamed from: Y */
    public final void m4608Y() {
        InterfaceC1099Uc interfaceC1099Uc = (InterfaceC1099Uc) this.f8468W9.get();
        if (interfaceC1099Uc != null) {
            Chip chip = (Chip) interfaceC1099Uc;
            chip.m5048z(chip.f9325c);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* renamed from: Z */
    public final boolean m4609Z() {
        return this.f8484l && this.f8471b != null;
    }

    /* renamed from: c */
    public final void m4610c(boolean z) {
        if (this.f8492od != z) {
            boolean m4607X = m4607X();
            this.f8492od = z;
            boolean m4607X2 = m4607X();
            if (m4607X != m4607X2) {
                if (m4607X2) {
                    m4612g(this.f8489nF);
                } else {
                    m4599C(this.f8489nF);
                }
                invalidateSelf();
                m4608Y();
            }
        }
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        RectF rectF;
        int i3;
        int i4;
        int i5;
        RectF rectF2;
        boolean z;
        int i6;
        float f;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f8448Fu) != 0) {
            if (i < 255) {
                i2 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
            } else {
                i2 = 0;
            }
            boolean z2 = this.f8478fc;
            Paint paint = this.f8451Ha;
            RectF rectF3 = this.f8491oI;
            if (!z2) {
                paint.setColor(this.f8475dG);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, m4602E(), m4602E(), paint);
            }
            if (!this.f8478fc) {
                paint.setColor(this.f8459O4);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f8461Rh;
                if (colorFilter == null) {
                    colorFilter = this.f8457M6;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, m4602E(), m4602E(), paint);
            }
            if (this.f8478fc) {
                super.draw(canvas);
            }
            if (this.f8486n > 0.0f && !this.f8478fc) {
                paint.setColor(this.f8474d3);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f8478fc) {
                    ColorFilter colorFilter2 = this.f8461Rh;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f8457M6;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f2 = bounds.left;
                float f3 = this.f8486n / 2.0f;
                rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
                float f4 = this.f8472d - (this.f8486n / 2.0f);
                canvas.drawRoundRect(rectF3, f4, f4, paint);
            }
            paint.setColor(this.f8497yF);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.f8478fc) {
                canvas.drawRoundRect(rectF3, m4602E(), m4602E(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f8444BX;
                C1008Su c1008Su = this.f7027e;
                C1480br c1480br = this.f7021S;
                c1008Su.m2184z(c1480br.f4616z, c1480br.f4596G, rectF4, this.f7017H, path);
                m3940u(canvas, paint, path, this.f7021S.f4616z, m3937W());
            }
            if (m4603F()) {
                m4614y(bounds, rectF3);
                float f5 = rectF3.left;
                float f6 = rectF3.top;
                canvas.translate(f5, f6);
                this.f8442B.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f8442B.draw(canvas);
                canvas.translate(-f5, -f6);
            }
            if (m4607X()) {
                m4614y(bounds, rectF3);
                float f7 = rectF3.left;
                float f8 = rectF3.top;
                canvas.translate(f7, f8);
                this.f8489nF.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f8489nF.draw(canvas);
                canvas.translate(-f7, -f8);
            }
            if (this.f8480hs && this.f8464T != null) {
                PointF pointF = this.f8449G5;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f8464T;
                C0131CY c0131cy = this.f8473d2;
                if (charSequence != null) {
                    float m4613s = m4613s() + this.f8467UZ + this.f8466U8;
                    if (AbstractC2340s1.m4000z(this) == 0) {
                        pointF.x = bounds.left + m4613s;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - m4613s;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = c0131cy.f451z;
                    Paint.FontMetrics fontMetrics = this.f8460Pm;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.f8464T != null) {
                    float m4613s2 = m4613s() + this.f8467UZ + this.f8466U8;
                    float m4606U = m4606U() + this.f8470ZH + this.f8443BO;
                    if (AbstractC2340s1.m4000z(this) == 0) {
                        rectF3.left = bounds.left + m4613s2;
                        f = bounds.right - m4606U;
                    } else {
                        rectF3.left = bounds.left + m4606U;
                        f = bounds.right - m4613s2;
                    }
                    rectF3.right = f;
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                C1726gW c1726gW = c0131cy.f449u;
                TextPaint textPaint2 = c0131cy.f451z;
                if (c1726gW != null) {
                    textPaint2.drawableState = getState();
                    c0131cy.f449u.m3257N(this.f8456Lq, textPaint2, c0131cy.f448h);
                }
                textPaint2.setTextAlign(align);
                String charSequence2 = this.f8464T.toString();
                if (c0131cy.f445N) {
                    c0131cy.m260z(charSequence2);
                }
                if (Math.round(c0131cy.f450v) > Math.round(rectF3.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i6 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i6 = 0;
                }
                CharSequence charSequence3 = this.f8464T;
                if (z && this.f8463S3 != null) {
                    charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.f8463S3);
                }
                CharSequence charSequence4 = charSequence3;
                int length = charSequence4.length();
                float f9 = pointF.x;
                float f10 = pointF.y;
                rectF = rectF3;
                i3 = i2;
                i4 = 0;
                i5 = 255;
                canvas.drawText(charSequence4, 0, length, f9, f10, textPaint2);
                if (z) {
                    canvas.restoreToCount(i6);
                }
            } else {
                rectF = rectF3;
                i3 = i2;
                i4 = 0;
                i5 = 255;
            }
            if (m4609Z()) {
                rectF.setEmpty();
                if (m4609Z()) {
                    float f11 = this.f8470ZH + this.f8476dx;
                    if (AbstractC2340s1.m4000z(this) == 0) {
                        float f12 = bounds.right - f11;
                        rectF2 = rectF;
                        rectF2.right = f12;
                        rectF2.left = f12 - this.f8493qn;
                    } else {
                        rectF2 = rectF;
                        float f13 = bounds.left + f11;
                        rectF2.left = f13;
                        rectF2.right = f13 + this.f8493qn;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f14 = this.f8493qn;
                    float f15 = exactCenterY - (f14 / 2.0f);
                    rectF2.top = f15;
                    rectF2.bottom = f15 + f14;
                } else {
                    rectF2 = rectF;
                }
                float f16 = rectF2.left;
                float f17 = rectF2.top;
                canvas.translate(f16, f17);
                this.f8471b.setBounds(i4, i4, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = AbstractC0567Ke.f1845z;
                this.f8490nP.setBounds(this.f8471b.getBounds());
                this.f8490nP.jumpToCurrentState();
                this.f8490nP.draw(canvas);
                canvas.translate(-f16, -f17);
            }
            if (this.f8448Fu < i5) {
                canvas.restoreToCount(i3);
            }
        }
    }

    /* renamed from: e */
    public final void m4611e(boolean z) {
        if (this.f8484l != z) {
            boolean m4609Z = m4609Z();
            this.f8484l = z;
            boolean m4609Z2 = m4609Z();
            if (m4609Z != m4609Z2) {
                if (m4609Z2) {
                    m4612g(this.f8471b);
                } else {
                    m4599C(this.f8471b);
                }
                invalidateSelf();
                m4608Y();
            }
        }
    }

    /* renamed from: g */
    public final void m4612g(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC2340s1.m3999h(drawable, AbstractC2340s1.m4000z(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f8471b) {
            if (drawable.isStateful()) {
                drawable.setState(this.f8498zd);
            }
            AbstractC0235ET.m478o(drawable, this.f8469Yd);
            return;
        }
        Drawable drawable2 = this.f8442B;
        if (drawable == drawable2 && this.f8485m) {
            AbstractC0235ET.m478o(drawable2, this.f8452K);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8448Fu;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f8461Rh;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f8481i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float m4613s = m4613s() + this.f8467UZ + this.f8466U8;
        String charSequence = this.f8464T.toString();
        C0131CY c0131cy = this.f8473d2;
        if (c0131cy.f445N) {
            c0131cy.m260z(charSequence);
        }
        return Math.min(Math.round(m4606U() + c0131cy.f450v + m4613s + this.f8443BO + this.f8470ZH), this.f8453KM);
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f8478fc) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f8472d);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f8481i, this.f8472d);
        }
        outline.setAlpha(this.f8448Fu / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        if (m4600f(this.f8482j) || m4600f(this.f8454L) || m4600f(this.f8458O)) {
            return true;
        }
        if (this.f8477fH && m4600f(this.f8455LN)) {
            return true;
        }
        C1726gW c1726gW = this.f8473d2.f449u;
        if (c1726gW != null && (colorStateList = c1726gW.f5433G) != null && colorStateList.isStateful()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.f8492od && this.f8489nF != null && this.f8450HL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || m4601r(this.f8442B) || m4601r(this.f8489nF) || m4600f(this.f8465T0)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m4603F()) {
            onLayoutDirectionChanged |= AbstractC2340s1.m3999h(this.f8442B, i);
        }
        if (m4607X()) {
            onLayoutDirectionChanged |= AbstractC2340s1.m3999h(this.f8489nF, i);
        }
        if (m4609Z()) {
            onLayoutDirectionChanged |= AbstractC2340s1.m3999h(this.f8471b, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m4603F()) {
            onLevelChange |= this.f8442B.setLevel(i);
        }
        if (m4607X()) {
            onLevelChange |= this.f8489nF.setLevel(i);
        }
        if (m4609Z()) {
            onLevelChange |= this.f8471b.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f8478fc) {
            super.onStateChange(iArr);
        }
        return m4605J(iArr, this.f8498zd);
    }

    /* renamed from: s */
    public final float m4613s() {
        Drawable drawable;
        if (!m4603F() && !m4607X()) {
            return 0.0f;
        }
        float f = this.f8487n0;
        if (this.f8447EQ) {
            drawable = this.f8489nF;
        } else {
            drawable = this.f8442B;
        }
        float f2 = this.f8445D;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.f8446EC;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f8448Fu != i) {
            this.f8448Fu = i;
            invalidateSelf();
        }
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f8461Rh != colorFilter) {
            this.f8461Rh = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f8465T0 != colorStateList) {
            this.f8465T0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f8483j5 != mode) {
            this.f8483j5 = mode;
            ColorStateList colorStateList = this.f8465T0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f8457M6 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m4603F()) {
            visible |= this.f8442B.setVisible(z, z2);
        }
        if (m4607X()) {
            visible |= this.f8489nF.setVisible(z, z2);
        }
        if (m4609Z()) {
            visible |= this.f8471b.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: y */
    public final void m4614y(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f;
        rectF.setEmpty();
        if (m4603F() || m4607X()) {
            float f2 = this.f8467UZ + this.f8487n0;
            if (this.f8447EQ) {
                drawable = this.f8489nF;
            } else {
                drawable = this.f8442B;
            }
            float f3 = this.f8445D;
            if (f3 <= 0.0f && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (AbstractC2340s1.m4000z(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            if (this.f8447EQ) {
                drawable2 = this.f8489nF;
            } else {
                drawable2 = this.f8442B;
            }
            float f6 = this.f8445D;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f8456Lq.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f6;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    @Override // p000a.InterfaceC0879QU
    /* renamed from: z */
    public final void mo2027z() {
        m4608Y();
        invalidateSelf();
    }
}
