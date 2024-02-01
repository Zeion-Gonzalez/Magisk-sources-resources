package com.topjohnwu.magisk.core.download;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import p000a.AbstractC0037Al;
import p000a.AbstractC0164DB;
import p000a.AbstractC0438II;
import p000a.AbstractC0795Op;
import p000a.AbstractC1292YB;
import p000a.AbstractC1684fg;
import p000a.AbstractC1743gn;
import p000a.AbstractC1843ih;
import p000a.AbstractC2047ma;
import p000a.AbstractC2575wW;
import p000a.AbstractC2631xW;
import p000a.AbstractServiceC1020T7;
import p000a.C0329GJ;
import p000a.C0687N;
import p000a.C0731Nj;
import p000a.C0858Q;
import p000a.C1408aR;
import p000a.C1710g8;
import p000a.C1852is;
import p000a.C1886jW;
import p000a.C1910jw;
import p000a.C1980lF;
import p000a.C2232q4;
import p000a.C2489uv;
import p000a.C2642xo;
import p000a.C2670yQ;
import p000a.ExecutorC0094Bp;

/* loaded from: classes.dex */
public final class DownloadService extends AbstractServiceC1020T7 {

    /* renamed from: q */
    public static final /* synthetic */ int f9570q = 0;

    /* renamed from: I */
    public final C1886jW f9571I = new C1886jW(null);

