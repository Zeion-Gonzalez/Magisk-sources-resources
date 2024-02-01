package p000a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: a.S9 */
/* loaded from: classes.dex */
public abstract class AbstractC0967S9 {
    static {
        C1623eY c1623eY = C1623eY.f5009I;
        C2252qQ.m3884M("\"\\");
        C2252qQ.m3884M("\t ,=");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* renamed from: h */
    public static final void m2149h(InterfaceC2155oe interfaceC2155oe, C2658y7 c2658y7, C1494c7 c1494c7) {
        List list;
        int i;
        C2658y7 c2658y72;
        boolean z;
        String str;
        int i2;
        String str2;
        C0060BC c0060bc;
        String str3;
        if (interfaceC2155oe == InterfaceC2155oe.f6618G) {
            return;
        }
        Pattern pattern = C0060BC.f243G;
        List m2896Q = c1494c7.m2896Q("Set-Cookie");
        int size = m2896Q.size();
        int i3 = 0;
        int i4 = 0;
        ArrayList arrayList = null;
        while (i4 < size) {
            String str4 = (String) m2896Q.get(i4);
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = AbstractC1181W6.f3860z;
            char c = ';';
            int m2417Q = AbstractC1181W6.m2417Q(str4, ';', i3, str4.length());
            char c2 = '=';
            int m2417Q2 = AbstractC1181W6.m2417Q(str4, '=', i3, m2417Q);
            if (m2417Q2 != m2417Q) {
                String m2411E = AbstractC1181W6.m2411E(i3, m2417Q2, str4);
                if (m2411E.length() == 0) {
                    i = 1;
                } else {
                    i = i3;
                }
                if (i == 0 && AbstractC1181W6.m2414M(m2411E) == -1) {
                    String m2411E2 = AbstractC1181W6.m2411E(m2417Q2 + 1, m2417Q, str4);
                    if (AbstractC1181W6.m2414M(m2411E2) == -1) {
                        int i5 = m2417Q + 1;
                        int length = str4.length();
                        long j = 253402300799999L;
                        int i6 = i3;
                        boolean z2 = i6 == 1 ? 1 : 0;
                        boolean z3 = z2;
                        long j2 = 253402300799999L;
                        long j3 = -1;
                        String str5 = null;
                        String str6 = null;
                        boolean z4 = true;
                        boolean z5 = i6;
                        while (true) {
                            long j4 = Long.MAX_VALUE;
                            long j5 = Long.MIN_VALUE;
                            if (i5 < length) {
                                int m2417Q3 = AbstractC1181W6.m2417Q(str4, c, i5, length);
                                int m2417Q4 = AbstractC1181W6.m2417Q(str4, c2, i5, m2417Q3);
                                String m2411E3 = AbstractC1181W6.m2411E(i5, m2417Q4, str4);
                                if (m2417Q4 < m2417Q3) {
                                    str3 = AbstractC1181W6.m2411E(m2417Q4 + 1, m2417Q3, str4);
                                } else {
                                    str3 = "";
                                }
                                if (AbstractC1269Xn.m2594yF(m2411E3, "expires")) {
                                    try {
                                        j2 = C1710g8.m3231f(str3.length(), str3);
                                        z3 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i5 = m2417Q3 + 1;
                                    c = ';';
                                    c2 = '=';
                                    z5 = z5;
                                } else if (AbstractC1269Xn.m2594yF(m2411E3, "max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(str3);
                                        if (parseLong > 0) {
                                            j5 = parseLong;
                                        }
                                        j3 = j5;
                                    } catch (NumberFormatException e) {
                                        if (Pattern.compile("-?\\d+").matcher(str3).matches()) {
                                            if (str3.startsWith("-")) {
                                                j4 = Long.MIN_VALUE;
                                            }
                                            j3 = j4;
                                        } else {
                                            throw e;
                                        }
                                    }
                                    z3 = true;
                                    i5 = m2417Q3 + 1;
                                    c = ';';
                                    c2 = '=';
                                    z5 = z5;
                                } else {
                                    if (AbstractC1269Xn.m2594yF(m2411E3, "domain")) {
                                        if ((!str3.endsWith(".")) != false) {
                                            String m3439dG = AbstractC1843ih.m3439dG(AbstractC1269Xn.m2578S3(".", str3));
                                            if (m3439dG != null) {
                                                str6 = m3439dG;
                                                z4 = false;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Failed requirement.".toString());
                                        }
                                    } else if (AbstractC1269Xn.m2594yF(m2411E3, "path")) {
                                        str5 = str3;
                                    } else if (AbstractC1269Xn.m2594yF(m2411E3, "secure")) {
                                        z5 = 1;
                                    } else if (AbstractC1269Xn.m2594yF(m2411E3, "httponly")) {
                                        z2 = true;
                                    }
                                    i5 = m2417Q3 + 1;
                                    c = ';';
                                    c2 = '=';
                                    z5 = z5;
                                }
                            } else {
                                if (j3 == Long.MIN_VALUE) {
                                    c2658y72 = c2658y7;
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    if (j3 <= 9223372036854775L) {
                                        j4 = j3 * 1000;
                                    }
                                    long j6 = currentTimeMillis + j4;
                                    if (j6 >= currentTimeMillis && j6 <= 253402300799999L) {
                                        c2658y72 = c2658y7;
                                        j = j6;
                                    } else {
                                        c2658y72 = c2658y7;
                                    }
                                } else {
                                    c2658y72 = c2658y7;
                                    j = j2;
                                }
                                String str7 = c2658y72.f8279P;
                                if (str6 == null) {
                                    str = str7;
                                } else {
                                    if (AbstractC1292YB.m2695u(str7, str6)) {
                                        z = true;
                                    } else if (str7.endsWith(str6) && str7.charAt((str7.length() - str6.length()) - 1) == '.' && !AbstractC1181W6.f3856Q.f6022S.matcher(str7).matches()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        str = str6;
                                    }
                                    i2 = 0;
                                }
                                if (str7.length() == str.length() || PublicSuffixDatabase.f9632u.m5144z(str) != null) {
                                    String str8 = "/";
                                    if (str5 != null && str5.startsWith("/")) {
                                        str2 = str5;
                                        i2 = 0;
                                    } else {
                                        String m4564h = c2658y7.m4564h();
                                        i2 = 0;
                                        int m2589j5 = AbstractC1269Xn.m2589j5(m4564h, '/', 0, 6);
                                        if (m2589j5 != 0) {
                                            str8 = m4564h.substring(0, m2589j5);
                                        }
                                        str2 = str8;
                                    }
                                    c0060bc = new C0060BC(m2411E, m2411E2, j, str, str2, z5, z2, z3, z4);
                                }
                                i2 = 0;
                            }
                        }
                    }
                }
            }
            i2 = i3;
            c0060bc = null;
            if (c0060bc != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0060bc);
            }
            i4++;
            i3 = i2;
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = C1239X8.f4021S;
        }
        list.isEmpty();
    }

    /* renamed from: z */
    public static final boolean m2150z(C1429ap c1429ap) {
        if (AbstractC1292YB.m2695u((String) c1429ap.f4467S.f4281v, "HEAD")) {
            return false;
        }
        int i = c1429ap.f4465I;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && AbstractC1181W6.m2422W(c1429ap) == -1) {
            String m2897h = c1429ap.f4472k.m2897h("Transfer-Encoding");
            if (m2897h == null) {
                m2897h = null;
            }
            if (!AbstractC1269Xn.m2594yF("chunked", m2897h)) {
                return false;
            }
        }
        return true;
    }
}
