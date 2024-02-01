package com.topjohnwu.magisk.p001ui.module;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.AbstractC2760z;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import p000a.AbstractActivityC1957kp;
import p000a.AbstractC0438II;
import p000a.AbstractC1890ja;
import p000a.AbstractC2563wI;
import p000a.AbstractC2615xD;
import p000a.C0908R7;
import p000a.C1104Uh;
import p000a.C2670yQ;
import p000a.C2744zq;
import p000a.EnumC0511Je;
import p000a.InterfaceC1841if;
import p000a.RunnableC2507vC;

/* loaded from: classes.dex */
public final class ModuleFragment extends AbstractC1890ja<AbstractC2563wI> {

    /* renamed from: BO */
    public static final /* synthetic */ int f9613BO = 0;

    /* renamed from: EC */
    public final int f9614EC = R.layout.fragment_module_md2;

    /* renamed from: U8 */
    public final InterfaceC1841if f9615U8;

    public ModuleFragment() {
        int i = EnumC0511Je.f1697S;
        this.f9615U8 = AbstractC0438II.m1020Z(new C0908R7(this, 6));
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: D */
    public final int mo3512D() {
        return this.f9614EC;
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: Yd */
    public final /* bridge */ /* synthetic */ void mo3515Yd(AbstractC2760z abstractC2760z) {
        AbstractC2563wI abstractC2563wI = (AbstractC2563wI) abstractC2760z;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        super.mo285Z();
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B != null) {
            m3511B.setTitle(m4018w().getString(R.string.modules));
        }
        ((C2744zq) this.f9615U8.getValue()).getClass();
        C2744zq.f8599f.m4843N(this, new C1104Uh(5, new C2670yQ(10, this)));
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: j */
    public final void mo3517j(View view, Bundle bundle) {
        super.mo3517j(view, bundle);
        RecyclerView recyclerView = ((AbstractC2563wI) m3513K()).f7832j;
        AbstractC0438II.m1007P(recyclerView, R.dimen.l_50, 5);
        AbstractC0438II.m1005N(recyclerView);
        AbstractC0438II.m1045s(recyclerView);
        recyclerView.post(new RunnableC2507vC(recyclerView, 1));
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C2744zq) this.f9615U8.getValue();
    }
}
