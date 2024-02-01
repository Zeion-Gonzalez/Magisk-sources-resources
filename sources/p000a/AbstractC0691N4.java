package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: a.N4 */
/* loaded from: classes.dex */
public abstract class AbstractC0691N4 extends AbstractC0207Dy {

    /* renamed from: C */
    public int f2336C;

    /* renamed from: F */
    public final Rect f2337F;

    /* renamed from: H */
    public Drawable f2338H;

    /* renamed from: e */
    public final Rect f2339e;

    /* renamed from: j */
    public boolean f2340j;

    /* renamed from: p */
    public final boolean f2341p;

    public AbstractC0691N4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2339e = new Rect();
        this.f2337F = new Rect();
        this.f2336C = 119;
        this.f2341p = true;
        this.f2340j = false;
        TypedArray m1817K = AbstractC0795Op.m1817K(context, attributeSet, AbstractC0863Q8.f2924R, 0, 0, new int[0]);
        this.f2336C = m1817K.getInt(1, this.f2336C);
        Drawable drawable = m1817K.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f2341p = m1817K.getBoolean(2, true);
        m1817K.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2338H;
        if (drawable != null) {
            if (this.f2340j) {
                this.f2340j = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f2341p;
                Rect rect = this.f2339e;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f2336C;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f2337F;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f2338H;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2338H;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f2338H.setState(getDrawableState());
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.f2338H;
    }

    @Override // android.view.View
    public final int getForegroundGravity() {
        return this.f2336C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2338H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p000a.AbstractC0207Dy, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2340j = z | this.f2340j;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2340j = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f2338H;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f2338H);
            }
            this.f2338H = drawable;
            this.f2340j = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f2336C == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setForegroundGravity(int i) {
        if (this.f2336C != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2336C = i;
            if (i == 119 && this.f2338H != null) {
                this.f2338H.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2338H;
    }
}
