package p000a;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: a.KT */
/* loaded from: classes.dex */
public final class C0556KT extends AbstractC1235X4 {

    /* renamed from: v */
    public static final C0518Jl f1816v = new C0518Jl(0);

    /* renamed from: h */
    public final AbstractC1235X4 f1817h;

    /* renamed from: z */
    public final Class f1818z;

    public C0556KT(Class cls, AbstractC1235X4 abstractC1235X4) {
        this.f1818z = cls;
        this.f1817h = abstractC1235X4;
    }

    public final String toString() {
        return this.f1817h + ".array()";
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        abstractC2626xP.mo3927z();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f1817h.mo1114v(abstractC2626xP, Array.get(obj, i));
        }
        ((C2279qw) abstractC2626xP).m3924he(']', 1, 2);
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        ArrayList arrayList = new ArrayList();
        abstractC0932RY.mo2104z();
        while (abstractC0932RY.mo2103y()) {
            arrayList.add(this.f1817h.mo1115z(abstractC0932RY));
        }
        abstractC0932RY.mo2091G();
        Object newInstance = Array.newInstance(this.f1818z, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }
}
