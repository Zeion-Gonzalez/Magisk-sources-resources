package p000a;

import android.content.res.Resources;
import android.view.View;

/* renamed from: a.jR */
/* loaded from: classes.dex */
public abstract class AbstractC1881jR extends AbstractC0928RS {

    /* renamed from: w */
    public final C2075n3 f5863w = new C2075n3(this);

    /* renamed from: E */
    public String[] mo1574E(Resources resources) {
        Object c1019t6;
        try {
            c1019t6 = resources.getStringArray(mo1461r());
        } catch (Throwable th) {
            c1019t6 = new C1019T6(th);
        }
        Object obj = new String[0];
        if (c1019t6 instanceof C1019T6) {
            c1019t6 = obj;
        }
        return (String[]) c1019t6;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: I */
    public void mo1575I(View view, C0316G1 c0316g1) {
        c0316g1.m693q(this, new C2480ul(view, this, c0316g1, 0));
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        return this.f5863w;
    }

    /* renamed from: U */
    public String[] mo1576U(Resources resources) {
        Object c1019t6;
        try {
            c1019t6 = resources.getStringArray(mo3501f());
        } catch (Throwable th) {
            c1019t6 = new C1019T6(th);
        }
        Object obj = new String[0];
        if (c1019t6 instanceof C1019T6) {
            c1019t6 = obj;
        }
        return (String[]) c1019t6;
    }

    /* renamed from: f */
    public int mo3501f() {
        return mo1461r();
    }

    /* renamed from: r */
    public int mo1461r() {
        return -1;
    }
}
