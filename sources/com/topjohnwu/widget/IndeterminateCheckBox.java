package com.topjohnwu.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import com.topjohnwu.magisk.R;
import p000a.AbstractC0795Op;
import p000a.AbstractC1581dl;
import p000a.AbstractC2293rB;
import p000a.C0024AR;
import p000a.C0365Gy;
import p000a.C1053Tj;
import p000a.C2032mF;
import p000a.InterfaceC0432IC;

/* loaded from: classes.dex */
public class IndeterminateCheckBox extends C2032mF {

    /* renamed from: K */
    public static final int[] f9626K = {R.attr.state_indeterminate};

    /* renamed from: B */
    public transient C0024AR f9627B;

    /* renamed from: T */
    public boolean f9628T;

    /* renamed from: t */
    public transient boolean f9629t;

    public IndeterminateCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setButtonDrawable(R.drawable.btn_checkmark);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1581dl.f4861z);
        try {
            if (obtainStyledAttributes.getBoolean(1, false)) {
                m5139W(true, true);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: W */
    public final void m5139W(boolean z, boolean z2) {
        if (this.f9628T != z) {
            this.f9628T = z;
            refreshDrawableState();
            if (z2) {
                m5140o();
            }
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return IndeterminateCheckBox.class.getName();
    }

    /* renamed from: o */
    public final void m5140o() {
        if (this.f9629t) {
            return;
        }
        this.f9629t = true;
        C0024AR c0024ar = this.f9627B;
        if (c0024ar != null) {
            m5141u();
            ((InterfaceC0432IC) c0024ar.f141R).mo258z();
        }
        this.f9629t = false;
    }

    @Override // p000a.C2032mF, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (m5141u() == null) {
            View.mergeDrawableStates(onCreateDrawableState, f9626K);
        }
        return onCreateDrawableState;
    }

    @Override // p000a.C2032mF, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0365Gy c0365Gy = (C0365Gy) parcelable;
        this.f9629t = true;
        super.onRestoreInstanceState(c0365Gy.getSuperState());
        this.f9629t = false;
        boolean z = c0365Gy.f1266S;
        this.f9628T = z;
        if (z || isChecked()) {
            m5140o();
        }
    }

    @Override // p000a.C2032mF, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0365Gy c0365Gy = new C0365Gy((C1053Tj) super.onSaveInstanceState());
        c0365Gy.f1266S = this.f9628T;
        return c0365Gy;
    }

    @Override // p000a.C2032mF, p000a.C1707g5, android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        super.setButtonDrawable(i);
        int[][] iArr = {new int[]{-16842910}, new int[]{R.attr.state_indeterminate}, new int[]{16842912}, StateSet.WILD_CARD};
        int m1816J = AbstractC0795Op.m1816J(this, R.attr.colorControlActivated);
        int m1836Y = AbstractC0795Op.m1836Y(getContext(), R.attr.colorControlIndeterminate, m1816J);
        int m1816J2 = AbstractC0795Op.m1816J(this, R.attr.colorSurface);
        int m1816J3 = AbstractC0795Op.m1816J(this, R.attr.colorOnSurface);
        AbstractC2293rB.m3952v(this, new ColorStateList(iArr, new int[]{AbstractC0795Op.m1829T(m1816J2, m1816J3, 0.38f), AbstractC0795Op.m1829T(m1816J2, m1836Y, 1.0f), AbstractC0795Op.m1829T(m1816J2, m1816J, 1.0f), AbstractC0795Op.m1829T(m1816J2, m1816J3, 0.54f)}));
    }

    @Override // p000a.C2032mF, android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        boolean z2;
        if (isChecked() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        m3671v(z ? 1 : 0);
        boolean z3 = this.f9628T;
        m5139W(false, false);
        if (z3 || z2) {
            m5140o();
        }
    }

    @Override // p000a.C2032mF, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        if (this.f9628T) {
            setChecked(true);
        } else {
            super.toggle();
        }
    }

    /* renamed from: u */
    public final Boolean m5141u() {
        if (this.f9628T) {
            return null;
        }
        return Boolean.valueOf(isChecked());
    }
}
