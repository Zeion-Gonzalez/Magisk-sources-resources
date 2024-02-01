package p000a;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: a.xi */
/* loaded from: classes.dex */
public final class C2638xi {

    /* renamed from: N */
    public File f8225N;

    /* renamed from: P */
    public final File f8226P = new File(AbstractC1743gn.m3275z().getCacheDir(), "flash");

    /* renamed from: h */
    public final List f8227h;

    /* renamed from: v */
    public final List f8228v;

    /* renamed from: z */
    public final Uri f8229z;

    public C2638xi(Uri uri, C2735zf c2735zf, List list) {
        this.f8229z = uri;
        this.f8227h = c2735zf;
        this.f8228v = list;
    }

    /* renamed from: z */
    public static final boolean m4539z(C2638xi c2638xi) {
        File file;
        String str;
        Object c1019t6;
        BufferedInputStream bufferedInputStream;
        File file2 = c2638xi.f8226P;
        AbstractC1658fB.m3133ZH(file2);
        file2.mkdirs();
        Uri uri = c2638xi.f8229z;
        boolean m2695u = AbstractC1292YB.m2695u(uri.getScheme(), "file");
        List list = c2638xi.f8227h;
        if (m2695u) {
            file = AbstractC2575wW.m4427dG(uri);
        } else {
            file = new File(file2, "install.zip");
            list.add("- Copying zip to temp directory");
            try {
                InputStream openInputStream = AbstractC1743gn.m3275z().getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    AbstractC2631xW.m4526h(file, openInputStream);
                } else {
                    throw new FileNotFoundException();
                }
            } catch (IOException e) {
                if (e instanceof FileNotFoundException) {
                    str = "! Invalid Uri";
                } else {
                    str = "! Cannot copy to cache";
                }
                list.add(str);
                throw e;
            }
        }
        c2638xi.f8225N = file;
        File file3 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream instanceof BufferedInputStream) {
                bufferedInputStream = (BufferedInputStream) fileInputStream;
            } else {
                bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
            }
            try {
                AbstractC0795Op.m1808EQ(bufferedInputStream, file2);
                AbstractC1292YB.m2659R(bufferedInputStream, null);
                c1019t6 = Boolean.valueOf(AbstractC1269Xn.m2591nB(AbstractC1292YB.m2643D(new File(file2, "updater-script")), "#MAGISK", false));
            } finally {
            }
        } catch (Throwable th) {
            c1019t6 = new C1019T6(th);
        }
        Throwable m4677z = AbstractC2740zk.m4677z(c1019t6);
        if (m4677z == null) {
            if (!((Boolean) c1019t6).booleanValue()) {
                list.add("! This zip is not a Magisk module!");
                return false;
            }
            list.add("- Installing ".concat(AbstractC1843ih.m3409H(uri)));
            String[] strArr = new String[1];
            File file4 = c2638xi.f8225N;
            if (file4 != null) {
                file3 = file4;
            }
            strArr[0] = "sh " + file2 + "/update-binary dummy 1 '" + file3 + "'";
            C0357Gq m44z = AbstractC0017AI.m44z(strArr);
            m44z.f1418I = list;
            m44z.f1421q = c2638xi.f8228v;
            return m44z.mo781dx().m3380z();
        }
        list.add("! Unzip error");
        throw m4677z;
    }
}
