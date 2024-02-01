package p000a;

import androidx.lifecycle.AbstractC2764h;

/* renamed from: a.tD */
/* loaded from: classes.dex */
public final class C2401tD implements InterfaceC0217E7 {

    /* renamed from: R */
    public final InterfaceC0217E7 f7332R;

    /* renamed from: S */
    public final AbstractC2764h f7333S;

    /* renamed from: w */
    public int f7334w = -1;

    public C2401tD(C1112Up c1112Up, C1104Uh c1104Uh) {
        this.f7333S = c1112Up;
        this.f7332R = c1104Uh;
    }

    @Override // p000a.InterfaceC0217E7
    /* renamed from: z */
    public final void mo421z(Object obj) {
        int i = this.f7334w;
        int i2 = this.f7333S.f9021u;
        if (i != i2) {
            this.f7334w = i2;
            this.f7332R.mo421z(obj);
        }
    }
}
