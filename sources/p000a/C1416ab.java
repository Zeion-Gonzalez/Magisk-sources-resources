package p000a;

import android.app.KeyguardManager;
import com.topjohnwu.magisk.R;

/* renamed from: a.ab */
/* loaded from: classes.dex */
public final class C1416ab extends AbstractC1378Zn {

    /* renamed from: I */
    public static final C1416ab f4434I = new C1416ab();

    /* renamed from: q */
    public static final C0639M1 f4436q = new C0639M1(R.string.settings_su_auth_title);

    /* renamed from: k */
    public static AbstractC2222pt f4435k = new C0639M1(R.string.settings_su_auth_summary);

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    public C1416ab() {
        super(1);
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        return f4435k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f4436q;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: k */
    public final void mo2844k() {
        C1910jw c1910jw = C1910jw.f5967z;
        m3848g(((KeyguardManager) AbstractC1743gn.m3275z().getSystemService(KeyguardManager.class)).isDeviceSecure());
        if (!this.f6780R) {
            f4435k = new C0639M1(R.string.settings_su_auth_insecure);
        }
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3954Y.mo2369v(c1212We, C1212We.f3959h[21], booleanValue);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        return Boolean.valueOf(C1212We.f3969z.m2498Q());
    }
}
