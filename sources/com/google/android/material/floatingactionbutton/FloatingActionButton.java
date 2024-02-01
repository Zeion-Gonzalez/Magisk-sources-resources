package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.AbstractC0251En;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC1131VA;
import p000a.AbstractC1285Y3;
import p000a.AbstractC1815iC;
import p000a.AbstractC2446u3;
import p000a.AbstractC2471uY;
import p000a.AbstractC2575wW;
import p000a.C0030Ab;
import p000a.C0099Bw;
import p000a.C1168Vr;
import p000a.C1410aT;
import p000a.C1504cM;
import p000a.C2165op;
import p000a.C2196pM;
import p000a.C2251qP;
import p000a.C2281qz;
import p000a.C2290r8;
import p000a.C2533vf;
import p000a.C2580wd;
import p000a.C2698yx;
import p000a.InterfaceC0880QV;
import p000a.InterfaceC1594e0;
import p000a.InterfaceC1661fF;
import p000a.ViewTreeObserverOnPreDrawListenerC2587wk;

/* loaded from: classes.dex */
public class FloatingActionButton extends AbstractC1815iC implements InterfaceC0880QV, InterfaceC1661fF, InterfaceC1594e0 {

    /* renamed from: E */
    public final C2165op f9364E;

    /* renamed from: I */
    public final int f9365I;

    /* renamed from: R */
    public ColorStateList f9366R;

    /* renamed from: U */
    public final Rect f9367U;

    /* renamed from: f */
    public final C2533vf f9368f;

    /* renamed from: g */
    public int f9369g;

    /* renamed from: k */
    public int f9370k;

    /* renamed from: q */
    public final int f9371q;

    /* renamed from: r */
    public C1410aT f9372r;

    /* renamed from: s */
    public final Rect f9373s;

    /* renamed from: w */
    public PorterDuff.Mode f9374w;

