package p000a;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: a.y7 */
/* loaded from: classes.dex */
public final class C2658y7 {

    /* renamed from: M */
    public static final char[] f8276M;

    /* renamed from: G */
    public final boolean f8277G;

    /* renamed from: N */
    public final int f8278N;

    /* renamed from: P */
    public final String f8279P;

    /* renamed from: Q */
    public final List f8280Q;

    /* renamed from: W */
    public final String f8281W;

    /* renamed from: h */
    public final String f8282h;

    /* renamed from: o */
    public final String f8283o;

    /* renamed from: u */
    public final List f8284u;

    /* renamed from: v */
    public final String f8285v;

    /* renamed from: z */
    public final String f8286z;

    static {
        new C1710g8();
        f8276M = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public C2658y7(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f8286z = str;
        this.f8282h = str2;
        this.f8285v = str3;
        this.f8279P = str4;
        this.f8278N = i;
        this.f8280Q = arrayList;
        this.f8284u = arrayList2;
        this.f8283o = str5;
        this.f8281W = str6;
        this.f8277G = AbstractC1292YB.m2695u(str, "https");
    }

    /* renamed from: N */
    public final String m4561N() {
        if (this.f8282h.length() == 0) {
            return "";
        }
        int length = this.f8286z.length() + 3;
        String str = this.f8281W;
        return str.substring(length, AbstractC1181W6.m2415N(length, str.length(), str, ":@"));
    }

    /* renamed from: P */
    public final String m4562P() {
        if (this.f8284u == null) {
            return null;
        }
        String str = this.f8281W;
        int m2572Fu = AbstractC1269Xn.m2572Fu(str, '?', 0, false, 6) + 1;
        return str.substring(m2572Fu, AbstractC1181W6.m2417Q(str, '#', m2572Fu, str.length()));
    }

    /* renamed from: Q */
    public final C0349Gf m4563Q() {
        int i;
        String substring;
        C0349Gf c0349Gf = new C0349Gf();
        String str = this.f8286z;
        c0349Gf.f1180z = str;
        c0349Gf.f1176h = m4561N();
        c0349Gf.f1179v = m4568z();
        c0349Gf.f1174P = this.f8279P;
        int i2 = -1;
        if (AbstractC1292YB.m2695u(str, "http")) {
            i = 80;
        } else if (AbstractC1292YB.m2695u(str, "https")) {
            i = 443;
        } else {
            i = -1;
        }
        int i3 = this.f8278N;
        if (i3 != i) {
            i2 = i3;
        }
        c0349Gf.f1173N = i2;
        ArrayList arrayList = c0349Gf.f1175Q;
        arrayList.clear();
        arrayList.addAll(m4567v());
        c0349Gf.m761P(m4562P());
        if (this.f8283o == null) {
            substring = null;
        } else {
            String str2 = this.f8281W;
            substring = str2.substring(AbstractC1269Xn.m2572Fu(str2, '#', 0, false, 6) + 1);
        }
        c0349Gf.f1177o = substring;
        return c0349Gf;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2658y7) && AbstractC1292YB.m2695u(((C2658y7) obj).f8281W, this.f8281W);
    }

    /* renamed from: h */
    public final String m4564h() {
        int length = this.f8286z.length() + 3;
        String str = this.f8281W;
        int m2572Fu = AbstractC1269Xn.m2572Fu(str, '/', length, false, 4);
        return str.substring(m2572Fu, AbstractC1181W6.m2415N(m2572Fu, str.length(), str, "?#"));
    }

    public final int hashCode() {
        return this.f8281W.hashCode();
    }

    /* renamed from: o */
    public final URI m4565o() {
        String str;
        String str2;
        C0349Gf m4563Q = m4563Q();
        String str3 = m4563Q.f1174P;
        String str4 = null;
        if (str3 != null) {
            str = Pattern.compile("[\"<>^`{|}]").matcher(str3).replaceAll("");
        } else {
            str = null;
        }
        m4563Q.f1174P = str;
        ArrayList arrayList = m4563Q.f1175Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, C1710g8.m3233o((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = m4563Q.f1178u;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str5 = (String) arrayList2.get(i2);
                if (str5 != null) {
                    str2 = C1710g8.m3233o(str5, 0, 0, "\\^`{|}", true, true, true, false, 195);
                } else {
                    str2 = null;
                }
                arrayList2.set(i2, str2);
            }
        }
        String str6 = m4563Q.f1177o;
        if (str6 != null) {
            str4 = C1710g8.m3233o(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        m4563Q.f1177o = str4;
        String c0349Gf = m4563Q.toString();
        try {
            return new URI(c0349Gf);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(c0349Gf).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.f8281W;
    }

    /* renamed from: u */
    public final String m4566u() {
        C0349Gf c0349Gf;
        try {
            c0349Gf = new C0349Gf();
            c0349Gf.m760N(this, "/...");
        } catch (IllegalArgumentException unused) {
            c0349Gf = null;
        }
        c0349Gf.getClass();
        c0349Gf.f1176h = C1710g8.m3233o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        c0349Gf.f1179v = C1710g8.m3233o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return c0349Gf.m762h().f8281W;
    }

    /* renamed from: v */
    public final ArrayList m4567v() {
        int length = this.f8286z.length() + 3;
        String str = this.f8281W;
        int m2572Fu = AbstractC1269Xn.m2572Fu(str, '/', length, false, 4);
        int m2415N = AbstractC1181W6.m2415N(m2572Fu, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (m2572Fu < m2415N) {
            int i = m2572Fu + 1;
            int m2417Q = AbstractC1181W6.m2417Q(str, '/', i, m2415N);
            arrayList.add(str.substring(i, m2417Q));
            m2572Fu = m2417Q;
        }
        return arrayList;
    }

    /* renamed from: z */
    public final String m4568z() {
        if (this.f8285v.length() == 0) {
            return "";
        }
        int length = this.f8286z.length() + 3;
        String str = this.f8281W;
        return str.substring(AbstractC1269Xn.m2572Fu(str, ':', length, false, 4) + 1, AbstractC1269Xn.m2572Fu(str, '@', 0, false, 6));
    }
}
