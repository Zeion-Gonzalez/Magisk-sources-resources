package p000a;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: a.ZM */
/* loaded from: classes.dex */
public final class C1355ZM extends AbstractC1235X4 {

    /* renamed from: N */
    public final AbstractC1235X4 f4260N;

    /* renamed from: P */
    public final AbstractC1235X4 f4261P;

    /* renamed from: Q */
    public final AbstractC1235X4 f4262Q;

    /* renamed from: h */
    public final AbstractC1235X4 f4263h;

    /* renamed from: v */
    public final AbstractC1235X4 f4264v;

    /* renamed from: z */
    public final C0657MQ f4265z;

    public C1355ZM(C0657MQ c0657mq) {
        this.f4265z = c0657mq;
        c0657mq.getClass();
        Set set = AbstractC1167Vq.f3801z;
        this.f4263h = c0657mq.m1460z(List.class, set, null);
        this.f4264v = c0657mq.m1460z(Map.class, set, null);
        this.f4261P = c0657mq.m1460z(String.class, set, null);
        this.f4260N = c0657mq.m1460z(Double.class, set, null);
        this.f4262Q = c0657mq.m1460z(Boolean.class, set, null);
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001f, code lost:
    
        if (r1.isAssignableFrom(r0) != false) goto L21;
     */
    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1114v(p000a.AbstractC2626xP r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.mo3923h()
            r5.mo3918G()
            goto L2e
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = p000a.AbstractC1167Vq.f3801z
            r2 = 0
            a.MQ r3 = r4.f4265z
            a.X4 r0 = r3.m1460z(r0, r1, r2)
            r0.mo1114v(r5, r6)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1355ZM.mo1114v(a.xP, java.lang.Object):void");
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        int m4204s = AbstractC2441tz.m4204s(abstractC0932RY.mo2100he());
        if (m4204s == 0) {
            return this.f4263h.mo1115z(abstractC0932RY);
        }
        if (m4204s == 2) {
            return this.f4264v.mo1115z(abstractC0932RY);
        }
        if (m4204s == 5) {
            return this.f4261P.mo1115z(abstractC0932RY);
        }
        if (m4204s == 6) {
            return this.f4260N.mo1115z(abstractC0932RY);
        }
        if (m4204s == 7) {
            return this.f4262Q.mo1115z(abstractC0932RY);
        }
        if (m4204s == 8) {
            abstractC0932RY.mo2095U8();
            return null;
        }
        throw new IllegalStateException("Expected a value but was " + AbstractC2441tz.m4197f(abstractC0932RY.mo2100he()) + " at path " + abstractC0932RY.m2101od());
    }
}
