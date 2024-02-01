package p000a;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.LinkedHashSet;

/* renamed from: a.EK */
/* loaded from: classes.dex */
public abstract class AbstractC0227EK {

    /* renamed from: h */
    public Object f741h;

    /* renamed from: v */
    public final Object f742v;

    /* renamed from: z */
    public final /* synthetic */ int f743z = 1;

    public AbstractC0227EK(LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6) {
        this.f742v = layoutInflaterFactory2C1392a6;
    }

    /* renamed from: G */
    public final boolean m436G() {
        int m3420P = AbstractC1843ih.m3420P(((AbstractC0204Du) this.f741h).f620v.f7222t);
        int i = ((AbstractC0204Du) this.f741h).f621z;
        if (m3420P != i && (m3420P == 2 || i == 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public abstract void mo437M();

    /* renamed from: N */
    public final AbstractC1593e m438N(byte[] bArr) {
        AbstractC1593e m3067q = AbstractC1593e.m3067q(bArr);
        m447z(m3067q);
        return m3067q;
    }

    /* renamed from: P */
    public abstract IntentFilter mo439P();

    /* renamed from: Q */
    public AbstractC1593e mo440Q(AbstractC1333Z abstractC1333Z) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    /* renamed from: V */
    public final void m441V() {
        m443h();
        IntentFilter mo439P = mo439P();
        if (mo439P == null || mo439P.countActions() == 0) {
            return;
        }
        if (((BroadcastReceiver) this.f741h) == null) {
            this.f741h = new C1766hB(0, this);
        }
        ((LayoutInflaterFactory2C1392a6) this.f742v).f4342E.registerReceiver((BroadcastReceiver) this.f741h, mo439P);
    }

    /* renamed from: W */
    public final AbstractC1593e m442W(AbstractC1857j abstractC1857j, boolean z) {
        AbstractC1593e mo440Q;
        if (128 == abstractC1857j.f5792R) {
            InterfaceC0959S interfaceC0959S = abstractC1857j.f5791I;
            if (z) {
                if (abstractC1857j.m3474U()) {
                    mo440Q = interfaceC0959S.mo302N();
                    m447z(mo440Q);
                } else {
                    throw new IllegalStateException("object explicit - implicit expected.");
                }
            } else {
                int i = abstractC1857j.f5793S;
                if (1 != i) {
                    AbstractC1593e mo302N = interfaceC0959S.mo302N();
                    if (i != 3) {
                        if (i != 4) {
                            m447z(mo302N);
                            mo440Q = mo302N;
                        } else if (mo302N instanceof AbstractC1333Z) {
                            mo440Q = mo440Q((AbstractC1333Z) mo302N);
                        } else {
                            mo440Q = mo445u((C1745gp) mo302N);
                        }
                    } else {
                        mo440Q = mo440Q(abstractC1857j.mo2950E(mo302N));
                    }
                } else {
                    throw new IllegalStateException("object explicit - implicit expected.");
                }
            }
            m447z(mo440Q);
            return mo440Q;
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public final boolean equals(Object obj) {
        switch (this.f743z) {
            case 2:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    /* renamed from: h */
    public final void m443h() {
        Object obj = this.f741h;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((LayoutInflaterFactory2C1392a6) this.f742v).f4342E.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f741h = null;
        }
    }

    public final int hashCode() {
        switch (this.f743z) {
            case 2:
                return super.hashCode();
            default:
                return super.hashCode();
        }
    }

    /* renamed from: o */
    public abstract int mo444o();

    /* renamed from: u */
    public AbstractC1593e mo445u(C1745gp c1745gp) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    /* renamed from: v */
    public final void m446v() {
        AbstractC0204Du abstractC0204Du = (AbstractC0204Du) this.f741h;
        C1251XO c1251xo = (C1251XO) this.f742v;
        LinkedHashSet linkedHashSet = abstractC0204Du.f615N;
        if (linkedHashSet.remove(c1251xo) && linkedHashSet.isEmpty()) {
            abstractC0204Du.mo391h();
        }
    }

    /* renamed from: z */
    public final void m447z(AbstractC1593e abstractC1593e) {
        if (!((Class) this.f741h).isInstance(abstractC1593e)) {
            throw new IllegalStateException("unexpected object: ".concat(abstractC1593e.getClass().getName()));
        }
    }

    public AbstractC0227EK(AbstractC0204Du abstractC0204Du, C1251XO c1251xo) {
        this.f741h = abstractC0204Du;
        this.f742v = c1251xo;
    }

    public AbstractC0227EK(Class cls, int i) {
        this.f741h = cls;
        this.f742v = new C2498v3(i);
    }
}
