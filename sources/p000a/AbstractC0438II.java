package p000a;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: a.II */
/* loaded from: classes.dex */
public abstract class AbstractC0438II implements InterfaceC1435aw {

    /* renamed from: U */
    public static final C0175DP f1457U;

    /* renamed from: g */
    public static final C0175DP f1461g;

    /* renamed from: k */
    public static final C0175DP f1462k;

    /* renamed from: s */
    public static final C0175DP f1465s;

    /* renamed from: y */
    public static final C0175DP f1467y;

    /* renamed from: S */
    public static final C0175DP f1456S = new C0175DP(1, "NO_DECISION");

    /* renamed from: R */
    public static final int[] f1455R = new int[0];

    /* renamed from: w */
    public static final Object[] f1466w = new Object[0];

    /* renamed from: I */
    public static final C0782OY f1453I = new C0782OY();

    /* renamed from: q */
    public static final C0270F9 f1463q = new C0270F9();

    /* renamed from: E */
    public static final C0348Ge f1451E = new C0348Ge(false);

    /* renamed from: f */
    public static final C0348Ge f1460f = new C0348Ge(true);

    /* renamed from: r */
    public static final C0175DP f1464r = new C0175DP(1, "NULL");

    /* renamed from: Y */
    public static final byte[] f1458Y = {112, 114, 111, 0};

    /* renamed from: J */
    public static final byte[] f1454J = {112, 114, 109, 0};

    /* renamed from: c */
    public static final C2496v1 f1459c = new C2496v1(3);

    /* renamed from: H */
    public static final int[] f1452H = {16843848};

    static {
        int i = 1;
        f1462k = new C0175DP(i, "COMPLETING_ALREADY");
        f1461g = new C0175DP(i, "COMPLETING_WAITING_CHILDREN");
        f1467y = new C0175DP(i, "COMPLETING_RETRY");
        f1465s = new C0175DP(i, "TOO_LATE_TO_CANCEL");
        f1457U = new C0175DP(i, "SEALED");
    }

