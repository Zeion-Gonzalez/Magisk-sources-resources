package p000a;

import java.io.Serializable;
import java.util.Map;

/* renamed from: a.CO */
/* loaded from: classes.dex */
public final /* synthetic */ class C0125CO implements InterfaceC0559KW, InterfaceC0225EG, Serializable {

    /* renamed from: S */
    public final Object f435S;

    public C0125CO(C0468Ir c0468Ir) {
        this.f435S = c0468Ir;
    }

    /* renamed from: N */
    public final String toString() {
        AbstractC0274FD.f956z.getClass();
        return C1880jQ.m3500z(this);
    }

    @Override // p000a.InterfaceC0225EG
    /* renamed from: P */
    public final int mo252P() {
        return 2;
    }

    /* renamed from: h */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0125CO)) {
            return false;
        }
        C0125CO c0125co = (C0125CO) obj;
        c0125co.getClass();
        return AbstractC1292YB.m2695u(this.f435S, c0125co.f435S) && AbstractC1292YB.m2695u(C0468Ir.class, C0468Ir.class);
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        boolean z;
        Map map = (Map) obj;
        InterfaceC1171Vv interfaceC1171Vv = (InterfaceC1171Vv) obj2;
        ((C0468Ir) this.f435S).getClass();
        String str = (String) map.get("uid");
        if (str != null) {
            C2531vd c2531vd = new C2531vd(Integer.parseInt(str));
            String str2 = (String) map.get("policy");
            if (str2 != null) {
                c2531vd.f7749h = Integer.parseInt(str2);
            }
            String str3 = (String) map.get("until");
            if (str3 != null) {
                c2531vd.f7750v = Long.parseLong(str3);
            }
            String str4 = (String) map.get("logging");
            boolean z2 = true;
            if (str4 != null) {
                if (Integer.parseInt(str4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c2531vd.f7748P = z;
            }
            String str5 = (String) map.get("notification");
            if (str5 != null) {
                if (Integer.parseInt(str5) == 0) {
                    z2 = false;
                }
                c2531vd.f7747N = z2;
                return c2531vd;
            }
            return c2531vd;
        }
        return null;
    }

    /* renamed from: v */
    public final int hashCode() {
        return ((((((((((C0468Ir.class.hashCode() + ((this.f435S != null ? r0.hashCode() : 0) * 31)) * 31) - 1867606131) * 31) - 89806527) * 31) + 1237) * 31) + 2) * 31) + 2;
    }
}
