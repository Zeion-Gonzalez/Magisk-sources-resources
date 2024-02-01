package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.CA */
/* loaded from: classes.dex */
public final class C0112CA extends AbstractC1378Zn {

    /* renamed from: I */
    public static final C0112CA f401I = new C0112CA();

    /* renamed from: q */
    public static final C0639M1 f403q = new C0639M1(R.string.settings_su_tapjack_title);

    /* renamed from: k */
    public static final C0639M1 f402k = new C0639M1(R.string.settings_su_tapjack_summary);

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    public C0112CA() {
        super(1);
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        return f402k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f403q;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3960k.m3359nB(c1212We, C1212We.f3959h[12], booleanValue);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        return Boolean.valueOf(C1212We.f3969z.m2497P());
    }
}
