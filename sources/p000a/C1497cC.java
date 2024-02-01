package p000a;

import android.os.Build;
import com.topjohnwu.magisk.R;

/* renamed from: a.cC */
/* loaded from: classes.dex */
public final class C1497cC extends AbstractC1378Zn {

    /* renamed from: I */
    public static final C1497cC f4645I = new C1497cC();

    /* renamed from: q */
    public static final C0639M1 f4647q = new C0639M1(R.string.settings_su_reauth_title);

    /* renamed from: k */
    public static final C0639M1 f4646k = new C0639M1(R.string.settings_su_reauth_summary);

    static {
        C1212We c1212We = C1212We.f3969z;
    }

    public C1497cC() {
        super(1);
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        return f4646k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f4647q;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: k */
    public final void mo2844k() {
        boolean z;
        if (Build.VERSION.SDK_INT < 26) {
            C1910jw c1910jw = C1910jw.f5967z;
            if (C1910jw.m3542v()) {
                z = true;
                m3848g(z);
            }
        }
        z = false;
        m3848g(z);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3962q.m3359nB(c1212We, C1212We.f3959h[11], booleanValue);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        return Boolean.valueOf(C1212We.f3962q.m3358O4(c1212We, C1212We.f3959h[11]).booleanValue());
    }
}
