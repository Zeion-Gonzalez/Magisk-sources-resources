package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.tM */
/* loaded from: classes.dex */
public final class C2407tM extends AbstractC1881jR {

    /* renamed from: I */
    public static final C2407tM f7350I = new C2407tM();

    /* renamed from: q */
    public static final C0639M1 f7352q = new C0639M1(R.string.auto_response);

    /* renamed from: k */
    public static final int f7351k = R.array.auto_response;

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f7352q;
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: r */
    public final int mo1461r() {
        return f7351k;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        int intValue = ((Number) obj).intValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3945M.mo2367P(c1212We, C1212We.f3959h[5], Integer.valueOf(intValue));
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        return Integer.valueOf(((Number) C1212We.f3945M.m2368h(c1212We, C1212We.f3959h[5])).intValue());
    }
}
