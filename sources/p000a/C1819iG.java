package p000a;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: a.iG */
/* loaded from: classes.dex */
public class C1819iG {

    /* renamed from: P */
    public static final C0192Dh f5685P = new C0192Dh();

    /* renamed from: h */
    public long f5686h;

    /* renamed from: v */
    public long f5687v;

    /* renamed from: z */
    public boolean f5688z;

    /* renamed from: N */
    public boolean mo3376N() {
        return this.f5688z;
    }

    /* renamed from: P */
    public C1819iG mo376P(long j) {
        this.f5688z = true;
        this.f5686h = j;
        return this;
    }

    /* renamed from: Q */
    public void mo377Q() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f5688z && this.f5686h - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: h */
    public C1819iG mo3377h() {
        this.f5687v = 0L;
        return this;
    }

    /* renamed from: u */
    public C1819iG mo378u(long j, TimeUnit timeUnit) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5687v = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("timeout < 0: ", j).toString());
    }

    /* renamed from: v */
    public long mo3378v() {
        if (this.f5688z) {
            return this.f5686h;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: z */
    public C1819iG mo3379z() {
        this.f5688z = false;
        return this;
    }
}
