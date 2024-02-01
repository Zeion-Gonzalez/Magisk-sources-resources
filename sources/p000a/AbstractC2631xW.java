package p000a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: a.xW */
/* loaded from: classes.dex */
public abstract class AbstractC2631xW {

    /* renamed from: z */
    public static final C1146VR f8219z = new C1146VR(C0731Nj.f2469c);

    /* renamed from: h */
    public static final C1146VR f8218h = new C1146VR(C0731Nj.f2466J);

    /* renamed from: h */
    public static final void m4526h(File file, InputStream inputStream) {
        m4527z(inputStream, new FileOutputStream(file));
    }

    /* renamed from: z */
    public static final void m4527z(InputStream inputStream, OutputStream outputStream) {
        try {
            try {
                AbstractC0438II.m999I(inputStream, outputStream);
                AbstractC1292YB.m2659R(outputStream, null);
                AbstractC1292YB.m2659R(inputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1292YB.m2659R(inputStream, th);
                throw th2;
            }
        }
    }
}
