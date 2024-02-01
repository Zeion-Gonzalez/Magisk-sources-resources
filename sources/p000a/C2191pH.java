package p000a;

import androidx.navigation.fragment.NavHostFragment;

/* renamed from: a.pH */
/* loaded from: classes.dex */
public final class C2191pH extends AbstractC0231EP implements InterfaceC2030mD {

    /* renamed from: h */
    public final boolean f6725h;

    /* renamed from: z */
    public final InterfaceC2438tw f6726z;

    public C2191pH(InterfaceC2438tw interfaceC2438tw, boolean z) {
        this.f6726z = interfaceC2438tw;
        this.f6725h = z;
    }

    @Override // p000a.InterfaceC2030mD
    /* renamed from: h */
    public final void mo557h(AbstractActivityC0819PG abstractActivityC0819PG) {
        AbstractActivityC1957kp abstractActivityC1957kp;
        if (abstractActivityC0819PG instanceof AbstractActivityC1957kp) {
            abstractActivityC1957kp = (AbstractActivityC1957kp) abstractActivityC0819PG;
        } else {
            abstractActivityC1957kp = null;
        }
        if (abstractActivityC1957kp != null) {
            boolean z = this.f6725h;
            C1146VR c1146vr = abstractActivityC1957kp.f6062l;
            if (z) {
                C0366Gz c0366Gz = (C0366Gz) ((NavHostFragment) c1146vr.getValue()).f9030n0.getValue();
                if (!c0366Gz.f7661u.isEmpty() && c0366Gz.m4332M(c0366Gz.m4335Q().f4455y, true, false)) {
                    c0366Gz.m4340h();
                }
            }
            ((C0366Gz) ((NavHostFragment) c1146vr.getValue()).f9030n0.getValue()).m4330G(this.f6726z);
        }
    }
}
