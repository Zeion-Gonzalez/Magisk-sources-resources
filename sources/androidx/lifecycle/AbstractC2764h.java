package androidx.lifecycle;

import java.util.Map;
import p000a.AbstractC2441tz;
import p000a.AbstractC2673yU;
import p000a.C1566dR;
import p000a.C1789hf;
import p000a.C1920k6;
import p000a.C2146oU;
import p000a.EnumC1632eh;
import p000a.InterfaceC0217E7;
import p000a.InterfaceC1546d7;
import p000a.RunnableC1286Y5;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public abstract class AbstractC2764h {

    /* renamed from: M */
    public static final Object f9013M = new Object();

    /* renamed from: G */
    public final RunnableC1286Y5 f9014G;

    /* renamed from: N */
    public volatile Object f9015N;

    /* renamed from: P */
    public boolean f9016P;

    /* renamed from: Q */
    public volatile Object f9017Q;

    /* renamed from: W */
    public boolean f9018W;

    /* renamed from: h */
    public final C1789hf f9019h;

    /* renamed from: o */
    public boolean f9020o;

    /* renamed from: u */
    public int f9021u;

    /* renamed from: v */
    public int f9022v;

    /* renamed from: z */
    public final Object f9023z;

    public AbstractC2764h() {
        this.f9023z = new Object();
        this.f9019h = new C1789hf();
        this.f9022v = 0;
        Object obj = f9013M;
        this.f9017Q = obj;
        this.f9014G = new RunnableC1286Y5(6, this);
        this.f9015N = obj;
        this.f9021u = -1;
    }

    /* renamed from: z */
    public static void m4842z(String str) {
        if (C2146oU.m3764nB().m3766d3()) {
        } else {
            throw new IllegalStateException(AbstractC2441tz.m4184G("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: G */
    public abstract void mo2290G(Object obj);

    /* renamed from: N */
    public final void m4843N(InterfaceC1546d7 interfaceC1546d7, InterfaceC0217E7 interfaceC0217E7) {
        m4842z("observe");
        if (interfaceC1546d7.mo1354C().f1105P == EnumC1632eh.f5089S) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, interfaceC1546d7, interfaceC0217E7);
        AbstractC2673yU abstractC2673yU = (AbstractC2673yU) this.f9019h.mo2924v(interfaceC0217E7, liveData$LifecycleBoundObserver);
        if (abstractC2673yU != null && !abstractC2673yU.mo4582G(interfaceC1546d7)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC2673yU != null) {
            return;
        }
        interfaceC1546d7.mo1354C().mo728z(liveData$LifecycleBoundObserver);
    }

    /* renamed from: P */
    public final Object m4844P() {
        Object obj = this.f9015N;
        if (obj != f9013M) {
            return obj;
        }
        return null;
    }

    /* renamed from: Q */
    public final void m4845Q(InterfaceC0217E7 interfaceC0217E7) {
        m4842z("observeForever");
        C1920k6 c1920k6 = new C1920k6(this, interfaceC0217E7);
        AbstractC2673yU abstractC2673yU = (AbstractC2673yU) this.f9019h.mo2924v(interfaceC0217E7, c1920k6);
        if (abstractC2673yU instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC2673yU != null) {
            return;
        }
        c1920k6.m4584o(true);
    }

    /* renamed from: W */
    public final void m4846W(InterfaceC0217E7 interfaceC0217E7) {
        m4842z("removeObserver");
        AbstractC2673yU abstractC2673yU = (AbstractC2673yU) this.f9019h.mo2922P(interfaceC0217E7);
        if (abstractC2673yU == null) {
            return;
        }
        abstractC2673yU.mo4583W();
        abstractC2673yU.m4584o(false);
    }

    /* renamed from: h */
    public final void m4847h(AbstractC2673yU abstractC2673yU) {
        if (abstractC2673yU.f8343R) {
            if (!abstractC2673yU.mo3546M()) {
                abstractC2673yU.m4584o(false);
                return;
            }
            int i = abstractC2673yU.f8345w;
            int i2 = this.f9021u;
            if (i >= i2) {
                return;
            }
            abstractC2673yU.f8345w = i2;
            abstractC2673yU.f8344S.mo421z(this.f9015N);
        }
    }

    /* renamed from: o */
    public void mo1307o() {
    }

    /* renamed from: u */
    public void mo1308u() {
    }

    /* renamed from: v */
    public final void m4848v(AbstractC2673yU abstractC2673yU) {
        if (this.f9020o) {
            this.f9018W = true;
            return;
        }
        this.f9020o = true;
        do {
            this.f9018W = false;
            if (abstractC2673yU != null) {
                m4847h(abstractC2673yU);
                abstractC2673yU = null;
            } else {
                C1789hf c1789hf = this.f9019h;
                c1789hf.getClass();
                C1566dR c1566dR = new C1566dR(c1789hf);
                c1789hf.f5621w.put(c1566dR, Boolean.FALSE);
                while (c1566dR.hasNext()) {
                    m4847h((AbstractC2673yU) ((Map.Entry) c1566dR.next()).getValue());
                    if (this.f9018W) {
                        break;
                    }
                }
            }
        } while (this.f9018W);
        this.f9020o = false;
    }

    public AbstractC2764h(Object obj) {
        this.f9023z = new Object();
        this.f9019h = new C1789hf();
        this.f9022v = 0;
        this.f9017Q = f9013M;
        this.f9014G = new RunnableC1286Y5(6, this);
        this.f9015N = obj;
        this.f9021u = 0;
    }
}
