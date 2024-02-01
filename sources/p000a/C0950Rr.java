package p000a;

import java.lang.ref.WeakReference;

/* renamed from: a.Rr */
/* loaded from: classes.dex */
public final class C0950Rr extends AbstractC1952kk {

    /* renamed from: I */
    public WeakReference f3247I;

    @Override // p000a.AbstractC1952kk
    /* renamed from: N */
    public final void mo898N() {
        WeakReference weakReference = this.f3247I;
        if (weakReference == null) {
            weakReference = null;
        }
        InterfaceC1459bP interfaceC1459bP = (InterfaceC1459bP) weakReference.get();
        if (interfaceC1459bP != null) {
            interfaceC1459bP.mo93z();
        }
    }
}
