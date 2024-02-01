package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.topjohnwu.magisk.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000a.AbstractC0095Bq;
import p000a.AbstractC0235ET;
import p000a.AbstractC0567Ke;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC1806i0;
import p000a.AbstractC1843ih;
import p000a.AbstractC2441tz;
import p000a.AbstractC2446u3;
import p000a.AbstractC2575wW;
import p000a.C0021AO;
import p000a.C0099Bw;
import p000a.C1012T;
import p000a.C1480br;
import p000a.C2196pM;
import p000a.C2226py;
import p000a.C2281qz;
import p000a.C2408tN;
import p000a.C2413tS;
import p000a.C2428tk;
import p000a.InterfaceC1661fF;

/* loaded from: classes.dex */
public class MaterialButton extends C2413tS implements Checkable, InterfaceC1661fF {

    /* renamed from: E */
    public final int f9284E;

    /* renamed from: H */
    public boolean f9285H;

    /* renamed from: I */
    public final C2428tk f9286I;

    /* renamed from: J */
    public final int f9287J;

    /* renamed from: U */
    public String f9288U;

    /* renamed from: c */
    public boolean f9289c;

    /* renamed from: e */
    public final int f9290e;

    /* renamed from: f */
    public int f9291f;

    /* renamed from: g */
    public final PorterDuff.Mode f9292g;

    /* renamed from: k */
    public C2196pM f9293k;

    /* renamed from: q */
    public final LinkedHashSet f9294q;

    /* renamed from: r */
    public int f9295r;

    /* renamed from: s */
    public Drawable f9296s;

    /* renamed from: y */
    public final ColorStateList f9297y;

    /* renamed from: F */
    public static final int[] f9283F = {16842911};

