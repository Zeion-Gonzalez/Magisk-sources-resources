package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.PC */
/* loaded from: classes.dex */
public final class C0816PC {

    /* renamed from: h */
    public boolean f2775h;

    /* renamed from: z */
    public final Object f2777z = new Object();

    /* renamed from: v */
    public final ArrayList f2776v = new ArrayList();

    public C0816PC(C2114nr c2114nr) {
    }

    /* renamed from: z */
    public final void m1919z() {
        synchronized (this.f2777z) {
            this.f2775h = true;
            Iterator it = this.f2776v.iterator();
            while (it.hasNext()) {
                ((InterfaceC1459bP) it.next()).mo93z();
            }
            this.f2776v.clear();
        }
    }
}
