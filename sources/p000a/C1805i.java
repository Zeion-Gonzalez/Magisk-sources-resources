package p000a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.i */
/* loaded from: classes.dex */
public final class C1805i extends ByteArrayOutputStream {
    /* renamed from: z */
    public static void m3361z(C1805i c1805i) {
        int i = ((((r0 + 4) - 1) / 4) * 4) - ((ByteArrayOutputStream) c1805i).count;
        for (int i2 = 0; i2 < i; i2++) {
            c1805i.write(0);
        }
    }

    /* renamed from: G */
    public ByteArrayInputStream m3362G() {
        return new ByteArrayInputStream(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
    }

    /* renamed from: V */
    public synchronized void m3363V(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        int i = Integer.MAX_VALUE;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, Math.min(i, 4096));
                if (read <= 0) {
                    break;
                }
                write(bArr, 0, read);
                i -= read;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public byte[] m3364h() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
