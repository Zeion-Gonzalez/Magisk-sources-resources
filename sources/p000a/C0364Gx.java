package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C2752h;
import androidx.fragment.app.C2762z;
import androidx.fragment.app.FragmentContainerView;
import com.topjohnwu.magisk.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.Gx */
/* loaded from: classes.dex */
public final class C0364Gx {

    /* renamed from: C */
    public boolean f1226C;

    /* renamed from: E */
    public AbstractComponentCallbacksC2342s3 f1227E;

    /* renamed from: F */
    public boolean f1228F;

    /* renamed from: H */
    public C2300rJ f1230H;

    /* renamed from: I */
    public final C0958Rz f1231I;

    /* renamed from: J */
    public C2300rJ f1232J;

    /* renamed from: L */
    public ArrayList f1233L;

    /* renamed from: N */
    public ArrayList f1235N;

    /* renamed from: O */
    public final RunnableC1927kG f1236O;

    /* renamed from: P */
    public ArrayList f1237P;

    /* renamed from: R */
    public final CopyOnWriteArrayList f1239R;

    /* renamed from: S */
    public final C0425I3 f1240S;

    /* renamed from: U */
    public AbstractC2703z2 f1241U;

    /* renamed from: V */
    public ArrayList f1242V;

    /* renamed from: X */
    public boolean f1244X;

    /* renamed from: Y */
    public final C2052mg f1245Y;

    /* renamed from: Z */
    public boolean f1246Z;

    /* renamed from: c */
    public C2300rJ f1247c;

    /* renamed from: d */
    public C0916RF f1248d;

    /* renamed from: e */
    public ArrayDeque f1249e;

    /* renamed from: f */
    public AbstractComponentCallbacksC2342s3 f1250f;

    /* renamed from: g */
    public final C1222Wp f1251g;

    /* renamed from: h */
    public boolean f1252h;

    /* renamed from: i */
    public ArrayList f1253i;

    /* renamed from: j */
    public ArrayList f1254j;

    /* renamed from: k */
    public final C0958Rz f1255k;

    /* renamed from: p */
    public boolean f1257p;

    /* renamed from: q */
    public final C0958Rz f1258q;

    /* renamed from: r */
    public final C1448bA f1259r;

    /* renamed from: s */
    public C0852Pu f1260s;

    /* renamed from: u */
    public C2752h f1261u;

    /* renamed from: w */
    public final C0958Rz f1263w;

    /* renamed from: y */
    public int f1264y;

    /* renamed from: z */
    public final ArrayList f1265z = new ArrayList();

    /* renamed from: v */
    public final C0525Ju f1262v = new C0525Ju(3);

    /* renamed from: Q */
    public final LayoutInflaterFactory2C2724zP f1238Q = new LayoutInflaterFactory2C2724zP(this);

    /* renamed from: o */
    public final C1385Zw f1256o = new C1385Zw(this);

    /* renamed from: W */
    public final AtomicInteger f1243W = new AtomicInteger();

    /* renamed from: G */
    public final Map f1229G = Collections.synchronizedMap(new HashMap());

