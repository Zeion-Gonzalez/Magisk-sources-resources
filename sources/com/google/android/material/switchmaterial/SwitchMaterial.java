package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC0877QS;
import p000a.AbstractC1548d9;
import p000a.AbstractC2446u3;
import p000a.AbstractC2575wW;
import p000a.C1445b5;

/* loaded from: classes.dex */
public class SwitchMaterial extends AbstractC0877QS {

    /* renamed from: dx */
    public static final int[][] f9431dx = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: BO */
    public ColorStateList f9432BO;

    /* renamed from: EC */
    public final C1445b5 f9433EC;

    /* renamed from: U8 */
    public ColorStateList f9434U8;

    /* renamed from: he */
    public final boolean f9435he;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.switchStyle, 2131952712), attributeSet);
        Context context2 = getContext();
        this.f9433EC = new C1445b5(context2);
        TypedArray m1817K = AbstractC0795Op.m1817K(context2, attributeSet, AbstractC0863Q8.f2912C, R.attr.switchStyle, 2131952712, new int[0]);
        this.f9435he = m1817K.getBoolean(0, false);
        m1817K.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int[][] iArr = f9431dx;
        boolean z = this.f9435he;
        if (z && this.f3001R == null) {
            if (this.f9434U8 == null) {
                int m1816J = AbstractC0795Op.m1816J(this, R.attr.colorSurface);
                int m1816J2 = AbstractC0795Op.m1816J(this, R.attr.colorControlActivated);
                float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
                C1445b5 c1445b5 = this.f9433EC;
                if (c1445b5.f4525z) {
                    float f = 0.0f;
                    for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                        f += AbstractC1548d9.m3005W((View) parent);
                    }
                    dimension += f;
                }
                int m2865z = c1445b5.m2865z(m1816J, dimension);
                this.f9434U8 = new ColorStateList(iArr, new int[]{AbstractC0795Op.m1829T(m1816J, m1816J2, 1.0f), m2865z, AbstractC0795Op.m1829T(m1816J, m1816J2, 0.38f), m2865z});
            }
            this.f3001R = this.f9434U8;
            this.f2996I = true;
            m2025z();
        }
        if (z && this.f3011g == null) {
            if (this.f9432BO == null) {
                int m1816J3 = AbstractC0795Op.m1816J(this, R.attr.colorSurface);
                int m1816J4 = AbstractC0795Op.m1816J(this, R.attr.colorControlActivated);
                int m1816J5 = AbstractC0795Op.m1816J(this, R.attr.colorOnSurface);
                this.f9432BO = new ColorStateList(iArr, new int[]{AbstractC0795Op.m1829T(m1816J3, m1816J4, 0.54f), AbstractC0795Op.m1829T(m1816J3, m1816J5, 0.32f), AbstractC0795Op.m1829T(m1816J3, m1816J4, 0.12f), AbstractC0795Op.m1829T(m1816J3, m1816J5, 0.12f)});
            }
            this.f3011g = this.f9432BO;
            this.f3025s = true;
            m2023h();
        }
    }
}
