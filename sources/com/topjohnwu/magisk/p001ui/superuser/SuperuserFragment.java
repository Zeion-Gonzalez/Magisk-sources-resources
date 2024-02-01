package com.topjohnwu.magisk.p001ui.superuser;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.AbstractC2760z;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import p000a.AbstractActivityC1957kp;
import p000a.AbstractC0438II;
import p000a.AbstractC1890ja;
import p000a.AbstractC2597wv;
import p000a.AbstractC2615xD;
import p000a.C0908R7;
import p000a.C1353ZK;
import p000a.EnumC0511Je;
import p000a.InterfaceC1841if;

/* loaded from: classes.dex */
public final class SuperuserFragment extends AbstractC1890ja<AbstractC2597wv> {

    /* renamed from: EC */
    public final int f9618EC = R.layout.fragment_superuser_md2;

    /* renamed from: U8 */
    public final InterfaceC1841if f9619U8;

    public SuperuserFragment() {
        int i = EnumC0511Je.f1697S;
        this.f9619U8 = AbstractC0438II.m1020Z(new C0908R7(this, 8));
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: D */
    public final int mo3512D() {
        return this.f9618EC;
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: Yd */
    public final /* bridge */ /* synthetic */ void mo3515Yd(AbstractC2760z abstractC2760z) {
        AbstractC2597wv abstractC2597wv = (AbstractC2597wv) abstractC2760z;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        super.mo285Z();
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B == null) {
            return;
        }
        m3511B.setTitle(m4018w().getString(R.string.superuser));
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: j */
    public final void mo3517j(View view, Bundle bundle) {
        super.mo3517j(view, bundle);
        RecyclerView recyclerView = ((AbstractC2597wv) m3513K()).f7989j;
        AbstractC0438II.m1007P(recyclerView, R.dimen.l_50, 5);
        AbstractC0438II.m1005N(recyclerView);
        AbstractC0438II.m1045s(recyclerView);
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C1353ZK) this.f9619U8.getValue();
    }
}
