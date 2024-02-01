package p000a;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;

/* renamed from: a.YB */
/* loaded from: classes.dex */
public abstract class AbstractC1292YB implements InterfaceC0579Kq {

    /* renamed from: M */
    public static final C0175DP f4134M;

    /* renamed from: V */
    public static final C0175DP f4139V;

    /* renamed from: h */
    public static int f4141h = -1;

    /* renamed from: v */
    public static Context f4144v;

    /* renamed from: z */
    public static Class f4145z;

    /* renamed from: P */
    public static final InterfaceC1171Vv[] f4136P = new InterfaceC1171Vv[0];

    /* renamed from: N */
    public static final byte[] f4135N = {65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};

    /* renamed from: Q */
    public static final int[] f4137Q = {0, -1, 10, 20, 30, 60};

    /* renamed from: u */
    public static final C2496v1 f4143u = new C2496v1(1);

    /* renamed from: o */
    public static final C0175DP f4142o = new C0175DP(1, "CLOSED_EMPTY");

    /* renamed from: W */
    public static final C1665fK f4140W = new C1665fK(14);

    /* renamed from: G */
    public static final C0175DP f4133G = new C0175DP(1, "NO_VALUE");

    /* renamed from: S */
    public static final C0175DP f4138S = new C0175DP(1, "NO_THREAD_ELEMENTS");

    static {
        int i = 1;
        f4134M = new C0175DP(i, "NONE");
        f4139V = new C0175DP(i, "PENDING");
    }