    /* renamed from: N */
    public static final void m5129N(DownloadService downloadService, C2232q4 c2232q4, Uri uri) {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        boolean z;
        downloadService.getClass();
        if (c2232q4 instanceof BufferedInputStream) {
            bufferedInputStream = (BufferedInputStream) c2232q4;
        } else {
            bufferedInputStream = new BufferedInputStream(c2232q4, 8192);
        }
        ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
        OutputStream openOutputStream = AbstractC1743gn.m3275z().getContentResolver().openOutputStream(uri, "rwt");
        if (openOutputStream != null) {
            if (openOutputStream instanceof BufferedOutputStream) {
                bufferedOutputStream = (BufferedOutputStream) openOutputStream;
            } else {
                bufferedOutputStream = new BufferedOutputStream(openOutputStream, 8192);
            }
            ZipOutputStream zipOutputStream = new ZipOutputStream(bufferedOutputStream);
            try {
                try {
                    zipOutputStream.putNextEntry(new ZipEntry("META-INF/"));
                    zipOutputStream.putNextEntry(new ZipEntry("META-INF/com/"));
                    zipOutputStream.putNextEntry(new ZipEntry("META-INF/com/google/"));
                    zipOutputStream.putNextEntry(new ZipEntry("META-INF/com/google/android/"));
                    zipOutputStream.putNextEntry(new ZipEntry("META-INF/com/google/android/update-binary"));
                    AbstractC0438II.m999I(downloadService.getAssets().open("module_installer.sh"), zipOutputStream);
                    zipOutputStream.putNextEntry(new ZipEntry("META-INF/com/google/android/updater-script"));
                    zipOutputStream.write("#MAGISK\n".getBytes(AbstractC2047ma.f6374z));
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry != null) {
                            String name = nextEntry.getName();
                            if (name.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && !name.startsWith("META-INF")) {
                                zipOutputStream.putNextEntry(new ZipEntry(name));
                                if (!nextEntry.isDirectory()) {
                                    AbstractC0438II.m999I(zipInputStream, zipOutputStream);
                                }
                            }
                        } else {
                            AbstractC1292YB.m2659R(zipOutputStream, null);
                            AbstractC1292YB.m2659R(zipInputStream, null);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1292YB.m2659R(zipOutputStream, th);
                        throw th2;
                    }
                }
            } finally {
            }
        } else {
            throw new FileNotFoundException();
        }
    }

    /* renamed from: P */
    public static final void m5130P(DownloadService downloadService, C2232q4 c2232q4, C2642xo c2642xo) {
        int i;
        downloadService.getClass();
        C0329GJ c0329gj = null;
        Intent m1992v = null;
        if (AbstractC0795Op.m1857n()) {
            File file = new File(AbstractC2575wW.m4430f(downloadService.getApplicationInfo()), "update.apk");
            try {
                m5131Q(c2642xo, c2232q4, new FileOutputStream(file));
                ZipFile zipFile = new ZipFile(file);
                Properties properties = new Properties();
                properties.load(new ByteArrayInputStream(zipFile.getComment().getBytes(AbstractC2047ma.f6374z)));
                Integer m3177O4 = AbstractC1684fg.m3177O4(properties.getProperty("stubVersion"));
                if (m3177O4 != null) {
                    i = m3177O4.intValue();
                } else {
                    i = -1;
                }
                if (((Integer) ((Object[]) C1910jw.f5962h.f541R)[0]).intValue() < i) {
                    downloadService.m2198v(c2642xo.f8236R, new C2670yQ(4, downloadService));
                    File m4427dG = AbstractC2575wW.m4427dG(c2642xo.mo34P());
                    AbstractC2631xW.m4526h(m4427dG, zipFile.getInputStream(zipFile.getEntry("assets/stub.apk")));
                    zipFile.close();
                    CharSequence charSequence = downloadService.getApplicationInfo().nonLocalizedLabel;
                    String packageName = downloadService.getPackageName();
                    C0858Q m1014UZ = AbstractC0438II.m1014UZ(downloadService, null, null, null);
                    C0687N m1991h = m1014UZ.m1991h(downloadService);
                    try {
                        boolean m3235r = C1710g8.m3235r(downloadService, m4427dG, m1991h, packageName, charSequence);
                        AbstractC1292YB.m2659R(m1991h, null);
                        if (m3235r) {
                            m1992v = m1014UZ.m1992v();
                        }
                        if (m1992v != null) {
                            c2642xo.f8238q = m1992v;
                            m4427dG.delete();
                            return;
                        }
                        throw new IOException("HideAPK patch error");
                    } finally {
                    }
                } else {
                    C1852is c1852is = C1852is.f5778z;
                    Activity activity = (Activity) C1852is.f5777h.get();
                    if (activity != null) {
                        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
                        activity.finishAffinity();
                        activity.startActivity(launchIntentForPackage);
                        Runtime.getRuntime().exit(0);
                        c0329gj = C0329GJ.f1115z;
                    }
                    if (c0329gj == null) {
                        Intent launchIntentForPackage2 = downloadService.getPackageManager().getLaunchIntentForPackage(downloadService.getPackageName());
                        launchIntentForPackage2.addFlags(268468224);
                        c2642xo.f8238q = launchIntentForPackage2;
                        c2642xo.f8235I = C0731Nj.f2474r;
                    }
                }
            } catch (Exception e) {
                file.delete();
                throw e;
            }
        } else {
            C0858Q m1014UZ2 = AbstractC0438II.m1014UZ(downloadService, null, null, null);
            m5131Q(c2642xo, c2232q4, m1014UZ2.m1991h(downloadService));
            c2642xo.f8238q = m1014UZ2.m1992v();
        }
    }

    /* renamed from: Q */
    public static final void m5131Q(C2642xo c2642xo, C2232q4 c2232q4, OutputStream outputStream) {
        AbstractC2631xW.m4527z(c2232q4, new C2489uv(AbstractC1843ih.m3410HL(AbstractC1843ih.m3405F(c2642xo.mo38u() + ".apk", false).mo861z()), outputStream, 0));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f9571I.mo1719z(null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        AbstractC0164DB abstractC0164DB = (AbstractC0164DB) intent.getParcelableExtra("subject");
        if (abstractC0164DB != null) {
            m2198v(abstractC0164DB.mo33N(), C1980lF.f6123F);
            C1886jW c1886jW = this.f9571I;
            ExecutorC0094Bp executorC0094Bp = AbstractC0037Al.f178h;
            c1886jW.getClass();
            AbstractC0438II.m994F(AbstractC1843ih.m3468z(AbstractC0438II.m1002L(c1886jW, executorC0094Bp)), null, new C1408aR(this, abstractC0164DB, null), 3);
            return 2;
        }
        return 2;
    }
}
