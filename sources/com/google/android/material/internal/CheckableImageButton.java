package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.topjohnwu.magisk.R;
import p000a.AbstractC2446u3;
import p000a.C2142oP;
import p000a.C2414tT;
import p000a.C2543vs;

/* loaded from: classes.dex */
public class CheckableImageButton extends C2543vs implements Checkable {

    /* renamed from: g */
    public static final int[] f9379g = {16842912};

    /* renamed from: I */
    public boolean f9380I;

    /* renamed from: k */
    public boolean f9381k;

    /* renamed from: q */
    public boolean f9382q;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f9382q = true;
        this.f9381k = true;
        AbstractC2446u3.m4221V(this, new C2414tT(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9380I;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f9380I ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f9379g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2142oP)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2142oP c2142oP = (C2142oP) parcelable;
        super.onRestoreInstanceState(c2142oP.f8021S);
        setChecked(c2142oP.f6592w);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2142oP c2142oP = new C2142oP(super.onSaveInstanceState());
        c2142oP.f6592w = this.f9380I;
        return c2142oP;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.f9382q || this.f9380I == z) {
            return;
        }
        this.f9380I = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.f9381k) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f9380I);
    }
}
