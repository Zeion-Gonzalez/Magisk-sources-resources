package p000a;

import android.net.Uri;

/* renamed from: a.hO */
/* loaded from: classes.dex */
public final class C1775hO extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ Uri f5595g;

    /* renamed from: k */
    public final /* synthetic */ String f5596k;

    /* renamed from: q */
    public int f5597q;

    /* renamed from: y */
    public final /* synthetic */ C2619xH f5598y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775hO(String str, Uri uri, C2619xH c2619xH, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f5596k = str;
        this.f5595g = uri;
        this.f5598y = c2619xH;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1775hO(this.f5596k, this.f5595g, this.f5598y, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0715NT enumC0715NT;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f5597q;
        C0329GJ c0329gj = C0329GJ.f1115z;
        C2619xH c2619xH = this.f5598y;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC1292YB.m2664UZ(obj);
                String str = this.f5596k;
                int hashCode = str.hashCode();
                int i2 = 0;
                Uri uri = this.f5595g;
                switch (hashCode) {
                    case -1081635250:
                        if (str.equals("magisk")) {
                            if (C1910jw.f5966w) {
                                C0707NL c0707nl = new C0707NL(c2619xH.f8100f, c2619xH.f8098E, 1);
                                this.f5597q = 3;
                                obj = AbstractC0328GI.m729q(c0707nl, this);
                                if (obj == enumC0464Im) {
                                    return enumC0464Im;
                                }
                            } else {
                                C0707NL c0707nl2 = new C0707NL(c2619xH.f8100f, c2619xH.f8098E, 0);
                                this.f5597q = 4;
                                obj = AbstractC0328GI.m729q(c0707nl2, this);
                                if (obj == enumC0464Im) {
                                    return enumC0464Im;
                                }
                            }
                        }
                        c2619xH.getClass();
                        c2619xH.m4500S(new C1366ZZ(i2));
                        return c0329gj;
                    case -625596190:
                        if (str.equals("uninstall")) {
                            if (c2619xH.f8104y) {
                                c2619xH.f8104y = false;
                                AbstractC0795Op.m1801B(c2619xH, 34);
                            }
                            C1473bg c1473bg = new C1473bg(c2619xH.f8100f, c2619xH.f8098E);
                            this.f5597q = 2;
                            obj = c1473bg.m2884q(this);
                            if (obj == enumC0464Im) {
                                return enumC0464Im;
                            }
                        }
                        c2619xH.getClass();
                        c2619xH.m4500S(new C1366ZZ(i2));
                        return c0329gj;
                    case 3533310:
                        if (str.equals("slot")) {
                            C0707NL c0707nl3 = new C0707NL(c2619xH.f8100f, c2619xH.f8098E, 2);
                            this.f5597q = 5;
                            obj = AbstractC0328GI.m729q(c0707nl3, this);
                            if (obj == enumC0464Im) {
                                return enumC0464Im;
                            }
                        }
                        c2619xH.getClass();
                        c2619xH.m4500S(new C1366ZZ(i2));
                        return c0329gj;
                    case 97513456:
                        if (str.equals("flash")) {
                            if (uri == null) {
                                return c0329gj;
                            }
                            C2638xi c2638xi = new C2638xi(uri, c2619xH.f8100f, c2619xH.f8098E);
                            this.f5597q = 1;
                            obj = AbstractC0438II.m1021ZH(AbstractC0037Al.f178h, new C1042TY(c2638xi, null), this);
                            if (obj == enumC0464Im) {
                                return enumC0464Im;
                            }
                        }
                        c2619xH.getClass();
                        c2619xH.m4500S(new C1366ZZ(i2));
                        return c0329gj;
                    case 106438728:
                        if (str.equals("patch")) {
                            if (uri == null) {
                                return c0329gj;
                            }
                            if (c2619xH.f8104y) {
                                c2619xH.f8104y = false;
                                AbstractC0795Op.m1801B(c2619xH, 34);
                            }
                            C0465In c0465In = new C0465In(uri, c2619xH.f8100f, c2619xH.f8098E);
                            this.f5597q = 6;
                            obj = AbstractC0328GI.m729q(c0465In, this);
                            if (obj == enumC0464Im) {
                                return enumC0464Im;
                            }
                        }
                        c2619xH.getClass();
                        c2619xH.m4500S(new C1366ZZ(i2));
                        return c0329gj;
                    default:
                        c2619xH.getClass();
                        c2619xH.m4500S(new C1366ZZ(i2));
                        return c0329gj;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AbstractC1292YB.m2664UZ(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C1112Up c1112Up = c2619xH.f8102k;
        if (booleanValue) {
            enumC0715NT = EnumC0715NT.f2409R;
        } else {
            enumC0715NT = EnumC0715NT.f2411w;
        }
        c1112Up.mo2290G(enumC0715NT);
        return c0329gj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1775hO) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
