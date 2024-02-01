package p000a;

import java.util.regex.Pattern;

/* renamed from: a.ka */
/* loaded from: classes.dex */
public final class C1943ka extends AbstractC1449bB {

    /* renamed from: I */
    public final C2323ri f6027I;

    /* renamed from: R */
    public final String f6028R;

    /* renamed from: S */
    public final C2702z0 f6029S;

    /* renamed from: w */
    public final String f6030w;

    public C1943ka(C2702z0 c2702z0, String str, String str2) {
        this.f6029S = c2702z0;
        this.f6028R = str;
        this.f6030w = str2;
        this.f6027I = new C2323ri(new C2289r6((InterfaceC0984SS) c2702z0.f8524w.get(1), this));
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: G */
    public final InterfaceC0694N7 mo1577G() {
        return this.f6027I;
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: h */
    public final C0003A3 mo1578h() {
        String str = this.f6028R;
        if (str == null) {
            return null;
        }
        Pattern pattern = C0003A3.f64P;
        try {
            return C1710g8.m3223I(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: z */
    public final long mo1579z() {
        String str = this.f6030w;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = AbstractC1181W6.f3860z;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