    /* renamed from: B */
    public static C0836Pa[] m988B(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0836Pa[0];
        }
        C0836Pa[] c0836PaArr = new C0836Pa[i];
        for (int i2 = 0; i2 < i; i2++) {
            int m4387BO = AbstractC2575wW.m4387BO(byteArrayInputStream);
            int m4387BO2 = AbstractC2575wW.m4387BO(byteArrayInputStream);
            c0836PaArr[i2] = new C0836Pa(str, new String(AbstractC2575wW.m4414UZ(byteArrayInputStream, m4387BO), StandardCharsets.UTF_8), AbstractC2575wW.m4413U8(byteArrayInputStream, 4), m4387BO2, (int) AbstractC2575wW.m4413U8(byteArrayInputStream, 4), (int) AbstractC2575wW.m4413U8(byteArrayInputStream, 4), new int[m4387BO2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0836Pa c0836Pa = c0836PaArr[i3];
            int available = byteArrayInputStream.available() - c0836Pa.f2827Q;
            int i4 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c0836Pa.f2828W;
                if (available2 <= available) {
                    break;
                }
                i4 += AbstractC2575wW.m4387BO(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i4), 1);
                for (int m4387BO3 = AbstractC2575wW.m4387BO(byteArrayInputStream); m4387BO3 > 0; m4387BO3--) {
                    AbstractC2575wW.m4387BO(byteArrayInputStream);
                    int m4413U8 = (int) AbstractC2575wW.m4413U8(byteArrayInputStream, 1);
                    if (m4413U8 != 6 && m4413U8 != 7) {
                        while (m4413U8 > 0) {
                            AbstractC2575wW.m4413U8(byteArrayInputStream, 1);
                            for (int m4413U82 = (int) AbstractC2575wW.m4413U8(byteArrayInputStream, 1); m4413U82 > 0; m4413U82--) {
                                AbstractC2575wW.m4387BO(byteArrayInputStream);
                            }
                            m4413U8--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                c0836Pa.f2830o = m1024d(byteArrayInputStream, c0836Pa.f2825N);
                int i5 = c0836Pa.f2831u;
                BitSet valueOf = BitSet.valueOf(AbstractC2575wW.m4414UZ(byteArrayInputStream, ((((i5 * 2) + 8) - 1) & (-8)) / 8));
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = 2;
                    if (!valueOf.get(m1041p(2, i6, i5))) {
                        i7 = 0;
                    }
                    if (valueOf.get(m1041p(4, i6, i5))) {
                        i7 |= 4;
                    }
                    if (i7 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return c0836PaArr;
    }

    /* renamed from: BO */
    public static String m989BO(String str) {
        if ((!AbstractC1269Xn.m2579T0("|")) != false) {
            List m2595zd = AbstractC1269Xn.m2595zd(str);
            int size = (m2595zd.size() * 0) + str.length();
            C0741Nu c0741Nu = C0741Nu.f2533d;
            int m2642C = AbstractC1292YB.m2642C(m2595zd);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : m2595zd) {
                int i2 = i + 1;
                String str2 = null;
                if (i >= 0) {
                    String str3 = (String) obj;
                    if ((i != 0 && i != m2642C) || !AbstractC1269Xn.m2579T0(str3)) {
                        int length = str3.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if ((!AbstractC1292YB.m2697x(str3.charAt(i3))) == true) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 != -1 && AbstractC1269Xn.m2587hW(str3, "|", i3, false)) {
                            str2 = str3.substring("|".length() + i3);
                        }
                        if (str2 == null || (str2 = (String) c0741Nu.mo85W(str2)) == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i = i2;
                } else {
                    AbstractC1292YB.m2699zx();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(size);
            AbstractC2486us.m4295yF(arrayList, sb, "\n", "", "", -1, "...", null);
            return sb.toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: C */
    public static final int m990C(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: D */
    public static final void m991D(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0096 A[LOOP:1: B:108:0x0053->B:123:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x009a A[EDGE_INSN: B:181:0x009a->B:125:0x009a BREAK  A[LOOP:1: B:108:0x0053->B:123:0x0096], SYNTHETIC] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C0073BQ m992E(android.content.Context r22, p000a.C2226py r23) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0438II.m992E(android.content.Context, a.py):a.BQ");
    }

    /* renamed from: EC */
    public static void m993EC(String str, Object obj) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + str);
        AbstractC1292YB.m2681l(AbstractC0438II.class.getName(), classCastException);
        throw classCastException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.D, a.RV] */
    /* renamed from: F */
    public static C0931RV m994F(InterfaceC1725gU interfaceC1725gU, AbstractC1859j1 abstractC1859j1, InterfaceC0559KW interfaceC0559KW, int i) {
        int i2;
        C1033TN c1033tn;
        InterfaceC1255XS interfaceC1255XS = abstractC1859j1;
        if ((i & 1) != 0) {
            interfaceC1255XS = C0070BN.f302S;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        InterfaceC1255XS m2668Y = AbstractC1292YB.m2668Y(interfaceC1725gU.mo311C(), interfaceC1255XS, true);
        C1080UE c1080ue = AbstractC0037Al.f179z;
        if (m2668Y != c1080ue && m2668Y.mo107y(C1710g8.f5377R) == null) {
            m2668Y = m2668Y.mo104G(c1080ue);
        }
        if (i2 != 0) {
            if (i2 == 2) {
                z = true;
            }
            if (z) {
                c1033tn = new C1033TN(m2668Y, interfaceC0559KW);
            } else {
                c1033tn = new C0931RV(m2668Y, true);
            }
            c1033tn.m312D(i2, c1033tn, interfaceC0559KW);
            return c1033tn;
        }
        throw null;
    }

    /* renamed from: G */
    public static void m995G(int i, Object obj) {
        int i2;
        if (obj != null) {
            boolean z = false;
            if (obj instanceof InterfaceC1738gi) {
                if (obj instanceof InterfaceC0225EG) {
                    i2 = ((InterfaceC0225EG) obj).mo252P();
                } else if (obj instanceof InterfaceC1459bP) {
                    i2 = 0;
                } else if (obj instanceof InterfaceC2364sT) {
                    i2 = 1;
                } else if (obj instanceof InterfaceC0559KW) {
                    i2 = 2;
                } else if (obj instanceof InterfaceC0548KJ) {
                    i2 = 3;
                } else if (obj instanceof C1929kI) {
                    i2 = 4;
                } else if (obj instanceof InterfaceC1029TJ) {
                    i2 = 5;
                } else {
                    i2 = -1;
                }
                if (i2 == i) {
                    z = true;
                }
            }
            if (!z) {
                m993EC("kotlin.jvm.functions.Function" + i, obj);
                throw null;
            }
        }
    }

    /* renamed from: H */
    public static void m996H(int i, C1628ed c1628ed, C0847Pp c0847Pp, boolean z) {
        boolean z2;
        C0287FS c0287fs;
        C0287FS c0287fs2;
        Iterator it;
        boolean z3;
        C0287FS c0287fs3;
        C0287FS c0287fs4;
        if (c1628ed.f5047V) {
            return;
        }
        if (!(c1628ed instanceof C1535cx) && c1628ed.m3089E() && m1010S(c1628ed)) {
            C1535cx.m2976x(c1628ed, c0847Pp, new C0782OY());
        }
        C0287FS mo3091G = c1628ed.mo3091G(EnumC0494JK.f1646S);
        C0287FS mo3091G2 = c1628ed.mo3091G(EnumC0494JK.f1650w);
        int m588P = mo3091G.m588P();
        int m588P2 = mo3091G2.m588P();
        HashSet hashSet = mo3091G.f1000z;
        if (hashSet != null && mo3091G.f999v) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C0287FS c0287fs5 = (C0287FS) it2.next();
                C1628ed c1628ed2 = c0287fs5.f993P;
                int i2 = i + 1;
                boolean m1010S = m1010S(c1628ed2);
                if (c1628ed2.m3089E() && m1010S) {
                    C1535cx.m2976x(c1628ed2, c0847Pp, new C0782OY());
                }
                C0287FS c0287fs6 = c1628ed2.f5022C;
                C0287FS c0287fs7 = c1628ed2.f5064j;
                if ((c0287fs5 == c0287fs6 && (c0287fs4 = c0287fs7.f994Q) != null && c0287fs4.f999v) || (c0287fs5 == c0287fs7 && (c0287fs3 = c0287fs6.f994Q) != null && c0287fs3.f999v)) {
                    it = it2;
                    z3 = true;
                } else {
                    it = it2;
                    z3 = false;
                }
                int i3 = c1628ed2.f5030Ha[0];
                if (i3 == 3 && !m1010S) {
                    if (i3 == 3 && c1628ed2.f5078s >= 0 && c1628ed2.f5084y >= 0 && ((c1628ed2.f5046UZ == 8 || (c1628ed2.f5075q == 0 && c1628ed2.f5067m == 0.0f)) && !c1628ed2.m3113s() && !c1628ed2.f5049X && z3 && !c1628ed2.m3113s())) {
                        m1040od(i2, c1628ed, c0847Pp, c1628ed2, z);
                    }
                } else if (!c1628ed2.m3089E()) {
                    if (c0287fs5 == c0287fs6 && c0287fs7.f994Q == null) {
                        int m587N = c0287fs6.m587N() + m588P;
                        c1628ed2.m3106e(m587N, c1628ed2.m3098R() + m587N);
                    } else if (c0287fs5 == c0287fs7 && c0287fs6.f994Q == null) {
                        int m587N2 = m588P - c0287fs7.m587N();
                        c1628ed2.m3106e(m587N2 - c1628ed2.m3098R(), m587N2);
                    } else if (z3 && !c1628ed2.m3113s()) {
                        m997HL(i2, c1628ed2, c0847Pp, z);
                    }
                    m996H(i2, c1628ed2, c0847Pp, z);
                }
                it2 = it;
            }
        }
        if (c1628ed instanceof C2009ln) {
            return;
        }
        HashSet hashSet2 = mo3091G2.f1000z;
        if (hashSet2 != null && mo3091G2.f999v) {
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C0287FS c0287fs8 = (C0287FS) it3.next();
                C1628ed c1628ed3 = c0287fs8.f993P;
                int i4 = i + 1;
                boolean m1010S2 = m1010S(c1628ed3);
                if (c1628ed3.m3089E() && m1010S2) {
                    C1535cx.m2976x(c1628ed3, c0847Pp, new C0782OY());
                }
                C0287FS c0287fs9 = c1628ed3.f5022C;
                C0287FS c0287fs10 = c1628ed3.f5064j;
                if ((c0287fs8 == c0287fs9 && (c0287fs2 = c0287fs10.f994Q) != null && c0287fs2.f999v) || (c0287fs8 == c0287fs10 && (c0287fs = c0287fs9.f994Q) != null && c0287fs.f999v)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i5 = c1628ed3.f5030Ha[0];
                if (i5 == 3 && !m1010S2) {
                    if (i5 == 3 && c1628ed3.f5078s >= 0 && c1628ed3.f5084y >= 0) {
                        if (c1628ed3.f5046UZ != 8) {
                            if (c1628ed3.f5075q == 0) {
                                if (c1628ed3.f5067m == 0.0f) {
                                }
                            }
                        }
                        if (!c1628ed3.m3113s() && !c1628ed3.f5049X && z2 && !c1628ed3.m3113s()) {
                            m1040od(i4, c1628ed, c0847Pp, c1628ed3, z);
                        }
                    }
                } else if (!c1628ed3.m3089E()) {
                    if (c0287fs8 == c0287fs9 && c0287fs10.f994Q == null) {
                        int m587N3 = c0287fs9.m587N() + m588P2;
                        c1628ed3.m3106e(m587N3, c1628ed3.m3098R() + m587N3);
                    } else if (c0287fs8 == c0287fs10 && c0287fs9.f994Q == null) {
                        int m587N4 = m588P2 - c0287fs10.m587N();
                        c1628ed3.m3106e(m587N4 - c1628ed3.m3098R(), m587N4);
                    } else if (z2 && !c1628ed3.m3113s()) {
                        m997HL(i4, c1628ed3, c0847Pp, z);
                    }
                    m996H(i4, c1628ed3, c0847Pp, z);
                }
            }
        }
        c1628ed.f5047V = true;
    }

    /* renamed from: HL */
    public static void m997HL(int i, C1628ed c1628ed, C0847Pp c0847Pp, boolean z) {
        float f;
        float f2 = c1628ed.f5073od;
        C0287FS c0287fs = c1628ed.f5022C;
        int m588P = c0287fs.f994Q.m588P();
        C0287FS c0287fs2 = c1628ed.f5064j;
        int m588P2 = c0287fs2.f994Q.m588P();
        int m587N = c0287fs.m587N() + m588P;
        int m587N2 = m588P2 - c0287fs2.m587N();
        if (m588P == m588P2) {
            f2 = 0.5f;
        } else {
            m588P = m587N;
            m588P2 = m587N2;
        }
        int m3098R = c1628ed.m3098R();
        int i2 = (m588P2 - m588P) - m3098R;
        if (m588P > m588P2) {
            i2 = (m588P - m588P2) - m3098R;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = ((int) f) + m588P;
        int i4 = i3 + m3098R;
        if (m588P > m588P2) {
            i4 = i3 - m3098R;
        }
        c1628ed.m3106e(i3, i4);
        m996H(i + 1, c1628ed, c0847Pp, z);
    }

    /* renamed from: Ha */
    public static void m998Ha(ByteArrayOutputStream byteArrayOutputStream, C0836Pa c0836Pa, String str) {
        AbstractC2575wW.m4458yF(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        AbstractC2575wW.m4458yF(byteArrayOutputStream, c0836Pa.f2825N);
        AbstractC2575wW.m4426d3(byteArrayOutputStream, c0836Pa.f2827Q, 4);
        AbstractC2575wW.m4426d3(byteArrayOutputStream, c0836Pa.f2832v, 4);
        AbstractC2575wW.m4426d3(byteArrayOutputStream, c0836Pa.f2831u, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: I */
    public static long m999I(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: J */
    public static final void m1000J(InterfaceC1255XS interfaceC1255XS, Throwable th) {
        try {
            InterfaceC2000lc interfaceC2000lc = (InterfaceC2000lc) interfaceC1255XS.mo107y(C1710g8.f5384w);
            if (interfaceC2000lc != null) {
                ((C1123V1) interfaceC2000lc).m2309C(interfaceC1255XS, th);
            } else {
                AbstractC1843ih.m3465x(interfaceC1255XS, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC1292YB.m2655N(runtimeException, th);
                th = runtimeException;
            }
            AbstractC1843ih.m3465x(interfaceC1255XS, th);
        }
    }

    /* renamed from: K */
    public static final Object m1001K(Object obj) {
        if (obj instanceof C1663fI) {
            return new C1019T6(((C1663fI) obj).f5199z);
        }
        return obj;
    }

    /* renamed from: L */
    public static InterfaceC1255XS m1002L(InterfaceC1255XS interfaceC1255XS, InterfaceC1255XS interfaceC1255XS2) {
        return interfaceC1255XS2 == C0070BN.f302S ? interfaceC1255XS : (InterfaceC1255XS) interfaceC1255XS2.mo106x(interfaceC1255XS, C0582Ku.f1892q);
    }

    /* renamed from: Lq */
    public static void m1003Lq(ByteArrayOutputStream byteArrayOutputStream, C0836Pa c0836Pa) {
        int i = 0;
        for (int i2 : c0836Pa.f2830o) {
            Integer valueOf = Integer.valueOf(i2);
            AbstractC2575wW.m4458yF(byteArrayOutputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    /* renamed from: M */
    public static int m1004M(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* renamed from: N */
    public static void m1005N(RecyclerView recyclerView) {
        Resources resources = recyclerView.getContext().getResources();
        recyclerView.m4922W(new C0621Lg(resources.getDimensionPixelSize(R.dimen.f9643l1), resources.getDimensionPixelSize(R.dimen.l_50), resources.getDimensionPixelSize(R.dimen.f9643l1), 0, 1));
    }

    /* renamed from: O */
    public static int m1006O(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0 + i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        return i2;
    }

    /* renamed from: P */
    public static void m1007P(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            i3 = 0;
        } else {
            i3 = R.dimen.f9643l1;
        }
        Resources resources = recyclerView.getContext().getResources();
        int i6 = 0;
        if (i != 0) {
            i4 = resources.getDimensionPixelSize(i);
        } else {
            i4 = 0;
        }
        int i7 = 0;
        if (i3 != 0) {
            i5 = resources.getDimensionPixelSize(i3);
        }
        recyclerView.m4922W(new C0621Lg(i6, i4, i7, i5, 0));
    }

    /* renamed from: Pm */
    public static void m1008Pm(ByteArrayOutputStream byteArrayOutputStream, C0836Pa c0836Pa) {
        byte[] bArr = new byte[((((c0836Pa.f2831u * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry entry : c0836Pa.f2828W.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i = intValue2 & 2;
            int i2 = c0836Pa.f2831u;
            if (i != 0) {
                int m1041p = m1041p(2, intValue, i2);
                int i3 = m1041p / 8;
                bArr[i3] = (byte) ((1 << (m1041p % 8)) | bArr[i3]);
            }
            if ((intValue2 & 4) != 0) {
                int m1041p2 = m1041p(4, intValue, i2);
                int i4 = m1041p2 / 8;
                bArr[i4] = (byte) ((1 << (m1041p2 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: Q */
    public static final void m1009Q(StringBuilder sb, Object obj, InterfaceC2364sT interfaceC2364sT) {
        CharSequence valueOf;
        if (interfaceC2364sT != null) {
            obj = interfaceC2364sT.mo85W(obj);
        } else {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                    return;
                } else {
                    valueOf = String.valueOf(obj);
                    sb.append(valueOf);
                }
            }
        }
        valueOf = (CharSequence) obj;
        sb.append(valueOf);
    }

    /* renamed from: S */
    public static boolean m1010S(C1628ed c1628ed) {
        C1535cx c1535cx;
        boolean z;
        boolean z2;
        int[] iArr = c1628ed.f5030Ha;
        int i = iArr[0];
        int i2 = iArr[1];
        C1628ed c1628ed2 = c1628ed.f5020B;
        if (c1628ed2 != null) {
            c1535cx = (C1535cx) c1628ed2;
        } else {
            c1535cx = null;
        }
        if (c1535cx != null) {
            int i3 = c1535cx.f5030Ha[0];
        }
        if (c1535cx != null) {
            int i4 = c1535cx.f5030Ha[1];
        }
        if (i != 1 && !c1628ed.mo903f() && i != 2 && ((i != 3 || c1628ed.f5075q != 0 || c1628ed.f5067m != 0.0f || !c1628ed.m3112q(0)) && (i != 3 || c1628ed.f5075q != 1 || !c1628ed.m3109k(0, c1628ed.m3098R())))) {
            z = false;
        } else {
            z = true;
        }
        if (i2 != 1 && !c1628ed.mo904r() && i2 != 2 && ((i2 != 3 || c1628ed.f5065k != 0 || c1628ed.f5067m != 0.0f || !c1628ed.m3112q(1)) && (i2 != 3 || c1628ed.f5065k != 1 || !c1628ed.m3109k(1, c1628ed.m3101V())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c1628ed.f5067m > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public static C0836Pa[] m1011T(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0836Pa[] c0836PaArr) {
        C0836Pa c0836Pa;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new C0836Pa[0];
        }
        if (i == c0836PaArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                AbstractC2575wW.m4387BO(byteArrayInputStream);
                String str2 = new String(AbstractC2575wW.m4414UZ(byteArrayInputStream, AbstractC2575wW.m4387BO(byteArrayInputStream)), StandardCharsets.UTF_8);
                long m4413U8 = AbstractC2575wW.m4413U8(byteArrayInputStream, 4);
                int m4387BO = AbstractC2575wW.m4387BO(byteArrayInputStream);
                if (c0836PaArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i3 = 0; i3 < c0836PaArr.length; i3++) {
                        if (c0836PaArr[i3].f2829h.equals(str)) {
                            c0836Pa = c0836PaArr[i3];
                            break;
                        }
                    }
                }
                c0836Pa = null;
                if (c0836Pa != null) {
                    c0836Pa.f2826P = m4413U8;
                    int[] m1024d = m1024d(byteArrayInputStream, m4387BO);
                    if (Arrays.equals(bArr, AbstractC2575wW.f7855C)) {
                        c0836Pa.f2825N = m4387BO;
                        c0836Pa.f2830o = m1024d;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return c0836PaArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* renamed from: U */
    public static String m1012U(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = AbstractC2575wW.f7855C;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = AbstractC2575wW.f7875Z;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                str3 = ":";
            }
            return AbstractC2441tz.m4187M(sb, str3, str2);
        }
        if ("!".equals(obj)) {
            return str2.replace(":", "!");
        }
        if (":".equals(obj)) {
            str2 = str2.replace("!", ":");
        }
        return str2;
    }

    /* renamed from: U8 */
    public static boolean m1013U8(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0836Pa[] c0836PaArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = AbstractC2575wW.f7878e;
        int i = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                AbstractC2575wW.m4458yF(byteArrayOutputStream2, c0836PaArr.length);
                int i2 = 2;
                int i3 = 2;
                for (C0836Pa c0836Pa : c0836PaArr) {
                    AbstractC2575wW.m4426d3(byteArrayOutputStream2, c0836Pa.f2832v, 4);
                    AbstractC2575wW.m4426d3(byteArrayOutputStream2, c0836Pa.f2826P, 4);
                    AbstractC2575wW.m4426d3(byteArrayOutputStream2, c0836Pa.f2831u, 4);
                    String m1012U = m1012U(c0836Pa.f2833z, c0836Pa.f2829h, bArr2);
                    int length2 = m1012U.getBytes(StandardCharsets.UTF_8).length;
                    AbstractC2575wW.m4458yF(byteArrayOutputStream2, length2);
                    i3 = i3 + 4 + 4 + 4 + 2 + (length2 * 1);
                    byteArrayOutputStream2.write(m1012U.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    C0919RJ c0919rj = new C0919RJ(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(c0919rj);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    for (int i5 = 0; i5 < c0836PaArr.length; i5++) {
                        try {
                            C0836Pa c0836Pa2 = c0836PaArr[i5];
                            AbstractC2575wW.m4458yF(byteArrayOutputStream3, i5);
                            AbstractC2575wW.m4458yF(byteArrayOutputStream3, c0836Pa2.f2825N);
                            i4 = i4 + 2 + 2 + (c0836Pa2.f2825N * 2);
                            m1003Lq(byteArrayOutputStream3, c0836Pa2);
                        } finally {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i4 == byteArray2.length) {
                        C0919RJ c0919rj2 = new C0919RJ(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(c0919rj2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < c0836PaArr.length) {
                            try {
                                C0836Pa c0836Pa3 = c0836PaArr[i6];
                                Iterator it = c0836Pa3.f2828W.entrySet().iterator();
                                int i8 = i;
                                while (it.hasNext()) {
                                    i8 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    m1008Pm(byteArrayOutputStream4, c0836Pa3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        m1039oI(byteArrayOutputStream4, c0836Pa3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        AbstractC2575wW.m4458yF(byteArrayOutputStream2, i6);
                                        int length3 = byteArray3.length + i2 + byteArray4.length;
                                        int i9 = i7 + 2 + 4;
                                        ArrayList arrayList4 = arrayList3;
                                        AbstractC2575wW.m4426d3(byteArrayOutputStream2, length3, 4);
                                        AbstractC2575wW.m4458yF(byteArrayOutputStream2, i8);
                                        byteArrayOutputStream2.write(byteArray3);
                                        byteArrayOutputStream2.write(byteArray4);
                                        i7 = i9 + length3;
                                        i6++;
                                        arrayList3 = arrayList4;
                                        i = 0;
                                        i2 = 2;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
                        if (i7 == byteArray5.length) {
                            C0919RJ c0919rj3 = new C0919RJ(4, byteArray5, true);
                            byteArrayOutputStream2.close();
                            arrayList2.add(c0919rj3);
                            long j = 4;
                            long size = j + j + 4 + (arrayList2.size() * 16);
                            AbstractC2575wW.m4426d3(byteArrayOutputStream, arrayList2.size(), 4);
                            int i10 = 0;
                            while (i10 < arrayList2.size()) {
                                C0919RJ c0919rj4 = (C0919RJ) arrayList2.get(i10);
                                AbstractC2575wW.m4426d3(byteArrayOutputStream, AbstractC2441tz.m4199h(c0919rj4.f3165z), 4);
                                AbstractC2575wW.m4426d3(byteArrayOutputStream, size, 4);
                                boolean z = c0919rj4.f3164v;
                                byte[] bArr3 = c0919rj4.f3163h;
                                if (z) {
                                    long length4 = bArr3.length;
                                    byte[] m4444o = AbstractC2575wW.m4444o(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(m4444o);
                                    AbstractC2575wW.m4426d3(byteArrayOutputStream, m4444o.length, 4);
                                    AbstractC2575wW.m4426d3(byteArrayOutputStream, length4, 4);
                                    length = m4444o.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    AbstractC2575wW.m4426d3(byteArrayOutputStream, bArr3.length, 4);
                                    AbstractC2575wW.m4426d3(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i10++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i11));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } finally {
                try {
                    byteArrayOutputStream2.close();
                    throw th;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        byte[] bArr4 = AbstractC2575wW.f7873X;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] m1031k = m1031k(c0836PaArr, bArr4);
            AbstractC2575wW.m4426d3(byteArrayOutputStream, c0836PaArr.length, 1);
            AbstractC2575wW.m4426d3(byteArrayOutputStream, m1031k.length, 4);
            byte[] m4444o2 = AbstractC2575wW.m4444o(m1031k);
            AbstractC2575wW.m4426d3(byteArrayOutputStream, m4444o2.length, 4);
            byteArrayOutputStream.write(m4444o2);
            return true;
        }
        byte[] bArr5 = AbstractC2575wW.f7875Z;
        if (Arrays.equals(bArr, bArr5)) {
            AbstractC2575wW.m4426d3(byteArrayOutputStream, c0836PaArr.length, 1);
            for (C0836Pa c0836Pa4 : c0836PaArr) {
                int size2 = c0836Pa4.f2828W.size() * 4;
                String m1012U2 = m1012U(c0836Pa4.f2833z, c0836Pa4.f2829h, bArr5);
                AbstractC2575wW.m4458yF(byteArrayOutputStream, m1012U2.getBytes(StandardCharsets.UTF_8).length);
                AbstractC2575wW.m4458yF(byteArrayOutputStream, c0836Pa4.f2830o.length);
                AbstractC2575wW.m4426d3(byteArrayOutputStream, size2, 4);
                AbstractC2575wW.m4426d3(byteArrayOutputStream, c0836Pa4.f2832v, 4);
                byteArrayOutputStream.write(m1012U2.getBytes(StandardCharsets.UTF_8));
                Iterator it2 = c0836Pa4.f2828W.keySet().iterator();
                while (it2.hasNext()) {
                    AbstractC2575wW.m4458yF(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    AbstractC2575wW.m4458yF(byteArrayOutputStream, 0);
                }
                for (int i12 : c0836Pa4.f2830o) {
                    AbstractC2575wW.m4458yF(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        byte[] bArr6 = AbstractC2575wW.f7857F;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] m1031k2 = m1031k(c0836PaArr, bArr6);
            AbstractC2575wW.m4426d3(byteArrayOutputStream, c0836PaArr.length, 1);
            AbstractC2575wW.m4426d3(byteArrayOutputStream, m1031k2.length, 4);
            byte[] m4444o3 = AbstractC2575wW.m4444o(m1031k2);
            AbstractC2575wW.m4426d3(byteArrayOutputStream, m4444o3.length, 4);
            byteArrayOutputStream.write(m4444o3);
            return true;
        }
        byte[] bArr7 = AbstractC2575wW.f7855C;
        if (Arrays.equals(bArr, bArr7)) {
            AbstractC2575wW.m4458yF(byteArrayOutputStream, c0836PaArr.length);
            for (C0836Pa c0836Pa5 : c0836PaArr) {
                String m1012U3 = m1012U(c0836Pa5.f2833z, c0836Pa5.f2829h, bArr7);
                AbstractC2575wW.m4458yF(byteArrayOutputStream, m1012U3.getBytes(StandardCharsets.UTF_8).length);
                TreeMap treeMap = c0836Pa5.f2828W;
                AbstractC2575wW.m4458yF(byteArrayOutputStream, treeMap.size());
                AbstractC2575wW.m4458yF(byteArrayOutputStream, c0836Pa5.f2830o.length);
                AbstractC2575wW.m4426d3(byteArrayOutputStream, c0836Pa5.f2832v, 4);
                byteArrayOutputStream.write(m1012U3.getBytes(StandardCharsets.UTF_8));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    AbstractC2575wW.m4458yF(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i13 : c0836Pa5.f2830o) {
                    AbstractC2575wW.m4458yF(byteArrayOutputStream, i13);
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: UZ */
    public static C0858Q m1014UZ(Context context, String str, Runnable runnable, RunnableC1547d8 runnableC1547d8) {
        C0858Q c0858q = new C0858Q(str, runnableC1547d8, runnable);
        Context applicationContext = context.getApplicationContext();
        if (str != null) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            if (Build.VERSION.SDK_INT >= 26) {
                applicationContext.registerReceiver(c0858q, intentFilter, 4);
            } else {
                applicationContext.registerReceiver(c0858q, intentFilter);
            }
        }
        IntentFilter intentFilter2 = new IntentFilter(c0858q.f2900Q);
        if (Build.VERSION.SDK_INT >= 26) {
            applicationContext.registerReceiver(c0858q, intentFilter2, 4);
        } else {
            applicationContext.registerReceiver(c0858q, intentFilter2);
        }
        return c0858q;
    }

    /* renamed from: V */
    public static int m1015V(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* renamed from: W */
    public static Map m1016W(LinkedHashMap linkedHashMap) {
        if (!(linkedHashMap instanceof InterfaceC1564dP) || (linkedHashMap instanceof InterfaceC0743Nw)) {
            return linkedHashMap;
        }
        m993EC("kotlin.collections.MutableMap", linkedHashMap);
        throw null;
    }

    /* renamed from: X */
    public static boolean m1017X(Context context) {
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            isRequestPinShortcutSupported = AbstractC0685My.m1582G(context.getSystemService(AbstractC0685My.m1584M())).isRequestPinShortcutSupported();
            return isRequestPinShortcutSupported;
        }
        if (AbstractC0865QC.m2000z(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Y */
    public static ArrayList m1018Y(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: Yd */
    public static int m1019Yd(char c, int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (AbstractC1843ih.m3414K(i2, charSequence)) {
                    i = i2;
                    i++;
                }
            }
            if (charAt == c) {
                return i;
            }
            if (c == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }

    /* renamed from: Z */
    public static final InterfaceC1841if m1020Z(InterfaceC1459bP interfaceC1459bP) {
        int i = EnumC0511Je.f1697S;
        return new C0161D8(interfaceC1459bP);
    }

    /* renamed from: ZH */
    public static final Object m1021ZH(AbstractC1859j1 abstractC1859j1, InterfaceC0559KW interfaceC0559KW, InterfaceC1171Vv interfaceC1171Vv) {
        InterfaceC1255XS m2668Y;
        Object m1028he;
        InterfaceC1255XS mo315N = interfaceC1171Vv.mo315N();
        boolean z = false;
        if (!((Boolean) abstractC1859j1.mo106x(Boolean.FALSE, C0582Ku.f1890g)).booleanValue()) {
            m2668Y = mo315N.mo104G(abstractC1859j1);
        } else {
            m2668Y = AbstractC1292YB.m2668Y(mo315N, abstractC1859j1, false);
        }
        InterfaceC1265Xh interfaceC1265Xh = (InterfaceC1265Xh) m2668Y.mo107y(C1710g8.f5381k);
        if (interfaceC1265Xh != null) {
            AbstractC1843ih.m3442f(interfaceC1265Xh);
        }
        if (m2668Y == mo315N) {
            C2485ur c2485ur = new C2485ur(interfaceC1171Vv, m2668Y);
            m1028he = AbstractC1292YB.m2691qn(c2485ur, c2485ur, interfaceC0559KW);
        } else {
            C1710g8 c1710g8 = C1710g8.f5377R;
            if (AbstractC1292YB.m2695u(m2668Y.mo107y(c1710g8), mo315N.mo107y(c1710g8))) {
                C1654f6 c1654f6 = new C1654f6(interfaceC1171Vv, m2668Y);
                InterfaceC1255XS interfaceC1255XS = c1654f6.f512w;
                Object m2663U8 = AbstractC1292YB.m2663U8(interfaceC1255XS, null);
                try {
                    Object m2691qn = AbstractC1292YB.m2691qn(c1654f6, c1654f6, interfaceC0559KW);
                    AbstractC1292YB.m2682m(interfaceC1255XS, m2663U8);
                    m1028he = m2691qn;
                } catch (Throwable th) {
                    AbstractC1292YB.m2682m(interfaceC1255XS, m2663U8);
                    throw th;
                }
            } else {
                C0010AA c0010aa = new C0010AA(interfaceC1171Vv, m2668Y);
                try {
                    AbstractC2575wW.m4428dx(m1026e(m1027g(c0010aa, c0010aa, interfaceC0559KW)), C0329GJ.f1115z, null);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0010AA.f97q;
                        int i = atomicIntegerFieldUpdater.get(c0010aa);
                        if (i != 0) {
                            if (i != 2) {
                                throw new IllegalStateException("Already suspended".toString());
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(c0010aa, 0, 1)) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        m1028he = EnumC0464Im.f1557S;
                    } else {
                        m1028he = m1028he(c0010aa.m1743Y());
                        if (m1028he instanceof C1663fI) {
                            throw ((C1663fI) m1028he).f5199z;
                        }
                    }
                } catch (Throwable th2) {
                    c0010aa.mo320u(new C1019T6(th2));
                    throw th2;
                }
            }
        }
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        return m1028he;
    }

    /* renamed from: b */
    public static int m1022b(int i, CharSequence charSequence) {
        char charAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt != '>') {
                    if (charAt == '\\') {
                        int i2 = i + 1;
                        if (AbstractC1843ih.m3414K(i2, charSequence)) {
                            i = i2;
                        }
                    }
                } else {
                    return i + 1;
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 != 0 && charAt2 != ' ') {
                if (charAt2 != '\\') {
                    if (charAt2 != '(') {
                        if (charAt2 != ')') {
                            if (Character.isISOControl(charAt2)) {
                                if (i4 == i) {
                                    return -1;
                                }
                            }
                        } else if (i3 != 0) {
                            i3--;
                        }
                    } else {
                        i3++;
                        if (i3 > 32) {
                            return -1;
                        }
                    }
                } else {
                    int i5 = i4 + 1;
                    if (AbstractC1843ih.m3414K(i5, charSequence)) {
                        i4 = i5;
                    }
                }
                i4++;
            } else if (i4 == i) {
                return -1;
            }
            return i4;
        }
        return charSequence.length();
    }

    /* renamed from: c */
    public static int m1023c(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    /* renamed from: d */
    public static int[] m1024d(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += AbstractC2575wW.m4387BO(byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* renamed from: dx */
    public static void m1025dx(int i, C1628ed c1628ed, C0847Pp c0847Pp) {
        C0287FS c0287fs;
        boolean z;
        C0287FS c0287fs2;
        C0287FS c0287fs3;
        boolean z2;
        C0287FS c0287fs4;
        C0287FS c0287fs5;
        if (c1628ed.f5042S) {
            return;
        }
        if (!(c1628ed instanceof C1535cx) && c1628ed.m3089E() && m1010S(c1628ed)) {
            C1535cx.m2976x(c1628ed, c0847Pp, new C0782OY());
        }
        C0287FS mo3091G = c1628ed.mo3091G(EnumC0494JK.f1645R);
        C0287FS mo3091G2 = c1628ed.mo3091G(EnumC0494JK.f1644I);
        int m588P = mo3091G.m588P();
        int m588P2 = mo3091G2.m588P();
        HashSet hashSet = mo3091G.f1000z;
        if (hashSet != null && mo3091G.f999v) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0287FS c0287fs6 = (C0287FS) it.next();
                C1628ed c1628ed2 = c0287fs6.f993P;
                int i2 = i + 1;
                boolean m1010S = m1010S(c1628ed2);
                if (c1628ed2.m3089E() && m1010S) {
                    C1535cx.m2976x(c1628ed2, c0847Pp, new C0782OY());
                }
                C0287FS c0287fs7 = c1628ed2.f5074p;
                C0287FS c0287fs8 = c1628ed2.f5034L;
                if ((c0287fs6 == c0287fs7 && (c0287fs5 = c0287fs8.f994Q) != null && c0287fs5.f999v) || (c0287fs6 == c0287fs8 && (c0287fs4 = c0287fs7.f994Q) != null && c0287fs4.f999v)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3 = c1628ed2.f5030Ha[1];
                if (i3 == 3 && !m1010S) {
                    if (i3 == 3 && c1628ed2.f5059f >= 0 && c1628ed2.f5024E >= 0 && (c1628ed2.f5046UZ == 8 || (c1628ed2.f5065k == 0 && c1628ed2.f5067m == 0.0f))) {
                        if (!c1628ed2.m3100U() && !c1628ed2.f5049X && z2 && !c1628ed2.m3100U()) {
                            m1053zx(i2, c1628ed, c0847Pp, c1628ed2);
                        }
                    }
                } else if (!c1628ed2.m3089E()) {
                    if (c0287fs6 == c0287fs7 && c0287fs8.f994Q == null) {
                        int m587N = c0287fs7.m587N() + m588P;
                        c1628ed2.m3103X(m587N, c1628ed2.m3101V() + m587N);
                    } else if (c0287fs6 == c0287fs8 && c0287fs7.f994Q == null) {
                        int m587N2 = m588P - c0287fs8.m587N();
                        c1628ed2.m3103X(m587N2 - c1628ed2.m3101V(), m587N2);
                    } else if (z2 && !c1628ed2.m3100U()) {
                        m1036nF(i2, c1628ed2, c0847Pp);
                    }
                    m1025dx(i2, c1628ed2, c0847Pp);
                }
            }
        }
        if (c1628ed instanceof C2009ln) {
            return;
        }
        HashSet hashSet2 = mo3091G2.f1000z;
        if (hashSet2 != null && mo3091G2.f999v) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0287FS c0287fs9 = (C0287FS) it2.next();
                C1628ed c1628ed3 = c0287fs9.f993P;
                int i4 = i + 1;
                boolean m1010S2 = m1010S(c1628ed3);
                if (c1628ed3.m3089E() && m1010S2) {
                    C1535cx.m2976x(c1628ed3, c0847Pp, new C0782OY());
                }
                C0287FS c0287fs10 = c1628ed3.f5074p;
                C0287FS c0287fs11 = c1628ed3.f5034L;
                if ((c0287fs9 == c0287fs10 && (c0287fs3 = c0287fs11.f994Q) != null && c0287fs3.f999v) || (c0287fs9 == c0287fs11 && (c0287fs2 = c0287fs10.f994Q) != null && c0287fs2.f999v)) {
                    z = true;
                } else {
                    z = false;
                }
                int i5 = c1628ed3.f5030Ha[1];
                if (i5 == 3 && !m1010S2) {
                    if (i5 == 3 && c1628ed3.f5059f >= 0 && c1628ed3.f5024E >= 0) {
                        if (c1628ed3.f5046UZ != 8) {
                            if (c1628ed3.f5065k == 0) {
                                if (c1628ed3.f5067m == 0.0f) {
                                }
                            }
                        }
                        if (!c1628ed3.m3100U() && !c1628ed3.f5049X && z && !c1628ed3.m3100U()) {
                            m1053zx(i4, c1628ed, c0847Pp, c1628ed3);
                        }
                    }
                } else if (!c1628ed3.m3089E()) {
                    if (c0287fs9 == c0287fs10 && c0287fs11.f994Q == null) {
                        int m587N3 = c0287fs10.m587N() + m588P2;
                        c1628ed3.m3103X(m587N3, c1628ed3.m3101V() + m587N3);
                    } else if (c0287fs9 == c0287fs11 && c0287fs10.f994Q == null) {
                        int m587N4 = m588P2 - c0287fs11.m587N();
                        c1628ed3.m3103X(m587N4 - c1628ed3.m3101V(), m587N4);
                    } else if (z && !c1628ed3.m3100U()) {
                        m1036nF(i4, c1628ed3, c0847Pp);
                    }
                    m1025dx(i4, c1628ed3, c0847Pp);
                }
            }
        }
        C0287FS mo3091G3 = c1628ed.mo3091G(EnumC0494JK.f1649q);
        if (mo3091G3.f1000z != null && mo3091G3.f999v) {
            int m588P3 = mo3091G3.m588P();
            Iterator it3 = mo3091G3.f1000z.iterator();
            while (it3.hasNext()) {
                C0287FS c0287fs12 = (C0287FS) it3.next();
                C1628ed c1628ed4 = c0287fs12.f993P;
                int i6 = i + 1;
                boolean m1010S3 = m1010S(c1628ed4);
                if (c1628ed4.m3089E() && m1010S3) {
                    C1535cx.m2976x(c1628ed4, c0847Pp, new C0782OY());
                }
                if (c1628ed4.f5030Ha[1] != 3 || m1010S3) {
                    if (!c1628ed4.m3089E() && c0287fs12 == (c0287fs = c1628ed4.f5063i)) {
                        int m587N5 = c0287fs12.m587N() + m588P3;
                        if (c1628ed4.f5058e) {
                            int i7 = m587N5 - c1628ed4.f5051Yd;
                            int i8 = c1628ed4.f5023D + i7;
                            c1628ed4.f5071nP = i7;
                            c1628ed4.f5074p.m590V(i7);
                            c1628ed4.f5034L.m590V(i8);
                            c0287fs.m590V(m587N5);
                            c1628ed4.f5036M = true;
                        }
                        m1025dx(i6, c1628ed4, c0847Pp);
                    }
                }
            }
        }
        c1628ed.f5042S = true;
    }

    /* renamed from: e */
    public static final InterfaceC1171Vv m1026e(InterfaceC1171Vv interfaceC1171Vv) {
        AbstractC0620Lf abstractC0620Lf;
        if (interfaceC1171Vv instanceof AbstractC0620Lf) {
            abstractC0620Lf = (AbstractC0620Lf) interfaceC1171Vv;
        } else {
            abstractC0620Lf = null;
        }
        if (abstractC0620Lf != null && (interfaceC1171Vv = abstractC0620Lf.f2026w) == null) {
            InterfaceC2741zl interfaceC2741zl = (InterfaceC2741zl) abstractC0620Lf.mo315N().mo107y(C1710g8.f5377R);
            if (interfaceC2741zl != null) {
                interfaceC1171Vv = new C2266qf((AbstractC1859j1) interfaceC2741zl, abstractC0620Lf);
            } else {
                interfaceC1171Vv = abstractC0620Lf;
            }
            abstractC0620Lf.f2026w = interfaceC1171Vv;
        }
        return interfaceC1171Vv;
    }

    /* renamed from: g */
    public static final InterfaceC1171Vv m1027g(Object obj, InterfaceC1171Vv interfaceC1171Vv, InterfaceC0559KW interfaceC0559KW) {
        if (interfaceC0559KW instanceof AbstractC2097nW) {
            return ((AbstractC2097nW) interfaceC0559KW).mo49G(obj, interfaceC1171Vv);
        }
        InterfaceC1255XS mo315N = interfaceC1171Vv.mo315N();
        return mo315N == C0070BN.f302S ? new C1615eO(obj, interfaceC1171Vv, interfaceC0559KW) : new C1039TV(interfaceC1171Vv, mo315N, interfaceC0559KW, obj);
    }

    /* renamed from: he */
    public static final Object m1028he(Object obj) {
        InterfaceC0732Nl interfaceC0732Nl;
        C1612eK c1612eK = obj instanceof C1612eK ? (C1612eK) obj : null;
        return (c1612eK == null || (interfaceC0732Nl = c1612eK.f4943z) == null) ? obj : interfaceC0732Nl;
    }

    /* renamed from: i */
    public static byte[] m1029i(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: j */
    public static long m1030j(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        long j = 0;
        boolean z = true;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 0) {
                break;
            }
            if (b == 32 || b == 48) {
                if (!z) {
                    if (b == 32) {
                        break;
                    }
                } else {
                    continue;
                    i++;
                }
            }
            j = (j << 3) + ((long) (b - 48));
            z = false;
            i++;
        }
        return j;
    }

    /* renamed from: k */
    public static byte[] m1031k(C0836Pa[] c0836PaArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (C0836Pa c0836Pa : c0836PaArr) {
            i2 += (((((c0836Pa.f2831u * 2) + 8) - 1) & (-8)) / 8) + (c0836Pa.f2825N * 2) + m1012U(c0836Pa.f2833z, c0836Pa.f2829h, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0836Pa.f2827Q;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, AbstractC2575wW.f7857F)) {
            int length = c0836PaArr.length;
            while (i < length) {
                C0836Pa c0836Pa2 = c0836PaArr[i];
                m998Ha(byteArrayOutputStream, c0836Pa2, m1012U(c0836Pa2.f2833z, c0836Pa2.f2829h, bArr));
                m1039oI(byteArrayOutputStream, c0836Pa2);
                m1003Lq(byteArrayOutputStream, c0836Pa2);
                m1008Pm(byteArrayOutputStream, c0836Pa2);
                i++;
            }
        } else {
            for (C0836Pa c0836Pa3 : c0836PaArr) {
                m998Ha(byteArrayOutputStream, c0836Pa3, m1012U(c0836Pa3.f2833z, c0836Pa3.f2829h, bArr));
            }
            int length2 = c0836PaArr.length;
            while (i < length2) {
                C0836Pa c0836Pa4 = c0836PaArr[i];
                m1039oI(byteArrayOutputStream, c0836Pa4);
                m1003Lq(byteArrayOutputStream, c0836Pa4);
                m1008Pm(byteArrayOutputStream, c0836Pa4);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* renamed from: l */
    public static Object m1032l(InterfaceC0559KW interfaceC0559KW) {
        long j;
        C1663fI c1663fI;
        C0070BN c0070bn = C0070BN.f302S;
        Thread currentThread = Thread.currentThread();
        C1710g8 c1710g8 = C1710g8.f5377R;
        AbstractC2738zi m2311z = AbstractC1129V8.m2311z();
        InterfaceC1255XS m2668Y = AbstractC1292YB.m2668Y(c0070bn, m2311z, true);
        C1080UE c1080ue = AbstractC0037Al.f179z;
        if (m2668Y != c1080ue && m2668Y.mo107y(c1710g8) == null) {
            m2668Y = m2668Y.mo104G(c1080ue);
        }
        C2542vr c2542vr = new C2542vr(m2668Y, currentThread, m2311z);
        c2542vr.m312D(1, c2542vr, interfaceC0559KW);
        AbstractC2738zi abstractC2738zi = c2542vr.f7777q;
        if (abstractC2738zi != null) {
            int i = AbstractC2738zi.f8586k;
            abstractC2738zi.m4672dx(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (abstractC2738zi != null) {
                    j = abstractC2738zi.mo643ZH();
                } else {
                    j = Long.MAX_VALUE;
                }
                if ((!(c2542vr.m1743Y() instanceof InterfaceC0732Nl)) == false) {
                    LockSupport.parkNanos(c2542vr, j);
                } else {
                    Object m1028he = m1028he(c2542vr.m1743Y());
                    if (m1028he instanceof C1663fI) {
                        c1663fI = (C1663fI) m1028he;
                    } else {
                        c1663fI = null;
                    }
                    if (c1663fI == null) {
                        return m1028he;
                    }
                    throw c1663fI.f5199z;
                }
            } finally {
                if (abstractC2738zi != null) {
                    int i2 = AbstractC2738zi.f8586k;
                    abstractC2738zi.m4670BO(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c2542vr.m1739S(interruptedException);
        throw interruptedException;
    }

    /* renamed from: m */
    public static final void m1033m(AbstractC0710NO abstractC0710NO, InterfaceC1171Vv interfaceC1171Vv, boolean z) {
        Object mo1647o;
        C1654f6 c1654f6;
        boolean m3127m;
        Object mo1642G = abstractC0710NO.mo1642G();
        Throwable mo1644Q = abstractC0710NO.mo1644Q(mo1642G);
        if (mo1644Q != null) {
            mo1647o = new C1019T6(mo1644Q);
        } else {
            mo1647o = abstractC0710NO.mo1647o(mo1642G);
        }
        if (z) {
            C2266qf c2266qf = (C2266qf) interfaceC1171Vv;
            InterfaceC1171Vv interfaceC1171Vv2 = c2266qf.f6970q;
            InterfaceC1255XS mo315N = interfaceC1171Vv2.mo315N();
            Object m2663U8 = AbstractC1292YB.m2663U8(mo315N, c2266qf.f6968g);
            if (m2663U8 != AbstractC1292YB.f4138S) {
                c1654f6 = AbstractC1292YB.m2641BO(interfaceC1171Vv2, mo315N, m2663U8);
            } else {
                c1654f6 = null;
            }
            try {
                c2266qf.f6970q.mo320u(mo1647o);
                if (c1654f6 != null) {
                    if (!m3127m) {
                        return;
                    }
                }
                return;
            } finally {
                if (c1654f6 == null || c1654f6.m3127m()) {
                    AbstractC1292YB.m2682m(mo315N, m2663U8);
                }
            }
        }
        interfaceC1171Vv.mo320u(mo1647o);
    }

    /* renamed from: n */
    public static C0836Pa[] m1034n(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0836Pa[] c0836PaArr) {
        byte[] bArr3 = AbstractC2575wW.f7887p;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(AbstractC2575wW.f7878e, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m4413U8 = (int) AbstractC2575wW.m4413U8(fileInputStream, 1);
                    byte[] m4440n0 = AbstractC2575wW.m4440n0(fileInputStream, (int) AbstractC2575wW.m4413U8(fileInputStream, 4), (int) AbstractC2575wW.m4413U8(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m4440n0);
                        try {
                            C0836Pa[] m1050x = m1050x(byteArrayInputStream, m4413U8, c0836PaArr);
                            byteArrayInputStream.close();
                            return m1050x;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, AbstractC2575wW.f7883j)) {
            int m4387BO = AbstractC2575wW.m4387BO(fileInputStream);
            byte[] m4440n02 = AbstractC2575wW.m4440n0(fileInputStream, (int) AbstractC2575wW.m4413U8(fileInputStream, 4), (int) AbstractC2575wW.m4413U8(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(m4440n02);
                try {
                    C0836Pa[] m1011T = m1011T(byteArrayInputStream2, bArr2, m4387BO, c0836PaArr);
                    byteArrayInputStream2.close();
                    return m1011T;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0031  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1035n0(java.lang.Exception r4, p000a.InterfaceC1171Vv r5) {
        /*
            boolean r0 = r5 instanceof p000a.C2737zh
            if (r0 == 0) goto L13
            r0 = r5
            a.zh r0 = (p000a.C2737zh) r0
            int r1 = r0.f8585q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8585q = r1
            goto L18
        L13:
            a.zh r0 = new a.zh
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f8584I
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f8585q
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000a.AbstractC1292YB.m2664UZ(r5)
            a.GJ r4 = p000a.C0329GJ.f1115z
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            p000a.AbstractC1292YB.m2664UZ(r5)
            r0.getClass()
            r0.f8585q = r3
            a.UE r5 = p000a.AbstractC0037Al.f179z
            a.Zz r2 = new a.Zz
            r3 = 5
            r2.<init>(r0, r4, r3)
            a.XS r4 = r0.f2025R
            r5.mo195C(r4, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0438II.m1035n0(java.lang.Exception, a.Vv):java.lang.Object");
    }

    /* renamed from: nF */
    public static void m1036nF(int i, C1628ed c1628ed, C0847Pp c0847Pp) {
        float f;
        float f2 = c1628ed.f5070nF;
        C0287FS c0287fs = c1628ed.f5074p;
        int m588P = c0287fs.f994Q.m588P();
        C0287FS c0287fs2 = c1628ed.f5034L;
        int m588P2 = c0287fs2.f994Q.m588P();
        int m587N = c0287fs.m587N() + m588P;
        int m587N2 = m588P2 - c0287fs2.m587N();
        if (m588P == m588P2) {
            f2 = 0.5f;
        } else {
            m588P = m587N;
            m588P2 = m587N2;
        }
        int m3101V = c1628ed.m3101V();
        int i2 = (m588P2 - m588P) - m3101V;
        if (m588P > m588P2) {
            i2 = (m588P - m588P2) - m3101V;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = (int) f;
        int i4 = m588P + i3;
        int i5 = i4 + m3101V;
        if (m588P > m588P2) {
            i4 = m588P - i3;
            i5 = i4 - m3101V;
        }
        c1628ed.m3103X(i4, i5);
        m1025dx(i + 1, c1628ed, c0847Pp);
    }

    /* renamed from: nP */
    public static int m1037nP(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!AbstractC1843ih.m3414K(i2, charSequence)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* renamed from: o */
    public static Collection m1038o(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof InterfaceC1564dP) || (abstractCollection instanceof InterfaceC2042mU)) {
            return abstractCollection;
        }
        m993EC("kotlin.collections.MutableCollection", abstractCollection);
        throw null;
    }

    /* renamed from: oI */
    public static void m1039oI(ByteArrayOutputStream byteArrayOutputStream, C0836Pa c0836Pa) {
        int i = 0;
        for (Map.Entry entry : c0836Pa.f2828W.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC2575wW.m4458yF(byteArrayOutputStream, intValue - i);
                AbstractC2575wW.m4458yF(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    /* renamed from: od */
    public static void m1040od(int i, C1628ed c1628ed, C0847Pp c0847Pp, C1628ed c1628ed2, boolean z) {
        float f = c1628ed2.f5073od;
        C0287FS c0287fs = c1628ed2.f5022C;
        int m587N = c0287fs.m587N() + c0287fs.f994Q.m588P();
        C0287FS c0287fs2 = c1628ed2.f5064j;
        int m588P = c0287fs2.f994Q.m588P() - c0287fs2.m587N();
        if (m588P >= m587N) {
            int m3098R = c1628ed2.m3098R();
            if (c1628ed2.f5046UZ != 8) {
                int i2 = c1628ed2.f5075q;
                if (i2 == 2) {
                    if (!(c1628ed instanceof C1535cx)) {
                        c1628ed = c1628ed.f5020B;
                    }
                    m3098R = (int) (c1628ed2.f5073od * 0.5f * c1628ed.m3098R());
                } else if (i2 == 0) {
                    m3098R = m588P - m587N;
                }
                m3098R = Math.max(c1628ed2.f5084y, m3098R);
                int i3 = c1628ed2.f5078s;
                if (i3 > 0) {
                    m3098R = Math.min(i3, m3098R);
                }
            }
            int i4 = m587N + ((int) ((f * ((m588P - m587N) - m3098R)) + 0.5f));
            c1628ed2.m3106e(i4, m3098R + i4);
            m996H(i + 1, c1628ed2, c0847Pp, z);
        }
    }

    /* renamed from: p */
    public static int m1041p(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw new IllegalStateException(AbstractC2441tz.m4188N("Unexpected flag: ", i));
            }
            return i2;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    /* renamed from: q */
    public static void m1042q(InputStreamReader inputStreamReader, Writer writer) {
        char[] cArr = new char[8192];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read >= 0) {
                writer.write(cArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: qn */
    public static void m1043qn(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130969634}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: r */
    public static int m1044r(int i, int i2, long j, byte[] bArr) {
        int i3 = i2 - 1;
        bArr[i + i3] = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                return i + i2;
            }
            bArr[i + i3] = (byte) (((byte) (7 & j)) + 48);
            j >>= 3;
        }
    }

    /* renamed from: s */
    public static void m1045s(RecyclerView recyclerView) {
        C1710g8 c1710g8;
        View.OnLayoutChangeListener viewOnLayoutChangeListenerC1344ZA = new ViewOnLayoutChangeListenerC1344ZA();
        recyclerView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1344ZA);
        recyclerView.setTag(R.id.tag_rikka_recyclerView_OverScrollIfContentScrollsListener, viewOnLayoutChangeListenerC1344ZA);
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i != 30 || Build.VERSION.PREVIEW_SDK_INT <= 0) {
                if (!recyclerView.getClipToPadding()) {
                    c1710g8 = new C2659yA(1);
                } else {
                    c1710g8 = new C1710g8();
                }
                recyclerView.f9113m = c1710g8;
                recyclerView.f9094Yd = null;
                recyclerView.f9096b = null;
                recyclerView.f9118nP = null;
                recyclerView.f9112l = null;
            }
        }
    }

    /* renamed from: t */
    public static C0836Pa[] m1046t(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, AbstractC2575wW.f7873X)) {
            int m4413U8 = (int) AbstractC2575wW.m4413U8(fileInputStream, 1);
            byte[] m4440n0 = AbstractC2575wW.m4440n0(fileInputStream, (int) AbstractC2575wW.m4413U8(fileInputStream, 4), (int) AbstractC2575wW.m4413U8(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m4440n0);
                try {
                    C0836Pa[] m988B = m988B(byteArrayInputStream, str, m4413U8);
                    byteArrayInputStream.close();
                    return m988B;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    /* renamed from: u */
    public static final Object[] m1047u(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: v */
    public static Object m1048v(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* renamed from: w */
    public static byte[] m1049w(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* renamed from: x */
    public static C0836Pa[] m1050x(ByteArrayInputStream byteArrayInputStream, int i, C0836Pa[] c0836PaArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0836Pa[0];
        }
        if (i == c0836PaArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int m4387BO = AbstractC2575wW.m4387BO(byteArrayInputStream);
                iArr[i2] = AbstractC2575wW.m4387BO(byteArrayInputStream);
                strArr[i2] = new String(AbstractC2575wW.m4414UZ(byteArrayInputStream, m4387BO), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                C0836Pa c0836Pa = c0836PaArr[i3];
                if (c0836Pa.f2829h.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    c0836Pa.f2825N = i4;
                    c0836Pa.f2830o = m1024d(byteArrayInputStream, i4);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c0836PaArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* renamed from: y */
    public static final void m1051y(Enum[] enumArr) {
        new C0897Qu(enumArr);
    }

    /* renamed from: z */
    public static void m1052z(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
    }

    /* renamed from: zx */
    public static void m1053zx(int i, C1628ed c1628ed, C0847Pp c0847Pp, C1628ed c1628ed2) {
        float f = c1628ed2.f5070nF;
        C0287FS c0287fs = c1628ed2.f5074p;
        int m587N = c0287fs.m587N() + c0287fs.f994Q.m588P();
        C0287FS c0287fs2 = c1628ed2.f5034L;
        int m588P = c0287fs2.f994Q.m588P() - c0287fs2.m587N();
        if (m588P >= m587N) {
            int m3101V = c1628ed2.m3101V();
            if (c1628ed2.f5046UZ != 8) {
                int i2 = c1628ed2.f5065k;
                if (i2 == 2) {
                    if (!(c1628ed instanceof C1535cx)) {
                        c1628ed = c1628ed.f5020B;
                    }
                    m3101V = (int) (f * 0.5f * c1628ed.m3101V());
                } else if (i2 == 0) {
                    m3101V = m588P - m587N;
                }
                m3101V = Math.max(c1628ed2.f5024E, m3101V);
                int i3 = c1628ed2.f5059f;
                if (i3 > 0) {
                    m3101V = Math.min(i3, m3101V);
                }
            }
            int i4 = m587N + ((int) ((f * ((m588P - m587N) - m3101V)) + 0.5f));
            c1628ed2.m3103X(i4, m3101V + i4);
            m1025dx(i + 1, c1628ed2, c0847Pp);
        }
    }

    /* renamed from: R */
    public abstract List mo1054R(String str, List list);

    /* renamed from: f */
    public abstract Object mo362f(InterfaceC1171Vv interfaceC1171Vv);

    @Override // p000a.InterfaceC1435aw
    /* renamed from: h */
    public void mo363h(DialogC2727zU dialogC2727zU) {
        View inflate = LayoutInflater.from(dialogC2727zU.getContext()).inflate(R.layout.markdown_window_md2, (ViewGroup) null);
        AbstractC0362Gv abstractC0362Gv = dialogC2727zU.f8570k;
        abstractC0362Gv.f1221d.removeAllViews();
        abstractC0362Gv.f1221d.addView(inflate, -1, -2);
        m994F(AbstractC2575wW.m4423c((AbstractActivityC0402He) dialogC2727zU.getOwnerActivity()), null, new C0055B4((TextView) inflate.findViewById(R.id.md_txt), this, null), 3);
    }
}
