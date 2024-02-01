package p000a;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: a.fj */
/* loaded from: classes.dex */
public abstract class AbstractC1687fj {

    /* renamed from: P */
    public InterfaceC0771ON f5278P;

    /* renamed from: Q */
    public boolean f5279Q;

    /* renamed from: h */
    public Executor f5282h;

    /* renamed from: u */
    public List f5284u;

    /* renamed from: v */
    public ExecutorC0571Ki f5285v;

    /* renamed from: z */
    public volatile InterfaceC1136VG f5286z;

    /* renamed from: N */
    public final C2213pi f5277N = mo3183P();

    /* renamed from: o */
    public final LinkedHashMap f5283o = new LinkedHashMap();

    /* renamed from: W */
    public final ReentrantReadWriteLock f5281W = new ReentrantReadWriteLock();

    /* renamed from: G */
    public final ThreadLocal f5275G = new ThreadLocal();

    /* renamed from: M */
    public final Map f5276M = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: V */
    public final LinkedHashMap f5280V = new LinkedHashMap();

    /* renamed from: R */
    public static Object m3179R(Class cls, InterfaceC0771ON interfaceC0771ON) {
        if (cls.isInstance(interfaceC0771ON)) {
            return interfaceC0771ON;
        }
        if (interfaceC0771ON instanceof InterfaceC2203pV) {
            return m3179R(cls, ((InterfaceC2203pV) interfaceC0771ON).m3831z());
        }
        return null;
    }

    /* renamed from: G */
    public final void m3180G() {
        m3192z();
        InterfaceC0771ON interfaceC0771ON = this.f5278P;
        if (interfaceC0771ON == null) {
            interfaceC0771ON = null;
        }
        InterfaceC1136VG mo1790l = interfaceC0771ON.mo1790l();
        this.f5277N.m3854v(mo1790l);
        if (mo1790l.mo1945k()) {
            mo1790l.mo1942d();
        } else {
            mo1790l.mo1940W();
        }
    }

    /* renamed from: M */
    public final void m3181M() {
        InterfaceC0771ON interfaceC0771ON = this.f5278P;
        Executor executor = null;
        if (interfaceC0771ON == null) {
            interfaceC0771ON = null;
        }
        interfaceC0771ON.mo1790l().mo1946o();
        if (!m3187W()) {
            C2213pi c2213pi = this.f5277N;
            if (c2213pi.f6808N.compareAndSet(false, true)) {
                Executor executor2 = c2213pi.f6817z.f5282h;
                if (executor2 != null) {
                    executor = executor2;
                }
                executor.execute(c2213pi.f6811V);
            }
        }
    }

    /* renamed from: N */
    public abstract InterfaceC0771ON mo3182N(C2605x2 c2605x2);

    /* renamed from: P */
    public abstract C2213pi mo3183P();

    /* renamed from: Q */
    public List mo3184Q() {
        return C1239X8.f4021S;
    }

    /* renamed from: S */
    public final Cursor m3185S(InterfaceC2386su interfaceC2386su, CancellationSignal cancellationSignal) {
        m3192z();
        m3188h();
        InterfaceC0771ON interfaceC0771ON = null;
        if (cancellationSignal != null) {
            InterfaceC0771ON interfaceC0771ON2 = this.f5278P;
            if (interfaceC0771ON2 != null) {
                interfaceC0771ON = interfaceC0771ON2;
            }
            return interfaceC0771ON.mo1790l().mo1938E(interfaceC2386su, cancellationSignal);
        }
        InterfaceC0771ON interfaceC0771ON3 = this.f5278P;
        if (interfaceC0771ON3 != null) {
            interfaceC0771ON = interfaceC0771ON3;
        }
        return interfaceC0771ON.mo1790l().mo1941Yd(interfaceC2386su);
    }

    /* renamed from: V */
    public final boolean m3186V() {
        InterfaceC1136VG interfaceC1136VG = this.f5286z;
        return interfaceC1136VG != null && interfaceC1136VG.isOpen();
    }

    /* renamed from: W */
    public final boolean m3187W() {
        InterfaceC0771ON interfaceC0771ON = this.f5278P;
        if (interfaceC0771ON == null) {
            interfaceC0771ON = null;
        }
        return interfaceC0771ON.mo1790l().mo1950zx();
    }

    /* renamed from: h */
    public final void m3188h() {
        if (!(m3187W() || this.f5275G.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    /* renamed from: o */
    public Map mo3189o() {
        return C1202WT.f3909S;
    }

    /* renamed from: u */
    public Set mo3190u() {
        return C1460bR.f4549S;
    }

    /* renamed from: v */
    public abstract void mo3191v();

    /* renamed from: z */
    public final void m3192z() {
        boolean z;
        if (this.f5279Q) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if ((!z) != false) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }
}
