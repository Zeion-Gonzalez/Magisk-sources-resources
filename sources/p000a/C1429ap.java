package p000a;

import java.io.Closeable;

/* renamed from: a.ap */
/* loaded from: classes.dex */
public final class C1429ap implements Closeable {

    /* renamed from: E */
    public final long f4464E;

    /* renamed from: I */
    public final int f4465I;

    /* renamed from: R */
    public final EnumC1854ix f4466R;

    /* renamed from: S */
    public final C1364ZX f4467S;

    /* renamed from: U */
    public final C1429ap f4468U;

    /* renamed from: Y */
    public C1755gz f4469Y;

    /* renamed from: f */
    public final long f4470f;

    /* renamed from: g */
    public final AbstractC1449bB f4471g;

    /* renamed from: k */
    public final C1494c7 f4472k;

    /* renamed from: q */
    public final C2254qS f4473q;

    /* renamed from: r */
    public final C0998Si f4474r;

    /* renamed from: s */
    public final C1429ap f4475s;

    /* renamed from: w */
    public final String f4476w;

    /* renamed from: y */
    public final C1429ap f4477y;

    public C1429ap(C1364ZX c1364zx, EnumC1854ix enumC1854ix, String str, int i, C2254qS c2254qS, C1494c7 c1494c7, AbstractC1449bB abstractC1449bB, C1429ap c1429ap, C1429ap c1429ap2, C1429ap c1429ap3, long j, long j2, C0998Si c0998Si) {
        this.f4467S = c1364zx;
        this.f4466R = enumC1854ix;
        this.f4476w = str;
        this.f4465I = i;
        this.f4473q = c2254qS;
        this.f4472k = c1494c7;
        this.f4471g = abstractC1449bB;
        this.f4477y = c1429ap;
        this.f4475s = c1429ap2;
        this.f4468U = c1429ap3;
        this.f4464E = j;
        this.f4470f = j2;
        this.f4474r = c0998Si;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC1449bB abstractC1449bB = this.f4471g;
        if (abstractC1449bB == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        abstractC1449bB.close();
    }

    /* renamed from: h */
    public final boolean m2858h() {
        int i = this.f4465I;
        return 200 <= i && i < 300;
    }

    public final String toString() {
        return "Response{protocol=" + this.f4466R + ", code=" + this.f4465I + ", message=" + this.f4476w + ", url=" + ((C2658y7) this.f4467S.f4279h) + '}';
    }

    /* renamed from: z */
    public final C1755gz m2859z() {
        C1755gz c1755gz = this.f4469Y;
        if (c1755gz != null) {
            return c1755gz;
        }
        int i = C1755gz.f5531R;
        C1755gz m95N = C0054B3.m95N(this.f4472k);
        this.f4469Y = m95N;
        return m95N;
    }
}
