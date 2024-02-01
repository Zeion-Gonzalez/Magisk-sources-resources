package p000a;

/* renamed from: a.z */
/* loaded from: classes.dex */
public abstract class AbstractC2701z {

    /* renamed from: h */
    public static final byte[] f8519h;

    /* renamed from: z */
    public static final byte[] f8520z;

    static {
        C1623eY c1623eY = C1623eY.f5009I;
        f8520z = C2252qQ.m3884M("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f5011S;
        f8519h = C2252qQ.m3884M("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").f5011S;
    }

    /* renamed from: z */
    public static final String m4628z(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i9 = i + 1;
                byte b4 = bArr[i];
                byte b5 = bArr[i9];
                int i10 = i2 + 1;
                bArr3[i2] = bArr2[(b4 & 255) >> 2];
                int i11 = i10 + 1;
                bArr3[i10] = bArr2[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr3[i11] = bArr2[(b5 & 15) << 2];
                bArr3[i11 + 1] = 61;
            }
        } else {
            byte b6 = bArr[i];
            int i12 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[(b6 & 3) << 4];
            bArr3[i13] = 61;
            bArr3[i13 + 1] = 61;
        }
        return new String(bArr3, AbstractC2047ma.f6374z);
    }
}
