package p000a;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.nf */
/* loaded from: classes.dex */
public final class C2105nf {

    /* renamed from: N */
    public String f6495N;

    /* renamed from: P */
    public final C1624eZ f6496P;

    /* renamed from: Q */
    public int f6497Q;

    /* renamed from: h */
    public final BitSet f6498h;

    /* renamed from: o */
    public C1610eI f6499o;

    /* renamed from: u */
    public C0330GK f6500u;

    /* renamed from: v */
    public final HashMap f6501v;

    /* renamed from: z */
    public final BitSet f6502z;

    /* renamed from: W */
    public static final Pattern f6489W = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* renamed from: G */
    public static final Pattern f6483G = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* renamed from: M */
    public static final Pattern f6485M = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* renamed from: V */
    public static final Pattern f6488V = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: S */
    public static final Pattern f6487S = Pattern.compile("`+");

    /* renamed from: R */
    public static final Pattern f6486R = Pattern.compile("^`+");

    /* renamed from: w */
    public static final Pattern f6493w = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* renamed from: I */
    public static final Pattern f6484I = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* renamed from: q */
    public static final Pattern f6492q = Pattern.compile("^ *(?:\n *)?");

    /* renamed from: k */
    public static final Pattern f6491k = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* renamed from: g */
    public static final Pattern f6490g = Pattern.compile("\\s+");

    /* renamed from: y */
    public static final Pattern f6494y = Pattern.compile(" *$");

    public C2105nf(C1624eZ c1624eZ) {
        List list = (List) c1624eZ.f5013R;
        HashMap hashMap = new HashMap();
        m3726h(Arrays.asList(new C2699yy(0), new C2699yy(1)), hashMap);
        m3726h(list, hashMap);
        this.f6501v = hashMap;
        Set keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f6498h = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f6502z = bitSet2;
        this.f6496P = c1624eZ;
    }

    /* renamed from: N */
    public static void m3724N(AbstractC1462bT abstractC1462bT, AbstractC1462bT abstractC1462bT2) {
        C2357sM c2357sM = null;
        C2357sM c2357sM2 = null;
        int i = 0;
        while (abstractC1462bT != null) {
            if (abstractC1462bT instanceof C2357sM) {
                c2357sM2 = (C2357sM) abstractC1462bT;
                if (c2357sM == null) {
                    c2357sM = c2357sM2;
                }
                i = c2357sM2.f7250Q.length() + i;
            } else {
                m3725P(c2357sM, c2357sM2, i);
                c2357sM = null;
                c2357sM2 = null;
                i = 0;
            }
            if (abstractC1462bT == abstractC1462bT2) {
                break;
            } else {
                abstractC1462bT = abstractC1462bT.f4553N;
            }
        }
        m3725P(c2357sM, c2357sM2, i);
    }

    /* renamed from: P */
    public static void m3725P(C2357sM c2357sM, C2357sM c2357sM2, int i) {
        if (c2357sM != null && c2357sM2 != null && c2357sM != c2357sM2) {
            StringBuilder sb = new StringBuilder(i);
            sb.append(c2357sM.f7250Q);
            AbstractC1462bT abstractC1462bT = c2357sM.f4553N;
            AbstractC1462bT abstractC1462bT2 = c2357sM2.f4553N;
            while (abstractC1462bT != abstractC1462bT2) {
                sb.append(((C2357sM) abstractC1462bT).f7250Q);
                AbstractC1462bT abstractC1462bT3 = abstractC1462bT.f4553N;
                abstractC1462bT.m2874Q();
                abstractC1462bT = abstractC1462bT3;
            }
            c2357sM.f7250Q = sb.toString();
        }
    }

