package p000a;

import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.util.Log;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: a.Vy */
/* loaded from: classes.dex */
public final class C1174Vy implements InterfaceC0369H1, InterfaceC0416Hs, InterfaceC0792Om {

    /* renamed from: q */
    public static C1174Vy f3826q;

    /* renamed from: I */
    public Object f3827I;

    /* renamed from: R */
    public Object f3828R;

    /* renamed from: S */
    public final /* synthetic */ int f3829S;

    /* renamed from: w */
    public Object f3830w;

    public C1174Vy() {
        this.f3829S = 10;
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: G */
    public final ViewGroup.LayoutParams mo931G() {
        int i;
        Object obj = this.f3827I;
        int i2 = -2;
        if (((ExtendedFloatingActionButton) obj).f9348D == 0) {
            i = -2;
        } else {
            i = ((ExtendedFloatingActionButton) obj).f9348D;
        }
        if (((ExtendedFloatingActionButton) obj).f9356m != 0) {
            i2 = ((ExtendedFloatingActionButton) obj).f9356m;
        }
        return new ViewGroup.LayoutParams(i, i2);
    }

    /* renamed from: I */
    public final boolean m2395I(int i, C1628ed c1628ed, C0847Pp c0847Pp) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C0782OY c0782oy = (C0782OY) this.f3830w;
        int[] iArr = c1628ed.f5030Ha;
        c0782oy.f2651z = iArr[0];
        boolean z5 = true;
        c0782oy.f2647h = iArr[1];
        c0782oy.f2650v = c1628ed.m3098R();
        ((C0782OY) this.f3830w).f2644P = c1628ed.m3101V();
        C0782OY c0782oy2 = (C0782OY) this.f3830w;
        c0782oy2.f2646W = false;
        c0782oy2.f2642G = i;
        if (c0782oy2.f2651z == 3) {
            z = true;
        } else {
            z = false;
        }
        if (c0782oy2.f2647h == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && c1628ed.f5067m > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && c1628ed.f5067m > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        int[] iArr2 = c1628ed.f5060g;
        if (z3 && iArr2[0] == 4) {
            c0782oy2.f2651z = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c0782oy2.f2647h = 1;
        }
        c0847Pp.m1962h(c1628ed, c0782oy2);
        c1628ed.m3111p(((C0782OY) this.f3830w).f2643N);
        c1628ed.m3090F(((C0782OY) this.f3830w).f2645Q);
        Object obj = this.f3830w;
        C0782OY c0782oy3 = (C0782OY) obj;
        c1628ed.f5058e = c0782oy3.f2648o;
        int i2 = c0782oy3.f2649u;
        c1628ed.f5051Yd = i2;
        if (i2 <= 0) {
            z5 = false;
        }
        c1628ed.f5058e = z5;
        C0782OY c0782oy4 = (C0782OY) obj;
        c0782oy4.f2642G = 0;
        return c0782oy4.f2646W;
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: M */
    public final Object mo849M() {
        return null;
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: N */
    public final int mo932N() {
        Object obj;
        Object obj2 = this.f3827I;
        if (((ExtendedFloatingActionButton) obj2).f9348D == -1) {
            obj = this.f3828R;
        } else {
            if (((ExtendedFloatingActionButton) obj2).f9348D != 0 && ((ExtendedFloatingActionButton) obj2).f9348D != -2) {
                return ((ExtendedFloatingActionButton) obj2).f9348D;
            }
            obj = this.f3830w;
        }
        return ((InterfaceC0416Hs) obj).mo932N();
    }

    @Override // p000a.InterfaceC0792Om
    /* renamed from: P */
    public final Object mo1799P(C2139oL c2139oL) {
        Executor executor = (Executor) this.f3830w;
        if (executor != null) {
            return new C0727Nf(executor, c2139oL);
        }
        return c2139oL;
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: Q */
    public final int mo933Q() {
        Object obj;
        Object obj2 = this.f3827I;
        if (((ExtendedFloatingActionButton) obj2).f9356m == -1) {
            obj = this.f3828R;
        } else {
            if (((ExtendedFloatingActionButton) obj2).f9356m != 0 && ((ExtendedFloatingActionButton) obj2).f9356m != -2) {
                return ((ExtendedFloatingActionButton) obj2).f9356m;
            }
            obj = this.f3830w;
        }
        return ((InterfaceC0416Hs) obj).mo933Q();
    }

    /* renamed from: R */
    public final AbstractC1952kk m2396R(Class cls, String str) {
        AbstractC1952kk mo1123z;
        AbstractC0686Mz abstractC0686Mz;
        AbstractC1952kk abstractC1952kk = (AbstractC1952kk) ((C2145oS) this.f3828R).f6600z.get(str);
        if (cls.isInstance(abstractC1952kk)) {
            InterfaceC1428ao interfaceC1428ao = (InterfaceC1428ao) this.f3830w;
            if (interfaceC1428ao instanceof AbstractC0686Mz) {
                abstractC0686Mz = (AbstractC0686Mz) interfaceC1428ao;
            } else {
                abstractC0686Mz = null;
            }
            if (abstractC0686Mz != null) {
                abstractC0686Mz.mo1604h(abstractC1952kk);
            }
            return abstractC1952kk;
        }
        C0945Rm c0945Rm = new C0945Rm((AbstractC2180p4) this.f3827I);
        c0945Rm.m2110h(C1710g8.f5379U, str);
        try {
            mo1123z = ((InterfaceC1428ao) this.f3830w).mo1121N(cls, c0945Rm);
        } catch (AbstractMethodError unused) {
            mo1123z = ((InterfaceC1428ao) this.f3830w).mo1123z(cls);
        }
        AbstractC1952kk abstractC1952kk2 = (AbstractC1952kk) ((C2145oS) this.f3828R).f6600z.put(str, mo1123z);
        if (abstractC1952kk2 != null) {
            abstractC1952kk2.mo898N();
        }
        return mo1123z;
    }

    /* renamed from: S */
    public final AbstractC1952kk m2397S(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m2396R(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: V */
    public final Uri mo850V() {
        return (Uri) this.f3828R;
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: W */
    public final int mo934W() {
        return ((ExtendedFloatingActionButton) this.f3827I).f9357n;
    }

    /* renamed from: g */
    public final void m2398g(int i, int[] iArr, int[] iArr2, String[] strArr) {
        ((String[][]) this.f3828R)[i] = strArr;
        ((int[][]) this.f3830w)[i] = iArr;
        ((int[][]) this.f3827I)[i] = iArr2;
    }

    @Override // p000a.InterfaceC0792Om
    /* renamed from: h */
    public final Type mo1800h() {
        return (Type) this.f3828R;
    }

    /* renamed from: k */
    public final void m2399k(InterfaceC1503cL interfaceC1503cL) {
        ((CopyOnWriteArrayList) this.f3830w).remove(interfaceC1503cL);
        C1267Xl c1267Xl = (C1267Xl) ((Map) this.f3827I).remove(interfaceC1503cL);
        if (c1267Xl != null) {
            c1267Xl.f4086z.mo724h(c1267Xl.f4085h);
            c1267Xl.f4085h = null;
        }
        ((Runnable) this.f3828R).run();
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: o */
    public final ClipDescription mo851o() {
        return (ClipDescription) this.f3830w;
    }

    /* renamed from: q */
    public final boolean m2400q(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.f3830w).iterator();
        while (it.hasNext()) {
            if (((InterfaceC1503cL) it.next()).mo2519N(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final void m2401s(C1535cx c1535cx) {
        ((ArrayList) this.f3828R).clear();
        int size = c1535cx.f3714Pm.size();
        for (int i = 0; i < size; i++) {
            C1628ed c1628ed = (C1628ed) c1535cx.f3714Pm.get(i);
            int[] iArr = c1628ed.f5030Ha;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f3828R).add(c1628ed);
            }
        }
        c1535cx.f4740G5.f5205h = true;
    }

    public final String toString() {
        switch (this.f3829S) {
            case 2:
                String str = "[ ";
                if (((C2598ww) this.f3828R) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C2598ww) this.f3828R).f8001y[i] + " ";
                    }
                }
                return str + "] " + ((C2598ww) this.f3828R);
            case 8:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                if (((Uri) this.f3828R) != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf((Uri) this.f3828R));
                }
                if (((String) this.f3830w) != null) {
                    sb.append(" action=");
                    sb.append((String) this.f3830w);
                }
                if (((String) this.f3827I) != null) {
                    sb.append(" mimetype=");
                    sb.append((String) this.f3827I);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: u */
    public final int mo935u() {
        return ((ExtendedFloatingActionButton) this.f3827I).f9360x;
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: v */
    public final Uri mo852v() {
        return (Uri) this.f3827I;
    }

    /* renamed from: w */
    public final Location m2402w(String str) {
        try {
            if (((LocationManager) this.f3830w).isProviderEnabled(str)) {
                return ((LocationManager) this.f3830w).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: y */
    public final void m2403y(C1535cx c1535cx, int i, int i2, int i3) {
        int i4 = c1535cx.f5076qn;
        int i5 = c1535cx.f5029HL;
        c1535cx.f5076qn = 0;
        c1535cx.f5029HL = 0;
        c1535cx.m3111p(i2);
        c1535cx.m3090F(i3);
        if (i4 < 0) {
            i4 = 0;
        }
        c1535cx.f5076qn = i4;
        if (i5 < 0) {
            i5 = 0;
        }
        c1535cx.f5029HL = i5;
        C1535cx c1535cx2 = (C1535cx) this.f3827I;
        c1535cx2.f4737BX = i;
        c1535cx2.mo2337i();
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: z */
    public final void mo853z() {
    }

    public C1174Vy(int i) {
        this.f3829S = 6;
        this.f3828R = new String[i];
        this.f3830w = new int[i];
        this.f3827I = new int[i];
    }

    public /* synthetic */ C1174Vy(int i, Object obj, Object obj2, Object obj3) {
        this.f3829S = i;
        this.f3827I = obj;
        this.f3828R = obj2;
        this.f3830w = obj3;
    }

    public C1174Vy(C1535cx c1535cx) {
        this.f3829S = 3;
        this.f3828R = new ArrayList();
        this.f3830w = new C0782OY();
        this.f3827I = c1535cx;
    }

    public C1174Vy(C1004Sp c1004Sp, C1004Sp c1004Sp2) {
        this.f3829S = 2;
        this.f3827I = c1004Sp;
        this.f3830w = c1004Sp2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1174Vy(C2145oS c2145oS, InterfaceC1428ao interfaceC1428ao) {
        this(c2145oS, interfaceC1428ao, 0);
        this.f3829S = 7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1174Vy(C2145oS c2145oS, InterfaceC1428ao interfaceC1428ao, int i) {
        this(c2145oS, interfaceC1428ao, C2720zL.f8556h);
        this.f3829S = 7;
    }

    public C1174Vy(C2145oS c2145oS, InterfaceC1428ao interfaceC1428ao, AbstractC2180p4 abstractC2180p4) {
        this.f3829S = 7;
        this.f3828R = c2145oS;
        this.f3830w = interfaceC1428ao;
        this.f3827I = abstractC2180p4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1174Vy(InterfaceC0670Mg interfaceC0670Mg, InterfaceC1428ao interfaceC1428ao) {
        this(interfaceC0670Mg.mo1569G(), interfaceC1428ao, interfaceC0670Mg instanceof InterfaceC0699NC ? ((InterfaceC0699NC) interfaceC0670Mg).mo1635z() : C2720zL.f8556h);
        this.f3829S = 7;
    }

    public C1174Vy(Context context, LocationManager locationManager) {
        this.f3829S = 1;
        this.f3827I = new C2448u8();
        this.f3828R = context;
        this.f3830w = locationManager;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1174Vy(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType(), 8);
        this.f3829S = 8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1174Vy(Object obj) {
        this();
        this.f3829S = 10;
    }

    public /* synthetic */ C1174Vy(Object obj, Object obj2, Object obj3, int i) {
        this.f3829S = i;
        this.f3828R = obj;
        this.f3830w = obj2;
        this.f3827I = obj3;
    }

    public C1174Vy(Runnable runnable) {
        this.f3829S = 4;
        this.f3830w = new CopyOnWriteArrayList();
        this.f3827I = new HashMap();
        this.f3828R = runnable;
    }
}