    /* renamed from: B */
    public static boolean m2640B() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: BO */
    public static final C1654f6 m2641BO(InterfaceC1171Vv interfaceC1171Vv, InterfaceC1255XS interfaceC1255XS, Object obj) {
        boolean z;
        C1654f6 c1654f6 = null;
        if (!(interfaceC1171Vv instanceof InterfaceC2683yf)) {
            return null;
        }
        if (interfaceC1255XS.mo107y(C0057B6.f241S) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        InterfaceC2683yf interfaceC2683yf = (InterfaceC2683yf) interfaceC1171Vv;
        while (true) {
            if ((interfaceC2683yf instanceof C0010AA) || (interfaceC2683yf = interfaceC2683yf.mo2966v()) == null) {
                break;
            }
            if (interfaceC2683yf instanceof C1654f6) {
                c1654f6 = (C1654f6) interfaceC2683yf;
                break;
            }
        }
        if (c1654f6 != null) {
            c1654f6.m3126l(interfaceC1255XS, obj);
        }
        return c1654f6;
    }

    /* renamed from: C */
    public static final int m2642C(List list) {
        return list.size() - 1;
    }

    /* renamed from: D */
    public static String m2643D(File file) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), AbstractC2047ma.f6374z);
        try {
            StringWriter stringWriter = new StringWriter();
            AbstractC0438II.m1042q(inputStreamReader, stringWriter);
            String stringWriter2 = stringWriter.toString();
            m2659R(inputStreamReader, null);
            return stringWriter2;
        } finally {
        }
    }

    /* renamed from: E */
    public static void m2644E(String str, Exception exc) {
        Log.d(str, "", exc);
    }

    /* renamed from: EC */
    public static final C0325GF m2645EC(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            C0325GF c0325gf = C0325GF.f1103I;
            return C0325GF.f1103I;
        }
        return new C0325GF(i, i2 - 1);
    }

    /* renamed from: F */
    public static Context m2646F() {
        if (f4144v == null) {
            try {
                Context context = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                while (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                f4144v = context;
            } catch (Exception e) {
                m2644E("LIBSU", e);
            }
        }
        return f4144v;
    }

    /* renamed from: G */
    public static final C1000Sl m2647G(C1000Sl c1000Sl) {
        C0642M4 c0642m4 = c1000Sl.f3359S;
        c0642m4.m1438h();
        c0642m4.f2074f = true;
        if (c0642m4.f2080y <= 0) {
            C0642M4 c0642m42 = C0642M4.f2068r;
        }
        if (c0642m4.f2080y <= 0) {
            return C1000Sl.f3358R;
        }
        return c1000Sl;
    }

    /* renamed from: H */
    public static ByteBuffer m2648H(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 >= position && i2 <= limit) {
                byteBuffer.limit(i2);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i2);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4188N("size: ", i));
    }

    /* renamed from: HL */
    public static final C0760OC m2649HL(C0325GF c0325gf, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            if (c0325gf.f2578w <= 0) {
                i = -i;
            }
            return new C0760OC(c0325gf.f2577S, c0325gf.f2576R, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* renamed from: I */
    public static final C0823PM m2650I(InterfaceC2364sT... interfaceC2364sTArr) {
        int i = 1;
        if (interfaceC2364sTArr.length > 0) {
            return new C0823PM(i, interfaceC2364sTArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: J */
    public static final String m2651J(long j) {
        StringBuilder sb;
        long j2;
        long j3;
        long j4;
        if (j > -999500000) {
            if (j > -999500) {
                if (j <= 0) {
                    sb = new StringBuilder();
                    j4 = j - 500;
                } else if (j < 999500) {
                    sb = new StringBuilder();
                    j4 = j + 500;
                } else if (j < 999500000) {
                    sb = new StringBuilder();
                    j3 = j + 500000;
                } else {
                    sb = new StringBuilder();
                    j2 = j + 500000000;
                }
                sb.append(j4 / 1000);
                sb.append(" µs");
                return String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
            }
            sb = new StringBuilder();
            j3 = j - 500000;
            sb.append(j3 / 1000000);
            sb.append(" ms");
            return String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
        }
        sb = new StringBuilder();
        j2 = j - 500000000;
        sb.append(j2 / 1000000000);
        sb.append(" s ");
        return String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
    }

    /* renamed from: K */
    public static final Object m2652K(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* renamed from: L */
    public static int m2653L(int i) {
        if (i == 513) {
            return 0;
        }
        if (i == 514) {
            return 1;
        }
        if (i == 769) {
            return 0;
        }
        if (i == 770) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 0;
            case 258:
            case 260:
                return 1;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i & (-1)));
        }
    }

    /* renamed from: M */
    public static final C0993Sd m2654M(InterfaceC2364sT interfaceC2364sT, Object obj, C0993Sd c0993Sd) {
        try {
            interfaceC2364sT.mo85W(obj);
        } catch (Throwable th) {
            if (c0993Sd != null && c0993Sd.getCause() != th) {
                m2655N(c0993Sd, th);
            } else {
                return new C0993Sd(AbstractC2441tz.m4201o("Exception in undelivered element handler for ", obj), th);
            }
        }
        return c0993Sd;
    }

    /* renamed from: N */
    public static final void m2655N(Throwable th, Throwable th2) {
        boolean z;
        if (th != th2) {
            Integer num = AbstractC0341GX.f1152z;
            if (num != null && num.intValue() < 19) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1030TK.f3435z;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* renamed from: O */
    public static final boolean m2656O(AssertionError assertionError) {
        boolean z;
        Logger logger = AbstractC0982SQ.f3316z;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z = AbstractC1269Xn.m2591nB(message, "getsockname failed", false);
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public static final void m2657P(AbstractC1986lN abstractC1986lN, C1956ko c1956ko, String str) {
        C0634Lw.f2050W.fine(c1956ko.f6059h + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC1986lN.f6159z);
    }

    /* renamed from: Q */
    public static boolean m2658Q(AbstractC1593e abstractC1593e, AbstractC1593e abstractC1593e2) {
        return abstractC1593e == abstractC1593e2 || !(abstractC1593e == null || abstractC1593e2 == null || !abstractC1593e.equals(abstractC1593e2));
    }

    /* renamed from: R */
    public static final void m2659R(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                m2655N(th, th2);
            }
        }
    }

    /* renamed from: S */
    public static void m2660S(C0776OS c0776os) {
        while (c0776os.available() != 0) {
            try {
                c0776os.skip(c0776os.available());
            } catch (IOException unused) {
                return;
            }
        }
    }

    /* renamed from: T */
    public static final List m2661T(Object... objArr) {
        if (objArr.length > 0) {
            return Arrays.asList(objArr);
        }
        return C1239X8.f4021S;
    }

    /* renamed from: U */
    public static final boolean m2662U(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: U8 */
    public static final Object m2663U8(InterfaceC1255XS interfaceC1255XS, Object obj) {
        if (obj == null) {
            obj = interfaceC1255XS.mo106x(0, C0582Ku.f1893s);
        }
        if (obj == 0) {
            return f4138S;
        }
        if (obj instanceof Integer) {
            return interfaceC1255XS.mo106x(new C1135VF(interfaceC1255XS, ((Number) obj).intValue()), C0582Ku.f1887E);
        }
        AbstractC2441tz.m4202q(obj);
        throw null;
    }

    /* renamed from: UZ */
    public static final void m2664UZ(Object obj) {
        if (obj instanceof C1019T6) {
            throw ((C1019T6) obj).f3412S;
        }
    }

    /* renamed from: V */
    public static final void m2665V(int i) {
        boolean z;
        C0325GF c0325gf = new C0325GF(2, 36);
        if (2 <= i && i <= c0325gf.f2576R) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C0325GF(2, 36));
    }

    /* renamed from: W */
    public static final C0903R2 m2666W(InterfaceC2364sT interfaceC2364sT, Object obj, InterfaceC1255XS interfaceC1255XS) {
        return new C0903R2(4, interfaceC2364sT, obj, interfaceC1255XS);
    }

    /* renamed from: X */
    public static int m2667X(int i) {
        if (i != 0) {
            if (i == 1) {
                return 64;
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("Unknown content digest algorithm: ", i));
        }
        return 32;
    }

    /* renamed from: Y */
    public static final InterfaceC1255XS m2668Y(InterfaceC1255XS interfaceC1255XS, InterfaceC1255XS interfaceC1255XS2, boolean z) {
        Boolean bool = Boolean.FALSE;
        C0582Ku c0582Ku = C0582Ku.f1890g;
        boolean booleanValue = ((Boolean) interfaceC1255XS.mo106x(bool, c0582Ku)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC1255XS2.mo106x(bool, c0582Ku)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC1255XS.mo104G(interfaceC1255XS2);
        }
        C1640ep c1640ep = new C1640ep();
        c1640ep.f5100S = interfaceC1255XS2;
        C0070BN c0070bn = C0070BN.f302S;
        InterfaceC1255XS interfaceC1255XS3 = (InterfaceC1255XS) interfaceC1255XS.mo106x(c0070bn, new C0646M8(c1640ep, z, 2));
        if (booleanValue2) {
            c1640ep.f5100S = ((InterfaceC1255XS) c1640ep.f5100S).mo106x(c0070bn, C0582Ku.f1891k);
        }
        return interfaceC1255XS3.mo104G((InterfaceC1255XS) c1640ep.f5100S);
    }

    /* renamed from: Yd */
    public static long m2669Yd(String str) {
        boolean z;
        int i;
        char c;
        int length = str.length();
        boolean z2 = true;
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (length > str.length()) {
                z2 = false;
            }
            if (z2) {
                long j = 0;
                int i2 = 0;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < 128) {
                        j++;
                    } else {
                        if (charAt < 2048) {
                            i = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i3 = i2 + 1;
                            if (i3 < length) {
                                c = str.charAt(i3);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j += 4;
                                i2 += 2;
                            } else {
                                j++;
                                i2 = i3;
                            }
                        } else {
                            i = 3;
                        }
                        j += i;
                    }
                    i2++;
                }
                return j;
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + length + " > " + str.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + length + " < 0").toString());
    }

    /* renamed from: Z */
    public static final Class m2670Z(InterfaceC1367Zb interfaceC1367Zb) {
        Class mo1318z = ((InterfaceC0592L4) interfaceC1367Zb).mo1318z();
        if (!mo1318z.isPrimitive()) {
            return mo1318z;
        }
        String name = mo1318z.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? mo1318z : Double.class;
            case 104431:
                return !name.equals("int") ? mo1318z : Integer.class;
            case 3039496:
                return !name.equals("byte") ? mo1318z : Byte.class;
            case 3052374:
                return !name.equals("char") ? mo1318z : Character.class;
            case 3327612:
                return !name.equals("long") ? mo1318z : Long.class;
            case 3625364:
                return !name.equals("void") ? mo1318z : Void.class;
            case 64711720:
                return !name.equals("boolean") ? mo1318z : Boolean.class;
            case 97526364:
                return !name.equals("float") ? mo1318z : Float.class;
            case 109413500:
                return !name.equals("short") ? mo1318z : Short.class;
            default:
                return mo1318z;
        }
    }

    /* renamed from: b */
    public static final int m2671b(C0855Px c0855Px, int i) {
        int i2;
        int i3 = i + 1;
        int length = c0855Px.f2893q.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = c0855Px.f2892k[i2];
                if (i5 < i3) {
                    i4 = i2 + 1;
                } else {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        if (i2 < 0) {
            return ~i2;
        }
        return i2;
    }

    /* renamed from: c */
    public static byte[] m2672c(C2274qo c2274qo, HashMap hashMap) {
        byte[] bArr;
        if (!c2274qo.f6991h.isEmpty()) {
            PublicKey publicKey = ((X509Certificate) c2274qo.f6991h.get(0)).getPublicKey();
            Object obj = null;
            if ("X.509".equals(publicKey.getFormat())) {
                bArr = publicKey.getEncoded();
            } else {
                bArr = null;
            }
            if (bArr == null) {
                try {
                    bArr = ((X509EncodedKeySpec) KeyFactory.getInstance(publicKey.getAlgorithm()).getKeySpec(publicKey, X509EncodedKeySpec.class)).getEncoded();
                } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                    throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName(), e);
                }
            }
            if (bArr != null && bArr.length != 0) {
                C1624eZ c1624eZ = new C1624eZ(obj);
                try {
                    List list = c2274qo.f6991h;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((X509Certificate) it.next()).getEncoded());
                    }
                    c1624eZ.f5015w = arrayList;
                    ArrayList arrayList2 = new ArrayList(c2274qo.f6992v.size());
                    Iterator it2 = c2274qo.f6992v.iterator();
                    while (it2.hasNext()) {
                        int intValue = ((Integer) it2.next()).intValue();
                        int m2653L = m2653L(intValue);
                        byte[] bArr2 = (byte[]) hashMap.get(Integer.valueOf(m2653L));
                        if (bArr2 != null) {
                            arrayList2.add(new C2624xM(Integer.valueOf(intValue), bArr2));
                        } else {
                            throw new RuntimeException(m2674e(m2653L) + " content digest for " + m2678i(intValue) + " not computed");
                        }
                    }
                    c1624eZ.f5013R = arrayList2;
                    C1174Vy c1174Vy = new C1174Vy(obj);
                    List list2 = (List) c1624eZ.f5015w;
                    c1174Vy.f3828R = m2698y(new byte[][]{m2693s(arrayList2), m2698y((byte[][]) list2.toArray(new byte[list2.size()])), new byte[0]});
                    c1174Vy.f3827I = bArr;
                    c1174Vy.f3830w = new ArrayList();
                    Iterator it3 = c2274qo.f6992v.iterator();
                    while (it3.hasNext()) {
                        int intValue2 = ((Integer) it3.next()).intValue();
                        C2624xM m2678i = m2678i(intValue2);
                        String str = (String) m2678i.f8141z;
                        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) m2678i.f8140h;
                        try {
                            Signature signature = Signature.getInstance(str);
                            signature.initSign(c2274qo.f6993z);
                            if (algorithmParameterSpec != null) {
                                signature.setParameter(algorithmParameterSpec);
                            }
                            signature.update((byte[]) c1174Vy.f3828R);
                            byte[] sign = signature.sign();
                            try {
                                Signature signature2 = Signature.getInstance(str);
                                signature2.initVerify(publicKey);
                                if (algorithmParameterSpec != null) {
                                    signature2.setParameter(algorithmParameterSpec);
                                }
                                signature2.update((byte[]) c1174Vy.f3828R);
                                if (signature2.verify(sign)) {
                                    ((List) c1174Vy.f3830w).add(new C2624xM(Integer.valueOf(intValue2), sign));
                                } else {
                                    throw new SignatureException("Signature did not verify");
                                }
                            } catch (InvalidAlgorithmParameterException e2) {
                                e = e2;
                                throw new SignatureException(AbstractC2441tz.m4184G("Failed to verify generated ", str, " signature using public key from certificate"), e);
                            } catch (InvalidKeyException e3) {
                                throw new InvalidKeyException(AbstractC2441tz.m4184G("Failed to verify generated ", str, " signature using public key from certificate"), e3);
                            } catch (NoSuchAlgorithmException e4) {
                                e = e4;
                                throw new SignatureException(AbstractC2441tz.m4184G("Failed to verify generated ", str, " signature using public key from certificate"), e);
                            } catch (SignatureException e5) {
                                e = e5;
                                throw new SignatureException(AbstractC2441tz.m4184G("Failed to verify generated ", str, " signature using public key from certificate"), e);
                            }
                        } catch (InvalidAlgorithmParameterException e6) {
                            e = e6;
                            throw new SignatureException(AbstractC2441tz.m4200k("Failed sign using ", str), e);
                        } catch (InvalidKeyException e7) {
                            throw new InvalidKeyException(AbstractC2441tz.m4200k("Failed sign using ", str), e7);
                        } catch (NoSuchAlgorithmException e8) {
                            e = e8;
                            throw new SignatureException(AbstractC2441tz.m4200k("Failed sign using ", str), e);
                        } catch (SignatureException e9) {
                            e = e9;
                            throw new SignatureException(AbstractC2441tz.m4200k("Failed sign using ", str), e);
                        }
                    }
                    return m2698y(new byte[][]{(byte[]) c1174Vy.f3828R, m2693s((List) c1174Vy.f3830w), (byte[]) c1174Vy.f3827I});
                } catch (CertificateEncodingException e10) {
                    throw new SignatureException("Failed to encode certificates", e10);
                }
            }
            throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName());
        }
        throw new SignatureException("No certificates configured for signer");
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC1279Xy m2673d(InterfaceC1265Xh interfaceC1265Xh, boolean z, AbstractC1380Zq abstractC1380Zq, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ((C0757O9) interfaceC1265Xh).m1746e(z, (i & 2) != 0, abstractC1380Zq);
    }

    /* renamed from: e */
    public static String m2674e(int i) {
        if (i != 0) {
            if (i == 1) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("Unknown content digest algorithm: ", i));
        }
        return "SHA-256";
    }

    /* renamed from: f */
    public static Object m2675f(String str, InterfaceC0559KW interfaceC0559KW, InterfaceC1171Vv interfaceC1171Vv) {
        return AbstractC0438II.m1021ZH(AbstractC0037Al.f178h, new C1513cV(str, interfaceC0559KW, null), interfaceC1171Vv);
    }

    /* renamed from: g */
    public static final void m2676g(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* renamed from: he */
    public static void m2677he(File file, String str) {
        byte[] bytes = str.getBytes(AbstractC2047ma.f6374z);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes);
            m2659R(fileOutputStream, null);
        } finally {
        }
    }

    /* renamed from: i */
    public static C2624xM m2678i(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    if (i != 770) {
                        switch (i) {
                            case 257:
                                return new C2624xM("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                            case 258:
                                return new C2624xM("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                            case 259:
                                return new C2624xM("SHA256withRSA", null);
                            case 260:
                                return new C2624xM("SHA512withRSA", null);
                            default:
                                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i & (-1)));
                        }
                    }
                    return new C2624xM("SHA512withDSA", null);
                }
                return new C2624xM("SHA256withDSA", null);
            }
            return new C2624xM("SHA512withECDSA", null);
        }
        return new C2624xM("SHA256withECDSA", null);
    }

    /* renamed from: j */
    public static final int m2679j(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
            return i2;
        }
        if (i3 < 0) {
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i2 + i10;
            }
            return i2;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: k */
    public static HashMap m2680k(HashSet hashSet, ByteBuffer[] byteBufferArr) {
        int i = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            i += ((byteBuffer.remaining() + 1048576) - 1) / 1048576;
        }
        HashMap hashMap = new HashMap(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            byte[] bArr = new byte[(m2667X(intValue) * i) + 5];
            bArr[0] = 90;
            m2686nP(bArr, i);
            hashMap.put(Integer.valueOf(intValue), bArr);
        }
        byte[] bArr2 = new byte[5];
        bArr2[0] = -91;
        int i2 = 0;
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            while (byteBuffer2.hasRemaining()) {
                ByteBuffer m2648H = m2648H(byteBuffer2, Math.min(byteBuffer2.remaining(), 1048576));
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    int intValue2 = ((Integer) it2.next()).intValue();
                    String m2674e = m2674e(intValue2);
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(m2674e);
                        m2648H.clear();
                        m2686nP(bArr2, m2648H.remaining());
                        messageDigest.update(bArr2);
                        messageDigest.update(m2648H);
                        byte[] bArr3 = (byte[]) hashMap.get(Integer.valueOf(intValue2));
                        int m2667X = m2667X(intValue2);
                        int digest = messageDigest.digest(bArr3, (i2 * m2667X) + 5, m2667X);
                        if (digest != m2667X) {
                            throw new DigestException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                    } catch (NoSuchAlgorithmException e) {
                        throw new DigestException(m2674e.concat(" MessageDigest not supported"), e);
                    }
                }
                i2++;
            }
        }
        HashMap hashMap2 = new HashMap(hashSet.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue3 = ((Integer) entry.getKey()).intValue();
            byte[] bArr4 = (byte[]) entry.getValue();
            String m2674e2 = m2674e(intValue3);
            try {
                hashMap2.put(Integer.valueOf(intValue3), MessageDigest.getInstance(m2674e2).digest(bArr4));
            } catch (NoSuchAlgorithmException e2) {
                throw new DigestException(m2674e2.concat(" MessageDigest not supported"), e2);
            }
        }
        return hashMap2;
    }

    /* renamed from: l */
    public static void m2681l(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* renamed from: m */
    public static final void m2682m(InterfaceC1255XS interfaceC1255XS, Object obj) {
        if (obj == f4138S) {
            return;
        }
        if (obj instanceof C1135VF) {
            C1135VF c1135vf = (C1135VF) obj;
            InterfaceC0838Pd[] interfaceC0838PdArr = c1135vf.f3707h;
            int length = interfaceC0838PdArr.length - 1;
            if (length < 0) {
                return;
            }
            InterfaceC0838Pd interfaceC0838Pd = interfaceC0838PdArr[length];
            Object obj2 = c1135vf.f3708z[length];
            throw null;
        }
        AbstractC2441tz.m4202q(interfaceC1255XS.mo106x(null, C0582Ku.f1889U));
        throw null;
    }

    /* renamed from: n */
    public static boolean m2683n() {
        Boolean bool;
        synchronized (AbstractC1292YB.class) {
            int i = f4141h;
            bool = null;
            if (i < 0) {
                if (Process.myUid() == 0) {
                    f4141h = 2;
                    bool = Boolean.TRUE;
                } else {
                    for (String str : System.getenv("PATH").split(":")) {
                        if (new File(str, "su").canExecute()) {
                            f4141h = 1;
                            break;
                        }
                    }
                    f4141h = 0;
                    bool = Boolean.FALSE;
                }
            } else {
                if (i != 0) {
                    if (i != 2) {
                    }
                    bool = Boolean.TRUE;
                }
                bool = Boolean.FALSE;
            }
        }
        return Objects.equals(bool, Boolean.FALSE);
    }

    /* renamed from: n0 */
    public static String m2684n0(Map map) {
        return "(" + AbstractC2486us.m4276EQ(map.keySet(), ",", null, null, null, 62) + ") VALUES(" + AbstractC2486us.m4276EQ(map.values(), ",", null, null, C1980lF.f6129X, 30) + ")";
    }

    /* renamed from: nF */
    public static int m2685nF(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) m2688od(str, i, i2, i3);
    }

    /* renamed from: nP */
    public static void m2686nP(byte[] bArr, int i) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) ((i >> 16) & 255);
        bArr[4] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: o */
    public static final C2049mc m2687o(int i, Object... objArr) {
        return new C2049mc(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0054  */
    /* renamed from: od */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long m2688od(java.lang.String r21, long r22, long r24, long r26) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1292YB.m2688od(java.lang.String, long, long, long):long");
    }

    /* renamed from: p */
    public static final C1525cm m2689p(InterfaceC1171Vv interfaceC1171Vv) {
        C1525cm c1525cm;
        C1525cm c1525cm2;
        boolean z;
        boolean z2 = true;
        if (!(interfaceC1171Vv instanceof C2266qf)) {
            return new C1525cm(1, interfaceC1171Vv);
        }
        C2266qf c2266qf = (C2266qf) interfaceC1171Vv;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2266qf.f6966y;
            Object obj = atomicReferenceFieldUpdater.get(c2266qf);
            C0175DP c0175dp = AbstractC2575wW.f7870U;
            c1525cm = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c2266qf, c0175dp);
                c1525cm2 = null;
                break;
            }
            if (obj instanceof C1525cm) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(c2266qf, obj, c0175dp)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(c2266qf) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    c1525cm2 = (C1525cm) obj;
                    break;
                }
            } else if (obj != c0175dp && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1525cm2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1525cm.f4705g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1525cm2);
            if ((obj2 instanceof C0840Pf) && ((C0840Pf) obj2).f2836P != null) {
                c1525cm2.m2967w();
                z2 = false;
            } else {
                C1525cm.f4706k.set(c1525cm2, 536870911);
                atomicReferenceFieldUpdater2.set(c1525cm2, C1111Uo.f3615S);
            }
            if (z2) {
                c1525cm = c1525cm2;
            }
            if (c1525cm != null) {
                return c1525cm;
            }
        }
        return new C1525cm(2, interfaceC1171Vv);
    }

    /* renamed from: q */
    public static final int m2690q(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: qn */
    public static final Object m2691qn(C2485ur c2485ur, C2485ur c2485ur2, InterfaceC0559KW interfaceC0559KW) {
        Object c1663fI;
        Object m1744Z;
        try {
            AbstractC0438II.m995G(2, interfaceC0559KW);
            c1663fI = interfaceC0559KW.mo51o(c2485ur2, c2485ur);
        } catch (Throwable th) {
            c1663fI = new C1663fI(th, false);
        }
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        if (c1663fI != enumC0464Im && (m1744Z = c2485ur.m1744Z(c1663fI)) != AbstractC0438II.f1461g) {
            if (!(m1744Z instanceof C1663fI)) {
                return AbstractC0438II.m1028he(m1744Z);
            }
            throw ((C1663fI) m1744Z).f5199z;
        }
        return enumC0464Im;
    }

    /* renamed from: r */
    public static String m2692r(AbstractC0017AI abstractC0017AI, String... strArr) {
        boolean z;
        C1996lX c1996lX = (C1996lX) abstractC0017AI;
        c1996lX.getClass();
        C0434IE c0434ie = new C0434IE(c1996lX);
        c0434ie.m971O4(strArr);
        c0434ie.f1418I = new ArrayList();
        c0434ie.f1421q = null;
        List list = c0434ie.m972d3().f2986z;
        if (list == null) {
            list = Collections.emptyList();
        }
        if (list != null && list.size() != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!TextUtils.isEmpty((String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return (String) list.get(list.size() - 1);
        }
        return "";
    }

    /* renamed from: s */
    public static byte[] m2693s(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((byte[]) ((C2624xM) it.next()).f8140h).length + 12;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C2624xM c2624xM = (C2624xM) it2.next();
            byte[] bArr = (byte[]) c2624xM.f8140h;
            allocate.putInt(bArr.length + 8);
            allocate.putInt(((Integer) c2624xM.f8141z).intValue());
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: t */
    public static final ArrayList m2694t(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C1398aE(objArr, true));
    }

    /* renamed from: u */
    public static boolean m2695u(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: w */
    public static int m2696w(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: x */
    public static final boolean m2697x(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: y */
    public static byte[] m2698y(byte[][] bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        for (byte[] bArr3 : bArr) {
            allocate.putInt(bArr3.length);
            allocate.put(bArr3);
        }
        return allocate.array();
    }

    /* renamed from: zx */
    public static final void m2699zx() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @Override // p000a.InterfaceC0579Kq
    /* renamed from: h */
    public void mo1309h(View view) {
    }

    @Override // p000a.InterfaceC0579Kq
    /* renamed from: v */
    public void mo1310v() {
    }
}
