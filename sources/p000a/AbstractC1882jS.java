package p000a;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: a.jS */
/* loaded from: classes.dex */
public abstract class AbstractC1882jS extends AbstractC1235X4 {

    /* renamed from: h */
    public static final C0518Jl f5864h = new C0518Jl(2);

    /* renamed from: z */
    public final AbstractC1235X4 f5865z;

    public AbstractC1882jS(AbstractC1235X4 abstractC1235X4) {
        this.f5865z = abstractC1235X4;
    }

    /* renamed from: P */
    public final AbstractCollection m3502P(AbstractC0932RY abstractC0932RY) {
        AbstractCollection linkedHashSet;
        switch (((C2603x0) this).f8022v) {
            case AbstractC0795Op.f2698E /* 0 */:
                linkedHashSet = new ArrayList();
                break;
            default:
                linkedHashSet = new LinkedHashSet();
                break;
        }
        abstractC0932RY.mo2104z();
        while (abstractC0932RY.mo2103y()) {
            linkedHashSet.add(this.f5865z.mo1115z(abstractC0932RY));
        }
        abstractC0932RY.mo2091G();
        return linkedHashSet;
    }

    public final String toString() {
        return this.f5865z + ".collection()";
    }
}
