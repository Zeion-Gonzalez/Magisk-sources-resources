package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.fu */
/* loaded from: classes.dex */
public final class C1696fu extends AbstractC1881jR {

    /* renamed from: I */
    public static final C1696fu f5314I = new C1696fu();

    /* renamed from: q */
    public static final C0639M1 f5316q = new C0639M1(R.string.superuser_notification);

    /* renamed from: k */
    public static final int f5315k = R.array.su_notification;

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f5316q;
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: r */
    public final int mo1461r() {
        return f5315k;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        int intValue = ((Number) obj).intValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3952V.mo2367P(c1212We, C1212We.f3959h[6], Integer.valueOf(intValue));
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        return Integer.valueOf(((Number) C1212We.f3952V.m2368h(c1212We, C1212We.f3959h[6])).intValue());
    }
}
