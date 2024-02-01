package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.topjohnwu.magisk.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* renamed from: a.lY */
/* loaded from: classes.dex */
public final class C1997lY extends LinearLayout {

    /* renamed from: j */
    public static final /* synthetic */ int f6185j = 0;

    /* renamed from: C */
    public InterfaceC1542d3 f6186C;

    /* renamed from: E */
    public PorterDuff.Mode f6187E;

    /* renamed from: F */
    public final AccessibilityManager f6188F;

    /* renamed from: H */
    public boolean f6189H;

    /* renamed from: I */
    public ColorStateList f6190I;

    /* renamed from: J */
    public CharSequence f6191J;

    /* renamed from: R */
    public final FrameLayout f6192R;

    /* renamed from: S */
    public final TextInputLayout f6193S;

    /* renamed from: U */
    public ColorStateList f6194U;

    /* renamed from: c */
    public final C0610LT f6195c;

    /* renamed from: e */
    public EditText f6196e;

    /* renamed from: f */
    public int f6197f;

    /* renamed from: g */
    public final C0378HD f6198g;

    /* renamed from: k */
    public final CheckableImageButton f6199k;

    /* renamed from: p */
    public final C1652f3 f6200p;

    /* renamed from: q */
    public PorterDuff.Mode f6201q;

    /* renamed from: r */
    public View.OnLongClickListener f6202r;

    /* renamed from: s */
    public final LinkedHashSet f6203s;

    /* renamed from: w */
    public final CheckableImageButton f6204w;

    /* renamed from: y */
    public int f6205y;

