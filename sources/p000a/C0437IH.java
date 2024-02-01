package p000a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: a.IH */
/* loaded from: classes.dex */
public final class C0437IH implements Closeable, Flushable {

    /* renamed from: E */
    public boolean f1432E;

    /* renamed from: H */
    public long f1433H;

    /* renamed from: I */
    public final File f1434I;

    /* renamed from: J */
    public boolean f1435J;

    /* renamed from: R */
    public final File f1436R;

    /* renamed from: U */
    public int f1438U;

    /* renamed from: Y */
    public boolean f1440Y;

    /* renamed from: c */
    public boolean f1441c;

    /* renamed from: e */
    public final C1956ko f1442e;

    /* renamed from: f */
    public boolean f1443f;

    /* renamed from: g */
    public long f1444g;

    /* renamed from: k */
    public final File f1445k;

    /* renamed from: q */
    public final File f1446q;

    /* renamed from: r */
    public boolean f1447r;

    /* renamed from: y */
    public InterfaceC1432as f1450y;

    /* renamed from: F */
    public static final C1939kV f1428F = new C1939kV("[a-z0-9_-]{1,120}");

    /* renamed from: Z */
    public static final String f1429Z = "CLEAN";

    /* renamed from: C */
    public static final String f1427C = "DIRTY";

    /* renamed from: p */
    public static final String f1431p = "REMOVE";

    /* renamed from: j */
    public static final String f1430j = "READ";

    /* renamed from: S */
    public final InterfaceC0810P6 f1437S = InterfaceC0810P6.f2751z;

    /* renamed from: w */
    public final long f1449w = 10485760;

    /* renamed from: s */
    public final LinkedHashMap f1448s = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: X */
    public final C2717zI f1439X = new C2717zI(0, this, AbstractC2441tz.m4187M(new StringBuilder(), AbstractC1181W6.f3858u, " Cache"));

    public C0437IH(File file, C0634Lw c0634Lw) {
        this.f1436R = file;
        this.f1442e = c0634Lw.m1425Q();
        this.f1434I = new File(file, "journal");
        this.f1446q = new File(file, "journal.tmp");
        this.f1445k = new File(file, "journal.bkp");
    }

