package p000a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: a.Dm */
/* loaded from: classes.dex */
public final class C0197Dm implements InterfaceC0810P6 {
    /* renamed from: P */
    public final C0292FY m382P(File file) {
        try {
            Logger logger = AbstractC0982SQ.f3316z;
            return new C0292FY(new FileOutputStream(file, false), new C1819iG());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = AbstractC0982SQ.f3316z;
            return new C0292FY(new FileOutputStream(file, false), new C1819iG());
        }
    }

    /* renamed from: h */
    public final void m383h(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m383h(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }

    /* renamed from: v */
    public final void m384v(File file, File file2) {
        m385z(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    /* renamed from: z */
    public final void m385z(File file) {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }
}