    /* renamed from: M */
    public final Map f1234M = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [a.Rz] */
    /* JADX WARN: Type inference failed for: r0v13, types: [a.Rz] */
    /* JADX WARN: Type inference failed for: r0v14, types: [a.Rz] */
    /* JADX WARN: Type inference failed for: r0v15, types: [a.Rz] */
    public C0364Gx() {
        final int i = 3;
        Collections.synchronizedMap(new HashMap());
        this.f1240S = new C0425I3(this);
        this.f1239R = new CopyOnWriteArrayList();
        final int i2 = 0;
        this.f1263w = new InterfaceC1617eQ(this) { // from class: a.Rz

            /* renamed from: h */
            public final /* synthetic */ C0364Gx f3261h;

            {
                this.f3261h = this;
            }

            @Override // p000a.InterfaceC1617eQ
            /* renamed from: z */
            public final void mo2146z(Object obj) {
                int i32 = i2;
                C0364Gx c0364Gx = this.f3261h;
                switch (i32) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m833o(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c0364Gx.m803L() && num.intValue() == 80) {
                            c0364Gx.m814V(false);
                            return;
                        }
                        return;
                    case 2:
                        C1925kC c1925kC = (C1925kC) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m810S(c1925kC.f5988z, false);
                            return;
                        }
                        return;
                    default:
                        C0160D7 c0160d7 = (C0160D7) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m826k(c0160d7.f518z, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 1;
        this.f1231I = new InterfaceC1617eQ(this) { // from class: a.Rz

            /* renamed from: h */
            public final /* synthetic */ C0364Gx f3261h;

            {
                this.f3261h = this;
            }

            @Override // p000a.InterfaceC1617eQ
            /* renamed from: z */
            public final void mo2146z(Object obj) {
                int i32 = i3;
                C0364Gx c0364Gx = this.f3261h;
                switch (i32) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m833o(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c0364Gx.m803L() && num.intValue() == 80) {
                            c0364Gx.m814V(false);
                            return;
                        }
                        return;
                    case 2:
                        C1925kC c1925kC = (C1925kC) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m810S(c1925kC.f5988z, false);
                            return;
                        }
                        return;
                    default:
                        C0160D7 c0160d7 = (C0160D7) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m826k(c0160d7.f518z, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 2;
        this.f1258q = new InterfaceC1617eQ(this) { // from class: a.Rz

            /* renamed from: h */
            public final /* synthetic */ C0364Gx f3261h;

            {
                this.f3261h = this;
            }

            @Override // p000a.InterfaceC1617eQ
            /* renamed from: z */
            public final void mo2146z(Object obj) {
                int i32 = i4;
                C0364Gx c0364Gx = this.f3261h;
                switch (i32) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m833o(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c0364Gx.m803L() && num.intValue() == 80) {
                            c0364Gx.m814V(false);
                            return;
                        }
                        return;
                    case 2:
                        C1925kC c1925kC = (C1925kC) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m810S(c1925kC.f5988z, false);
                            return;
                        }
                        return;
                    default:
                        C0160D7 c0160d7 = (C0160D7) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m826k(c0160d7.f518z, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f1255k = new InterfaceC1617eQ(this) { // from class: a.Rz

            /* renamed from: h */
            public final /* synthetic */ C0364Gx f3261h;

            {
                this.f3261h = this;
            }

            @Override // p000a.InterfaceC1617eQ
            /* renamed from: z */
            public final void mo2146z(Object obj) {
                int i32 = i;
                C0364Gx c0364Gx = this.f3261h;
                switch (i32) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m833o(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c0364Gx.m803L() && num.intValue() == 80) {
                            c0364Gx.m814V(false);
                            return;
                        }
                        return;
                    case 2:
                        C1925kC c1925kC = (C1925kC) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m810S(c1925kC.f5988z, false);
                            return;
                        }
                        return;
                    default:
                        C0160D7 c0160d7 = (C0160D7) obj;
                        if (c0364Gx.m803L()) {
                            c0364Gx.m826k(c0160d7.f518z, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f1251g = new C1222Wp(this);
        this.f1264y = -1;
        this.f1259r = new C1448bA(this);
        this.f1245Y = new C2052mg(i3, this);
        this.f1249e = new ArrayDeque();
        this.f1236O = new RunnableC1927kG(i3, this);
    }

    /* renamed from: d */
    public static boolean m787d(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (abstractComponentCallbacksC2342s3 != null) {
            C0364Gx c0364Gx = abstractComponentCallbacksC2342s3.f7198X;
            if (!abstractComponentCallbacksC2342s3.equals(c0364Gx.f1250f) || !m787d(c0364Gx.f1227E)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m788i(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (abstractComponentCallbacksC2342s3 == null || (abstractComponentCallbacksC2342s3.f7213n && (abstractComponentCallbacksC2342s3.f7198X == null || m788i(abstractComponentCallbacksC2342s3.f7183C)))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m789j(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        Iterator it = abstractComponentCallbacksC2342s3.f7201Z.f1262v.m1228S().iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = (AbstractComponentCallbacksC2342s3) it.next();
            if (abstractComponentCallbacksC2342s32 != null) {
                z = m789j(abstractComponentCallbacksC2342s32);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: od */
    public static void m790od(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (m791p(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC2342s3);
        }
        if (abstractComponentCallbacksC2342s3.f7208i) {
            abstractComponentCallbacksC2342s3.f7208i = false;
            abstractComponentCallbacksC2342s3.f7212m = !abstractComponentCallbacksC2342s3.f7212m;
        }
    }

    /* renamed from: p */
    public static boolean m791p(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: B */
    public final boolean m792B(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int m821c = m821c(i, str, z);
        if (m821c < 0) {
            return false;
        }
        for (int size = this.f1237P.size() - 1; size >= m821c; size--) {
            arrayList.add((C0398HY) this.f1237P.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: C */
    public final void m793C(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (m791p(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC2342s3);
        }
        if (!abstractComponentCallbacksC2342s3.f7208i) {
            abstractComponentCallbacksC2342s3.f7208i = true;
            abstractComponentCallbacksC2342s3.f7212m = true ^ abstractComponentCallbacksC2342s3.f7212m;
            m799HL(abstractComponentCallbacksC2342s3);
        }
    }

    /* renamed from: D */
    public final void m794D(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((C0398HY) arrayList.get(i)).f1329I) {
                        if (i2 != i) {
                            m817Y(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0398HY) arrayList.get(i2)).f1329I) {
                                i2++;
                            }
                        }
                        m817Y(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m817Y(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: E */
    public final void m795E(boolean z) {
        if (!this.f1252h) {
            if (this.f1260s == null) {
                if (this.f1226C) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f1260s.f2880I.getLooper()) {
                if (!z && m806O()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.f1254j == null) {
                    this.f1254j = new ArrayList();
                    this.f1233L = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* renamed from: F */
    public final C1448bA m796F() {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f1227E;
        if (abstractComponentCallbacksC2342s3 != null) {
            return abstractComponentCallbacksC2342s3.f7198X.m796F();
        }
        return this.f1259r;
    }

    /* renamed from: G */
    public final boolean m797G() {
        boolean z;
        if (this.f1264y < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
            if (abstractComponentCallbacksC2342s3 != null && m788i(abstractComponentCallbacksC2342s3)) {
                if (!abstractComponentCallbacksC2342s3.f7208i) {
                    z = abstractComponentCallbacksC2342s3.f7201Z.m797G() | false;
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC2342s3);
                    z2 = true;
                }
            }
        }
        if (this.f1235N != null) {
            for (int i = 0; i < this.f1235N.size(); i++) {
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = (AbstractComponentCallbacksC2342s3) this.f1235N.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC2342s32)) {
                    abstractComponentCallbacksC2342s32.getClass();
                }
            }
        }
        this.f1235N = arrayList;
        return z2;
    }

    /* renamed from: H */
    public final AbstractComponentCallbacksC2342s3 m798H(int i) {
        C0525Ju c0525Ju = this.f1262v;
        int size = ((ArrayList) c0525Ju.f1764P).size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = (AbstractComponentCallbacksC2342s3) ((ArrayList) c0525Ju.f1764P).get(size);
                if (abstractComponentCallbacksC2342s3 != null && abstractComponentCallbacksC2342s3.f7217p == i) {
                    return abstractComponentCallbacksC2342s3;
                }
            } else {
                for (C2762z c2762z : ((HashMap) c0525Ju.f1765h).values()) {
                    if (c2762z != null) {
                        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = c2762z.f8996v;
                        if (abstractComponentCallbacksC2342s32.f7217p == i) {
                            return abstractComponentCallbacksC2342s32;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: HL */
    public final void m799HL(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup m816X = m816X(abstractComponentCallbacksC2342s3);
        if (m816X != null) {
            C1614eM c1614eM = abstractComponentCallbacksC2342s3.f7184D;
            boolean z = false;
            if (c1614eM == null) {
                i = 0;
            } else {
                i = c1614eM.f4957h;
            }
            if (c1614eM == null) {
                i2 = 0;
            } else {
                i2 = c1614eM.f4960v;
            }
            int i5 = i2 + i;
            if (c1614eM == null) {
                i3 = 0;
            } else {
                i3 = c1614eM.f4952P;
            }
            int i6 = i3 + i5;
            if (c1614eM == null) {
                i4 = 0;
            } else {
                i4 = c1614eM.f4951N;
            }
            if (i4 + i6 > 0) {
                if (m816X.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    m816X.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC2342s3);
                }
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = (AbstractComponentCallbacksC2342s3) m816X.getTag(R.id.visible_removing_fragment_view_tag);
                C1614eM c1614eM2 = abstractComponentCallbacksC2342s3.f7184D;
                if (c1614eM2 != null) {
                    z = c1614eM2.f4961z;
                }
                if (abstractComponentCallbacksC2342s32.f7184D != null) {
                    abstractComponentCallbacksC2342s32.m4014o().f4961z = z;
                }
            }
        }
    }

    /* renamed from: I */
    public final void m800I() {
        if (this.f1264y >= 1) {
            for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
                if (abstractComponentCallbacksC2342s3 != null && !abstractComponentCallbacksC2342s3.f7208i) {
                    abstractComponentCallbacksC2342s3.f7201Z.m800I();
                }
            }
        }
    }

    /* renamed from: J */
    public final AbstractComponentCallbacksC2342s3 m801J(String str) {
        return this.f1262v.m1230W(str);
    }

    /* renamed from: K */
    public final void m802K(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (m791p(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC2342s3 + " nesting=" + abstractComponentCallbacksC2342s3.f7205e);
        }
        boolean z = !abstractComponentCallbacksC2342s3.m4016s();
        if (!abstractComponentCallbacksC2342s3.f7204d || z) {
            C0525Ju c0525Ju = this.f1262v;
            synchronized (((ArrayList) c0525Ju.f1764P)) {
                ((ArrayList) c0525Ju.f1764P).remove(abstractComponentCallbacksC2342s3);
            }
            abstractComponentCallbacksC2342s3.f7185E = false;
            if (m789j(abstractComponentCallbacksC2342s3)) {
                this.f1244X = true;
            }
            abstractComponentCallbacksC2342s3.f7206f = true;
            m799HL(abstractComponentCallbacksC2342s3);
        }
    }

    /* renamed from: L */
    public final boolean m803L() {
        boolean z;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f1227E;
        if (abstractComponentCallbacksC2342s3 == null) {
            return true;
        }
        if (abstractComponentCallbacksC2342s3.f7186F != null && abstractComponentCallbacksC2342s3.f7185E) {
            z = true;
        } else {
            z = false;
        }
        if (z && abstractComponentCallbacksC2342s3.m4005R().m803L()) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final void m804M() {
        boolean z = true;
        this.f1226C = true;
        m823f(true);
        Iterator it = m805N().iterator();
        while (it.hasNext()) {
            ((C0135Cc) it.next()).m273u();
        }
        C0852Pu c0852Pu = this.f1260s;
        boolean z2 = c0852Pu instanceof InterfaceC0670Mg;
        C0525Ju c0525Ju = this.f1262v;
        if (z2) {
            z = ((C0916RF) c0525Ju.f1763N).f3150y;
        } else {
            Context context = c0852Pu.f2884w;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it2 = this.f1229G.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0885Qd) it2.next()).f3049S) {
                    C0916RF c0916rf = (C0916RF) c0525Ju.f1763N;
                    c0916rf.getClass();
                    if (m791p(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c0916rf.m2069G(str);
                }
            }
        }
        m843y(-1);
        C0852Pu c0852Pu2 = this.f1260s;
        if (c0852Pu2 instanceof InterfaceC0238EW) {
            c0852Pu2.m1973T0(this.f1231I);
        }
        C0852Pu c0852Pu3 = this.f1260s;
        if (c0852Pu3 instanceof InterfaceC0568Kf) {
            c0852Pu3.m1967Fu(this.f1263w);
        }
        C0852Pu c0852Pu4 = this.f1260s;
        if (c0852Pu4 instanceof InterfaceC0381HG) {
            c0852Pu4.m1971Rh(this.f1258q);
        }
        C0852Pu c0852Pu5 = this.f1260s;
        if (c0852Pu5 instanceof InterfaceC1609eH) {
            c0852Pu5.m1969M6(this.f1255k);
        }
        C0852Pu c0852Pu6 = this.f1260s;
        if ((c0852Pu6 instanceof InterfaceC2335rw) && this.f1227E == null) {
            c0852Pu6.m1972Ry(this.f1251g);
        }
        this.f1260s = null;
        this.f1241U = null;
        this.f1227E = null;
        if (this.f1261u != null) {
            Iterator it3 = this.f1256o.f1203h.iterator();
            while (it3.hasNext()) {
                ((InterfaceC2582wf) it3.next()).cancel();
            }
            this.f1261u = null;
        }
        C2300rJ c2300rJ = this.f1232J;
        if (c2300rJ != null) {
            c2300rJ.m3958nB();
            this.f1247c.m3958nB();
            this.f1230H.m3958nB();
        }
    }

    /* renamed from: N */
    public final HashSet m805N() {
        C0135Cc c0135Cc;
        HashSet hashSet = new HashSet();
        Iterator it = this.f1262v.m1229V().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C2762z) it.next()).f8996v.f7196T;
            if (viewGroup != null) {
                m819Z();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0135Cc) {
                    c0135Cc = (C0135Cc) tag;
                } else {
                    c0135Cc = new C0135Cc(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0135Cc);
                }
                hashSet.add(c0135Cc);
            }
        }
        return hashSet;
    }

    /* renamed from: O */
    public final boolean m806O() {
        if (!this.f1228F && !this.f1246Z) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public final void m807P() {
        this.f1252h = false;
        this.f1233L.clear();
        this.f1254j.clear();
    }

    /* renamed from: Q */
    public final C2762z m808Q(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        String str = abstractComponentCallbacksC2342s3.f7218q;
        C0525Ju c0525Ju = this.f1262v;
        C2762z c2762z = (C2762z) ((HashMap) c0525Ju.f1765h).get(str);
        if (c2762z == null) {
            C2762z c2762z2 = new C2762z(this.f1240S, c0525Ju, abstractComponentCallbacksC2342s3);
            c2762z2.m4830S(this.f1260s.f2884w.getClassLoader());
            c2762z2.f8993N = this.f1264y;
            return c2762z2;
        }
        return c2762z;
    }

    /* renamed from: R */
    public final void m809R() {
        Iterator it = this.f1262v.m1228S().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = (AbstractComponentCallbacksC2342s3) it.next();
            if (abstractComponentCallbacksC2342s3 != null) {
                abstractComponentCallbacksC2342s3.m4011g();
                abstractComponentCallbacksC2342s3.f7201Z.m809R();
            }
        }
    }

    /* renamed from: S */
    public final void m810S(boolean z, boolean z2) {
        if (z2 && (this.f1260s instanceof InterfaceC0381HG)) {
            m845zx(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
            if (abstractComponentCallbacksC2342s3 != null && z2) {
                abstractComponentCallbacksC2342s3.f7201Z.m810S(z, true);
            }
        }
    }

    /* renamed from: T */
    public final boolean m811T(int i, int i2) {
        m823f(false);
        m795E(true);
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f1250f;
        if (abstractComponentCallbacksC2342s3 != null && i < 0 && abstractComponentCallbacksC2342s3.m4008W().m838t()) {
            return true;
        }
        boolean m792B = m792B(this.f1254j, this.f1233L, null, i, i2);
        if (m792B) {
            this.f1252h = true;
            try {
                m794D(this.f1254j, this.f1233L);
            } finally {
                m807P();
            }
        }
        m830n0();
        if (this.f1257p) {
            this.f1257p = false;
            m831nF();
        }
        this.f1262v.m1237u();
        return m792B;
    }

    /* renamed from: U */
    public final void m812U(InterfaceC0675Mm interfaceC0675Mm, boolean z) {
        if (!z) {
            if (this.f1260s == null) {
                if (this.f1226C) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (m806O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1265z) {
            if (this.f1260s == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f1265z.add(interfaceC0675Mm);
                m820b();
            }
        }
    }

    /* renamed from: UZ */
    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f1227E;
        if (abstractComponentCallbacksC2342s3 != null) {
            sb.append(abstractComponentCallbacksC2342s3.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1227E;
        } else {
            C0852Pu c0852Pu = this.f1260s;
            if (c0852Pu == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(c0852Pu.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1260s;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: V */
    public final void m814V(boolean z) {
        if (z && (this.f1260s instanceof InterfaceC0238EW)) {
            m845zx(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
            if (abstractComponentCallbacksC2342s3 != null) {
                abstractComponentCallbacksC2342s3.onLowMemory();
                if (z) {
                    abstractComponentCallbacksC2342s3.f7201Z.m814V(true);
                }
            }
        }
    }

    /* renamed from: W */
    public final boolean m815W() {
        boolean z;
        if (this.f1264y < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
            if (abstractComponentCallbacksC2342s3 != null) {
                if (!abstractComponentCallbacksC2342s3.f7208i) {
                    z = abstractComponentCallbacksC2342s3.f7201Z.m815W();
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: X */
    public final ViewGroup m816X(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        ViewGroup viewGroup = abstractComponentCallbacksC2342s3.f7196T;
        if (viewGroup == null) {
            if (abstractComponentCallbacksC2342s3.f7209j > 0 && this.f1241U.mo1965BX()) {
                View mo1968Ha = this.f1241U.mo1968Ha(abstractComponentCallbacksC2342s3.f7209j);
                if (mo1968Ha instanceof ViewGroup) {
                    return (ViewGroup) mo1968Ha;
                }
            }
            return null;
        }
        return viewGroup;
    }

    /* renamed from: Y */
    public final void m817Y(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        ArrayList arrayList3;
        Iterator it;
        LinkedHashSet linkedHashSet;
        Object obj;
        C2256qU c2256qU;
        Iterator it2;
        Object obj2;
        Iterator it3;
        Object obj3;
        ArrayList arrayList4;
        C0525Ju c0525Ju;
        C0525Ju c0525Ju2;
        C0525Ju c0525Ju3;
        int i3;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3;
        int i4;
        int i5;
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        boolean z = ((C0398HY) arrayList5.get(i)).f1329I;
        ArrayList arrayList7 = this.f1253i;
        if (arrayList7 == null) {
            this.f1253i = new ArrayList();
        } else {
            arrayList7.clear();
        }
        ArrayList arrayList8 = this.f1253i;
        C0525Ju c0525Ju4 = this.f1262v;
        arrayList8.addAll(c0525Ju4.m1239w());
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = this.f1250f;
        int i6 = i;
        boolean z2 = false;
        while (true) {
            int i7 = 1;
            if (i6 < i2) {
                C0398HY c0398hy = (C0398HY) arrayList5.get(i6);
                if (((Boolean) arrayList6.get(i6)).booleanValue()) {
                    c0525Ju2 = c0525Ju4;
                    int i8 = 1;
                    ArrayList arrayList9 = this.f1253i;
                    ArrayList arrayList10 = c0398hy.f1347z;
                    int size = arrayList10.size() - 1;
                    while (size >= 0) {
                        C0547KI c0547ki = (C0547KI) arrayList10.get(size);
                        int i9 = c0547ki.f1807z;
                        if (i9 != i8) {
                            if (i9 != 3) {
                                switch (i9) {
                                    case 8:
                                        abstractComponentCallbacksC2342s32 = null;
                                        break;
                                    case 9:
                                        abstractComponentCallbacksC2342s32 = c0547ki.f1803h;
                                        break;
                                    case 10:
                                        c0547ki.f1802W = c0547ki.f1804o;
                                        break;
                                }
                                size--;
                                i8 = 1;
                            }
                            arrayList9.add(c0547ki.f1803h);
                            size--;
                            i8 = 1;
                        }
                        arrayList9.remove(c0547ki.f1803h);
                        size--;
                        i8 = 1;
                    }
                } else {
                    ArrayList arrayList11 = this.f1253i;
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList12 = c0398hy.f1347z;
                        if (i10 < arrayList12.size()) {
                            C0547KI c0547ki2 = (C0547KI) arrayList12.get(i10);
                            int i11 = c0547ki2.f1807z;
                            if (i11 != i7) {
                                if (i11 != 2) {
                                    if (i11 == 3 || i11 == 6) {
                                        arrayList11.remove(c0547ki2.f1803h);
                                        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s33 = c0547ki2.f1803h;
                                        if (abstractComponentCallbacksC2342s33 == abstractComponentCallbacksC2342s32) {
                                            arrayList12.add(i10, new C0547KI(9, abstractComponentCallbacksC2342s33));
                                            i10++;
                                            c0525Ju3 = c0525Ju4;
                                            i3 = 1;
                                            abstractComponentCallbacksC2342s32 = null;
                                        }
                                    } else if (i11 == 7) {
                                        c0525Ju3 = c0525Ju4;
                                        i3 = 1;
                                    } else if (i11 == 8) {
                                        arrayList12.add(i10, new C0547KI(9, abstractComponentCallbacksC2342s32, 0));
                                        c0547ki2.f1806v = true;
                                        i10++;
                                        abstractComponentCallbacksC2342s32 = c0547ki2.f1803h;
                                    }
                                    c0525Ju3 = c0525Ju4;
                                    i3 = 1;
                                } else {
                                    abstractComponentCallbacksC2342s3 = c0547ki2.f1803h;
                                    int i12 = abstractComponentCallbacksC2342s3.f7209j;
                                    int size2 = arrayList11.size() - 1;
                                    boolean z3 = false;
                                    while (size2 >= 0) {
                                        C0525Ju c0525Ju5 = c0525Ju4;
                                        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s34 = (AbstractComponentCallbacksC2342s3) arrayList11.get(size2);
                                        if (abstractComponentCallbacksC2342s34.f7209j != i12) {
                                            i4 = i12;
                                        } else if (abstractComponentCallbacksC2342s34 == abstractComponentCallbacksC2342s3) {
                                            i4 = i12;
                                            z3 = true;
                                        } else {
                                            if (abstractComponentCallbacksC2342s34 == abstractComponentCallbacksC2342s32) {
                                                i4 = i12;
                                                i5 = 0;
                                                arrayList12.add(i10, new C0547KI(9, abstractComponentCallbacksC2342s34, 0));
                                                i10++;
                                                abstractComponentCallbacksC2342s32 = null;
                                            } else {
                                                i4 = i12;
                                                i5 = 0;
                                            }
                                            C0547KI c0547ki3 = new C0547KI(3, abstractComponentCallbacksC2342s34, i5);
                                            c0547ki3.f1800P = c0547ki2.f1800P;
                                            c0547ki3.f1801Q = c0547ki2.f1801Q;
                                            c0547ki3.f1799N = c0547ki2.f1799N;
                                            c0547ki3.f1805u = c0547ki2.f1805u;
                                            arrayList12.add(i10, c0547ki3);
                                            arrayList11.remove(abstractComponentCallbacksC2342s34);
                                            i10++;
                                            abstractComponentCallbacksC2342s32 = abstractComponentCallbacksC2342s32;
                                        }
                                        size2--;
                                        i12 = i4;
                                        c0525Ju4 = c0525Ju5;
                                    }
                                    c0525Ju3 = c0525Ju4;
                                    i3 = 1;
                                    if (z3) {
                                        arrayList12.remove(i10);
                                        i10--;
                                    } else {
                                        c0547ki2.f1807z = 1;
                                        c0547ki2.f1806v = true;
                                        arrayList11.add(abstractComponentCallbacksC2342s3);
                                    }
                                }
                                i10 += i3;
                                i7 = i3;
                                c0525Ju4 = c0525Ju3;
                            } else {
                                c0525Ju3 = c0525Ju4;
                                i3 = i7;
                            }
                            abstractComponentCallbacksC2342s3 = c0547ki2.f1803h;
                            arrayList11.add(abstractComponentCallbacksC2342s3);
                            i10 += i3;
                            i7 = i3;
                            c0525Ju4 = c0525Ju3;
                        } else {
                            c0525Ju2 = c0525Ju4;
                        }
                    }
                }
                z2 = z2 || c0398hy.f1343u;
                i6++;
                arrayList5 = arrayList;
                arrayList6 = arrayList2;
                c0525Ju4 = c0525Ju2;
            } else {
                C0525Ju c0525Ju6 = c0525Ju4;
                this.f1253i.clear();
                if (!z && this.f1264y >= 1) {
                    for (int i13 = i; i13 < i2; i13++) {
                        Iterator it4 = ((C0398HY) arrayList.get(i13)).f1347z.iterator();
                        while (it4.hasNext()) {
                            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s35 = ((C0547KI) it4.next()).f1803h;
                            if (abstractComponentCallbacksC2342s35 == null || abstractComponentCallbacksC2342s35.f7198X == null) {
                                c0525Ju = c0525Ju6;
                            } else {
                                c0525Ju = c0525Ju6;
                                c0525Ju.m1231g(m808Q(abstractComponentCallbacksC2342s35));
                            }
                            c0525Ju6 = c0525Ju;
                        }
                    }
                }
                for (int i14 = i; i14 < i2; i14++) {
                    C0398HY c0398hy2 = (C0398HY) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        c0398hy2.m896v(-1);
                        ArrayList arrayList13 = c0398hy2.f1347z;
                        for (int size3 = arrayList13.size() - 1; size3 >= 0; size3--) {
                            C0547KI c0547ki4 = (C0547KI) arrayList13.get(size3);
                            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s36 = c0547ki4.f1803h;
                            if (abstractComponentCallbacksC2342s36 != null) {
                                abstractComponentCallbacksC2342s36.f7220r = c0398hy2.f1346y;
                                if (abstractComponentCallbacksC2342s36.f7184D != null) {
                                    abstractComponentCallbacksC2342s36.m4014o().f4961z = true;
                                }
                                int i15 = c0398hy2.f1333Q;
                                int i16 = 8194;
                                int i17 = 4097;
                                if (i15 != 4097) {
                                    if (i15 != 8194) {
                                        i16 = 8197;
                                        i17 = 4100;
                                        if (i15 != 8197) {
                                            if (i15 == 4099) {
                                                i17 = 4099;
                                            } else if (i15 != 4100) {
                                                i16 = 0;
                                            }
                                        }
                                    }
                                    i16 = i17;
                                }
                                if (abstractComponentCallbacksC2342s36.f7184D != null || i16 != 0) {
                                    abstractComponentCallbacksC2342s36.m4014o();
                                    abstractComponentCallbacksC2342s36.f7184D.f4953Q = i16;
                                }
                                ArrayList arrayList14 = c0398hy2.f1345w;
                                ArrayList arrayList15 = c0398hy2.f1334R;
                                abstractComponentCallbacksC2342s36.m4014o();
                                C1614eM c1614eM = abstractComponentCallbacksC2342s36.f7184D;
                                c1614eM.f4959u = arrayList14;
                                c1614eM.f4958o = arrayList15;
                            }
                            int i18 = c0547ki4.f1807z;
                            C0364Gx c0364Gx = c0398hy2.f1342q;
                            switch (i18) {
                                case 1:
                                    abstractComponentCallbacksC2342s36.m4007T(c0547ki4.f1800P, c0547ki4.f1799N, c0547ki4.f1801Q, c0547ki4.f1805u);
                                    c0364Gx.m832nP(abstractComponentCallbacksC2342s36, true);
                                    c0364Gx.m802K(abstractComponentCallbacksC2342s36);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0547ki4.f1807z);
                                case 3:
                                    abstractComponentCallbacksC2342s36.m4007T(c0547ki4.f1800P, c0547ki4.f1799N, c0547ki4.f1801Q, c0547ki4.f1805u);
                                    c0364Gx.m844z(abstractComponentCallbacksC2342s36);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC2342s36.m4007T(c0547ki4.f1800P, c0547ki4.f1799N, c0547ki4.f1801Q, c0547ki4.f1805u);
                                    c0364Gx.getClass();
                                    m790od(abstractComponentCallbacksC2342s36);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC2342s36.m4007T(c0547ki4.f1800P, c0547ki4.f1799N, c0547ki4.f1801Q, c0547ki4.f1805u);
                                    c0364Gx.m832nP(abstractComponentCallbacksC2342s36, true);
                                    c0364Gx.m793C(abstractComponentCallbacksC2342s36);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC2342s36.m4007T(c0547ki4.f1800P, c0547ki4.f1799N, c0547ki4.f1801Q, c0547ki4.f1805u);
                                    c0364Gx.m840v(abstractComponentCallbacksC2342s36);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC2342s36.m4007T(c0547ki4.f1800P, c0547ki4.f1799N, c0547ki4.f1801Q, c0547ki4.f1805u);
                                    c0364Gx.m832nP(abstractComponentCallbacksC2342s36, true);
                                    c0364Gx.m839u(abstractComponentCallbacksC2342s36);
                                    break;
                                case 8:
                                    c0364Gx.m835qn(null);
                                    break;
                                case 9:
                                    c0364Gx.m835qn(abstractComponentCallbacksC2342s36);
                                    break;
                                case 10:
                                    c0364Gx.m818Yd(abstractComponentCallbacksC2342s36, c0547ki4.f1804o);
                                    break;
                            }
                        }
                    } else {
                        c0398hy2.m896v(1);
                        ArrayList arrayList16 = c0398hy2.f1347z;
                        int size4 = arrayList16.size();
                        int i19 = 0;
                        while (i19 < size4) {
                            C0547KI c0547ki5 = (C0547KI) arrayList16.get(i19);
                            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s37 = c0547ki5.f1803h;
                            if (abstractComponentCallbacksC2342s37 != null) {
                                abstractComponentCallbacksC2342s37.f7220r = c0398hy2.f1346y;
                                if (abstractComponentCallbacksC2342s37.f7184D != null) {
                                    abstractComponentCallbacksC2342s37.m4014o().f4961z = false;
                                }
                                int i20 = c0398hy2.f1333Q;
                                if (abstractComponentCallbacksC2342s37.f7184D != null || i20 != 0) {
                                    abstractComponentCallbacksC2342s37.m4014o();
                                    abstractComponentCallbacksC2342s37.f7184D.f4953Q = i20;
                                }
                                ArrayList arrayList17 = c0398hy2.f1334R;
                                ArrayList arrayList18 = c0398hy2.f1345w;
                                abstractComponentCallbacksC2342s37.m4014o();
                                C1614eM c1614eM2 = abstractComponentCallbacksC2342s37.f7184D;
                                c1614eM2.f4959u = arrayList17;
                                c1614eM2.f4958o = arrayList18;
                            }
                            int i21 = c0547ki5.f1807z;
                            C0364Gx c0364Gx2 = c0398hy2.f1342q;
                            switch (i21) {
                                case 1:
                                    arrayList4 = arrayList16;
                                    abstractComponentCallbacksC2342s37.m4007T(c0547ki5.f1800P, c0547ki5.f1799N, c0547ki5.f1801Q, c0547ki5.f1805u);
                                    c0364Gx2.m832nP(abstractComponentCallbacksC2342s37, false);
                                    c0364Gx2.m844z(abstractComponentCallbacksC2342s37);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0547ki5.f1807z);
                                case 3:
                                    arrayList4 = arrayList16;
                                    abstractComponentCallbacksC2342s37.m4007T(c0547ki5.f1800P, c0547ki5.f1799N, c0547ki5.f1801Q, c0547ki5.f1805u);
                                    c0364Gx2.m802K(abstractComponentCallbacksC2342s37);
                                    break;
                                case 4:
                                    arrayList4 = arrayList16;
                                    abstractComponentCallbacksC2342s37.m4007T(c0547ki5.f1800P, c0547ki5.f1799N, c0547ki5.f1801Q, c0547ki5.f1805u);
                                    c0364Gx2.m793C(abstractComponentCallbacksC2342s37);
                                    break;
                                case 5:
                                    arrayList4 = arrayList16;
                                    abstractComponentCallbacksC2342s37.m4007T(c0547ki5.f1800P, c0547ki5.f1799N, c0547ki5.f1801Q, c0547ki5.f1805u);
                                    c0364Gx2.m832nP(abstractComponentCallbacksC2342s37, false);
                                    m790od(abstractComponentCallbacksC2342s37);
                                    break;
                                case 6:
                                    arrayList4 = arrayList16;
                                    abstractComponentCallbacksC2342s37.m4007T(c0547ki5.f1800P, c0547ki5.f1799N, c0547ki5.f1801Q, c0547ki5.f1805u);
                                    c0364Gx2.m839u(abstractComponentCallbacksC2342s37);
                                    break;
                                case 7:
                                    arrayList4 = arrayList16;
                                    abstractComponentCallbacksC2342s37.m4007T(c0547ki5.f1800P, c0547ki5.f1799N, c0547ki5.f1801Q, c0547ki5.f1805u);
                                    c0364Gx2.m832nP(abstractComponentCallbacksC2342s37, false);
                                    c0364Gx2.m840v(abstractComponentCallbacksC2342s37);
                                    break;
                                case 8:
                                    c0364Gx2.m835qn(abstractComponentCallbacksC2342s37);
                                    arrayList4 = arrayList16;
                                    break;
                                case 9:
                                    c0364Gx2.m835qn(null);
                                    arrayList4 = arrayList16;
                                    break;
                                case 10:
                                    c0364Gx2.m818Yd(abstractComponentCallbacksC2342s37, c0547ki5.f1802W);
                                    arrayList4 = arrayList16;
                                    break;
                            }
                            i19++;
                            arrayList16 = arrayList4;
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                if (z2 && (arrayList3 = this.f1242V) != null && !arrayList3.isEmpty()) {
                    LinkedHashSet<AbstractComponentCallbacksC2342s3> linkedHashSet2 = new LinkedHashSet();
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        C0398HY c0398hy3 = (C0398HY) it5.next();
                        HashSet hashSet = new HashSet();
                        for (int i22 = 0; i22 < c0398hy3.f1347z.size(); i22++) {
                            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s38 = ((C0547KI) c0398hy3.f1347z.get(i22)).f1803h;
                            if (abstractComponentCallbacksC2342s38 != null && c0398hy3.f1343u) {
                                hashSet.add(abstractComponentCallbacksC2342s38);
                            }
                        }
                        linkedHashSet2.addAll(hashSet);
                    }
                    Iterator it6 = this.f1242V.iterator();
                    while (it6.hasNext()) {
                        C2256qU c2256qU2 = (C2256qU) it6.next();
                        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s39 : linkedHashSet2) {
                            if (booleanValue) {
                                C0904R3 c0904r3 = c2256qU2.f6946z;
                                List list = (List) c0904r3.f3091N.getValue();
                                ListIterator listIterator = list.listIterator(list.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        obj3 = listIterator.previous();
                                        ListIterator listIterator2 = listIterator;
                                        it3 = it6;
                                        if (!AbstractC1292YB.m2695u(((C1553dE) obj3).f4794k, abstractComponentCallbacksC2342s39.f7192L)) {
                                            listIterator = listIterator2;
                                            it6 = it3;
                                        }
                                    } else {
                                        it3 = it6;
                                        obj3 = null;
                                    }
                                }
                                C1553dE c1553dE = (C1553dE) obj3;
                                if (m791p(2)) {
                                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + abstractComponentCallbacksC2342s39 + " associated with entry " + c1553dE);
                                }
                                if (c1553dE != null) {
                                    C1277Xw c1277Xw = c0904r3.f3097v;
                                    c1277Xw.m2607u(AbstractC1658fB.m3130Ha((Set) c1277Xw.getValue(), c1553dE));
                                    if (!c0904r3.f3095o.f7661u.contains(c1553dE)) {
                                        throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                                    }
                                    c1553dE.m3022P(EnumC1632eh.f5087I);
                                } else {
                                    continue;
                                }
                            } else {
                                it3 = it6;
                                c2256qU2.getClass();
                            }
                            it6 = it3;
                        }
                    }
                    Iterator it7 = this.f1242V.iterator();
                    while (it7.hasNext()) {
                        C2256qU c2256qU3 = (C2256qU) it7.next();
                        Iterator it8 = linkedHashSet2.iterator();
                        while (it8.hasNext()) {
                            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s310 = (AbstractComponentCallbacksC2342s3) it8.next();
                            C0904R3 c0904r32 = c2256qU3.f6946z;
                            ArrayList m4280M6 = AbstractC2486us.m4280M6((Iterable) c0904r32.f3093Q.getValue(), (Collection) c0904r32.f3091N.getValue());
                            ListIterator listIterator3 = m4280M6.listIterator(m4280M6.size());
                            while (true) {
                                if (listIterator3.hasPrevious()) {
                                    obj = listIterator3.previous();
                                    it = it7;
                                    linkedHashSet = linkedHashSet2;
                                    if (!AbstractC1292YB.m2695u(((C1553dE) obj).f4794k, abstractComponentCallbacksC2342s310.f7192L)) {
                                        it7 = it;
                                        linkedHashSet2 = linkedHashSet;
                                    }
                                } else {
                                    it = it7;
                                    linkedHashSet = linkedHashSet2;
                                    obj = null;
                                }
                            }
                            C1553dE c1553dE2 = (C1553dE) obj;
                            C2129oA c2129oA = c2256qU3.f6945h;
                            boolean z4 = booleanValue && c2129oA.f6561u.isEmpty() && abstractComponentCallbacksC2342s310.f7206f;
                            Iterator it9 = c2129oA.f6561u.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    obj2 = it9.next();
                                    c2256qU = c2256qU3;
                                    it2 = it8;
                                    if (!AbstractC1292YB.m2695u(((C0084Bc) obj2).f329S, abstractComponentCallbacksC2342s310.f7192L)) {
                                        c2256qU3 = c2256qU;
                                        it8 = it2;
                                    }
                                } else {
                                    c2256qU = c2256qU3;
                                    it2 = it8;
                                    obj2 = null;
                                }
                            }
                            C0084Bc c0084Bc = (C0084Bc) obj2;
                            if (c0084Bc != null) {
                                c2129oA.f6561u.remove(c0084Bc);
                            }
                            if (!z4 && m791p(2)) {
                                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + abstractComponentCallbacksC2342s310 + " associated with entry " + c1553dE2);
                            }
                            boolean z5 = c0084Bc != null && ((Boolean) c0084Bc.f328R).booleanValue();
                            if (!booleanValue && !z5 && c1553dE2 == null) {
                                throw new IllegalArgumentException(("The fragment " + abstractComponentCallbacksC2342s310 + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
                            }
                            if (c1553dE2 != null) {
                                C2129oA.m3747V(abstractComponentCallbacksC2342s310, c1553dE2, c0904r32);
                                if (z4) {
                                    if (m791p(2)) {
                                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + abstractComponentCallbacksC2342s310 + " popping associated entry " + c1553dE2 + " via system back");
                                    }
                                    c0904r32.m2056Q(c1553dE2, false);
                                    it7 = it;
                                    linkedHashSet2 = linkedHashSet;
                                    c2256qU3 = c2256qU;
                                    it8 = it2;
                                }
                            }
                            it7 = it;
                            linkedHashSet2 = linkedHashSet;
                            c2256qU3 = c2256qU;
                            it8 = it2;
                        }
                    }
                }
                for (int i23 = i; i23 < i2; i23++) {
                    C0398HY c0398hy4 = (C0398HY) arrayList.get(i23);
                    if (booleanValue) {
                        for (int size5 = c0398hy4.f1347z.size() - 1; size5 >= 0; size5--) {
                            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s311 = ((C0547KI) c0398hy4.f1347z.get(size5)).f1803h;
                            if (abstractComponentCallbacksC2342s311 != null) {
                                m808Q(abstractComponentCallbacksC2342s311).m4825M();
                            }
                        }
                    } else {
                        Iterator it10 = c0398hy4.f1347z.iterator();
                        while (it10.hasNext()) {
                            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s312 = ((C0547KI) it10.next()).f1803h;
                            if (abstractComponentCallbacksC2342s312 != null) {
                                m808Q(abstractComponentCallbacksC2342s312).m4825M();
                            }
                        }
                    }
                }
                m829n(this.f1264y, true);
                HashSet hashSet2 = new HashSet();
                for (int i24 = i; i24 < i2; i24++) {
                    Iterator it11 = ((C0398HY) arrayList.get(i24)).f1347z.iterator();
                    while (it11.hasNext()) {
                        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s313 = ((C0547KI) it11.next()).f1803h;
                        if (abstractComponentCallbacksC2342s313 != null && (viewGroup = abstractComponentCallbacksC2342s313.f7196T) != null) {
                            hashSet2.add(C0135Cc.m266o(viewGroup, this));
                        }
                    }
                }
                Iterator it12 = hashSet2.iterator();
                while (it12.hasNext()) {
                    C0135Cc c0135Cc = (C0135Cc) it12.next();
                    c0135Cc.f456P = booleanValue;
                    c0135Cc.m271W();
                    c0135Cc.m269P();
                }
                for (int i25 = i; i25 < i2; i25++) {
                    C0398HY c0398hy5 = (C0398HY) arrayList.get(i25);
                    if (((Boolean) arrayList2.get(i25)).booleanValue() && c0398hy5.f1338g >= 0) {
                        c0398hy5.f1338g = -1;
                    }
                    c0398hy5.getClass();
                }
                if (!z2 || this.f1242V == null) {
                    return;
                }
                for (int i26 = 0; i26 < this.f1242V.size(); i26++) {
                    ((C2256qU) this.f1242V.get(i26)).getClass();
                }
                return;
            }
        }
    }

    /* renamed from: Yd */
    public final void m818Yd(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3, EnumC1632eh enumC1632eh) {
        if (abstractComponentCallbacksC2342s3.equals(m801J(abstractComponentCallbacksC2342s3.f7218q)) && (abstractComponentCallbacksC2342s3.f7186F == null || abstractComponentCallbacksC2342s3.f7198X == this)) {
            abstractComponentCallbacksC2342s3.f7215nP = enumC1632eh;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2342s3 + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: Z */
    public final C2052mg m819Z() {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f1227E;
        if (abstractComponentCallbacksC2342s3 != null) {
            return abstractComponentCallbacksC2342s3.f7198X.m819Z();
        }
        return this.f1245Y;
    }

    /* renamed from: b */
    public final void m820b() {
        synchronized (this.f1265z) {
            boolean z = true;
            if (this.f1265z.size() != 1) {
                z = false;
            }
            if (z) {
                this.f1260s.f2880I.removeCallbacks(this.f1236O);
                this.f1260s.f2880I.post(this.f1236O);
                m830n0();
            }
        }
    }

    /* renamed from: c */
    public final int m821c(int i, String str, boolean z) {
        ArrayList arrayList = this.f1237P;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return (-1) + this.f1237P.size();
        }
        int size = this.f1237P.size() - 1;
        while (size >= 0) {
            C0398HY c0398hy = (C0398HY) this.f1237P.get(size);
            if ((str != null && str.equals(c0398hy.f1337W)) || (i >= 0 && i == c0398hy.f1338g)) {
                break;
            }
            size--;
        }
        if (size >= 0) {
            if (z) {
                while (size > 0) {
                    int i2 = size - 1;
                    C0398HY c0398hy2 = (C0398HY) this.f1237P.get(i2);
                    if ((str == null || !str.equals(c0398hy2.f1337W)) && (i < 0 || i != c0398hy2.f1338g)) {
                        break;
                    }
                    size = i2;
                }
            } else {
                if (size == this.f1237P.size() - 1) {
                    return -1;
                }
                size++;
            }
        }
        return size;
    }

    /* renamed from: e */
    public final AbstractComponentCallbacksC2342s3 m822e(String str) {
        C0525Ju c0525Ju = this.f1262v;
        if (str != null) {
            int size = ((ArrayList) c0525Ju.f1764P).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = (AbstractComponentCallbacksC2342s3) ((ArrayList) c0525Ju.f1764P).get(size);
                if (abstractComponentCallbacksC2342s3 != null && str.equals(abstractComponentCallbacksC2342s3.f7192L)) {
                    return abstractComponentCallbacksC2342s3;
                }
            }
        }
        if (str != null) {
            for (C2762z c2762z : ((HashMap) c0525Ju.f1765h).values()) {
                if (c2762z != null) {
                    AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = c2762z.f8996v;
                    if (str.equals(abstractComponentCallbacksC2342s32.f7192L)) {
                        return abstractComponentCallbacksC2342s32;
                    }
                }
            }
        } else {
            c0525Ju.getClass();
        }
        return null;
    }

    /* renamed from: f */
    public final boolean m823f(boolean z) {
        boolean z2;
        m795E(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f1254j;
            ArrayList arrayList2 = this.f1233L;
            synchronized (this.f1265z) {
                if (this.f1265z.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f1265z.size();
                        z2 = false;
                        for (int i = 0; i < size; i++) {
                            z2 |= ((InterfaceC0675Mm) this.f1265z.get(i)).mo303z(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.f1252h = true;
            try {
                m794D(this.f1254j, this.f1233L);
            } finally {
                m807P();
            }
        }
        m830n0();
        if (this.f1257p) {
            this.f1257p = false;
            m831nF();
        }
        this.f1262v.m1237u();
        return z3;
    }

    /* renamed from: g */
    public final boolean m824g() {
        boolean z;
        if (this.f1264y < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
            if (abstractComponentCallbacksC2342s3 != null && m788i(abstractComponentCallbacksC2342s3)) {
                if (!abstractComponentCallbacksC2342s3.f7208i) {
                    z = abstractComponentCallbacksC2342s3.f7201Z.m824g() | false;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: h */
    public final void m825h(C0852Pu c0852Pu, AbstractC2703z2 abstractC2703z2, AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        C0916RF c0916rf;
        String str;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32;
        if (this.f1260s == null) {
            this.f1260s = c0852Pu;
            this.f1241U = abstractC2703z2;
            this.f1227E = abstractComponentCallbacksC2342s3;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f1239R;
            if (abstractComponentCallbacksC2342s3 != null) {
                copyOnWriteArrayList.add(new C0654MM(abstractComponentCallbacksC2342s3));
            } else if (c0852Pu instanceof InterfaceC0115CE) {
                copyOnWriteArrayList.add(c0852Pu);
            }
            if (this.f1227E != null) {
                m830n0();
            }
            if (c0852Pu instanceof InterfaceC2112no) {
                C2752h m1966EQ = c0852Pu.m1966EQ();
                this.f1261u = m1966EQ;
                if (abstractComponentCallbacksC2342s3 != null) {
                    abstractComponentCallbacksC2342s32 = abstractComponentCallbacksC2342s3;
                } else {
                    abstractComponentCallbacksC2342s32 = c0852Pu;
                }
                m1966EQ.m4685z(abstractComponentCallbacksC2342s32, this.f1256o);
            }
            int i = 0;
            if (abstractComponentCallbacksC2342s3 != null) {
                C0916RF c0916rf2 = abstractComponentCallbacksC2342s3.f7198X.f1248d;
                HashMap hashMap = c0916rf2.f3148q;
                C0916RF c0916rf3 = (C0916RF) hashMap.get(abstractComponentCallbacksC2342s3.f7218q);
                if (c0916rf3 == null) {
                    c0916rf3 = new C0916RF(c0916rf2.f3146g);
                    hashMap.put(abstractComponentCallbacksC2342s3.f7218q, c0916rf3);
                }
                this.f1248d = c0916rf3;
            } else {
                if (c0852Pu instanceof InterfaceC0670Mg) {
                    c0916rf = (C0916RF) new C1174Vy(c0852Pu.mo1569G(), C0916RF.f3144U).m2397S(C0916RF.class);
                } else {
                    c0916rf = new C0916RF(false);
                }
                this.f1248d = c0916rf;
            }
            this.f1248d.f3149s = m806O();
            this.f1262v.f1763N = this.f1248d;
            C0852Pu c0852Pu2 = this.f1260s;
            int i2 = 2;
            if ((c0852Pu2 instanceof InterfaceC0277FG) && abstractComponentCallbacksC2342s3 == null) {
                C1934kN mo576h = c0852Pu2.mo576h();
                mo576h.m3554v("android:support:fragments", new C1635ek(i2, this));
                Bundle m3555z = mo576h.m3555z("android:support:fragments");
                if (m3555z != null) {
                    m828m(m3555z);
                }
            }
            C0852Pu c0852Pu3 = this.f1260s;
            if (c0852Pu3 instanceof InterfaceC1303YO) {
                C0966S8 c0966s8 = c0852Pu3.f2882k.f8652E;
                if (abstractComponentCallbacksC2342s3 != null) {
                    str = AbstractC2441tz.m4187M(new StringBuilder(), abstractComponentCallbacksC2342s3.f7218q, ":");
                } else {
                    str = "";
                }
                String m4200k = AbstractC2441tz.m4200k("FragmentManager:", str);
                this.f1232J = c0966s8.m4689v(AbstractC2441tz.m4195W(m4200k, "StartActivityForResult"), new C1502cJ(), new C2052mg(i2, this));
                this.f1247c = c0966s8.m4689v(AbstractC2441tz.m4195W(m4200k, "StartIntentSenderForResult"), new C0693N6(i2), new C2052mg(3, this));
                this.f1230H = c0966s8.m4689v(AbstractC2441tz.m4195W(m4200k, "RequestPermissions"), new C2385st(), new C2052mg(i, this));
            }
            C0852Pu c0852Pu4 = this.f1260s;
            if (c0852Pu4 instanceof InterfaceC0568Kf) {
                c0852Pu4.m1975nB(this.f1263w);
            }
            C0852Pu c0852Pu5 = this.f1260s;
            if (c0852Pu5 instanceof InterfaceC0238EW) {
                c0852Pu5.m1976tJ(this.f1231I);
            }
            C0852Pu c0852Pu6 = this.f1260s;
            if (c0852Pu6 instanceof InterfaceC0381HG) {
                c0852Pu6.m1974d3(this.f1258q);
            }
            C0852Pu c0852Pu7 = this.f1260s;
            if (c0852Pu7 instanceof InterfaceC1609eH) {
                c0852Pu7.m1977yF(this.f1255k);
            }
            C0852Pu c0852Pu8 = this.f1260s;
            if ((c0852Pu8 instanceof InterfaceC2335rw) && abstractComponentCallbacksC2342s3 == null) {
                c0852Pu8.m1970O4(this.f1251g);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: k */
    public final void m826k(boolean z, boolean z2) {
        if (z2 && (this.f1260s instanceof InterfaceC1609eH)) {
            m845zx(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
            if (abstractComponentCallbacksC2342s3 != null && z2) {
                abstractComponentCallbacksC2342s3.f7201Z.m826k(z, true);
            }
        }
    }

    /* renamed from: l */
    public final Bundle m827l() {
        int i;
        C0682Mu[] c0682MuArr;
        ArrayList arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m805N().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0135Cc c0135Cc = (C0135Cc) it.next();
            if (c0135Cc.f455N) {
                if (m791p(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0135Cc.f455N = false;
                c0135Cc.m269P();
            }
        }
        Iterator it2 = m805N().iterator();
        while (it2.hasNext()) {
            ((C0135Cc) it2.next()).m273u();
        }
        m823f(true);
        this.f1228F = true;
        this.f1248d.f3149s = true;
        C0525Ju c0525Ju = this.f1262v;
        c0525Ju.getClass();
        ArrayList arrayList2 = new ArrayList(((HashMap) c0525Ju.f1765h).size());
        for (C2762z c2762z : ((HashMap) c0525Ju.f1765h).values()) {
            if (c2762z != null) {
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z.f8996v;
                c0525Ju.m1236s(abstractComponentCallbacksC2342s3.f7218q, c2762z.m4839w());
                arrayList2.add(abstractComponentCallbacksC2342s3.f7218q);
                if (m791p(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC2342s3 + ": " + abstractComponentCallbacksC2342s3.f7194R);
                }
            }
        }
        HashMap hashMap = (HashMap) this.f1262v.f1766v;
        if (hashMap.isEmpty()) {
            if (m791p(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            C0525Ju c0525Ju2 = this.f1262v;
            synchronized (((ArrayList) c0525Ju2.f1764P)) {
                c0682MuArr = null;
                if (((ArrayList) c0525Ju2.f1764P).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) c0525Ju2.f1764P).size());
                    Iterator it3 = ((ArrayList) c0525Ju2.f1764P).iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = (AbstractComponentCallbacksC2342s3) it3.next();
                        arrayList.add(abstractComponentCallbacksC2342s32.f7218q);
                        if (m791p(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC2342s32.f7218q + "): " + abstractComponentCallbacksC2342s32);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.f1237P;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                c0682MuArr = new C0682Mu[size];
                for (i = 0; i < size; i++) {
                    c0682MuArr[i] = new C0682Mu((C0398HY) this.f1237P.get(i));
                    if (m791p(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f1237P.get(i));
                    }
                }
            }
            C0354Gn c0354Gn = new C0354Gn();
            c0354Gn.f1193S = arrayList2;
            c0354Gn.f1192R = arrayList;
            c0354Gn.f1197w = c0682MuArr;
            c0354Gn.f1191I = this.f1243W.get();
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s33 = this.f1250f;
            if (abstractComponentCallbacksC2342s33 != null) {
                c0354Gn.f1196q = abstractComponentCallbacksC2342s33.f7218q;
            }
            c0354Gn.f1195k.addAll(this.f1229G.keySet());
            c0354Gn.f1194g.addAll(this.f1229G.values());
            c0354Gn.f1198y = new ArrayList(this.f1249e);
            bundle.putParcelable("state", c0354Gn);
            for (String str : this.f1234M.keySet()) {
                bundle.putBundle(AbstractC2441tz.m4200k("result_", str), (Bundle) this.f1234M.get(str));
            }
            for (String str2 : hashMap.keySet()) {
                bundle.putBundle(AbstractC2441tz.m4200k("fragment_", str2), (Bundle) hashMap.get(str2));
            }
        }
        return bundle;
    }

    /* renamed from: m */
    public final void m828m(Bundle bundle) {
        C0425I3 c0425i3;
        int i;
        C2762z c2762z;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f1260s.f2884w.getClassLoader());
                this.f1234M.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f1260s.f2884w.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        C0525Ju c0525Ju = this.f1262v;
        ((HashMap) c0525Ju.f1766v).clear();
        ((HashMap) c0525Ju.f1766v).putAll(hashMap);
        C0354Gn c0354Gn = (C0354Gn) bundle.getParcelable("state");
        if (c0354Gn != null) {
            ((HashMap) c0525Ju.f1765h).clear();
            Iterator it = c0354Gn.f1193S.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c0425i3 = this.f1240S;
                if (!hasNext) {
                    break;
                }
                Bundle m1236s = c0525Ju.m1236s((String) it.next(), null);
                if (m1236s != null) {
                    AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = (AbstractComponentCallbacksC2342s3) this.f1248d.f3145I.get(((C1017T4) m1236s.getParcelable("state")).f3399R);
                    if (abstractComponentCallbacksC2342s3 != null) {
                        if (m791p(2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC2342s3);
                        }
                        c2762z = new C2762z(c0425i3, c0525Ju, abstractComponentCallbacksC2342s3, m1236s);
                    } else {
                        c2762z = new C2762z(this.f1240S, this.f1262v, this.f1260s.f2884w.getClassLoader(), m796F(), m1236s);
                    }
                    AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = c2762z.f8996v;
                    abstractComponentCallbacksC2342s32.f7194R = m1236s;
                    abstractComponentCallbacksC2342s32.f7198X = this;
                    if (m791p(2)) {
                        Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC2342s32.f7218q + "): " + abstractComponentCallbacksC2342s32);
                    }
                    c2762z.m4830S(this.f1260s.f2884w.getClassLoader());
                    c0525Ju.m1231g(c2762z);
                    c2762z.f8993N = this.f1264y;
                }
            }
            C0916RF c0916rf = this.f1248d;
            c0916rf.getClass();
            Iterator it2 = new ArrayList(c0916rf.f3145I.values()).iterator();
            while (true) {
                i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s33 = (AbstractComponentCallbacksC2342s3) it2.next();
                if (((HashMap) c0525Ju.f1765h).get(abstractComponentCallbacksC2342s33.f7218q) != null) {
                    i = 1;
                }
                if (i == 0) {
                    if (m791p(2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC2342s33 + " that was not found in the set of active Fragments " + c0354Gn.f1193S);
                    }
                    this.f1248d.m2070M(abstractComponentCallbacksC2342s33);
                    abstractComponentCallbacksC2342s33.f7198X = this;
                    C2762z c2762z2 = new C2762z(c0425i3, c0525Ju, abstractComponentCallbacksC2342s33);
                    c2762z2.f8993N = 1;
                    c2762z2.m4825M();
                    abstractComponentCallbacksC2342s33.f7206f = true;
                    c2762z2.m4825M();
                }
            }
            ArrayList<String> arrayList = c0354Gn.f1192R;
            ((ArrayList) c0525Ju.f1764P).clear();
            if (arrayList != null) {
                for (String str3 : arrayList) {
                    AbstractComponentCallbacksC2342s3 m1230W = c0525Ju.m1230W(str3);
                    if (m1230W != null) {
                        if (m791p(2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + m1230W);
                        }
                        c0525Ju.m1224N(m1230W);
                    } else {
                        throw new IllegalStateException(AbstractC2441tz.m4184G("No instantiated fragment for (", str3, ")"));
                    }
                }
            }
            if (c0354Gn.f1197w != null) {
                this.f1237P = new ArrayList(c0354Gn.f1197w.length);
                int i2 = 0;
                while (true) {
                    C0682Mu[] c0682MuArr = c0354Gn.f1197w;
                    if (i2 >= c0682MuArr.length) {
                        break;
                    }
                    C0682Mu c0682Mu = c0682MuArr[i2];
                    c0682Mu.getClass();
                    C0398HY c0398hy = new C0398HY(this);
                    c0682Mu.m1581h(c0398hy);
                    c0398hy.f1338g = c0682Mu.f2252g;
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList2 = c0682Mu.f2247R;
                        if (i3 >= arrayList2.size()) {
                            break;
                        }
                        String str4 = (String) arrayList2.get(i3);
                        if (str4 != null) {
                            ((C0547KI) c0398hy.f1347z.get(i3)).f1803h = m801J(str4);
                        }
                        i3++;
                    }
                    c0398hy.m896v(1);
                    if (m791p(2)) {
                        Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + c0398hy.f1338g + "): " + c0398hy);
                        PrintWriter printWriter = new PrintWriter(new C0989SZ());
                        c0398hy.m893Q("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f1237P.add(c0398hy);
                    i2++;
                }
            } else {
                this.f1237P = null;
            }
            this.f1243W.set(c0354Gn.f1191I);
            String str5 = c0354Gn.f1196q;
            if (str5 != null) {
                AbstractComponentCallbacksC2342s3 m801J = m801J(str5);
                this.f1250f = m801J;
                m834q(m801J);
            }
            ArrayList arrayList3 = c0354Gn.f1195k;
            if (arrayList3 != null) {
                while (i < arrayList3.size()) {
                    this.f1229G.put((String) arrayList3.get(i), (C0885Qd) c0354Gn.f1194g.get(i));
                    i++;
                }
            }
            this.f1249e = new ArrayDeque(c0354Gn.f1198y);
        }
    }

    /* renamed from: n */
    public final void m829n(int i, boolean z) {
        C0852Pu c0852Pu;
        if (this.f1260s == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f1264y) {
            this.f1264y = i;
            C0525Ju c0525Ju = this.f1262v;
            Iterator it = ((ArrayList) c0525Ju.f1764P).iterator();
            while (it.hasNext()) {
                C2762z c2762z = (C2762z) ((HashMap) c0525Ju.f1765h).get(((AbstractComponentCallbacksC2342s3) it.next()).f7218q);
                if (c2762z != null) {
                    c2762z.m4825M();
                }
            }
            Iterator it2 = ((HashMap) c0525Ju.f1765h).values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                C2762z c2762z2 = (C2762z) it2.next();
                if (c2762z2 != null) {
                    c2762z2.m4825M();
                    AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z2.f8996v;
                    if (abstractComponentCallbacksC2342s3.f7206f && !abstractComponentCallbacksC2342s3.m4016s()) {
                        z2 = true;
                    }
                    if (z2) {
                        if (abstractComponentCallbacksC2342s3.f7220r && !((HashMap) c0525Ju.f1766v).containsKey(abstractComponentCallbacksC2342s3.f7218q)) {
                            c0525Ju.m1236s(abstractComponentCallbacksC2342s3.f7218q, c2762z2.m4839w());
                        }
                        c0525Ju.m1240y(c2762z2);
                    }
                }
            }
            m831nF();
            if (this.f1244X && (c0852Pu = this.f1260s) != null && this.f1264y == 7) {
                c0852Pu.f2882k.invalidateOptionsMenu();
                this.f1244X = false;
            }
        }
    }

    /* renamed from: n0 */
    public final void m830n0() {
        int i;
        synchronized (this.f1265z) {
            boolean z = true;
            if (!this.f1265z.isEmpty()) {
                this.f1256o.m778z(true);
                return;
            }
            C1385Zw c1385Zw = this.f1256o;
            ArrayList arrayList = this.f1237P;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (i <= 0 || !m787d(this.f1227E)) {
                z = false;
            }
            c1385Zw.m778z(z);
        }
    }

    /* renamed from: nF */
    public final void m831nF() {
        Iterator it = this.f1262v.m1229V().iterator();
        while (it.hasNext()) {
            C2762z c2762z = (C2762z) it.next();
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z.f8996v;
            if (abstractComponentCallbacksC2342s3.f7182B) {
                if (this.f1252h) {
                    this.f1257p = true;
                } else {
                    abstractComponentCallbacksC2342s3.f7182B = false;
                    c2762z.m4825M();
                }
            }
        }
    }

    /* renamed from: nP */
    public final void m832nP(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3, boolean z) {
        ViewGroup m816X = m816X(abstractComponentCallbacksC2342s3);
        if (m816X != null && (m816X instanceof FragmentContainerView)) {
            ((FragmentContainerView) m816X).f8989I = !z;
        }
    }

    /* renamed from: o */
    public final void m833o(boolean z, Configuration configuration) {
        if (z && (this.f1260s instanceof InterfaceC0568Kf)) {
            m845zx(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
            if (abstractComponentCallbacksC2342s3 != null) {
                abstractComponentCallbacksC2342s3.onConfigurationChanged(configuration);
                if (z) {
                    abstractComponentCallbacksC2342s3.f7201Z.m833o(true, configuration);
                }
            }
        }
    }

    /* renamed from: q */
    public final void m834q(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (abstractComponentCallbacksC2342s3 != null && abstractComponentCallbacksC2342s3.equals(m801J(abstractComponentCallbacksC2342s3.f7218q))) {
            abstractComponentCallbacksC2342s3.f7198X.getClass();
            boolean m787d = m787d(abstractComponentCallbacksC2342s3);
            Boolean bool = abstractComponentCallbacksC2342s3.f7197U;
            if (bool == null || bool.booleanValue() != m787d) {
                abstractComponentCallbacksC2342s3.f7197U = Boolean.valueOf(m787d);
                C0364Gx c0364Gx = abstractComponentCallbacksC2342s3.f7201Z;
                c0364Gx.m830n0();
                c0364Gx.m834q(c0364Gx.f1250f);
            }
        }
    }

    /* renamed from: qn */
    public final void m835qn(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (abstractComponentCallbacksC2342s3 != null && (!abstractComponentCallbacksC2342s3.equals(m801J(abstractComponentCallbacksC2342s3.f7218q)) || (abstractComponentCallbacksC2342s3.f7186F != null && abstractComponentCallbacksC2342s3.f7198X != this))) {
            throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2342s3 + " is not an active fragment of FragmentManager " + this);
        }
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = this.f1250f;
        this.f1250f = abstractComponentCallbacksC2342s3;
        m834q(abstractComponentCallbacksC2342s32);
        m834q(this.f1250f);
    }

    /* renamed from: r */
    public final void m836r(InterfaceC0675Mm interfaceC0675Mm, boolean z) {
        if (!z || (this.f1260s != null && !this.f1226C)) {
            m795E(z);
            if (interfaceC0675Mm.mo303z(this.f1254j, this.f1233L)) {
                this.f1252h = true;
                try {
                    m794D(this.f1254j, this.f1233L);
                } finally {
                    m807P();
                }
            }
            m830n0();
            if (this.f1257p) {
                this.f1257p = false;
                m831nF();
            }
            this.f1262v.m1237u();
        }
    }

    /* renamed from: s */
    public final void m837s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String m4195W = AbstractC2441tz.m4195W(str, "    ");
        C0525Ju c0525Ju = this.f1262v;
        c0525Ju.getClass();
        String str3 = str + "    ";
        if (!((HashMap) c0525Ju.f1765h).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C2762z c2762z : ((HashMap) c0525Ju.f1765h).values()) {
                printWriter.print(str);
                if (c2762z != null) {
                    AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z.f8996v;
                    printWriter.println(abstractComponentCallbacksC2342s3);
                    abstractComponentCallbacksC2342s3.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC2342s3.f7217p));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC2342s3.f7209j));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC2342s3.f7192L);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC2342s3.f7195S);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC2342s3.f7218q);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC2342s3.f7205e);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC2342s3.f7185E);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC2342s3.f7206f);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC2342s3.f7199Y);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC2342s3.f7190J);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC2342s3.f7208i);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC2342s3.f7204d);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC2342s3.f7213n);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC2342s3.f7193O);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC2342s3.f7191K);
                    if (abstractComponentCallbacksC2342s3.f7198X != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7198X);
                    }
                    if (abstractComponentCallbacksC2342s3.f7186F != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7186F);
                    }
                    if (abstractComponentCallbacksC2342s3.f7183C != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7183C);
                    }
                    if (abstractComponentCallbacksC2342s3.f7210k != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7210k);
                    }
                    if (abstractComponentCallbacksC2342s3.f7194R != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7194R);
                    }
                    if (abstractComponentCallbacksC2342s3.f7223w != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7223w);
                    }
                    if (abstractComponentCallbacksC2342s3.f7189I != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7189I);
                    }
                    Object obj = abstractComponentCallbacksC2342s3.f7207g;
                    if (obj == null) {
                        C0364Gx c0364Gx = abstractComponentCallbacksC2342s3.f7198X;
                        obj = (c0364Gx == null || (str2 = abstractComponentCallbacksC2342s3.f7225y) == null) ? null : c0364Gx.m801J(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7221s);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C1614eM c1614eM = abstractComponentCallbacksC2342s3.f7184D;
                    printWriter.println(c1614eM == null ? false : c1614eM.f4961z);
                    C1614eM c1614eM2 = abstractComponentCallbacksC2342s3.f7184D;
                    if ((c1614eM2 == null ? 0 : c1614eM2.f4957h) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C1614eM c1614eM3 = abstractComponentCallbacksC2342s3.f7184D;
                        printWriter.println(c1614eM3 == null ? 0 : c1614eM3.f4957h);
                    }
                    C1614eM c1614eM4 = abstractComponentCallbacksC2342s3.f7184D;
                    if ((c1614eM4 == null ? 0 : c1614eM4.f4960v) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C1614eM c1614eM5 = abstractComponentCallbacksC2342s3.f7184D;
                        printWriter.println(c1614eM5 == null ? 0 : c1614eM5.f4960v);
                    }
                    C1614eM c1614eM6 = abstractComponentCallbacksC2342s3.f7184D;
                    if ((c1614eM6 == null ? 0 : c1614eM6.f4952P) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C1614eM c1614eM7 = abstractComponentCallbacksC2342s3.f7184D;
                        printWriter.println(c1614eM7 == null ? 0 : c1614eM7.f4952P);
                    }
                    C1614eM c1614eM8 = abstractComponentCallbacksC2342s3.f7184D;
                    if ((c1614eM8 == null ? 0 : c1614eM8.f4951N) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C1614eM c1614eM9 = abstractComponentCallbacksC2342s3.f7184D;
                        printWriter.println(c1614eM9 == null ? 0 : c1614eM9.f4951N);
                    }
                    if (abstractComponentCallbacksC2342s3.f7196T != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7196T);
                    }
                    if (abstractComponentCallbacksC2342s3.f7222t != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC2342s3.f7222t);
                    }
                    if (abstractComponentCallbacksC2342s3.m4003M() != null) {
                        C2616xE c2616xE = ((C2422td) new C1174Vy(abstractComponentCallbacksC2342s3.mo1569G(), C2422td.f7417q).m2397S(C2422td.class)).f7418I;
                        if (c2616xE.m4506o() > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (c2616xE.m4506o() > 0) {
                                AbstractC2441tz.m4202q(c2616xE.m4505W(0));
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(c2616xE.m4504Q(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC2342s3.f7201Z + ":");
                    abstractComponentCallbacksC2342s3.f7201Z.m837s(AbstractC2441tz.m4195W(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) c0525Ju.f1764P).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = (AbstractComponentCallbacksC2342s3) ((ArrayList) c0525Ju.f1764P).get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2342s32.toString());
            }
        }
        ArrayList arrayList = this.f1235N;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s33 = (AbstractComponentCallbacksC2342s3) this.f1235N.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2342s33.toString());
            }
        }
        ArrayList arrayList2 = this.f1237P;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0398HY c0398hy = (C0398HY) this.f1237P.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0398hy.toString());
                c0398hy.m893Q(m4195W, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1243W.get());
        synchronized (this.f1265z) {
            int size4 = this.f1265z.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj2 = (InterfaceC0675Mm) this.f1265z.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj2);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1260s);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1241U);
        if (this.f1227E != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1227E);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1264y);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1228F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1246Z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1226C);
        if (this.f1244X) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1244X);
        }
    }

    /* renamed from: t */
    public final boolean m838t() {
        return m811T(-1, 0);
    }

    /* renamed from: u */
    public final void m839u(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (m791p(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC2342s3);
        }
        if (!abstractComponentCallbacksC2342s3.f7204d) {
            abstractComponentCallbacksC2342s3.f7204d = true;
            if (abstractComponentCallbacksC2342s3.f7185E) {
                if (m791p(2)) {
                    Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC2342s3);
                }
                C0525Ju c0525Ju = this.f1262v;
                synchronized (((ArrayList) c0525Ju.f1764P)) {
                    ((ArrayList) c0525Ju.f1764P).remove(abstractComponentCallbacksC2342s3);
                }
                abstractComponentCallbacksC2342s3.f7185E = false;
                if (m789j(abstractComponentCallbacksC2342s3)) {
                    this.f1244X = true;
                }
                m799HL(abstractComponentCallbacksC2342s3);
            }
        }
    }

