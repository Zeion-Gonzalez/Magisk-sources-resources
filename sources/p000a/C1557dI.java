package p000a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* renamed from: a.dI */
/* loaded from: classes.dex */
public final class C1557dI extends AbstractC1577de implements InterfaceC1810i5 {

    /* renamed from: I */
    public final String f4813I;
    private volatile C1557dI _immediate;

    /* renamed from: k */
    public final C1557dI f4814k;

    /* renamed from: q */
    public final boolean f4815q;

    /* renamed from: w */
    public final Handler f4816w;

    public C1557dI(Handler handler) {
        this(handler, null, false);
    }

    @Override // p000a.AbstractC1859j1
    /* renamed from: C */
    public final void mo195C(InterfaceC1255XS interfaceC1255XS, Runnable runnable) {
        if (!this.f4816w.post(runnable)) {
            CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
            InterfaceC1265Xh interfaceC1265Xh = (InterfaceC1265Xh) interfaceC1255XS.mo107y(C1710g8.f5381k);
            if (interfaceC1265Xh != null) {
                interfaceC1265Xh.mo1719z(cancellationException);
            }
            AbstractC0037Al.f178h.mo195C(interfaceC1255XS, runnable);
        }
    }

    @Override // p000a.AbstractC1859j1
    /* renamed from: U8 */
    public final boolean mo3030U8() {
        return (this.f4815q && AbstractC1292YB.m2695u(Looper.myLooper(), this.f4816w.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1557dI) && ((C1557dI) obj).f4816w == this.f4816w;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4816w);
    }

    @Override // p000a.AbstractC1859j1
    public final String toString() {
        C1557dI c1557dI;
        String str;
        C1080UE c1080ue = AbstractC0037Al.f179z;
        AbstractC1577de abstractC1577de = AbstractC1342Z8.f4236z;
        if (this == abstractC1577de) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1557dI = ((C1557dI) abstractC1577de).f4814k;
            } catch (UnsupportedOperationException unused) {
                c1557dI = null;
            }
            if (this == c1557dI) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f4813I;
            if (str2 == null) {
                str2 = this.f4816w.toString();
            }
            if (this.f4815q) {
                return AbstractC2441tz.m4195W(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public C1557dI(Handler handler, String str, boolean z) {
        this.f4816w = handler;
        this.f4813I = str;
        this.f4815q = z;
        this._immediate = z ? this : null;
        C1557dI c1557dI = this._immediate;
        if (c1557dI == null) {
            c1557dI = new C1557dI(handler, str, true);
            this._immediate = c1557dI;
        }
        this.f4814k = c1557dI;
    }
}
