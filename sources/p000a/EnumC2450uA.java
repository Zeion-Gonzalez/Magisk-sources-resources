package p000a;

/* renamed from: a.uA */
/* loaded from: classes.dex */
public abstract class EnumC2450uA {
    /* renamed from: N */
    public static boolean m4228N(byte[] bArr, int i, int i2) {
        return bArr[i] == bArr[i2] && bArr[i + 1] == bArr[i2 + 1] && bArr[i + 2] == bArr[i2 + 2] && bArr[i + 3] == bArr[i2 + 3];
    }

    /* renamed from: P */
    public static int m4229P(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if ((((i2 + 255) - 15) / 255) + i3 + i2 + 1 > i4) {
            throw new C2389sx();
        }
        int i5 = i3 + 1;
        if (i2 >= 15) {
            bArr2[i3] = -16;
            i5 = m4232u(bArr2, i2 - 15, i5);
        } else {
            bArr2[i3] = (byte) (i2 << 4);
        }
        System.arraycopy(bArr, i, bArr2, i5, i2);
        return i5 + i2;
    }

    /* renamed from: Q */
    public static void m4230Q(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            int i5 = i + i4;
            int i6 = i2 + i4;
            for (int i7 = 0; i7 < 8; i7++) {
                try {
                    bArr2[i6 + i7] = bArr[i5 + i7];
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new C2389sx(AbstractC2441tz.m4188N("Malformed input at offset ", i));
                }
            }
        }
    }

    /* renamed from: h */
    public static int m4231h(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i5++;
        }
        return i5;
    }

    /* renamed from: u */
    public static int m4232u(byte[] bArr, int i, int i2) {
        while (i >= 255) {
            bArr[i2] = -1;
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        return i3;
    }

    /* renamed from: v */
    public static int m4233v(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int i10 = i5 + 1;
        if (i10 + i9 + 8 + (i9 >>> 8) > i6) {
            throw new C2389sx("maxDestLen is too small");
        }
        if (i9 >= 15) {
            i10 = m4232u(bArr2, i9 - 15, i10);
            i7 = -16;
        } else {
            i7 = i9 << 4;
        }
        m4230Q(i, i10, i9, bArr, bArr2);
        int i11 = i10 + i9;
        int i12 = i2 - i3;
        int i13 = i11 + 1;
        bArr2[i11] = (byte) i12;
        int i14 = i13 + 1;
        bArr2[i13] = (byte) (i12 >>> 8);
        int i15 = i4 - 4;
        if (i14 + 6 + (i15 >>> 8) > i6) {
            throw new C2389sx("maxDestLen is too small");
        }
        if (i15 >= 15) {
            i8 = i7 | 15;
            i14 = m4232u(bArr2, i15 - 15, i14);
        } else {
            i8 = i7 | i15;
        }
        bArr2[i5] = (byte) i8;
        return i14;
    }

    /* renamed from: z */
    public static int m4234z(int i, int i2, int i3, byte[] bArr) {
        int i4 = 0;
        while (i2 < i3) {
            int i5 = i + 1;
            int i6 = i2 + 1;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }
}
