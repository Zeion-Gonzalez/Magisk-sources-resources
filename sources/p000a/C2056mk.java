package p000a;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.mk */
/* loaded from: classes.dex */
public class C2056mk extends C1819iG {

    /* renamed from: G */
    public static final long f6387G;

    /* renamed from: M */
    public static final long f6388M;

    /* renamed from: V */
    public static C2056mk f6389V;

    /* renamed from: W */
    public static final Condition f6390W;

    /* renamed from: o */
    public static final ReentrantLock f6391o;

    /* renamed from: N */
    public boolean f6392N;

    /* renamed from: Q */
    public C2056mk f6393Q;

    /* renamed from: u */
    public long f6394u;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f6391o = reentrantLock;
        f6390W = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f6387G = millis;
        f6388M = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: G */
    public IOException mo2218G(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: M */
    public void mo2219M() {
    }

    /* renamed from: W */
    public final boolean m3686W() {
        ReentrantLock reentrantLock = f6391o;
        reentrantLock.lock();
        try {
            if (this.f6392N) {
                this.f6392N = false;
                C2056mk c2056mk = f6389V;
                while (c2056mk != null) {
                    C2056mk c2056mk2 = c2056mk.f6393Q;
                    if (c2056mk2 == this) {
                        c2056mk.f6393Q = this.f6393Q;
                        this.f6393Q = null;
                    } else {
                        c2056mk = c2056mk2;
                    }
                }
                reentrantLock.unlock();
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0064 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #0 {all -> 0x007f, blocks: (B:91:0x0012, B:93:0x0018, B:95:0x001e, B:96:0x002d, B:99:0x0035, B:101:0x0041, B:104:0x0049, B:105:0x004e, B:107:0x0052, B:111:0x005c, B:113:0x0064, B:103:0x0045, B:116:0x006d, B:117:0x0072, B:118:0x0073, B:119:0x007e), top: B:123:0x0012 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3687o() {
        /*
            r9 = this;
            long r0 = r9.f5687v
            boolean r2 = r9.f5688z
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Ld
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.concurrent.locks.ReentrantLock r4 = p000a.C2056mk.f6391o
            r4.lock()
            boolean r5 = r9.f6392N     // Catch: java.lang.Throwable -> L7f
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L73
            r9.f6392N = r6     // Catch: java.lang.Throwable -> L7f
            a.mk r5 = p000a.C2056mk.f6389V     // Catch: java.lang.Throwable -> L7f
            if (r5 != 0) goto L2d
            a.mk r5 = new a.mk     // Catch: java.lang.Throwable -> L7f
            r5.<init>()     // Catch: java.lang.Throwable -> L7f
            p000a.C2056mk.f6389V = r5     // Catch: java.lang.Throwable -> L7f
            a.cd r5 = new a.cd     // Catch: java.lang.Throwable -> L7f
            r5.<init>()     // Catch: java.lang.Throwable -> L7f
            r5.start()     // Catch: java.lang.Throwable -> L7f
        L2d:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L3f
            if (r2 == 0) goto L3f
            long r2 = r9.mo3378v()     // Catch: java.lang.Throwable -> L7f
            long r2 = r2 - r5
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L7f
            goto L41
        L3f:
            if (r3 == 0) goto L43
        L41:
            long r0 = r0 + r5
            goto L49
        L43:
            if (r2 == 0) goto L6d
            long r0 = r9.mo3378v()     // Catch: java.lang.Throwable -> L7f
        L49:
            r9.f6394u = r0     // Catch: java.lang.Throwable -> L7f
            long r0 = r0 - r5
            a.mk r2 = p000a.C2056mk.f6389V     // Catch: java.lang.Throwable -> L7f
        L4e:
            a.mk r3 = r2.f6393Q     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L5c
            long r7 = r3.f6394u     // Catch: java.lang.Throwable -> L7f
            long r7 = r7 - r5
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            goto L5c
        L5a:
            r2 = r3
            goto L4e
        L5c:
            r9.f6393Q = r3     // Catch: java.lang.Throwable -> L7f
            r2.f6393Q = r9     // Catch: java.lang.Throwable -> L7f
            a.mk r0 = p000a.C2056mk.f6389V     // Catch: java.lang.Throwable -> L7f
            if (r2 != r0) goto L69
            java.util.concurrent.locks.Condition r0 = p000a.C2056mk.f6390W     // Catch: java.lang.Throwable -> L7f
            r0.signal()     // Catch: java.lang.Throwable -> L7f
        L69:
            r4.unlock()
            return
        L6d:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            throw r0     // Catch: java.lang.Throwable -> L7f
        L73:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            throw r1     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2056mk.m3687o():void");
    }
}
