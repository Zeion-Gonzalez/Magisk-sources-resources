package p000a;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: a.Tx */
/* loaded from: classes.dex */
public abstract class AbstractC1062Tx extends File {
    public AbstractC1062Tx(String str) {
        super(str);
    }

    /* renamed from: N */
    public abstract OutputStream mo2221N();

    /* renamed from: P */
    public abstract InputStream mo2222P();

    @Override // java.io.File
    public final File getAbsoluteFile() {
        return mo2225z(getAbsolutePath());
    }

    @Override // java.io.File
    public final File getCanonicalFile() {
        return mo2225z(getCanonicalPath());
    }

    @Override // java.io.File
    public final File getParentFile() {
        return mo2225z(getParent());
    }

    /* renamed from: h */
    public abstract AbstractC1062Tx[] mo2223h(int i);

    @Override // java.io.File
    public final File[] listFiles() {
        String[] list = list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        AbstractC1062Tx[] mo2223h = mo2223h(length);
        for (int i = 0; i < length; i++) {
            mo2223h[i] = mo2224v(list[i]);
        }
        return mo2223h;
    }

    /* renamed from: v */
    public abstract AbstractC1062Tx mo2224v(String str);

    /* renamed from: z */
    public abstract AbstractC1062Tx mo2225z(String str);

    public AbstractC1062Tx(String str, String str2) {
        super(str, str2);
    }

    @Override // java.io.File
    public final File[] listFiles(FileFilter fileFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC1062Tx mo2224v = mo2224v(str);
            if (fileFilter == null || fileFilter.accept(mo2224v)) {
                arrayList.add(mo2224v);
            }
        }
        return (AbstractC1062Tx[]) arrayList.toArray(mo2223h(0));
    }

    @Override // java.io.File
    public final File[] listFiles(FilenameFilter filenameFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (filenameFilter == null || filenameFilter.accept(this, str)) {
                arrayList.add(mo2224v(str));
            }
        }
        return (AbstractC1062Tx[]) arrayList.toArray(mo2223h(0));
    }
}
