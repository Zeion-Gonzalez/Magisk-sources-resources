package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a.ha */
/* loaded from: classes.dex */
public final class C1786ha extends Thread {

    /* renamed from: s */
    public static final AtomicIntegerFieldUpdater f5607s = AtomicIntegerFieldUpdater.newUpdater(C1786ha.class, "workerCtl");

    /* renamed from: I */
    public long f5608I;

    /* renamed from: R */
    public final C1640ep f5609R;

    /* renamed from: S */
    public final C0439IJ f5610S;

    /* renamed from: g */
    public boolean f5611g;
    private volatile int indexInArray;

    /* renamed from: k */
    public int f5612k;
    private volatile Object nextParkedWorker;

    /* renamed from: q */
    public long f5613q;

    /* renamed from: w */
    public int f5614w;
    private volatile int workerCtl;

    /* renamed from: y */
    public final /* synthetic */ ExecutorC0289FU f5615y;

    public C1786ha(ExecutorC0289FU executorC0289FU, int i) {
        this.f5615y = executorC0289FU;
        setDaemon(true);
        this.f5610S = new C0439IJ();
        this.f5609R = new C1640ep();
        this.f5614w = 4;
        this.nextParkedWorker = ExecutorC0289FU.f1001E;
        AbstractC0226EI.f740S.getClass();
        this.f5612k = AbstractC0226EI.f739R.mo2001h().nextInt();
        m3317Q(i);
    }

    /* renamed from: N */
    public final AbstractRunnableC2453uD m3315N() {
        C1749gt c1749gt;
        int m3316P = m3316P(2);
        ExecutorC0289FU executorC0289FU = this.f5615y;
        if (m3316P == 0) {
            AbstractRunnableC2453uD abstractRunnableC2453uD = (AbstractRunnableC2453uD) executorC0289FU.f1010q.m645P();
            if (abstractRunnableC2453uD != null) {
                return abstractRunnableC2453uD;
            }
            c1749gt = executorC0289FU.f1009k;
        } else {
            AbstractRunnableC2453uD abstractRunnableC2453uD2 = (AbstractRunnableC2453uD) executorC0289FU.f1009k.m645P();
            if (abstractRunnableC2453uD2 != null) {
                return abstractRunnableC2453uD2;
            }
            c1749gt = executorC0289FU.f1010q;
        }
        return (AbstractRunnableC2453uD) c1749gt.m645P();
    }

    /* renamed from: P */
    public final int m3316P(int i) {
        int i2 = this.f5612k;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f5612k = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* renamed from: Q */
    public final void m3317Q(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5615y.f1005I);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x008e, code lost:
    
        r7 = -2;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0092, code lost:
    
        r5 = -1;
     */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.AbstractRunnableC2453uD m3318W(int r21) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1786ha.m3318W(int):a.uD");
    }

    /* renamed from: h */
    public final int m3319h() {
        return this.indexInArray;
    }

    /* renamed from: o */
    public final boolean m3320o(int i) {
        int i2 = this.f5614w;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z) {
            ExecutorC0289FU.f1003s.addAndGet(this.f5615y, 4398046511104L);
        }
        if (i2 != i) {
            this.f5614w = i;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:407:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1786ha.run():void");
    }

    /* renamed from: u */
    public final void m3321u(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* renamed from: v */
    public final Object m3322v() {
        return this.nextParkedWorker;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.AbstractRunnableC2453uD m3323z(boolean r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1786ha.m3323z(boolean):a.uD");
    }
}
