package p000a;

import java.util.ArrayList;

/* renamed from: a.ye */
/* loaded from: classes.dex */
public final class C2682ye {

    /* renamed from: h */
    public final ArrayList f8364h = new ArrayList();

    /* renamed from: z */
    public final AbstractC1790hg f8365z;

    public C2682ye(AbstractC1790hg abstractC1790hg) {
        this.f8365z = null;
        this.f8365z = abstractC1790hg;
    }

    /* renamed from: h */
    public static long m4590h(C1472bf c1472bf, long j) {
        AbstractC1790hg abstractC1790hg = c1472bf.f4566P;
        if (abstractC1790hg instanceof C1357ZO) {
            return j;
        }
        ArrayList arrayList = c1472bf.f4564M;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1298YI interfaceC1298YI = (InterfaceC1298YI) arrayList.get(i);
            if (interfaceC1298YI instanceof C1472bf) {
                C1472bf c1472bf2 = (C1472bf) interfaceC1298YI;
                if (c1472bf2.f4566P != abstractC1790hg) {
                    j2 = Math.max(j2, m4590h(c1472bf2, c1472bf2.f4567Q + j));
                }
            }
        }
        if (c1472bf != abstractC1790hg.f5628o) {
            return j2;
        }
        long mo1909G = abstractC1790hg.mo1909G();
        long j3 = j + mo1909G;
        return Math.max(Math.max(j2, m4590h(abstractC1790hg.f5626W, j3)), j3 - r9.f4567Q);
    }

    /* renamed from: z */
    public static long m4591z(C1472bf c1472bf, long j) {
        AbstractC1790hg abstractC1790hg = c1472bf.f4566P;
        if (abstractC1790hg instanceof C1357ZO) {
            return j;
        }
        ArrayList arrayList = c1472bf.f4564M;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1298YI interfaceC1298YI = (InterfaceC1298YI) arrayList.get(i);
            if (interfaceC1298YI instanceof C1472bf) {
                C1472bf c1472bf2 = (C1472bf) interfaceC1298YI;
                if (c1472bf2.f4566P != abstractC1790hg) {
                    j2 = Math.min(j2, m4591z(c1472bf2, c1472bf2.f4567Q + j));
                }
            }
        }
        if (c1472bf != abstractC1790hg.f5626W) {
            return j2;
        }
        long mo1909G = abstractC1790hg.mo1909G();
        long j3 = j - mo1909G;
        return Math.min(Math.min(j2, m4591z(abstractC1790hg.f5628o, j3)), j3 - r9.f4567Q);
    }
}
