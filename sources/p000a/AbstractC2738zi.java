package p000a;

/* renamed from: a.zi */
/* loaded from: classes.dex */
public abstract class AbstractC2738zi extends AbstractC1859j1 {

    /* renamed from: k */
    public static final /* synthetic */ int f8586k = 0;

    /* renamed from: I */
    public boolean f8587I;

    /* renamed from: q */
    public C1200WR f8588q;

    /* renamed from: w */
    public long f8589w;

    /* renamed from: BO */
    public final void m4670BO(boolean z) {
        long j;
        long j2 = this.f8589w;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.f8589w = j3;
        if (j3 <= 0 && this.f8587I) {
            shutdown();
        }
    }

    /* renamed from: Lq */
    public final boolean m4671Lq() {
        Object m2482S;
        C1200WR c1200wr = this.f8588q;
        if (c1200wr == null) {
            return false;
        }
        if (c1200wr.isEmpty()) {
            m2482S = null;
        } else {
            m2482S = c1200wr.m2482S();
        }
        AbstractC0710NO abstractC0710NO = (AbstractC0710NO) m2482S;
        if (abstractC0710NO == null) {
            return false;
        }
        abstractC0710NO.run();
        return true;
    }

    /* renamed from: ZH */
    public abstract long mo643ZH();

    /* renamed from: dx */
    public final void m4672dx(boolean z) {
        long j;
        long j2 = this.f8589w;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.f8589w = j + j2;
        if (!z) {
            this.f8587I = true;
        }
    }

    /* renamed from: he */
    public abstract Thread mo3032he();

    public abstract void shutdown();
}
