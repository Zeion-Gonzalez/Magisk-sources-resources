package p000a;

import android.view.View;

/* renamed from: a.ZA */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1344ZA implements View.OnLayoutChangeListener {

    /* renamed from: z */
    public boolean f4238z = true;

    /* JADX WARN: Code restructure failed: missing block: B:53:0x004a, code lost:
    
        if (r7 == (r3 - 1)) goto L55;
     */
    @Override // android.view.View.OnLayoutChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            r0 = this;
            r2 = r1
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            a.Md r3 = r2.f9077J
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L4d
            a.Hk r3 = r2.f9124r
            if (r3 == 0) goto L4d
            int r3 = r3.mo918z()
            if (r3 != 0) goto L14
            goto L4d
        L14:
            a.Md r3 = r2.f9077J
            boolean r6 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r6 == 0) goto L4c
            int r3 = r3.m1519Y()
            a.Md r6 = r2.f9077J
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            int r7 = r6.m1513U()
            android.view.View r6 = r6.m4868KM(r5, r7, r4, r5)
            r7 = -1
            if (r6 != 0) goto L2f
            r6 = r7
            goto L33
        L2f:
            int r6 = p000a.AbstractC0667Md.m1483F(r6)
        L33:
            a.Md r2 = r2.f9077J
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r8 = r2.m1513U()
            int r8 = r8 - r4
            android.view.View r2 = r2.m4868KM(r8, r7, r4, r5)
            if (r2 != 0) goto L43
            goto L47
        L43:
            int r7 = p000a.AbstractC0667Md.m1483F(r2)
        L47:
            if (r6 != 0) goto L4c
            int r3 = r3 - r4
            if (r7 == r3) goto L4d
        L4c:
            r5 = r4
        L4d:
            boolean r2 = r0.f4238z
            if (r5 == r2) goto L5e
            r2 = r2 ^ r4
            r0.f4238z = r2
            if (r2 == 0) goto L5a
            r1.setOverScrollMode(r4)
            goto L5e
        L5a:
            r2 = 2
            r1.setOverScrollMode(r2)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ViewOnLayoutChangeListenerC1344ZA.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
