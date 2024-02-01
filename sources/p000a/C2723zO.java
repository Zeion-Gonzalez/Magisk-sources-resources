package p000a;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* renamed from: a.zO */
/* loaded from: classes.dex */
public final class C2723zO implements Closeable {

    /* renamed from: R */
    public final JarFile f8561R;

    /* renamed from: S */
    public LinkedHashMap f8562S;

    public C2723zO(File file) {
        this.f8561R = new JarFile(file, true, 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8561R.close();
    }

    /* renamed from: z */
    public final InputStream m4655z(JarEntry jarEntry) {
        C1368Zc c1368Zc;
        String name = jarEntry.getName();
        LinkedHashMap linkedHashMap = this.f8562S;
        ByteArrayInputStream byteArrayInputStream = null;
        if (linkedHashMap != null) {
            c1368Zc = (C1368Zc) linkedHashMap.get(name);
        } else {
            c1368Zc = null;
        }
        if (c1368Zc != null) {
            byteArrayInputStream = c1368Zc.f4285S.m3362G();
        }
        if (byteArrayInputStream == null) {
            return this.f8561R.getInputStream(jarEntry);
        }
        return byteArrayInputStream;
    }
}
