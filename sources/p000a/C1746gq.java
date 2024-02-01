package p000a;

import java.lang.reflect.Type;

/* renamed from: a.gq */
/* loaded from: classes.dex */
public final class C1746gq implements InterfaceC0792Om {

    /* renamed from: R */
    public final Type f5513R;

    /* renamed from: S */
    public final /* synthetic */ int f5514S;

    public /* synthetic */ C1746gq(int i, Type type) {
        this.f5514S = i;
        this.f5513R = type;
    }

    @Override // p000a.InterfaceC0792Om
    /* renamed from: P */
    public final /* bridge */ /* synthetic */ Object mo1799P(C2139oL c2139oL) {
        switch (this.f5514S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m3278z(c2139oL);
            default:
                return m3278z(c2139oL);
        }
    }

    @Override // p000a.InterfaceC0792Om
    /* renamed from: h */
    public final Type mo1800h() {
        return this.f5513R;
    }

    /* renamed from: z */
    public final C2468uV m3278z(C2139oL c2139oL) {
        switch (this.f5514S) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2468uV c2468uV = new C2468uV(c2139oL);
                c2139oL.mo1686h(new C1361ZT(this, 0, c2468uV));
                return c2468uV;
            default:
                C2468uV c2468uV2 = new C2468uV(c2139oL);
                c2139oL.mo1686h(new C1361ZT(this, 1, c2468uV2));
                return c2468uV2;
        }
    }
}
