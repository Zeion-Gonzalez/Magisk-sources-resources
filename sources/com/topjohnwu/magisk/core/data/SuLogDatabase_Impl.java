package com.topjohnwu.magisk.core.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.AbstractC0594L7;
import p000a.C0073BQ;
import p000a.C0490JF;
import p000a.C1710g8;
import p000a.C1999lb;
import p000a.C2213pi;
import p000a.C2261qZ;
import p000a.C2605x2;
import p000a.InterfaceC0771ON;
import p000a.InterfaceC1136VG;

/* loaded from: classes.dex */
public final class SuLogDatabase_Impl extends SuLogDatabase {

    /* renamed from: R */
    public volatile C1999lb f9569R;

    @Override // p000a.AbstractC1687fj
    /* renamed from: N */
    public final InterfaceC0771ON mo3182N(C2605x2 c2605x2) {
        C0490JF c0490jf = new C0490JF(c2605x2, new C0073BQ(this));
        ((C1710g8) c2605x2.f8038v).getClass();
        return new C2261qZ(c2605x2.f8039z, c2605x2.f8035h, c0490jf);
    }

    @Override // p000a.AbstractC1687fj
    /* renamed from: P */
    public final C2213pi mo3183P() {
        return new C2213pi(this, new HashMap(0), new HashMap(0), "logs");
    }

    @Override // p000a.AbstractC1687fj
    /* renamed from: Q */
    public final List mo3184Q() {
        return new ArrayList();
    }

    @Override // p000a.AbstractC1687fj
    /* renamed from: o */
    public final Map mo3189o() {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC0594L7.class, Collections.emptyList());
        return hashMap;
    }

    @Override // p000a.AbstractC1687fj
    /* renamed from: u */
    public final Set mo3190u() {
        return new HashSet();
    }

    @Override // p000a.AbstractC1687fj
    /* renamed from: v */
    public final void mo3191v() {
        m3192z();
        InterfaceC0771ON interfaceC0771ON = this.f5278P;
        InterfaceC0771ON interfaceC0771ON2 = null;
        if (interfaceC0771ON == null) {
            interfaceC0771ON = null;
        }
        InterfaceC1136VG mo1790l = interfaceC0771ON.mo1790l();
        try {
            m3192z();
            m3180G();
            mo1790l.mo1948s("DELETE FROM `logs`");
            InterfaceC0771ON interfaceC0771ON3 = this.f5278P;
            if (interfaceC0771ON3 != null) {
                interfaceC0771ON2 = interfaceC0771ON3;
            }
            interfaceC0771ON2.mo1790l().mo1943e();
        } finally {
            m3181M();
            mo1790l.mo1939HL("PRAGMA wal_checkpoint(FULL)").close();
            if (!mo1790l.mo1950zx()) {
                mo1790l.mo1948s("VACUUM");
            }
        }
    }

    @Override // com.topjohnwu.magisk.core.data.SuLogDatabase
    /* renamed from: w */
    public final AbstractC0594L7 mo5128w() {
        C1999lb c1999lb;
        if (this.f9569R != null) {
            return this.f9569R;
        }
        synchronized (this) {
            if (this.f9569R == null) {
                this.f9569R = new C1999lb(this);
            }
            c1999lb = this.f9569R;
        }
        return c1999lb;
    }
}
