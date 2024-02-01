package p000a;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: a.Gi */
/* loaded from: classes.dex */
public final class C0352Gi extends Observable {
    /* renamed from: N */
    public final void m767N(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C0641M3 c0641m3 = (C0641M3) ((AbstractC1978lB) ((Observable) this).mObservers.get(size));
            int i3 = c0641m3.f2067z;
            int i4 = 0;
            RecyclerView recyclerView = c0641m3.f2066h;
            switch (i3) {
                case AbstractC0795Op.f2698E /* 0 */:
                    recyclerView.m4914M(null);
                    C1280Xz c1280Xz = recyclerView.f9122q;
                    if (i2 < 1) {
                        c1280Xz.getClass();
                    } else {
                        ArrayList arrayList = c1280Xz.f4110h;
                        arrayList.add(c1280Xz.m2617o(null, 1, i, i2));
                        c1280Xz.f4109Q |= 1;
                        if (arrayList.size() == 1) {
                            i4 = 1;
                        }
                    }
                    if (i4 != 0) {
                        c0641m3.m1434z();
                        break;
                    } else {
                        break;
                    }
                case 1:
                    AbstractC1110Un.f3614z.postDelayed(new RunnableC2507vC(recyclerView, i4), 30L);
                    break;
                default:
                    recyclerView.m4915O();
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045 A[SYNTHETIC] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m768P(int r8, int r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.mObservers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L48
            java.util.ArrayList r2 = r7.mObservers
            java.lang.Object r2 = r2.get(r0)
            a.lB r2 = (p000a.AbstractC1978lB) r2
            a.M3 r2 = (p000a.C0641M3) r2
            int r3 = r2.f2067z
            switch(r3) {
                case 0: goto L1a;
                default: goto L19;
            }
        L19:
            goto L45
        L1a:
            androidx.recyclerview.widget.RecyclerView r3 = r2.f2066h
            r4 = 0
            r3.m4914M(r4)
            a.Xz r3 = r3.f9122q
            if (r9 >= r1) goto L28
            r3.getClass()
            goto L3f
        L28:
            java.util.ArrayList r5 = r3.f4110h
            r6 = 4
            a.Bo r4 = r3.m2617o(r4, r6, r8, r9)
            r5.add(r4)
            int r4 = r3.f4109Q
            r4 = r4 | r6
            r3.f4109Q = r4
            int r3 = r5.size()
            if (r3 != r1) goto L3f
            r3 = r1
            goto L40
        L3f:
            r3 = 0
        L40:
            if (r3 == 0) goto L45
            r2.m1434z()
        L45:
            int r0 = r0 + (-1)
            goto L8
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0352Gi.m768P(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[SYNTHETIC] */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m769Q(int r8, int r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.mObservers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L4c
            java.util.ArrayList r2 = r7.mObservers
            java.lang.Object r2 = r2.get(r0)
            a.lB r2 = (p000a.AbstractC1978lB) r2
            a.M3 r2 = (p000a.C0641M3) r2
            int r3 = r2.f2067z
            androidx.recyclerview.widget.RecyclerView r4 = r2.f2066h
            switch(r3) {
                case 0: goto L20;
                case 1: goto L1b;
                case 2: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L49
        L1c:
            r4.m4915O()
            goto L49
        L20:
            r3 = 0
            r4.m4914M(r3)
            a.Xz r4 = r4.f9122q
            if (r9 >= r1) goto L2c
            r4.getClass()
            goto L43
        L2c:
            java.util.ArrayList r5 = r4.f4110h
            r6 = 2
            a.Bo r3 = r4.m2617o(r3, r6, r8, r9)
            r5.add(r3)
            int r3 = r4.f4109Q
            r3 = r3 | r6
            r4.f4109Q = r3
            int r3 = r5.size()
            if (r3 != r1) goto L43
            r3 = r1
            goto L44
        L43:
            r3 = 0
        L44:
            if (r3 == 0) goto L49
            r2.m1434z()
        L49:
            int r0 = r0 + (-1)
            goto L8
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0352Gi.m769Q(int, int):void");
    }

    /* renamed from: h */
    public final void m770h() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C0641M3 c0641m3 = (C0641M3) ((AbstractC1978lB) ((Observable) this).mObservers.get(size));
            switch (c0641m3.f2067z) {
                case AbstractC0795Op.f2698E /* 0 */:
                    RecyclerView recyclerView = c0641m3.f2066h;
                    recyclerView.m4914M(null);
                    recyclerView.f9064BX.f1656Q = true;
                    recyclerView.m4927b(true);
                    if (recyclerView.f9122q.m2618u()) {
                        break;
                    } else {
                        recyclerView.requestLayout();
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004a A[SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m771v(int r8, int r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.mObservers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L4d
            java.util.ArrayList r2 = r7.mObservers
            java.lang.Object r2 = r2.get(r0)
            a.lB r2 = (p000a.AbstractC1978lB) r2
            a.M3 r2 = (p000a.C0641M3) r2
            int r3 = r2.f2067z
            androidx.recyclerview.widget.RecyclerView r4 = r2.f2066h
            switch(r3) {
                case 0: goto L20;
                case 1: goto L1b;
                case 2: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L4a
        L1c:
            r4.m4915O()
            goto L4a
        L20:
            r3 = 0
            r4.m4914M(r3)
            a.Xz r4 = r4.f9122q
            r4.getClass()
            if (r8 != r9) goto L2c
            goto L44
        L2c:
            java.util.ArrayList r5 = r4.f4110h
            r6 = 8
            a.Bo r3 = r4.m2617o(r3, r6, r8, r9)
            r5.add(r3)
            int r3 = r4.f4109Q
            r3 = r3 | r6
            r4.f4109Q = r3
            int r3 = r5.size()
            if (r3 != r1) goto L44
            r3 = r1
            goto L45
        L44:
            r3 = 0
        L45:
            if (r3 == 0) goto L4a
            r2.m1434z()
        L4a:
            int r0 = r0 + (-1)
            goto L8
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0352Gi.m771v(int, int):void");
    }

    /* renamed from: z */
    public final boolean m772z() {
        return !((Observable) this).mObservers.isEmpty();
    }
}
