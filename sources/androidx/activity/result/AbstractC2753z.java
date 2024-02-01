package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p000a.AbstractC0226EI;
import p000a.AbstractC2575wW;
import p000a.C0326GG;
import p000a.C0693N6;
import p000a.C0801Ox;
import p000a.C1440b0;
import p000a.C1781hV;
import p000a.C2052mg;
import p000a.C2055mj;
import p000a.C2300rJ;
import p000a.EnumC1632eh;
import p000a.EnumC2241qF;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1468bb;
import p000a.InterfaceC1546d7;

/* renamed from: androidx.activity.result.z */
/* loaded from: classes.dex */
public abstract class AbstractC2753z {

    /* renamed from: z */
    public final HashMap f8651z = new HashMap();

    /* renamed from: h */
    public final HashMap f8648h = new HashMap();

    /* renamed from: v */
    public final HashMap f8650v = new HashMap();

    /* renamed from: P */
    public ArrayList f8646P = new ArrayList();

    /* renamed from: N */
    public final transient HashMap f8645N = new HashMap();

    /* renamed from: Q */
    public final HashMap f8647Q = new HashMap();

    /* renamed from: u */
    public final Bundle f8649u = new Bundle();

    /* renamed from: N */
    public final void m4686N(String str) {
        int mo435z;
        HashMap hashMap;
        HashMap hashMap2 = this.f8648h;
        if (((Integer) hashMap2.get(str)) != null) {
            return;
        }
        do {
            mo435z = AbstractC0226EI.f740S.mo435z(2147418112) + 65536;
            hashMap = this.f8651z;
        } while (hashMap.containsKey(Integer.valueOf(mo435z)));
        hashMap.put(Integer.valueOf(mo435z), str);
        hashMap2.put(str, Integer.valueOf(mo435z));
    }

    /* renamed from: P */
    public final C2300rJ m4687P(final String str, InterfaceC1546d7 interfaceC1546d7, final C0693N6 c0693n6, final C2055mj c2055mj) {
        C0326GG mo1354C = interfaceC1546d7.mo1354C();
        if (!mo1354C.f1105P.m3117z(EnumC1632eh.f5087I)) {
            m4686N(str);
            HashMap hashMap = this.f8650v;
            C1781hV c1781hV = (C1781hV) hashMap.get(str);
            if (c1781hV == null) {
                c1781hV = new C1781hV(mo1354C);
            }
            InterfaceC1270Xo interfaceC1270Xo = new InterfaceC1270Xo() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // p000a.InterfaceC1270Xo
                /* renamed from: Q */
                public final void mo2596Q(InterfaceC1546d7 interfaceC1546d72, EnumC2241qF enumC2241qF) {
                    boolean equals = EnumC2241qF.ON_START.equals(enumC2241qF);
                    String str2 = str;
                    AbstractC2753z abstractC2753z = AbstractC2753z.this;
                    if (!equals) {
                        if (EnumC2241qF.ON_STOP.equals(enumC2241qF)) {
                            abstractC2753z.f8645N.remove(str2);
                            return;
                        } else {
                            if (EnumC2241qF.ON_DESTROY.equals(enumC2241qF)) {
                                abstractC2753z.m4688Q(str2);
                                return;
                            }
                            return;
                        }
                    }
                    HashMap hashMap2 = abstractC2753z.f8645N;
                    InterfaceC1468bb interfaceC1468bb = c2055mj;
                    AbstractC2575wW abstractC2575wW = c0693n6;
                    hashMap2.put(str2, new C0801Ox(interfaceC1468bb, abstractC2575wW));
                    HashMap hashMap3 = abstractC2753z.f8647Q;
                    if (hashMap3.containsKey(str2)) {
                        Object obj = hashMap3.get(str2);
                        hashMap3.remove(str2);
                        interfaceC1468bb.mo2259h(obj);
                    }
                    Bundle bundle = abstractC2753z.f8649u;
                    C1440b0 c1440b0 = (C1440b0) bundle.getParcelable(str2);
                    if (c1440b0 != null) {
                        bundle.remove(str2);
                        interfaceC1468bb.mo2259h(abstractC2575wW.mo1610HL(c1440b0.f4512R, c1440b0.f4513S));
                    }
                }
            };
            c1781hV.f5604z.mo728z(interfaceC1270Xo);
            c1781hV.f5603h.add(interfaceC1270Xo);
            hashMap.put(str, c1781hV);
            return new C2300rJ(this, str, c0693n6, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + interfaceC1546d7 + " is attempting to register while current state is " + mo1354C.f1105P + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: Q */
    public final void m4688Q(String str) {
        Integer num;
        if (!this.f8646P.contains(str) && (num = (Integer) this.f8648h.remove(str)) != null) {
            this.f8651z.remove(num);
        }
        this.f8645N.remove(str);
        HashMap hashMap = this.f8647Q;
        if (hashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.f8649u;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f8650v;
        C1781hV c1781hV = (C1781hV) hashMap2.get(str);
        if (c1781hV != null) {
            ArrayList arrayList = c1781hV.f5603h;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c1781hV.f5604z.mo724h((InterfaceC1270Xo) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }

    /* renamed from: h */
    public abstract void mo2148h(int i, AbstractC2575wW abstractC2575wW, Object obj);

    /* renamed from: v */
    public final C2300rJ m4689v(String str, AbstractC2575wW abstractC2575wW, C2052mg c2052mg) {
        m4686N(str);
        this.f8645N.put(str, new C0801Ox(c2052mg, abstractC2575wW));
        HashMap hashMap = this.f8647Q;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            c2052mg.mo2259h(obj);
        }
        Bundle bundle = this.f8649u;
        C1440b0 c1440b0 = (C1440b0) bundle.getParcelable(str);
        if (c1440b0 != null) {
            bundle.remove(str);
            c2052mg.mo2259h(abstractC2575wW.mo1610HL(c1440b0.f4512R, c1440b0.f4513S));
        }
        return new C2300rJ(this, str, abstractC2575wW, 1);
    }

    /* renamed from: z */
    public final boolean m4690z(int i, int i2, Intent intent) {
        InterfaceC1468bb interfaceC1468bb;
        String str = (String) this.f8651z.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0801Ox c0801Ox = (C0801Ox) this.f8645N.get(str);
        if (c0801Ox != null && (interfaceC1468bb = c0801Ox.f2738z) != null && this.f8646P.contains(str)) {
            interfaceC1468bb.mo2259h(c0801Ox.f2737h.mo1610HL(intent, i2));
            this.f8646P.remove(str);
            return true;
        }
        this.f8647Q.remove(str);
        this.f8649u.putParcelable(str, new C1440b0(intent, i2));
        return true;
    }
}
