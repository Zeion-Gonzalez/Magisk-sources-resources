package p000a;

import android.window.BackEvent;

/* renamed from: a.kh */
/* loaded from: classes.dex */
public final class C1949kh {

    /* renamed from: z */
    public static final C1949kh f6040z = new C1949kh();

    /* renamed from: N */
    public final float m3564N(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    /* renamed from: P */
    public final float m3565P(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    /* renamed from: h */
    public final float m3566h(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    /* renamed from: v */
    public final int m3567v(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    /* renamed from: z */
    public final BackEvent m3568z(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }
}
