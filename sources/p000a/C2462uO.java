package p000a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* renamed from: a.uO */
/* loaded from: classes.dex */
public final class C2462uO extends FilterInputStream {

    /* renamed from: E */
    public boolean f7546E;

    /* renamed from: I */
    public final ByteBuffer f7547I;

    /* renamed from: R */
    public final AbstractC1500cH f7548R;

    /* renamed from: S */
    public final AbstractC2703z2 f7549S;

    /* renamed from: U */
    public long f7550U;

    /* renamed from: f */
    public C1570dX f7551f;

    /* renamed from: g */
    public byte[] f7552g;

    /* renamed from: k */
    public ByteBuffer f7553k;

    /* renamed from: q */
    public byte[] f7554q;

    /* renamed from: r */
    public final ByteBuffer f7555r;

    /* renamed from: s */
    public long f7556s;

    /* renamed from: w */
    public final byte[] f7557w;

    /* renamed from: y */
    public int f7558y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2462uO(InputStream inputStream) {
        super(inputStream);
        if (C1203WU.f3910Q == null) {
            C1203WU.f3910Q = new C1203WU(1);
        }
        AbstractC2703z2 abstractC2703z2 = (AbstractC2703z2) C1203WU.f3910Q.f3912P;
        if (C0525Ju.f1762Q == null) {
            C0525Ju.f1762Q = new C0525Ju(6);
        }
        AbstractC1500cH abstractC1500cH = (AbstractC1500cH) C0525Ju.f1762Q.f1765h;
        byte[] bArr = new byte[15];
        this.f7557w = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f7547I = wrap.order(byteOrder);
        this.f7553k = null;
        this.f7552g = null;
        this.f7558y = -1;
        this.f7556s = -1L;
        this.f7550U = 0L;
        this.f7546E = false;
        this.f7551f = null;
        this.f7555r = ByteBuffer.allocate(8).order(byteOrder);
        this.f7549S = abstractC2703z2;
        this.f7548R = abstractC1500cH;
    }

