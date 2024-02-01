package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0095Bq;
import p000a.AbstractC0235ET;
import p000a.AbstractC0567Ke;
import p000a.AbstractC0745Ny;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC2404tI;
import p000a.AbstractC2446u3;
import p000a.AbstractC2575wW;
import p000a.C0099Bw;
import p000a.C1480br;
import p000a.C1624eZ;
import p000a.C1724gS;
import p000a.C1744go;
import p000a.C2281qz;
import p000a.InterfaceC1661fF;

/* loaded from: classes.dex */
public class MaterialCardView extends AbstractC2404tI implements Checkable, InterfaceC1661fF {

    /* renamed from: g */
    public final C1724gS f9311g;

    /* renamed from: s */
    public boolean f9312s;

    /* renamed from: y */
    public final boolean f9313y;

    /* renamed from: U */
    public static final int[] f9310U = {16842911};

    /* renamed from: E */
    public static final int[] f9309E = {16842912};

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.materialCardViewStyle, 2131952698), attributeSet);
        boolean z;
        boolean z2;
        float f;
        this.f9312s = false;
        this.f9313y = true;
        TypedArray m1817K = AbstractC0795Op.m1817K(getContext(), attributeSet, AbstractC0863Q8.f2948y, R.attr.materialCardViewStyle, 2131952698, new int[0]);
        C1724gS c1724gS = new C1724gS(this, attributeSet);
        this.f9311g = c1724gS;
        ColorStateList colorStateList = ((C1744go) ((Drawable) this.f7347q.f5013R)).f5509o;
        C2281qz c2281qz = c1724gS.f5429v;
        c2281qz.m3934R(colorStateList);
        Rect rect = this.f7348w;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        Rect rect2 = c1724gS.f5423h;
        rect2.set(i, i2, i3, i4);
        MaterialCardView materialCardView = c1724gS.f5432z;
        if (materialCardView.f7345R && !c2281qz.m3936V()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !c1724gS.m3254u()) {
            z2 = false;
        } else {
            z2 = true;
        }
        float f2 = 0.0f;
        if (z2) {
            f = c1724gS.m3256z();
        } else {
            f = 0.0f;
        }
        boolean z3 = materialCardView.f7345R;
        C1624eZ c1624eZ = materialCardView.f7347q;
        if (z3 && materialCardView.f7346S) {
            f2 = (float) ((1.0d - C1724gS.f5408r) * ((C1744go) ((Drawable) c1624eZ.f5013R)).f5512z);
        }
        int i5 = (int) (f - f2);
        materialCardView.f7348w.set(rect2.left + i5, rect2.top + i5, rect2.right + i5, rect2.bottom + i5);
        if (!((AbstractC2404tI) c1624eZ.f5015w).f7346S) {
            c1624eZ.m3079I(0, 0, 0, 0);
        } else {
            C1744go c1744go = (C1744go) ((Drawable) c1624eZ.f5013R);
            float f3 = c1744go.f5504N;
            boolean m3080P = c1624eZ.m3080P();
            float f4 = c1744go.f5512z;
            int ceil = (int) Math.ceil(AbstractC0745Ny.m1721z(f3, f4, m3080P));
            int ceil2 = (int) Math.ceil(AbstractC0745Ny.m1720h(f3, f4, c1624eZ.m3080P()));
            c1624eZ.m3079I(ceil, ceil2, ceil, ceil2);
        }
        ColorStateList m1812H = AbstractC0795Op.m1812H(materialCardView.getContext(), m1817K, 11);
        c1724gS.f5416R = m1812H;
        if (m1812H == null) {
            c1724gS.f5416R = ColorStateList.valueOf(-1);
        }
        c1724gS.f5425o = m1817K.getDimensionPixelSize(12, 0);
        boolean z4 = m1817K.getBoolean(0, false);
        c1724gS.f5422g = z4;
        materialCardView.setLongClickable(z4);
        c1724gS.f5419V = AbstractC0795Op.m1812H(materialCardView.getContext(), m1817K, 6);
        Drawable m1847e = AbstractC0795Op.m1847e(materialCardView.getContext(), m1817K, 2);
        if (m1847e != null) {
            Drawable mutate = m1847e.mutate();
            c1724gS.f5410G = mutate;
            AbstractC0235ET.m478o(mutate, c1724gS.f5419V);
            c1724gS.m3251N(materialCardView.isChecked(), false);
        } else {
            c1724gS.f5410G = C1724gS.f5407Y;
        }
        LayerDrawable layerDrawable = c1724gS.f5411I;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, c1724gS.f5410G);
        }
        c1724gS.f5415Q = m1817K.getDimensionPixelSize(5, 0);
        c1724gS.f5413N = m1817K.getDimensionPixelSize(4, 0);
        c1724gS.f5428u = m1817K.getInteger(3, 8388661);
        ColorStateList m1812H2 = AbstractC0795Op.m1812H(materialCardView.getContext(), m1817K, 7);
        c1724gS.f5412M = m1812H2;
        if (m1812H2 == null) {
            c1724gS.f5412M = ColorStateList.valueOf(AbstractC0795Op.m1816J(materialCardView, R.attr.colorControlHighlight));
        }
        ColorStateList m1812H3 = AbstractC0795Op.m1812H(materialCardView.getContext(), m1817K, 1);
        m1812H3 = m1812H3 == null ? ColorStateList.valueOf(0) : m1812H3;
        C2281qz c2281qz2 = c1724gS.f5414P;
        c2281qz2.m3934R(m1812H3);
        int[] iArr = AbstractC0567Ke.f1845z;
        RippleDrawable rippleDrawable = c1724gS.f5430w;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c1724gS.f5412M);
        }
        c2281qz.m3935S(((AbstractC2404tI) materialCardView.f7347q.f5015w).getElevation());
        float f5 = c1724gS.f5425o;
        ColorStateList colorStateList2 = c1724gS.f5416R;
        c2281qz2.f7021S.f4598M = f5;
        c2281qz2.invalidateSelf();
        C1480br c1480br = c2281qz2.f7021S;
        if (c1480br.f4600P != colorStateList2) {
            c1480br.f4600P = colorStateList2;
            c2281qz2.onStateChange(c2281qz2.getState());
        }
        super.setBackgroundDrawable(c1724gS.m3252P(c2281qz));
        LayerDrawable m3255v = materialCardView.isClickable() ? c1724gS.m3255v() : c2281qz2;
        c1724gS.f5420W = m3255v;
        materialCardView.setForeground(c1724gS.m3252P(m3255v));
        m1817K.recycle();
    }

    @Override // p000a.InterfaceC1661fF
    /* renamed from: h */
    public final void mo3137h(C0099Bw c0099Bw) {
        RectF rectF = new RectF();
        C1724gS c1724gS = this.f9311g;
        rectF.set(c1724gS.f5429v.getBounds());
        setClipToOutline(c0099Bw.m211N(rectF));
        c1724gS.m3253Q(c0099Bw);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9312s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0795Op.m1811G5(this, this.f9311g.f5429v);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        C1724gS c1724gS = this.f9311g;
        if (c1724gS != null && c1724gS.f5422g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f9310U);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9309E);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C1724gS c1724gS = this.f9311g;
        if (c1724gS != null && c1724gS.f5422g) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // p000a.AbstractC2404tI, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C1724gS c1724gS = this.f9311g;
        if (c1724gS.f5411I != null) {
            MaterialCardView materialCardView = c1724gS.f5432z;
            boolean z4 = false;
            if (materialCardView.f7346S) {
                float f2 = ((C1744go) ((Drawable) materialCardView.f7347q.f5013R)).f5504N * 1.5f;
                float f3 = 0.0f;
                if (c1724gS.m3254u()) {
                    f = c1724gS.m3256z();
                } else {
                    f = 0.0f;
                }
                i3 = (int) Math.ceil((f2 + f) * 2.0f);
                float f4 = ((C1744go) ((Drawable) materialCardView.f7347q.f5013R)).f5504N;
                if (c1724gS.m3254u()) {
                    f3 = c1724gS.m3256z();
                }
                i4 = (int) Math.ceil((f4 + f3) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i11 = c1724gS.f5428u;
            if ((i11 & 8388613) == 8388613) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i5 = ((measuredWidth - c1724gS.f5413N) - c1724gS.f5415Q) - i4;
            } else {
                i5 = c1724gS.f5413N;
            }
            if ((i11 & 80) == 80) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i6 = c1724gS.f5413N;
            } else {
                i6 = ((measuredHeight - c1724gS.f5413N) - c1724gS.f5415Q) - i3;
            }
            int i12 = i6;
            if ((i11 & 8388613) == 8388613) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i7 = c1724gS.f5413N;
            } else {
                i7 = ((measuredWidth - c1724gS.f5413N) - c1724gS.f5415Q) - i4;
            }
            if ((i11 & 80) == 80) {
                z4 = true;
            }
            if (z4) {
                i8 = ((measuredHeight - c1724gS.f5413N) - c1724gS.f5415Q) - i3;
            } else {
                i8 = c1724gS.f5413N;
            }
            int i13 = i8;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (AbstractC0095Bq.m199P(materialCardView) == 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            c1724gS.f5411I.setLayerInset(2, i10, i13, i9, i12);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.f9313y) {
            C1724gS c1724gS = this.f9311g;
            if (!c1724gS.f5424k) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c1724gS.f5424k = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.f9312s != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        C1724gS c1724gS = this.f9311g;
        if (c1724gS != null) {
            Drawable drawable2 = c1724gS.f5420W;
            MaterialCardView materialCardView = c1724gS.f5432z;
            if (materialCardView.isClickable()) {
                drawable = c1724gS.m3255v();
            } else {
                drawable = c1724gS.f5414P;
            }
            c1724gS.f5420W = drawable;
            if (drawable2 != drawable) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
                } else {
                    materialCardView.setForeground(c1724gS.m3252P(drawable));
                }
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        boolean z;
        RippleDrawable rippleDrawable;
        C1724gS c1724gS = this.f9311g;
        if (c1724gS != null && c1724gS.f5422g) {
            z = true;
        } else {
            z = false;
        }
        if (z && isEnabled()) {
            this.f9312s = !this.f9312s;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26 && (rippleDrawable = c1724gS.f5430w) != null) {
                Rect bounds = rippleDrawable.getBounds();
                int i = bounds.bottom;
                c1724gS.f5430w.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
                c1724gS.f5430w.setBounds(bounds.left, bounds.top, bounds.right, i);
            }
            c1724gS.m3251N(this.f9312s, true);
        }
    }
}
