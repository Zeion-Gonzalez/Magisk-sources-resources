package p000a;

import androidx.lifecycle.AbstractC2764h;

/* renamed from: a.Up */
/* loaded from: classes.dex */
public class C1112Up extends AbstractC2764h {
    @Override // androidx.lifecycle.AbstractC2764h
    /* renamed from: G */
    public final void mo2290G(Object obj) {
        AbstractC2764h.m4842z("setValue");
        this.f9021u++;
        this.f9015N = obj;
        m4848v(null);
    }

    /* renamed from: M */
    public final void m2291M(Object obj) {
        boolean z;
        synchronized (this.f9023z) {
            if (this.f9017Q == AbstractC2764h.f9013M) {
                z = true;
            } else {
                z = false;
            }
            this.f9017Q = obj;
        }
        if (z) {
            C2146oU.m3764nB().m3767yF(this.f9014G);
        }
    }
}
