package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.vG */
/* loaded from: classes.dex */
public final class C2511vG extends AbstractC1881jR {

    /* renamed from: I */
    public static final C2511vG f7692I = new C2511vG();

    /* renamed from: q */
    public static final C0639M1 f7695q = new C0639M1(R.string.mount_namespace_mode);

    /* renamed from: k */
    public static final int f7694k = R.array.namespace;

    /* renamed from: g */
    public static final int f7693g = R.array.namespace_summary;

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f7695q;
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: f */
    public final int mo3501f() {
        return f7693g;
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: r */
    public final int mo1461r() {
        return f7694k;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        int intValue = ((Number) obj).intValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[19];
        C1212We.f3957f.m3733h(c1212We, intValue);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[19];
        return Integer.valueOf(C1212We.f3957f.m3734z(c1212We).intValue());
    }
}
