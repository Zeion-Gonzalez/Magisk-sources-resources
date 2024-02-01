package p000a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: a.c6 */
/* loaded from: classes.dex */
public final class C1493c6 {

    /* renamed from: N */
    public int f4632N;

    /* renamed from: P */
    public int f4633P;

    /* renamed from: h */
    public final long f4634h;

    /* renamed from: v */
    public final TimeInterpolator f4635v;

    /* renamed from: z */
    public final long f4636z;

    public C1493c6(long j) {
        this.f4636z = 0L;
        this.f4634h = 300L;
        this.f4635v = null;
        this.f4633P = 0;
        this.f4632N = 1;
        this.f4636z = j;
        this.f4634h = 150L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1493c6)) {
            return false;
        }
        C1493c6 c1493c6 = (C1493c6) obj;
        if (this.f4636z != c1493c6.f4636z || this.f4634h != c1493c6.f4634h || this.f4633P != c1493c6.f4633P || this.f4632N != c1493c6.f4632N) {
            return false;
        }
        return m2892h().getClass().equals(c1493c6.m2892h().getClass());
    }

    /* renamed from: h */
    public final TimeInterpolator m2892h() {
        TimeInterpolator timeInterpolator = this.f4635v;
        return timeInterpolator != null ? timeInterpolator : AbstractC1090US.f3562h;
    }

    public final int hashCode() {
        long j = this.f4636z;
        long j2 = this.f4634h;
        return ((((m2892h().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f4633P) * 31) + this.f4632N;
    }

    public final String toString() {
        return "\n" + C1493c6.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4636z + " duration: " + this.f4634h + " interpolator: " + m2892h().getClass() + " repeatCount: " + this.f4633P + " repeatMode: " + this.f4632N + "}\n";
    }

    /* renamed from: z */
    public final void m2893z(Animator animator) {
        animator.setStartDelay(this.f4636z);
        animator.setDuration(this.f4634h);
        animator.setInterpolator(m2892h());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f4633P);
            valueAnimator.setRepeatMode(this.f4632N);
        }
    }

    public C1493c6(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f4636z = 0L;
        this.f4634h = 300L;
        this.f4635v = null;
        this.f4633P = 0;
        this.f4632N = 1;
        this.f4636z = j;
        this.f4634h = j2;
        this.f4635v = timeInterpolator;
    }
}
