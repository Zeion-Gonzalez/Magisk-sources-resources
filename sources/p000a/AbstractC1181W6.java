package p000a;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: a.W6 */
/* loaded from: classes.dex */
public abstract class AbstractC1181W6 {

    /* renamed from: N */
    public static final TimeZone f3854N;

    /* renamed from: P */
    public static final C2678ya f3855P;

    /* renamed from: Q */
    public static final C1939kV f3856Q;

    /* renamed from: h */
    public static final C1494c7 f3857h = C1710g8.m3226U(new String[0]);

    /* renamed from: u */
    public static final String f3858u;

    /* renamed from: v */
    public static final C0679Mq f3859v;

    /* renamed from: z */
    public static final byte[] f3860z;

    static {
        byte[] bArr = new byte[0];
        f3860z = bArr;
        C2361sQ c2361sQ = new C2361sQ();
        c2361sQ.m4083dG(bArr, 0, 0);
        long j = 0;
        f3859v = new C0679Mq((C0003A3) null, j, c2361sQ);
        m2424h(j, j, j);
        C1623eY c1623eY = C1623eY.f5009I;
        f3855P = C2252qQ.m3892q(C2252qQ.m3882G("efbbbf"), C2252qQ.m3882G("feff"), C2252qQ.m3882G("fffe"), C2252qQ.m3882G("0000ffff"), C2252qQ.m3882G("ffff0000"));
        f3854N = TimeZone.getTimeZone("GMT");
        f3856Q = new C1939kV("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String m2578S3 = AbstractC1269Xn.m2578S3("okhttp3.", C0234ES.class.getName());
        if (m2578S3.endsWith("Client")) {
            m2578S3 = m2578S3.substring(0, m2578S3.length() - "Client".length());
        }
        f3858u = m2578S3;
    }

    /* renamed from: E */
    public static final String m2411E(int i, int i2, String str) {
        int m2421V = m2421V(i, i2, str);
        return str.substring(m2421V, m2419S(m2421V, i2, str));
    }

    /* renamed from: G */
    public static final List m2412G(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(AbstractC1292YB.m2661T(Arrays.copyOf(objArr2, objArr2.length)));
    }

    /* renamed from: I */
    public static final int m2413I(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if (!('A' <= c && c < 'G')) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: M */
    public static final int m2414M(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (AbstractC1292YB.m2696w(charAt, 31) <= 0 || AbstractC1292YB.m2696w(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public static final int m2415N(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (AbstractC1269Xn.m2582d3(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: P */
    public static final void m2416P(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC1292YB.m2695u(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Q */
    public static final int m2417Q(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: R */
    public static final String[] m2418R(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: S */
    public static final int m2419S(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (!((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ')) {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static final int m2420U(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: V */
    public static final int m2421V(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (!((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ')) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: W */
    public static final long m2422W(C1429ap c1429ap) {
        String m2897h = c1429ap.f4472k.m2897h("Content-Length");
        if (m2897h != null) {
            try {
                return Long.parseLong(m2897h);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    /* renamed from: g */
    public static final C1494c7 m2423g(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0668Me c0668Me = (C0668Me) it.next();
            String m3077M = c0668Me.f2183z.m3077M();
            String m3077M2 = c0668Me.f2181h.m3077M();
            arrayList.add(m3077M);
            arrayList.add(AbstractC1269Xn.m2580Uf(m3077M2).toString());
        }
        return new C1494c7((String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: h */
    public static final void m2424h(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: k */
    public static final boolean m2425k(InterfaceC0984SS interfaceC0984SS, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long mo3378v = interfaceC0984SS.mo189P().mo3376N() ? interfaceC0984SS.mo189P().mo3378v() - nanoTime : Long.MAX_VALUE;
        interfaceC0984SS.mo189P().mo376P(Math.min(mo3378v, timeUnit.toNanos(i)) + nanoTime);
        try {
            C2361sQ c2361sQ = new C2361sQ();
            while (interfaceC0984SS.mo188M(c2361sQ, 8192L) != -1) {
                c2361sQ.m4091z();
            }
            C1819iG mo189P = interfaceC0984SS.mo189P();
            if (mo3378v == Long.MAX_VALUE) {
                mo189P.mo3379z();
            } else {
                mo189P.mo376P(nanoTime + mo3378v);
            }
            return true;
        } catch (InterruptedIOException unused) {
            C1819iG mo189P2 = interfaceC0984SS.mo189P();
            if (mo3378v == Long.MAX_VALUE) {
                mo189P2.mo3379z();
            } else {
                mo189P2.mo376P(nanoTime + mo3378v);
            }
            return false;
        } catch (Throwable th) {
            C1819iG mo189P3 = interfaceC0984SS.mo189P();
            if (mo3378v == Long.MAX_VALUE) {
                mo189P3.mo3379z();
            } else {
                mo189P3.mo376P(nanoTime + mo3378v);
            }
            throw th;
        }
    }

    /* renamed from: o */
    public static final boolean m2426o(String[] strArr, String[] strArr2, Comparator comparator) {
        boolean z;
        boolean z2;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strArr2 != null) {
            if (strArr2.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                for (String str : strArr) {
                    C2098nX c2098nX = new C2098nX(strArr2);
                    while (c2098nX.hasNext()) {
                        if (comparator.compare(str, (String) c2098nX.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public static final Charset m2427q(InterfaceC0694N7 interfaceC0694N7, Charset charset) {
        Charset charset2;
        int mo1625Z = interfaceC0694N7.mo1625Z(f3855P);
        if (mo1625Z != -1) {
            if (mo1625Z != 0) {
                if (mo1625Z != 1) {
                    if (mo1625Z != 2) {
                        if (mo1625Z != 3) {
                            if (mo1625Z == 4) {
                                Charset charset3 = AbstractC2047ma.f6374z;
                                charset2 = AbstractC2047ma.f6372h;
                                if (charset2 == null) {
                                    charset2 = Charset.forName("UTF-32LE");
                                    AbstractC2047ma.f6372h = charset2;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            Charset charset4 = AbstractC2047ma.f6374z;
                            charset2 = AbstractC2047ma.f6373v;
                            if (charset2 == null) {
                                charset2 = Charset.forName("UTF-32BE");
                                AbstractC2047ma.f6373v = charset2;
                            }
                        }
                        return charset2;
                    }
                    return StandardCharsets.UTF_16LE;
                }
                return StandardCharsets.UTF_16BE;
            }
            return StandardCharsets.UTF_8;
        }
        return charset;
    }

    /* renamed from: s */
    public static final List m2428s(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: u */
    public static final String m2429u(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* renamed from: v */
    public static final void m2430v(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: w */
    public static final boolean m2431w(String str) {
        return AbstractC1269Xn.m2594yF(str, "Authorization") || AbstractC1269Xn.m2594yF(str, "Cookie") || AbstractC1269Xn.m2594yF(str, "Proxy-Authorization") || AbstractC1269Xn.m2594yF(str, "Set-Cookie");
    }

    /* renamed from: y */
    public static final String m2432y(C2658y7 c2658y7, boolean z) {
        int i;
        String str = c2658y7.f8279P;
        if (AbstractC1269Xn.m2591nB(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i2 = c2658y7.f8278N;
        if (!z) {
            String str2 = c2658y7.f8286z;
            if (AbstractC1292YB.m2695u(str2, "http")) {
                i = 80;
            } else if (AbstractC1292YB.m2695u(str2, "https")) {
                i = 443;
            } else {
                i = -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    /* renamed from: z */
    public static final boolean m2433z(C2658y7 c2658y7, C2658y7 c2658y72) {
        return AbstractC1292YB.m2695u(c2658y7.f8279P, c2658y72.f8279P) && c2658y7.f8278N == c2658y72.f8278N && AbstractC1292YB.m2695u(c2658y7.f8286z, c2658y72.f8286z);
    }
}
