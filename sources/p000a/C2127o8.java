package p000a;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.o8 */
/* loaded from: classes.dex */
public final class C2127o8 {

    /* renamed from: G */
    public final InterfaceC1841if f6540G;

    /* renamed from: I */
    public boolean f6541I;

    /* renamed from: M */
    public final InterfaceC1841if f6542M;

    /* renamed from: N */
    public String f6543N;

    /* renamed from: P */
    public final ArrayList f6544P;

    /* renamed from: Q */
    public final C1146VR f6545Q;

    /* renamed from: R */
    public String f6546R;

    /* renamed from: S */
    public final C1146VR f6547S;

    /* renamed from: V */
    public final InterfaceC1841if f6548V;

    /* renamed from: W */
    public boolean f6549W;

    /* renamed from: h */
    public final String f6550h;

    /* renamed from: o */
    public final InterfaceC1841if f6551o;

    /* renamed from: u */
    public final C1146VR f6552u;

    /* renamed from: v */
    public final String f6553v;

    /* renamed from: w */
    public final C1146VR f6554w;

    /* renamed from: z */
    public final String f6555z;

    /* renamed from: q */
    public static final Pattern f6539q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: k */
    public static final Pattern f6538k = Pattern.compile("\\{(.+?)\\}");

    public C2127o8(String str, String str2, String str3) {
        List list;
        boolean z;
        boolean z2;
        this.f6555z = str;
        this.f6550h = str2;
        this.f6553v = str3;
        ArrayList arrayList = new ArrayList();
        this.f6544P = arrayList;
        this.f6545Q = new C1146VR(new C1656f8(this, 6));
        this.f6552u = new C1146VR(new C1656f8(this, 4));
        int i = EnumC0511Je.f1697S;
        this.f6551o = AbstractC0438II.m1020Z(new C1656f8(this, 7));
        this.f6540G = AbstractC0438II.m1020Z(new C1656f8(this, 1));
        this.f6542M = AbstractC0438II.m1020Z(new C1656f8(this, 0));
        this.f6548V = AbstractC0438II.m1020Z(new C1656f8(this, 3));
        this.f6547S = new C1146VR(new C1656f8(this, 2));
        this.f6554w = new C1146VR(new C1656f8(this, 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!f6539q.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            m3742z(str.substring(0, matcher.start()), arrayList, sb);
            if (!AbstractC1269Xn.m2591nB(sb, ".*", false) && !AbstractC1269Xn.m2591nB(sb, "([^/]+?)", false)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f6541I = z2;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            this.f6543N = AbstractC1269Xn.m2588hs(sb.toString(), ".*", "\\E.*\\Q");
        }
        if (str3 != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                List m3557z = new C1939kV("/").m3557z(0, str3);
                if (!m3557z.isEmpty()) {
                    ListIterator listIterator = m3557z.listIterator(m3557z.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            list = AbstractC2486us.m4290fH(m3557z, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = C1239X8.f4021S;
                this.f6546R = AbstractC1269Xn.m2588hs("^(" + ((String) list.get(0)) + "|[*]+)/(" + ((String) list.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
                return;
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4184G("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
    }

    /* renamed from: N */
    public static void m3741N(Bundle bundle, String str, String str2, C2419tZ c2419tZ) {
        if (c2419tZ != null) {
            AbstractC0929RT abstractC0929RT = c2419tZ.f7408z;
            abstractC0929RT.mo1953N(bundle, str, abstractC0929RT.mo1955v(str2));
        } else {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: z */
    public static void m3742z(String str, List list, StringBuilder sb) {
        Matcher matcher = f6538k.matcher(str);
        int i = 0;
        while (matcher.find()) {
            list.add(matcher.group(1));
            if (matcher.start() > i) {
                sb.append(Pattern.quote(str.substring(i, matcher.start())));
            }
            sb.append("([^/]+?)");
            i = matcher.end();
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
    }

    /* renamed from: P */
    public final boolean m3743P(Uri uri, Bundle bundle, Map map) {
        boolean z;
        Matcher matcher;
        boolean z2;
        String query;
        C2127o8 c2127o8 = this;
        for (Map.Entry entry : ((Map) c2127o8.f6551o.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            C1772hK c1772hK = (C1772hK) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (c2127o8.f6549W && (query = uri.getQuery()) != null && !AbstractC1292YB.m2695u(query, uri.toString())) {
                queryParameters = Collections.singletonList(query);
            }
            if (queryParameters != null) {
                for (String str2 : queryParameters) {
                    String str3 = c1772hK.f5574z;
                    if (str3 != null) {
                        matcher = Pattern.compile(str3, 32).matcher(str2);
                    } else {
                        matcher = null;
                    }
                    if (matcher != null && matcher.matches()) {
                        Bundle bundle2 = new Bundle();
                        try {
                            ArrayList arrayList = c1772hK.f5573h;
                            ArrayList arrayList2 = new ArrayList(AbstractC1658fB.m3134dx(arrayList));
                            Iterator it = arrayList.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i2 = i + 1;
                                if (i >= 0) {
                                    String str4 = (String) next;
                                    String group = matcher.group(i2);
                                    if (group == null) {
                                        group = "";
                                    }
                                    try {
                                        C2419tZ c2419tZ = (C2419tZ) map.get(str4);
                                        if (!bundle.containsKey(str4)) {
                                            z2 = true;
                                        } else {
                                            if (c2419tZ != null) {
                                                AbstractC0929RT abstractC0929RT = c2419tZ.f7408z;
                                                Object mo1956z = abstractC0929RT.mo1956z(str4, bundle);
                                                if (bundle.containsKey(str4)) {
                                                    abstractC0929RT.mo1953N(bundle, str4, abstractC0929RT.mo2083P(group, mo1956z));
                                                } else {
                                                    throw new IllegalArgumentException("There is no previous value in this bundle.");
                                                }
                                            }
                                            z2 = false;
                                        }
                                        if (z2) {
                                            if (!AbstractC1292YB.m2695u(group, '{' + str4 + '}')) {
                                                m3741N(bundle2, str4, group, c2419tZ);
                                            }
                                        }
                                        arrayList2.add(C0329GJ.f1115z);
                                        i = i2;
                                    } catch (IllegalArgumentException unused) {
                                        continue;
                                    }
                                } else {
                                    AbstractC1292YB.m2699zx();
                                    throw null;
                                }
                            }
                            bundle.putAll(bundle2);
                        } catch (IllegalArgumentException unused2) {
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
            c2127o8 = this;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2127o8)) {
            return false;
        }
        C2127o8 c2127o8 = (C2127o8) obj;
        return AbstractC1292YB.m2695u(this.f6555z, c2127o8.f6555z) && AbstractC1292YB.m2695u(this.f6550h, c2127o8.f6550h) && AbstractC1292YB.m2695u(this.f6553v, c2127o8.f6553v);
    }

    /* renamed from: h */
    public final List m3744h() {
        return (List) this.f6542M.getValue();
    }

    public final int hashCode() {
        String str = this.f6555z;
        int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f6550h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6553v;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: v */
    public final boolean m3745v(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.f6544P;
        ArrayList arrayList2 = new ArrayList(AbstractC1658fB.m3134dx(arrayList));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1292YB.m2699zx();
                throw null;
            }
            String str = (String) next;
            try {
                m3741N(bundle, str, Uri.decode(matcher.group(i2)), (C2419tZ) map.get(str));
                arrayList2.add(C0329GJ.f1115z);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }
}
