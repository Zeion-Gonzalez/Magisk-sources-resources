package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.eJ */
/* loaded from: classes.dex */
public final class C1611eJ extends AbstractC1378Zn {

    /* renamed from: k */
    public static boolean f4941k;

    /* renamed from: I */
    public static final C1611eJ f4940I = new C1611eJ();

    /* renamed from: q */
    public static final C0639M1 f4942q = new C0639M1(R.string.settings_denylist_title);

    static {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        f4941k = C1212We.f3955c.m2370z(c1212We, C1212We.f3959h[23]).booleanValue();
    }

    public C1611eJ() {
        super(1);
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        boolean z = false;
        if (this.f6780R) {
            C1212We c1212We = C1212We.f3969z;
            c1212We.getClass();
            if (Boolean.valueOf(C1212We.f3944J.m2370z(c1212We, C1212We.f3959h[22]).booleanValue()).booleanValue() != C1910jw.f5961W) {
                z = true;
            }
            if (z) {
                return new C0639M1(R.string.reboot_apply_change);
            }
            return new C0639M1(R.string.settings_denylist_summary);
        }
        return AbstractC1292YB.m2687o(R.string.settings_denylist_error, new C0639M1(R.string.zygisk));
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f4942q;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: k */
    public final void mo2844k() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        m3848g(Boolean.valueOf(C1212We.f3944J.m2370z(c1212We, C1212We.f3959h[22]).booleanValue()).booleanValue());
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        String str;
        final boolean booleanValue = ((Boolean) obj).booleanValue();
        f4941k = booleanValue;
        if (booleanValue) {
            str = "enable";
        } else {
            str = "disable";
        }
        AbstractC0017AI.m44z("magisk --denylist ".concat(str)).m4631d2(new InterfaceC2487ut() { // from class: a.wK
            @Override // p000a.InterfaceC2487ut
            /* renamed from: h */
            public final void mo57h(AbstractC1823iK abstractC1823iK) {
                boolean m3380z = abstractC1823iK.m3380z();
                boolean z = booleanValue;
                if (m3380z) {
                    C1212We c1212We = C1212We.f3969z;
                    c1212We.getClass();
                    C1212We.f3955c.mo2369v(c1212We, C1212We.f3959h[23], z);
                    return;
                }
                C1611eJ.f4941k = !z;
                C1611eJ c1611eJ = C1611eJ.f4940I;
                c1611eJ.getClass();
                AbstractC0795Op.m1801B(c1611eJ, 4);
            }
        });
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        return Boolean.valueOf(f4941k);
    }
}
