package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.topjohnwu.magisk.R;
import java.util.Locale;

/* renamed from: a.fn */
/* loaded from: classes.dex */
public final class C1691fn extends C2492uy {

    /* renamed from: E */
    public final ColorStateList f5298E;

    /* renamed from: U */
    public final int f5299U;

    /* renamed from: g */
    public final Rect f5300g;

    /* renamed from: k */
    public final AccessibilityManager f5301k;

    /* renamed from: q */
    public final C0660MU f5302q;

    /* renamed from: s */
    public final ColorStateList f5303s;

    /* renamed from: y */
    public final float f5304y;

    public C1691fn(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f5300g = new Rect();
        Context context2 = getContext();
        TypedArray m1817K = AbstractC0795Op.m1817K(context2, attributeSet, AbstractC0863Q8.f2947w, R.attr.autoCompleteTextViewStyle, 2131952426, new int[0]);
        if (m1817K.hasValue(0) && m1817K.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = m1817K.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f5304y = m1817K.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (m1817K.hasValue(2)) {
            this.f5303s = ColorStateList.valueOf(m1817K.getColor(2, 0));
        }
        this.f5299U = m1817K.getColor(4, 0);
        this.f5298E = AbstractC0795Op.m1812H(context2, m1817K, 5);
        this.f5301k = (AccessibilityManager) context2.getSystemService("accessibility");
        C0660MU c0660mu = new C0660MU(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f5302q = c0660mu;
        c0660mu.f2127L = true;
        C1630ef c1630ef = c0660mu.f2138i;
        c1630ef.setFocusable(true);
        c0660mu.f2126J = this;
        c1630ef.setInputMethodMode(2);
        c0660mu.mo1462I(getAdapter());
        c0660mu.f2134c = new C1170Vu(this);
        if (m1817K.hasValue(6)) {
            setAdapter(new C0960S0(this, getContext(), resourceId, getResources().getStringArray(m1817K.getResourceId(6, 0))));
        }
        m1817K.recycle();
    }

    /* renamed from: z */
    public static void m3193z(C1691fn c1691fn, Object obj) {
        c1691fn.setText(c1691fn.convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z;
        AccessibilityManager accessibilityManager = this.f5301k;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5302q.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout m3194h = m3194h();
        if (m3194h != null && m3194h.f9455K) {
            if (m3194h.f9505t) {
                return m3194h.f9439B;
            }
            return null;
        }
        return super.getHint();
    }

    /* renamed from: h */
    public final TextInputLayout m3194h() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout m3194h = m3194h();
        if (m3194h != null && m3194h.f9455K && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5302q.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int selectedItemPosition;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m3194h = m3194h();
            int i3 = 0;
            if (adapter != null && m3194h != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0660MU c0660mu = this.f5302q;
                if (!c0660mu.mo399h()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c0660mu.f2145w.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, m3194h);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable m1465W = c0660mu.m1465W();
                if (m1465W != null) {
                    Rect rect = this.f5300g;
                    m1465W.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = m3194h.f9507w.f6199k.getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean z2;
        AccessibilityManager accessibilityManager = this.f5301k;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f5302q.mo1462I(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0660MU c0660mu = this.f5302q;
        if (c0660mu != null) {
            c0660mu.m1464R(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f5302q.f2124H = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout m3194h = m3194h();
        if (m3194h != null) {
            m3194h.m5082E();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z;
        AccessibilityManager accessibilityManager = this.f5301k;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5302q.mo396Q();
        } else {
            super.showDropDown();
        }
    }
}
