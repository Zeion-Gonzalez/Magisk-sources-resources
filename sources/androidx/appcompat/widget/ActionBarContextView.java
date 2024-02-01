package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0483J5;
import p000a.AbstractC1586ds;
import p000a.AbstractC1843ih;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C0278FI;
import p000a.C0747O;
import p000a.C0831PV;
import p000a.C2189pE;
import p000a.C2192pI;
import p000a.C2196pM;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: C */
    public boolean f8709C;

    /* renamed from: E */
    public View f8710E;

    /* renamed from: F */
    public final int f8711F;

    /* renamed from: H */
    public TextView f8712H;

    /* renamed from: I */
    public C2192pI f8713I;

    /* renamed from: J */
    public LinearLayout f8714J;

    /* renamed from: R */
    public final Context f8715R;

    /* renamed from: S */
    public final C0747O f8716S;

    /* renamed from: U */
    public CharSequence f8717U;

    /* renamed from: c */
    public TextView f8718c;

    /* renamed from: e */
    public final int f8719e;

    /* renamed from: f */
    public View f8720f;

    /* renamed from: g */
    public boolean f8721g;

    /* renamed from: k */
    public C0831PV f8722k;

    /* renamed from: p */
    public final int f8723p;

    /* renamed from: q */
    public int f8724q;

    /* renamed from: r */
    public View f8725r;

    /* renamed from: s */
    public CharSequence f8726s;

    /* renamed from: w */
    public ActionMenuView f8727w;

    /* renamed from: y */
    public boolean f8728y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.f8716S = new C0747O(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f8715R = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f8715R = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0483J5.f1605P, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = AbstractC1843ih.m3431X(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4127q(this, drawable);
        this.f8719e = obtainStyledAttributes.getResourceId(5, 0);
        this.f8711F = obtainStyledAttributes.getResourceId(4, 0);
        this.f8724q = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f8723p = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: G */
    public static int m4699G(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: Q */
    public static int m4700Q(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    /* renamed from: M */
    public final void m4703M(View view) {
        LinearLayout linearLayout;
        View view2 = this.f8725r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8725r = view;
        if (view != null && (linearLayout = this.f8714J) != null) {
            removeView(linearLayout);
            this.f8714J = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: N */
    public final void m4704N() {
        removeAllViews();
        this.f8725r = null;
        this.f8727w = null;
        this.f8713I = null;
        View view = this.f8720f;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: P */
    public final void m4705P() {
        if (this.f8714J == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f8714J = linearLayout;
            this.f8718c = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f8712H = (TextView) this.f8714J.findViewById(R.id.action_bar_subtitle);
            int i = this.f8719e;
            if (i != 0) {
                this.f8718c.setTextAppearance(getContext(), i);
            }
            int i2 = this.f8711F;
            if (i2 != 0) {
                this.f8712H.setTextAppearance(getContext(), i2);
            }
        }
        this.f8718c.setText(this.f8726s);
        this.f8712H.setText(this.f8717U);
        boolean z = !TextUtils.isEmpty(this.f8726s);
        boolean z2 = !TextUtils.isEmpty(this.f8717U);
        int i3 = 0;
        this.f8712H.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f8714J;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.f8714J.getParent() == null) {
            addView(this.f8714J);
        }
    }

    /* renamed from: S */
    public final C0831PV m4706S(int i, long j) {
        C0831PV c0831pv = this.f8722k;
        if (c0831pv != null) {
            c0831pv.m1935h();
        }
        C0747O c0747o = this.f8716S;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0831PV m4227z = AbstractC2446u3.m4227z(this);
            m4227z.m1937z(1.0f);
            m4227z.m1936v(j);
            c0747o.f2551v.f8722k = m4227z;
            c0747o.f2550h = i;
            m4227z.m1934P(c0747o);
            return m4227z;
        }
        C0831PV m4227z2 = AbstractC2446u3.m4227z(this);
        m4227z2.m1937z(0.0f);
        m4227z2.m1936v(j);
        c0747o.f2551v.f8722k = m4227z2;
        c0747o.f2550h = i;
        m4227z2.m1934P(c0747o);
        return m4227z2;
    }

    @Override // android.view.View
    /* renamed from: V */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0831PV c0831pv = this.f8722k;
            if (c0831pv != null) {
                c0831pv.m1935h();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.View
    /* renamed from: W */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8721g = false;
        }
        if (!this.f8721g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f8721g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8721g = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    /* renamed from: o */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8728y = false;
        }
        if (!this.f8728y) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f8728y = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8728y = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2192pI c2192pI = this.f8713I;
        if (c2192pI != null) {
            c2192pI.m3807Q();
            C0278FI c0278fi = this.f8713I.f6736X;
            if (c0278fi != null && c0278fi.m1773h()) {
                c0278fi.f2605G.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m3062z = AbstractC1586ds.m3062z(this);
        int paddingRight = m3062z ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f8710E;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8710E.getLayoutParams();
            int i5 = m3062z ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m3062z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = m3062z ? paddingRight - i5 : paddingRight + i5;
            int m4699G = m4699G(i7, paddingTop, paddingTop2, this.f8710E, m3062z) + i7;
            paddingRight = m3062z ? m4699G - i6 : m4699G + i6;
        }
        LinearLayout linearLayout = this.f8714J;
        if (linearLayout != null && this.f8725r == null && linearLayout.getVisibility() != 8) {
            paddingRight += m4699G(paddingRight, paddingTop, paddingTop2, this.f8714J, m3062z);
        }
        View view2 = this.f8725r;
        if (view2 != null) {
            m4699G(paddingRight, paddingTop, paddingTop2, view2, m3062z);
        }
        int paddingLeft = m3062z ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8727w;
        if (actionMenuView != null) {
            m4699G(paddingLeft, paddingTop, paddingTop2, actionMenuView, !m3062z);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f8724q;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f8710E;
        if (view != null) {
            int m4700Q = m4700Q(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8710E.getLayoutParams();
            paddingLeft = m4700Q - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8727w;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m4700Q(this.f8727w, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f8714J;
        if (linearLayout != null && this.f8725r == null) {
            if (this.f8709C) {
                this.f8714J.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f8714J.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f8714J.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m4700Q(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f8725r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.f8725r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f8724q <= 0) {
            int childCount = getChildCount();
            i3 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    /* renamed from: u */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0483J5.f1626z, R.attr.actionBarStyle, 0);
        this.f8724q = obtainStyledAttributes.getLayoutDimension(13, 0);
        obtainStyledAttributes.recycle();
        C2192pI c2192pI = this.f8713I;
        if (c2192pI != null) {
            c2192pI.f6732J = new C2196pM(2, c2192pI.f6733R).m3820s();
            C2189pE c2189pE = c2192pI.f6748w;
            if (c2189pE != null) {
                c2189pE.m3793I(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4711v(p000a.AbstractC0336GR r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f8710E
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f8723p
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f8710E = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r6.f8710E
        L1e:
            r6.addView(r0)
        L21:
            android.view.View r0 = r6.f8710E
            r2 = 2131296328(0x7f090048, float:1.821057E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.f8720f = r0
            a.Ks r2 = new a.Ks
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            a.pE r7 = r7.mo743v()
            a.pI r0 = r6.f8713I
            if (r0 == 0) goto L4e
            r0.m3807Q()
            a.FI r0 = r0.f6736X
            if (r0 == 0) goto L4e
            boolean r2 = r0.m1773h()
            if (r2 == 0) goto L4e
            a.Va r0 = r0.f2605G
            r0.dismiss()
        L4e:
            a.pI r0 = new a.pI
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f8713I = r0
            r2 = 1
            r0.f6728E = r2
            r0.f6741f = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            a.pI r3 = r6.f8713I
            android.content.Context r4 = r6.f8715R
            r7.m3798h(r3, r4)
            a.pI r7 = r6.f8713I
            a.C6 r3 = r7.f6749y
            if (r3 != 0) goto L86
            android.view.LayoutInflater r4 = r7.f6731I
            int r5 = r7.f6743k
            android.view.View r1 = r4.inflate(r5, r6, r1)
            a.C6 r1 = (p000a.InterfaceC0108C6) r1
            r7.f6749y = r1
            a.pE r4 = r7.f6748w
            r1.mo232N(r4)
            r7.mo221S(r2)
        L86:
            a.C6 r1 = r7.f6749y
            if (r3 == r1) goto L95
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.f8767p = r7
            r7.f6749y = r2
            a.pE r7 = r7.f6748w
            r2.f8759H = r7
        L95:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f8727w = r1
            java.util.WeakHashMap r7 = p000a.AbstractC2446u3.f7488z
            r7 = 0
            p000a.AbstractC2397t8.m4127q(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f8727w
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m4711v(a.GR):void");
    }
}