    /* renamed from: Ha */
    public static void m974Ha(String str) {
        if (f1428F.f6022S.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* renamed from: BO */
    public final void m975BO() {
        boolean z;
        File file = this.f1434I;
        ((C0197Dm) this.f1437S).getClass();
        Logger logger = AbstractC0982SQ.f3316z;
        C2323ri c2323ri = new C2323ri(new C2294rC(new FileInputStream(file), C1819iG.f5685P));
        try {
            String mo1633t = c2323ri.mo1633t();
            String mo1633t2 = c2323ri.mo1633t();
            String mo1633t3 = c2323ri.mo1633t();
            String mo1633t4 = c2323ri.mo1633t();
            String mo1633t5 = c2323ri.mo1633t();
            if (AbstractC1292YB.m2695u("libcore.io.DiskLruCache", mo1633t) && AbstractC1292YB.m2695u("1", mo1633t2) && AbstractC1292YB.m2695u(String.valueOf(201105), mo1633t3) && AbstractC1292YB.m2695u(String.valueOf(2), mo1633t4)) {
                int i = 0;
                if (mo1633t5.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    while (true) {
                        try {
                            m984he(c2323ri.mo1633t());
                            i++;
                        } catch (EOFException unused) {
                            this.f1438U = i - this.f1448s.size();
                            if (!c2323ri.mo1626b()) {
                                m982dx();
                            } else {
                                this.f1450y = m985x();
                            }
                            AbstractC1292YB.m2659R(c2323ri, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + mo1633t + ", " + mo1633t2 + ", " + mo1633t4 + ", " + mo1633t5 + ']');
        } finally {
        }
    }

    /* renamed from: C */
    public final boolean m976C() {
        int i = this.f1438U;
        return i >= 2000 && i >= this.f1448s.size();
    }

    /* renamed from: G */
    public final synchronized C1570dX m977G(long j, String str) {
        C1570dX c1570dX;
        m986y();
        m987z();
        m974Ha(str);
        C0878QT c0878qt = (C0878QT) this.f1448s.get(str);
        if (j != -1 && (c0878qt == null || c0878qt.f3035W != j)) {
            return null;
        }
        if (c0878qt != null) {
            c1570dX = c0878qt.f3038u;
        } else {
            c1570dX = null;
        }
        if (c1570dX != null) {
            return null;
        }
        if (c0878qt != null && c0878qt.f3037o != 0) {
            return null;
        }
        if (!this.f1435J && !this.f1441c) {
            InterfaceC1432as interfaceC1432as = this.f1450y;
            interfaceC1432as.mo938K(f1427C).mo945qn(32).mo938K(str).mo945qn(10);
            interfaceC1432as.flush();
            if (this.f1432E) {
                return null;
            }
            if (c0878qt == null) {
                c0878qt = new C0878QT(this, str);
                this.f1448s.put(str, c0878qt);
            }
            C1570dX c1570dX2 = new C1570dX(this, c0878qt);
            c0878qt.f3038u = c1570dX2;
            return c1570dX2;
        }
        this.f1442e.m3579v(this.f1439X, 0L);
        return null;
    }

    /* renamed from: Lq */
    public final void m978Lq() {
        boolean z;
        do {
            z = false;
            if (this.f1444g > this.f1449w) {
                Iterator it = this.f1448s.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0878QT c0878qt = (C0878QT) it.next();
                    if (!c0878qt.f3034Q) {
                        m981ZH(c0878qt);
                        z = true;
                        break;
                    }
                }
            } else {
                this.f1435J = false;
                return;
            }
        } while (z);
    }

    /* renamed from: U8 */
    public final void m979U8() {
        File file = this.f1446q;
        C0197Dm c0197Dm = (C0197Dm) this.f1437S;
        c0197Dm.m385z(file);
        Iterator it = this.f1448s.values().iterator();
        while (it.hasNext()) {
            C0878QT c0878qt = (C0878QT) it.next();
            int i = 0;
            if (c0878qt.f3038u == null) {
                while (i < 2) {
                    this.f1444g += c0878qt.f3036h[i];
                    i++;
                }
            } else {
                c0878qt.f3038u = null;
                while (i < 2) {
                    c0197Dm.m385z((File) c0878qt.f3039v.get(i));
                    c0197Dm.m385z((File) c0878qt.f3033P.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: V */
    public final synchronized C2702z0 m980V(String str) {
        m986y();
        m987z();
        m974Ha(str);
        C0878QT c0878qt = (C0878QT) this.f1448s.get(str);
        if (c0878qt == null) {
            return null;
        }
        C2702z0 m2026z = c0878qt.m2026z();
        if (m2026z == null) {
            return null;
        }
        this.f1438U++;
        this.f1450y.mo938K(f1430j).mo945qn(32).mo938K(str).mo945qn(10);
        if (m976C()) {
            this.f1442e.m3579v(this.f1439X, 0L);
        }
        return m2026z;
    }

    /* renamed from: ZH */
    public final void m981ZH(C0878QT c0878qt) {
        InterfaceC1432as interfaceC1432as;
        boolean z = this.f1443f;
        String str = c0878qt.f3040z;
        if (!z) {
            if (c0878qt.f3037o > 0 && (interfaceC1432as = this.f1450y) != null) {
                interfaceC1432as.mo938K(f1427C);
                interfaceC1432as.mo945qn(32);
                interfaceC1432as.mo938K(str);
                interfaceC1432as.mo945qn(10);
                interfaceC1432as.flush();
            }
            if (c0878qt.f3037o > 0 || c0878qt.f3038u != null) {
                c0878qt.f3034Q = true;
                return;
            }
        }
        C1570dX c1570dX = c0878qt.f3038u;
        if (c1570dX != null) {
            c1570dX.m3037v();
        }
        for (int i = 0; i < 2; i++) {
            ((C0197Dm) this.f1437S).m385z((File) c0878qt.f3039v.get(i));
            long j = this.f1444g;
            long[] jArr = c0878qt.f3036h;
            this.f1444g = j - jArr[i];
            jArr[i] = 0;
        }
        this.f1438U++;
        InterfaceC1432as interfaceC1432as2 = this.f1450y;
        if (interfaceC1432as2 != null) {
            interfaceC1432as2.mo938K(f1431p);
            interfaceC1432as2.mo945qn(32);
            interfaceC1432as2.mo938K(str);
            interfaceC1432as2.mo945qn(10);
        }
        this.f1448s.remove(str);
        if (m976C()) {
            this.f1442e.m3579v(this.f1439X, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1447r && !this.f1440Y) {
            for (C0878QT c0878qt : (C0878QT[]) this.f1448s.values().toArray(new C0878QT[0])) {
                C1570dX c1570dX = c0878qt.f3038u;
                if (c1570dX != null && c1570dX != null) {
                    c1570dX.m3037v();
                }
            }
            m978Lq();
            this.f1450y.close();
            this.f1450y = null;
            this.f1440Y = true;
            return;
        }
        this.f1440Y = true;
    }

    /* renamed from: dx */
    public final synchronized void m982dx() {
        InterfaceC1432as interfaceC1432as = this.f1450y;
        if (interfaceC1432as != null) {
            interfaceC1432as.close();
        }
        C0418Hu c0418Hu = new C0418Hu(((C0197Dm) this.f1437S).m382P(this.f1446q));
        try {
            c0418Hu.mo938K("libcore.io.DiskLruCache");
            c0418Hu.mo945qn(10);
            c0418Hu.mo938K("1");
            c0418Hu.mo945qn(10);
            c0418Hu.mo944m(201105);
            c0418Hu.mo945qn(10);
            c0418Hu.mo944m(2);
            c0418Hu.mo945qn(10);
            c0418Hu.mo945qn(10);
            Iterator it = this.f1448s.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0878QT c0878qt = (C0878QT) it.next();
                if (c0878qt.f3038u != null) {
                    c0418Hu.mo938K(f1427C);
                    c0418Hu.mo945qn(32);
                    c0418Hu.mo938K(c0878qt.f3040z);
                } else {
                    c0418Hu.mo938K(f1429Z);
                    c0418Hu.mo945qn(32);
                    c0418Hu.mo938K(c0878qt.f3040z);
                    for (long j : c0878qt.f3036h) {
                        c0418Hu.mo945qn(32);
                        c0418Hu.mo944m(j);
                    }
                }
                c0418Hu.mo945qn(10);
            }
            AbstractC1292YB.m2659R(c0418Hu, null);
            InterfaceC0810P6 interfaceC0810P6 = this.f1437S;
            File file = this.f1434I;
            ((C0197Dm) interfaceC0810P6).getClass();
            if (file.exists()) {
                ((C0197Dm) this.f1437S).m384v(this.f1434I, this.f1445k);
            }
            ((C0197Dm) this.f1437S).m384v(this.f1446q, this.f1434I);
            ((C0197Dm) this.f1437S).m385z(this.f1445k);
            this.f1450y = m985x();
            this.f1432E = false;
            this.f1441c = false;
        } finally {
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f1447r) {
            m987z();
            m978Lq();
            this.f1450y.flush();
        }
    }

    /* renamed from: h */
    public final synchronized void m983h(C1570dX c1570dX, boolean z) {
        C0878QT c0878qt = (C0878QT) c1570dX.f4835h;
        if (AbstractC1292YB.m2695u(c0878qt.f3038u, c1570dX)) {
            if (z && !c0878qt.f3032N) {
                for (int i = 0; i < 2; i++) {
                    if (((boolean[]) c1570dX.f4836v)[i]) {
                        InterfaceC0810P6 interfaceC0810P6 = this.f1437S;
                        File file = (File) c0878qt.f3033P.get(i);
                        ((C0197Dm) interfaceC0810P6).getClass();
                        if (!file.exists()) {
                            c1570dX.m3038z();
                            return;
                        }
                    } else {
                        c1570dX.m3038z();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < 2; i2++) {
                File file2 = (File) c0878qt.f3033P.get(i2);
                if (z && !c0878qt.f3034Q) {
                    ((C0197Dm) this.f1437S).getClass();
                    if (file2.exists()) {
                        File file3 = (File) c0878qt.f3039v.get(i2);
                        ((C0197Dm) this.f1437S).m384v(file2, file3);
                        long j = c0878qt.f3036h[i2];
                        ((C0197Dm) this.f1437S).getClass();
                        long length = file3.length();
                        c0878qt.f3036h[i2] = length;
                        this.f1444g = (this.f1444g - j) + length;
                    }
                } else {
                    ((C0197Dm) this.f1437S).m385z(file2);
                }
            }
            c0878qt.f3038u = null;
            if (c0878qt.f3034Q) {
                m981ZH(c0878qt);
                return;
            }
            this.f1438U++;
            InterfaceC1432as interfaceC1432as = this.f1450y;
            if (!c0878qt.f3032N && !z) {
                this.f1448s.remove(c0878qt.f3040z);
                interfaceC1432as.mo938K(f1431p).mo945qn(32);
                interfaceC1432as.mo938K(c0878qt.f3040z);
                interfaceC1432as.mo945qn(10);
                interfaceC1432as.flush();
                if (this.f1444g <= this.f1449w || m976C()) {
                    this.f1442e.m3579v(this.f1439X, 0L);
                }
                return;
            }
            c0878qt.f3032N = true;
            interfaceC1432as.mo938K(f1429Z).mo945qn(32);
            interfaceC1432as.mo938K(c0878qt.f3040z);
            for (long j2 : c0878qt.f3036h) {
                interfaceC1432as.mo945qn(32).mo944m(j2);
            }
            interfaceC1432as.mo945qn(10);
            if (z) {
                long j3 = this.f1433H;
                this.f1433H = 1 + j3;
                c0878qt.f3035W = j3;
            }
            interfaceC1432as.flush();
            if (this.f1444g <= this.f1449w) {
            }
            this.f1442e.m3579v(this.f1439X, 0L);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: he */
    public final void m984he(String str) {
        String substring;
        int m2572Fu = AbstractC1269Xn.m2572Fu(str, ' ', 0, false, 6);
        if (m2572Fu != -1) {
            int i = m2572Fu + 1;
            int m2572Fu2 = AbstractC1269Xn.m2572Fu(str, ' ', i, false, 4);
            LinkedHashMap linkedHashMap = this.f1448s;
            if (m2572Fu2 == -1) {
                substring = str.substring(i);
                String str2 = f1431p;
                if (m2572Fu == str2.length() && str.startsWith(str2)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, m2572Fu2);
            }
            C0878QT c0878qt = (C0878QT) linkedHashMap.get(substring);
            if (c0878qt == null) {
                c0878qt = new C0878QT(this, substring);
                linkedHashMap.put(substring, c0878qt);
            }
            if (m2572Fu2 != -1) {
                String str3 = f1429Z;
                if (m2572Fu == str3.length() && str.startsWith(str3)) {
                    List m2571F3 = AbstractC1269Xn.m2571F3(str.substring(m2572Fu2 + 1), new char[]{' '});
                    c0878qt.f3032N = true;
                    c0878qt.f3038u = null;
                    int size = m2571F3.size();
                    c0878qt.f3031G.getClass();
                    if (size == 2) {
                        try {
                            int size2 = m2571F3.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                c0878qt.f3036h[i2] = Long.parseLong((String) m2571F3.get(i2));
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + m2571F3);
                        }
                    }
                    throw new IOException("unexpected journal line: " + m2571F3);
                }
            }
            if (m2572Fu2 == -1) {
                String str4 = f1427C;
                if (m2572Fu == str4.length() && str.startsWith(str4)) {
                    c0878qt.f3038u = new C1570dX(this, c0878qt);
                    return;
                }
            }
            if (m2572Fu2 == -1) {
                String str5 = f1430j;
                if (m2572Fu == str5.length() && str.startsWith(str5)) {
                    return;
                }
            }
            throw new IOException(AbstractC2441tz.m4200k("unexpected journal line: ", str));
        }
        throw new IOException(AbstractC2441tz.m4200k("unexpected journal line: ", str));
    }

    /* renamed from: x */
    public final C0418Hu m985x() {
        C0292FY c0292fy;
        File file = this.f1434I;
        ((C0197Dm) this.f1437S).getClass();
        try {
            Logger logger = AbstractC0982SQ.f3316z;
            c0292fy = new C0292FY(new FileOutputStream(file, true), new C1819iG());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = AbstractC0982SQ.f3316z;
            c0292fy = new C0292FY(new FileOutputStream(file, true), new C1819iG());
        }
        return new C0418Hu(new C1840ie(c0292fy, new C2670yQ(15, this)));
    }

    /* renamed from: y */
    public final synchronized void m986y() {
        boolean z;
        byte[] bArr = AbstractC1181W6.f3860z;
        if (this.f1447r) {
            return;
        }
        InterfaceC0810P6 interfaceC0810P6 = this.f1437S;
        File file = this.f1445k;
        ((C0197Dm) interfaceC0810P6).getClass();
        if (file.exists()) {
            InterfaceC0810P6 interfaceC0810P62 = this.f1437S;
            File file2 = this.f1434I;
            ((C0197Dm) interfaceC0810P62).getClass();
            if (file2.exists()) {
                ((C0197Dm) this.f1437S).m385z(this.f1445k);
            } else {
                ((C0197Dm) this.f1437S).m384v(this.f1445k, this.f1434I);
            }
        }
        InterfaceC0810P6 interfaceC0810P63 = this.f1437S;
        File file3 = this.f1445k;
        C0197Dm c0197Dm = (C0197Dm) interfaceC0810P63;
        C0292FY m382P = c0197Dm.m382P(file3);
        try {
            c0197Dm.m385z(file3);
            AbstractC1292YB.m2659R(m382P, null);
            z = true;
        } catch (IOException unused) {
            AbstractC1292YB.m2659R(m382P, null);
            c0197Dm.m385z(file3);
            z = false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1292YB.m2659R(m382P, th);
                throw th2;
            }
        }
        this.f1443f = z;
        InterfaceC0810P6 interfaceC0810P64 = this.f1437S;
        File file4 = this.f1434I;
        ((C0197Dm) interfaceC0810P64).getClass();
        if (file4.exists()) {
            try {
                m975BO();
                m979U8();
                this.f1447r = true;
                return;
            } catch (IOException e) {
                C0799Ov c0799Ov = C0799Ov.f2726z;
                C0799Ov c0799Ov2 = C0799Ov.f2726z;
                String str = "DiskLruCache " + this.f1436R + " is corrupt: " + e.getMessage() + ", removing";
                c0799Ov2.getClass();
                C0799Ov.m1881W(5, str, e);
                try {
                    close();
                    ((C0197Dm) this.f1437S).m383h(this.f1436R);
                    this.f1440Y = false;
                } catch (Throwable th3) {
                    this.f1440Y = false;
                    throw th3;
                }
            }
        }
        m982dx();
        this.f1447r = true;
    }

    /* renamed from: z */
    public final synchronized void m987z() {
        if ((!this.f1440Y) == false) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }
}
