package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p000a.AbstractC0483J5;
import p000a.AbstractC1843ih;
import p000a.C0610LT;
import p000a.C1073U7;
import p000a.C1117Uu;
import p000a.C2255qT;
import p000a.InterfaceC0157D3;
import p000a.InterfaceC0949Rq;
import p000a.InterfaceC1653f5;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0610LT implements InterfaceC0157D3, View.OnClickListener, InterfaceC1653f5 {

    /* renamed from: E */
    public C2255qT f8671E;

    /* renamed from: H */
    public final int f8672H;

    /* renamed from: J */
    public final int f8673J;

    /* renamed from: U */
    public InterfaceC0949Rq f8674U;

    /* renamed from: c */
    public int f8675c;

    /* renamed from: f */
    public C1073U7 f8676f;

    /* renamed from: g */
    public C1117Uu f8677g;

    /* renamed from: r */
    public boolean f8678r;

    /* renamed from: s */
    public Drawable f8679s;

    /* renamed from: y */
    public CharSequence f8680y;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f8678r = m4696k();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0483J5.f1623v, 0, 0);
        this.f8673J = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f8672H = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f8675c = -1;
        setSaveEnabled(false);
    }

    @Override // p000a.InterfaceC1653f5
    /* renamed from: P */
    public final boolean mo3124P() {
        return m4697q() && this.f8677g.getIcon() == null;
    }

    /* renamed from: g */
    public final void m4695g() {
        CharSequence charSequence;
        boolean z;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f8680y);
        if (this.f8679s != null) {
            if ((this.f8677g.f3647r & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !this.f8678r) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence2 = null;
        if (z4) {
            charSequence = this.f8680y;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.f8677g.f3646q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z4) {
                charSequence3 = null;
            } else {
                charSequence3 = this.f8677g.f3631N;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.f8677g.f3644k;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z4) {
                charSequence2 = this.f8677g.f3631N;
            }
            AbstractC1843ih.m3411Ha(this, charSequence2);
            return;
        }
        AbstractC1843ih.m3411Ha(this, charSequence4);
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000a.InterfaceC1653f5
    /* renamed from: h */
    public final boolean mo3125h() {
        return m4697q();
    }

    /* renamed from: k */
    public final boolean m4696k() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0949Rq interfaceC0949Rq = this.f8674U;
        if (interfaceC0949Rq != null) {
            interfaceC0949Rq.mo2112Q(this.f8677g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8678r = m4696k();
        m4695g();
    }

    @Override // p000a.C0610LT, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean m4697q = m4697q();
        if (m4697q && (i3 = this.f8675c) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f8673J;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m4697q || this.f8679s == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f8679s.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2255qT c2255qT;
        if (this.f8677g.hasSubMenu() && (c2255qT = this.f8671E) != null && c2255qT.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: q */
    public final boolean m4697q() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f8675c = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // p000a.InterfaceC0157D3
    /* renamed from: v */
    public final C1117Uu mo128v() {
        return this.f8677g;
    }

    @Override // p000a.InterfaceC0157D3
    /* renamed from: z */
    public final void mo131z(C1117Uu c1117Uu) {
        this.f8677g = c1117Uu;
        Drawable icon = c1117Uu.getIcon();
        this.f8679s = icon;
        int i = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.f8672H;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(icon, null, null, null);
        m4695g();
        this.f8680y = c1117Uu.getTitleCondensed();
        m4695g();
        setId(c1117Uu.f3653z);
        if (!c1117Uu.isVisible()) {
            i = 8;
        }
        setVisibility(i);
        setEnabled(c1117Uu.isEnabled());
        if (c1117Uu.hasSubMenu() && this.f8671E == null) {
            this.f8671E = new C2255qT(this);
        }
    }
}
