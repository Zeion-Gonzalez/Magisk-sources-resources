package p000a;

import java.io.Closeable;

/* renamed from: a.Pm */
/* loaded from: classes.dex */
public abstract class AbstractC0845Pm implements Closeable {

    /* renamed from: I */
    public int f2849I;

    /* renamed from: R */
    public int f2850R;

    /* renamed from: S */
    public final int f2851S;

    /* renamed from: q */
    public int f2854q;

    /* renamed from: w */
    public int f2855w;

    /* renamed from: y */
    public final byte[] f2856y = new byte[16];

    /* renamed from: g */
    public long f2852g = 0;

    /* renamed from: k */
    public int f2853k = 0;

    public AbstractC0845Pm(int i) {
        this.f2851S = i;
        this.f2850R = (i - 1640531535) - 2048144777;
        this.f2855w = (-2048144777) + i;
        this.f2849I = i + 0;
        this.f2854q = i - (-1640531535);
    }

    /* renamed from: G */
    public abstract void mo1775G(byte[] bArr, int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* bridge */ /* synthetic */ void close() {
    }

    /* renamed from: h */
    public final String toString() {
        return getClass().getSimpleName() + "(seed=" + this.f2851S + ")";
    }

    /* renamed from: z */
    public abstract int mo1776z();
}
