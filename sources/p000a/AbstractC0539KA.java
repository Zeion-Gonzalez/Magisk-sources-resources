package p000a;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a.KA */
/* loaded from: classes.dex */
public abstract class AbstractC0539KA {

    /* renamed from: h */
    public static final int f1789h;

    /* renamed from: v */
    public static final AtomicReference[] f1790v;

    /* renamed from: z */
    public static final C1740gk f1791z = new C1740gk(new byte[0], 0, 0, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1789h = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f1790v = atomicReferenceArr;
    }

    /* renamed from: h */
    public static final C1740gk m1252h() {
        AtomicReference atomicReference = f1790v[(int) (Thread.currentThread().getId() & (f1789h - 1))];
        C1740gk c1740gk = f1791z;
        C1740gk c1740gk2 = (C1740gk) atomicReference.getAndSet(c1740gk);
        if (c1740gk2 == c1740gk) {
            return new C1740gk();
        }
        if (c1740gk2 == null) {
            atomicReference.set(null);
            return new C1740gk();
        }
        atomicReference.set(c1740gk2.f5479Q);
        c1740gk2.f5479Q = null;
        c1740gk2.f5482v = 0;
        return c1740gk2;
    }

    /* renamed from: z */
    public static final void m1253z(C1740gk c1740gk) {
        boolean z;
        int i;
        if (c1740gk.f5479Q == null && c1740gk.f5481u == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (c1740gk.f5478P) {
                return;
            }
            AtomicReference atomicReference = f1790v[(int) (Thread.currentThread().getId() & (f1789h - 1))];
            C1740gk c1740gk2 = f1791z;
            C1740gk c1740gk3 = (C1740gk) atomicReference.getAndSet(c1740gk2);
            if (c1740gk3 == c1740gk2) {
                return;
            }
            if (c1740gk3 != null) {
                i = c1740gk3.f5482v;
            } else {
                i = 0;
            }
            if (i >= 65536) {
                atomicReference.set(c1740gk3);
                return;
            }
            c1740gk.f5479Q = c1740gk3;
            c1740gk.f5480h = 0;
            c1740gk.f5482v = i + 8192;
            atomicReference.set(c1740gk);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
