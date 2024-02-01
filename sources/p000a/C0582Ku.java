package p000a;

import java.util.Locale;

/* renamed from: a.Ku */
/* loaded from: classes.dex */
public final class C0582Ku extends AbstractC1021T9 implements InterfaceC0559KW {

    /* renamed from: R */
    public final /* synthetic */ int f1896R;

    /* renamed from: w */
    public static final C0582Ku f1894w = new C0582Ku(0);

    /* renamed from: I */
    public static final C0582Ku f1888I = new C0582Ku(1);

    /* renamed from: q */
    public static final C0582Ku f1892q = new C0582Ku(2);

    /* renamed from: k */
    public static final C0582Ku f1891k = new C0582Ku(3);

    /* renamed from: g */
    public static final C0582Ku f1890g = new C0582Ku(4);

    /* renamed from: y */
    public static final C0582Ku f1895y = new C0582Ku(5);

    /* renamed from: s */
    public static final C0582Ku f1893s = new C0582Ku(6);

    /* renamed from: U */
    public static final C0582Ku f1889U = new C0582Ku(7);

    /* renamed from: E */
    public static final C0582Ku f1887E = new C0582Ku(8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0582Ku(int i) {
        super(2);
        this.f1896R = i;
    }

    /* renamed from: h */
    public final InterfaceC1255XS m1312h(InterfaceC1088UM interfaceC1088UM, InterfaceC1255XS interfaceC1255XS) {
        C0279FJ c0279fj;
        switch (this.f1896R) {
            case 2:
                InterfaceC1255XS mo105V = interfaceC1255XS.mo105V(interfaceC1088UM.getKey());
                C0070BN c0070bn = C0070BN.f302S;
                if (mo105V != c0070bn) {
                    C1710g8 c1710g8 = C1710g8.f5377R;
                    InterfaceC2741zl interfaceC2741zl = (InterfaceC2741zl) mo105V.mo107y(c1710g8);
                    if (interfaceC2741zl == null) {
                        c0279fj = new C0279FJ(interfaceC1088UM, mo105V);
                    } else {
                        InterfaceC1255XS mo105V2 = mo105V.mo105V(c1710g8);
                        if (mo105V2 == c0070bn) {
                            return new C0279FJ(interfaceC2741zl, interfaceC1088UM);
                        }
                        c0279fj = new C0279FJ(interfaceC2741zl, new C0279FJ(interfaceC1088UM, mo105V2));
                    }
                    return c0279fj;
                }
                return interfaceC1088UM;
            default:
                return interfaceC1255XS.mo104G(interfaceC1088UM);
        }
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        boolean z = true;
        switch (this.f1896R) {
            case AbstractC0795Op.f2698E /* 0 */:
                Locale locale = (Locale) obj;
                Locale locale2 = (Locale) obj2;
                return Integer.valueOf(locale.getDisplayName(locale).compareToIgnoreCase(locale2.getDisplayName(locale2)));
            case 1:
                String str = (String) obj;
                InterfaceC1088UM interfaceC1088UM = (InterfaceC1088UM) obj2;
                if (str.length() != 0) {
                    z = false;
                }
                if (z) {
                    return interfaceC1088UM.toString();
                }
                return str + ", " + interfaceC1088UM;
            case 2:
                return m1312h((InterfaceC1088UM) obj2, (InterfaceC1255XS) obj);
            case 3:
                return m1312h((InterfaceC1088UM) obj2, (InterfaceC1255XS) obj);
            case 4:
                InterfaceC1088UM interfaceC1088UM2 = (InterfaceC1088UM) obj2;
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 5:
                InterfaceC1088UM interfaceC1088UM3 = (InterfaceC1088UM) obj2;
                return Integer.valueOf(((Number) obj).intValue() + 1);
            case 6:
                InterfaceC1088UM interfaceC1088UM4 = (InterfaceC1088UM) obj2;
                return obj;
            case 7:
                AbstractC2441tz.m4202q(obj);
                InterfaceC1088UM interfaceC1088UM5 = (InterfaceC1088UM) obj2;
                return null;
            default:
                InterfaceC1088UM interfaceC1088UM6 = (InterfaceC1088UM) obj2;
                return (C1135VF) obj;
        }
    }
}
