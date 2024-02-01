package p000a;

import androidx.lifecycle.C2765z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: a.GG */
/* loaded from: classes.dex */
public final class C0326GG extends AbstractC0783OZ {

    /* renamed from: N */
    public final WeakReference f1104N;

    /* renamed from: Q */
    public int f1106Q;

    /* renamed from: o */
    public boolean f1109o;

    /* renamed from: u */
    public boolean f1110u;

    /* renamed from: h */
    public final boolean f1108h = true;

    /* renamed from: v */
    public C1507cP f1111v = new C1507cP();

    /* renamed from: P */
    public EnumC1632eh f1105P = EnumC1632eh.f5088R;

    /* renamed from: W */
    public final ArrayList f1107W = new ArrayList();

    public C0326GG(InterfaceC1546d7 interfaceC1546d7) {
        this.f1104N = new WeakReference(interfaceC1546d7);
    }

    /* renamed from: N */
    public final void m721N(EnumC2241qF enumC2241qF) {
        m722P("handleLifecycleEvent");
        m723Q(enumC2241qF.m3881z());
    }

    /* renamed from: P */
    public final void m722P(String str) {
        if (this.f1108h && !C2146oU.m3764nB().m3766d3()) {
            throw new IllegalStateException(AbstractC2441tz.m4184G("Method ", str, " must be called on the main thread").toString());
        }
    }

    /* renamed from: Q */
    public final void m723Q(EnumC1632eh enumC1632eh) {
        EnumC1632eh enumC1632eh2 = this.f1105P;
        if (enumC1632eh2 == enumC1632eh) {
            return;
        }
        EnumC1632eh enumC1632eh3 = EnumC1632eh.f5088R;
        EnumC1632eh enumC1632eh4 = EnumC1632eh.f5089S;
        if (!((enumC1632eh2 == enumC1632eh3 && enumC1632eh == enumC1632eh4) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f1105P + " in component " + this.f1104N.get()).toString());
        }
        this.f1105P = enumC1632eh;
        if (this.f1110u || this.f1106Q != 0) {
            this.f1109o = true;
            return;
        }
        this.f1110u = true;
        m725o();
        this.f1110u = false;
        if (this.f1105P == enumC1632eh4) {
            this.f1111v = new C1507cP();
        }
    }

    @Override // p000a.AbstractC0783OZ
    /* renamed from: h */
    public final void mo724h(InterfaceC2630xV interfaceC2630xV) {
        m722P("removeObserver");
        this.f1111v.mo2922P(interfaceC2630xV);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0175 A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m725o() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0326GG.m725o():void");
    }

    /* renamed from: u */
    public final void m726u(EnumC1632eh enumC1632eh) {
        m722P("setCurrentState");
        m723Q(enumC1632eh);
    }

    /* renamed from: v */
    public final EnumC1632eh m727v(InterfaceC2630xV interfaceC2630xV) {
        C0513Jg c0513Jg;
        EnumC1632eh enumC1632eh;
        C2765z c2765z;
        C1507cP c1507cP = this.f1111v;
        EnumC1632eh enumC1632eh2 = null;
        if (c1507cP.f4660q.containsKey(interfaceC2630xV)) {
            c0513Jg = ((C0513Jg) c1507cP.f4660q.get(interfaceC2630xV)).f1704I;
        } else {
            c0513Jg = null;
        }
        if (c0513Jg != null && (c2765z = (C2765z) c0513Jg.f1705R) != null) {
            enumC1632eh = c2765z.f9025z;
        } else {
            enumC1632eh = null;
        }
        ArrayList arrayList = this.f1107W;
        if ((!arrayList.isEmpty()) != false) {
            enumC1632eh2 = (EnumC1632eh) arrayList.get(arrayList.size() - 1);
        }
        EnumC1632eh enumC1632eh3 = this.f1105P;
        if (enumC1632eh == null || enumC1632eh.compareTo(enumC1632eh3) >= 0) {
            enumC1632eh = enumC1632eh3;
        }
        if (enumC1632eh2 == null || enumC1632eh2.compareTo(enumC1632eh) >= 0) {
            return enumC1632eh;
        }
        return enumC1632eh2;
    }

    @Override // p000a.AbstractC0783OZ
    /* renamed from: z */
    public final void mo728z(InterfaceC2630xV interfaceC2630xV) {
        InterfaceC1546d7 interfaceC1546d7;
        boolean z;
        EnumC2241qF enumC2241qF;
        m722P("addObserver");
        EnumC1632eh enumC1632eh = this.f1105P;
        EnumC1632eh enumC1632eh2 = EnumC1632eh.f5089S;
        if (enumC1632eh != enumC1632eh2) {
            enumC1632eh2 = EnumC1632eh.f5088R;
        }
        C2765z c2765z = new C2765z(interfaceC2630xV, enumC1632eh2);
        if (((C2765z) this.f1111v.mo2924v(interfaceC2630xV, c2765z)) != null || (interfaceC1546d7 = (InterfaceC1546d7) this.f1104N.get()) == null) {
            return;
        }
        if (this.f1106Q == 0 && !this.f1110u) {
            z = false;
        } else {
            z = true;
        }
        EnumC1632eh m727v = m727v(interfaceC2630xV);
        this.f1106Q++;
        while (c2765z.f9025z.compareTo(m727v) < 0 && this.f1111v.f4660q.containsKey(interfaceC2630xV)) {
            EnumC1632eh enumC1632eh3 = c2765z.f9025z;
            ArrayList arrayList = this.f1107W;
            arrayList.add(enumC1632eh3);
            C2181p5 c2181p5 = EnumC2241qF.Companion;
            EnumC1632eh enumC1632eh4 = c2765z.f9025z;
            c2181p5.getClass();
            int ordinal = enumC1632eh4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        enumC2241qF = null;
                    } else {
                        enumC2241qF = EnumC2241qF.ON_RESUME;
                    }
                } else {
                    enumC2241qF = EnumC2241qF.ON_START;
                }
            } else {
                enumC2241qF = EnumC2241qF.ON_CREATE;
            }
            if (enumC2241qF != null) {
                c2765z.m4849z(interfaceC1546d7, enumC2241qF);
                arrayList.remove(arrayList.size() - 1);
                m727v = m727v(interfaceC2630xV);
            } else {
                throw new IllegalStateException("no event up from " + c2765z.f9025z);
            }
        }
        if (!z) {
            m725o();
        }
        this.f1106Q--;
    }
}
