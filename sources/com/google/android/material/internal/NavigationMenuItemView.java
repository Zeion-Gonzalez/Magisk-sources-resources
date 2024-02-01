package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0691N4;
import p000a.AbstractC1806i0;
import p000a.AbstractC1843ih;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C1117Uu;
import p000a.C2384ss;
import p000a.C2414tT;
import p000a.InterfaceC0157D3;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0691N4 implements InterfaceC0157D3 {

    /* renamed from: t */
    public static final int[] f9383t = {16842912};

    /* renamed from: L */
    public int f9384L;

    /* renamed from: O */
    public final CheckedTextView f9385O;

    /* renamed from: T */
    public final C2414tT f9386T;

    /* renamed from: d */
    public final boolean f9387d;

    /* renamed from: i */
    public boolean f9388i;

    /* renamed from: n */
    public FrameLayout f9389n;

    /* renamed from: x */
    public C1117Uu f9390x;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9387d = true;
        C2414tT c2414tT = new C2414tT(2, this);
        this.f9386T = c2414tT;
        if (this.f649I != 0) {
            this.f649I = 0;
            requestLayout();
        }
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f9384L = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f9385O = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC2446u3.m4221V(checkedTextView, c2414tT);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1117Uu c1117Uu = this.f9390x;
        if (c1117Uu != null && c1117Uu.isCheckable() && this.f9390x.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9383t);
        }
        return onCreateDrawableState;
    }

    @Override // p000a.InterfaceC0157D3
    /* renamed from: v */
    public final C1117Uu mo128v() {
        return this.f9390x;
    }

    @Override // p000a.InterfaceC0157D3
    /* renamed from: z */
    public final void mo131z(C1117Uu c1117Uu) {
        int i;
        int i2;
        C2384ss c2384ss;
        int i3;
        StateListDrawable stateListDrawable;
        this.f9390x = c1117Uu;
        int i4 = c1117Uu.f3653z;
        if (i4 > 0) {
            setId(i4);
        }
        if (c1117Uu.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f9383t, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4127q(this, stateListDrawable);
        }
        boolean isCheckable = c1117Uu.isCheckable();
        refreshDrawableState();
        boolean z2 = this.f9388i;
        CheckedTextView checkedTextView = this.f9385O;
        if (z2 != isCheckable) {
            this.f9388i = isCheckable;
            this.f9386T.mo3028o(checkedTextView, 2048);
        }
        boolean isChecked = c1117Uu.isChecked();
        refreshDrawableState();
        checkedTextView.setChecked(isChecked);
        Typeface typeface = checkedTextView.getTypeface();
        if (isChecked && this.f9387d) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        checkedTextView.setTypeface(typeface, i2);
        setEnabled(c1117Uu.isEnabled());
        checkedTextView.setText(c1117Uu.f3631N);
        Drawable icon = c1117Uu.getIcon();
        if (icon != null) {
            int i5 = this.f9384L;
            icon.setBounds(0, 0, i5, i5);
        }
        AbstractC1806i0.m3365N(checkedTextView, icon, null, null, null);
        View actionView = c1117Uu.getActionView();
        if (actionView != null) {
            if (this.f9389n == null) {
                this.f9389n = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f9389n.removeAllViews();
            this.f9389n.addView(actionView);
        }
        setContentDescription(c1117Uu.f3646q);
        AbstractC1843ih.m3411Ha(this, c1117Uu.f3644k);
        C1117Uu c1117Uu2 = this.f9390x;
        if (c1117Uu2.f3631N != null || c1117Uu2.getIcon() != null || this.f9390x.getActionView() == null) {
            z = false;
        }
        if (z) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f9389n;
            if (frameLayout != null) {
                c2384ss = (C2384ss) frameLayout.getLayoutParams();
                i3 = -1;
            } else {
                return;
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.f9389n;
            if (frameLayout2 != null) {
                c2384ss = (C2384ss) frameLayout2.getLayoutParams();
                i3 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) c2384ss).width = i3;
        this.f9389n.setLayoutParams(c2384ss);
    }
}
