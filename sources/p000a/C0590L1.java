package p000a;

import android.widget.CompoundButton;

/* renamed from: a.L1 */
/* loaded from: classes.dex */
public final class C0590L1 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: z */
    public final InterfaceC1629ee f1905z;

    public C0590L1(InterfaceC1629ee interfaceC1629ee) {
        this.f1905z = interfaceC1629ee;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2;
        C0535K4 c0535k4 = (C0535K4) this.f1905z;
        C0316G1 c0316g1 = c0535k4.f5692d;
        AbstractC2207pZ abstractC2207pZ = c0535k4.f5693i;
        if (abstractC2207pZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            abstractC2207pZ.mo2776q(compoundButton, c0316g1, z);
        }
    }
}
