package p000a;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: a.kN */
/* loaded from: classes.dex */
public final class C1934kN {

    /* renamed from: N */
    public C0521Jo f5998N;

    /* renamed from: P */
    public boolean f5999P;

    /* renamed from: h */
    public boolean f6001h;

    /* renamed from: v */
    public Bundle f6002v;

    /* renamed from: z */
    public final C1789hf f6003z = new C1789hf();

    /* renamed from: Q */
    public boolean f6000Q = true;

    /* renamed from: P */
    public final void m3552P() {
        if (this.f6000Q) {
            C0521Jo c0521Jo = this.f5998N;
            if (c0521Jo == null) {
                c0521Jo = new C0521Jo(this);
            }
            this.f5998N = c0521Jo;
            try {
                C0181DW.class.getDeclaredConstructor(new Class[0]);
                C0521Jo c0521Jo2 = this.f5998N;
                if (c0521Jo2 != null) {
                    ((Set) c0521Jo2.f1739h).add(C0181DW.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + C0181DW.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    /* renamed from: h */
    public final InterfaceC0924RO m3553h() {
        String str;
        InterfaceC0924RO interfaceC0924RO;
        Iterator it = this.f6003z.iterator();
        do {
            AbstractC1712gB abstractC1712gB = (AbstractC1712gB) it;
            if (!abstractC1712gB.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) abstractC1712gB.next();
            str = (String) entry.getKey();
            interfaceC0924RO = (InterfaceC0924RO) entry.getValue();
        } while (!AbstractC1292YB.m2695u(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0924RO;
    }

    /* renamed from: v */
    public final void m3554v(String str, InterfaceC0924RO interfaceC0924RO) {
        if (!(((InterfaceC0924RO) this.f6003z.mo2924v(str, interfaceC0924RO)) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: z */
    public final Bundle m3555z(String str) {
        if (!this.f5999P) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f6002v;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f6002v;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f6002v;
        if (!((bundle4 == null || bundle4.isEmpty()) ? false : true)) {
            this.f6002v = null;
        }
        return bundle2;
    }
}
