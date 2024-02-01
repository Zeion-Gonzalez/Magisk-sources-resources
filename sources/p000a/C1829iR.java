package p000a;

import android.view.View;
import android.view.WindowInsets;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.iR */
/* loaded from: classes.dex */
public final class C1829iR {

    /* renamed from: N */
    public final int[] f5719N = new int[2];

    /* renamed from: P */
    public int f5720P;

    /* renamed from: h */
    public final View f5721h;

    /* renamed from: v */
    public int f5722v;

    /* renamed from: z */
    public WindowInsets f5723z;

    public C1829iR(View view) {
        this.f5721h = view;
    }

    /* renamed from: z */
    public final void m3382z(C2621xJ c2621xJ, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C1482bt) it.next()).f4621z.mo3218v() & 8) != 0) {
                this.f5721h.setTranslationY(AbstractC1090US.m2262h(this.f5720P, 0, r3.f4621z.mo3217h()));
                return;
            }
        }
    }
}
