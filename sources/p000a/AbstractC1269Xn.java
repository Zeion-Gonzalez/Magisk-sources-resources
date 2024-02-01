package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: a.Xn */
/* loaded from: classes.dex */
public abstract class AbstractC1269Xn extends AbstractC1684fg {
    /* renamed from: EQ */
    public static final int m2570EQ(int i, CharSequence charSequence, String str, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m2577Ry(charSequence, str, i, charSequence.length(), z, false);
    }

    /* renamed from: F3 */
    public static List m2571F3(CharSequence charSequence, char[] cArr) {
        boolean z = false;
        if (cArr.length == 1) {
            return m2584fc(0, charSequence, String.valueOf(cArr[0]), false);
        }
        m2573KM(0);
        C1189WF c1189wf = new C1189WF(new C2556wA(charSequence, 0, 0, new C0646M8(cArr, z, z ? 1 : 0)));
        ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(c1189wf));
        Iterator it = c1189wf.iterator();
        while (it.hasNext()) {
            arrayList.add(m2590lz(charSequence, (C0325GF) it.next()));
        }
        return arrayList;
    }

    /* renamed from: Fu */
    public static int m2572Fu(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m2575M6(i, charSequence, z, new char[]{c});
    }

    /* renamed from: KM */
    public static final void m2573KM(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
        } else {
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("Limit must be non-negative, but was ", i).toString());
        }
    }

    /* renamed from: LN */
    public static final boolean m2574LN(int i, int i2, int i3, String str, String str2, boolean z) {
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: M6 */
    public static final int m2575M6(int i, CharSequence charSequence, boolean z, char[] cArr) {
        boolean z2;
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length != 0) {
                if (length == 1) {
                    return ((String) charSequence).indexOf(cArr[0], i);
                }
                throw new IllegalArgumentException("Array has more than one element.");
            }
            throw new NoSuchElementException("Array is empty.");
        }
        if (i < 0) {
            i = 0;
        }
        C2482un it = new C0325GF(i, m2592tJ(charSequence)).iterator();
        while (it.f7602w) {
            int m4257h = it.m4257h();
            char charAt = charSequence.charAt(m4257h);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    if (AbstractC1292YB.m2662U(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                return m4257h;
            }
        }
        return -1;
    }

    /* renamed from: Rh */
    public static /* synthetic */ int m2576Rh(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m2570EQ(i, charSequence, str, z);
    }

    /* renamed from: Ry */
    public static final int m2577Ry(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C0760OC c0760oc;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c0760oc = new C0325GF(i, i2);
        } else {
            int m2592tJ = m2592tJ(charSequence);
            if (i > m2592tJ) {
                i = m2592tJ;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c0760oc = new C0760OC(i, i2, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c0760oc.f2577S;
        int i4 = c0760oc.f2578w;
        int i5 = c0760oc.f2576R;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i4 > 0 && i3 <= i5) || (i4 < 0 && i5 <= i3)) {
                while (!m2574LN(0, i3, charSequence2.length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i3 != i5) {
                        i3 += i4;
                    }
                }
                return i3;
            }
        } else if ((i4 > 0 && i3 <= i5) || (i4 < 0 && i5 <= i3)) {
            while (!m2581W9(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                if (i3 != i5) {
                    i3 += i4;
                }
            }
            return i3;
        }
        return -1;
    }

    /* renamed from: S3 */
    public static final String m2578S3(String str, String str2) {
        if (str2.startsWith(str)) {
            return str2.substring(str.length());
        }
        return str2;
    }

    /* renamed from: T0 */
    public static final boolean m2579T0(CharSequence charSequence) {
        boolean z;
        if (charSequence.length() == 0) {
            return true;
        }
        C0325GF c0325gf = new C0325GF(0, charSequence.length() - 1);
        if (!(c0325gf instanceof Collection) || !((Collection) c0325gf).isEmpty()) {
            Iterator it = c0325gf.iterator();
            while (it.hasNext()) {
                if (!AbstractC1292YB.m2697x(charSequence.charAt(((C2482un) it).m4257h()))) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: Uf */
    public static final CharSequence m2580Uf(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean m2697x = AbstractC1292YB.m2697x(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!m2697x) {
                    break;
                }
                length--;
            } else if (m2697x) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: W9 */
    public static final boolean m2581W9(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC1292YB.m2662U(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d3 */
    public static boolean m2582d3(CharSequence charSequence, char c) {
        if (m2572Fu(charSequence, c, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: fH */
    public static C2556wA m2583fH(CharSequence charSequence, String[] strArr, boolean z, int i) {
        m2573KM(i);
        return new C2556wA(charSequence, 0, i, new C0646M8(Arrays.asList(strArr), z, 1));
    }

    /* renamed from: fc */
    public static final List m2584fc(int i, CharSequence charSequence, String str, boolean z) {
        boolean z2;
        m2573KM(i);
        int i2 = 0;
        int m2570EQ = m2570EQ(0, charSequence, str, z);
        if (m2570EQ != -1 && i != 1) {
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = 10;
            if (z2 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, m2570EQ).toString());
                i2 = str.length() + m2570EQ;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                m2570EQ = m2570EQ(i2, charSequence, str, z);
            } while (m2570EQ != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return Collections.singletonList(charSequence.toString());
    }

    /* renamed from: fi */
    public static String m2585fi(String str, String str2) {
        int m2576Rh = m2576Rh(str, str2, 0, false, 6);
        if (m2576Rh != -1) {
            return str.substring(str2.length() + m2576Rh, str.length());
        }
        return str;
    }

    /* renamed from: gv */
    public static List m2586gv(String str, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        boolean z = true;
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                z = false;
            }
            if (!z) {
                return m2584fc(i, str, str2, false);
            }
        }
        C1189WF c1189wf = new C1189WF(m2583fH(str, strArr, false, i));
        ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(c1189wf));
        Iterator it = c1189wf.iterator();
        while (it.hasNext()) {
            arrayList.add(m2590lz(str, (C0325GF) it.next()));
        }
        return arrayList;
    }

    /* renamed from: hW */
    public static final boolean m2587hW(String str, String str2, int i, boolean z) {
        return !z ? str.startsWith(str2, i) : m2574LN(i, 0, str2.length(), str, str2, z);
    }

    /* renamed from: hs */
    public static String m2588hs(String str, String str2, String str3) {
        int m2570EQ = m2570EQ(0, str, str2, false);
        if (m2570EQ >= 0) {
            int length = str2.length();
            int i = 1;
            if (length >= 1) {
                i = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i2 = 0;
                do {
                    sb.append((CharSequence) str, i2, m2570EQ);
                    sb.append(str3);
                    i2 = m2570EQ + length;
                    if (m2570EQ >= str.length()) {
                        break;
                    }
                    m2570EQ = m2570EQ(m2570EQ + i, str, str2, false);
                } while (m2570EQ > 0);
                sb.append((CharSequence) str, i2, str.length());
                return sb.toString();
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    /* renamed from: j5 */
    public static int m2589j5(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m2592tJ(charSequence);
        }
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(c, i);
            }
            int m2592tJ = m2592tJ(charSequence);
            if (i > m2592tJ) {
                i = m2592tJ;
            }
            while (-1 < i) {
                if (AbstractC1292YB.m2662U(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    /* renamed from: lz */
    public static final String m2590lz(CharSequence charSequence, C0325GF c0325gf) {
        return charSequence.subSequence(Integer.valueOf(c0325gf.f2577S).intValue(), Integer.valueOf(c0325gf.f2576R).intValue() + 1).toString();
    }

    /* renamed from: nB */
    public static final boolean m2591nB(CharSequence charSequence, String str, boolean z) {
        if (str instanceof String) {
            if (m2576Rh(charSequence, str, 0, z, 2) < 0) {
                return false;
            }
        } else if (m2577Ry(charSequence, str, 0, charSequence.length(), z, false) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: tJ */
    public static final int m2592tJ(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* renamed from: vk */
    public static String m2593vk(String str, char c) {
        int m2589j5 = m2589j5(str, c, 0, 6);
        if (m2589j5 != -1) {
            return str.substring(m2589j5 + 1, str.length());
        }
        return str;
    }

    /* renamed from: yF */
    public static final boolean m2594yF(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    /* renamed from: zd */
    public static final List m2595zd(CharSequence charSequence) {
        return AbstractC2239qC.m3879nB(new C1831iT(m2583fH(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new C2670yQ(13, charSequence), 2));
    }
}
