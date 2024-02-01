package p000a;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* renamed from: a.Ko */
/* loaded from: classes.dex */
public final class C0577Ko extends AbstractC1235X4 {

    /* renamed from: P */
    public static final C0518Jl f1877P = new C0518Jl(1);

    /* renamed from: h */
    public final C1454bI[] f1878h;

    /* renamed from: v */
    public final C1624eZ f1879v;

    /* renamed from: z */
    public final AbstractC2703z2 f1880z;

    public C0577Ko(AbstractC2703z2 abstractC2703z2, TreeMap treeMap) {
        this.f1880z = abstractC2703z2;
        this.f1878h = (C1454bI[]) treeMap.values().toArray(new C1454bI[treeMap.size()]);
        this.f1879v = C1624eZ.m3078M((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    public final String toString() {
        return "JsonAdapter(" + this.f1880z + ")";
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        try {
            abstractC2626xP.mo3923h();
            for (C1454bI c1454bI : this.f1878h) {
                abstractC2626xP.mo3921V(c1454bI.f4536z);
                c1454bI.f4535v.mo1114v(abstractC2626xP, c1454bI.f4534h.get(obj));
            }
            abstractC2626xP.mo3918G();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        try {
            Object mo3375Lq = this.f1880z.mo3375Lq();
            try {
                abstractC0932RY.mo2099h();
                while (abstractC0932RY.mo2103y()) {
                    int mo2097ZH = abstractC0932RY.mo2097ZH(this.f1879v);
                    if (mo2097ZH == -1) {
                        abstractC0932RY.mo2093Lq();
                        abstractC0932RY.mo2092Ha();
                    } else {
                        C1454bI c1454bI = this.f1878h[mo2097ZH];
                        c1454bI.f4534h.set(mo3375Lq, c1454bI.f4535v.mo1115z(abstractC0932RY));
                    }
                }
                abstractC0932RY.mo2096V();
                return mo3375Lq;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            AbstractC1167Vq.m2390u(e2);
            throw null;
        }
    }
}