    /* renamed from: y */
    public final boolean f9375y;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends AbstractC1131VA {

        /* renamed from: h */
        public final boolean f9376h;

        /* renamed from: z */
        public Rect f9377z;

        public BaseBehavior() {
            this.f9376h = true;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: P */
        public final boolean mo2316P(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m5064g(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof C1168Vr) {
                    z = ((C1168Vr) layoutParams).f3818z instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    m5065y(view2, floatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: g */
        public final boolean m5064g(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            boolean z;
            C1168Vr c1168Vr = (C1168Vr) floatingActionButton.getLayoutParams();
            if (!this.f9376h || c1168Vr.f3807Q != appBarLayout.getId() || floatingActionButton.f5681S != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            if (this.f9377z == null) {
                this.f9377z = new Rect();
            }
            Rect rect = this.f9377z;
            AbstractC2471uY.m4247z(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.m4984N()) {
                floatingActionButton.m5063u(false);
            } else {
                floatingActionButton.m5058G(false);
            }
            return true;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: o */
        public final boolean mo2323o(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            boolean z;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList m4778M = coordinatorLayout.m4778M(floatingActionButton);
            int size = m4778M.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) m4778M.get(i4);
                if (view2 instanceof AppBarLayout) {
                    if (m5064g(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof C1168Vr) {
                        z = ((C1168Vr) layoutParams).f3818z instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && m5065y(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m4784k(floatingActionButton, i);
            Rect rect = floatingActionButton.f9373s;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C1168Vr c1168Vr = (C1168Vr) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c1168Vr).rightMargin) {
                    i2 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c1168Vr).leftMargin) {
                    i2 = -rect.left;
                } else {
                    i2 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c1168Vr).bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c1168Vr).topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    floatingActionButton.offsetTopAndBottom(i3);
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                    floatingActionButton.offsetLeftAndRight(i2);
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: v */
        public final void mo2326v(C1168Vr c1168Vr) {
            if (c1168Vr.f3813o == 0) {
                c1168Vr.f3813o = 80;
            }
        }

        /* renamed from: y */
        public final boolean m5065y(View view, FloatingActionButton floatingActionButton) {
            boolean z;
            C1168Vr c1168Vr = (C1168Vr) floatingActionButton.getLayoutParams();
            if (!this.f9376h || c1168Vr.f3807Q != view.getId() || floatingActionButton.f5681S != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((C1168Vr) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m5063u(false);
            } else {
                floatingActionButton.m5058G(false);
            }
            return true;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: z */
        public final boolean mo2328z(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f9373s;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2925S);
            this.f9376h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.floatingActionButtonStyle, 2131952495), attributeSet);
        this.f9373s = new Rect();
        this.f9367U = new Rect();
        Context context2 = getContext();
        TypedArray m1817K = AbstractC0795Op.m1817K(context2, attributeSet, AbstractC0863Q8.f2927V, R.attr.floatingActionButtonStyle, 2131952495, new int[0]);
        this.f9366R = AbstractC0795Op.m1812H(context2, m1817K, 1);
        this.f9374w = AbstractC0795Op.m1856m(m1817K.getInt(2, -1), null);
        ColorStateList m1812H = AbstractC0795Op.m1812H(context2, m1817K, 12);
        this.f9365I = m1817K.getInt(7, -1);
        this.f9371q = m1817K.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = m1817K.getDimensionPixelSize(3, 0);
        float dimension = m1817K.getDimension(4, 0.0f);
        float dimension2 = m1817K.getDimension(9, 0.0f);
        float dimension3 = m1817K.getDimension(11, 0.0f);
        this.f9375y = m1817K.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize3 = m1817K.getDimensionPixelSize(10, 0);
        this.f9369g = dimensionPixelSize3;
        AbstractC0251En m5059N = m5059N();
        if (m5059N.f880I != dimensionPixelSize3) {
            m5059N.f880I = dimensionPixelSize3;
            float f = m5059N.f899w;
            m5059N.f899w = f;
            Matrix matrix = m5059N.f878E;
            m5059N.m548z(f, matrix);
            m5059N.f893k.setImageMatrix(matrix);
        }
        C0030Ab m69z = C0030Ab.m69z(context2, m1817K, 15);
        C0030Ab m69z2 = C0030Ab.m69z(context2, m1817K, 8);
        C0099Bw c0099Bw = new C0099Bw(C0099Bw.m209v(context2, attributeSet, R.attr.floatingActionButtonStyle, 2131952495, C0099Bw.f369S));
        boolean z = m1817K.getBoolean(5, false);
        setEnabled(m1817K.getBoolean(0, true));
        m1817K.recycle();
        C2165op c2165op = new C2165op(this);
        this.f9364E = c2165op;
        c2165op.m3775h(attributeSet, R.attr.floatingActionButtonStyle);
        this.f9368f = new C2533vf(this);
        m5059N().m541V(c0099Bw);
        m5059N().mo545u(this.f9366R, this.f9374w, m1812H, dimensionPixelSize);
        m5059N().f879G = dimensionPixelSize2;
        AbstractC0251En m5059N2 = m5059N();
        if (m5059N2.f897u != dimension) {
            m5059N2.f897u = dimension;
            m5059N2.mo535G(dimension, m5059N2.f894o, m5059N2.f889W);
        }
        AbstractC0251En m5059N3 = m5059N();
        if (m5059N3.f894o != dimension2) {
            m5059N3.f894o = dimension2;
            m5059N3.mo535G(m5059N3.f897u, dimension2, m5059N3.f889W);
        }
        AbstractC0251En m5059N4 = m5059N();
        if (m5059N4.f889W != dimension3) {
            m5059N4.f889W = dimension3;
            m5059N4.mo535G(m5059N4.f897u, m5059N4.f894o, dimension3);
        }
        m5059N().f888V = m69z;
        m5059N().f886S = m69z2;
        m5059N().f884Q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: G */
    public final void m5058G(boolean z) {
        boolean z2;
        boolean z3;
        AnimatorSet m546v;
        float f;
        float f2;
        AbstractC0251En m5059N = m5059N();
        boolean z4 = true;
        if (m5059N.f893k.getVisibility() == 0 ? m5059N.f895q != 1 : m5059N.f895q == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Animator animator = m5059N.f881M;
            if (animator != null) {
                animator.cancel();
            }
            if (m5059N.f888V == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            FloatingActionButton floatingActionButton = m5059N.f893k;
            if (!AbstractC1285Y3.m2635v(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z4 = false;
            }
            Matrix matrix = m5059N.f878E;
            if (z4) {
                if (floatingActionButton.getVisibility() != 0) {
                    float f3 = 0.0f;
                    floatingActionButton.setAlpha(0.0f);
                    if (z3) {
                        f = 0.4f;
                    } else {
                        f = 0.0f;
                    }
                    floatingActionButton.setScaleY(f);
                    if (z3) {
                        f2 = 0.4f;
                    } else {
                        f2 = 0.0f;
                    }
                    floatingActionButton.setScaleX(f2);
                    if (z3) {
                        f3 = 0.4f;
                    }
                    m5059N.f899w = f3;
                    m5059N.m548z(f3, matrix);
                    floatingActionButton.setImageMatrix(matrix);
                }
                C0030Ab c0030Ab = m5059N.f888V;
                if (c0030Ab != null) {
                    m546v = m5059N.m543h(c0030Ab, 1.0f, 1.0f, 1.0f);
                } else {
                    m546v = m5059N.m546v(1.0f, 1.0f, 1.0f, AbstractC0251En.f872Y, AbstractC0251En.f870J);
                }
                m546v.addListener(new C2580wd(m5059N, z));
                m546v.start();
                return;
            }
            floatingActionButton.m3373v(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            m5059N.f899w = 1.0f;
            m5059N.m548z(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
    }

    /* renamed from: N */
    public final AbstractC0251En m5059N() {
        if (this.f9372r == null) {
            this.f9372r = new C1410aT(this, new C2196pM(23, this));
        }
        return this.f9372r;
    }

    /* renamed from: Q */
    public final int m5060Q(int i) {
        int i2 = this.f9371q;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m5060Q(1) : m5060Q(0);
    }

    /* renamed from: W */
    public final void m5061W() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m5059N().mo542W(getDrawableState());
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.f9366R;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f9374w;
    }

    @Override // p000a.InterfaceC1661fF
    /* renamed from: h */
    public final void mo3137h(C0099Bw c0099Bw) {
        m5059N().m541V(c0099Bw);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        m5059N().mo544o();
    }

    /* renamed from: o */
    public final void m5062o(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f9373s;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0251En m5059N = m5059N();
        C2281qz c2281qz = m5059N.f892h;
        FloatingActionButton floatingActionButton = m5059N.f893k;
        if (c2281qz != null) {
            AbstractC0795Op.m1811G5(floatingActionButton, c2281qz);
        }
        int i = 1;
        if ((!(m5059N instanceof C1410aT)) != false) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (m5059N.f890f == null) {
                m5059N.f890f = new ViewTreeObserverOnPreDrawListenerC2587wk(i, m5059N);
            }
            viewTreeObserver.addOnPreDrawListener(m5059N.f890f);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0251En m5059N = m5059N();
        ViewTreeObserver viewTreeObserver = m5059N.f893k.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC2587wk viewTreeObserverOnPreDrawListenerC2587wk = m5059N.f890f;
        if (viewTreeObserverOnPreDrawListenerC2587wk != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2587wk);
            m5059N.f890f = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int m5060Q = m5060Q(this.f9365I);
        this.f9370k = (m5060Q - this.f9369g) / 2;
        m5059N().m547w();
        int min = Math.min(View.resolveSize(m5060Q, i), View.resolveSize(m5060Q, i2));
        Rect rect = this.f9373s;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2290r8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2290r8 c2290r8 = (C2290r8) parcelable;
        super.onRestoreInstanceState(c2290r8.f8021S);
        Bundle bundle = (Bundle) c2290r8.f7074w.getOrDefault("expandableWidgetHelper", null);
        bundle.getClass();
        C2533vf c2533vf = this.f9368f;
        c2533vf.getClass();
        c2533vf.f7758z = bundle.getBoolean("expanded", false);
        c2533vf.f7756h = bundle.getInt("expandedComponentIdHint", 0);
        if (c2533vf.f7758z) {
            ViewParent parent = ((View) c2533vf.f7757v).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m4781W((View) c2533vf.f7757v);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C2290r8 c2290r8 = new C2290r8(onSaveInstanceState);
        C2698yx c2698yx = c2290r8.f7074w;
        C2533vf c2533vf = this.f9368f;
        c2533vf.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c2533vf.f7758z);
        bundle.putInt("expandedComponentIdHint", c2533vf.f7756h);
        c2698yx.put("expandableWidgetHelper", bundle);
        return c2290r8;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f9367U;
            rect.set(0, 0, measuredWidth, measuredHeight);
            m5062o(rect);
            C1410aT c1410aT = this.f9372r;
            if (c1410aT.f884Q) {
                int i2 = c1410aT.f879G;
                FloatingActionButton floatingActionButton = c1410aT.f893k;
                i = Math.max((i2 - floatingActionButton.m5060Q(floatingActionButton.f9365I)) / 2, 0);
            } else {
                i = 0;
            }
            int i3 = -i;
            rect.inset(i3, i3);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f9366R != colorStateList) {
            this.f9366R = colorStateList;
            AbstractC0251En m5059N = m5059N();
            C2281qz c2281qz = m5059N.f892h;
            if (c2281qz != null) {
                c2281qz.setTintList(colorStateList);
            }
            C2251qP c2251qP = m5059N.f883P;
            if (c2251qP != null) {
                if (colorStateList != null) {
                    c2251qP.f6927S = colorStateList.getColorForState(c2251qP.getState(), c2251qP.f6927S);
                }
                c2251qP.f6921I = colorStateList;
                c2251qP.f6926R = true;
                c2251qP.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f9374w != mode) {
            this.f9374w = mode;
            C2281qz c2281qz = m5059N().f892h;
            if (c2281qz != null) {
                c2281qz.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        C2281qz c2281qz = m5059N().f892h;
        if (c2281qz != null) {
            c2281qz.m3935S(f);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            AbstractC0251En m5059N = m5059N();
            float f = m5059N.f899w;
            m5059N.f899w = f;
            Matrix matrix = m5059N.f878E;
            m5059N.m548z(f, matrix);
            m5059N.f893k.setImageMatrix(matrix);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.f9364E.m3776v(i);
        m5061W();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        m5059N().getClass();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        m5059N().getClass();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        m5059N().m536M();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        m5059N().m536M();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        m5059N().m536M();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        m3373v(i, true);
    }

    /* renamed from: u */
    public final void m5063u(boolean z) {
        boolean z2;
        int i;
        AnimatorSet m546v;
        AbstractC0251En m5059N = m5059N();
        FloatingActionButton floatingActionButton = m5059N.f893k;
        boolean z3 = false;
        if (floatingActionButton.getVisibility() != 0 ? m5059N.f895q != 2 : m5059N.f895q == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Animator animator = m5059N.f881M;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            FloatingActionButton floatingActionButton2 = m5059N.f893k;
            if (AbstractC1285Y3.m2635v(floatingActionButton2) && !floatingActionButton2.isInEditMode()) {
                z3 = true;
            }
            if (z3) {
                C0030Ab c0030Ab = m5059N.f886S;
                if (c0030Ab != null) {
                    m546v = m5059N.m543h(c0030Ab, 0.0f, 0.0f, 0.0f);
                } else {
                    m546v = m5059N.m546v(0.0f, 0.4f, 0.4f, AbstractC0251En.f874c, AbstractC0251En.f869H);
                }
                m546v.addListener(new C1504cM(m5059N, z));
                m546v.start();
                return;
            }
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton.m3373v(i, z);
        }
    }

    @Override // p000a.InterfaceC1594e0
    /* renamed from: z */
    public final AbstractC1131VA mo3069z() {
        return new Behavior();
    }
}
