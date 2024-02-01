package p000a;

import java.io.IOException;

/* renamed from: a.lZ */
/* loaded from: classes.dex */
public final class C1998lZ {

    /* renamed from: z */
    public final byte[] f6207z = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: h */
    public final byte[] f6206h = new byte[128];

    public C1998lZ() {
        byte[] bArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            bArr = this.f6206h;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f6207z;
            if (i < bArr2.length) {
                bArr[bArr2[i]] = (byte) i;
                i++;
            } else {
                bArr[65] = bArr[97];
                bArr[66] = bArr[98];
                bArr[67] = bArr[99];
                bArr[68] = bArr[100];
                bArr[69] = bArr[101];
                bArr[70] = bArr[102];
                return;
            }
        }
    }

    /* renamed from: z */
    public final byte[] m3623z(int i, int i2, String str) {
        if (i < 0 || i2 < 0 || i > str.length() - i2) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i2 & 1) != 0) {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i3 = i2 >>> 1;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            byte[] bArr2 = this.f6206h;
            int i6 = i5 + 1;
            int i7 = (bArr2[charAt] << 4) | bArr2[str.charAt(i5)];
            if (i7 < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            bArr[i4] = (byte) i7;
            i4++;
            i = i6;
        }
        return bArr;
    }
}
