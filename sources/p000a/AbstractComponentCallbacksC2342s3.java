package p000a;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.s3 */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC2342s3 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1546d7, InterfaceC0670Mg, InterfaceC0699NC, InterfaceC0277FG {

    /* renamed from: UZ */
    public static final Object f7181UZ = new Object();

    /* renamed from: B */
    public boolean f7182B;

    /* renamed from: C */
    public AbstractComponentCallbacksC2342s3 f7183C;

    /* renamed from: D */
    public C1614eM f7184D;

    /* renamed from: E */
    public boolean f7185E;

    /* renamed from: F */
    public C0852Pu f7186F;

    /* renamed from: H */
    public boolean f7187H;

    /* renamed from: HL */
    public final C1112Up f7188HL;

    /* renamed from: I */
    public Bundle f7189I;

    /* renamed from: J */
    public boolean f7190J;

    /* renamed from: L */
    public String f7192L;

    /* renamed from: O */
    public boolean f7193O;

    /* renamed from: R */
    public Bundle f7194R;

    /* renamed from: T */
    public ViewGroup f7196T;

    /* renamed from: X */
    public C0364Gx f7198X;

    /* renamed from: Y */
    public boolean f7199Y;

    /* renamed from: Yd */
    public C0326GG f7200Yd;

    /* renamed from: b */
    public String f7202b;

    /* renamed from: c */
    public boolean f7203c;

    /* renamed from: d */
    public boolean f7204d;

    /* renamed from: e */
    public int f7205e;

    /* renamed from: f */
    public boolean f7206f;

    /* renamed from: g */
    public AbstractComponentCallbacksC2342s3 f7207g;

    /* renamed from: i */
    public boolean f7208i;

    /* renamed from: j */
    public int f7209j;

    /* renamed from: k */
    public Bundle f7210k;

    /* renamed from: l */
    public boolean f7211l;

    /* renamed from: m */
    public boolean f7212m;

    /* renamed from: nF */
    public final ArrayList f7214nF;

    /* renamed from: nP */
    public EnumC1632eh f7215nP;

    /* renamed from: od */
    public C1330Yx f7216od;

    /* renamed from: p */
    public int f7217p;

    /* renamed from: qn */
    public C1271Xp f7219qn;

    /* renamed from: r */
    public boolean f7220r;

    /* renamed from: s */
    public int f7221s;

    /* renamed from: t */
    public View f7222t;

    /* renamed from: w */
    public SparseArray f7223w;

    /* renamed from: x */
    public boolean f7224x;

    /* renamed from: zx */
    public final C0276FF f7226zx;

    /* renamed from: S */
    public int f7195S = -1;

    /* renamed from: q */
    public String f7218q = UUID.randomUUID().toString();

    /* renamed from: y */
    public String f7225y = null;

    /* renamed from: U */
    public Boolean f7197U = null;

    /* renamed from: Z */
    public C0364Gx f7201Z = new C0364Gx();

    /* renamed from: n */
    public final boolean f7213n = true;

    /* renamed from: K */
    public boolean f7191K = true;

    public AbstractComponentCallbacksC2342s3() {
        new RunnableC1126V4(0, this);
        this.f7215nP = EnumC1632eh.f5091q;
        this.f7188HL = new C1112Up();
        new AtomicInteger();
        this.f7214nF = new ArrayList();
        this.f7226zx = new C0276FF(this);
        m4015q();
    }

    @Override // p000a.InterfaceC1546d7
    /* renamed from: C */
    public final C0326GG mo1354C() {
        return this.f7200Yd;
    }

    /* renamed from: E */
    public final void m4001E(int i, int i2, Intent intent) {
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* renamed from: F */
    public abstract void mo279F(Bundle bundle);

    @Override // p000a.InterfaceC0670Mg
    /* renamed from: G */
    public final C2145oS mo1569G() {
        if (this.f7198X != null) {
            if (m4006S() != 1) {
                HashMap hashMap = this.f7198X.f1248d.f3147k;
                C2145oS c2145oS = (C2145oS) hashMap.get(this.f7218q);
                if (c2145oS == null) {
                    C2145oS c2145oS2 = new C2145oS();
                    hashMap.put(this.f7218q, c2145oS2);
                    return c2145oS2;
                }
                return c2145oS;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: H */
    public LayoutInflater mo280H(Bundle bundle) {
        C0852Pu c0852Pu = this.f7186F;
        if (c0852Pu != null) {
            AbstractActivityC0502JU abstractActivityC0502JU = c0852Pu.f2882k;
            LayoutInflater cloneInContext = abstractActivityC0502JU.getLayoutInflater().cloneInContext(abstractActivityC0502JU);
            cloneInContext.setFactory2(this.f7201Z.f1238Q);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: I */
    public final C1271Xp m4002I() {
        C1271Xp c1271Xp = this.f7219qn;
        if (c1271Xp != null) {
            return c1271Xp;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* renamed from: J */
    public void mo281J() {
        this.f7224x = true;
    }

    /* renamed from: L */
    public void mo283L(Bundle bundle) {
        this.f7224x = true;
    }

    /* renamed from: M */
    public final Context m4003M() {
        C0852Pu c0852Pu = this.f7186F;
        if (c0852Pu == null) {
            return null;
        }
        return c0852Pu.f2884w;
    }

    /* renamed from: O */
    public final Context m4004O() {
        Context m4003M = m4003M();
        if (m4003M != null) {
            return m4003M;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: R */
    public final C0364Gx m4005R() {
        C0364Gx c0364Gx = this.f7198X;
        if (c0364Gx != null) {
            return c0364Gx;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: S */
    public final int m4006S() {
        EnumC1632eh enumC1632eh = this.f7215nP;
        return (enumC1632eh == EnumC1632eh.f5088R || this.f7183C == null) ? enumC1632eh.ordinal() : Math.min(enumC1632eh.ordinal(), this.f7183C.m4006S());
    }

    /* renamed from: T */
    public final void m4007T(int i, int i2, int i3, int i4) {
        if (this.f7184D == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m4014o().f4957h = i;
        m4014o().f4960v = i2;
        m4014o().f4952P = i3;
        m4014o().f4951N = i4;
    }

    /* renamed from: U */
    public void mo284U() {
        this.f7224x = true;
    }

    /* renamed from: W */
    public final C0364Gx m4008W() {
        if (this.f7186F != null) {
            return this.f7201Z;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: X */
    public void mo3514X() {
        this.f7224x = true;
    }

    /* renamed from: Y */
    public View mo431Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: Z */
    public void mo285Z() {
        this.f7224x = true;
    }

    /* renamed from: c */
    public void mo286c() {
        this.f7224x = true;
    }

    /* renamed from: d */
    public final AbstractActivityC0502JU m4009d() {
        AbstractActivityC0502JU abstractActivityC0502JU;
        C0852Pu c0852Pu = this.f7186F;
        if (c0852Pu == null) {
            abstractActivityC0502JU = null;
        } else {
            abstractActivityC0502JU = (AbstractActivityC0502JU) c0852Pu.f2881R;
        }
        if (abstractActivityC0502JU != null) {
            return abstractActivityC0502JU;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: e */
    public void mo4010e(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.f7224x = true;
        C0852Pu c0852Pu = this.f7186F;
        if (c0852Pu == null) {
            activity = null;
        } else {
            activity = c0852Pu.f2881R;
        }
        if (activity != null) {
            this.f7224x = true;
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void mo287f(Context context) {
        Activity activity;
        this.f7224x = true;
        C0852Pu c0852Pu = this.f7186F;
        if (c0852Pu == null) {
            activity = null;
        } else {
            activity = c0852Pu.f2881R;
        }
        if (activity != null) {
            this.f7224x = true;
        }
    }

    /* renamed from: g */
    public final boolean m4011g() {
        boolean m4011g;
        if (!this.f7208i) {
            C0364Gx c0364Gx = this.f7198X;
            if (c0364Gx == null) {
                return false;
            }
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f7183C;
            c0364Gx.getClass();
            if (abstractComponentCallbacksC2342s3 == null) {
                m4011g = false;
            } else {
                m4011g = abstractComponentCallbacksC2342s3.m4011g();
            }
            if (!m4011g) {
                return false;
            }
        }
        return true;
    }

    @Override // p000a.InterfaceC0277FG
    /* renamed from: h */
    public final C1934kN mo576h() {
        return this.f7216od.f4218h;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public void mo288i(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7201Z.m842x();
        boolean z = true;
        this.f7187H = true;
        this.f7219qn = new C1271Xp(this, mo1569G(), new RunnableC0308Fs(7, this));
        View mo431Y = mo431Y(layoutInflater, viewGroup, bundle);
        this.f7222t = mo431Y;
        if (mo431Y != null) {
            this.f7219qn.m2597P();
            if (C0364Gx.m791p(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f7222t + " for Fragment " + this);
            }
            this.f7222t.setTag(R.id.view_tree_lifecycle_owner, this.f7219qn);
            this.f7222t.setTag(R.id.view_tree_view_model_store_owner, this.f7219qn);
            this.f7222t.setTag(R.id.view_tree_saved_state_registry_owner, this.f7219qn);
            this.f7188HL.mo2290G(this.f7219qn);
            return;
        }
        if (this.f7219qn.f4088I == null) {
            z = false;
        }
        if (!z) {
            this.f7219qn = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    /* renamed from: j */
    public void mo3517j(View view, Bundle bundle) {
    }

    /* renamed from: k */
    public final void m4012k() {
        m4015q();
        this.f7202b = this.f7218q;
        this.f7218q = UUID.randomUUID().toString();
        this.f7185E = false;
        this.f7206f = false;
        this.f7199Y = false;
        this.f7190J = false;
        this.f7203c = false;
        this.f7205e = 0;
        this.f7198X = null;
        this.f7201Z = new C0364Gx();
        this.f7186F = null;
        this.f7217p = 0;
        this.f7209j = 0;
        this.f7192L = null;
        this.f7208i = false;
        this.f7204d = false;
    }

    /* renamed from: n */
    public final View m4013n() {
        View view = this.f7222t;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: o */
    public final C1614eM m4014o() {
        if (this.f7184D == null) {
            this.f7184D = new C1614eM();
        }
        return this.f7184D;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f7224x = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m4009d().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f7224x = true;
    }

    /* renamed from: p */
    public void mo289p() {
        this.f7224x = true;
    }

    /* renamed from: q */
    public final void m4015q() {
        Bundle bundle;
        this.f7200Yd = new C0326GG(this);
        this.f7216od = new C1330Yx(this);
        ArrayList arrayList = this.f7214nF;
        C0276FF c0276ff = this.f7226zx;
        if (!arrayList.contains(c0276ff)) {
            if (this.f7195S >= 0) {
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c0276ff.f957z;
                abstractComponentCallbacksC2342s3.f7216od.m2713z();
                AbstractC1843ih.m3402E(abstractComponentCallbacksC2342s3);
                Bundle bundle2 = abstractComponentCallbacksC2342s3.f7194R;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle("registryState");
                } else {
                    bundle = null;
                }
                abstractComponentCallbacksC2342s3.f7216od.m2711h(bundle);
                return;
            }
            arrayList.add(c0276ff);
        }
    }

    /* renamed from: r */
    public void mo290r(Bundle bundle) {
        boolean z;
        this.f7224x = true;
        m4019x();
        C0364Gx c0364Gx = this.f7201Z;
        if (c0364Gx.f1264y >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c0364Gx.f1228F = false;
            c0364Gx.f1246Z = false;
            c0364Gx.f1248d.f3149s = false;
            c0364Gx.m843y(1);
        }
    }

    /* renamed from: s */
    public final boolean m4016s() {
        return this.f7205e > 0;
    }

    /* renamed from: t */
    public final void m4017t(Bundle bundle) {
        boolean m806O;
        C0364Gx c0364Gx = this.f7198X;
        if (c0364Gx != null) {
            if (c0364Gx == null) {
                m806O = false;
            } else {
                m806O = c0364Gx.m806O();
            }
            if (m806O) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f7210k = bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f7218q);
        if (this.f7217p != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f7217p));
        }
        if (this.f7192L != null) {
            sb.append(" tag=");
            sb.append(this.f7192L);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public AbstractC2703z2 mo291u() {
        return new C0973SG(this);
    }

    /* renamed from: w */
    public final Resources m4018w() {
        return m4004O().getResources();
    }

    /* renamed from: x */
    public final void m4019x() {
        Bundle bundle;
        Bundle bundle2 = this.f7194R;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.f7201Z.m828m(bundle);
            C0364Gx c0364Gx = this.f7201Z;
            c0364Gx.f1228F = false;
            c0364Gx.f1246Z = false;
            c0364Gx.f1248d.f3149s = false;
            c0364Gx.m843y(1);
        }
    }

    @Override // p000a.InterfaceC0699NC
    /* renamed from: z */
    public final C0945Rm mo1635z() {
        Application application;
        Context applicationContext = m4004O().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && C0364Gx.m791p(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m4004O().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0945Rm c0945Rm = new C0945Rm(0);
        if (application != null) {
            c0945Rm.m2110h(C1710g8.f5383s, application);
        }
        c0945Rm.m2110h(AbstractC1843ih.f5745I, this);
        c0945Rm.m2110h(AbstractC1843ih.f5757q, this);
        Bundle bundle = this.f7210k;
        if (bundle != null) {
            c0945Rm.m2110h(AbstractC1843ih.f5755k, bundle);
        }
        return c0945Rm;
    }
}
