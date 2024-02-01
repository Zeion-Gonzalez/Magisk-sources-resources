package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p000a.AbstractC0235ET;
import p000a.AbstractC0438II;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC1548d9;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.AbstractC2575wW;
import p000a.C2189pE;
import p000a.C2281qz;
import p000a.C2417tX;
import p000a.C2496v1;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: Ha */
    public static final ImageView.ScaleType[] f9187Ha = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: BO */
    public Integer f9188BO;

    /* renamed from: Lq */
    public final Boolean f9189Lq;

    /* renamed from: ZH */
    public final ImageView.ScaleType f9190ZH;

    /* renamed from: dx */
    public final boolean f9191dx;

    /* renamed from: he */
    public final boolean f9192he;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.toolbarStyle, 2131952786), attributeSet, 0);
        Context context2 = getContext();
        TypedArray m1817K = AbstractC0795Op.m1817K(context2, attributeSet, AbstractC0863Q8.f2930Y, R.attr.toolbarStyle, 2131952786, new int[0]);
        if (m1817K.hasValue(2)) {
            this.f9188BO = Integer.valueOf(m1817K.getColor(2, -1));
            Drawable m4742V = m4742V();
            if (m4742V != null) {
                mo4746f(m4742V);
            }
        }
        this.f9192he = m1817K.getBoolean(4, false);
        this.f9191dx = m1817K.getBoolean(3, false);
        int i = m1817K.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f9187Ha;
            if (i < scaleTypeArr.length) {
                this.f9190ZH = scaleTypeArr[i];
            }
        }
        if (m1817K.hasValue(0)) {
            this.f9189Lq = Boolean.valueOf(m1817K.getBoolean(0, false));
        }
        m1817K.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C2281qz c2281qz = new C2281qz();
            c2281qz.m3934R(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c2281qz.m3930M(context2);
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            c2281qz.m3935S(AbstractC1548d9.m3005W(this));
            AbstractC2397t8.m4127q(this, c2281qz);
        }
    }

    /* renamed from: H */
    public final void m5000H(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: R */
    public final void mo4740R(int i) {
        C2189pE m4737M = m4737M();
        boolean z = m4737M instanceof C2189pE;
        if (z) {
            m4737M.m3792E();
        }
        super.mo4740R(i);
        if (z) {
            m4737M.m3794U();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: f */
    public final void mo4746f(Drawable drawable) {
        if (drawable != null && this.f9188BO != null) {
            drawable = drawable.mutate();
            AbstractC0235ET.m479u(drawable, this.f9188BO.intValue());
        }
        super.mo4746f(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2281qz) {
            AbstractC0795Op.m1811G5(this, (C2281qz) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        Drawable drawable;
        ImageView imageView;
        Drawable drawable2;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        boolean z2 = this.f9191dx;
        boolean z3 = this.f9192he;
        if (z3 || z2) {
            ArrayList m1018Y = AbstractC0438II.m1018Y(this, this.f8840d);
            boolean isEmpty = m1018Y.isEmpty();
            C2496v1 c2496v1 = AbstractC0438II.f1459c;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(m1018Y, c2496v1);
            }
            ArrayList m1018Y2 = AbstractC0438II.m1018Y(this, this.f8830O);
            if (m1018Y2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(m1018Y2, c2496v1);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (z3 && textView != null) {
                    m5000H(textView, pair);
                }
                if (z2 && textView2 != null) {
                    m5000H(textView2, pair);
                }
            }
        }
        C2417tX c2417tX = this.f8855q;
        if (c2417tX != null) {
            drawable = c2417tX.getDrawable();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f9189Lq;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9190ZH;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C2281qz) {
            ((C2281qz) background).m3935S(f);
        }
    }
}
