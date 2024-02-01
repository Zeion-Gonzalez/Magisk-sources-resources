package p000a;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* renamed from: a.qR */
/* loaded from: classes.dex */
public final class C2253qR extends AbstractC1235X4 {

    /* renamed from: v */
    public static final C0518Jl f6937v = new C0518Jl(3);

    /* renamed from: h */
    public final AbstractC1235X4 f6938h;

    /* renamed from: z */
    public final AbstractC1235X4 f6939z;

    public C2253qR(C0657MQ c0657mq, Type type, Type type2) {
        c0657mq.getClass();
        Set set = AbstractC1167Vq.f3801z;
        this.f6939z = c0657mq.m1460z(type, set, null);
        this.f6938h = c0657mq.m1460z(type2, set, null);
    }

    public final String toString() {
        return "JsonAdapter(" + this.f6939z + "=" + this.f6938h + ")";
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        abstractC2626xP.mo3923h();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                int m4523C = abstractC2626xP.m4523C();
                if (m4523C != 5 && m4523C != 3) {
                    throw new IllegalStateException("Nesting problem.");
                }
                abstractC2626xP.f8146q = true;
                this.f6939z.mo1114v(abstractC2626xP, entry.getKey());
                this.f6938h.mo1114v(abstractC2626xP, entry.getValue());
            } else {
                throw new C1237X6("Map key is null at " + abstractC2626xP.m4524od());
            }
        }
        abstractC2626xP.mo3918G();
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        C1210Wc c1210Wc = new C1210Wc();
        abstractC0932RY.mo2099h();
        while (abstractC0932RY.mo2103y()) {
            C2326rl c2326rl = (C2326rl) abstractC0932RY;
            if (c2326rl.mo2103y()) {
                c2326rl.f7161U = c2326rl.m3982O4();
                c2326rl.f7162g = 11;
            }
            Object mo1115z = this.f6939z.mo1115z(abstractC0932RY);
            Object mo1115z2 = this.f6938h.mo1115z(abstractC0932RY);
            Object put = c1210Wc.put(mo1115z, mo1115z2);
            if (put != null) {
                throw new C1237X6("Map key '" + mo1115z + "' has multiple values at path " + abstractC0932RY.m2101od() + ": " + put + " and " + mo1115z2);
            }
        }
        abstractC0932RY.mo2096V();
        return c1210Wc;
    }
}
