package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: a.nt */
/* loaded from: classes.dex */
public final class C2115nt {

    /* renamed from: N */
    public final ArrayList f6517N;

    /* renamed from: P */
    public final ArrayList f6518P;

    /* renamed from: h */
    public InterfaceC0820PJ f6519h;

    /* renamed from: v */
    public C2658y7 f6520v;

    /* renamed from: z */
    public final C2107ni f6521z;

    public C2115nt() {
        C2107ni c2107ni = C2107ni.f6506v;
        this.f6518P = new ArrayList();
        this.f6517N = new ArrayList();
        this.f6521z = c2107ni;
    }

    /* renamed from: h */
    public final C0313Fz m3735h() {
        List singletonList;
        List emptyList;
        if (this.f6520v != null) {
            InterfaceC0820PJ interfaceC0820PJ = this.f6519h;
            if (interfaceC0820PJ == null) {
                interfaceC0820PJ = new C0234ES(new C1161Vk());
            }
            InterfaceC0820PJ interfaceC0820PJ2 = interfaceC0820PJ;
            C2107ni c2107ni = this.f6521z;
            Executor mo3121z = c2107ni.mo3121z();
            ArrayList arrayList = new ArrayList(this.f6517N);
            C0086Be c0086Be = new C0086Be(mo3121z);
            boolean z = c2107ni.f6508z;
            if (z) {
                singletonList = Arrays.asList(C0565Kc.f1837z, c0086Be);
            } else {
                singletonList = Collections.singletonList(c0086Be);
            }
            arrayList.addAll(singletonList);
            ArrayList arrayList2 = this.f6518P;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z ? 1 : 0));
            arrayList3.add(new C2433tq());
            arrayList3.addAll(arrayList2);
            if (z) {
                emptyList = Collections.singletonList(C1490c3.f4628z);
            } else {
                emptyList = Collections.emptyList();
            }
            arrayList3.addAll(emptyList);
            return new C0313Fz(interfaceC0820PJ2, this.f6520v, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), mo3121z);
        }
        throw new IllegalStateException("Base URL required.");
    }

    /* renamed from: z */
    public final void m3736z(String str) {
        C0349Gf c0349Gf = new C0349Gf();
        c0349Gf.m760N(null, str);
        C2658y7 m762h = c0349Gf.m762h();
        if ("".equals(m762h.f8280Q.get(r0.size() - 1))) {
            this.f6520v = m762h;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + m762h);
        }
    }
}
