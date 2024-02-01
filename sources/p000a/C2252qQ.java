package p000a;

import android.os.Build;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: a.qQ */
/* loaded from: classes.dex */
public final class C2252qQ implements InterfaceC1428ao {

    /* renamed from: S */
    public final int f6936S;

    public /* synthetic */ C2252qQ(int i) {
        this.f6936S = i;
    }

    /* renamed from: G */
    public static C1623eY m3882G(String str) {
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (AbstractC1843ih.m3444h(str.charAt(i2 + 1)) + (AbstractC1843ih.m3444h(str.charAt(i2)) << 4));
        }
        return new C1623eY(bArr);
    }

    /* renamed from: I */
    public static int m3883I(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
    }

    /* renamed from: M */
    public static C1623eY m3884M(String str) {
        C1623eY c1623eY = new C1623eY(str.getBytes(AbstractC2047ma.f6374z));
        c1623eY.f5012w = str;
        return c1623eY;
    }

    /* renamed from: P */
    public static C2056mk m3885P() {
        C2056mk c2056mk = C2056mk.f6389V.f6393Q;
        long nanoTime = System.nanoTime();
        if (c2056mk == null) {
            C2056mk.f6390W.await(C2056mk.f6387G, TimeUnit.MILLISECONDS);
            if (C2056mk.f6389V.f6393Q != null || System.nanoTime() - nanoTime < C2056mk.f6388M) {
                return null;
            }
            return C2056mk.f6389V;
        }
        long j = c2056mk.f6394u - nanoTime;
        if (j > 0) {
            C2056mk.f6390W.await(j, TimeUnit.NANOSECONDS);
            return null;
        }
        C2056mk.f6389V.f6393Q = c2056mk.f6393Q;
        c2056mk.f6393Q = null;
        return c2056mk;
    }

    /* renamed from: R */
    public static boolean m3886R() {
        return AbstractC1292YB.m2695u("Dalvik", System.getProperty("java.vm.name"));
    }

    /* renamed from: V */
    public static EnumC0754O6 m3887V(int i) {
        boolean z;
        for (EnumC0754O6 enumC0754O6 : (EnumC0754O6[]) EnumC0754O6.f2564y.clone()) {
            if (enumC0754O6.f2565S == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return enumC0754O6;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x00db, code lost:
    
        r7 = null;
     */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C1623eY m3888W(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2252qQ.m3888W(java.lang.String):a.eY");
    }

    /* renamed from: h */
    public static final String m3889h(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.f9630N;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr4 = AbstractC1181W6.f3860z;
                    int i13 = b & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr5 = AbstractC1181W6.f3860z;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length == i11) {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    /* renamed from: k */
    public static C1623eY m3890k(byte[] bArr) {
        C1623eY c1623eY = C1623eY.f5009I;
        int length = bArr.length;
        AbstractC0795Op.m1872u(bArr.length, 0, length);
        int i = length + 0;
        AbstractC1292YB.m2676g(i, bArr.length);
        return new C1623eY(Arrays.copyOfRange(bArr, 0, i));
    }

    /* renamed from: o */
    public static byte[] m3891o(List list) {
        C2361sQ c2361sQ = new C2361sQ();
        Iterator it = m3894v(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c2361sQ.m4086nB(str.length());
            c2361sQ.m4071Fu(str);
        }
        return c2361sQ.m4074Lq(c2361sQ.f7260R);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x013e, code lost:
    
        continue;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C2678ya m3892q(p000a.C1623eY... r13) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2252qQ.m3892q(a.eY[]):a.ya");
    }

    /* renamed from: u */
    public static void m3893u(long j, C2361sQ c2361sQ, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        C2361sQ c2361sQ2;
        int i6;
        int i7;
        C2361sQ c2361sQ3;
        long j2;
        int i8 = i;
        if (!(i2 < i3)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (!(((C1623eY) arrayList.get(i9)).mo1980P() >= i8)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        C1623eY c1623eY = (C1623eY) arrayList.get(i2);
        C1623eY c1623eY2 = (C1623eY) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == c1623eY.mo1980P()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            C1623eY c1623eY3 = (C1623eY) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            c1623eY = c1623eY3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c1623eY.mo1987u(i8) != c1623eY2.mo1987u(i8)) {
            int i12 = 1;
            for (int i13 = i4 + 1; i13 < i3; i13++) {
                if (((C1623eY) arrayList.get(i13 - 1)).mo1987u(i8) != ((C1623eY) arrayList.get(i13)).mo1987u(i8)) {
                    i12++;
                }
            }
            long j3 = 4;
            long j4 = (i12 * 2) + (c2361sQ.f7260R / j3) + j + 2;
            c2361sQ.m4088tJ(i12);
            c2361sQ.m4088tJ(i5);
            for (int i14 = i4; i14 < i3; i14++) {
                int mo1987u = ((C1623eY) arrayList.get(i14)).mo1987u(i8);
                if (i14 == i4 || mo1987u != ((C1623eY) arrayList.get(i14 - 1)).mo1987u(i8)) {
                    c2361sQ.m4088tJ(mo1987u & 255);
                }
            }
            C2361sQ c2361sQ4 = new C2361sQ();
            while (i4 < i3) {
                byte mo1987u2 = ((C1623eY) arrayList.get(i4)).mo1987u(i8);
                int i15 = i4 + 1;
                int i16 = i15;
                while (true) {
                    if (i16 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (mo1987u2 != ((C1623eY) arrayList.get(i16)).mo1987u(i8)) {
                            i6 = i16;
                            break;
                        }
                        i16++;
                    }
                }
                if (i15 == i6 && i8 + 1 == ((C1623eY) arrayList.get(i4)).mo1980P()) {
                    c2361sQ.m4088tJ(((Number) arrayList2.get(i4)).intValue());
                    i7 = i6;
                    c2361sQ3 = c2361sQ4;
                    j2 = j3;
                } else {
                    c2361sQ.m4088tJ(((int) ((c2361sQ4.f7260R / j3) + j4)) * i10);
                    i7 = i6;
                    c2361sQ3 = c2361sQ4;
                    j2 = j3;
                    m3893u(j4, c2361sQ4, i8 + 1, arrayList, i4, i7, arrayList2);
                }
                c2361sQ4 = c2361sQ3;
                i4 = i7;
                j3 = j2;
                i10 = -1;
            }
            c2361sQ2 = c2361sQ4;
        } else {
            int min = Math.min(c1623eY.mo1980P(), c1623eY2.mo1980P());
            int i17 = 0;
            for (int i18 = i8; i18 < min && c1623eY.mo1987u(i18) == c1623eY2.mo1987u(i18); i18++) {
                i17++;
            }
            long j5 = 4;
            long j6 = (c2361sQ.f7260R / j5) + j + 2 + i17 + 1;
            c2361sQ.m4088tJ(-i17);
            c2361sQ.m4088tJ(i5);
            int i19 = i8 + i17;
            while (i8 < i19) {
                c2361sQ.m4088tJ(c1623eY.mo1987u(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (!(i19 == ((C1623eY) arrayList.get(i4)).mo1980P())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                c2361sQ.m4088tJ(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                c2361sQ2 = new C2361sQ();
                c2361sQ.m4088tJ(((int) ((c2361sQ2.f7260R / j5) + j6)) * (-1));
                m3893u(j6, c2361sQ2, i19, arrayList, i4, i3, arrayList2);
            }
        }
        c2361sQ.m4075O4(c2361sQ2);
    }

    /* renamed from: v */
    public static ArrayList m3894v(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC1854ix) obj) != EnumC1854ix.f5780R) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1658fB.m3134dx(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC1854ix) it.next()).f5785S);
        }
        return arrayList2;
    }

    @Override // p000a.InterfaceC1428ao
    /* renamed from: N */
    public AbstractC1952kk mo1121N(Class cls, C0945Rm c0945Rm) {
        switch (this.f6936S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return mo1123z(cls);
            default:
                return mo1123z(cls);
        }
    }

    /* renamed from: Q */
    public C0799Ov m3895Q() {
        switch (this.f6936S) {
            case 9:
                if (!m3897w()) {
                    return null;
                }
                return new C0139Ch();
            case 10:
                if (!m3897w()) {
                    return null;
                }
                return new C2529va();
            default:
                try {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) >= 9) {
                        return null;
                    }
                } catch (NumberFormatException unused) {
                }
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    return new C2510vF(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return null;
                }
        }
    }

    /* renamed from: S */
    public InterfaceC0343GZ m3896S() {
        switch (this.f6936S) {
            case 19:
                return C1820iH.f5689h;
            default:
                return C0514Jh.f1708h;
        }
    }

    /* renamed from: w */
    public boolean m3897w() {
        switch (this.f6936S) {
            case 9:
                return C0139Ch.f482N;
            case 10:
                return C2529va.f7744Q;
            case 11:
                return C2168os.f6646N;
            case 12:
            case 13:
            default:
                C0799Ov c0799Ov = C0799Ov.f2726z;
                if (m3886R() && Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 14:
                return C0809P5.f2748N;
        }
    }

    @Override // p000a.InterfaceC1428ao
    /* renamed from: z */
    public AbstractC1952kk mo1123z(Class cls) {
        switch (this.f6936S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C2422td();
            default:
                return new C0401Hd();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2252qQ(int i, int i2) {
        this(29);
        this.f6936S = i;
        switch (i) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                return;
            default:
                this(0);
                return;
        }
    }
}
