package p000a;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a.fS */
/* loaded from: classes.dex */
public final class C1673fS extends AbstractC2092nP {

    /* renamed from: I */
    public final InterfaceC2364sT f5235I;

    /* renamed from: q */
    public final HashSet f5236q = new HashSet();

    /* renamed from: w */
    public final Iterator f5237w;

    public C1673fS(Iterator it, InterfaceC2364sT interfaceC2364sT) {
        this.f5237w = it;
        this.f5235I = interfaceC2364sT;
    }

    @Override // p000a.AbstractC2092nP
    /* renamed from: z */
    public final void mo3170z() {
        Object next;
        do {
            Iterator it = this.f5237w;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f6458S = EnumC1988lP.f6166w;
                return;
            }
        } while (!this.f5236q.add(this.f5235I.mo85W(next)));
        this.f6457R = next;
        this.f6458S = EnumC1988lP.f6165S;
    }
}
