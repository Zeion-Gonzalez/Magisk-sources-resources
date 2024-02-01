package com.topjohnwu.magisk.p001ui.install;

import com.topjohnwu.magisk.R;
import p000a.AbstractC0282FM;
import p000a.AbstractC0438II;
import p000a.AbstractC1890ja;
import p000a.AbstractC2615xD;
import p000a.C0908R7;
import p000a.C1650f1;
import p000a.EnumC0511Je;
import p000a.InterfaceC1841if;

/* loaded from: classes.dex */
public final class InstallFragment extends AbstractC1890ja<AbstractC0282FM> {

    /* renamed from: EC */
    public final int f9607EC = R.layout.fragment_install_md2;

    /* renamed from: U8 */
    public final InterfaceC1841if f9608U8;

    public InstallFragment() {
        int i = EnumC0511Je.f1697S;
        this.f9608U8 = AbstractC0438II.m1020Z(new C0908R7(this, 4));
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: D */
    public final int mo3512D() {
        return this.f9607EC;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        super.mo285Z();
        m4009d().setTitle(R.string.install);
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C1650f1) this.f9608U8.getValue();
    }
}
