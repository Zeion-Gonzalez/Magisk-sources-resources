package p000a;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: a.oC */
/* loaded from: classes.dex */
public final class C2131oC implements InterfaceC1009Sv {

    /* renamed from: h */
    public int f6569h = 0;

    /* renamed from: v */
    public final LinkedList f6570v = new LinkedList();

    /* renamed from: z */
    public final char f6571z;

    public C2131oC(char c) {
        this.f6571z = c;
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: N */
    public final char mo2185N() {
        return this.f6571z;
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: P */
    public final void mo2186P(C2357sM c2357sM, C2357sM c2357sM2, int i) {
        m3755u(i).mo2186P(c2357sM, c2357sM2, i);
    }

    /* renamed from: Q */
    public final void m3754Q(InterfaceC1009Sv interfaceC1009Sv) {
        boolean z;
        int mo2188v;
        int mo2188v2 = interfaceC1009Sv.mo2188v();
        LinkedList linkedList = this.f6570v;
        ListIterator listIterator = linkedList.listIterator();
        do {
            if (listIterator.hasNext()) {
                mo2188v = ((InterfaceC1009Sv) listIterator.next()).mo2188v();
                if (mo2188v2 > mo2188v) {
                    listIterator.previous();
                    listIterator.add(interfaceC1009Sv);
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            linkedList.add(interfaceC1009Sv);
            this.f6569h = mo2188v2;
            return;
        } while (mo2188v2 != mo2188v);
        throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f6571z + "' and minimum length " + mo2188v2);
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: h */
    public final int mo2187h(C0330GK c0330gk, C0330GK c0330gk2) {
        return m3755u(c0330gk.f1121u).mo2187h(c0330gk, c0330gk2);
    }

    /* renamed from: u */
    public final InterfaceC1009Sv m3755u(int i) {
        LinkedList linkedList = this.f6570v;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            InterfaceC1009Sv interfaceC1009Sv = (InterfaceC1009Sv) it.next();
            if (interfaceC1009Sv.mo2188v() <= i) {
                return interfaceC1009Sv;
            }
        }
        return (InterfaceC1009Sv) linkedList.getFirst();
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: v */
    public final int mo2188v() {
        return this.f6569h;
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: z */
    public final char mo2189z() {
        return this.f6571z;
    }
}
