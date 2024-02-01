package p000a;

import java.util.Iterator;

/* renamed from: a.vl */
/* loaded from: classes.dex */
public final class C2538vl implements InterfaceC2296rE, InterfaceC0149Cv {

    /* renamed from: h */
    public final InterfaceC2296rE f7769h;

    /* renamed from: v */
    public final int f7770v;

    /* renamed from: z */
    public final /* synthetic */ int f7771z;

    public C2538vl(InterfaceC2296rE interfaceC2296rE, int i, int i2) {
        this.f7771z = i2;
        if (i2 != 1) {
            this.f7769h = interfaceC2296rE;
            this.f7770v = i;
            if (i >= 0) {
                return;
            }
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
        this.f7769h = interfaceC2296rE;
        this.f7770v = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p000a.InterfaceC0149Cv
    /* renamed from: h */
    public final InterfaceC2296rE mo22h() {
        int i = this.f7771z;
        InterfaceC2296rE interfaceC2296rE = this.f7769h;
        int i2 = this.f7770v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i3 = i2 + 30;
                if (i3 < 0) {
                    return new C2538vl(this, 30, 1);
                }
                return new C0004A4(interfaceC2296rE, i2, i3);
            default:
                if (30 >= i2) {
                    return this;
                }
                return new C2538vl(interfaceC2296rE, 30, 1);
        }
    }

    @Override // p000a.InterfaceC2296rE
    public final Iterator iterator() {
        switch (this.f7771z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C0708NM(this);
            default:
                return new C0708NM(this, 0);
        }
    }

    @Override // p000a.InterfaceC0149Cv
    /* renamed from: z */
    public final InterfaceC2296rE mo23z(int i) {
        int i2 = this.f7771z;
        InterfaceC2296rE interfaceC2296rE = this.f7769h;
        int i3 = this.f7770v;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i4 = i3 + i;
                if (i4 < 0) {
                    return new C2538vl(this, i, 0);
                }
                return new C2538vl(interfaceC2296rE, i4, 0);
            default:
                if (i >= i3) {
                    return C2304rN.f7107z;
                }
                return new C0004A4(interfaceC2296rE, i, i3);
        }
    }
}
