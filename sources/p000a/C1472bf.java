package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.bf */
/* loaded from: classes.dex */
public class C1472bf implements InterfaceC1298YI {

    /* renamed from: P */
    public final AbstractC1790hg f4566P;

    /* renamed from: Q */
    public int f4567Q;

    /* renamed from: u */
    public int f4572u;

    /* renamed from: z */
    public AbstractC1790hg f4574z = null;

    /* renamed from: h */
    public boolean f4570h = false;

    /* renamed from: v */
    public boolean f4573v = false;

    /* renamed from: N */
    public int f4565N = 1;

    /* renamed from: o */
    public int f4571o = 1;

    /* renamed from: W */
    public C2546vv f4569W = null;

    /* renamed from: G */
    public boolean f4563G = false;

    /* renamed from: M */
    public final ArrayList f4564M = new ArrayList();

    /* renamed from: V */
    public final ArrayList f4568V = new ArrayList();

    public C1472bf(AbstractC1790hg abstractC1790hg) {
        this.f4566P = abstractC1790hg;
    }

    /* renamed from: P */
    public void mo2881P(int i) {
        if (this.f4563G) {
            return;
        }
        this.f4563G = true;
        this.f4572u = i;
        Iterator it = this.f4564M.iterator();
        while (it.hasNext()) {
            InterfaceC1298YI interfaceC1298YI = (InterfaceC1298YI) it.next();
            interfaceC1298YI.mo1916z(interfaceC1298YI);
        }
    }

    /* renamed from: h */
    public final void m2882h(InterfaceC1298YI interfaceC1298YI) {
        this.f4564M.add(interfaceC1298YI);
        if (this.f4563G) {
            interfaceC1298YI.mo1916z(interfaceC1298YI);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4566P.f5627h.f5069n0);
        sb.append(":");
        sb.append(AbstractC2441tz.m4183E(this.f4565N));
        sb.append("(");
        if (this.f4563G) {
            obj = Integer.valueOf(this.f4572u);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f4568V.size());
        sb.append(":d=");
        sb.append(this.f4564M.size());
        sb.append(">");
        return sb.toString();
    }

    /* renamed from: v */
    public final void m2883v() {
        this.f4568V.clear();
        this.f4564M.clear();
        this.f4563G = false;
        this.f4572u = 0;
        this.f4573v = false;
        this.f4570h = false;
    }

    @Override // p000a.InterfaceC1298YI
    /* renamed from: z */
    public final void mo1916z(InterfaceC1298YI interfaceC1298YI) {
        ArrayList arrayList = this.f4568V;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1472bf) it.next()).f4563G) {
                return;
            }
        }
        this.f4573v = true;
        AbstractC1790hg abstractC1790hg = this.f4574z;
        if (abstractC1790hg != null) {
            abstractC1790hg.mo1916z(this);
        }
        if (this.f4570h) {
            this.f4566P.mo1916z(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C1472bf c1472bf = null;
        int i = 0;
        while (it2.hasNext()) {
            C1472bf c1472bf2 = (C1472bf) it2.next();
            if (!(c1472bf2 instanceof C2546vv)) {
                i++;
                c1472bf = c1472bf2;
            }
        }
        if (c1472bf != null && i == 1 && c1472bf.f4563G) {
            C2546vv c2546vv = this.f4569W;
            if (c2546vv != null) {
                if (!c2546vv.f4563G) {
                    return;
                } else {
                    this.f4567Q = this.f4571o * c2546vv.f4572u;
                }
            }
            mo2881P(c1472bf.f4572u + this.f4567Q);
        }
        AbstractC1790hg abstractC1790hg2 = this.f4574z;
        if (abstractC1790hg2 != null) {
            abstractC1790hg2.mo1916z(this);
        }
    }
}
