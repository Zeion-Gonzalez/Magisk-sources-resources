package com.topjohnwu.magisk.p001ui.flash;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.databinding.AbstractC2760z;
import com.topjohnwu.magisk.R;
import p000a.AbstractActivityC1957kp;
import p000a.AbstractC0295Fc;
import p000a.AbstractC0438II;
import p000a.AbstractC1292YB;
import p000a.AbstractC1890ja;
import p000a.AbstractC2575wW;
import p000a.C0536K5;
import p000a.C0908R7;
import p000a.C1104Uh;
import p000a.C1219Wm;
import p000a.C1372Zg;
import p000a.C1775hO;
import p000a.C2619xH;
import p000a.C2670yQ;
import p000a.EnumC0511Je;
import p000a.InterfaceC1503cL;
import p000a.InterfaceC1841if;

/* loaded from: classes.dex */
public final class FlashFragment extends AbstractC1890ja<AbstractC0295Fc> implements InterfaceC1503cL {

    /* renamed from: he */
    public static final /* synthetic */ int f9600he = 0;

    /* renamed from: BO */
    public int f9601BO;

    /* renamed from: EC */
    public final int f9602EC = R.layout.fragment_flash_md2;

    /* renamed from: U8 */
    public final InterfaceC1841if f9603U8;

    public FlashFragment() {
        int i = EnumC0511Je.f1697S;
        this.f9603U8 = AbstractC0438II.m1020Z(new C0908R7(this, 2));
        this.f9601BO = -1;
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: D */
    public final int mo3512D() {
        return this.f9602EC;
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: J */
    public final void mo281J() {
        AbstractActivityC1957kp m3511B;
        if (this.f9601BO != -1 && (m3511B = m3511B()) != null) {
            m3511B.setRequestedOrientation(this.f9601BO);
        }
        this.f7224x = true;
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: N */
    public final boolean mo2519N(MenuItem menuItem) {
        C2619xH mo3692y = mo3692y();
        mo3692y.getClass();
        if (menuItem.getItemId() == R.id.action_save) {
            mo3692y.m4501w("android.permission.WRITE_EXTERNAL_STORAGE", new C1372Zg(mo3692y, 6, mo3692y));
            return true;
        }
        return true;
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
        AbstractC0295Fc abstractC0295Fc = (AbstractC0295Fc) abstractC2760z;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        super.mo285Z();
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B != null) {
            m3511B.setTitle(R.string.flash_screen_title);
        }
        mo3692y().f8102k.m4843N(this, new C1104Uh(4, new C2670yQ(8, this)));
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: b */
    public final boolean mo3516b() {
        if (AbstractC1292YB.m2695u(mo3692y().f8101g.m4844P(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: j */
    public final void mo3517j(View view, Bundle bundle) {
        int i;
        super.mo3517j(view, bundle);
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B != null) {
            i = m3511B.getRequestedOrientation();
        } else {
            i = -1;
        }
        this.f9601BO = i;
        AbstractActivityC1957kp m3511B2 = m3511B();
        if (m3511B2 != null) {
            m3511B2.setRequestedOrientation(5);
        }
        if (bundle == null) {
            C2619xH mo3692y = mo3692y();
            C0536K5 c0536k5 = mo3692y.f8099U;
            if (c0536k5 == null) {
                c0536k5 = null;
            }
            AbstractC0438II.m994F(AbstractC2575wW.m4424d(mo3692y), null, new C1775hO(c0536k5.f1784z, c0536k5.f1783h, mo3692y, null), 3);
        }
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: l */
    public final View mo3518l() {
        return ((AbstractC0295Fc) m3513K()).f1027i;
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: m */
    public final View mo3519m() {
        if (((AbstractC0295Fc) m3513K()).f1025L.isShown()) {
            return ((AbstractC0295Fc) m3513K()).f1025L;
        }
        return null;
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: nP */
    public final boolean mo3520nP(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 24 || keyCode == 25;
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: qn  reason: merged with bridge method [inline-methods] */
    public final C2619xH mo3692y() {
        return (C2619xH) this.f9603U8.getValue();
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: r */
    public final void mo290r(Bundle bundle) {
        super.mo290r(bundle);
        C2619xH mo3692y = mo3692y();
        Bundle bundle2 = this.f7210k;
        if (bundle2 != null) {
            mo3692y.f8099U = C1219Wm.m2515v(bundle2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: v */
    public final void mo2522v(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_flash, menu);
    }
}
