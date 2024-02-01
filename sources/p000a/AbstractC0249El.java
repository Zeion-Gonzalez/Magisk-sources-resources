package p000a;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: a.El */
/* loaded from: classes.dex */
public abstract class AbstractC0249El {

    /* renamed from: y */
    public static final List f847y = Collections.emptyList();

    /* renamed from: G */
    public int f848G;

    /* renamed from: g */
    public AbstractC0408Hk f858g;

    /* renamed from: h */
    public WeakReference f859h;

    /* renamed from: k */
    public RecyclerView f860k;

    /* renamed from: z */
    public final View f866z;

    /* renamed from: v */
    public int f864v = -1;

    /* renamed from: P */
    public int f852P = -1;

    /* renamed from: N */
    public long f851N = -1;

    /* renamed from: Q */
    public int f853Q = -1;

    /* renamed from: u */
    public int f863u = -1;

    /* renamed from: o */
    public AbstractC0249El f861o = null;

    /* renamed from: W */
    public AbstractC0249El f857W = null;

    /* renamed from: M */
    public ArrayList f850M = null;

    /* renamed from: V */
    public List f856V = null;

    /* renamed from: S */
    public int f855S = 0;

    /* renamed from: R */
    public C1578df f854R = null;

    /* renamed from: w */
    public boolean f865w = false;

    /* renamed from: I */
    public int f849I = 0;

    /* renamed from: q */
    public int f862q = -1;

    public AbstractC0249El(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f866z = view;
    }

    /* renamed from: G */
    public final boolean m518G() {
        return this.f854R != null;
    }

    /* renamed from: I */
    public final boolean m519I() {
        return (this.f848G & 32) != 0;
    }

    /* renamed from: M */
    public final boolean m520M() {
        return (this.f848G & 256) != 0;
    }

    /* renamed from: N */
    public final boolean m521N() {
        View view = this.f866z;
        return (view.getParent() == null || view.getParent() == this.f860k) ? false : true;
    }

    /* renamed from: P */
    public final List m522P() {
        ArrayList arrayList;
        return ((this.f848G & 1024) != 0 || (arrayList = this.f850M) == null || arrayList.size() == 0) ? f847y : this.f856V;
    }

    /* renamed from: Q */
    public final boolean m523Q() {
        return (this.f848G & 1) != 0;
    }

    /* renamed from: R */
    public final void m524R(boolean z) {
        int i;
        int i2 = this.f855S;
        int i3 = z ? i2 - 1 : i2 + 1;
        this.f855S = i3;
        if (i3 < 0) {
            this.f855S = 0;
            int[] iArr = RecyclerView.f9056LN;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else {
            if (!z && i3 == 1) {
                i = this.f848G | 16;
            } else if (z && i3 == 0) {
                i = this.f848G & (-17);
            }
            this.f848G = i;
        }
        int[] iArr2 = RecyclerView.f9056LN;
    }

    /* renamed from: S */
    public final void m525S() {
        int[] iArr = RecyclerView.f9056LN;
        this.f848G = 0;
        this.f864v = -1;
        this.f852P = -1;
        this.f851N = -1L;
        this.f863u = -1;
        this.f855S = 0;
        this.f861o = null;
        this.f857W = null;
        ArrayList arrayList = this.f850M;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f848G &= -1025;
        this.f849I = 0;
        this.f862q = -1;
        RecyclerView.m4890V(this);
    }

    /* renamed from: V */
    public final void m526V(int i, boolean z) {
        if (this.f852P == -1) {
            this.f852P = this.f864v;
        }
        if (this.f863u == -1) {
            this.f863u = this.f864v;
        }
        if (z) {
            this.f863u += i;
        }
        this.f864v += i;
        View view = this.f866z;
        if (view.getLayoutParams() != null) {
            ((C0419Hv) view.getLayoutParams()).f1396v = true;
        }
    }

    /* renamed from: W */
    public final boolean m527W() {
        return (this.f848G & 8) != 0;
    }

    /* renamed from: h */
    public final void m528h(int i) {
        this.f848G = i | this.f848G;
    }

    /* renamed from: o */
    public final boolean m529o() {
        if ((this.f848G & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (!AbstractC2397t8.m4122W(this.f866z)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        boolean z;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f864v + " id=" + this.f851N + ", oldPos=" + this.f852P + ", pLpos:" + this.f863u);
        if (m518G()) {
            sb.append(" scrap ");
            if (this.f865w) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (m530u()) {
            sb.append(" invalid");
        }
        if (!m523Q()) {
            sb.append(" unbound");
        }
        boolean z2 = true;
        if ((this.f848G & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append(" update");
        }
        if (m527W()) {
            sb.append(" removed");
        }
        if (m532w()) {
            sb.append(" ignored");
        }
        if (m520M()) {
            sb.append(" tmpDetached");
        }
        if (!m529o()) {
            sb.append(" not recyclable(" + this.f855S + ")");
        }
        if ((this.f848G & 512) == 0 && !m530u()) {
            z2 = false;
        }
        if (z2) {
            sb.append(" undefined adapter position");
        }
        if (this.f866z.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean m530u() {
        return (this.f848G & 4) != 0;
    }

    /* renamed from: v */
    public final int m531v() {
        int i = this.f863u;
        return i == -1 ? this.f864v : i;
    }

    /* renamed from: w */
    public final boolean m532w() {
        return (this.f848G & 128) != 0;
    }

    /* renamed from: z */
    public final void m533z(Object obj) {
        if (obj == null) {
            m528h(1024);
            return;
        }
        if ((1024 & this.f848G) == 0) {
            if (this.f850M == null) {
                ArrayList arrayList = new ArrayList();
                this.f850M = arrayList;
                this.f856V = Collections.unmodifiableList(arrayList);
            }
            this.f850M.add(obj);
        }
    }
}
