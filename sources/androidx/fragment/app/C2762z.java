package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.AbstractC0204Du;
import p000a.AbstractC1285Y3;
import p000a.AbstractC1292YB;
import p000a.AbstractC1589dw;
import p000a.AbstractC1843ih;
import p000a.AbstractC2214pj;
import p000a.AbstractC2441tz;
import p000a.AbstractC2446u3;
import p000a.AbstractC2465uS;
import p000a.AbstractComponentCallbacksC2342s3;
import p000a.C0135Cc;
import p000a.C0276FF;
import p000a.C0326GG;
import p000a.C0364Gx;
import p000a.C0425I3;
import p000a.C0525Ju;
import p000a.C0916RF;
import p000a.C1017T4;
import p000a.C1174Vy;
import p000a.C1271Xp;
import p000a.C1448bA;
import p000a.C1471be;
import p000a.C1721gO;
import p000a.C2124o4;
import p000a.C2372sd;
import p000a.C2422td;
import p000a.C2616xE;
import p000a.EnumC0345Gb;
import p000a.EnumC1632eh;
import p000a.EnumC2241qF;
import p000a.InterfaceC0115CE;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;
import p000a.ViewOnAttachStateChangeListenerC2639xj;

/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public final class C2762z {

    /* renamed from: h */
    public final C0525Ju f8995h;

    /* renamed from: v */
    public final AbstractComponentCallbacksC2342s3 f8996v;

    /* renamed from: z */
    public final C0425I3 f8997z;

    /* renamed from: P */
    public boolean f8994P = false;

    /* renamed from: N */
    public int f8993N = -1;

    public C2762z(C0425I3 c0425i3, C0525Ju c0525Ju, AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        this.f8997z = c0425i3;
        this.f8995h = c0525Ju;
        this.f8996v = abstractComponentCallbacksC2342s3;
    }

    /* renamed from: G */
    public final void m4823G() {
        Bundle bundle;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (abstractComponentCallbacksC2342s3.f7199Y && abstractComponentCallbacksC2342s3.f7190J && !abstractComponentCallbacksC2342s3.f7187H) {
            if (C0364Gx.m791p(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2342s3);
            }
            Bundle bundle2 = abstractComponentCallbacksC2342s3.f7194R;
            Bundle bundle3 = null;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            abstractComponentCallbacksC2342s3.mo288i(abstractComponentCallbacksC2342s3.mo280H(bundle), null, bundle);
            View view = abstractComponentCallbacksC2342s3.f7222t;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC2342s3.f7222t.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC2342s3);
                if (abstractComponentCallbacksC2342s3.f7208i) {
                    abstractComponentCallbacksC2342s3.f7222t.setVisibility(8);
                }
                Bundle bundle4 = abstractComponentCallbacksC2342s3.f7194R;
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC2342s3.mo3517j(abstractComponentCallbacksC2342s3.f7222t, bundle3);
                abstractComponentCallbacksC2342s3.f7201Z.m843y(2);
                this.f8997z.m960S(false);
                abstractComponentCallbacksC2342s3.f7195S = 2;
            }
        }
    }

    /* renamed from: I */
    public final void m4824I() {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (abstractComponentCallbacksC2342s3.f7222t == null) {
            return;
        }
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC2342s3 + " with view " + abstractComponentCallbacksC2342s3.f7222t);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC2342s3.f7222t.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC2342s3.f7223w = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC2342s3.f7219qn.f4091q.m2712v(bundle);
        if (!bundle.isEmpty()) {
            abstractComponentCallbacksC2342s3.f7189I = bundle;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x015e, code lost:
    
        continue;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4825M() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2762z.m4825M():void");
    }

    /* renamed from: N */
    public final void m4826N() {
        Bundle bundle;
        boolean m791p = C0364Gx.m791p(3);
        final AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (m791p) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC2342s3);
        }
        Bundle bundle2 = abstractComponentCallbacksC2342s3.f7194R;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!abstractComponentCallbacksC2342s3.f7211l) {
            C0425I3 c0425i3 = this.f8997z;
            c0425i3.m964o(false);
            abstractComponentCallbacksC2342s3.f7201Z.m842x();
            abstractComponentCallbacksC2342s3.f7195S = 1;
            abstractComponentCallbacksC2342s3.f7224x = false;
            abstractComponentCallbacksC2342s3.f7200Yd.mo728z(new InterfaceC1270Xo() { // from class: androidx.fragment.app.Fragment$6
                @Override // p000a.InterfaceC1270Xo
                /* renamed from: Q */
                public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
                    View view;
                    if (enumC2241qF == EnumC2241qF.ON_STOP && (view = AbstractComponentCallbacksC2342s3.this.f7222t) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
            abstractComponentCallbacksC2342s3.mo290r(bundle);
            abstractComponentCallbacksC2342s3.f7211l = true;
            if (abstractComponentCallbacksC2342s3.f7224x) {
                abstractComponentCallbacksC2342s3.f7200Yd.m721N(EnumC2241qF.ON_CREATE);
                c0425i3.m966v(false);
                return;
            } else {
                throw new C2372sd("Fragment " + abstractComponentCallbacksC2342s3 + " did not call through to super.onCreate()");
            }
        }
        abstractComponentCallbacksC2342s3.f7195S = 1;
        abstractComponentCallbacksC2342s3.m4019x();
    }

    /* renamed from: P */
    public final int m4827P() {
        int i;
        Object obj;
        int i2;
        boolean z;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (abstractComponentCallbacksC2342s3.f7198X == null) {
            return abstractComponentCallbacksC2342s3.f7195S;
        }
        int i3 = this.f8993N;
        int ordinal = abstractComponentCallbacksC2342s3.f7215nP.ordinal();
        int i4 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i3 = Math.min(i3, -1);
                    }
                } else {
                    i3 = Math.min(i3, 5);
                }
            } else {
                i3 = Math.min(i3, 1);
            }
        } else {
            i3 = Math.min(i3, 0);
        }
        if (abstractComponentCallbacksC2342s3.f7199Y) {
            if (abstractComponentCallbacksC2342s3.f7190J) {
                i3 = Math.max(this.f8993N, 2);
                View view = abstractComponentCallbacksC2342s3.f7222t;
                if (view != null && view.getParent() == null) {
                    i3 = Math.min(i3, 2);
                }
            } else {
                i3 = this.f8993N < 4 ? Math.min(i3, abstractComponentCallbacksC2342s3.f7195S) : Math.min(i3, 1);
            }
        }
        if (!abstractComponentCallbacksC2342s3.f7185E) {
            i3 = Math.min(i3, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2342s3.f7196T;
        if (viewGroup != null) {
            C0135Cc m266o = C0135Cc.m266o(viewGroup, abstractComponentCallbacksC2342s3.m4005R());
            m266o.getClass();
            AbstractC0204Du m270Q = m266o.m270Q(abstractComponentCallbacksC2342s3);
            if (m270Q != null) {
                i = m270Q.f618h;
            } else {
                i = 0;
            }
            Iterator it = m266o.f458v.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    AbstractC0204Du abstractC0204Du = (AbstractC0204Du) obj;
                    if (AbstractC1292YB.m2695u(abstractC0204Du.f620v, abstractComponentCallbacksC2342s3) && !abstractC0204Du.f617Q) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AbstractC0204Du abstractC0204Du2 = (AbstractC0204Du) obj;
            if (abstractC0204Du2 != null) {
                i4 = abstractC0204Du2.f618h;
            }
            if (i == 0) {
                i2 = -1;
            } else {
                i2 = AbstractC2214pj.f6818z[AbstractC2441tz.m4204s(i)];
            }
            if (i2 != -1 && i2 != 1) {
                i4 = i;
            }
        }
        if (i4 == 2) {
            i3 = Math.min(i3, 6);
        } else if (i4 == 3) {
            i3 = Math.max(i3, 3);
        } else if (abstractComponentCallbacksC2342s3.f7206f) {
            if (abstractComponentCallbacksC2342s3.m4016s()) {
                i3 = Math.min(i3, 1);
            } else {
                i3 = Math.min(i3, -1);
            }
        }
        if (abstractComponentCallbacksC2342s3.f7182B && abstractComponentCallbacksC2342s3.f7195S < 5) {
            i3 = Math.min(i3, 4);
        }
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i3 + " for " + abstractComponentCallbacksC2342s3);
        }
        return i3;
    }

    /* renamed from: Q */
    public final void m4828Q() {
        Bundle bundle;
        String str;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (abstractComponentCallbacksC2342s3.f7199Y) {
            return;
        }
        if (C0364Gx.m791p(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2342s3);
        }
        Bundle bundle2 = abstractComponentCallbacksC2342s3.f7194R;
        Bundle bundle3 = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater mo280H = abstractComponentCallbacksC2342s3.mo280H(bundle);
        ViewGroup viewGroup = abstractComponentCallbacksC2342s3.f7196T;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC2342s3.f7209j;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) abstractComponentCallbacksC2342s3.f7198X.f1241U.mo1968Ha(i);
                    if (viewGroup == null) {
                        if (!abstractComponentCallbacksC2342s3.f7203c) {
                            try {
                                str = abstractComponentCallbacksC2342s3.m4018w().getResourceName(abstractComponentCallbacksC2342s3.f7209j);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC2342s3.f7209j) + " (" + str + ") for fragment " + abstractComponentCallbacksC2342s3);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        C1471be c1471be = AbstractC2465uS.f7563z;
                        AbstractC2465uS.m4244h(new C1721gO(abstractComponentCallbacksC2342s3, viewGroup, 1));
                        AbstractC2465uS.m4245z(abstractComponentCallbacksC2342s3).getClass();
                        EnumC0345Gb enumC0345Gb = EnumC0345Gb.f1158I;
                        if (enumC0345Gb instanceof Void) {
                            Void r8 = (Void) enumC0345Gb;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC2342s3 + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        abstractComponentCallbacksC2342s3.f7196T = viewGroup;
        abstractComponentCallbacksC2342s3.mo288i(mo280H, viewGroup, bundle);
        if (abstractComponentCallbacksC2342s3.f7222t != null) {
            if (C0364Gx.m791p(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC2342s3);
            }
            abstractComponentCallbacksC2342s3.f7222t.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC2342s3.f7222t.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC2342s3);
            if (viewGroup != null) {
                m4833h();
            }
            if (abstractComponentCallbacksC2342s3.f7208i) {
                abstractComponentCallbacksC2342s3.f7222t.setVisibility(8);
            }
            View view = abstractComponentCallbacksC2342s3.f7222t;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (AbstractC1285Y3.m2633h(view)) {
                AbstractC1589dw.m3064v(abstractComponentCallbacksC2342s3.f7222t);
            } else {
                View view2 = abstractComponentCallbacksC2342s3.f7222t;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2639xj(this, view2));
            }
            Bundle bundle4 = abstractComponentCallbacksC2342s3.f7194R;
            if (bundle4 != null) {
                bundle3 = bundle4.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC2342s3.mo3517j(abstractComponentCallbacksC2342s3.f7222t, bundle3);
            abstractComponentCallbacksC2342s3.f7201Z.m843y(2);
            this.f8997z.m960S(false);
            int visibility = abstractComponentCallbacksC2342s3.f7222t.getVisibility();
            abstractComponentCallbacksC2342s3.m4014o().f4955V = abstractComponentCallbacksC2342s3.f7222t.getAlpha();
            if (abstractComponentCallbacksC2342s3.f7196T != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC2342s3.f7222t.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC2342s3.m4014o().f4954S = findFocus;
                    if (C0364Gx.m791p(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC2342s3);
                    }
                }
                abstractComponentCallbacksC2342s3.f7222t.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC2342s3.f7195S = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4829R() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2762z.m4829R():void");
    }

    /* renamed from: S */
    public final void m4830S(ClassLoader classLoader) {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        Bundle bundle = abstractComponentCallbacksC2342s3.f7194R;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC2342s3.f7194R.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC2342s3.f7194R.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC2342s3.f7223w = abstractComponentCallbacksC2342s3.f7194R.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC2342s3.f7189I = abstractComponentCallbacksC2342s3.f7194R.getBundle("viewRegistryState");
        C1017T4 c1017t4 = (C1017T4) abstractComponentCallbacksC2342s3.f7194R.getParcelable("state");
        if (c1017t4 != null) {
            abstractComponentCallbacksC2342s3.f7225y = c1017t4.f3403f;
            abstractComponentCallbacksC2342s3.f7221s = c1017t4.f3407r;
            abstractComponentCallbacksC2342s3.f7191K = c1017t4.f3402Y;
        }
        if (abstractComponentCallbacksC2342s3.f7191K) {
            return;
        }
        abstractComponentCallbacksC2342s3.f7182B = true;
    }

    /* renamed from: V */
    public final void m4831V() {
        boolean m791p = C0364Gx.m791p(3);
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (m791p) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC2342s3);
        }
        abstractComponentCallbacksC2342s3.f7201Z.m843y(5);
        if (abstractComponentCallbacksC2342s3.f7222t != null) {
            abstractComponentCallbacksC2342s3.f7219qn.m2598v(EnumC2241qF.ON_PAUSE);
        }
        abstractComponentCallbacksC2342s3.f7200Yd.m721N(EnumC2241qF.ON_PAUSE);
        abstractComponentCallbacksC2342s3.f7195S = 6;
        abstractComponentCallbacksC2342s3.f7224x = true;
        this.f8997z.m958Q(false);
    }

    /* renamed from: W */
    public final void m4832W() {
        boolean m791p = C0364Gx.m791p(3);
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (m791p) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC2342s3);
        }
        abstractComponentCallbacksC2342s3.f7195S = -1;
        boolean z = false;
        abstractComponentCallbacksC2342s3.f7224x = false;
        abstractComponentCallbacksC2342s3.mo286c();
        if (abstractComponentCallbacksC2342s3.f7224x) {
            C0364Gx c0364Gx = abstractComponentCallbacksC2342s3.f7201Z;
            if (!c0364Gx.f1226C) {
                c0364Gx.m804M();
                abstractComponentCallbacksC2342s3.f7201Z = new C0364Gx();
            }
            this.f8997z.m956N(false);
            abstractComponentCallbacksC2342s3.f7195S = -1;
            abstractComponentCallbacksC2342s3.f7186F = null;
            abstractComponentCallbacksC2342s3.f7183C = null;
            abstractComponentCallbacksC2342s3.f7198X = null;
            boolean z2 = true;
            if (abstractComponentCallbacksC2342s3.f7206f && !abstractComponentCallbacksC2342s3.m4016s()) {
                z = true;
            }
            if (!z) {
                C0916RF c0916rf = (C0916RF) this.f8995h.f1763N;
                if (c0916rf.f3145I.containsKey(abstractComponentCallbacksC2342s3.f7218q) && c0916rf.f3146g) {
                    z2 = c0916rf.f3150y;
                }
                if (!z2) {
                    return;
                }
            }
            if (C0364Gx.m791p(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC2342s3);
            }
            abstractComponentCallbacksC2342s3.m4012k();
            return;
        }
        throw new C2372sd("Fragment " + abstractComponentCallbacksC2342s3 + " did not call through to super.onDetach()");
    }

    /* renamed from: h */
    public final void m4833h() {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3;
        int i;
        View view;
        View view2;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s33 = this.f8996v;
        View view3 = abstractComponentCallbacksC2342s33.f7196T;
        while (true) {
            abstractComponentCallbacksC2342s3 = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof AbstractComponentCallbacksC2342s3) {
                abstractComponentCallbacksC2342s32 = (AbstractComponentCallbacksC2342s3) tag;
            } else {
                abstractComponentCallbacksC2342s32 = null;
            }
            if (abstractComponentCallbacksC2342s32 != null) {
                abstractComponentCallbacksC2342s3 = abstractComponentCallbacksC2342s32;
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s34 = abstractComponentCallbacksC2342s33.f7183C;
        if (abstractComponentCallbacksC2342s3 != null && !abstractComponentCallbacksC2342s3.equals(abstractComponentCallbacksC2342s34)) {
            int i2 = abstractComponentCallbacksC2342s33.f7209j;
            C1471be c1471be = AbstractC2465uS.f7563z;
            AbstractC2465uS.m4244h(new C2124o4(abstractComponentCallbacksC2342s33, abstractComponentCallbacksC2342s3, i2));
            AbstractC2465uS.m4245z(abstractComponentCallbacksC2342s33).getClass();
            EnumC0345Gb enumC0345Gb = EnumC0345Gb.f1161w;
            if (enumC0345Gb instanceof Void) {
                Void r1 = (Void) enumC0345Gb;
            }
        }
        C0525Ju c0525Ju = this.f8995h;
        c0525Ju.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC2342s33.f7196T;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) c0525Ju.f1764P).indexOf(abstractComponentCallbacksC2342s33);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) c0525Ju.f1764P).size()) {
                            break;
                        }
                        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s35 = (AbstractComponentCallbacksC2342s3) ((ArrayList) c0525Ju.f1764P).get(indexOf);
                        if (abstractComponentCallbacksC2342s35.f7196T == viewGroup && (view = abstractComponentCallbacksC2342s35.f7222t) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s36 = (AbstractComponentCallbacksC2342s3) ((ArrayList) c0525Ju.f1764P).get(i3);
                    if (abstractComponentCallbacksC2342s36.f7196T == viewGroup && (view2 = abstractComponentCallbacksC2342s36.f7222t) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
            abstractComponentCallbacksC2342s33.f7196T.addView(abstractComponentCallbacksC2342s33.f7222t, i);
        }
        i = -1;
        abstractComponentCallbacksC2342s33.f7196T.addView(abstractComponentCallbacksC2342s33.f7222t, i);
    }

    /* renamed from: k */
    public final void m4834k() {
        boolean m791p = C0364Gx.m791p(3);
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (m791p) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC2342s3);
        }
        C0364Gx c0364Gx = abstractComponentCallbacksC2342s3.f7201Z;
        c0364Gx.f1246Z = true;
        c0364Gx.f1248d.f3149s = true;
        c0364Gx.m843y(4);
        if (abstractComponentCallbacksC2342s3.f7222t != null) {
            abstractComponentCallbacksC2342s3.f7219qn.m2598v(EnumC2241qF.ON_STOP);
        }
        abstractComponentCallbacksC2342s3.f7200Yd.m721N(EnumC2241qF.ON_STOP);
        abstractComponentCallbacksC2342s3.f7195S = 4;
        abstractComponentCallbacksC2342s3.f7224x = false;
        abstractComponentCallbacksC2342s3.mo289p();
        if (abstractComponentCallbacksC2342s3.f7224x) {
            this.f8997z.m961V(false);
            return;
        }
        throw new C2372sd("Fragment " + abstractComponentCallbacksC2342s3 + " did not call through to super.onStop()");
    }

    /* renamed from: o */
    public final void m4835o() {
        View view;
        boolean m791p = C0364Gx.m791p(3);
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (m791p) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC2342s3);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2342s3.f7196T;
        if (viewGroup != null && (view = abstractComponentCallbacksC2342s3.f7222t) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC2342s3.f7201Z.m843y(1);
        if (abstractComponentCallbacksC2342s3.f7222t != null) {
            C1271Xp c1271Xp = abstractComponentCallbacksC2342s3.f7219qn;
            c1271Xp.m2597P();
            if (c1271Xp.f4088I.f1105P.m3117z(EnumC1632eh.f5092w)) {
                abstractComponentCallbacksC2342s3.f7219qn.m2598v(EnumC2241qF.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC2342s3.f7195S = 1;
        abstractComponentCallbacksC2342s3.f7224x = false;
        abstractComponentCallbacksC2342s3.mo281J();
        if (abstractComponentCallbacksC2342s3.f7224x) {
            C2616xE c2616xE = ((C2422td) new C1174Vy(abstractComponentCallbacksC2342s3.mo1569G(), C2422td.f7417q).m2397S(C2422td.class)).f7418I;
            if (c2616xE.m4506o() <= 0) {
                abstractComponentCallbacksC2342s3.f7187H = false;
                this.f8997z.m959R(false);
                abstractComponentCallbacksC2342s3.f7196T = null;
                abstractComponentCallbacksC2342s3.f7222t = null;
                abstractComponentCallbacksC2342s3.f7219qn = null;
                abstractComponentCallbacksC2342s3.f7188HL.mo2290G(null);
                abstractComponentCallbacksC2342s3.f7190J = false;
                return;
            }
            AbstractC2441tz.m4202q(c2616xE.m4505W(0));
            throw null;
        }
        throw new C2372sd("Fragment " + abstractComponentCallbacksC2342s3 + " did not call through to super.onDestroyView()");
    }

    /* renamed from: q */
    public final void m4836q() {
        boolean m791p = C0364Gx.m791p(3);
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (m791p) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC2342s3);
        }
        abstractComponentCallbacksC2342s3.f7201Z.m842x();
        abstractComponentCallbacksC2342s3.f7201Z.m823f(true);
        abstractComponentCallbacksC2342s3.f7195S = 5;
        abstractComponentCallbacksC2342s3.f7224x = false;
        abstractComponentCallbacksC2342s3.mo285Z();
        if (abstractComponentCallbacksC2342s3.f7224x) {
            C0326GG c0326gg = abstractComponentCallbacksC2342s3.f7200Yd;
            EnumC2241qF enumC2241qF = EnumC2241qF.ON_START;
            c0326gg.m721N(enumC2241qF);
            if (abstractComponentCallbacksC2342s3.f7222t != null) {
                abstractComponentCallbacksC2342s3.f7219qn.m2598v(enumC2241qF);
            }
            C0364Gx c0364Gx = abstractComponentCallbacksC2342s3.f7201Z;
            c0364Gx.f1228F = false;
            c0364Gx.f1246Z = false;
            c0364Gx.f1248d.f3149s = false;
            c0364Gx.m843y(5);
            this.f8997z.m955M(false);
            return;
        }
        throw new C2372sd("Fragment " + abstractComponentCallbacksC2342s3 + " did not call through to super.onStart()");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4837u() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2762z.m4837u():void");
    }

    /* renamed from: v */
    public final void m4838v() {
        C2762z c2762z;
        Bundle bundle;
        boolean m791p = C0364Gx.m791p(3);
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (m791p) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC2342s3);
        }
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = abstractComponentCallbacksC2342s3.f7207g;
        C0525Ju c0525Ju = this.f8995h;
        if (abstractComponentCallbacksC2342s32 != null) {
            c2762z = (C2762z) ((HashMap) c0525Ju.f1765h).get(abstractComponentCallbacksC2342s32.f7218q);
            if (c2762z != null) {
                abstractComponentCallbacksC2342s3.f7225y = abstractComponentCallbacksC2342s3.f7207g.f7218q;
                abstractComponentCallbacksC2342s3.f7207g = null;
            } else {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC2342s3 + " declared target fragment " + abstractComponentCallbacksC2342s3.f7207g + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = abstractComponentCallbacksC2342s3.f7225y;
            if (str != null) {
                c2762z = (C2762z) ((HashMap) c0525Ju.f1765h).get(str);
                if (c2762z == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC2342s3);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(AbstractC2441tz.m4187M(sb, abstractComponentCallbacksC2342s3.f7225y, " that does not belong to this FragmentManager!"));
                }
            } else {
                c2762z = null;
            }
        }
        if (c2762z != null) {
            c2762z.m4825M();
        }
        C0364Gx c0364Gx = abstractComponentCallbacksC2342s3.f7198X;
        abstractComponentCallbacksC2342s3.f7186F = c0364Gx.f1260s;
        abstractComponentCallbacksC2342s3.f7183C = c0364Gx.f1227E;
        C0425I3 c0425i3 = this.f8997z;
        c0425i3.m965u(false);
        ArrayList arrayList = abstractComponentCallbacksC2342s3.f7214nF;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s33 = ((C0276FF) it.next()).f957z;
            abstractComponentCallbacksC2342s33.f7216od.m2713z();
            AbstractC1843ih.m3402E(abstractComponentCallbacksC2342s33);
            Bundle bundle2 = abstractComponentCallbacksC2342s33.f7194R;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            abstractComponentCallbacksC2342s33.f7216od.m2711h(bundle);
        }
        arrayList.clear();
        abstractComponentCallbacksC2342s3.f7201Z.m825h(abstractComponentCallbacksC2342s3.f7186F, abstractComponentCallbacksC2342s3.mo291u(), abstractComponentCallbacksC2342s3);
        abstractComponentCallbacksC2342s3.f7195S = 0;
        abstractComponentCallbacksC2342s3.f7224x = false;
        abstractComponentCallbacksC2342s3.mo287f(abstractComponentCallbacksC2342s3.f7186F.f2884w);
        if (abstractComponentCallbacksC2342s3.f7224x) {
            Iterator it2 = abstractComponentCallbacksC2342s3.f7198X.f1239R.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0115CE) it2.next()).mo238z(abstractComponentCallbacksC2342s3);
            }
            C0364Gx c0364Gx2 = abstractComponentCallbacksC2342s3.f7201Z;
            c0364Gx2.f1228F = false;
            c0364Gx2.f1246Z = false;
            c0364Gx2.f1248d.f3149s = false;
            c0364Gx2.m843y(0);
            c0425i3.m963h(false);
            return;
        }
        throw new C2372sd("Fragment " + abstractComponentCallbacksC2342s3 + " did not call through to super.onAttach()");
    }

    /* renamed from: w */
    public final Bundle m4839w() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (abstractComponentCallbacksC2342s3.f7195S == -1 && (bundle = abstractComponentCallbacksC2342s3.f7194R) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C1017T4(abstractComponentCallbacksC2342s3));
        if (abstractComponentCallbacksC2342s3.f7195S > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC2342s3.mo279F(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f8997z.m954G(false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC2342s3.f7216od.m2712v(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle m827l = abstractComponentCallbacksC2342s3.f7201Z.m827l();
            if (!m827l.isEmpty()) {
                bundle2.putBundle("childFragmentManager", m827l);
            }
            if (abstractComponentCallbacksC2342s3.f7222t != null) {
                m4824I();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC2342s3.f7223w;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC2342s3.f7189I;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC2342s3.f7210k;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* renamed from: z */
    public final void m4840z() {
        Bundle bundle;
        boolean m791p = C0364Gx.m791p(3);
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8996v;
        if (m791p) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC2342s3);
        }
        Bundle bundle2 = abstractComponentCallbacksC2342s3.f7194R;
        if (bundle2 != null) {
            bundle2.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC2342s3.f7201Z.m842x();
        abstractComponentCallbacksC2342s3.f7195S = 3;
        abstractComponentCallbacksC2342s3.f7224x = false;
        abstractComponentCallbacksC2342s3.mo284U();
        if (abstractComponentCallbacksC2342s3.f7224x) {
            if (C0364Gx.m791p(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC2342s3);
            }
            if (abstractComponentCallbacksC2342s3.f7222t != null) {
                Bundle bundle3 = abstractComponentCallbacksC2342s3.f7194R;
                if (bundle3 != null) {
                    bundle = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle = null;
                }
                SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC2342s3.f7223w;
                if (sparseArray != null) {
                    abstractComponentCallbacksC2342s3.f7222t.restoreHierarchyState(sparseArray);
                    abstractComponentCallbacksC2342s3.f7223w = null;
                }
                abstractComponentCallbacksC2342s3.f7224x = false;
                abstractComponentCallbacksC2342s3.mo283L(bundle);
                if (abstractComponentCallbacksC2342s3.f7224x) {
                    if (abstractComponentCallbacksC2342s3.f7222t != null) {
                        abstractComponentCallbacksC2342s3.f7219qn.m2598v(EnumC2241qF.ON_CREATE);
                    }
                } else {
                    throw new C2372sd("Fragment " + abstractComponentCallbacksC2342s3 + " did not call through to super.onViewStateRestored()");
                }
            }
            abstractComponentCallbacksC2342s3.f7194R = null;
            C0364Gx c0364Gx = abstractComponentCallbacksC2342s3.f7201Z;
            c0364Gx.f1228F = false;
            c0364Gx.f1246Z = false;
            c0364Gx.f1248d.f3149s = false;
            c0364Gx.m843y(4);
            this.f8997z.m967z(false);
            return;
        }
        throw new C2372sd("Fragment " + abstractComponentCallbacksC2342s3 + " did not call through to super.onActivityCreated()");
    }

    public C2762z(C0425I3 c0425i3, C0525Ju c0525Ju, AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3, Bundle bundle) {
        this.f8997z = c0425i3;
        this.f8995h = c0525Ju;
        this.f8996v = abstractComponentCallbacksC2342s3;
        abstractComponentCallbacksC2342s3.f7223w = null;
        abstractComponentCallbacksC2342s3.f7189I = null;
        abstractComponentCallbacksC2342s3.f7205e = 0;
        abstractComponentCallbacksC2342s3.f7190J = false;
        abstractComponentCallbacksC2342s3.f7185E = false;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = abstractComponentCallbacksC2342s3.f7207g;
        abstractComponentCallbacksC2342s3.f7225y = abstractComponentCallbacksC2342s32 != null ? abstractComponentCallbacksC2342s32.f7218q : null;
        abstractComponentCallbacksC2342s3.f7207g = null;
        abstractComponentCallbacksC2342s3.f7194R = bundle;
        abstractComponentCallbacksC2342s3.f7210k = bundle.getBundle("arguments");
    }

    public C2762z(C0425I3 c0425i3, C0525Ju c0525Ju, ClassLoader classLoader, C1448bA c1448bA, Bundle bundle) {
        this.f8997z = c0425i3;
        this.f8995h = c0525Ju;
        AbstractComponentCallbacksC2342s3 m2196h = ((C1017T4) bundle.getParcelable("state")).m2196h(c1448bA);
        this.f8996v = m2196h;
        m2196h.f7194R = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        m2196h.m4017t(bundle2);
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + m2196h);
        }
    }
}
