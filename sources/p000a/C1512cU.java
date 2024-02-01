package p000a;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: a.cU */
/* loaded from: classes.dex */
public final class C1512cU {

    /* renamed from: P */
    public boolean f4668P;

    /* renamed from: h */
    public String[] f4669h;

    /* renamed from: v */
    public String[] f4670v;

    /* renamed from: z */
    public final boolean f4671z;

    public C1512cU() {
        this.f4671z = true;
    }

    /* renamed from: N */
    public final void m2930N(EnumC1213Wf... enumC1213WfArr) {
        if (this.f4671z) {
            ArrayList arrayList = new ArrayList(enumC1213WfArr.length);
            for (EnumC1213Wf enumC1213Wf : enumC1213WfArr) {
                arrayList.add(enumC1213Wf.f3975S);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            m2932Q((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    /* renamed from: P */
    public final void m2931P() {
        if (!this.f4671z) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        this.f4668P = true;
    }

    /* renamed from: Q */
    public final void m2932Q(String... strArr) {
        if (!this.f4671z) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        if ((!(strArr.length == 0)) != true) {
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        this.f4670v = (String[]) strArr.clone();
    }

    /* renamed from: h */
    public final void m2933h(C0280FK... c0280fkArr) {
        if (this.f4671z) {
            ArrayList arrayList = new ArrayList(c0280fkArr.length);
            for (C0280FK c0280fk : c0280fkArr) {
                arrayList.add(c0280fk.f981z);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            m2934v((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    /* renamed from: v */
    public final void m2934v(String... strArr) {
        if (!this.f4671z) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        if ((!(strArr.length == 0)) != true) {
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        this.f4669h = (String[]) strArr.clone();
    }

    /* renamed from: z */
    public final C0673Mk m2935z() {
        return new C0673Mk(this.f4671z, this.f4668P, this.f4669h, this.f4670v);
    }

    public C1512cU(C0673Mk c0673Mk) {
        this.f4671z = c0673Mk.f2224z;
        this.f4669h = c0673Mk.f2223v;
        this.f4670v = c0673Mk.f2221P;
        this.f4668P = c0673Mk.f2222h;
    }
}
