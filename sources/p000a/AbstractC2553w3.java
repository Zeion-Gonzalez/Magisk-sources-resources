package p000a;

/* renamed from: a.w3 */
/* loaded from: classes.dex */
public abstract class AbstractC2553w3 implements InterfaceC1009Sv {

    /* renamed from: z */
    public final char f7799z;

    public AbstractC2553w3(char c) {
        this.f7799z = c;
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: N */
    public final char mo2185N() {
        return this.f7799z;
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: P */
    public final void mo2186P(C2357sM c2357sM, C2357sM c2357sM2, int i) {
        AbstractC1462bT c0421Hy;
        String.valueOf(this.f7799z);
        if (i == 1) {
            c0421Hy = new C2140oM();
        } else {
            c0421Hy = new C0421Hy();
        }
        AbstractC1462bT abstractC1462bT = c2357sM.f4553N;
        while (abstractC1462bT != null && abstractC1462bT != c2357sM2) {
            AbstractC1462bT abstractC1462bT2 = abstractC1462bT.f4553N;
            c0421Hy.m2875h(abstractC1462bT);
            abstractC1462bT = abstractC1462bT2;
        }
        c0421Hy.m2874Q();
        AbstractC1462bT abstractC1462bT3 = c2357sM.f4553N;
        c0421Hy.f4553N = abstractC1462bT3;
        if (abstractC1462bT3 != null) {
            abstractC1462bT3.f4554P = c0421Hy;
        }
        c0421Hy.f4554P = c2357sM;
        c2357sM.f4553N = c0421Hy;
        AbstractC1462bT abstractC1462bT4 = c2357sM.f4557z;
        c0421Hy.f4557z = abstractC1462bT4;
        if (c0421Hy.f4553N == null) {
            abstractC1462bT4.f4556v = c0421Hy;
        }
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: h */
    public final int mo2187h(C0330GK c0330gk, C0330GK c0330gk2) {
        if (c0330gk.f1117P || c0330gk2.f1122v) {
            int i = c0330gk2.f1120o;
            if (i % 3 != 0 && (c0330gk.f1120o + i) % 3 == 0) {
                return 0;
            }
        }
        if (c0330gk.f1121u >= 2 && c0330gk2.f1121u >= 2) {
            return 2;
        }
        return 1;
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: v */
    public final int mo2188v() {
        return 1;
    }

    @Override // p000a.InterfaceC1009Sv
    /* renamed from: z */
    public final char mo2189z() {
        return this.f7799z;
    }
}
