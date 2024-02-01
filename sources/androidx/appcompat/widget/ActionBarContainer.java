package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0483J5;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C1180W5;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: I */
    public final Drawable f8700I;

    /* renamed from: R */
    public View f8701R;

    /* renamed from: S */
    public boolean f8702S;

    /* renamed from: g */
    public final boolean f8703g;

    /* renamed from: k */
    public final Drawable f8704k;

    /* renamed from: q */
    public final Drawable f8705q;

    /* renamed from: s */
    public final int f8706s;

    /* renamed from: w */
    public View f8707w;

    /* renamed from: y */
    public boolean f8708y;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1180W5 c1180w5 = new C1180W5(this);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4127q(this, c1180w5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0483J5.f1626z);
        boolean z = false;
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f8700I = drawable;
        Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
        this.f8705q = drawable2;
        this.f8706s = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f8703g = true;
            this.f8704k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f8703g ? !(drawable != null || drawable2 != null) : this.f8704k == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8700I;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
        Drawable drawable2 = this.f8705q;
        if (drawable2 != null && drawable2.isStateful()) {
            drawable2.setState(getDrawableState());
        }
        Drawable drawable3 = this.f8704k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        drawable3.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8700I;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8705q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f8704k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f8701R = findViewById(R.id.action_bar);
        this.f8707w = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8702S || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f8703g) {
            Drawable drawable = this.f8704k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            Drawable drawable2 = this.f8700I;
            if (drawable2 != null) {
                if (this.f8701R.getVisibility() == 0) {
                    left = this.f8701R.getLeft();
                    top = this.f8701R.getTop();
                    right = this.f8701R.getRight();
                    view = this.f8701R;
                } else {
                    View view2 = this.f8707w;
                    if (view2 == null || view2.getVisibility() != 0) {
                        drawable2.setBounds(0, 0, 0, 0);
                    } else {
                        left = this.f8707w.getLeft();
                        top = this.f8707w.getTop();
                        right = this.f8707w.getRight();
                        view = this.f8707w;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
            } else {
                z2 = false;
            }
            this.f8708y = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f8701R == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f8706s) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f8701R == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f8700I;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f8705q;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f8704k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8700I;
        boolean z = this.f8703g;
        return (drawable == drawable2 && !z) || (drawable == this.f8705q && this.f8708y) || ((drawable == this.f8704k && z) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
