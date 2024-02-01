package p000a;

import android.os.CountDownTimer;

/* renamed from: a.iA */
/* loaded from: classes.dex */
public final class CountDownTimerC1813iA extends CountDownTimer {

    /* renamed from: h */
    public final /* synthetic */ C1885jV f5679h;

    /* renamed from: z */
    public final long f5680z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1813iA(C1885jV c1885jV, long j) {
        super(j, 1000L);
        this.f5679h = c1885jV;
        this.f5680z = j;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C1885jV c1885jV = this.f5679h;
        C2521vQ c2521vQ = c1885jV.f5889U;
        if (c2521vQ.f7720h != 0) {
            c2521vQ.f7720h = 0;
            c2521vQ.f7721v.mo1709Q(7);
        }
        c1885jV.m3506I(1);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        C1885jV c1885jV = this.f5679h;
        boolean z = c1885jV.f5892f;
        if (!z && j <= this.f5680z - 1000 && !z) {
            c1885jV.f5892f = true;
            AbstractC0795Op.m1801B(c1885jV, 13);
        }
        int i = ((int) (j / 1000)) + 1;
        C2521vQ c2521vQ = c1885jV.f5889U;
        if (c2521vQ.f7720h != i) {
            c2521vQ.f7720h = i;
            c2521vQ.f7721v.mo1709Q(7);
        }
    }
}
