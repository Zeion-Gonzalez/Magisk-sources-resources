package com.topjohnwu.magisk.p001ui.settings;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import java.util.Iterator;
import p000a.AbstractActivityC1957kp;
import p000a.AbstractC0438II;
import p000a.AbstractC1890ja;
import p000a.AbstractC2150oY;
import p000a.AbstractC2207pZ;
import p000a.AbstractC2615xD;
import p000a.C0316G1;
import p000a.C0908R7;
import p000a.EnumC0511Je;
import p000a.InterfaceC1841if;

/* loaded from: classes.dex */
public final class SettingsFragment extends AbstractC1890ja<AbstractC2150oY> {

    /* renamed from: EC */
    public final int f9616EC = R.layout.fragment_settings_md2;

    /* renamed from: U8 */
    public final InterfaceC1841if f9617U8;

    public SettingsFragment() {
        int i = EnumC0511Je.f1697S;
        this.f9617U8 = AbstractC0438II.m1020Z(new C0908R7(this, 7));
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: D */
    public final int mo3512D() {
        return this.f9616EC;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: X */
    public final void mo3514X() {
        super.mo3514X();
        Iterator it = ((C0316G1) this.f9617U8.getValue()).f1078k.iterator();
        while (it.hasNext()) {
            ((AbstractC2207pZ) it.next()).mo2844k();
        }
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        super.mo285Z();
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B == null) {
            return;
        }
        m3511B.setTitle(m4018w().getString(R.string.settings));
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: j */
    public final void mo3517j(View view, Bundle bundle) {
        super.mo3517j(view, bundle);
        RecyclerView recyclerView = ((AbstractC2150oY) m3513K()).f6614j;
        AbstractC0438II.m1007P(recyclerView, 0, 7);
        AbstractC0438II.m1005N(recyclerView);
        AbstractC0438II.m1045s(recyclerView);
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: l */
    public final View mo3518l() {
        return ((AbstractC2150oY) m3513K()).f6612L;
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C0316G1) this.f9617U8.getValue();
    }
}
