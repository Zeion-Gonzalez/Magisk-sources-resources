package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.oI */
/* loaded from: classes.dex */
public final class C2137oI extends AbstractC1881jR {

    /* renamed from: I */
    public static final C2137oI f6581I = new C2137oI();

    /* renamed from: q */
    public static final C0639M1 f6583q = new C0639M1(R.string.superuser_access);

    /* renamed from: k */
    public static final int f6582k = R.array.su_access;

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f6583q;
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: r */
    public final int mo1461r() {
        return f6582k;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        int intValue = ((Number) obj).intValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[18];
        C1212We.f3940E.m3733h(c1212We, intValue);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[18];
        return Integer.valueOf(C1212We.f3940E.m3734z(c1212We).intValue());
    }
}
