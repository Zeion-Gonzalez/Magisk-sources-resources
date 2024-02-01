package p000a;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: a.J2 */
/* loaded from: classes.dex */
public final class C0480J2 extends AbstractC0531K0 {
    @Override // p000a.AbstractC0531K0
    /* renamed from: N */
    public final void mo1156N(int i, String str, String str2, Throwable th) {
        throw new AssertionError();
    }

    @Override // p000a.AbstractC0531K0
    /* renamed from: h */
    public final void mo1157h(String str, Object... objArr) {
        for (AbstractC0531K0 abstractC0531K0 : AbstractC1530cs.f4726v) {
            abstractC0531K0.mo1157h(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: o */
    public final void m1158o(C1698fw c1698fw) {
        boolean z;
        if (c1698fw != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList arrayList = AbstractC1530cs.f4725h;
            synchronized (arrayList) {
                arrayList.add(c1698fw);
                Object[] array = arrayList.toArray(new AbstractC0531K0[0]);
                if (array != null) {
                    AbstractC1530cs.f4726v = (AbstractC0531K0[]) array;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            return;
        }
        throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
    }

    @Override // p000a.AbstractC0531K0
    /* renamed from: u */
    public final void mo1159u(Exception exc) {
        for (AbstractC0531K0 abstractC0531K0 : AbstractC1530cs.f4726v) {
            abstractC0531K0.mo1159u(exc);
        }
    }

    @Override // p000a.AbstractC0531K0
    /* renamed from: v */
    public final void mo1160v(Throwable th) {
        for (AbstractC0531K0 abstractC0531K0 : AbstractC1530cs.f4726v) {
            abstractC0531K0.mo1160v(th);
        }
    }

    @Override // p000a.AbstractC0531K0
    /* renamed from: z */
    public final void mo1161z(Object... objArr) {
        for (AbstractC0531K0 abstractC0531K0 : AbstractC1530cs.f4726v) {
            abstractC0531K0.mo1161z(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
