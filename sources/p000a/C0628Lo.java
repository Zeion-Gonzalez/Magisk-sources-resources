package p000a;

import java.io.ByteArrayOutputStream;

/* renamed from: a.Lo */
/* loaded from: classes.dex */
public final class C0628Lo {

    /* renamed from: z */
    public final byte[] f2041z = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: h */
    public final byte[] f2040h = new byte[128];

    public C0628Lo() {
        byte[] bArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            bArr = this.f2040h;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f2041z;
            if (i < bArr2.length) {
                bArr[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: z */
    public final int m1391z(byte[] bArr, int i, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr2;
        if (i < 0) {
            return 0;
        }
        byte[] bArr3 = new byte[72];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int min = Math.min(54, i2);
            int i4 = i3 + min;
            int i5 = i4 - 2;
            int i6 = 0;
            int i7 = i3;
            while (true) {
                bArr2 = this.f2041z;
                if (i7 >= i5) {
                    break;
                }
                int i8 = i7 + 1;
                byte b = bArr[i7];
                int i9 = i8 + 1;
                int i10 = bArr[i8] & 255;
                int i11 = i9 + 1;
                int i12 = bArr[i9] & 255;
                int i13 = i6 + 1;
                bArr3[i6] = bArr2[(b >>> 2) & 63];
                int i14 = i13 + 1;
                bArr3[i13] = bArr2[((b << 4) | (i10 >>> 4)) & 63];
                int i15 = i14 + 1;
                bArr3[i14] = bArr2[((i10 << 2) | (i12 >>> 6)) & 63];
                i6 = i15 + 1;
                bArr3[i15] = bArr2[i12 & 63];
                i7 = i11;
            }
            int i16 = min - (i7 - i3);
            if (i16 != 1) {
                if (i16 == 2) {
                    int i17 = bArr[i7] & 255;
                    int i18 = bArr[i7 + 1] & 255;
                    int i19 = i6 + 1;
                    bArr3[i6] = bArr2[(i17 >>> 2) & 63];
                    int i20 = i19 + 1;
                    bArr3[i19] = bArr2[((i17 << 4) | (i18 >>> 4)) & 63];
                    int i21 = i20 + 1;
                    bArr3[i20] = bArr2[(i18 << 2) & 63];
                    i6 = i21 + 1;
                    bArr3[i21] = 61;
                }
            } else {
                int i22 = bArr[i7] & 255;
                int i23 = i6 + 1;
                bArr3[i6] = bArr2[(i22 >>> 2) & 63];
                int i24 = i23 + 1;
                bArr3[i23] = bArr2[(i22 << 4) & 63];
                int i25 = i24 + 1;
                bArr3[i24] = 61;
                i6 = i25 + 1;
                bArr3[i25] = 61;
            }
            byteArrayOutputStream.write(bArr3, 0, i6 - 0);
            i2 -= min;
            i3 = i4;
        }
        return ((i + 2) / 3) * 4;
    }
}
