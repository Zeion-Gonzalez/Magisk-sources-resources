package p000a;

/* renamed from: a.Vg */
/* loaded from: classes.dex */
public class C1158Vg implements InterfaceC1576dd {

    /* renamed from: R */
    public final InterfaceC1576dd f3754R;

    /* renamed from: S */
    public final /* synthetic */ int f3755S = 1;

    public C1158Vg(int i, String str, boolean z) {
        this.f3754R = new C1424ak(str, String.valueOf(i), z);
    }

    /* renamed from: P */
    public void mo2367P(Object obj, InterfaceC0609LP interfaceC0609LP, Integer num) {
        switch (this.f3755S) {
            case AbstractC0795Op.f2698E /* 0 */:
                mo2369v((InterfaceC0806P1) obj, interfaceC0609LP, ((Boolean) num).booleanValue());
                return;
            default:
                int intValue = num.intValue();
                ((C1424ak) this.f3754R).m2854nB((InterfaceC2101nb) obj, interfaceC0609LP, String.valueOf(intValue));
                return;
        }
    }

    /* renamed from: h */
    public final Object m2368h(Object obj, InterfaceC0609LP interfaceC0609LP) {
        switch (this.f3755S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m2370z((InterfaceC0806P1) obj, interfaceC0609LP);
            default:
                return Integer.valueOf(Integer.parseInt(((C1424ak) this.f3754R).m2853O4((InterfaceC2101nb) obj, interfaceC0609LP)));
        }
    }

    /* renamed from: v */
    public void mo2369v(InterfaceC0806P1 interfaceC0806P1, InterfaceC0609LP interfaceC0609LP, boolean z) {
        ((C2106ng) this.f3754R).m3733h(interfaceC0806P1, z ? 1 : 0);
    }

    /* renamed from: z */
    public final Boolean m2370z(InterfaceC0806P1 interfaceC0806P1, InterfaceC0609LP interfaceC0609LP) {
        return Boolean.valueOf(((C2106ng) this.f3754R).m3734z(interfaceC0806P1).intValue() != 0);
    }

    public C1158Vg(String str) {
        this.f3754R = new C2106ng(0, str);
    }
}
