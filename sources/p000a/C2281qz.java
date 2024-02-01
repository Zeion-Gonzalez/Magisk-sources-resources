package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* renamed from: a.qz */
/* loaded from: classes.dex */
public class C2281qz extends Drawable implements InterfaceC1661fF {

    /* renamed from: p */
    public static final Paint f7013p;

    /* renamed from: C */
    public boolean f7014C;

    /* renamed from: E */
    public final Region f7015E;

    /* renamed from: F */
    public PorterDuffColorFilter f7016F;

    /* renamed from: H */
    public final C2196pM f7017H;

    /* renamed from: I */
    public final BitSet f7018I;

    /* renamed from: J */
    public final Paint f7019J;

    /* renamed from: R */
    public final AbstractC1476bl[] f7020R;

    /* renamed from: S */
    public C1480br f7021S;

    /* renamed from: U */
    public final RectF f7022U;

    /* renamed from: X */
    public PorterDuffColorFilter f7023X;

    /* renamed from: Y */
    public final Paint f7024Y;

    /* renamed from: Z */
    public final RectF f7025Z;

    /* renamed from: c */
    public final C1883jT f7026c;

    /* renamed from: e */
    public final C1008Su f7027e;

    /* renamed from: f */
    public final Region f7028f;

    /* renamed from: g */
    public final Path f7029g;

    /* renamed from: k */
    public final Matrix f7030k;

    /* renamed from: q */
    public boolean f7031q;

    /* renamed from: r */
    public C0099Bw f7032r;

    /* renamed from: s */
    public final RectF f7033s;

    /* renamed from: w */
    public final AbstractC1476bl[] f7034w;

    /* renamed from: y */
    public final Path f7035y;

