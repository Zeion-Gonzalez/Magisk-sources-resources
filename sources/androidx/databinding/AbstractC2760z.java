package androidx.databinding;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p000a.AbstractC1434av;
import p000a.AbstractComponentCallbacksC2342s3;
import p000a.C0376HA;
import p000a.C0409Hl;
import p000a.C0587Kz;
import p000a.C1092UU;
import p000a.C1174Vy;
import p000a.C1508cQ;
import p000a.C1665fK;
import p000a.C2059mo;
import p000a.C2196pM;
import p000a.ChoreographerFrameCallbackC0700ND;
import p000a.EnumC1632eh;
import p000a.EnumC2241qF;
import p000a.InterfaceC0281FL;
import p000a.InterfaceC0492JH;
import p000a.InterfaceC1546d7;
import p000a.InterfaceC2630xV;
import p000a.RunnableC1286Y5;
import p000a.ViewOnAttachStateChangeListenerC0544KF;

/* renamed from: androidx.databinding.z */
/* loaded from: classes.dex */
public abstract class AbstractC2760z extends AbstractC1434av {

    /* renamed from: H */
    public static final boolean f8968H = true;

    /* renamed from: E */
    public final Handler f8974E;

    /* renamed from: I */
    public boolean f8975I;

    /* renamed from: J */
    public boolean f8976J;

    /* renamed from: R */
    public final RunnableC1286Y5 f8977R;

    /* renamed from: U */
    public final ChoreographerFrameCallbackC0700ND f8978U;

    /* renamed from: Y */
    public ViewDataBinding$OnStartListener f8979Y;

    /* renamed from: f */
    public AbstractC2760z f8980f;

    /* renamed from: g */
    public C0409Hl f8981g;

    /* renamed from: k */
    public final View f8982k;

    /* renamed from: q */
    public final C0376HA[] f8983q;

    /* renamed from: r */
    public InterfaceC1546d7 f8984r;

    /* renamed from: s */
    public final Choreographer f8985s;

    /* renamed from: w */
    public boolean f8986w;

    /* renamed from: y */
    public boolean f8987y;

    /* renamed from: c */
    public static final int f8971c = Build.VERSION.SDK_INT;

    /* renamed from: e */
    public static final C1665fK f8972e = new C1665fK(12);

    /* renamed from: X */
    public static final C1665fK f8969X = new C1665fK(13);

    /* renamed from: F */
    public static final C1665fK f8967F = new C1665fK(15);

    /* renamed from: Z */
    public static final C0587Kz f8970Z = new C0587Kz(2);

    /* renamed from: C */
    public static final ReferenceQueue f8966C = new ReferenceQueue();

    /* renamed from: p */
    public static final ViewOnAttachStateChangeListenerC0544KF f8973p = new ViewOnAttachStateChangeListenerC0544KF(0);

