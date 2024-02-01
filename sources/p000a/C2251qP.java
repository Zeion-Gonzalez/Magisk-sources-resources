package p000a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: a.qP */
/* loaded from: classes.dex */
public final class C2251qP extends Drawable {

    /* renamed from: G */
    public int f6920G;

    /* renamed from: I */
    public ColorStateList f6921I;

    /* renamed from: M */
    public int f6922M;

    /* renamed from: S */
    public int f6927S;

    /* renamed from: V */
    public int f6928V;

    /* renamed from: W */
    public int f6929W;

    /* renamed from: h */
    public final Paint f6930h;

    /* renamed from: o */
    public float f6931o;

    /* renamed from: w */
    public C0099Bw f6934w;

    /* renamed from: z */
    public final C1008Su f6935z = AbstractC2656y5.f8275z;

    /* renamed from: v */
    public final Path f6933v = new Path();

    /* renamed from: P */
    public final Rect f6924P = new Rect();

    /* renamed from: N */
    public final RectF f6923N = new RectF();

    /* renamed from: Q */
    public final RectF f6925Q = new RectF();

    /* renamed from: u */
    public final C1649f0 f6932u = new C1649f0(this, 0);

    /* renamed from: R */
    public boolean f6926R = true;

    public C2251qP(C0099Bw c0099Bw) {
        this.f6934w = c0099Bw;
        Paint paint = new Paint(1);
        this.f6930h = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.f6926R;
        Paint paint = this.f6930h;
        Rect rect = this.f6924P;
        if (z) {
            copyBounds(rect);
            float height = this.f6931o / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{AbstractC0106C4.m228h(this.f6929W, this.f6927S), AbstractC0106C4.m228h(this.f6920G, this.f6927S), AbstractC0106C4.m228h(AbstractC0106C4.m229v(this.f6920G, 0), this.f6927S), AbstractC0106C4.m228h(AbstractC0106C4.m229v(this.f6928V, 0), this.f6927S), AbstractC0106C4.m228h(this.f6928V, this.f6927S), AbstractC0106C4.m228h(this.f6922M, this.f6927S)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f6926R = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f6923N;
        rectF.set(rect);
        InterfaceC1722gQ interfaceC1722gQ = this.f6934w.f372N;
        RectF rectF2 = this.f6925Q;
        rectF2.set(getBounds());
        float min = Math.min(interfaceC1722gQ.mo2191z(rectF2), rectF.width() / 2.0f);
        C0099Bw c0099Bw = this.f6934w;
        rectF2.set(getBounds());
        if (c0099Bw.m211N(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6932u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f6931o > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        C0099Bw c0099Bw = this.f6934w;
        RectF rectF = this.f6925Q;
        rectF.set(getBounds());
        if (c0099Bw.m211N(rectF)) {
            InterfaceC1722gQ interfaceC1722gQ = this.f6934w.f372N;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), interfaceC1722gQ.mo2191z(rectF));
            return;
        }
        Rect rect = this.f6924P;
        copyBounds(rect);
        RectF rectF2 = this.f6923N;
        rectF2.set(rect);
        C0099Bw c0099Bw2 = this.f6934w;
        Path path = this.f6933v;
        this.f6935z.m2184z(c0099Bw2, 1.0f, rectF2, null, path);
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
        C0099Bw c0099Bw = this.f6934w;
        RectF rectF = this.f6925Q;
        rectF.set(getBounds());
        if (c0099Bw.m211N(rectF)) {
            int round = Math.round(this.f6931o);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f6921I;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f6926R = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f6921I;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f6927S)) != this.f6927S) {
            this.f6926R = true;
            this.f6927S = colorForState;
        }
        if (this.f6926R) {
            invalidateSelf();
        }
        return this.f6926R;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f6930h.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6930h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
