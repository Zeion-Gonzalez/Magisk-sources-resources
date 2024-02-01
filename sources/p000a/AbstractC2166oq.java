package p000a;

import java.io.ByteArrayOutputStream;

/* renamed from: a.oq */
/* loaded from: classes.dex */
public abstract class AbstractC2166oq {

    /* renamed from: z */
    public static final C1998lZ f6640z = new C1998lZ();

    /* renamed from: z */
    public static byte[] m3778z(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C1998lZ c1998lZ = f6640z;
            c1998lZ.getClass();
            if (i >= 0) {
                byte[] bArr2 = new byte[72];
                int i2 = 0;
                while (i > 0) {
                    int min = Math.min(36, i);
                    int i3 = min + i2;
                    int i4 = 0;
                    while (i2 < i3) {
                        int i5 = i2 + 1;
                        int i6 = bArr[i2] & 255;
                        int i7 = i4 + 1;
                        byte[] bArr3 = c1998lZ.f6207z;
                        bArr2[i4] = bArr3[i6 >>> 4];
                        i4 = i7 + 1;
                        bArr2[i7] = bArr3[i6 & 15];
                        i2 = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4 + 0);
                    i -= min;
                    i2 = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C0367H(2, "exception encoding Hex string: " + e.getMessage(), e);
        }
    }
}