    public AbstractC2760z(int i, View view, Object obj) {
        if (obj == null) {
            this.f8977R = new RunnableC1286Y5(5, this);
            this.f8986w = false;
            this.f8975I = false;
            this.f8983q = new C0376HA[i];
            this.f8982k = view;
            if (Looper.myLooper() != null) {
                if (f8968H) {
                    this.f8985s = Choreographer.getInstance();
                    this.f8978U = new ChoreographerFrameCallbackC0700ND(this);
                    return;
                } else {
                    this.f8978U = null;
                    this.f8974E = new Handler(Looper.myLooper());
                    return;
                }
            }
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* renamed from: S */
    public static Object[] m4814S(View view, int i, C1174Vy c1174Vy, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m4815V(view, objArr, c1174Vy, sparseIntArray, true);
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0070, code lost:
    
        if (r23 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0098, code lost:
    
        if (r23 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x009a, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x009b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01fd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01ab A[SYNTHETIC] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m4815V(android.view.View r21, java.lang.Object[] r22, p000a.C1174Vy r23, android.util.SparseIntArray r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.AbstractC2760z.m4815V(android.view.View, java.lang.Object[], a.Vy, android.util.SparseIntArray, boolean):void");
    }

    /* renamed from: G */
    public abstract boolean mo13G();

    /* renamed from: I */
    public final void m4816I() {
        AbstractC2760z abstractC2760z = this.f8980f;
        if (abstractC2760z != null) {
            abstractC2760z.m4816I();
            return;
        }
        InterfaceC1546d7 interfaceC1546d7 = this.f8984r;
        if (interfaceC1546d7 != null && !interfaceC1546d7.mo1354C().f1105P.m3117z(EnumC1632eh.f5087I)) {
            return;
        }
        synchronized (this) {
            if (this.f8986w) {
                return;
            }
            this.f8986w = true;
            if (f8968H) {
                this.f8985s.postFrameCallback(this.f8978U);
            } else {
                this.f8974E.post(this.f8977R);
            }
        }
    }

    /* renamed from: M */
    public abstract void mo14M();

    /* renamed from: N */
    public abstract void mo15N();

    /* renamed from: R */
    public abstract boolean mo16R(int i, int i2, Object obj);

    /* renamed from: W */
    public final void m4817W() {
        AbstractC2760z abstractC2760z = this.f8980f;
        if (abstractC2760z == null) {
            m4819u();
        } else {
            abstractC2760z.m4817W();
        }
    }

    /* renamed from: g */
    public final void m4818g(int i, InterfaceC0281FL interfaceC0281FL) {
        m4821y(i, interfaceC0281FL, f8972e);
    }

    /* renamed from: k */
    public abstract boolean mo19k(int i, Object obj);

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.databinding.ViewDataBinding$OnStartListener] */
    /* renamed from: q */
    public void mo2815q(InterfaceC1546d7 interfaceC1546d7) {
        if (interfaceC1546d7 instanceof AbstractComponentCallbacksC2342s3) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        InterfaceC1546d7 interfaceC1546d72 = this.f8984r;
        if (interfaceC1546d72 == interfaceC1546d7) {
            return;
        }
        if (interfaceC1546d72 != null) {
            interfaceC1546d72.mo1354C().mo724h(this.f8979Y);
        }
        this.f8984r = interfaceC1546d7;
        if (interfaceC1546d7 != null) {
            if (this.f8979Y == null) {
                this.f8979Y = new InterfaceC2630xV(this) { // from class: androidx.databinding.ViewDataBinding$OnStartListener

                    /* renamed from: S */
                    public final WeakReference f8964S;

                    {
                        this.f8964S = new WeakReference(this);
                    }

                    @InterfaceC0492JH(EnumC2241qF.ON_START)
                    public void onStart() {
                        AbstractC2760z abstractC2760z = (AbstractC2760z) this.f8964S.get();
                        if (abstractC2760z != null) {
                            abstractC2760z.m4817W();
                        }
                    }
                };
            }
            interfaceC1546d7.mo1354C().mo728z(this.f8979Y);
        }
        for (C0376HA c0376ha : this.f8983q) {
            if (c0376ha != null) {
                c0376ha.m867z(interfaceC1546d7);
            }
        }
    }

    /* renamed from: u */
    public final void m4819u() {
        if (this.f8987y) {
            m4816I();
            return;
        }
        if (mo13G()) {
            this.f8987y = true;
            this.f8975I = false;
            C0409Hl c0409Hl = this.f8981g;
            if (c0409Hl != null) {
                c0409Hl.mo920P(this, 1, null);
                if (this.f8975I) {
                    this.f8981g.mo920P(this, 2, null);
                }
            }
            if (!this.f8975I) {
                mo15N();
                C0409Hl c0409Hl2 = this.f8981g;
                if (c0409Hl2 != null) {
                    c0409Hl2.mo920P(this, 3, null);
                }
            }
            this.f8987y = false;
        }
    }

    /* renamed from: w */
    public final void m4820w(int i, Object obj, C1665fK c1665fK) {
        C0376HA c0376ha;
        if (obj == null) {
            return;
        }
        C0376HA[] c0376haArr = this.f8983q;
        C0376HA c0376ha2 = c0376haArr[i];
        if (c0376ha2 == null) {
            ReferenceQueue referenceQueue = f8966C;
            switch (c1665fK.f5200S) {
                case 12:
                    c0376ha = new C1508cQ(this, i, referenceQueue).f4661S;
                    break;
                case 13:
                    c0376ha = (C0376HA) new C2059mo(this, i, referenceQueue).f6400R;
                    break;
                case 14:
                    c0376ha = (C0376HA) new C2196pM(this, i, referenceQueue).f6755R;
                    break;
                default:
                    c0376ha = new C1092UU(this, i, referenceQueue).f3567S;
                    break;
            }
            c0376ha2 = c0376ha;
            c0376haArr[i] = c0376ha2;
            InterfaceC1546d7 interfaceC1546d7 = this.f8984r;
            if (interfaceC1546d7 != null) {
                c0376ha2.m867z(interfaceC1546d7);
            }
        }
        c0376ha2.m866h();
        c0376ha2.f1290v = obj;
        c0376ha2.f1291z.mo2266v(obj);
    }

    /* renamed from: y */
    public final boolean m4821y(int i, Object obj, C1665fK c1665fK) {
        C0376HA[] c0376haArr = this.f8983q;
        if (obj == null) {
            C0376HA c0376ha = c0376haArr[i];
            if (c0376ha == null) {
                return false;
            }
            return c0376ha.m866h();
        }
        C0376HA c0376ha2 = c0376haArr[i];
        if (c0376ha2 == null) {
            m4820w(i, obj, c1665fK);
            return true;
        }
        if (c0376ha2.f1290v == obj) {
            return false;
        }
        if (c0376ha2 != null) {
            c0376ha2.m866h();
        }
        m4820w(i, obj, c1665fK);
        return true;
    }
}
