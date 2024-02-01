package p000a;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: a.dE */
/* loaded from: classes.dex */
public final class C1553dE implements InterfaceC1546d7, InterfaceC0670Mg, InterfaceC0699NC, InterfaceC0277FG {

    /* renamed from: f */
    public static final /* synthetic */ int f4787f = 0;

    /* renamed from: E */
    public EnumC1632eh f4788E;

    /* renamed from: I */
    public EnumC1632eh f4789I;

    /* renamed from: R */
    public C1420ag f4790R;

    /* renamed from: S */
    public final Context f4791S;

    /* renamed from: U */
    public boolean f4792U;

    /* renamed from: g */
    public final Bundle f4793g;

    /* renamed from: k */
    public final String f4794k;

    /* renamed from: q */
    public final InterfaceC1585dr f4795q;

    /* renamed from: w */
    public final Bundle f4797w;

    /* renamed from: y */
    public final C0326GG f4798y = new C0326GG(this);

    /* renamed from: s */
    public final C1330Yx f4796s = new C1330Yx(this);

    static {
        new C1665fK(29, 0);
    }

    public C1553dE(Context context, C1420ag c1420ag, Bundle bundle, EnumC1632eh enumC1632eh, InterfaceC1585dr interfaceC1585dr, String str, Bundle bundle2) {
        this.f4791S = context;
        this.f4790R = c1420ag;
        this.f4797w = bundle;
        this.f4789I = enumC1632eh;
        this.f4795q = interfaceC1585dr;
        this.f4794k = str;
        this.f4793g = bundle2;
        C1146VR c1146vr = new C1146VR(new C1498cF(this));
        this.f4788E = EnumC1632eh.f5088R;
        C2643xq c2643xq = (C2643xq) c1146vr.getValue();
    }

    @Override // p000a.InterfaceC1546d7
    /* renamed from: C */
    public final C0326GG mo1354C() {
        return this.f4798y;
    }

    @Override // p000a.InterfaceC0670Mg
    /* renamed from: G */
    public final C2145oS mo1569G() {
        boolean z;
        if (this.f4792U) {
            if (this.f4798y.f1105P != EnumC1632eh.f5089S) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                InterfaceC1585dr interfaceC1585dr = this.f4795q;
                if (interfaceC1585dr != null) {
                    LinkedHashMap linkedHashMap = ((C0401Hd) interfaceC1585dr).f1353I;
                    String str = this.f4794k;
                    C2145oS c2145oS = (C2145oS) linkedHashMap.get(str);
                    if (c2145oS == null) {
                        C2145oS c2145oS2 = new C2145oS();
                        linkedHashMap.put(str, c2145oS2);
                        return c2145oS2;
                    }
                    return c2145oS;
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    /* renamed from: N */
    public final void m3021N() {
        if (!this.f4792U) {
            C1330Yx c1330Yx = this.f4796s;
            c1330Yx.m2713z();
            this.f4792U = true;
            if (this.f4795q != null) {
                AbstractC1843ih.m3402E(this);
            }
            c1330Yx.m2711h(this.f4793g);
        }
        this.f4798y.m726u(this.f4789I.ordinal() < this.f4788E.ordinal() ? this.f4789I : this.f4788E);
    }

    /* renamed from: P */
    public final void m3022P(EnumC1632eh enumC1632eh) {
        this.f4788E = enumC1632eh;
        m3021N();
    }

    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L7d
            boolean r1 = r7 instanceof p000a.C1553dE
            if (r1 != 0) goto L9
            goto L7d
        L9:
            a.dE r7 = (p000a.C1553dE) r7
            java.lang.String r1 = r7.f4794k
            java.lang.String r2 = r6.f4794k
            boolean r1 = p000a.AbstractC1292YB.m2695u(r2, r1)
            if (r1 == 0) goto L7d
            a.ag r1 = r6.f4790R
            a.ag r2 = r7.f4790R
            boolean r1 = p000a.AbstractC1292YB.m2695u(r1, r2)
            if (r1 == 0) goto L7d
            a.GG r1 = r6.f4798y
            a.GG r2 = r7.f4798y
            boolean r1 = p000a.AbstractC1292YB.m2695u(r1, r2)
            if (r1 == 0) goto L7d
            a.Yx r1 = r6.f4796s
            a.kN r1 = r1.f4218h
            a.Yx r2 = r7.f4796s
            a.kN r2 = r2.f4218h
            boolean r1 = p000a.AbstractC1292YB.m2695u(r1, r2)
            if (r1 == 0) goto L7d
            android.os.Bundle r1 = r6.f4797w
            android.os.Bundle r7 = r7.f4797w
            boolean r2 = p000a.AbstractC1292YB.m2695u(r1, r7)
            r3 = 1
            if (r2 != 0) goto L7c
            if (r1 == 0) goto L79
            java.util.Set r2 = r1.keySet()
            if (r2 == 0) goto L79
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L52
        L50:
            r7 = r3
            goto L75
        L52:
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L50
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            if (r7 == 0) goto L6d
            java.lang.Object r4 = r7.get(r4)
            goto L6e
        L6d:
            r4 = 0
        L6e:
            boolean r4 = p000a.AbstractC1292YB.m2695u(r5, r4)
            if (r4 != 0) goto L56
            r7 = r0
        L75:
            if (r7 != r3) goto L79
            r7 = r3
            goto L7a
        L79:
            r7 = r0
        L7a:
            if (r7 == 0) goto L7d
        L7c:
            r0 = r3
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1553dE.equals(java.lang.Object):boolean");
    }

    @Override // p000a.InterfaceC0277FG
    /* renamed from: h */
    public final C1934kN mo576h() {
        return this.f4796s.f4218h;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = this.f4790R.hashCode() + (this.f4794k.hashCode() * 31);
        Bundle bundle = this.f4797w;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i2 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        return this.f4796s.f4218h.hashCode() + ((this.f4798y.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1553dE.class.getSimpleName());
        sb.append("(" + this.f4794k + ')');
        sb.append(" destination=");
        sb.append(this.f4790R);
        return sb.toString();
    }

    /* renamed from: v */
    public final Bundle m3023v() {
        Bundle bundle = this.f4797w;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // p000a.InterfaceC0699NC
    /* renamed from: z */
    public final C0945Rm mo1635z() {
        C0945Rm c0945Rm = new C0945Rm(0);
        Context context = this.f4791S;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c0945Rm.m2110h(C1710g8.f5383s, application);
        }
        c0945Rm.m2110h(AbstractC1843ih.f5745I, this);
        c0945Rm.m2110h(AbstractC1843ih.f5757q, this);
        Bundle m3023v = m3023v();
        if (m3023v != null) {
            c0945Rm.m2110h(AbstractC1843ih.f5755k, m3023v);
        }
        return c0945Rm;
    }
}
