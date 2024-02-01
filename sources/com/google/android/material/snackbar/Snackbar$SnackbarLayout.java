package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0235ET;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC1548d9;
import p000a.AbstractC1589dw;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.AbstractC2575wW;
import p000a.AbstractC2691yn;
import p000a.C0099Bw;
import p000a.C2174oz;
import p000a.C2281qz;
import p000a.ViewOnTouchListenerC1645ew;

/* loaded from: classes.dex */
public final class Snackbar$SnackbarLayout extends FrameLayout {

    /* renamed from: E */
    public static final ViewOnTouchListenerC1645ew f9416E = new ViewOnTouchListenerC1645ew();

    /* renamed from: I */
    public final float f9417I;

    /* renamed from: R */
    public final C0099Bw f9418R;

    /* renamed from: S */
    public AbstractC2691yn f9419S;

    /* renamed from: U */
    public boolean f9420U;

    /* renamed from: g */
    public ColorStateList f9421g;

    /* renamed from: k */
    public final int f9422k;

    /* renamed from: q */
    public final int f9423q;

    /* renamed from: s */
    public Rect f9424s;

    /* renamed from: w */
    public final int f9425w;

    /* renamed from: y */
    public PorterDuff.Mode f9426y;

    /* JADX WARN: Multi-variable type inference failed */
    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2931Z);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC1548d9.m3008g(this, dimensionPixelSize);
        }
        this.f9425w = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f9418R = new C0099Bw(C0099Bw.m208h(context2, attributeSet, 0, 0));
        }
        float f = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0795Op.m1812H(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0795Op.m1856m(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f9417I = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f9423q = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f9422k = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f9416E);
        setFocusable(true);
        if (getBackground() == null) {
            int m1829T = AbstractC0795Op.m1829T(AbstractC0795Op.m1816J(this, R.attr.colorSurface), AbstractC0795Op.m1816J(this, R.attr.colorOnSurface), f);
            C0099Bw c0099Bw = this.f9418R;
            if (c0099Bw != null) {
                C2174oz c2174oz = AbstractC2691yn.f8386E;
                C2281qz c2281qz = new C2281qz(c0099Bw);
                c2281qz.m3934R(ColorStateList.valueOf(m1829T));
                gradientDrawable = c2281qz;
            } else {
                Resources resources = getResources();
                C2174oz c2174oz2 = AbstractC2691yn.f8386E;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(m1829T);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f9421g;
            if (colorStateList != null) {
                AbstractC0235ET.m478o(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4127q(this, gradientDrawable);
        }
    }

    @Override // android.view.View
    /* renamed from: N */
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f9421g != null) {
            drawable = drawable.mutate();
            AbstractC0235ET.m478o(drawable, this.f9421g);
            AbstractC0235ET.m476W(drawable, this.f9426y);
        }
        super.setBackgroundDrawable(drawable);
    }

    /* renamed from: P */
    public final void m5071P(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f9423q;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    @Override // android.view.View
    /* renamed from: Q */
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.f9421g = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC0235ET.m478o(mutate, colorStateList);
            AbstractC0235ET.m476W(mutate, this.f9426y);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    /* renamed from: W */
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f9416E);
        super.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0030, code lost:
    
        if (r1 == false) goto L54;
     */
    @Override // android.view.ViewGroup, android.view.View
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDetachedFromWindow() {
        /*
            r6 = this;
            super.onDetachedFromWindow()
            a.yn r0 = r6.f9419S
            if (r0 == 0) goto L43
            a.yR r1 = p000a.C2671yR.m4574h()
            a.JZ r2 = r0.f8400U
            java.lang.Object r3 = r1.f8322z
            monitor-enter(r3)
            boolean r4 = r1.m4579v(r2)     // Catch: java.lang.Throwable -> L28
            r5 = 1
            if (r4 != 0) goto L32
            a.im r1 = r1.f8319P     // Catch: java.lang.Throwable -> L28
            r4 = 0
            if (r1 == 0) goto L2f
            if (r2 == 0) goto L2a
            java.lang.ref.WeakReference r1 = r1.f5772z     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L28
            if (r1 != r2) goto L2a
            r1 = r5
            goto L2b
        L28:
            r0 = move-exception
            goto L41
        L2a:
            r1 = r4
        L2b:
            if (r1 == 0) goto L2f
            r1 = r5
            goto L30
        L2f:
            r1 = r4
        L30:
            if (r1 == 0) goto L33
        L32:
            r4 = r5
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L43
            android.os.Handler r1 = p000a.AbstractC2691yn.f8388Y
            a.KS r2 = new a.KS
            r2.<init>(r0, r5)
            r1.post(r2)
            goto L43
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar$SnackbarLayout.onDetachedFromWindow():void");
    }

    @Override // android.view.View
    /* renamed from: o */
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.f9420U && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f9424s = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            AbstractC2691yn abstractC2691yn = this.f9419S;
            if (abstractC2691yn != null) {
                C2174oz c2174oz = AbstractC2691yn.f8386E;
                abstractC2691yn.m4595Q();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m5071P(i, i2);
        int childCount = getChildCount();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().width == -1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    /* renamed from: u */
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f9426y = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC0235ET.m476W(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /* renamed from: v */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AbstractC2691yn abstractC2691yn = this.f9419S;
        if (abstractC2691yn != null && abstractC2691yn.f8412y) {
            abstractC2691yn.m4593N();
            abstractC2691yn.f8412y = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    /* renamed from: z */
    public final void onAttachedToWindow() {
        Insets mandatorySystemGestureInsets;
        int i;
        super.onAttachedToWindow();
        AbstractC2691yn abstractC2691yn = this.f9419S;
        if (abstractC2691yn != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                WindowInsets rootWindowInsets = abstractC2691yn.f8402W.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                    i = mandatorySystemGestureInsets.bottom;
                    abstractC2691yn.f8405k = i;
                    abstractC2691yn.m4595Q();
                }
            } else {
                abstractC2691yn.getClass();
            }
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC1589dw.m3064v(this);
    }
}
