package p000a;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: a.X5 */
/* loaded from: classes.dex */
public abstract class AbstractC1236X5 {

    /* renamed from: u */
    public static final AtomicBoolean f4012u = new AtomicBoolean(false);

    /* renamed from: N */
    public final C1996lX f4013N;

    /* renamed from: P */
    public AbstractC1062Tx f4014P;

    /* renamed from: Q */
    public final boolean f4015Q;

    /* renamed from: h */
    public final List f4016h;

    /* renamed from: v */
    public AbstractC1062Tx f4017v;

    /* renamed from: z */
    public final List f4018z;

    public AbstractC1236X5(List list, List list2) {
        boolean z;
        this.f4018z = list;
        this.f4016h = list2;
        ExecutorService executorService = AbstractC0017AI.f108S;
        C1996lX m1869s = AbstractC0795Op.m1869s();
        this.f4013N = m1869s;
        if (m1869s.m45G() && C1910jw.f5959S) {
            z = true;
        } else {
            z = false;
        }
        this.f4015Q = z;
    }

    /* renamed from: S */
    public static final void m2536S(AbstractC1062Tx abstractC1062Tx, C0956Rx c0956Rx, AbstractC1236X5 abstractC1236X5) {
        InputStream mo2222P = abstractC1062Tx.mo2222P();
        try {
            c0956Rx.m2114h(abstractC1236X5.m2548o(abstractC1062Tx.length(), abstractC1062Tx.getName()));
            AbstractC0438II.m999I(mo2222P, c0956Rx);
            AbstractC1292YB.m2659R(mo2222P, null);
            abstractC1062Tx.delete();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m2537v(p000a.AbstractC1236X5 r6, p000a.InterfaceC1171Vv r7) {
        /*
            boolean r0 = r7 instanceof p000a.C1838ib
            if (r0 == 0) goto L13
            r0 = r7
            a.ib r0 = (p000a.C1838ib) r0
            int r1 = r0.f5740k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5740k = r1
            goto L18
        L13:
            a.ib r0 = new a.ib
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5739I
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f5740k
            java.util.concurrent.atomic.AtomicBoolean r3 = p000a.AbstractC1236X5.f4012u
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            p000a.AbstractC1292YB.m2664UZ(r7)
            goto L4e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            p000a.AbstractC1292YB.m2664UZ(r7)
            boolean r7 = r3.getAndSet(r4)
            if (r7 == 0) goto L3d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L3d:
            a.Bp r7 = p000a.AbstractC0037Al.f178h
            a.rv r2 = new a.rv
            r5 = 0
            r2.<init>(r6, r5)
            r0.f5740k = r4
            java.lang.Object r7 = p000a.AbstractC0438II.m1021ZH(r7, r2, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            r7 = 0
            r3.set(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1236X5.m2537v(a.X5, a.Vv):java.lang.Object");
    }

    /* renamed from: z */
    public static void m2538z(FilterInputStream filterInputStream, OutputStream outputStream) {
        try {
            AbstractC0438II.m999I(filterInputStream, outputStream);
            AbstractC1292YB.m2659R(outputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1292YB.m2659R(outputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: G */
    public final boolean m2539G() {
        AbstractC1062Tx mo2224v = m2549u().mo2224v("new-boot.img");
        if (!this.f4015Q) {
            mo2224v.createNewFile();
            new File(m2549u(), "stock_boot.img").createNewFile();
        }
        String[] strArr = new String[2];
        strArr[0] = "cd " + m2549u();
        boolean z = C1212We.f3948Q;
        boolean z2 = C1212We.f3946N;
        boolean z3 = C1910jw.f5954M;
        boolean z4 = C1212We.f3965u;
        boolean z5 = C1910jw.f5964u;
        AbstractC1062Tx abstractC1062Tx = this.f4014P;
        if (abstractC1062Tx == null) {
            abstractC1062Tx = null;
        }
        strArr[1] = "KEEPFORCEENCRYPT=" + z + " KEEPVERITY=" + z2 + " PATCHVBMETAFLAG=" + z3 + " RECOVERYMODE=" + z4 + " LEGACYSAR=" + z5 + " sh boot_patch.sh " + abstractC1062Tx;
        boolean m3380z = m2540I(strArr).m3380z();
        C1996lX c1996lX = this.f4013N;
        c1996lX.getClass();
        C0434IE c0434ie = new C0434IE(c1996lX);
        c0434ie.m971O4("./magiskboot cleanup", "cd /");
        c0434ie.m972d3();
        return m3380z;
    }

    /* renamed from: I */
    public final AbstractC1823iK m2540I(String[] strArr) {
        C1996lX c1996lX = this.f4013N;
        c1996lX.getClass();
        C0434IE c0434ie = new C0434IE(c1996lX);
        c0434ie.m971O4((String[]) Arrays.copyOf(strArr, strArr.length));
        c0434ie.f1418I = this.f4018z;
        c0434ie.f1421q = this.f4016h;
        return c0434ie.m972d3();
    }

    /* renamed from: M */
    public final AbstractC1062Tx m2541M(FilterInputStream filterInputStream) {
        List list = this.f4018z;
        File file = null;
        try {
            try {
                list.add("- Processing payload.bin");
                File createTempFile = File.createTempFile("payload-fifo-", null, m2549u());
                createTempFile.delete();
                Os.mkfifo(createTempFile.getPath(), 420);
                boolean z = false;
                Future m2547h = m2547h(new String[]{"cd " + m2549u(), "./magiskboot extract " + createTempFile, "cd /"});
                FileDescriptor open = Os.open(createTempFile.getPath(), OsConstants.O_WRONLY, 0);
                try {
                    ByteBuffer allocate = ByteBuffer.allocate(1048576);
                    int read = filterInputStream.read(allocate.array());
                    if (read < 0) {
                        read = 0;
                    }
                    loop0: while (true) {
                        allocate.position(read).flip();
                        while (allocate.hasRemaining()) {
                            try {
                                Os.write(open, allocate);
                                if (!allocate.hasRemaining()) {
                                    allocate.limit(1048576);
                                    read = filterInputStream.read(allocate.array());
                                    if (read < 0) {
                                        read = 0;
                                    }
                                }
                            } catch (ErrnoException e) {
                                if (e.errno != OsConstants.EPIPE) {
                                    throw e;
                                }
                            }
                        }
                        break loop0;
                    }
                    try {
                        z = ((AbstractC1823iK) ((FutureTask) m2547h).get()).m3380z();
                    } catch (Exception unused) {
                    }
                    if (!z) {
                        list.add("! Error while extracting payload.bin");
                        throw new IOException();
                    }
                    AbstractC1062Tx mo2224v = m2549u().mo2224v("boot.img");
                    AbstractC1062Tx mo2224v2 = m2549u().mo2224v("init_boot.img");
                    if (mo2224v2.exists()) {
                        list.add("-- Extract init_boot.img");
                        mo2224v = mo2224v2;
                    } else {
                        if (!mo2224v.exists()) {
                            throw new C1932kL();
                        }
                        list.add("-- Extract boot.img");
                    }
                    createTempFile.delete();
                    return mo2224v;
                } finally {
                    Os.close(open);
                }
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                file.delete();
            }
            throw th;
        }
    }

    /* renamed from: N */
    public final boolean m2542N() {
        if (m2543P()) {
            if (m2550w("fix_env " + m2549u()).m3380z()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final boolean m2543P() {
        InterfaceC2364sT interfaceC2364sT;
        String str = AbstractC0598LC.f1921z;
        int i = 0;
        String concat = "- Device platform: ".concat(Build.SUPPORTED_ABIS[0]);
        List list = this.f4018z;
        list.add(concat);
        list.add("- Installing: 26.4 (26400)");
        this.f4017v = new C1770hH(AbstractC1743gn.m3273h().getFilesDir().getParent(), "install");
        AbstractC1658fB.m3133ZH(m2549u());
        m2549u().mkdirs();
        try {
            int i2 = 3;
            if (AbstractC0795Op.m1857n()) {
                ZipFile zipFile = new ZipFile(AbstractC2575wW.m4448q(AbstractC1743gn.m3273h()));
                String str2 = AbstractC0598LC.f1921z;
                if (str2 != null) {
                    interfaceC2364sT = new C1747gr(i2, str2);
                } else {
                    interfaceC2364sT = C1980lF.f6131Z;
                }
                C0923RN c0923rn = new C0923RN(new C2211pf(AbstractC0873QM.m2011G5(new C0578Kp(zipFile.entries())), true, new C1464bW(i, interfaceC2364sT)));
                while (c0923rn.hasNext()) {
                    ZipEntry zipEntry = (ZipEntry) c0923rn.next();
                    String substring = zipEntry.getName().substring(AbstractC1269Xn.m2589j5(zipEntry.getName(), '/', 0, 6) + 1);
                    File file = new File(m2549u(), substring.substring(3, substring.length() - 3));
                    AbstractC2631xW.m4526h(file, zipFile.getInputStream(zipEntry));
                    file.setExecutable(true);
                }
                zipFile.close();
            } else {
                ApplicationInfo applicationInfo = AbstractC1743gn.m3273h().getApplicationInfo();
                File[] listFiles = new File(applicationInfo.nativeLibraryDir).listFiles(new C1940kW(i));
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                String str3 = (String) applicationInfo.getClass().getDeclaredField("secondaryNativeLibraryDir").get(applicationInfo);
                if (str3 != null) {
                    File file2 = new File(str3, "libmagisk32.so");
                    int length = listFiles.length;
                    Object[] copyOf = Arrays.copyOf(listFiles, length + 1);
                    copyOf[length] = file2;
                    listFiles = (File[]) copyOf;
                }
                for (File file3 : listFiles) {
                    Os.symlink(file3.getPath(), m2549u() + "/" + file3.getName().substring(3, file3.getName().length() - 3));
                }
            }
            for (String str4 : AbstractC1292YB.m2661T("util_functions.sh", "boot_patch.sh", "addon.d.sh", "stub.apk")) {
                AbstractC2631xW.m4526h(new File(m2549u(), str4), AbstractC1743gn.m3273h().getAssets().open(str4));
            }
            new File(m2549u(), "chromeos").mkdir();
            Iterator it = AbstractC1292YB.m2661T("futility", "kernel_data_key.vbprivk", "kernel.keyblock").iterator();
            while (it.hasNext()) {
                String str5 = "chromeos/" + ((String) it.next());
                AbstractC2631xW.m4526h(new File(m2549u(), str5), AbstractC1743gn.m3273h().getAssets().open(str5));
            }
            if (this.f4015Q) {
                C0346Gc.f1163P.getClass();
                AbstractC1062Tx mo305z = C0382HH.m871z().mo305z("/dev/tmp");
                m2540I(new String[]{"rm -rf " + mo305z, "mkdir -p " + mo305z, "cp_readlink " + m2549u() + " " + mo305z, "rm -rf " + m2549u()});
                this.f4017v = mo305z;
            }
            return true;
        } catch (Exception e) {
            list.add("! Unable to extract files");
            AbstractC1530cs.f4727z.mo1160v(e);
            return false;
        }
    }

    /* renamed from: Q */
    public final boolean m2544Q() {
        AbstractC1062Tx m2549u = m2549u();
        AbstractC1062Tx abstractC1062Tx = this.f4014P;
        if (abstractC1062Tx == null) {
            abstractC1062Tx = null;
        }
        return m2550w("direct_install " + m2549u + " " + abstractC1062Tx).m3380z();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0028  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.AbstractC1062Tx m2545R(java.util.zip.ZipInputStream r11) {
        /*
            r10 = this;
            java.util.List r0 = r10.f4018z
            java.lang.String r1 = "- Processing zip file"
            r0.add(r1)
            a.Tx r1 = r10.m2549u()
            java.lang.String r2 = "boot.img"
            a.Tx r1 = r1.mo2224v(r2)
            a.Tx r3 = r10.m2549u()
            java.lang.String r4 = "init_boot.img"
            a.Tx r3 = r3.mo2224v(r4)
            r5 = 0
            r6 = r5
        L1d:
            java.util.zip.ZipEntry r7 = r11.getNextEntry()
            if (r7 == 0) goto L25
            r6 = r7
            goto L26
        L25:
            r7 = r5
        L26:
            if (r7 == 0) goto L87
            if (r6 != 0) goto L2c
            r7 = r5
            goto L2d
        L2c:
            r7 = r6
        L2d:
            boolean r7 = r7.isDirectory()
            if (r7 != 0) goto L1d
            java.lang.String r7 = r6.getName()
            r8 = 47
            java.lang.String r7 = p000a.AbstractC1269Xn.m2593vk(r7, r8)
            int r8 = r7.hashCode()
            r9 = 908775591(0x362ad0a7, float:2.5453426E-6)
            if (r8 == r9) goto L79
            r9 = 1651929366(0x62767116, float:1.13651194E21)
            if (r8 == r9) goto L65
            r9 = 2011820743(0x77e9f2c7, float:9.4900725E33)
            if (r8 == r9) goto L51
            goto L1d
        L51:
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L58
            goto L1d
        L58:
            java.lang.String r7 = "- Extracting boot.img"
            r0.add(r7)
            java.io.OutputStream r7 = r1.mo2221N()
            m2538z(r11, r7)
            goto L1d
        L65:
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L6c
            goto L1d
        L6c:
            java.lang.String r1 = "- Extracting init_boot.img"
            r0.add(r1)
            java.io.OutputStream r0 = r3.mo2221N()
            m2538z(r11, r0)
            return r3
        L79:
            java.lang.String r8 = "payload.bin"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L82
            goto L1d
        L82:
            a.Tx r11 = r10.m2541M(r11)     // Catch: java.io.IOException -> L1d
            return r11
        L87:
            boolean r11 = r1.exists()
            if (r11 == 0) goto L8e
            return r1
        L8e:
            a.kL r11 = new a.kL
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1236X5.m2545R(java.util.zip.ZipInputStream):a.Tx");
    }

    /* renamed from: V */
    public final AbstractC1062Tx m2546V(C1680fa c1680fa, C0956Rx c0956Rx) {
        C2627xS c2627xS;
        Object obj;
        boolean z;
        Object obj2;
        C2627xS c2627xS2;
        C2627xS c2627xS3;
        C2627xS c2627xS4;
        FilterInputStream filterInputStream;
        C2627xS c2627xS5;
        C2627xS c2627xS6;
        C2627xS c2627xS7;
        FilterInputStream filterInputStream2;
        C2627xS c2627xS8;
        C2627xS c2627xS9;
        C2627xS c2627xS10;
        C2627xS c2627xS11;
        int i;
        C2627xS c2627xS12;
        List list = this.f4018z;
        list.add("- Processing tar file");
        C2627xS c2627xS13 = null;
        while (true) {
            C2627xS c2627xS14 = c1680fa.f5268S;
            if (c2627xS14 != null) {
                long j = 0;
                if (c2627xS14.f8148z.f6787N > c1680fa.f5267R) {
                    long j2 = 0;
                    while (true) {
                        long j3 = c1680fa.f5268S.f8148z.f6787N - c1680fa.f5267R;
                        if (j2 >= j3) {
                            break;
                        }
                        long skip = c1680fa.skip(j3 - j2);
                        if (skip == 0) {
                            c2627xS12 = c2627xS13;
                            if (c1680fa.f5268S.f8148z.f6787N - c1680fa.f5267R > 0) {
                                throw new IOException("Possible tar file corruption");
                            }
                        } else {
                            c2627xS12 = c2627xS13;
                        }
                        j2 += skip;
                        c2627xS13 = c2627xS12;
                    }
                }
                c2627xS = c2627xS13;
                obj = null;
                c1680fa.f5268S = null;
                c1680fa.f5267R = 0L;
                long j4 = c1680fa.f5269w;
                if (j4 > 0 && (i = (int) (j4 % 512)) > 0) {
                    while (true) {
                        long j5 = 512 - i;
                        if (j >= j5) {
                            break;
                        }
                        j += c1680fa.skip(j5 - j);
                    }
                }
            } else {
                c2627xS = c2627xS13;
                obj = null;
            }
            byte[] bArr = new byte[512];
            byte[] bArr2 = new byte[512];
            int i2 = 0;
            while (i2 < 512) {
                int read = c1680fa.read(bArr2, 0, 512 - i2);
                if (read < 0) {
                    break;
                }
                System.arraycopy(bArr2, 0, bArr, i2, read);
                i2 += read;
            }
            int i3 = 0;
            while (true) {
                if (i3 < 512) {
                    if (bArr[i3] != 0) {
                        z = false;
                        break;
                    }
                    i3++;
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                c1680fa.f5268S = new C2627xS(bArr);
            }
            c2627xS13 = c1680fa.f5268S;
            if (c2627xS13 != null) {
                obj2 = C0329GJ.f1115z;
            } else {
                obj2 = obj;
                c2627xS13 = c2627xS;
            }
            if (obj2 != null) {
                if (c2627xS13 == null) {
                    c2627xS2 = obj;
                } else {
                    c2627xS2 = c2627xS13;
                }
                if (!c2627xS2.m4525z().startsWith("boot.img")) {
                    if (c2627xS13 == null) {
                        c2627xS5 = obj;
                    } else {
                        c2627xS5 = c2627xS13;
                    }
                    if (!c2627xS5.m4525z().startsWith("init_boot.img")) {
                        if (C1212We.f3965u) {
                            if (c2627xS13 == null) {
                                c2627xS11 = obj;
                            } else {
                                c2627xS11 = c2627xS13;
                            }
                            if (AbstractC1269Xn.m2591nB(c2627xS11.m4525z(), "recovery.img", false)) {
                            }
                        }
                        if (c2627xS13 == null) {
                            c2627xS6 = obj;
                        } else {
                            c2627xS6 = c2627xS13;
                        }
                        if (AbstractC1269Xn.m2591nB(c2627xS6.m4525z(), "vbmeta.img", false)) {
                            if (c2627xS13 == null) {
                                c2627xS7 = obj;
                            } else {
                                c2627xS7 = c2627xS13;
                            }
                            if (c2627xS7.m4525z().endsWith(".lz4")) {
                                filterInputStream2 = new C2462uO(c1680fa);
                            } else {
                                filterInputStream2 = c1680fa;
                            }
                            C1501cI c1501cI = new C1501cI(filterInputStream2);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, 0));
                            AbstractC0438II.m999I(c1501cI, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (byteArray.length >= 256) {
                                list.add("-- Patching: vbmeta.img");
                                ByteBuffer.wrap(byteArray).putInt(120, 3);
                                c0956Rx.m2114h(m2548o(byteArray.length, "vbmeta.img"));
                                c0956Rx.write(byteArray);
                                C1910jw.f5954M = false;
                            }
                        } else {
                            if (c2627xS13 == null) {
                                c2627xS8 = obj;
                            } else {
                                c2627xS8 = c2627xS13;
                            }
                            if (!AbstractC1269Xn.m2591nB(c2627xS8.m4525z(), "userdata.img", false)) {
                                if (c2627xS13 == null) {
                                    c2627xS9 = obj;
                                } else {
                                    c2627xS9 = c2627xS13;
                                }
                                list.add("-- Copying: " + c2627xS9.m4525z());
                                if (c2627xS13 == null) {
                                    c2627xS10 = obj;
                                } else {
                                    c2627xS10 = c2627xS13;
                                }
                                c0956Rx.m2114h(c2627xS10);
                                byte[] bArr3 = new byte[1048576];
                                while (true) {
                                    int read2 = c1680fa.read(bArr3);
                                    if (read2 >= 0) {
                                        c0956Rx.write(bArr3, 0, read2);
                                    }
                                }
                            }
                        }
                    }
                }
                if (c2627xS13 == null) {
                    c2627xS3 = obj;
                } else {
                    c2627xS3 = c2627xS13;
                }
                String m2588hs = AbstractC1269Xn.m2588hs(c2627xS3.m4525z(), ".lz4", "");
                list.add("-- Extracting: ".concat(m2588hs));
                AbstractC1062Tx mo2224v = m2549u().mo2224v(m2588hs);
                if (c2627xS13 == null) {
                    c2627xS4 = obj;
                } else {
                    c2627xS4 = c2627xS13;
                }
                if (c2627xS4.m4525z().endsWith(".lz4")) {
                    filterInputStream = new C2462uO(c1680fa);
                } else {
                    filterInputStream = c1680fa;
                }
                m2538z(new C1501cI(filterInputStream), mo2224v.mo2221N());
            } else {
                AbstractC1062Tx mo2224v2 = m2549u().mo2224v("boot.img");
                AbstractC1062Tx mo2224v3 = m2549u().mo2224v("init_boot.img");
                AbstractC1062Tx mo2224v4 = m2549u().mo2224v("recovery.img");
                if (mo2224v4.exists()) {
                    if (mo2224v2.exists()) {
                        m2540I(new String[]{"cd " + m2549u(), "chmod -R 755 .", "./magiskboot unpack boot.img", "./magiskboot repack boot.img", "cat new-boot.img > boot.img", "./magiskboot cleanup", "rm -f new-boot.img", "cd /"});
                        m2536S(mo2224v2, c0956Rx, this);
                    }
                    return mo2224v4;
                }
                if (mo2224v3.exists()) {
                    if (mo2224v2.exists()) {
                        m2536S(mo2224v2, c0956Rx, this);
                    }
                    return mo2224v3;
                }
                if (mo2224v2.exists()) {
                    return mo2224v2;
                }
                throw new C1932kL();
            }
        }
    }

    /* renamed from: W */
    public abstract Boolean mo1127W();

    /* renamed from: h */
    public final Future m2547h(String[] strArr) {
        C1996lX c1996lX = this.f4013N;
        c1996lX.getClass();
        C0434IE c0434ie = new C0434IE(c1996lX);
        c0434ie.m971O4((String[]) Arrays.copyOf(strArr, strArr.length));
        c0434ie.f1418I = this.f4018z;
        c0434ie.f1421q = this.f4016h;
        return c0434ie.m973nB();
    }

    /* renamed from: o */
    public final C2627xS m2548o(long j, String str) {
        StringBuilder sb;
        this.f4018z.add("-- Writing: ".concat(str));
        StringBuilder sb2 = new StringBuilder(str.replace(File.separatorChar, '/'));
        for (int i = 0; i < sb2.length() && sb2.charAt(i) == '/'; i++) {
            sb2.deleteCharAt(i);
        }
        int length = sb2.length();
        while (true) {
            length--;
            if (length < 0 || sb2.charAt(length) != '/') {
                break;
            }
            sb2.deleteCharAt(length);
        }
        String sb3 = sb2.toString();
        C2210pd c2210pd = new C2210pd();
        c2210pd.f6793o = new StringBuilder();
        c2210pd.f6792h = 420;
        if (sb3.length() > 100) {
            c2210pd.f6790V = new StringBuilder(sb3.substring(0, sb3.lastIndexOf(47)));
            sb = new StringBuilder(sb3.substring(sb3.lastIndexOf(47) + 1));
        } else {
            sb = new StringBuilder(sb3);
        }
        c2210pd.f6796z = sb;
        c2210pd.f6794u = (byte) 48;
        c2210pd.f6787N = j;
        c2210pd.f6789Q = 0L;
        return new C2627xS(c2210pd);
    }

    /* renamed from: u */
    public final AbstractC1062Tx m2549u() {
        AbstractC1062Tx abstractC1062Tx = this.f4017v;
        if (abstractC1062Tx != null) {
            return abstractC1062Tx;
        }
        return null;
    }

    /* renamed from: w */
    public final AbstractC1823iK m2550w(String str) {
        C1996lX c1996lX = this.f4013N;
        c1996lX.getClass();
        C0434IE c0434ie = new C0434IE(c1996lX);
        c0434ie.m971O4(str);
        c0434ie.f1418I = this.f4018z;
        c0434ie.f1421q = this.f4016h;
        return c0434ie.m972d3();
    }
}