    static {
        Paint paint = new Paint(1);
        f7013p = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C2281qz() {
        this(new C0099Bw());
    }

    /* renamed from: G */
    public final float m3928G() {
        return this.f7021S.f4616z.f372N.mo2191z(m3937W());
    }

    /* renamed from: I */
    public final boolean m3929I(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f7021S.f4613v == null || color2 == (colorForState2 = this.f7021S.f4613v.getColorForState(iArr, (color2 = (paint2 = this.f7024Y).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f7021S.f4600P == null || color == (colorForState = this.f7021S.f4600P.getColorForState(iArr, (color = (paint = this.f7019J).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: M */
    public final void m3930M(Context context) {
        this.f7021S.f4607h = new C1445b5(context);
        m3938k();
    }

    /* renamed from: N */
    public final int m3931N(int i) {
        C1480br c1480br = this.f7021S;
        float f = c1480br.f4602R + c1480br.f4614w + c1480br.f4603S;
        C1445b5 c1445b5 = c1480br.f4607h;
        if (c1445b5 != null) {
            return c1445b5.m2865z(i, f);
        }
        return i;
    }

    /* renamed from: P */
    public final PorterDuffColorFilter m3932P(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int m3931N;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = m3931N(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z && (m3931N = m3931N((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(m3931N, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    /* renamed from: Q */
    public final void m3933Q(Canvas canvas) {
        if (this.f7018I.cardinality() > 0) {
            Log.w("qz", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f7021S.f4608k;
        Path path = this.f7029g;
        C1883jT c1883jT = this.f7026c;
        if (i != 0) {
            canvas.drawPath(path, c1883jT.f5877z);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC1476bl abstractC1476bl = this.f7020R[i2];
            int i3 = this.f7021S.f4610q;
            Matrix matrix = AbstractC1476bl.f4587h;
            abstractC1476bl.mo1798z(matrix, c1883jT, i3, canvas);
            this.f7034w[i2].mo1798z(matrix, c1883jT, this.f7021S.f4610q, canvas);
        }
        if (this.f7014C) {
            C1480br c1480br = this.f7021S;
            int sin = (int) (Math.sin(Math.toRadians(c1480br.f4606g)) * c1480br.f4608k);
            C1480br c1480br2 = this.f7021S;
            int cos = (int) (Math.cos(Math.toRadians(c1480br2.f4606g)) * c1480br2.f4608k);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f7013p);
            canvas.translate(sin, cos);
        }
    }

    /* renamed from: R */
    public final void m3934R(ColorStateList colorStateList) {
        C1480br c1480br = this.f7021S;
        if (c1480br.f4613v != colorStateList) {
            c1480br.f4613v = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: S */
    public final void m3935S(float f) {
        C1480br c1480br = this.f7021S;
        if (c1480br.f4602R != f) {
            c1480br.f4602R = f;
            m3938k();
        }
    }

    /* renamed from: V */
    public final boolean m3936V() {
        return this.f7021S.f4616z.m211N(m3937W());
    }

    /* renamed from: W */
    public final RectF m3937W() {
        RectF rectF = this.f7033s;
        rectF.set(getBounds());
        return rectF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x010b, code lost:
    
        if (r0 != false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2281qz.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7021S.f4604V;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f7021S;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f7021S.f4597I == 2) {
            return;
        }
        if (m3936V()) {
            outline.setRoundRect(getBounds(), m3928G() * this.f7021S.f4596G);
            return;
        }
        RectF m3937W = m3937W();
        Path path = this.f7029g;
        m3941v(m3937W, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f7021S.f4609o;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f7015E;
        region.set(bounds);
        RectF m3937W = m3937W();
        Path path = this.f7029g;
        m3941v(m3937W, path);
        Region region2 = this.f7028f;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // p000a.InterfaceC1661fF
    /* renamed from: h */
    public final void mo3137h(C0099Bw c0099Bw) {
        this.f7021S.f4616z = c0099Bw;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f7031q = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f7021S.f4601Q) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f7021S.f4599N) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f7021S.f4600P) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f7021S.f4613v) != null && colorStateList4.isStateful())));
    }

    /* renamed from: k */
    public final void m3938k() {
        C1480br c1480br = this.f7021S;
        float f = c1480br.f4602R + c1480br.f4614w;
        c1480br.f4610q = (int) Math.ceil(0.75f * f);
        this.f7021S.f4608k = (int) Math.ceil(f * 0.25f);
        m3939q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f7021S = new C1480br(this.f7021S);
        return this;
    }

    /* renamed from: o */
    public void mo94o(Canvas canvas) {
        boolean z;
        Paint paint = this.f7019J;
        Path path = this.f7035y;
        C0099Bw c0099Bw = this.f7032r;
        RectF rectF = this.f7022U;
        rectF.set(m3937W());
        Paint.Style style = this.f7021S.f4611s;
        float f = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f, f);
        m3940u(canvas, paint, path, c0099Bw, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f7031q = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m3929I(iArr) || m3939q();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: q */
    public final boolean m3939q() {
        PorterDuffColorFilter porterDuffColorFilter = this.f7023X;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f7016F;
        C1480br c1480br = this.f7021S;
        this.f7023X = m3932P(c1480br.f4601Q, c1480br.f4612u, this.f7024Y, true);
        C1480br c1480br2 = this.f7021S;
        this.f7016F = m3932P(c1480br2.f4599N, c1480br2.f4612u, this.f7019J, false);
        C1480br c1480br3 = this.f7021S;
        if (c1480br3.f4615y) {
            this.f7026c.m3503z(c1480br3.f4601Q.getColorForState(getState(), 0));
        }
        if (!AbstractC1451bD.m2871z(porterDuffColorFilter, this.f7023X) || !AbstractC1451bD.m2871z(porterDuffColorFilter2, this.f7016F)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C1480br c1480br = this.f7021S;
        if (c1480br.f4604V != i) {
            c1480br.f4604V = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7021S.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f7021S.f4601Q = colorStateList;
        m3939q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C1480br c1480br = this.f7021S;
        if (c1480br.f4612u != mode) {
            c1480br.f4612u = mode;
            m3939q();
            super.invalidateSelf();
        }
    }

    /* renamed from: u */
    public final void m3940u(Canvas canvas, Paint paint, Path path, C0099Bw c0099Bw, RectF rectF) {
        if (!c0099Bw.m211N(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float mo2191z = c0099Bw.f374Q.mo2191z(rectF) * this.f7021S.f4596G;
            canvas.drawRoundRect(rectF, mo2191z, mo2191z, paint);
        }
    }

    /* renamed from: v */
    public final void m3941v(RectF rectF, Path path) {
        C1008Su c1008Su = this.f7027e;
        C1480br c1480br = this.f7021S;
        c1008Su.m2184z(c1480br.f4616z, c1480br.f4596G, rectF, this.f7017H, path);
        if (this.f7021S.f4605W != 1.0f) {
            Matrix matrix = this.f7030k;
            matrix.reset();
            float f = this.f7021S.f4605W;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f7025Z, true);
    }

    /* renamed from: w */
    public final void m3942w() {
        this.f7026c.m3503z(-12303292);
        this.f7021S.f4615y = false;
        super.invalidateSelf();
    }

    public C2281qz(C1480br c1480br) {
        C1008Su c1008Su;
        this.f7020R = new AbstractC1476bl[4];
        this.f7034w = new AbstractC1476bl[4];
        this.f7018I = new BitSet(8);
        this.f7030k = new Matrix();
        this.f7029g = new Path();
        this.f7035y = new Path();
        this.f7033s = new RectF();
        this.f7022U = new RectF();
        this.f7015E = new Region();
        this.f7028f = new Region();
        Paint paint = new Paint(1);
        this.f7024Y = paint;
        Paint paint2 = new Paint(1);
        this.f7019J = paint2;
        this.f7026c = new C1883jT();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c1008Su = AbstractC2656y5.f8275z;
        } else {
            c1008Su = new C1008Su();
        }
        this.f7027e = c1008Su;
        this.f7025Z = new RectF();
        this.f7014C = true;
        this.f7021S = c1480br;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m3939q();
        m3929I(getState());
        this.f7017H = new C2196pM(26, this);
    }

    public C2281qz(C0099Bw c0099Bw) {
        this(new C1480br(c0099Bw));
    }

    public C2281qz(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C0099Bw.m208h(context, attributeSet, i, i2).m53z());
    }
}