    /* renamed from: h */
    public static void m3726h(List list, HashMap hashMap) {
        C2131oC c2131oC;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1009Sv interfaceC1009Sv = (InterfaceC1009Sv) it.next();
            char mo2185N = interfaceC1009Sv.mo2185N();
            char mo2189z = interfaceC1009Sv.mo2189z();
            if (mo2185N == mo2189z) {
                InterfaceC1009Sv interfaceC1009Sv2 = (InterfaceC1009Sv) hashMap.get(Character.valueOf(mo2185N));
                if (interfaceC1009Sv2 == null || interfaceC1009Sv2.mo2185N() != interfaceC1009Sv2.mo2189z()) {
                    m3727z(mo2185N, interfaceC1009Sv, hashMap);
                } else {
                    if (interfaceC1009Sv2 instanceof C2131oC) {
                        c2131oC = (C2131oC) interfaceC1009Sv2;
                    } else {
                        C2131oC c2131oC2 = new C2131oC(mo2185N);
                        c2131oC2.m3754Q(interfaceC1009Sv2);
                        c2131oC = c2131oC2;
                    }
                    c2131oC.m3754Q(interfaceC1009Sv);
                    hashMap.put(Character.valueOf(mo2185N), c2131oC);
                }
            } else {
                m3727z(mo2185N, interfaceC1009Sv, hashMap);
                m3727z(mo2189z, interfaceC1009Sv, hashMap);
            }
        }
    }

    /* renamed from: z */
    public static void m3727z(char c, InterfaceC1009Sv interfaceC1009Sv, HashMap hashMap) {
        if (((InterfaceC1009Sv) hashMap.put(Character.valueOf(c), interfaceC1009Sv)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:345:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0446  */
    /* JADX WARN: Type inference failed for: r14v10, types: [a.BE] */
    /* JADX WARN: Type inference failed for: r14v100 */
    /* JADX WARN: Type inference failed for: r14v14, types: [a.BE] */
    /* JADX WARN: Type inference failed for: r14v15, types: [a.Nd] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v24, types: [a.sM] */
    /* JADX WARN: Type inference failed for: r14v27, types: [a.sM] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v41, types: [a.UR] */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v54, types: [a.sM] */
    /* JADX WARN: Type inference failed for: r14v59, types: [a.sM] */
    /* JADX WARN: Type inference failed for: r14v67 */
    /* JADX WARN: Type inference failed for: r14v71, types: [a.sM] */
    /* JADX WARN: Type inference failed for: r14v79, types: [a.sM] */
    /* JADX WARN: Type inference failed for: r14v80, types: [a.sM] */
    /* JADX WARN: Type inference failed for: r14v98 */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3728Q(java.lang.String r14, p000a.AbstractC0883Qb r15) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2105nf.m3728Q(java.lang.String, a.Qb):void");
    }

    /* renamed from: W */
    public final void m3729W(C0330GK c0330gk) {
        C0330GK c0330gk2 = c0330gk.f1116N;
        if (c0330gk2 != null) {
            c0330gk2.f1118Q = c0330gk.f1118Q;
        }
        C0330GK c0330gk3 = c0330gk.f1118Q;
        if (c0330gk3 == null) {
            this.f6500u = c0330gk2;
        } else {
            c0330gk3.f1116N = c0330gk2;
        }
    }

    /* renamed from: o */
    public final void m3730o(C0330GK c0330gk) {
        boolean z;
        AbstractC1462bT abstractC1462bT;
        HashMap hashMap = new HashMap();
        C0330GK c0330gk2 = this.f6500u;
        while (c0330gk2 != null) {
            C0330GK c0330gk3 = c0330gk2.f1116N;
            if (c0330gk3 == c0330gk) {
                break;
            } else {
                c0330gk2 = c0330gk3;
            }
        }
        while (c0330gk2 != null) {
            HashMap hashMap2 = this.f6501v;
            char c = c0330gk2.f1119h;
            InterfaceC1009Sv interfaceC1009Sv = (InterfaceC1009Sv) hashMap2.get(Character.valueOf(c));
            if (c0330gk2.f1117P && interfaceC1009Sv != null) {
                char mo2185N = interfaceC1009Sv.mo2185N();
                C0330GK c0330gk4 = c0330gk2.f1116N;
                boolean z2 = false;
                int i = 0;
                while (c0330gk4 != null && c0330gk4 != c0330gk && c0330gk4 != hashMap.get(Character.valueOf(c))) {
                    if (c0330gk4.f1122v && c0330gk4.f1119h == mo2185N) {
                        i = interfaceC1009Sv.mo2187h(c0330gk4, c0330gk2);
                        z2 = true;
                        if (i > 0) {
                            z = true;
                            break;
                        }
                    }
                    c0330gk4 = c0330gk4.f1116N;
                }
                z = z2;
                z2 = false;
                if (!z2) {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), c0330gk2.f1116N);
                        if (!c0330gk2.f1122v) {
                            m3729W(c0330gk2);
                        }
                    }
                } else {
                    C2357sM c2357sM = c0330gk4.f1123z;
                    c0330gk4.f1121u -= i;
                    c0330gk2.f1121u -= i;
                    String str = c2357sM.f7250Q;
                    c2357sM.f7250Q = str.substring(0, str.length() - i);
                    C2357sM c2357sM2 = c0330gk2.f1123z;
                    String str2 = c2357sM2.f7250Q;
                    c2357sM2.f7250Q = str2.substring(0, str2.length() - i);
                    C0330GK c0330gk5 = c0330gk2.f1116N;
                    while (c0330gk5 != null && c0330gk5 != c0330gk4) {
                        C0330GK c0330gk6 = c0330gk5.f1116N;
                        m3729W(c0330gk5);
                        c0330gk5 = c0330gk6;
                    }
                    if (c2357sM != c2357sM2 && (abstractC1462bT = c2357sM.f4553N) != c2357sM2) {
                        m3724N(abstractC1462bT, c2357sM2.f4554P);
                    }
                    interfaceC1009Sv.mo2186P(c2357sM, c2357sM2, i);
                    if (c0330gk4.f1121u == 0) {
                        c0330gk4.f1123z.m2874Q();
                        m3729W(c0330gk4);
                    }
                    if (c0330gk2.f1121u == 0) {
                        C0330GK c0330gk7 = c0330gk2.f1118Q;
                        c2357sM2.m2874Q();
                        m3729W(c0330gk2);
                        c0330gk2 = c0330gk7;
                    }
                }
            }
            c0330gk2 = c0330gk2.f1118Q;
        }
        while (true) {
            C0330GK c0330gk8 = this.f6500u;
            if (c0330gk8 != null && c0330gk8 != c0330gk) {
                m3729W(c0330gk8);
            } else {
                return;
            }
        }
    }

    /* renamed from: u */
    public final char m3731u() {
        if (this.f6497Q < this.f6495N.length()) {
            return this.f6495N.charAt(this.f6497Q);
        }
        return (char) 0;
    }

    /* renamed from: v */
    public final String m3732v(Pattern pattern) {
        if (this.f6497Q >= this.f6495N.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f6495N);
        matcher.region(this.f6497Q, this.f6495N.length());
        if (!matcher.find()) {
            return null;
        }
        this.f6497Q = matcher.end();
        return matcher.group();
    }
}
