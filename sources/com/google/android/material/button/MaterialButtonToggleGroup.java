package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C2776P;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p000a.AbstractC0095Bq;
import p000a.AbstractC0293FZ;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.AbstractC2575wW;
import p000a.C0021AO;
import p000a.C0099Bw;
import p000a.C1012T;
import p000a.C1051Th;
import p000a.C1390a3;
import p000a.C1480br;
import p000a.C2196pM;
import p000a.C2281qz;
import p000a.C2414tT;
import p000a.C2428tk;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: E */
    public static final /* synthetic */ int f9298E = 0;

    /* renamed from: I */
    public final C1051Th f9299I;

    /* renamed from: R */
    public final C2196pM f9300R;

    /* renamed from: S */
    public final ArrayList f9301S;

    /* renamed from: U */
    public HashSet f9302U;

    /* renamed from: g */
    public boolean f9303g;

    /* renamed from: k */
    public boolean f9304k;

    /* renamed from: q */
    public Integer[] f9305q;

    /* renamed from: s */
    public final int f9306s;

    /* renamed from: w */
    public final LinkedHashSet f9307w;

    /* renamed from: y */
    public final boolean f9308y;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952718), attributeSet, R.attr.materialButtonToggleGroupStyle);
        Class cls;
        this.f9301S = new ArrayList();
        this.f9300R = new C2196pM(this);
        this.f9307w = new LinkedHashSet();
        this.f9299I = new C1051Th(1, this);
        this.f9304k = false;
        this.f9302U = new HashSet();
        TypedArray m1817K = AbstractC0795Op.m1817K(getContext(), attributeSet, AbstractC0863Q8.f2942q, R.attr.materialButtonToggleGroupStyle, 2131952718, new int[0]);
        boolean z = m1817K.getBoolean(3, false);
        if (this.f9303g != z) {
            this.f9303g = z;
            m5030N(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            if (this.f9303g) {
                cls = RadioButton.class;
            } else {
                cls = ToggleButton.class;
            }
            m5034v(i).f9288U = cls.getName();
        }
        this.f9306s = m1817K.getResourceId(1, -1);
        this.f9308y = m1817K.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(m1817K.getBoolean(0, true));
        m1817K.recycle();
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4123g(this, 1);
    }

    /* renamed from: N */
    public final void m5030N(Set set) {
        HashSet hashSet = this.f9302U;
        this.f9302U = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = m5034v(i).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f9304k = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f9304k = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f9307w.iterator();
                while (it.hasNext()) {
                    ((C2776P) it.next()).m5116z();
                }
            }
        }
        invalidate();
    }

    /* renamed from: P */
    public final boolean m5031P(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: Q */
    public final void m5032Q() {
        int i;
        boolean z;
        C1390a3 c1390a3;
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 < childCount2) {
                if (m5031P(i2)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        int childCount3 = getChildCount() - 1;
        while (true) {
            if (childCount3 < 0) {
                break;
            }
            if (m5031P(childCount3)) {
                i = childCount3;
                break;
            }
            childCount3--;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            MaterialButton m5034v = m5034v(i3);
            if (m5034v.getVisibility() != 8) {
                if (m5034v.m5029v()) {
                    C0099Bw c0099Bw = m5034v.f9286I.f7441h;
                    c0099Bw.getClass();
                    C0021AO c0021ao = new C0021AO(c0099Bw);
                    C1390a3 c1390a32 = (C1390a3) this.f9301S.get(i3);
                    if (i2 != i) {
                        if (getOrientation() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C1012T c1012t = C1390a3.f4327N;
                        if (i3 == i2) {
                            if (z) {
                                if (AbstractC0795Op.m1842d(this)) {
                                    c1390a3 = new C1390a3(c1012t, c1012t, c1390a32.f4329h, c1390a32.f4330v);
                                } else {
                                    c1390a3 = new C1390a3(c1390a32.f4331z, c1390a32.f4328P, c1012t, c1012t);
                                }
                            } else {
                                c1390a3 = new C1390a3(c1390a32.f4331z, c1012t, c1390a32.f4329h, c1012t);
                            }
                        } else if (i3 == i) {
                            if (z) {
                                if (AbstractC0795Op.m1842d(this)) {
                                    c1390a3 = new C1390a3(c1390a32.f4331z, c1390a32.f4328P, c1012t, c1012t);
                                } else {
                                    c1390a3 = new C1390a3(c1012t, c1012t, c1390a32.f4329h, c1390a32.f4330v);
                                }
                            } else {
                                c1390a3 = new C1390a3(c1012t, c1390a32.f4328P, c1012t, c1390a32.f4330v);
                            }
                        } else {
                            c1390a32 = null;
                        }
                        c1390a32 = c1390a3;
                    }
                    if (c1390a32 == null) {
                        c0021ao.f130N = new C1012T(0.0f);
                        c0021ao.f132Q = new C1012T(0.0f);
                        c0021ao.f137u = new C1012T(0.0f);
                        c0021ao.f136o = new C1012T(0.0f);
                    } else {
                        c0021ao.f130N = c1390a32.f4331z;
                        c0021ao.f136o = c1390a32.f4328P;
                        c0021ao.f132Q = c1390a32.f4329h;
                        c0021ao.f137u = c1390a32.f4330v;
                    }
                    m5034v.mo3137h(new C0099Bw(c0021ao));
                } else {
                    throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            materialButton.setId(AbstractC0095Bq.m206z());
        }
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        boolean m5029v = materialButton.m5029v();
        C2428tk c2428tk = materialButton.f9286I;
        if (m5029v) {
            c2428tk.f7447w = true;
        }
        materialButton.f9293k = this.f9300R;
        int i3 = 0;
        if (materialButton.m5029v()) {
            c2428tk.f7438S = true;
            C2281qz m4176h = c2428tk.m4176h(false);
            C2281qz m4176h2 = c2428tk.m4176h(true);
            if (m4176h != null) {
                float f = c2428tk.f7445u;
                ColorStateList colorStateList = c2428tk.f7431G;
                m4176h.f7021S.f4598M = f;
                m4176h.invalidateSelf();
                C1480br c1480br = m4176h.f7021S;
                if (c1480br.f4600P != colorStateList) {
                    c1480br.f4600P = colorStateList;
                    m4176h.onStateChange(m4176h.getState());
                }
                if (m4176h2 != null) {
                    float f2 = c2428tk.f7445u;
                    if (c2428tk.f7438S) {
                        i2 = AbstractC0795Op.m1816J(c2428tk.f7448z, R.attr.colorSurface);
                    } else {
                        i2 = 0;
                    }
                    m4176h2.f7021S.f4598M = f2;
                    m4176h2.invalidateSelf();
                    ColorStateList valueOf = ColorStateList.valueOf(i2);
                    C1480br c1480br2 = m4176h2.f7021S;
                    if (c1480br2.f4600P != valueOf) {
                        c1480br2.f4600P = valueOf;
                        m4176h2.onStateChange(m4176h2.getState());
                    }
                }
            }
        }
        m5033h(materialButton.getId(), materialButton.isChecked());
        if (materialButton.m5029v()) {
            C0099Bw c0099Bw = c2428tk.f7441h;
            this.f9301S.add(new C1390a3(c0099Bw.f372N, c0099Bw.f378o, c0099Bw.f374Q, c0099Bw.f379u));
            materialButton.setEnabled(isEnabled());
            AbstractC2446u3.m4221V(materialButton, new C2414tT(i3, this));
            return;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f9299I);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m5034v(i), Integer.valueOf(i));
        }
        this.f9305q = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f9305q;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    /* renamed from: h */
    public final void m5033h(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f9302U);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f9303g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f9308y || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m5030N(hashSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f9306s;
        if (i != -1) {
            m5030N(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && m5031P(i3)) {
                i2++;
            }
        }
        if (this.f9303g) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, i2, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m5032Q();
        m5035z();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).f9293k = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f9301S.remove(indexOfChild);
        }
        m5032Q();
        m5035z();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            m5034v(i).setEnabled(z);
        }
    }

    /* renamed from: v */
    public final MaterialButton m5034v(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: z */
    public final void m5035z() {
        int i;
        int i2;
        LinearLayout.LayoutParams layoutParams;
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 < childCount) {
                if (m5031P(i3)) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            return;
        }
        for (int i4 = i3 + 1; i4 < getChildCount(); i4++) {
            MaterialButton m5034v = m5034v(i4);
            MaterialButton m5034v2 = m5034v(i4 - 1);
            if (m5034v.m5029v()) {
                i = m5034v.f9286I.f7445u;
            } else {
                i = 0;
            }
            if (m5034v2.m5029v()) {
                i2 = m5034v2.f9286I.f7445u;
            } else {
                i2 = 0;
            }
            int min = Math.min(i, i2);
            ViewGroup.LayoutParams layoutParams2 = m5034v.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                AbstractC0293FZ.m614u(layoutParams, 0);
                AbstractC0293FZ.m613o(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                AbstractC0293FZ.m613o(layoutParams, 0);
            }
            m5034v.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && i3 != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) m5034v(i3).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            } else {
                AbstractC0293FZ.m614u(layoutParams3, 0);
                AbstractC0293FZ.m613o(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }
}
