package com.topjohnwu.magisk.p001ui.log;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC2760z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.p001ui.MainActivity;
import p000a.AbstractActivityC1957kp;
import p000a.AbstractC0017AI;
import p000a.AbstractC0293FZ;
import p000a.AbstractC0438II;
import p000a.AbstractC0795Op;
import p000a.AbstractC1288Y7;
import p000a.AbstractC1685fh;
import p000a.AbstractC1890ja;
import p000a.AbstractC2437tv;
import p000a.AbstractC2575wW;
import p000a.AbstractC2615xD;
import p000a.C0024AR;
import p000a.C0046Aw;
import p000a.C0908R7;
import p000a.C1372Zg;
import p000a.C1688fk;
import p000a.C2174oz;
import p000a.C2416tW;
import p000a.C2670yQ;
import p000a.C2716zG;
import p000a.EnumC0511Je;
import p000a.InterfaceC1503cL;
import p000a.InterfaceC1841if;
import p000a.ViewOnClickListenerC0435IF;

/* loaded from: classes.dex */
public final class LogFragment extends AbstractC1890ja<AbstractC1288Y7> implements InterfaceC1503cL {

    /* renamed from: he */
    public static final /* synthetic */ int f9609he = 0;

    /* renamed from: BO */
    public MenuItem f9610BO;

    /* renamed from: EC */
    public final int f9611EC = R.layout.fragment_log_md2;

    /* renamed from: U8 */
    public final InterfaceC1841if f9612U8;

    public LogFragment() {
        int i = EnumC0511Je.f1697S;
        this.f9612U8 = AbstractC0438II.m1020Z(new C0908R7(this, 5));
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: D */
    public final int mo3512D() {
        return this.f9611EC;
    }

    /* renamed from: HL */
    public final void m5137HL(boolean z) {
        float f;
        int i;
        boolean z2;
        float f2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        boolean z3;
        CircularRevealCardView circularRevealCardView = ((AbstractC1288Y7) m3513K()).f4128j;
        FloatingActionButton floatingActionButton = ((AbstractC1288Y7) m3513K()).f4126d;
        boolean z4 = !z;
        circularRevealCardView.m5049P(AbstractC0795Op.m1874w(circularRevealCardView, z4));
        C2716zG m1874w = AbstractC0795Op.m1874w(circularRevealCardView, z);
        AnimatorSet m1833V = AbstractC0795Op.m1833V(circularRevealCardView, m1874w.f8548z, m1874w.f8546h, m1874w.f8547v);
        m1833V.addListener(new C0046Aw(m1874w, circularRevealCardView, circularRevealCardView, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new C2174oz());
        animatorSet.addListener(new C0046Aw(m1874w, floatingActionButton, floatingActionButton, 0));
        if (TextUtils.getLayoutDirectionFromLocale(AbstractC1685fh.f5274z) == 1) {
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        float f3 = m1874w.f8548z;
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = AbstractC0293FZ.m612h((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            i = 0;
        }
        float measuredWidth = (f3 - i) - (floatingActionButton.getMeasuredWidth() / 2.0f);
        float f4 = 0.0f;
        if (m1874w.f8547v == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = measuredWidth * f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_X, f2);
        float f5 = m1874w.f8546h;
        ViewGroup.LayoutParams layoutParams2 = floatingActionButton.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.bottomMargin;
        } else {
            i2 = 0;
        }
        float measuredHeight = (f5 - i2) - (floatingActionButton.getMeasuredHeight() / 2.0f);
        if (m1874w.f8547v == 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            f4 = -measuredHeight;
        }
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Y, f4));
        AnimatorSet animatorSet2 = new AnimatorSet();
        if (z) {
            animatorSet2.play(m1833V).after(animatorSet);
        } else {
            animatorSet2.play(animatorSet).after(m1833V);
        }
        animatorSet2.start();
        MenuItem menuItem = this.f9610BO;
        if (menuItem != null) {
            menuItem.setVisible(z4);
        }
        MainActivity mainActivity = (MainActivity) m3511B();
        ((AbstractC2437tv) mainActivity.m1924k()).f7463L.invalidate();
        MainActivity.m5134Y(mainActivity, z, false, 2);
        mainActivity.m5135J(z);
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: N */
    public final boolean mo2519N(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC1841if interfaceC1841if = this.f9612U8;
        if (itemId != R.id.action_clear) {
            if (itemId == R.id.action_save) {
                C1688fk c1688fk = (C1688fk) interfaceC1841if.getValue();
                c1688fk.getClass();
                c1688fk.m4501w("android.permission.WRITE_EXTERNAL_STORAGE", new C1372Zg(c1688fk, 7, c1688fk));
                return false;
            }
            return false;
        }
        int i = 3;
        if (!m5138qn()) {
            C1688fk c1688fk2 = (C1688fk) interfaceC1841if.getValue();
            c1688fk2.getClass();
            C2670yQ c2670yQ = new C2670yQ(9, c1688fk2);
            c1688fk2.f5291g.getClass();
            AbstractC0017AI.m44z("echo -n > /cache/magisk.log").m4631d2(new C0024AR(i, c2670yQ));
            return false;
        }
        C1688fk c1688fk3 = (C1688fk) interfaceC1841if.getValue();
        c1688fk3.getClass();
        AbstractC0438II.m994F(AbstractC2575wW.m4424d(c1688fk3), null, new C2416tW(c1688fk3, null), 3);
        return false;
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: P */
    public final /* synthetic */ void mo2520P(Menu menu) {
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: Q */
    public final /* synthetic */ void mo2521Q(Menu menu) {
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: Yd */
    public final /* bridge */ /* synthetic */ void mo3515Yd(AbstractC2760z abstractC2760z) {
        AbstractC1288Y7 abstractC1288Y7 = (AbstractC1288Y7) abstractC2760z;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        super.mo285Z();
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B != null) {
            m3511B.setTitle(R.string.logs);
        }
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: b */
    public final boolean mo3516b() {
        if (!(((AbstractC1288Y7) m3513K()).f4128j.getVisibility() == 0)) {
            return false;
        }
        m5137HL(false);
        return true;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: j */
    public final void mo3517j(View view, Bundle bundle) {
        super.mo3517j(view, bundle);
        ((AbstractC1288Y7) m3513K()).f4126d.setOnClickListener(new ViewOnClickListenerC0435IF(4, this));
        RecyclerView recyclerView = ((AbstractC1288Y7) m3513K()).f4127i.f911j;
        AbstractC0438II.m1007P(recyclerView, 0, 7);
        AbstractC0438II.m1005N(recyclerView);
        AbstractC0438II.m1045s(recyclerView);
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: l */
    public final View mo3518l() {
        if (m5138qn()) {
            return ((AbstractC1288Y7) m3513K()).f4127i.f909L;
        }
        return null;
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: m */
    public final View mo3519m() {
        return ((AbstractC1288Y7) m3513K()).f4126d;
    }

    /* renamed from: qn */
    public final boolean m5138qn() {
        return ((AbstractC1288Y7) m3513K()).f4128j.getVisibility() == 0;
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: v */
    public final void mo2522v(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_log_md2, menu);
        MenuItem findItem = menu.findItem(R.id.action_save);
        if (findItem != null) {
            findItem.setVisible(!m5138qn());
        } else {
            findItem = null;
        }
        this.f9610BO = findItem;
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C1688fk) this.f9612U8.getValue();
    }
}
