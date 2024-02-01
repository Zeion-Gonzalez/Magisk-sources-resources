package p000a;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: a.Hi */
/* loaded from: classes.dex */
public final class C0406Hi {
    private volatile AtomicReferenceArray<Object> array;

    public C0406Hi(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: h */
    public final Object m909h(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: v */
    public final void m910v(int i, C1786ha c1786ha) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c1786ha);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, c1786ha);
        this.array = atomicReferenceArray2;
    }

    /* renamed from: z */
    public final int m911z() {
        return this.array.length();
    }
}
