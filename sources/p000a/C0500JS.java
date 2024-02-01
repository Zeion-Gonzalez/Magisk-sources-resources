package p000a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;

/* renamed from: a.JS */
/* loaded from: classes.dex */
public final class C0500JS extends AbstractC0081BY {

    /* renamed from: W */
    public final /* synthetic */ ExtendedFloatingActionButton f1670W;

    /* renamed from: o */
    public final boolean f1671o;

    /* renamed from: u */
    public final InterfaceC0416Hs f1672u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0500JS(ExtendedFloatingActionButton extendedFloatingActionButton, C2196pM c2196pM, InterfaceC0416Hs interfaceC0416Hs, boolean z) {
        super(extendedFloatingActionButton, c2196pM);
        this.f1670W = extendedFloatingActionButton;
        this.f1672u = interfaceC0416Hs;
        this.f1671o = z;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: N */
    public final void mo179N() {
        this.f315P.f6755R = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1670W;
        extendedFloatingActionButton.f9347B = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        InterfaceC0416Hs interfaceC0416Hs = this.f1672u;
        layoutParams.width = interfaceC0416Hs.mo931G().width;
        layoutParams.height = interfaceC0416Hs.mo931G().height;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: Q */
    public final void mo181Q(Animator animator) {
        C2196pM c2196pM = this.f315P;
        Animator animator2 = (Animator) c2196pM.f6755R;
        if (animator2 != null) {
            animator2.cancel();
        }
        c2196pM.f6755R = animator;
        boolean z = this.f1671o;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1670W;
        extendedFloatingActionButton.f9359t = z;
        extendedFloatingActionButton.f9347B = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: W */
    public final boolean mo182W() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1670W;
        if (this.f1671o != extendedFloatingActionButton.f9359t && extendedFloatingActionButton.f9296s != null && !TextUtils.isEmpty(extendedFloatingActionButton.getText())) {
            return false;
        }
        return true;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: o */
    public final void mo184o() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1670W;
        boolean z = this.f1671o;
        extendedFloatingActionButton.f9359t = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.f9348D = layoutParams.width;
            extendedFloatingActionButton.f9356m = layoutParams.height;
        }
        InterfaceC0416Hs interfaceC0416Hs = this.f1672u;
        layoutParams.width = interfaceC0416Hs.mo931G().width;
        layoutParams.height = interfaceC0416Hs.mo931G().height;
        int mo934W = interfaceC0416Hs.mo934W();
        int paddingTop = extendedFloatingActionButton.getPaddingTop();
        int mo935u = interfaceC0416Hs.mo935u();
        int paddingBottom = extendedFloatingActionButton.getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC0095Bq.m197M(extendedFloatingActionButton, mo934W, paddingTop, mo935u, paddingBottom);
        extendedFloatingActionButton.requestLayout();
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: u */
    public final void mo185u() {
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: v */
    public final int mo186v() {
        return this.f1671o ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: z */
    public final AnimatorSet mo187z() {
        float f;
        C0030Ab c0030Ab = this.f316Q;
        if (c0030Ab == null) {
            if (this.f314N == null) {
                this.f314N = C0030Ab.m67h(this.f319z, mo186v());
            }
            c0030Ab = this.f314N;
            c0030Ab.getClass();
        }
        boolean m74u = c0030Ab.m74u("width");
        InterfaceC0416Hs interfaceC0416Hs = this.f1672u;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1670W;
        if (m74u) {
            PropertyValuesHolder[] m70N = c0030Ab.m70N("width");
            m70N[0].setFloatValues(extendedFloatingActionButton.getWidth(), interfaceC0416Hs.mo932N());
            c0030Ab.m73o("width", m70N);
        }
        if (c0030Ab.m74u("height")) {
            PropertyValuesHolder[] m70N2 = c0030Ab.m70N("height");
            m70N2[0].setFloatValues(extendedFloatingActionButton.getHeight(), interfaceC0416Hs.mo933Q());
            c0030Ab.m73o("height", m70N2);
        }
        if (c0030Ab.m74u("paddingStart")) {
            PropertyValuesHolder[] m70N3 = c0030Ab.m70N("paddingStart");
            PropertyValuesHolder propertyValuesHolder = m70N3[0];
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            propertyValuesHolder.setFloatValues(AbstractC0095Bq.m200Q(extendedFloatingActionButton), interfaceC0416Hs.mo934W());
            c0030Ab.m73o("paddingStart", m70N3);
        }
        if (c0030Ab.m74u("paddingEnd")) {
            PropertyValuesHolder[] m70N4 = c0030Ab.m70N("paddingEnd");
            PropertyValuesHolder propertyValuesHolder2 = m70N4[0];
            WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
            propertyValuesHolder2.setFloatValues(AbstractC0095Bq.m198N(extendedFloatingActionButton), interfaceC0416Hs.mo935u());
            c0030Ab.m73o("paddingEnd", m70N4);
        }
        if (c0030Ab.m74u("labelOpacity")) {
            PropertyValuesHolder[] m70N5 = c0030Ab.m70N("labelOpacity");
            float f2 = 0.0f;
            boolean z = this.f1671o;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            if (z) {
                f2 = 1.0f;
            }
            m70N5[0].setFloatValues(f, f2);
            c0030Ab.m73o("labelOpacity", m70N5);
        }
        return m183h(c0030Ab);
    }
}
