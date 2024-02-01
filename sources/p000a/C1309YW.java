package p000a;

import java.io.InputStream;

/* renamed from: a.YW */
/* loaded from: classes.dex */
public final class C1309YW extends C1837ia {

    /* renamed from: I */
    public final boolean f4169I;

    public C1309YW(int i, int i2, boolean z, C2382so c2382so) {
        super(i, i2, c2382so);
        this.f4169I = z;
    }

    @Override // p000a.C1837ia, p000a.InterfaceC2200pR
    /* renamed from: h */
    public final AbstractC1593e mo953h() {
        int i = this.f5737S;
        int i2 = this.f5736R;
        boolean z = this.f4169I;
        C2382so c2382so = this.f5738w;
        if (!z) {
            return new C1524cl(4, i, i2, new C1745gp(((C1312YZ) ((InputStream) c2382so.f7314h)).m2707h()), 1);
        }
        return AbstractC1857j.m3473y(i, i2, c2382so.m4107o());
    }
}
