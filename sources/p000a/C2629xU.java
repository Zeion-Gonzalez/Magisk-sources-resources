package p000a;

import java.lang.reflect.Type;

/* renamed from: a.xU */
/* loaded from: classes.dex */
public final class C2629xU extends AbstractC1235X4 {

    /* renamed from: P */
    public AbstractC1235X4 f8214P;

    /* renamed from: h */
    public final String f8215h;

    /* renamed from: v */
    public final Object f8216v;

    /* renamed from: z */
    public final Type f8217z;

    public C2629xU(Type type, String str, Object obj) {
        this.f8217z = type;
        this.f8215h = str;
        this.f8216v = obj;
    }

    public final String toString() {
        AbstractC1235X4 abstractC1235X4 = this.f8214P;
        return abstractC1235X4 != null ? abstractC1235X4.toString() : super.toString();
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        AbstractC1235X4 abstractC1235X4 = this.f8214P;
        if (abstractC1235X4 == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        abstractC1235X4.mo1114v(abstractC2626xP, obj);
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        AbstractC1235X4 abstractC1235X4 = this.f8214P;
        if (abstractC1235X4 != null) {
            return abstractC1235X4.mo1115z(abstractC0932RY);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }
}
