package p000a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.jar.JarEntry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.g8 */
/* loaded from: classes.dex */
public class C1710g8 implements InterfaceC2491ux, InterfaceC1990lR, InterfaceC0631Ls, InterfaceC2155oe, InterfaceC0733Nm, InterfaceC1428ao, InterfaceC0213E3, InterfaceC0643M5, InterfaceC0540KB, InterfaceC0271FA, InterfaceC0746Nz, InterfaceC1928kH {

    /* renamed from: S */
    public static final C1710g8 f5378S = new C1710g8();

    /* renamed from: R */
    public static final /* synthetic */ C1710g8 f5377R = new C1710g8();

    /* renamed from: w */
    public static final /* synthetic */ C1710g8 f5384w = new C1710g8();

    /* renamed from: I */
    public static final C1710g8 f5376I = new C1710g8();

    /* renamed from: q */
    public static final C1710g8 f5382q = new C1710g8();

    /* renamed from: k */
    public static final /* synthetic */ C1710g8 f5381k = new C1710g8();

    /* renamed from: g */
    public static final C1710g8 f5380g = new C1710g8();

    /* renamed from: y */
    public static final C1710g8 f5385y = new C1710g8();

    /* renamed from: s */
    public static final C1710g8 f5383s = new C1710g8();

    /* renamed from: U */
    public static final C1710g8 f5379U = new C1710g8();

    public C1710g8() {
    }

