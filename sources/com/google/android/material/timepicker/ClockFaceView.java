package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC0865QC;
import p000a.AbstractC0911RA;
import p000a.AbstractC2446u3;
import p000a.C0561KY;
import p000a.C0689N2;
import p000a.C1895jg;
import p000a.InterfaceC1291YA;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockFaceView extends AbstractC0911RA implements InterfaceC1291YA {

    /* renamed from: B */
    public final int f9515B;

    /* renamed from: C */
    public final ClockHandView f9516C;

    /* renamed from: D */
    public float f9517D;

    /* renamed from: K */
    public String[] f9518K;

    /* renamed from: L */
    public final Rect f9519L;

    /* renamed from: O */
    public final int[] f9520O;

    /* renamed from: T */
    public final int f9521T;

    /* renamed from: d */
    public final C2779v f9522d;

    /* renamed from: i */
    public final SparseArray f9523i;

    /* renamed from: j */
    public final RectF f9524j;

    /* renamed from: m */
    public final ColorStateList f9525m;

    /* renamed from: n */
    public final float[] f9526n;

    /* renamed from: p */
    public final Rect f9527p;

    /* renamed from: t */
    public final int f9528t;

    /* renamed from: x */
    public final int f9529x;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9527p = new Rect();
        this.f9524j = new RectF();
        this.f9519L = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f9523i = sparseArray;
        this.f9526n = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2940o, R.attr.materialClockStyle, 2131952778);
        Resources resources = getResources();
        ColorStateList m1812H = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 1);
        this.f9525m = m1812H;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f9516C = clockHandView;
        this.f9529x = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = m1812H.getColorForState(new int[]{16842913}, m1812H.getDefaultColor());
        this.f9520O = new int[]{colorForState, colorForState, m1812H.getDefaultColor()};
        clockHandView.f9541w.add(this);
        int defaultColor = AbstractC0865QC.m1999h(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m1812H2 = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 0);
        setBackgroundColor(m1812H2 != null ? m1812H2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2778h(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f9522d = new C2779v(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f9518K = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.f9518K.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f9518K.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f9518K[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                AbstractC2446u3.m4221V(textView, this.f9522d);
                textView.setTextColor(this.f9525m);
            }
        }
        ClockHandView clockHandView2 = this.f9516C;
        if (clockHandView2.f9532R && !z) {
            clockHandView2.f9539r = 1;
        }
        clockHandView2.f9532R = z;
        clockHandView2.invalidate();
        this.f9521T = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f9528t = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f9515B = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    /* renamed from: S */
    public final void m5112S() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z;
        RadialGradient radialGradient;
        RectF rectF2 = this.f9516C.f9536g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f9523i;
            int size = sparseArray.size();
            rectF = this.f9524j;
            rect = this.f9527p;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z = true;
                } else {
                    z = false;
                }
                textView3.setSelected(z);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f9519L);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f9520O, this.f9526n, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // p000a.AbstractC0911RA
    /* renamed from: V */
    public final void mo2065V() {
        int i;
        C0561KY c0561ky = new C0561KY();
        c0561ky.m1272h(this);
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, new ArrayList());
                }
                ((List) hashMap.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i = Math.round(this.f3121e * 0.66f);
            } else {
                i = this.f3121e;
            }
            Iterator it = list.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = c0561ky.f1832v;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C1895jg());
                }
                C0689N2 c0689n2 = ((C1895jg) hashMap2.get(Integer.valueOf(id))).f5926P;
                c0689n2.f2295Y = R.id.circle_center;
                c0689n2.f2277J = i;
                c0689n2.f2300c = f;
                f += 360.0f / list.size();
            }
        }
        c0561ky.m1273z(this);
        this.f8882U = null;
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f9523i;
            if (i4 < sparseArray.size()) {
                ((TextView) sparseArray.get(i4)).setVisibility(0);
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f9518K.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m5112S();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f9515B / Math.max(Math.max(this.f9521T / displayMetrics.heightPixels, this.f9528t / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
