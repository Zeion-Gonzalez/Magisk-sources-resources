package p000a;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: a.RF */
/* loaded from: classes.dex */
public final class C0916RF extends AbstractC1952kk {

    /* renamed from: U */
    public static final C1710g8 f3144U = new C1710g8();

    /* renamed from: g */
    public final boolean f3146g;

    /* renamed from: I */
    public final HashMap f3145I = new HashMap();

    /* renamed from: q */
    public final HashMap f3148q = new HashMap();

    /* renamed from: k */
    public final HashMap f3147k = new HashMap();

    /* renamed from: y */
    public boolean f3150y = false;

    /* renamed from: s */
    public boolean f3149s = false;

    public C0916RF(boolean z) {
        this.f3146g = z;
    }

    /* renamed from: G */
    public final void m2069G(String str) {
        HashMap hashMap = this.f3148q;
        C0916RF c0916rf = (C0916RF) hashMap.get(str);
        if (c0916rf != null) {
            c0916rf.mo898N();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f3147k;
        C2145oS c2145oS = (C2145oS) hashMap2.get(str);
        if (c2145oS != null) {
            c2145oS.m3763z();
            hashMap2.remove(str);
        }
    }

    /* renamed from: M */
    public final void m2070M(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (this.f3149s) {
            if (C0364Gx.m791p(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if ((this.f3145I.remove(abstractComponentCallbacksC2342s3.f7218q) != null) && C0364Gx.m791p(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC2342s3);
            }
        }
    }

    @Override // p000a.AbstractC1952kk
    /* renamed from: N */
    public final void mo898N() {
        if (C0364Gx.m791p(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3150y = true;
    }

    /* renamed from: W */
    public final void m2071W(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (C0364Gx.m791p(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC2342s3);
        }
        m2069G(abstractComponentCallbacksC2342s3.f7218q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0916RF.class != obj.getClass()) {
            return false;
        }
        C0916RF c0916rf = (C0916RF) obj;
        return this.f3145I.equals(c0916rf.f3145I) && this.f3148q.equals(c0916rf.f3148q) && this.f3147k.equals(c0916rf.f3147k);
    }

    public final int hashCode() {
        return this.f3147k.hashCode() + ((this.f3148q.hashCode() + (this.f3145I.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3145I.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3148q.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3147k.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
