package p000a;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a.Sr */
/* loaded from: classes.dex */
public final class C1006Sr extends AbstractSet {

    /* renamed from: R */
    public final /* synthetic */ C1210Wc f3374R;

    /* renamed from: S */
    public final /* synthetic */ int f3375S;

    public /* synthetic */ C1006Sr(C1210Wc c1210Wc, int i) {
        this.f3375S = i;
        this.f3374R = c1210Wc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f3375S;
        C1210Wc c1210Wc = this.f3374R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                c1210Wc.clear();
                return;
            default:
                c1210Wc.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f3375S;
        C1210Wc c1210Wc = this.f3374R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if ((obj instanceof Map.Entry) && c1210Wc.m2492h((Map.Entry) obj) != null) {
                    return true;
                }
                return false;
            default:
                return c1210Wc.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3375S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C0775OR(this);
            default:
                return new C0775OR(this, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f3375S
            r1 = 1
            a.Wc r2 = r4.f3374R
            r3 = 0
            switch(r0) {
                case 0: goto La;
                default: goto L9;
            }
        L9:
            goto L1d
        La:
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 != 0) goto Lf
            goto L17
        Lf:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            a.PK r5 = r2.m2492h(r5)
            if (r5 != 0) goto L19
        L17:
            r1 = r3
            goto L1c
        L19:
            r2.m2490P(r5, r1)
        L1c:
            return r1
        L1d:
            r2.getClass()
            if (r5 == 0) goto L27
            a.PK r5 = r2.m2495z(r5, r3)     // Catch: java.lang.ClassCastException -> L27
            goto L28
        L27:
            r5 = 0
        L28:
            if (r5 == 0) goto L2d
            r2.m2490P(r5, r1)
        L2d:
            if (r5 == 0) goto L30
            goto L31
        L30:
            r1 = r3
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1006Sr.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f3375S;
        C1210Wc c1210Wc = this.f3374R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return c1210Wc.f3928I;
            default:
                return c1210Wc.f3928I;
        }
    }
}