    /* renamed from: E */
    public static C1014T1 m3220E(String str) {
        int i;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        EnumC1854ix enumC1854ix = EnumC1854ix.f5780R;
        if (startsWith) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        enumC1854ix = EnumC1854ix.f5784w;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new C1014T1(enumC1854ix, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0064 A[LOOP:0: B:30:0x0006->B:50:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0024 A[SYNTHETIC] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3221G(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L67
            char r3 = r6.charAt(r2)
            r4 = 9
            r5 = 1
            if (r3 == r4) goto L21
            r4 = 32
            if (r4 > r3) goto L1b
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 >= r4) goto L1b
            r4 = r5
            goto L1c
        L1b:
            r4 = r1
        L1c:
            if (r4 == 0) goto L1f
            goto L21
        L1f:
            r4 = r1
            goto L22
        L21:
            r4 = r5
        L22:
            if (r4 != 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4[r5] = r1
            r1 = 2
            r4[r1] = r7
            java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
            java.lang.String r1 = p000a.AbstractC1181W6.m2429u(r1, r4)
            r0.append(r1)
            boolean r7 = p000a.AbstractC1181W6.m2431w(r7)
            if (r7 == 0) goto L4d
            java.lang.String r6 = ""
            goto L53
        L4d:
            java.lang.String r7 = ": "
            java.lang.String r6 = r7.concat(r6)
        L53:
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L64:
            int r2 = r2 + 1
            goto L6
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1710g8.m3221G(java.lang.String, java.lang.String):void");
    }

    /* renamed from: H */
    public static void m3222H(List list, StringBuilder sb) {
        C0760OC m2649HL = AbstractC1292YB.m2649HL(AbstractC1292YB.m2645EC(0, list.size()), 2);
        int i = m2649HL.f2577S;
        int i2 = m2649HL.f2576R;
        int i3 = m2649HL.f2578w;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    /* renamed from: I */
    public static C0003A3 m3223I(String str) {
        Matcher matcher = C0003A3.f64P.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C0003A3.f63N.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        arrayList.add(group2);
                        arrayList.add(group3);
                    }
                } else {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
                }
            }
            return new C0003A3(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    /* renamed from: Q */
    public static final C0280FK m3224Q(C1710g8 c1710g8, String str) {
        C0280FK c0280fk = new C0280FK(str);
        C0280FK.f966P.put(str, c0280fk);
        return c0280fk;
    }

    /* renamed from: R */
    public static EnumC1213Wf m3225R(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC1213Wf.f3970I;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC1213Wf.f3974w;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC1213Wf.f3971R;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC1213Wf.f3973q;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC1213Wf.f3972k;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* renamed from: U */
    public static C1494c7 m3226U(String... strArr) {
        int i = 0;
        if (!(strArr.length % 2 == 0)) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (!(str != null)) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            strArr2[i2] = AbstractC1269Xn.m2580Uf(str).toString();
        }
        int m2679j = AbstractC1292YB.m2679j(0, strArr2.length - 1, 2);
        if (m2679j >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                m3228W(str2);
                m3221G(str3, str2);
                if (i == m2679j) {
                    break;
                }
                i += 2;
            }
        }
        return new C1494c7(strArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x003b, code lost:
    
        if (r0 != ':') goto L69;
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3227V(java.lang.String r5, int r6, int r7, boolean r8) {
        /*
        L0:
            if (r6 >= r7) goto L46
            char r0 = r5.charAt(r6)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto Lf
            r1 = 9
            if (r0 != r1) goto L3d
        Lf:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L3d
            r1 = 48
            r3 = 58
            r4 = 0
            if (r1 > r0) goto L1e
            if (r0 >= r3) goto L1e
            r1 = r2
            goto L1f
        L1e:
            r1 = r4
        L1f:
            if (r1 != 0) goto L3d
            r1 = 97
            if (r1 > r0) goto L2b
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L2b
            r1 = r2
            goto L2c
        L2b:
            r1 = r4
        L2c:
            if (r1 != 0) goto L3d
            r1 = 65
            if (r1 > r0) goto L38
            r1 = 91
            if (r0 >= r1) goto L38
            r1 = r2
            goto L39
        L38:
            r1 = r4
        L39:
            if (r1 != 0) goto L3d
            if (r0 != r3) goto L3e
        L3d:
            r4 = r2
        L3e:
            r0 = r8 ^ 1
            if (r4 != r0) goto L43
            return r6
        L43:
            int r6 = r6 + 1
            goto L0
        L46:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1710g8.m3227V(java.lang.String, int, int, boolean):int");
    }

    /* renamed from: W */
    public static void m3228W(String str) {
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!('!' <= charAt && charAt < 127)) {
                throw new IllegalArgumentException(AbstractC1181W6.m2429u("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    /* renamed from: Y */
    public static String m3229Y(String str, int i, int i2, boolean z, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt != '%' && (charAt != '+' || !z)) {
                i5++;
            } else {
                C2361sQ c2361sQ = new C2361sQ();
                c2361sQ.m4078Ry(i, i5, str);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i2) {
                        int m2413I = AbstractC1181W6.m2413I(str.charAt(i5 + 1));
                        int m2413I2 = AbstractC1181W6.m2413I(str.charAt(i4));
                        if (m2413I != -1 && m2413I2 != -1) {
                            c2361sQ.m4086nB((m2413I << 4) + m2413I2);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        c2361sQ.m4077Rh(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            c2361sQ.m4086nB(32);
                            i5++;
                        }
                        c2361sQ.m4077Rh(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return c2361sQ.m4087oI();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: c */
    public static ArrayList m3230c(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int m2572Fu = AbstractC1269Xn.m2572Fu(str, '&', i, false, 4);
            if (m2572Fu == -1) {
                m2572Fu = str.length();
            }
            int m2572Fu2 = AbstractC1269Xn.m2572Fu(str, '=', i, false, 4);
            if (m2572Fu2 == -1 || m2572Fu2 > m2572Fu) {
                arrayList.add(str.substring(i, m2572Fu));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, m2572Fu2));
                str2 = str.substring(m2572Fu2 + 1, m2572Fu);
            }
            arrayList.add(str2);
            i = m2572Fu + 1;
        }
        return arrayList;
    }

    /* renamed from: f */
    public static long m3231f(int i, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int m3227V = m3227V(str, 0, i, false);
        Matcher matcher = C0060BC.f245S.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (m3227V < i) {
            int m3227V2 = m3227V(str, m3227V + 1, i, true);
            matcher.region(m3227V, m3227V2);
            if (i3 == -1 && matcher.usePattern(C0060BC.f245S).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(C0060BC.f246V).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else {
                if (i5 == -1) {
                    Pattern pattern = C0060BC.f244M;
                    if (matcher.usePattern(pattern).matches()) {
                        i5 = AbstractC1269Xn.m2576Rh(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(C0060BC.f243G).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            }
            m3227V = m3227V(str, m3227V2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 += 2000;
        }
        if (i2 >= 1601) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (i5 != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (1 <= i4 && i4 < 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (i3 >= 0 && i3 < 24) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        if (i6 >= 0 && i6 < 60) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            if (i7 >= 0 && i7 < 60) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC1181W6.f3854N);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i2);
                                gregorianCalendar.set(2, i5 - 1);
                                gregorianCalendar.set(5, i4);
                                gregorianCalendar.set(11, i3);
                                gregorianCalendar.set(12, i6);
                                gregorianCalendar.set(13, i7);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: g */
    public static boolean m3232g(C1364ZX c1364zx, C1429ap c1429ap) {
        int i = c1429ap.f4465I;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i != 307) {
                if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            String m2897h = c1429ap.f4472k.m2897h("Expires");
            if (m2897h == null) {
                m2897h = null;
            }
            if (m2897h == null && c1429ap.m2859z().f5543v == -1 && !c1429ap.m2859z().f5536Q && !c1429ap.m2859z().f5534N) {
                return false;
            }
        }
        if (c1429ap.m2859z().f5540h || c1364zx.m2762h().f5540h) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static String m3233o(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 32) != 0 ? false : z3;
        boolean z8 = (i3 & 64) == 0 ? z4 : false;
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 43;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z8) || AbstractC1269Xn.m2582d3(str2, (char) codePointAt) || ((codePointAt == 37 && (!z5 || (z6 && !m3236s(i5, length, str)))) || (codePointAt == 43 && z7)))) {
                C2361sQ c2361sQ = new C2361sQ();
                c2361sQ.m4078Ry(i4, i5, str);
                C2361sQ c2361sQ2 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == i6 && z7) {
                            c2361sQ.m4071Fu(z5 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && !z8) || AbstractC1269Xn.m2582d3(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z5 || (z6 && !m3236s(i5, length, str)))))) {
                            if (c2361sQ2 == null) {
                                c2361sQ2 = new C2361sQ();
                            }
                            c2361sQ2.m4077Rh(codePointAt2);
                            while (!c2361sQ2.mo1626b()) {
                                int mo1616EC = c2361sQ2.mo1616EC() & 255;
                                c2361sQ.m4086nB(37);
                                char[] cArr = C2658y7.f8276M;
                                c2361sQ.m4086nB(cArr[(mo1616EC >> 4) & 15]);
                                c2361sQ.m4086nB(cArr[mo1616EC & 15]);
                            }
                        } else {
                            c2361sQ.m4077Rh(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 43;
                }
                return c2361sQ.m4087oI();
            }
            i5 += Character.charCount(codePointAt);
        }
        return str.substring(i4, length);
    }

    /* renamed from: q */
    public static EnumC1854ix m3234q(String str) {
        if (AbstractC1292YB.m2695u(str, "http/1.0")) {
            return EnumC1854ix.f5780R;
        }
        if (AbstractC1292YB.m2695u(str, "http/1.1")) {
            return EnumC1854ix.f5784w;
        }
        if (AbstractC1292YB.m2695u(str, "h2_prior_knowledge")) {
            return EnumC1854ix.f5782k;
        }
        if (AbstractC1292YB.m2695u(str, "h2")) {
            return EnumC1854ix.f5783q;
        }
        if (AbstractC1292YB.m2695u(str, "spdy/3.1")) {
            return EnumC1854ix.f5779I;
        }
        if (AbstractC1292YB.m2695u(str, "quic")) {
            return EnumC1854ix.f5781g;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* renamed from: r */
    public static boolean m3235r(Context context, File file, OutputStream outputStream, String str, CharSequence charSequence) {
        JarEntry jarEntry;
        C1368Zc c1368Zc;
        byte[] bArr;
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getPath(), 0);
        if (packageArchiveInfo == null) {
            return false;
        }
        String obj = packageArchiveInfo.applicationInfo.nonLocalizedLabel.toString();
        try {
            C2723zO c2723zO = new C2723zO(file);
            try {
                LinkedHashMap linkedHashMap = c2723zO.f8562S;
                if (linkedHashMap != null) {
                    jarEntry = (C1368Zc) linkedHashMap.get("AndroidManifest.xml");
                } else {
                    jarEntry = null;
                }
                if (jarEntry == null) {
                    jarEntry = c2723zO.f8561R.getJarEntry("AndroidManifest.xml");
                }
                String name = jarEntry.getName();
                LinkedHashMap linkedHashMap2 = c2723zO.f8562S;
                if (linkedHashMap2 != null) {
                    c1368Zc = (C1368Zc) linkedHashMap2.get(name);
                } else {
                    c1368Zc = null;
                }
                if (c1368Zc != null) {
                    bArr = c1368Zc.f4285S.toByteArray();
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    C1805i c1805i = new C1805i();
                    InputStream inputStream = c2723zO.f8561R.getInputStream(jarEntry);
                    synchronized (c1805i) {
                        c1805i.m3363V(inputStream);
                    }
                    bArr = c1805i.toByteArray();
                }
                C1538d c1538d = new C1538d(bArr);
                if (!c1538d.m2984z(new C2650xz(str, new C1831iT(new C1228Wy(3, new C0507Ja(null)), C0741Nu.f2526L, 0).iterator(), obj, charSequence, 1))) {
                    AbstractC1292YB.m2659R(c2723zO, null);
                    return false;
                }
                if (c2723zO.f8562S == null) {
                    c2723zO.f8562S = new LinkedHashMap();
                }
                C1368Zc c1368Zc2 = new C1368Zc(jarEntry.getName());
                c2723zO.f8562S.put(jarEntry.getName(), c1368Zc2);
                C1805i c1805i2 = c1368Zc2.f4285S;
                try {
                    c1805i2.write(c1538d.f4765z);
                    AbstractC1292YB.m2659R(c1805i2, null);
                    C0946Rn c0946Rn = new C0946Rn();
                    AbstractC1070U4.m2254v(c0946Rn.f3244z, c0946Rn.f3243h, c2723zO, outputStream);
                    AbstractC1292YB.m2659R(c2723zO, null);
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            AbstractC1530cs.f4727z.mo1160v(e);
            return false;
        }
    }

    /* renamed from: s */
    public static boolean m3236s(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC1181W6.m2413I(str.charAt(i + 1)) != -1 && AbstractC1181W6.m2413I(str.charAt(i3)) != -1;
    }

    /* renamed from: u */
    public static final C1429ap m3237u(C1429ap c1429ap) {
        AbstractC1449bB abstractC1449bB;
        if (c1429ap != null) {
            abstractC1449bB = c1429ap.f4471g;
        } else {
            abstractC1449bB = null;
        }
        if (abstractC1449bB != null) {
            c1429ap.getClass();
            C2368sZ c2368sZ = new C2368sZ(c1429ap);
            c2368sZ.f7284u = null;
            return c2368sZ.m4094z();
        }
        return c1429ap;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x004c  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C2254qS m3238w(javax.net.ssl.SSLSession r6) {
        /*
            a.X8 r0 = p000a.C1239X8.f4021S
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L7e
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = p000a.AbstractC1292YB.m2695u(r1, r2)
            r3 = 1
            if (r2 == 0) goto L13
            r2 = r3
            goto L19
        L13:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = p000a.AbstractC1292YB.m2695u(r1, r2)
        L19:
            if (r2 != 0) goto L72
            a.g8 r2 = p000a.C0280FK.f973h
            a.FK r1 = r2.m3242S(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L66
            java.lang.String r4 = "NONE"
            boolean r4 = p000a.AbstractC1292YB.m2695u(r4, r2)
            if (r4 != 0) goto L5e
            a.Wf r2 = m3225R(r2)
            java.security.cert.Certificate[] r4 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            if (r4 == 0) goto L43
            int r5 = r4.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            java.util.List r4 = p000a.AbstractC1181W6.m2412G(r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            goto L44
        L43:
            r4 = r0
        L44:
            a.qS r5 = new a.qS
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L55
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = p000a.AbstractC1181W6.m2412G(r6)
        L55:
            a.np r6 = new a.np
            r6.<init>(r3, r4)
            r5.<init>(r2, r1, r0, r6)
            return r5
        L5e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L66:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L72:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L7e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1710g8.m3238w(javax.net.ssl.SSLSession):a.qS");
    }

    /* renamed from: y */
    public static boolean m3239y(String str) {
        return (AbstractC1269Xn.m2594yF("Connection", str) || AbstractC1269Xn.m2594yF("Keep-Alive", str) || AbstractC1269Xn.m2594yF("Proxy-Authenticate", str) || AbstractC1269Xn.m2594yF("Proxy-Authorization", str) || AbstractC1269Xn.m2594yF("TE", str) || AbstractC1269Xn.m2594yF("Trailers", str) || AbstractC1269Xn.m2594yF("Transfer-Encoding", str) || AbstractC1269Xn.m2594yF("Upgrade", str)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m3240J(android.app.Activity r12, p000a.InterfaceC1171Vv r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1710g8.m3240J(android.app.Activity, a.Vv):java.lang.Object");
    }

    /* renamed from: M */
    public EdgeEffect mo3241M(RecyclerView recyclerView, int i) {
        return new EdgeEffect(recyclerView.getContext());
    }

    @Override // p000a.InterfaceC1428ao
    /* renamed from: N */
    public AbstractC1952kk mo1121N(Class cls, C0945Rm c0945Rm) {
        return mo1123z(cls);
    }

    @Override // p000a.InterfaceC2491ux
    /* renamed from: P */
    public Object mo329P(Object obj) {
        return obj.toString();
    }

    /* renamed from: S */
    public synchronized C0280FK m3242S(String str) {
        C0280FK c0280fk;
        String str2;
        LinkedHashMap linkedHashMap = C0280FK.f966P;
        c0280fk = (C0280FK) linkedHashMap.get(str);
        if (c0280fk == null) {
            if (str.startsWith("TLS_")) {
                str2 = "SSL_".concat(str.substring(4));
            } else if (str.startsWith("SSL_")) {
                str2 = "TLS_".concat(str.substring(4));
            } else {
                str2 = str;
            }
            c0280fk = (C0280FK) linkedHashMap.get(str2);
            if (c0280fk == null) {
                c0280fk = new C0280FK(str);
            }
            linkedHashMap.put(str, c0280fk);
        }
        return c0280fk;
    }

    @Override // p000a.InterfaceC0733Nm
    /* renamed from: h */
    public List mo1688h(String str) {
        try {
            return AbstractC1658fB.m3132Pm(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m3243k(android.app.Activity r7, java.lang.String r8, p000a.InterfaceC1171Vv r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p000a.C0734Nn
            if (r0 == 0) goto L13
            r0 = r9
            a.Nn r0 = (p000a.C0734Nn) r0
            int r1 = r0.f2481g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2481g = r1
            goto L18
        L13:
            a.Nn r0 = new a.Nn
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f2483q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f2481g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a.fm r7 = r0.f2480I
            p000a.AbstractC1292YB.m2664UZ(r9)
            goto L66
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            p000a.AbstractC1292YB.m2664UZ(r9)
            android.app.ProgressDialog r9 = new android.app.ProgressDialog
            r9.<init>(r7)
            r2 = 2131886162(0x7f120052, float:1.9406895E38)
            java.lang.String r2 = r7.getString(r2)
            r9.setTitle(r2)
            r9.setIndeterminate(r3)
            r2 = 0
            r9.setCancelable(r2)
            r9.show()
            a.fm r4 = new a.fm
            r4.<init>(r9, r7, r2)
            a.Bp r9 = p000a.AbstractC0037Al.f178h
            a.VK r2 = new a.VK
            r5 = 0
            r2.<init>(r7, r8, r4, r5)
            r0.f2480I = r4
            r0.f2481g = r3
            java.lang.Object r9 = p000a.AbstractC0438II.m1021ZH(r9, r2, r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            r7 = r4
        L66:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 != 0) goto L71
            r7.run()
        L71:
            a.GJ r7 = p000a.C0329GJ.f1115z
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1710g8.m3243k(android.app.Activity, java.lang.String, a.Vv):java.lang.Object");
    }

    @Override // p000a.InterfaceC1928kH
    /* renamed from: v */
    public int mo3244v(CharSequence charSequence, int i) {
        int i2 = i + 0;
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            C0678Mp c0678Mp = AbstractC0690N3.f2335z;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                }
                i3 = 0;
            }
            i3 = 1;
        }
        return i3;
    }

    @Override // p000a.InterfaceC1428ao
    /* renamed from: z */
    public AbstractC1952kk mo1123z(Class cls) {
        return new C0916RF(true);
    }

    public C1710g8(int[] iArr, ValueAnimator valueAnimator) {
    }
}