    /* renamed from: C */
    public static final int[] f9282C = {16842912};

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    /* renamed from: G */
    public final void m5023G(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int intrinsicWidth;
        Drawable drawable = this.f9296s;
        boolean z5 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f9296s = mutate;
            AbstractC0235ET.m478o(mutate, this.f9297y);
            PorterDuff.Mode mode = this.f9292g;
            if (mode != null) {
                AbstractC0235ET.m476W(this.f9296s, mode);
            }
            int i = this.f9284E;
            if (i != 0) {
                intrinsicWidth = i;
            } else {
                intrinsicWidth = this.f9296s.getIntrinsicWidth();
            }
            if (i == 0) {
                i = this.f9296s.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9296s;
            int i2 = this.f9291f;
            int i3 = this.f9295r;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, i + i3);
            this.f9296s.setVisible(true, z);
        }
        if (z) {
            m5025P();
            return;
        }
        Drawable[] m3372z = AbstractC1806i0.m3372z(this);
        Drawable drawable3 = m3372z[0];
        Drawable drawable4 = m3372z[1];
        Drawable drawable5 = m3372z[2];
        int i4 = this.f9290e;
        if (i4 != 1 && i4 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || drawable3 == this.f9296s) {
            if (i4 != 3 && i4 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || drawable5 == this.f9296s) {
                if (i4 != 16 && i4 != 32) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z4 || drawable4 == this.f9296s) {
                    z5 = false;
                }
            }
        }
        if (z5) {
            m5025P();
        }
    }

    /* renamed from: M */
    public final void m5024M(int i, int i2) {
        boolean z;
        Layout.Alignment alignment;
        boolean z2;
        boolean z3;
        boolean z4;
        int min;
        if (this.f9296s != null && getLayout() != null) {
            boolean z5 = true;
            int i3 = this.f9290e;
            if (i3 != 1 && i3 != 2) {
                z = false;
            } else {
                z = true;
            }
            int i4 = this.f9287J;
            int i5 = this.f9284E;
            if (!z) {
                if (i3 != 3 && i3 != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    if (i3 != 16 && i3 != 32) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        this.f9291f = 0;
                        if (i3 == 16) {
                            this.f9295r = 0;
                            m5023G(false);
                        }
                        if (i5 == 0) {
                            i5 = this.f9296s.getIntrinsicHeight();
                        }
                        if (getLineCount() > 1) {
                            min = getLayout().getHeight();
                        } else {
                            TextPaint paint = getPaint();
                            String charSequence = getText().toString();
                            if (getTransformationMethod() != null) {
                                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                            }
                            Rect rect = new Rect();
                            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                            min = Math.min(rect.height(), getLayout().getHeight());
                        }
                        int max = Math.max(0, (((((i2 - min) - getPaddingTop()) - i5) - i4) - getPaddingBottom()) / 2);
                        if (this.f9295r != max) {
                            this.f9295r = max;
                            m5023G(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f9295r = 0;
            int textAlignment = getTextAlignment();
            if (textAlignment != 1) {
                if (textAlignment != 6 && textAlignment != 3) {
                    if (textAlignment != 4) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                int gravity = getGravity() & 8388615;
                if (gravity != 1) {
                    if (gravity != 5 && gravity != 8388613) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            if (i3 != 1 && i3 != 3 && ((i3 != 2 || alignment != Layout.Alignment.ALIGN_NORMAL) && (i3 != 4 || alignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                if (i5 == 0) {
                    i5 = this.f9296s.getIntrinsicWidth();
                }
                int lineCount = getLineCount();
                float f = 0.0f;
                for (int i6 = 0; i6 < lineCount; i6++) {
                    f = Math.max(f, getLayout().getLineWidth(i6));
                }
                int ceil = i - ((int) Math.ceil(f));
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                int m198N = (((ceil - AbstractC0095Bq.m198N(this)) - i5) - i4) - AbstractC0095Bq.m200Q(this);
                if (alignment == Layout.Alignment.ALIGN_CENTER) {
                    m198N /= 2;
                }
                if (AbstractC0095Bq.m199P(this) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i3 != 4) {
                    z5 = false;
                }
                if (z2 != z5) {
                    m198N = -m198N;
                }
                if (this.f9291f != m198N) {
                    this.f9291f = m198N;
                    m5023G(false);
                    return;
                }
                return;
            }
            this.f9291f = 0;
            m5023G(false);
        }
    }

    /* renamed from: P */
    public final void m5025P() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        int i = this.f9290e;
        if (i != 1 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AbstractC1806i0.m3365N(this, this.f9296s, null, null, null);
            return;
        }
        if (i != 3 && i != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            AbstractC1806i0.m3365N(this, null, null, this.f9296s, null);
            return;
        }
        if (i == 16 || i == 32) {
            z3 = true;
        }
        if (z3) {
            AbstractC1806i0.m3365N(this, null, this.f9296s, null, null);
        }
    }

    /* renamed from: W */
    public final void m5026W(PorterDuff.Mode mode) {
        if (m5029v()) {
            C2428tk c2428tk = this.f9286I;
            if (c2428tk.f7443o != mode) {
                c2428tk.f7443o = mode;
                if (c2428tk.m4176h(false) != null && c2428tk.f7443o != null) {
                    AbstractC0235ET.m476W(c2428tk.m4176h(false), c2428tk.f7443o);
                    return;
                }
                return;
            }
            return;
        }
        C2226py c2226py = this.f7391S;
        if (c2226py != null) {
            c2226py.m3863G(mode);
        }
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        if (m5029v()) {
            return this.f9286I.f7440W;
        }
        C2226py c2226py = this.f7391S;
        if (c2226py != null) {
            return c2226py.m3870v();
        }
        return null;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        if (m5029v()) {
            return this.f9286I.f7443o;
        }
        C2226py c2226py = this.f7391S;
        if (c2226py != null) {
            return c2226py.m3865P();
        }
        return null;
    }

    @Override // p000a.InterfaceC1661fF
    /* renamed from: h */
    public final void mo3137h(C0099Bw c0099Bw) {
        if (!m5029v()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f9286I.m4177v(c0099Bw);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9289c;
    }

    /* renamed from: o */
    public final void m5027o(ColorStateList colorStateList) {
        if (m5029v()) {
            C2428tk c2428tk = this.f9286I;
            if (c2428tk.f7440W != colorStateList) {
                c2428tk.f7440W = colorStateList;
                if (c2428tk.m4176h(false) != null) {
                    AbstractC0235ET.m478o(c2428tk.m4176h(false), c2428tk.f7440W);
                    return;
                }
                return;
            }
            return;
        }
        C2226py c2226py = this.f7391S;
        if (c2226py != null) {
            c2226py.m3867W(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m5029v()) {
            AbstractC0795Op.m1811G5(this, this.f9286I.m4176h(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C2428tk c2428tk = this.f9286I;
        if (c2428tk != null && c2428tk.f7447w) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f9283F);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9282C);
        }
        return onCreateDrawableState;
    }

    @Override // p000a.C2413tS, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z;
        Class cls;
        String name;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (!TextUtils.isEmpty(this.f9288U)) {
            name = this.f9288U;
        } else {
            C2428tk c2428tk = this.f9286I;
            if (c2428tk != null && c2428tk.f7447w) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cls = CompoundButton.class;
            } else {
                cls = Button.class;
            }
            name = cls.getName();
        }
        accessibilityEvent.setClassName(name);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // p000a.C2413tS, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        Class cls;
        String name;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean isEmpty = TextUtils.isEmpty(this.f9288U);
        boolean z2 = true;
        C2428tk c2428tk = this.f9286I;
        if (!isEmpty) {
            name = this.f9288U;
        } else {
            if (c2428tk != null && c2428tk.f7447w) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cls = CompoundButton.class;
            } else {
                cls = Button.class;
            }
            name = cls.getName();
        }
        accessibilityNodeInfo.setClassName(name);
        if (c2428tk == null || !c2428tk.f7447w) {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000a.C2413tS, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m5024M(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2408tN)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2408tN c2408tN = (C2408tN) parcelable;
        super.onRestoreInstanceState(c2408tN.f8021S);
        setChecked(c2408tN.f7353w);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C2408tN c2408tN = new C2408tN(super.onSaveInstanceState());
        c2408tN.f7353w = this.f9289c;
        return c2408tN;
    }

    @Override // p000a.C2413tS, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m5024M(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f9286I.f7432I) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f9296s != null) {
            if (this.f9296s.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (m5029v()) {
            C2428tk c2428tk = this.f9286I;
            if (c2428tk.m4176h(false) != null) {
                c2428tk.m4176h(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // p000a.C2413tS, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (m5029v()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                C2428tk c2428tk = this.f9286I;
                c2428tk.f7437R = true;
                ColorStateList colorStateList = c2428tk.f7440W;
                MaterialButton materialButton = c2428tk.f7448z;
                materialButton.m5027o(colorStateList);
                materialButton.m5026W(c2428tk.f7443o);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000a.C2413tS, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC1843ih.m3431X(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        m5027o(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        m5026W(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        boolean z2;
        C2428tk c2428tk = this.f9286I;
        if (c2428tk != null && c2428tk.f7447w) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && isEnabled() && this.f9289c != z) {
            this.f9289c = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f9289c;
                if (!materialButtonToggleGroup.f9304k) {
                    materialButtonToggleGroup.m5033h(getId(), z3);
                }
            }
            if (this.f9285H) {
                return;
            }
            this.f9285H = true;
            Iterator it = this.f9294q.iterator();
            if (!it.hasNext()) {
                this.f9285H = false;
            } else {
                AbstractC2441tz.m4202q(it.next());
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (m5029v()) {
            this.f9286I.m4176h(false).m3935S(f);
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        C2196pM c2196pM = this.f9293k;
        if (c2196pM != null) {
            ((MaterialButtonToggleGroup) c2196pM.f6755R).invalidate();
        }
        super.setPressed(z);
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m5024M(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f9289c);
    }

    /* renamed from: u */
    public final void m5028u(RippleDrawable rippleDrawable) {
        super.setBackgroundDrawable(rippleDrawable);
    }

    /* renamed from: v */
    public final boolean m5029v() {
        C2428tk c2428tk = this.f9286I;
        if (c2428tk != null && !c2428tk.f7437R) {
            return true;
        }
        return false;
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, i, 2131952686), attributeSet, i);
        boolean z;
        this.f9294q = new LinkedHashSet();
        this.f9289c = false;
        this.f9285H = false;
        Context context2 = getContext();
        TypedArray m1817K = AbstractC0795Op.m1817K(context2, attributeSet, AbstractC0863Q8.f2917I, i, 2131952686, new int[0]);
        int dimensionPixelSize = m1817K.getDimensionPixelSize(12, 0);
        this.f9287J = dimensionPixelSize;
        this.f9292g = AbstractC0795Op.m1856m(m1817K.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f9297y = AbstractC0795Op.m1812H(getContext(), m1817K, 14);
        this.f9296s = AbstractC0795Op.m1847e(getContext(), m1817K, 10);
        this.f9290e = m1817K.getInteger(11, 1);
        this.f9284E = m1817K.getDimensionPixelSize(13, 0);
        C2428tk c2428tk = new C2428tk(this, new C0099Bw(C0099Bw.m208h(context2, attributeSet, i, 2131952686)));
        this.f9286I = c2428tk;
        c2428tk.f7446v = m1817K.getDimensionPixelOffset(1, 0);
        c2428tk.f7435P = m1817K.getDimensionPixelOffset(2, 0);
        c2428tk.f7434N = m1817K.getDimensionPixelOffset(3, 0);
        c2428tk.f7436Q = m1817K.getDimensionPixelOffset(4, 0);
        if (m1817K.hasValue(8)) {
            int dimensionPixelSize2 = m1817K.getDimensionPixelSize(8, -1);
            C0099Bw c0099Bw = c2428tk.f7441h;
            float f = dimensionPixelSize2;
            c0099Bw.getClass();
            C0021AO c0021ao = new C0021AO(c0099Bw);
            c0021ao.f130N = new C1012T(f);
            c0021ao.f132Q = new C1012T(f);
            c0021ao.f137u = new C1012T(f);
            c0021ao.f136o = new C1012T(f);
            c2428tk.m4177v(new C0099Bw(c0021ao));
        }
        c2428tk.f7445u = m1817K.getDimensionPixelSize(20, 0);
        c2428tk.f7443o = AbstractC0795Op.m1856m(m1817K.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        c2428tk.f7440W = AbstractC0795Op.m1812H(getContext(), m1817K, 6);
        c2428tk.f7431G = AbstractC0795Op.m1812H(getContext(), m1817K, 19);
        c2428tk.f7433M = AbstractC0795Op.m1812H(getContext(), m1817K, 16);
        c2428tk.f7447w = m1817K.getBoolean(5, false);
        c2428tk.f7442k = m1817K.getDimensionPixelSize(9, 0);
        c2428tk.f7432I = m1817K.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        int m200Q = AbstractC0095Bq.m200Q(this);
        int paddingTop = getPaddingTop();
        int m198N = AbstractC0095Bq.m198N(this);
        int paddingBottom = getPaddingBottom();
        if (m1817K.hasValue(0)) {
            c2428tk.f7437R = true;
            m5027o(c2428tk.f7440W);
            m5026W(c2428tk.f7443o);
            z = false;
        } else {
            C2281qz c2281qz = new C2281qz(c2428tk.f7441h);
            c2281qz.m3930M(getContext());
            AbstractC0235ET.m478o(c2281qz, c2428tk.f7440W);
            PorterDuff.Mode mode = c2428tk.f7443o;
            if (mode != null) {
                AbstractC0235ET.m476W(c2281qz, mode);
            }
            float f2 = c2428tk.f7445u;
            ColorStateList colorStateList = c2428tk.f7431G;
            c2281qz.f7021S.f4598M = f2;
            c2281qz.invalidateSelf();
            C1480br c1480br = c2281qz.f7021S;
            if (c1480br.f4600P != colorStateList) {
                c1480br.f4600P = colorStateList;
                c2281qz.onStateChange(c2281qz.getState());
            }
            C2281qz c2281qz2 = new C2281qz(c2428tk.f7441h);
            c2281qz2.setTint(0);
            float f3 = c2428tk.f7445u;
            int m1816J = c2428tk.f7438S ? AbstractC0795Op.m1816J(this, R.attr.colorSurface) : 0;
            c2281qz2.f7021S.f4598M = f3;
            c2281qz2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(m1816J);
            C1480br c1480br2 = c2281qz2.f7021S;
            if (c1480br2.f4600P != valueOf) {
                c1480br2.f4600P = valueOf;
                c2281qz2.onStateChange(c2281qz2.getState());
            }
            C2281qz c2281qz3 = new C2281qz(c2428tk.f7441h);
            c2428tk.f7439V = c2281qz3;
            AbstractC0235ET.m479u(c2281qz3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0567Ke.m1282h(c2428tk.f7433M), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c2281qz2, c2281qz}), c2428tk.f7446v, c2428tk.f7434N, c2428tk.f7435P, c2428tk.f7436Q), c2428tk.f7439V);
            c2428tk.f7444q = rippleDrawable;
            m5028u(rippleDrawable);
            z = false;
            C2281qz m4176h = c2428tk.m4176h(false);
            if (m4176h != null) {
                m4176h.m3935S(c2428tk.f7442k);
                m4176h.setState(getDrawableState());
            }
        }
        AbstractC0095Bq.m197M(this, m200Q + c2428tk.f7446v, paddingTop + c2428tk.f7434N, m198N + c2428tk.f7435P, paddingBottom + c2428tk.f7436Q);
        m1817K.recycle();
        setCompoundDrawablePadding(dimensionPixelSize);
        m5023G(this.f9296s != null ? true : z);
    }
}