    public C1997lY(TextInputLayout textInputLayout, C2709z9 c2709z9) {
        super(textInputLayout.getContext());
        CharSequence m4641M;
        this.f6205y = 0;
        this.f6203s = new LinkedHashSet();
        this.f6200p = new C1652f3(this);
        C1194WK c1194wk = new C1194WK(this);
        this.f6188F = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f6193S = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6192R = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m3622z = m3622z(this, from, R.id.text_input_error_icon);
        this.f6204w = m3622z;
        CheckableImageButton m3622z2 = m3622z(frameLayout, from, R.id.text_input_end_icon);
        this.f6199k = m3622z2;
        this.f6198g = new C0378HD(this, c2709z9);
        C0610LT c0610lt = new C0610LT(getContext(), null);
        this.f6195c = c0610lt;
        if (c2709z9.m4645V(38)) {
            this.f6190I = AbstractC0795Op.m1841c(getContext(), c2709z9, 38);
        }
        if (c2709z9.m4645V(39)) {
            this.f6201q = AbstractC0795Op.m1856m(c2709z9.m4648o(39, -1), null);
        }
        if (c2709z9.m4645V(37)) {
            m3622z.setImageDrawable(c2709z9.m4642N(37));
            m3611M();
            AbstractC0795Op.m1850h(textInputLayout, m3622z, this.f6190I, this.f6201q);
        }
        m3622z.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4123g(m3622z, 2);
        m3622z.setClickable(false);
        m3622z.f9381k = false;
        m3622z.setFocusable(false);
        if (!c2709z9.m4645V(53)) {
            if (c2709z9.m4645V(32)) {
                this.f6194U = AbstractC0795Op.m1841c(getContext(), c2709z9, 32);
            }
            if (c2709z9.m4645V(33)) {
                this.f6187E = AbstractC0795Op.m1856m(c2709z9.m4648o(33, -1), null);
            }
        }
        if (c2709z9.m4645V(30)) {
            m3620u(c2709z9.m4648o(30, 0));
            if (c2709z9.m4645V(27) && m3622z2.getContentDescription() != (m4641M = c2709z9.m4641M(27))) {
                m3622z2.setContentDescription(m4641M);
            }
            boolean m4652z = c2709z9.m4652z(26, true);
            if (m3622z2.f9382q != m4652z) {
                m3622z2.f9382q = m4652z;
                m3622z2.sendAccessibilityEvent(0);
            }
        } else if (c2709z9.m4645V(53)) {
            if (c2709z9.m4645V(54)) {
                this.f6194U = AbstractC0795Op.m1841c(getContext(), c2709z9, 54);
            }
            if (c2709z9.m4645V(55)) {
                this.f6187E = AbstractC0795Op.m1856m(c2709z9.m4648o(55, -1), null);
            }
            m3620u(c2709z9.m4652z(53, false) ? 1 : 0);
            CharSequence m4641M2 = c2709z9.m4641M(51);
            if (m3622z2.getContentDescription() != m4641M2) {
                m3622z2.setContentDescription(m4641M2);
            }
        }
        int m4643P = c2709z9.m4643P(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (m4643P >= 0) {
            if (m4643P != this.f6197f) {
                this.f6197f = m4643P;
                m3622z2.setMinimumWidth(m4643P);
                m3622z2.setMinimumHeight(m4643P);
                m3622z.setMinimumWidth(m4643P);
                m3622z.setMinimumHeight(m4643P);
            }
            if (c2709z9.m4645V(31)) {
                ImageView.ScaleType m1820M = AbstractC0795Op.m1820M(c2709z9.m4648o(31, -1));
                m3622z2.setScaleType(m1820M);
                m3622z.setScaleType(m1820M);
            }
            c0610lt.setVisibility(8);
            c0610lt.setId(R.id.textinput_suffix_text);
            c0610lt.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            AbstractC1285Y3.m2632Q(c0610lt, 1);
            c0610lt.setTextAppearance(c2709z9.m4646W(72, 0));
            if (c2709z9.m4645V(73)) {
                c0610lt.setTextColor(c2709z9.m4647h(73));
            }
            CharSequence m4641M3 = c2709z9.m4641M(71);
            this.f6191J = TextUtils.isEmpty(m4641M3) ? null : m4641M3;
            c0610lt.setText(m4641M3);
            m3615S();
            frameLayout.addView(m3622z2);
            addView(c0610lt);
            addView(frameLayout);
            addView(m3622z);
            textInputLayout.f9462Pm.add(c1194wk);
            if (textInputLayout.f9453I != null) {
                c1194wk.m2473z(textInputLayout);
            }
            addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0173DN(2, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    /* renamed from: G */
    public final void m3610G() {
        this.f6192R.setVisibility((this.f6199k.getVisibility() != 0 || m3612N()) ? 8 : 0);
        setVisibility(m3613P() || m3612N() || !((this.f6191J == null || this.f6189H) ? true : false) ? 0 : 8);
    }

    /* renamed from: M */
    public final void m3611M() {
        boolean z;
        int i;
        CheckableImageButton checkableImageButton = this.f6204w;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z2 = true;
        TextInputLayout textInputLayout = this.f6193S;
        if (drawable != null && textInputLayout.f9469U.f1508q && textInputLayout.m5101q()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        m3610G();
        m3616V();
        if (this.f6205y == 0) {
            z2 = false;
        }
        if (!z2) {
            textInputLayout.m5103s();
        }
    }

    /* renamed from: N */
    public final boolean m3612N() {
        return this.f6204w.getVisibility() == 0;
    }

    /* renamed from: P */
    public final boolean m3613P() {
        return this.f6192R.getVisibility() == 0 && this.f6199k.getVisibility() == 0;
    }

    /* renamed from: Q */
    public final void m3614Q(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        AbstractC0663MY m3618h = m3618h();
        boolean mo617M = m3618h.mo617M();
        boolean z3 = true;
        CheckableImageButton checkableImageButton = this.f6199k;
        if (mo617M && (isChecked = checkableImageButton.isChecked()) != m3618h.mo621V()) {
            checkableImageButton.setChecked(!isChecked);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((m3618h instanceof C1132VC) && (isActivated = checkableImageButton.isActivated()) != m3618h.mo1471G()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z3 = z2;
        }
        if (z || z3) {
            AbstractC0795Op.m1879zx(this.f6193S, checkableImageButton, this.f6194U);
        }
    }

    /* renamed from: S */
    public final void m3615S() {
        C0610LT c0610lt = this.f6195c;
        int visibility = c0610lt.getVisibility();
        int i = (this.f6191J == null || this.f6189H) ? 8 : 0;
        if (visibility != i) {
            m3618h().mo1472I(i == 0);
        }
        m3610G();
        c0610lt.setVisibility(i);
        this.f6193S.m5103s();
    }

    /* renamed from: V */
    public final void m3616V() {
        int i;
        TextInputLayout textInputLayout = this.f6193S;
        if (textInputLayout.f9453I == null) {
            return;
        }
        if (!m3613P() && !m3612N()) {
            EditText editText = textInputLayout.f9453I;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            i = AbstractC0095Bq.m198N(editText);
        } else {
            i = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f9453I.getPaddingTop();
        int paddingBottom = textInputLayout.f9453I.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
        AbstractC0095Bq.m197M(this.f6195c, dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    /* renamed from: W */
    public final void m3617W(AbstractC0663MY abstractC0663MY) {
        if (this.f6196e == null) {
            return;
        }
        if (abstractC0663MY.mo1473N() != null) {
            this.f6196e.setOnFocusChangeListener(abstractC0663MY.mo1473N());
        }
        if (abstractC0663MY.mo1478u() != null) {
            this.f6199k.setOnFocusChangeListener(abstractC0663MY.mo1478u());
        }
    }

    /* renamed from: h */
    public final AbstractC0663MY m3618h() {
        int i = this.f6205y;
        C0378HD c0378hd = this.f6198g;
        SparseArray sparseArray = (SparseArray) c0378hd.f1294v;
        AbstractC0663MY abstractC0663MY = (AbstractC0663MY) sparseArray.get(i);
        if (abstractC0663MY == null) {
            if (i != -1) {
                int i2 = 1;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                abstractC0663MY = new C1132VC((C1997lY) c0378hd.f1292P);
                            } else {
                                throw new IllegalArgumentException(AbstractC2441tz.m4188N("Invalid end icon mode: ", i));
                            }
                        } else {
                            abstractC0663MY = new C1884jU((C1997lY) c0378hd.f1292P);
                        }
                    } else {
                        abstractC0663MY = new C0294Fb((C1997lY) c0378hd.f1292P, c0378hd.f1293h);
                    }
                } else {
                    abstractC0663MY = new C0208Dz((C1997lY) c0378hd.f1292P, i2);
                }
            } else {
                abstractC0663MY = new C0208Dz((C1997lY) c0378hd.f1292P, 0);
            }
            sparseArray.append(i, abstractC0663MY);
        }
        return abstractC0663MY;
    }

    /* renamed from: o */
    public final void m3619o(boolean z) {
        if (m3613P() != z) {
            this.f6199k.setVisibility(z ? 0 : 8);
            m3610G();
            m3616V();
            this.f6193S.m5103s();
        }
    }

    /* renamed from: u */
    public final void m3620u(int i) {
        boolean z;
        Drawable drawable;
        if (this.f6205y == i) {
            return;
        }
        AbstractC0663MY m3618h = m3618h();
        InterfaceC1542d3 interfaceC1542d3 = this.f6186C;
        AccessibilityManager accessibilityManager = this.f6188F;
        if (interfaceC1542d3 != null && accessibilityManager != null) {
            AbstractC2080nB.m3696h(accessibilityManager, interfaceC1542d3);
        }
        CharSequence charSequence = null;
        this.f6186C = null;
        m3618h.mo622g();
        this.f6205y = i;
        Iterator it = this.f6203s.iterator();
        if (!it.hasNext()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            m3619o(z);
            AbstractC0663MY m3618h2 = m3618h();
            int i2 = this.f6198g.f1295z;
            if (i2 == 0) {
                i2 = m3618h2.mo618P();
            }
            if (i2 != 0) {
                drawable = AbstractC1843ih.m3431X(getContext(), i2);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f6199k;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f6193S;
            if (drawable != null) {
                AbstractC0795Op.m1850h(textInputLayout, checkableImageButton, this.f6194U, this.f6187E);
                AbstractC0795Op.m1879zx(textInputLayout, checkableImageButton, this.f6194U);
            }
            int mo624v = m3618h2.mo624v();
            if (mo624v != 0) {
                charSequence = getResources().getText(mo624v);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            boolean mo617M = m3618h2.mo617M();
            if (checkableImageButton.f9382q != mo617M) {
                checkableImageButton.f9382q = mo617M;
                checkableImageButton.sendAccessibilityEvent(0);
            }
            if (m3618h2.mo1475W(textInputLayout.f9496nF)) {
                m3618h2.mo415k();
                InterfaceC1542d3 mo1476o = m3618h2.mo1476o();
                this.f6186C = mo1476o;
                if (mo1476o != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    if (AbstractC1285Y3.m2633h(this)) {
                        AbstractC2080nB.m3697z(accessibilityManager, this.f6186C);
                    }
                }
                View.OnClickListener mo619Q = m3618h2.mo619Q();
                View.OnLongClickListener onLongClickListener = this.f6202r;
                checkableImageButton.setOnClickListener(mo619Q);
                AbstractC0795Op.m1825Pm(checkableImageButton, onLongClickListener);
                EditText editText = this.f6196e;
                if (editText != null) {
                    m3618h2.mo620S(editText);
                    m3617W(m3618h2);
                }
                AbstractC0795Op.m1850h(textInputLayout, checkableImageButton, this.f6194U, this.f6187E);
                m3614Q(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.f9496nF + " is not supported by the end icon mode " + i);
        }
        AbstractC2441tz.m4202q(it.next());
        throw null;
    }

    /* renamed from: v */
    public final int m3621v() {
        int m615v;
        if (!m3613P() && !m3612N()) {
            m615v = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f6199k;
            m615v = AbstractC0293FZ.m615v((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        return AbstractC0095Bq.m198N(this.f6195c) + AbstractC0095Bq.m198N(this) + m615v;
    }

    /* renamed from: z */
    public final CheckableImageButton m3622z(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC0795Op.m1852i(getContext())) {
            AbstractC0293FZ.m613o((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }
}
