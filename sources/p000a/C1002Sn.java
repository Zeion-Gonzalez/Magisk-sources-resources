package p000a;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.Sn */
/* loaded from: classes.dex */
public final class C1002Sn implements InterfaceC0732Nl {

    /* renamed from: S */
    public final C2570wR f3366S;
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: R */
    public static final AtomicIntegerFieldUpdater f3364R = AtomicIntegerFieldUpdater.newUpdater(C1002Sn.class, "_isCompleting");

    /* renamed from: w */
    public static final AtomicReferenceFieldUpdater f3365w = AtomicReferenceFieldUpdater.newUpdater(C1002Sn.class, Object.class, "_rootCause");

    /* renamed from: I */
    public static final AtomicReferenceFieldUpdater f3363I = AtomicReferenceFieldUpdater.newUpdater(C1002Sn.class, Object.class, "_exceptionsHolder");

    public C1002Sn(C2570wR c2570wR, Throwable th) {
        this.f3366S = c2570wR;
        this._rootCause = th;
    }

    /* renamed from: N */
    public final boolean m2173N() {
        return f3364R.get(this) != 0;
    }

    /* renamed from: P */
    public final boolean m2174P() {
        return m2176v() != null;
    }

    /* renamed from: Q */
    public final ArrayList m2175Q(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3363I;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable m2176v = m2176v();
        if (m2176v != null) {
            arrayList.add(0, m2176v);
        }
        if (th != null && !AbstractC1292YB.m2695u(th, m2176v)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0438II.f1457U);
        return arrayList;
    }

    @Override // p000a.InterfaceC0732Nl
    /* renamed from: h */
    public final boolean mo758h() {
        return m2176v() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + m2174P() + ", completing=" + m2173N() + ", rootCause=" + m2176v() + ", exceptions=" + f3363I.get(this) + ", list=" + this.f3366S + ']';
    }

    @Override // p000a.InterfaceC0732Nl
    /* renamed from: u */
    public final C2570wR mo759u() {
        return this.f3366S;
    }

    /* renamed from: v */
    public final Throwable m2176v() {
        return (Throwable) f3365w.get(this);
    }

    /* renamed from: z */
    public final void m2177z(Throwable th) {
        Throwable m2176v = m2176v();
        if (m2176v == null) {
            f3365w.set(this, th);
            return;
        }
        if (th == m2176v) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3363I;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (obj instanceof Throwable) {
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
            return;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(th);
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
    }
}
