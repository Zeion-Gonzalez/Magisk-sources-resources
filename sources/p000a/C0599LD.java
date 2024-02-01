package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.LD */
/* loaded from: classes.dex */
public final class C0599LD extends AbstractC1378Zn {

    /* renamed from: I */
    public static final C0599LD f1922I = new C0599LD();

    /* renamed from: q */
    public static final C0639M1 f1923q = new C0639M1(R.string.zygisk);

    public C0599LD() {
        super(1);
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        boolean z;
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        if (Boolean.valueOf(C1212We.f3944J.m2370z(c1212We, C1212We.f3959h[22]).booleanValue()).booleanValue() != C1910jw.f5961W) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C0639M1(R.string.reboot_apply_change);
        }
        return new C0639M1(R.string.settings_zygisk_summary);
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f1923q;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3944J.mo2369v(c1212We, C1212We.f3959h[22], booleanValue);
        C1611eJ c1611eJ = C1611eJ.f4940I;
        c1611eJ.m3848g(booleanValue);
        C1855iy.f5788w.m3848g(booleanValue);
        AbstractC0795Op.m1801B(this, 8);
        AbstractC0795Op.m1801B(c1611eJ, 8);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        return Boolean.valueOf(C1212We.f3944J.m2370z(c1212We, C1212We.f3959h[22]).booleanValue());
    }
}
