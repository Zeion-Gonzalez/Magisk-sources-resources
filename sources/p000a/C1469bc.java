package p000a;

import java.util.Iterator;

/* renamed from: a.bc */
/* loaded from: classes.dex */
public final class C1469bc implements InterfaceC0332GN {

    /* renamed from: z */
    public final /* synthetic */ C0856Py f4561z;

    public C1469bc(C0856Py c0856Py) {
        this.f4561z = c0856Py;
    }

    @Override // p000a.InterfaceC0332GN
    /* renamed from: z */
    public final void mo80z(InterfaceC1964kx interfaceC1964kx, AbstractC1462bT abstractC1462bT) {
        String str = ((C2357sM) abstractC1462bT).f7250Q;
        C0240Ea c0240Ea = (C0240Ea) interfaceC1964kx;
        c0240Ea.f825v.f5271S.append(str);
        C0856Py c0856Py = this.f4561z;
        if (!c0856Py.f2894z.isEmpty()) {
            c0240Ea.m510P();
            str.getClass();
            Iterator it = c0856Py.f2894z.iterator();
            if (it.hasNext()) {
                AbstractC2441tz.m4202q(it.next());
                throw null;
            }
        }
    }
}
