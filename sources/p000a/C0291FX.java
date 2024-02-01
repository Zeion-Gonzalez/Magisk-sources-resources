package p000a;

/* renamed from: a.FX */
/* loaded from: classes.dex */
public final class C0291FX extends AbstractC0632Lt {

    /* renamed from: P */
    public final /* synthetic */ int f1018P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0291FX(AbstractC1687fj abstractC1687fj, int i) {
        super(abstractC1687fj);
        this.f1018P = i;
        if (i != 1) {
        } else {
            super(abstractC1687fj);
        }
    }

    /* renamed from: f */
    public static void m605f(InterfaceC2721zM interfaceC2721zM, C0790Oi c0790Oi) {
        interfaceC2721zM.mo2991Y(1, c0790Oi.f2691z);
        interfaceC2721zM.mo2991Y(2, c0790Oi.f2687h);
        interfaceC2721zM.mo2991Y(3, c0790Oi.f2690v);
        String str = c0790Oi.f2683P;
        if (str == null) {
            interfaceC2721zM.mo2990T(4);
        } else {
            interfaceC2721zM.mo2992f(4, str);
        }
        String str2 = c0790Oi.f2682N;
        if (str2 == null) {
            interfaceC2721zM.mo2990T(5);
        } else {
            interfaceC2721zM.mo2992f(5, str2);
        }
        String str3 = c0790Oi.f2684Q;
        if (str3 == null) {
            interfaceC2721zM.mo2990T(6);
        } else {
            interfaceC2721zM.mo2992f(6, str3);
        }
        interfaceC2721zM.mo2991Y(7, c0790Oi.f2689u);
        interfaceC2721zM.mo2991Y(8, c0790Oi.f2688o);
        String str4 = c0790Oi.f2686W;
        if (str4 == null) {
            interfaceC2721zM.mo2990T(9);
        } else {
            interfaceC2721zM.mo2992f(9, str4);
        }
        String str5 = c0790Oi.f2680G;
        if (str5 == null) {
            interfaceC2721zM.mo2990T(10);
        } else {
            interfaceC2721zM.mo2992f(10, str5);
        }
        interfaceC2721zM.mo2991Y(11, c0790Oi.f2681M);
        interfaceC2721zM.mo2991Y(12, c0790Oi.f2685V);
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: R */
    public final String mo606R() {
        switch (this.f1018P) {
            case AbstractC0795Op.f2698E /* 0 */:
                return "INSERT OR ABORT INTO `logs` (`fromUid`,`toUid`,`fromPid`,`packageName`,`appName`,`command`,`action`,`target`,`context`,`gids`,`time`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
            default:
                return "DELETE FROM logs WHERE time < ?";
        }
    }
}
