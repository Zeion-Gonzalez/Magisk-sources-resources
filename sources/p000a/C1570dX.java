package p000a;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: a.dX */
/* loaded from: classes.dex */
public final class C1570dX {

    /* renamed from: P */
    public final Closeable f4834P;

    /* renamed from: h */
    public final Object f4835h;

    /* renamed from: v */
    public final Object f4836v;

    /* renamed from: z */
    public boolean f4837z;

    public C1570dX(C0073BQ c0073bq, C0175DP c0175dp) {
        C0768OK c0768ok;
        this.f4837z = false;
        this.f4835h = c0073bq;
        this.f4836v = c0175dp;
        if (c0073bq.m153P(3)) {
            if (C0525Ju.f1762Q == null) {
                C0525Ju.f1762Q = new C0525Ju(6);
            }
            ((C1710g8) ((InterfaceC0271FA) C0525Ju.f1762Q.f1764P)).getClass();
            c0768ok = new C0768OK(0);
        } else {
            c0768ok = null;
        }
        this.f4834P = c0768ok;
    }

    /* renamed from: P */
    public final InterfaceC2578wb m3035P(int i) {
        C0437IH c0437ih = (C0437IH) this.f4834P;
        synchronized (c0437ih) {
            if ((!this.f4837z) != false) {
                if (!AbstractC1292YB.m2695u(((C0878QT) this.f4835h).f3038u, this)) {
                    return new C1097Ua();
                }
                Object obj = this.f4835h;
                if (!((C0878QT) obj).f3032N) {
                    ((boolean[]) this.f4836v)[i] = true;
                }
                try {
                    return new C1840ie(((C0197Dm) c0437ih.f1437S).m382P((File) ((C0878QT) obj).f3033P.get(i)), new C1372Zg(c0437ih, 9, this));
                } catch (FileNotFoundException unused) {
                    return new C1097Ua();
                }
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: h */
    public final void m3036h() {
        Closeable closeable = this.f4834P;
        C0437IH c0437ih = (C0437IH) closeable;
        C0437IH c0437ih2 = (C0437IH) closeable;
        synchronized (c0437ih) {
            if ((!this.f4837z) != false) {
                if (AbstractC1292YB.m2695u(((C0878QT) this.f4835h).f3038u, this)) {
                    c0437ih2.m983h(this, true);
                }
                this.f4837z = true;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* renamed from: v */
    public final void m3037v() {
        Object obj = this.f4835h;
        if (AbstractC1292YB.m2695u(((C0878QT) obj).f3038u, this)) {
            Closeable closeable = this.f4834P;
            if (((C0437IH) closeable).f1443f) {
                ((C0437IH) closeable).m983h(this, false);
            } else {
                ((C0878QT) obj).f3034Q = true;
            }
        }
    }

    /* renamed from: z */
    public final void m3038z() {
        Closeable closeable = this.f4834P;
        C0437IH c0437ih = (C0437IH) closeable;
        C0437IH c0437ih2 = (C0437IH) closeable;
        synchronized (c0437ih) {
            if ((!this.f4837z) != false) {
                if (AbstractC1292YB.m2695u(((C0878QT) this.f4835h).f3038u, this)) {
                    c0437ih2.m983h(this, false);
                }
                this.f4837z = true;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public C1570dX(C0437IH c0437ih, C0878QT c0878qt) {
        boolean[] zArr;
        this.f4834P = c0437ih;
        this.f4835h = c0878qt;
        if (c0878qt.f3032N) {
            zArr = null;
        } else {
            c0437ih.getClass();
            zArr = new boolean[2];
        }
        this.f4836v = zArr;
    }
}
