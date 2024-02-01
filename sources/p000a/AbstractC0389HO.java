package p000a;

/* renamed from: a.HO */
/* loaded from: classes.dex */
public abstract class AbstractC0389HO {

    /* renamed from: h */
    public static final byte[] f1310h;

    /* renamed from: z */
    public static final short[] f1311z = new short[128];

    static {
        byte[] bArr = new byte[112];
        f1310h = bArr;
        byte[] bArr2 = new byte[128];
        m877z(bArr2, 0, 15, (byte) 1);
        m877z(bArr2, 16, 31, (byte) 2);
        m877z(bArr2, 32, 63, (byte) 3);
        m877z(bArr2, 64, 65, (byte) 0);
        m877z(bArr2, 66, 95, (byte) 4);
        m877z(bArr2, 96, 96, (byte) 5);
        m877z(bArr2, 97, 108, (byte) 6);
        m877z(bArr2, 109, 109, (byte) 7);
        m877z(bArr2, 110, 111, (byte) 6);
        m877z(bArr2, 112, 112, (byte) 8);
        m877z(bArr2, 113, 115, (byte) 9);
        m877z(bArr2, 116, 116, (byte) 10);
        m877z(bArr2, 117, 127, (byte) 0);
        m877z(bArr, 0, bArr.length - 1, (byte) -2);
        m877z(bArr, 8, 11, (byte) -1);
        m877z(bArr, 24, 27, (byte) 0);
        m877z(bArr, 40, 43, (byte) 16);
        m877z(bArr, 58, 59, (byte) 0);
        m877z(bArr, 72, 73, (byte) 0);
        m877z(bArr, 89, 91, (byte) 16);
        m877z(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            f1311z[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    /* renamed from: z */
    public static void m877z(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
