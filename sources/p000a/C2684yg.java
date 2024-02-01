package p000a;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* renamed from: a.yg */
/* loaded from: classes.dex */
public final class C2684yg implements InterfaceC2687yj {

    /* renamed from: R */
    public boolean f8366R = false;

    /* renamed from: S */
    public AbstractC1706g4 f8367S;

    /* renamed from: w */
    public int f8368w;

    @Override // p000a.InterfaceC2687yj
    /* renamed from: G */
    public final void mo217G(Context context, C2189pE c2189pE) {
        this.f8367S.f5364t = c2189pE;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: N */
    public final boolean mo218N() {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: P */
    public final boolean mo219P(SubMenuC1188WE subMenuC1188WE) {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: R */
    public final boolean mo220R(C1117Uu c1117Uu) {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: S */
    public final void mo221S(boolean z) {
        boolean z2;
        C0597LB c0597lb;
        if (this.f8366R) {
            return;
        }
        if (z) {
            this.f8367S.m3215z();
            return;
        }
        AbstractC1706g4 abstractC1706g4 = this.f8367S;
        C2189pE c2189pE = abstractC1706g4.f5364t;
        if (c2189pE != null && abstractC1706g4.f5358k != null) {
            int size = c2189pE.size();
            if (size != abstractC1706g4.f5358k.length) {
                abstractC1706g4.m3215z();
                return;
            }
            int i = abstractC1706g4.f5355g;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = abstractC1706g4.f5364t.getItem(i2);
                if (item.isChecked()) {
                    abstractC1706g4.f5355g = item.getItemId();
                    abstractC1706g4.f5367y = i2;
                }
            }
            if (i != abstractC1706g4.f5355g && (c0597lb = abstractC1706g4.f5348S) != null) {
                AbstractC2299rI.m3956z(abstractC1706g4, c0597lb);
            }
            int i3 = abstractC1706g4.f5361q;
            int size2 = abstractC1706g4.f5364t.m3795V().size();
            if (i3 != -1 ? i3 == 0 : size2 > 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            for (int i4 = 0; i4 < size; i4++) {
                abstractC1706g4.f5349T.f8366R = true;
                abstractC1706g4.f5358k[i4].m126q(abstractC1706g4.f5361q);
                C0065BH c0065bh = abstractC1706g4.f5358k[i4];
                if (c0065bh.f264E != z2) {
                    c0065bh.f264E = z2;
                    c0065bh.m114M();
                }
                abstractC1706g4.f5358k[i4].mo131z((C1117Uu) abstractC1706g4.f5364t.getItem(i4));
                abstractC1706g4.f5349T.f8366R = false;
            }
        }
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: V */
    public final boolean mo222V(C1117Uu c1117Uu) {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: o */
    public final void mo224o(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof C0988SY) {
            AbstractC1706g4 abstractC1706g4 = this.f8367S;
            C0988SY c0988sy = (C0988SY) parcelable;
            int i = c0988sy.f3331S;
            int size = abstractC1706g4.f5364t.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = abstractC1706g4.f5364t.getItem(i2);
                if (i == item.getItemId()) {
                    abstractC1706g4.f5355g = i;
                    abstractC1706g4.f5367y = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f8367S.getContext();
            C0387HM c0387hm = c0988sy.f3330R;
            SparseArray sparseArray2 = new SparseArray(c0387hm.size());
            for (int i3 = 0; i3 < c0387hm.size(); i3++) {
                int keyAt = c0387hm.keyAt(i3);
                C0053B2 c0053b2 = (C0053B2) c0387hm.valueAt(i3);
                if (c0053b2 != null) {
                    sparseArray2.put(keyAt, new C1773hL(context, c0053b2));
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            AbstractC1706g4 abstractC1706g42 = this.f8367S;
            abstractC1706g42.getClass();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = abstractC1706g42.f5341F;
                if (i4 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i4);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (C1773hL) sparseArray2.get(keyAt2));
                }
                i4++;
            }
            C0065BH[] c0065bhArr = abstractC1706g42.f5358k;
            if (c0065bhArr != null) {
                for (C0065BH c0065bh : c0065bhArr) {
                    c0065bh.m118R((C1773hL) sparseArray.get(c0065bh.getId()));
                }
            }
        }
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: u */
    public final Parcelable mo225u() {
        C0988SY c0988sy = new C0988SY();
        AbstractC1706g4 abstractC1706g4 = this.f8367S;
        c0988sy.f3331S = abstractC1706g4.f5355g;
        SparseArray sparseArray = abstractC1706g4.f5341F;
        C0387HM c0387hm = new C0387HM();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            C1773hL c1773hL = (C1773hL) sparseArray.valueAt(i);
            if (c1773hL != null) {
                c0387hm.put(keyAt, c1773hL.f5583q.f6106z);
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        c0988sy.f3330R = c0387hm;
        return c0988sy;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: v */
    public final int mo226v() {
        return this.f8368w;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: z */
    public final void mo227z(C2189pE c2189pE, boolean z) {
    }
}