    /* renamed from: v */
    public final void m840v(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (m791p(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC2342s3);
        }
        if (abstractComponentCallbacksC2342s3.f7204d) {
            abstractComponentCallbacksC2342s3.f7204d = false;
            if (!abstractComponentCallbacksC2342s3.f7185E) {
                this.f1262v.m1224N(abstractComponentCallbacksC2342s3);
                if (m791p(2)) {
                    Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC2342s3);
                }
                if (m789j(abstractComponentCallbacksC2342s3)) {
                    this.f1244X = true;
                }
            }
        }
    }

    /* renamed from: w */
    public final boolean m841w() {
        boolean z;
        if (this.f1264y < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
            if (abstractComponentCallbacksC2342s3 != null) {
                if (!abstractComponentCallbacksC2342s3.f7208i) {
                    z = abstractComponentCallbacksC2342s3.f7201Z.m841w();
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: x */
    public final void m842x() {
        if (this.f1260s != null) {
            this.f1228F = false;
            this.f1246Z = false;
            this.f1248d.f3149s = false;
            for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : this.f1262v.m1239w()) {
                if (abstractComponentCallbacksC2342s3 != null) {
                    abstractComponentCallbacksC2342s3.f7201Z.m842x();
                }
            }
        }
    }

    /* renamed from: y */
    public final void m843y(int i) {
        try {
            this.f1252h = true;
            for (C2762z c2762z : ((HashMap) this.f1262v.f1765h).values()) {
                if (c2762z != null) {
                    c2762z.f8993N = i;
                }
            }
            m829n(i, false);
            Iterator it = m805N().iterator();
            while (it.hasNext()) {
                ((C0135Cc) it.next()).m273u();
            }
            this.f1252h = false;
            m823f(true);
        } catch (Throwable th) {
            this.f1252h = false;
            throw th;
        }
    }

    /* renamed from: z */
    public final C2762z m844z(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        String str = abstractComponentCallbacksC2342s3.f7202b;
        if (str != null) {
            C1471be c1471be = AbstractC2465uS.f7563z;
            AbstractC2465uS.m4244h(new C1721gO(abstractComponentCallbacksC2342s3, str));
            AbstractC2465uS.m4245z(abstractComponentCallbacksC2342s3).getClass();
            EnumC0345Gb enumC0345Gb = EnumC0345Gb.f1160S;
            if (enumC0345Gb instanceof Void) {
                Void r0 = (Void) enumC0345Gb;
            }
        }
        if (m791p(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC2342s3);
        }
        C2762z m808Q = m808Q(abstractComponentCallbacksC2342s3);
        abstractComponentCallbacksC2342s3.f7198X = this;
        C0525Ju c0525Ju = this.f1262v;
        c0525Ju.m1231g(m808Q);
        if (!abstractComponentCallbacksC2342s3.f7204d) {
            c0525Ju.m1224N(abstractComponentCallbacksC2342s3);
            abstractComponentCallbacksC2342s3.f7206f = false;
            if (abstractComponentCallbacksC2342s3.f7222t == null) {
                abstractComponentCallbacksC2342s3.f7212m = false;
            }
            if (m789j(abstractComponentCallbacksC2342s3)) {
                this.f1244X = true;
            }
        }
        return m808Q;
    }

    /* renamed from: zx */
    public final void m845zx(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0989SZ());
        C0852Pu c0852Pu = this.f1260s;
        try {
            if (c0852Pu != null) {
                c0852Pu.f2882k.dump("  ", null, printWriter, new String[0]);
            } else {
                m837s("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e) {
            Log.e("FragmentManager", "Failed dumping state", e);
            throw runtimeException;
        }
    }
}
