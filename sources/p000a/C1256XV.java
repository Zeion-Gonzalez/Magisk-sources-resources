package p000a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.XV */
/* loaded from: classes.dex */
public final class C1256XV implements InterfaceC1487c {

    /* renamed from: R */
    public final Object f4071R;

    /* renamed from: S */
    public final /* synthetic */ int f4072S;

    public /* synthetic */ C1256XV(int i, Object obj) {
        this.f4072S = i;
        this.f4071R = obj;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        int i = 0;
        switch (this.f4072S) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    return mo953h();
                } catch (IOException e) {
                    throw new C0367H(i, "IOException converting stream to byte array: " + e.getMessage(), e);
                }
            default:
                try {
                    return mo953h();
                } catch (IOException e2) {
                    throw new C0367H(i, "IOException converting stream to byte array: " + e2.getMessage(), e2);
                }
        }
    }

    @Override // p000a.InterfaceC1487c
    /* renamed from: P */
    public final InputStream mo1155P() {
        int i = this.f4072S;
        Object obj = this.f4071R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C1115Us((C2382so) obj);
            default:
                return (C1312YZ) obj;
        }
    }

    @Override // p000a.InterfaceC2200pR
    /* renamed from: h */
    public final AbstractC1593e mo953h() {
        int i = this.f4072S;
        Object obj = this.f4071R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C1787hb(AbstractC0438II.m1029i(new C1115Us((C2382so) obj)));
            default:
                return new C1745gp(((C1312YZ) obj).m2707h());
        }
    }
}
