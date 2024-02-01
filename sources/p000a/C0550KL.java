package p000a;

/* renamed from: a.KL */
/* loaded from: classes.dex */
public final class C0550KL extends AbstractC1500cH {
    public C0550KL() {
        super(9);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: R */
    public final int mo1261R(int i, int i2, byte[] bArr) {
        int i3;
        int rotateLeft;
        int i4 = 0;
        EnumC2649xy.m4548z(bArr, 0, i);
        int i5 = 0 + i;
        if (i >= 16) {
            int i6 = i5 - 16;
            int i7 = (i2 - 1640531535) - 2048144777;
            int i8 = i2 - 2048144777;
            int i9 = i2 + 0;
            int i10 = i2 - (-1640531535);
            while (true) {
                rotateLeft = Integer.rotateLeft((EnumC2649xy.m4547v(i4, bArr) * (-2048144777)) + i7, 13) * (-1640531535);
                int i11 = i4 + 4;
                i8 = Integer.rotateLeft((EnumC2649xy.m4547v(i11, bArr) * (-2048144777)) + i8, 13) * (-1640531535);
                int i12 = i11 + 4;
                i9 = Integer.rotateLeft((EnumC2649xy.m4547v(i12, bArr) * (-2048144777)) + i9, 13) * (-1640531535);
                int i13 = i12 + 4;
                i10 = Integer.rotateLeft((EnumC2649xy.m4547v(i13, bArr) * (-2048144777)) + i10, 13) * (-1640531535);
                i4 = i13 + 4;
                if (i4 > i6) {
                    break;
                }
                i7 = rotateLeft;
            }
            i3 = Integer.rotateLeft(i10, 18) + Integer.rotateLeft(i9, 12) + Integer.rotateLeft(i8, 7) + Integer.rotateLeft(rotateLeft, 1);
        } else {
            i3 = i2 + 374761393;
        }
        int i14 = i3 + i;
        while (i4 <= i5 - 4) {
            i14 = 668265263 * Integer.rotateLeft((EnumC2649xy.m4547v(i4, bArr) * (-1028477379)) + i14, 17);
            i4 += 4;
        }
        while (i4 < i5) {
            i14 = Integer.rotateLeft(((bArr[i4] & 255) * 374761393) + i14, 11) * (-1640531535);
            i4++;
        }
        int i15 = ((i14 >>> 15) ^ i14) * (-2048144777);
        int i16 = (i15 ^ (i15 >>> 13)) * (-1028477379);
        return i16 ^ (i16 >>> 16);
    }
}
