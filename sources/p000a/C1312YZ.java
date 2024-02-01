package p000a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.YZ */
/* loaded from: classes.dex */
public final class C1312YZ extends AbstractC1405aM {

    /* renamed from: q */
    public static final byte[] f4174q = new byte[0];

    /* renamed from: I */
    public int f4175I;

    /* renamed from: w */
    public final int f4176w;

    public C1312YZ(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            m2825z();
        }
        this.f4176w = i;
        this.f4175I = i;
    }

    /* renamed from: h */
    public final byte[] m2707h() {
        int i = this.f4175I;
        if (i == 0) {
            return f4174q;
        }
        int i2 = this.f4418R;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f4175I + " >= " + i2);
        }
        byte[] bArr = new byte[i];
        int m1006O = i - AbstractC0438II.m1006O(this.f4419S, bArr, i);
        this.f4175I = m1006O;
        if (m1006O == 0) {
            m2825z();
            return bArr;
        }
        throw new EOFException("DEF length " + this.f4176w + " object truncated by " + this.f4175I);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f4175I == 0) {
            return -1;
        }
        int read = this.f4419S.read();
        if (read >= 0) {
            int i = this.f4175I - 1;
            this.f4175I = i;
            if (i == 0) {
                m2825z();
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f4176w + " object truncated by " + this.f4175I);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f4175I;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f4419S.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f4175I - read;
            this.f4175I = i4;
            if (i4 == 0) {
                m2825z();
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f4176w + " object truncated by " + this.f4175I);
    }
}
