package p000a;

import java.util.regex.Pattern;

/* renamed from: a.Mq */
/* loaded from: classes.dex */
public final class C0679Mq extends AbstractC1449bB {

    /* renamed from: I */
    public final Object f2236I;

    /* renamed from: R */
    public final long f2237R;

    /* renamed from: S */
    public final /* synthetic */ int f2238S = 0;

    /* renamed from: w */
    public final InterfaceC0694N7 f2239w;

    public C0679Mq(C0003A3 c0003a3, long j, C2361sQ c2361sQ) {
        this.f2236I = c0003a3;
        this.f2237R = j;
        this.f2239w = c2361sQ;
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: G */
    public final InterfaceC0694N7 mo1577G() {
        return this.f2239w;
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: h */
    public final C0003A3 mo1578h() {
        int i = this.f2238S;
        Object obj = this.f2236I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (C0003A3) obj;
            default:
                String str = (String) obj;
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
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: z */
    public final long mo1579z() {
        return this.f2237R;
    }

    public C0679Mq(String str, long j, C2323ri c2323ri) {
        this.f2236I = str;
        this.f2237R = j;
        this.f2239w = c2323ri;
    }
}
