package p000a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: a.ZH */
/* loaded from: classes.dex */
public abstract class AbstractFutureC1350ZH implements Future {

    /* renamed from: Q */
    public static final AbstractC1500cH f4247Q;

    /* renamed from: u */
    public static final Object f4248u;

    /* renamed from: h */
    public volatile C1074U8 f4249h;

    /* renamed from: v */
    public volatile C1590dx f4250v;

    /* renamed from: z */
    public volatile Object f4251z;

    /* renamed from: P */
    public static final boolean f4246P = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: N */
    public static final Logger f4245N = Logger.getLogger(AbstractFutureC1350ZH.class.getName());

    static {
        AbstractC1500cH c1788he;
        try {
            c1788he = new C0071BO(AtomicReferenceFieldUpdater.newUpdater(C1590dx.class, Thread.class, "z"), AtomicReferenceFieldUpdater.newUpdater(C1590dx.class, C1590dx.class, "h"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1350ZH.class, C1590dx.class, "v"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1350ZH.class, C1074U8.class, "h"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1350ZH.class, Object.class, "z"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1788he = new C1788he();
        }
        f4247Q = c1788he;
        if (th != null) {
            f4245N.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4248u = new Object();
    }

    /* renamed from: h */
    public static void m2736h(AbstractFutureC1350ZH abstractFutureC1350ZH) {
        C1590dx c1590dx;
        C1074U8 c1074u8;
        do {
            c1590dx = abstractFutureC1350ZH.f4250v;
        } while (!f4247Q.mo140Q(abstractFutureC1350ZH, c1590dx, C1590dx.f4881v));
        while (c1590dx != null) {
            Thread thread = c1590dx.f4883z;
            if (thread != null) {
                c1590dx.f4883z = null;
                LockSupport.unpark(thread);
            }
            c1590dx = c1590dx.f4882h;
        }
        do {
            c1074u8 = abstractFutureC1350ZH.f4249h;
        } while (!f4247Q.mo139P(abstractFutureC1350ZH, c1074u8));
        C1074U8 c1074u82 = null;
        while (c1074u8 != null) {
            C1074U8 c1074u83 = c1074u8.f3542z;
            c1074u8.f3542z = c1074u82;
            c1074u82 = c1074u8;
            c1074u8 = c1074u83;
        }
        while (c1074u82 != null) {
            c1074u82 = c1074u82.f3542z;
            try {
                throw null;
                break;
            } catch (RuntimeException e) {
                f4245N.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* renamed from: v */
    public static Object m2737v(Object obj) {
        if (!(obj instanceof C2072n0)) {
            if (!(obj instanceof AbstractC0221EC)) {
                if (obj == f4248u) {
                    return null;
                }
                return obj;
            }
            ((AbstractC0221EC) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        Throwable th = ((C2072n0) obj).f6427z;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* renamed from: P */
    public final void m2738P(C1590dx c1590dx) {
        c1590dx.f4883z = null;
        while (true) {
            C1590dx c1590dx2 = this.f4250v;
            if (c1590dx2 == C1590dx.f4881v) {
                return;
            }
            C1590dx c1590dx3 = null;
            while (c1590dx2 != null) {
                C1590dx c1590dx4 = c1590dx2.f4882h;
                if (c1590dx2.f4883z != null) {
                    c1590dx3 = c1590dx2;
                } else if (c1590dx3 != null) {
                    c1590dx3.f4882h = c1590dx4;
                    if (c1590dx3.f4883z == null) {
                        break;
                    }
                } else if (!f4247Q.mo140Q(this, c1590dx2, c1590dx4)) {
                    break;
                }
                c1590dx2 = c1590dx4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f4251z;
        if ((obj == null) | false) {
            if (f4247Q.mo138N(this, obj, f4246P ? new C2072n0(new CancellationException("Future.cancel() was called."), z) : z ? C2072n0.f6425h : C2072n0.f6426v)) {
                m2736h(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f4251z;
        if ((obj2 != null) && true) {
            return m2737v(obj2);
        }
        C1590dx c1590dx = this.f4250v;
        C1590dx c1590dx2 = C1590dx.f4881v;
        if (c1590dx != c1590dx2) {
            C1590dx c1590dx3 = new C1590dx();
            do {
                AbstractC1500cH abstractC1500cH = f4247Q;
                abstractC1500cH.mo141U(c1590dx3, c1590dx);
                if (abstractC1500cH.mo140Q(this, c1590dx, c1590dx3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m2738P(c1590dx3);
                            throw new InterruptedException();
                        }
                        obj = this.f4251z;
                    } while (!((obj != null) & true));
                    return m2737v(obj);
                }
                c1590dx = this.f4250v;
            } while (c1590dx != c1590dx2);
        }
        return m2737v(this.f4251z);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4251z instanceof C2072n0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f4251z != null) & true;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4251z instanceof C2072n0) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    if (this instanceof ScheduledFuture) {
                        str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                    } else {
                        str = null;
                    }
                } catch (RuntimeException e) {
                    str = "Exception thrown from implementation: " + e.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            m2739z(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: z */
    public final void m2739z(StringBuilder sb) {
        Object obj;
        String valueOf;
        String str = "]";
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    str = "CANCELLED";
                    sb.append(str);
                    return;
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    str = " thrown from get()]";
                    sb.append(str);
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append(str);
                    return;
                }
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:235:0x00a4 -> B:236:0x00aa). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractFutureC1350ZH.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
