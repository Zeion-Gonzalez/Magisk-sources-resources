package p000a;

import java.util.Iterator;

/* renamed from: a.A4 */
/* loaded from: classes.dex */
public final class C0004A4 implements InterfaceC2296rE, InterfaceC0149Cv {

    /* renamed from: h */
    public final int f68h;

    /* renamed from: v */
    public final int f69v;

    /* renamed from: z */
    public final InterfaceC2296rE f70z;

    public C0004A4(InterfaceC2296rE interfaceC2296rE, int i, int i2) {
        boolean z;
        boolean z2;
        this.f70z = interfaceC2296rE;
        this.f68h = i;
        this.f69v = i2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 >= i) {
                    return;
                }
                throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("endIndex should be non-negative, but is ", i2).toString());
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4188N("startIndex should be non-negative, but is ", i).toString());
    }

    @Override // p000a.InterfaceC0149Cv
    /* renamed from: h */
    public final InterfaceC2296rE mo22h() {
        int i = this.f69v;
        int i2 = this.f68h;
        if (30 >= i - i2) {
            return this;
        }
        return new C0004A4(this.f70z, i2, 30 + i2);
    }

    @Override // p000a.InterfaceC2296rE
    public final Iterator iterator() {
        return new C0155D0(this);
    }

    @Override // p000a.InterfaceC0149Cv
    /* renamed from: z */
    public final InterfaceC2296rE mo23z(int i) {
        int i2 = this.f69v;
        int i3 = this.f68h;
        if (i >= i2 - i3) {
            return C2304rN.f7107z;
        }
        return new C0004A4(this.f70z, i3 + i, i2);
    }
}
