package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.kj */
/* loaded from: classes.dex */
public final class C1951kj extends C1420ag implements Iterable, InterfaceC1564dP {

    /* renamed from: J */
    public static final /* synthetic */ int f6043J = 0;

    /* renamed from: E */
    public final C2616xE f6044E;

    /* renamed from: Y */
    public String f6045Y;

    /* renamed from: f */
    public int f6046f;

    /* renamed from: r */
    public String f6047r;

    public C1951kj(AbstractC2719zK abstractC2719zK) {
        super(abstractC2719zK);
        this.f6044E = new C2616xE();
    }

    @Override // p000a.C1420ag
    /* renamed from: G */
    public final void mo86G(Context context, AttributeSet attributeSet) {
        boolean z;
        String valueOf;
        super.mo86G(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2516vL.f7707P);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f4455y) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f6045Y != null) {
                this.f6046f = 0;
                this.f6045Y = null;
            }
            this.f6046f = resourceId;
            this.f6047r = null;
            if (resourceId > 16777215) {
                try {
                    valueOf = context.getResources().getResourceName(resourceId);
                } catch (Resources.NotFoundException unused) {
                    valueOf = String.valueOf(resourceId);
                }
                this.f6047r = valueOf;
                obtainAttributes.recycle();
                return;
            }
            valueOf = String.valueOf(resourceId);
            this.f6047r = valueOf;
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
    }

    /* renamed from: M */
    public final void m3569M(C1420ag c1420ag) {
        boolean z;
        boolean z2;
        int i = c1420ag.f4455y;
        String str = c1420ag.f4453s;
        boolean z3 = false;
        if (i == 0 && str == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f4453s != null && (!AbstractC1292YB.m2695u(str, r4)) == false) {
                throw new IllegalArgumentException(("Destination " + c1420ag + " cannot have the same route as graph " + this).toString());
            }
            if (i != this.f4455y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C2616xE c2616xE = this.f6044E;
                C1420ag c1420ag2 = (C1420ag) c2616xE.m4502N(i, null);
                if (c1420ag2 == c1420ag) {
                    return;
                }
                if (c1420ag.f4448R == null) {
                    z3 = true;
                }
                if (z3) {
                    if (c1420ag2 != null) {
                        c1420ag2.f4448R = null;
                    }
                    c1420ag.f4448R = this;
                    c2616xE.m4507u(c1420ag.f4455y, c1420ag);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
            }
            throw new IllegalArgumentException(("Destination " + c1420ag + " cannot have the same id as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    /* renamed from: R */
    public final C0952Rt m3570R(C1174Vy c1174Vy) {
        return super.mo2851o(c1174Vy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* renamed from: S */
    public final C1420ag m3571S(String str, boolean z) {
        C1951kj c1951kj;
        ?? r1;
        boolean z2;
        int hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        C2616xE c2616xE = this.f6044E;
        C1420ag c1420ag = (C1420ag) c2616xE.m4502N(hashCode, null);
        boolean z3 = false;
        if (c1420ag == null) {
            Iterator it = AbstractC0873QM.m2011G5(AbstractC1843ih.m3424Ry(c2616xE)).iterator();
            while (true) {
                if (it.hasNext()) {
                    r1 = it.next();
                    if (((C1420ag) r1).m2849W(str) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    r1 = 0;
                    break;
                }
            }
            c1420ag = r1;
        }
        if (c1420ag == null) {
            if (!z || (c1951kj = this.f4448R) == null) {
                return null;
            }
            if (str == null || AbstractC1269Xn.m2579T0(str)) {
                z3 = true;
            }
            if (z3) {
                return null;
            }
            return c1951kj.m3571S(str, true);
        }
        return c1420ag;
    }

    /* renamed from: V */
    public final C1420ag m3572V(int i, boolean z) {
        C1951kj c1951kj;
        C1420ag c1420ag = (C1420ag) this.f6044E.m4502N(i, null);
        if (c1420ag == null) {
            if (!z || (c1951kj = this.f4448R) == null) {
                return null;
            }
            return c1951kj.m3572V(i, true);
        }
        return c1420ag;
    }

    @Override // p000a.C1420ag
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1951kj)) {
            C2616xE c2616xE = this.f6044E;
            InterfaceC2296rE m2011G5 = AbstractC0873QM.m2011G5(AbstractC1843ih.m3424Ry(c2616xE));
            ArrayList arrayList = new ArrayList();
            Iterator it = m2011G5.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            C1951kj c1951kj = (C1951kj) obj;
            C2616xE c2616xE2 = c1951kj.f6044E;
            C2098nX m3424Ry = AbstractC1843ih.m3424Ry(c2616xE2);
            while (m3424Ry.hasNext()) {
                arrayList.remove((C1420ag) m3424Ry.next());
            }
            if (super.equals(obj) && c2616xE.m4506o() == c2616xE2.m4506o() && this.f6046f == c1951kj.f6046f && arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000a.C1420ag
    public final int hashCode() {
        int i = this.f6046f;
        C2616xE c2616xE = this.f6044E;
        int m4506o = c2616xE.m4506o();
        for (int i2 = 0; i2 < m4506o; i2++) {
            i = (((i * 31) + c2616xE.m4504Q(i2)) * 31) + ((C1420ag) c2616xE.m4505W(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2095nT(this);
    }

    @Override // p000a.C1420ag
    /* renamed from: o */
    public final C0952Rt mo2851o(C1174Vy c1174Vy) {
        C0952Rt mo2851o = super.mo2851o(c1174Vy);
        ArrayList arrayList = new ArrayList();
        C2095nT c2095nT = new C2095nT(this);
        while (c2095nT.hasNext()) {
            C0952Rt mo2851o2 = ((C1420ag) c2095nT.next()).mo2851o(c1174Vy);
            if (mo2851o2 != null) {
                arrayList.add(mo2851o2);
            }
        }
        return (C0952Rt) AbstractC2486us.m4282Rh(AbstractC1658fB.m3131Lq(new C0952Rt[]{mo2851o, (C0952Rt) AbstractC2486us.m4282Rh(arrayList)}));
    }

    @Override // p000a.C1420ag
    public final String toString() {
        boolean z;
        C1420ag c1420ag;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str2 = this.f6045Y;
        if (str2 != null && !AbstractC1269Xn.m2579T0(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            c1420ag = m3571S(str2, true);
        } else {
            c1420ag = null;
        }
        if (c1420ag == null) {
            c1420ag = m3572V(this.f6046f, true);
        }
        sb.append(" startDestination=");
        if (c1420ag == null) {
            str = this.f6045Y;
            if (str == null && (str = this.f6047r) == null) {
                str = "0x" + Integer.toHexString(this.f6046f);
            }
        } else {
            sb.append("{");
            sb.append(c1420ag.toString());
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }
}
