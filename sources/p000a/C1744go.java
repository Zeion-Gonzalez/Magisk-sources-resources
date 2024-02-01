package p000a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a.go */
/* loaded from: classes.dex */
public final class C1744go extends Drawable {

    /* renamed from: G */
    public ColorStateList f5502G;

    /* renamed from: N */
    public float f5504N;

    /* renamed from: P */
    public final Rect f5505P;

    /* renamed from: W */
    public PorterDuffColorFilter f5507W;

    /* renamed from: h */
    public final Paint f5508h;

    /* renamed from: o */
    public ColorStateList f5509o;

    /* renamed from: v */
    public final RectF f5511v;

    /* renamed from: z */
    public final float f5512z;

    /* renamed from: Q */
    public boolean f5506Q = false;

    /* renamed from: u */
    public boolean f5510u = true;

    /* renamed from: M */
    public PorterDuff.Mode f5503M = PorterDuff.Mode.SRC_IN;

    public C1744go(float f, ColorStateList colorStateList) {
        this.f5512z = f;
        Paint paint = new Paint(5);
        this.f5508h = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f5509o = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f5509o.getDefaultColor()));
        this.f5511v = new RectF();
        this.f5505P = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f5508h;
        if (this.f5507W == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f5507W);
            z = true;
        }
        RectF rectF = this.f5511v;
        float f = this.f5512z;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f5505P, this.f5512z);
    }

    /* renamed from: h */
    public final void m3276h(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f5511v;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f5505P;
        rect2.set(rect);
        if (this.f5506Q) {
            float f = this.f5504N;
            boolean z = this.f5510u;
            float f2 = this.f5512z;
            rect2.inset((int) Math.ceil(AbstractC0745Ny.m1721z(this.f5504N, f2, this.f5510u)), (int) Math.ceil(AbstractC0745Ny.m1720h(f, f2, z)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f5502G;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f5509o) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3276h(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f5509o;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f5508h;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f5502G;
        if (colorStateList2 == null || (mode = this.f5503M) == null) {
            return z;
        }
        this.f5507W = m3277z(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5508h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5508h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f5502G = colorStateList;
        this.f5507W = m3277z(colorStateList, this.f5503M);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f5503M = mode;
        this.f5507W = m3277z(this.f5502G, mode);
        invalidateSelf();
    }

    /* renamed from: z */
    public final PorterDuffColorFilter m3277z(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
