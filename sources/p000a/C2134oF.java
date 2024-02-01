package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.oF */
/* loaded from: classes.dex */
public final class C2134oF extends AbstractC1881jR {

    /* renamed from: I */
    public static final C2134oF f6577I = new C2134oF();

    /* renamed from: q */
    public static final C0639M1 f6580q = new C0639M1(R.string.multiuser_mode);

    /* renamed from: k */
    public static final int f6579k = R.array.multiuser_mode;

    /* renamed from: g */
    public static final int f6578g = R.array.multiuser_summary;

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f6580q;
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: f */
    public final int mo3501f() {
        return f6578g;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: k */
    public final void mo2844k() {
        boolean z;
        if (AbstractC0598LC.f1920h == 0) {
            z = true;
        } else {
            z = false;
        }
        m3848g(z);
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: r */
    public final int mo1461r() {
        return f6579k;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        int intValue = ((Number) obj).intValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[20];
        C1212We.f3963r.m3733h(c1212We, intValue);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[20];
        return Integer.valueOf(C1212We.f3963r.m3734z(c1212We).intValue());
    }
}
