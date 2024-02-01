package p000a;

import android.os.Bundle;
import java.util.Map;

/* renamed from: a.Ph */
/* loaded from: classes.dex */
public final class C0842Ph implements InterfaceC0924RO {

    /* renamed from: P */
    public final C1146VR f2840P;

    /* renamed from: h */
    public boolean f2841h;

    /* renamed from: v */
    public Bundle f2842v;

    /* renamed from: z */
    public final C1934kN f2843z;

    public C0842Ph(C1934kN c1934kN, InterfaceC0670Mg interfaceC0670Mg) {
        this.f2843z = c1934kN;
        this.f2840P = new C1146VR(new C1407aQ(0, interfaceC0670Mg));
    }

    /* renamed from: h */
    public final void m1959h() {
        if (!this.f2841h) {
            Bundle m3555z = this.f2843z.m3555z("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f2842v;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (m3555z != null) {
                bundle.putAll(m3555z);
            }
            this.f2842v = bundle;
            this.f2841h = true;
            C1483bu c1483bu = (C1483bu) this.f2840P.getValue();
        }
    }

    @Override // p000a.InterfaceC0924RO
    /* renamed from: z */
    public final Bundle mo1153z() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2842v;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C1483bu) this.f2840P.getValue()).f4622I.entrySet()) {
            String str = (String) entry.getKey();
            Bundle mo1153z = ((C0827PQ) entry.getValue()).f2806N.mo1153z();
            if (!AbstractC1292YB.m2695u(mo1153z, Bundle.EMPTY)) {
                bundle.putBundle(str, mo1153z);
            }
        }
        this.f2841h = false;
        return bundle;
    }
}
