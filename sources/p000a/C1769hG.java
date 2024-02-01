package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a.hG */
/* loaded from: classes.dex */
public class C1769hG {

    /* renamed from: z */
    public static final AtomicIntegerFieldUpdater f5572z = AtomicIntegerFieldUpdater.newUpdater(C1769hG.class, "_size");
    private volatile int _size;

    /* renamed from: z */
    public final int m3297z() {
        return f5572z.get(this);
    }
}
