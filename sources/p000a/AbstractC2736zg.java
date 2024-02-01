package p000a;

import java.io.ByteArrayOutputStream;

/* renamed from: a.zg */
/* loaded from: classes.dex */
public abstract class AbstractC2736zg {

    /* renamed from: z */
    public static final C0628Lo f8583z = new C0628Lo();

    /* renamed from: z */
    public static byte[] m4669z(byte[] bArr) {
        int length = bArr.length;
        C0628Lo c0628Lo = f8583z;
        c0628Lo.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            c0628Lo.m1391z(bArr, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C0367H(2, "exception encoding base64 string: " + e.getMessage(), e);
        }
    }
}
