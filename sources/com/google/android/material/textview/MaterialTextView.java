package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.topjohnwu.magisk.R;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC2575wW;
import p000a.C0610LT;

/* loaded from: classes.dex */
public class MaterialTextView extends C0610LT {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (AbstractC0795Op.m1807EC(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0863Q8.f2943r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int m5109k = m5109k(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(m5109k != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    m5110q(resourceId, theme);
                }
            }
        }
    }

    /* renamed from: k */
    public static int m5109k(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    /* renamed from: q */
    public final void m5110q(int i, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, AbstractC0863Q8.f2934f);
        int m5109k = m5109k(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (m5109k >= 0) {
            setLineHeight(m5109k);
        }
    }

    @Override // p000a.C0610LT, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AbstractC0795Op.m1807EC(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            m5110q(i, context.getTheme());
        }
    }
}
