package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.Pz */
/* loaded from: classes.dex */
public final class C0857Pz extends AbstractC1378Zn {

    /* renamed from: I */
    public static final C0857Pz f2895I = new C0857Pz();

    /* renamed from: q */
    public static final C0639M1 f2897q = new C0639M1(R.string.settings_doh_title);

    /* renamed from: k */
    public static final C0639M1 f2896k = new C0639M1(R.string.settings_doh_description);

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    public C0857Pz() {
        super(1);
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        return f2896k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f2897q;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3968y.m3359nB(c1212We, C1212We.f3959h[14], booleanValue);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        return Boolean.valueOf(C1212We.f3968y.m3358O4(c1212We, C1212We.f3959h[14]).booleanValue());
    }
}
