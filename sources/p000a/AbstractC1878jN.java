package p000a;

import java.io.ByteArrayOutputStream;
import java.security.AccessController;

/* renamed from: a.jN */
/* loaded from: classes.dex */
public abstract class AbstractC1878jN {

    /* renamed from: z */
    public static final /* synthetic */ int f5861z = 0;

    static {
        try {
            try {
                String str = (String) AccessController.doPrivileged(new C2530vc());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            String.format("%n", new Object[0]);
        }
    }

    /* renamed from: N */
    public static String m3495N(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public static void m3496P(char[] cArr, ByteArrayOutputStream byteArrayOutputStream) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (i5 < cArr.length) {
            char c = cArr[i5];
            if (c >= 128) {
                if (c < 2048) {
                    i3 = (c >> 6) | 192;
                    i4 = c;
                } else {
                    if (c < 55296 || c > 57343) {
                        i = (c >> 12) | 224;
                        i2 = c;
                    } else {
                        i5++;
                        if (i5 >= cArr.length) {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                        char c2 = cArr[i5];
                        if (c > 56319) {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                        int i6 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                        byteArrayOutputStream.write((i6 >> 18) | 240);
                        i = ((i6 >> 12) & 63) | 128;
                        i2 = i6;
                    }
                    byteArrayOutputStream.write(i);
                    i3 = ((i2 >> 6) & 63) | 128;
                    i4 = i2;
                }
                byteArrayOutputStream.write(i3);
                c = (i4 & 63) | 128;
            }
            byteArrayOutputStream.write(c);
            i5++;
        }
    }

    /* renamed from: h */
    public static byte[] m3497h(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* renamed from: v */
    public static String m3498v(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* renamed from: z */
    public static String m3499z(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }
}
