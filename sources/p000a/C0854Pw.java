package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.Pw */
/* loaded from: classes.dex */
public final class C0854Pw extends AbstractC1378Zn {

    /* renamed from: I */
    public static final C0854Pw f2889I = new C0854Pw();

    /* renamed from: q */
    public static final C0639M1 f2891q = new C0639M1(R.string.settings_check_update_title);

    /* renamed from: k */
    public static final C0639M1 f2890k = new C0639M1(R.string.settings_check_update_summary);

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    public C0854Pw() {
        super(1);
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        return f2890k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f2891q;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        C1212We.f3969z.m2500u(((Boolean) obj).booleanValue());
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        return Boolean.valueOf(C1212We.f3969z.m2502z());
    }
}