    /* renamed from: G */
    public final int m4241G(InputStream inputStream) {
        ByteBuffer byteBuffer;
        int i = 0;
        do {
            byteBuffer = this.f7555r;
            int read = inputStream.read(byteBuffer.array(), i, 4 - i);
            if (read < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i += read;
        } while (i < 4);
        return byteBuffer.getInt(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return this.f7553k.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    /* renamed from: h */
    public final void m4242h() {
        boolean z;
        byte[] bArr;
        int m4241G = m4241G(((FilterInputStream) this).in);
        if ((Integer.MIN_VALUE & m4241G) == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = m4241G & Integer.MAX_VALUE;
        if (i == 0) {
            if (((C0073BQ) this.f7551f.f4835h).m153P(3) && m4241G(((FilterInputStream) this).in) != ((AbstractC0845Pm) this.f7551f.f4834P).mo1776z()) {
                throw new IOException("Content checksum mismatch");
            }
            if (((C0073BQ) this.f7551f.f4835h).m153P(4) && this.f7556s != this.f7550U) {
                throw new IOException("Size check mismatch");
            }
            this.f7551f.f4837z = true;
            return;
        }
        if (z) {
            bArr = this.f7554q;
        } else {
            bArr = this.f7552g;
        }
        if (i <= this.f7558y) {
            int i2 = 0;
            while (i2 < i) {
                int read = ((FilterInputStream) this).in.read(bArr, i2, i - i2);
                if (read >= 0) {
                    i2 += read;
                } else {
                    throw new IOException("Stream ended prematurely");
                }
            }
            if (((C0073BQ) this.f7551f.f4835h).m153P(5) && m4241G(((FilterInputStream) this).in) != this.f7548R.mo1261R(i, 0, bArr)) {
                throw new IOException("Block checksum mismatch");
            }
            if (z) {
                try {
                    AbstractC2703z2 abstractC2703z2 = this.f7549S;
                    byte[] bArr2 = this.f7552g;
                    i = abstractC2703z2.mo2031he(bArr, i, bArr2, bArr2.length);
                } catch (C2389sx e) {
                    throw new IOException(e);
                }
            }
            if (((C0073BQ) this.f7551f.f4835h).m153P(3)) {
                ((AbstractC0845Pm) this.f7551f.f4834P).mo1775G(this.f7552g, i);
            }
            this.f7550U += i;
            this.f7553k.limit(i);
            this.f7553k.rewind();
            return;
        }
        throw new IOException(String.format(Locale.ROOT, "Block size %s exceeded max: %s", Integer.valueOf(i), Integer.valueOf(this.f7558y)));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        while (true) {
            if (this.f7546E && this.f7553k.remaining() != 0) {
                return this.f7553k.get() & 255;
            }
            if ((!this.f7546E || this.f7551f.f4837z) && !m4243z()) {
                return -1;
            }
            m4242h();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new UnsupportedOperationException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        while (true) {
            if (this.f7546E && this.f7553k.remaining() != 0) {
                long min = Math.min(j, this.f7553k.remaining());
                ByteBuffer byteBuffer = this.f7553k;
                byteBuffer.position(byteBuffer.position() + ((int) min));
                return min;
            }
            if ((!this.f7546E || this.f7551f.f4837z) && !m4243z()) {
                return 0L;
            }
            m4242h();
        }
    }

    /* renamed from: z */
    public final boolean m4243z() {
        EnumC1603eB enumC1603eB;
        ByteBuffer byteBuffer;
        while (true) {
            int i = 0;
            do {
                int read = ((FilterInputStream) this).in.read(this.f7555r.array(), i, 4 - i);
                if (read < 0) {
                    return false;
                }
                i += read;
            } while (i < 4);
            int i2 = this.f7555r.getInt(0);
            if (i2 == 407708164) {
                this.f7547I.rewind();
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 >= 0) {
                    int read3 = ((FilterInputStream) this).in.read();
                    if (read3 >= 0) {
                        byte b = (byte) (read2 & 255);
                        byte b2 = (byte) (b & 192);
                        C0073BQ c0073bq = new C0073BQ((byte) (b2 ^ b), b2 >>> 6);
                        this.f7547I.put(b);
                        byte b3 = (byte) (read3 & 255);
                        int i3 = (b3 >>> 4) & 7;
                        if ((b3 & 143) <= 0) {
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    if (i3 != 6) {
                                        if (i3 == 7) {
                                            enumC1603eB = EnumC1603eB.f4920q;
                                        } else {
                                            throw new IllegalArgumentException(String.format(Locale.ROOT, "Block size must be 4-7. Cannot use value of [%d]", Integer.valueOf(i3)));
                                        }
                                    } else {
                                        enumC1603eB = EnumC1603eB.f4918I;
                                    }
                                } else {
                                    enumC1603eB = EnumC1603eB.f4921w;
                                }
                            } else {
                                enumC1603eB = EnumC1603eB.f4919R;
                            }
                            C0175DP c0175dp = new C0175DP(2, enumC1603eB);
                            this.f7547I.put(b3);
                            this.f7551f = new C1570dX(c0073bq, c0175dp);
                            if (c0073bq.m153P(4)) {
                                InputStream inputStream = ((FilterInputStream) this).in;
                                int i4 = 0;
                                do {
                                    byteBuffer = this.f7555r;
                                    int read4 = inputStream.read(byteBuffer.array(), i4, 8 - i4);
                                    if (read4 >= 0) {
                                        i4 += read4;
                                    } else {
                                        throw new IOException("Stream ended prematurely");
                                    }
                                } while (i4 < 8);
                                long j = byteBuffer.getLong(0);
                                this.f7556s = j;
                                this.f7547I.putLong(j);
                            }
                            this.f7550U = 0L;
                            byte mo1261R = (byte) ((this.f7548R.mo1261R(this.f7547I.position(), 0, this.f7557w) >> 8) & 255);
                            int read5 = ((FilterInputStream) this).in.read();
                            if (read5 >= 0) {
                                if (mo1261R == ((byte) (read5 & 255))) {
                                    int i5 = 1 << ((((EnumC1603eB) ((C0175DP) this.f7551f.f4836v).f541R).f4922S * 2) + 8);
                                    this.f7558y = i5;
                                    this.f7554q = new byte[i5];
                                    byte[] bArr = new byte[i5];
                                    this.f7552g = bArr;
                                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                    this.f7553k = wrap;
                                    wrap.limit(0);
                                    this.f7546E = true;
                                    return true;
                                }
                                throw new IOException("Stream frame descriptor corrupted");
                            }
                            throw new IOException("Stream ended prematurely");
                        }
                        throw new RuntimeException("Reserved fields must be 0");
                    }
                    throw new IOException("Stream ended prematurely");
                }
                throw new IOException("Stream ended prematurely");
            }
            if ((i2 >>> 4) == 25481893) {
                int m4241G = m4241G(((FilterInputStream) this).in);
                byte[] bArr2 = new byte[1024];
                while (m4241G > 0) {
                    int read6 = ((FilterInputStream) this).in.read(bArr2, 0, Math.min(m4241G, 1024));
                    if (read6 >= 0) {
                        m4241G -= read6;
                    } else {
                        throw new IOException("Stream ended prematurely");
                    }
                }
            } else {
                throw new IOException("Stream unsupported");
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (true) {
            if (this.f7546E && this.f7553k.remaining() != 0) {
                int min = Math.min(i2, this.f7553k.remaining());
                this.f7553k.get(bArr, i, min);
                return min;
            }
            if ((!this.f7546E || this.f7551f.f4837z) && !m4243z()) {
                return -1;
            }
            m4242h();
        }
    }
}
