package p000a;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;

/* renamed from: a.Yx */
/* loaded from: classes.dex */
public final class C1330Yx {

    /* renamed from: h */
    public final C1934kN f4218h = new C1934kN();

    /* renamed from: v */
    public boolean f4219v;

    /* renamed from: z */
    public final InterfaceC0277FG f4220z;

    public C1330Yx(InterfaceC0277FG interfaceC0277FG) {
        this.f4220z = interfaceC0277FG;
    }

    /* renamed from: h */
    public final void m2711h(Bundle bundle) {
        Bundle bundle2;
        if (!this.f4219v) {
            m2713z();
        }
        C0326GG mo1354C = this.f4220z.mo1354C();
        if ((!mo1354C.f1105P.m3117z(EnumC1632eh.f5087I)) != false) {
            C1934kN c1934kN = this.f4218h;
            if (c1934kN.f6001h) {
                if ((!c1934kN.f5999P) != false) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    c1934kN.f6002v = bundle2;
                    c1934kN.f5999P = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + mo1354C.f1105P).toString());
    }

    /* renamed from: v */
    public final void m2712v(Bundle bundle) {
        C1934kN c1934kN = this.f4218h;
        c1934kN.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c1934kN.f6002v;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1789hf c1789hf = c1934kN.f6003z;
        c1789hf.getClass();
        C1566dR c1566dR = new C1566dR(c1789hf);
        c1789hf.f5621w.put(c1566dR, Boolean.FALSE);
        while (c1566dR.hasNext()) {
            Map.Entry entry = (Map.Entry) c1566dR.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0924RO) entry.getValue()).mo1153z());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    /* renamed from: z */
    public final void m2713z() {
        boolean z;
        InterfaceC0277FG interfaceC0277FG = this.f4220z;
        C0326GG mo1354C = interfaceC0277FG.mo1354C();
        if (mo1354C.f1105P == EnumC1632eh.f5088R) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo1354C.mo728z(new Recreator(interfaceC0277FG));
            C1934kN c1934kN = this.f4218h;
            if ((!c1934kN.f6001h) != false) {
                mo1354C.mo728z(new C1871jG(2, c1934kN));
                c1934kN.f6001h = true;
                this.f4219v = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }
}
