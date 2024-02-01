package p000a;

import java.nio.ByteOrder;

/* renamed from: a.xy */
/* loaded from: classes.dex */
public abstract class EnumC2649xy {
    /* renamed from: P */
    public static long m4545P(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: h */
    public static int m4546h(int i, byte[] bArr) {
        if (EnumC0798Ou.f2724S == ByteOrder.BIG_ENDIAN) {
            return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        }
        return m4547v(i, bArr);
    }

    /* renamed from: v */
    public static int m4547v(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: z */
    public static void m4548z(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            if (i2 > 0) {
                if (i >= 0 && i < bArr.length) {
                    int i3 = (i + i2) - 1;
                    if (i3 < 0 || i3 >= bArr.length) {
                        throw new ArrayIndexOutOfBoundsException(i3);
                    }
                    return;
                }
                throw new ArrayIndexOutOfBoundsException(i);
            }
            return;
        }
        throw new IllegalArgumentException("lengths must be >= 0");
    }
}
