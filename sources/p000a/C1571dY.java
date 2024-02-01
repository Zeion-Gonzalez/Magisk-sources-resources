package p000a;

import java.util.ArrayList;

/* renamed from: a.dY */
/* loaded from: classes.dex */
public final class C1571dY {

    /* renamed from: z */
    public final ArrayList f4838z = new ArrayList(20);

    /* renamed from: N */
    public final String m3039N(String str) {
        ArrayList arrayList = this.f4838z;
        int size = arrayList.size() - 2;
        int m2679j = AbstractC1292YB.m2679j(size, 0, -2);
        if (m2679j > size) {
            return null;
        }
        while (!AbstractC1269Xn.m2594yF(str, (String) arrayList.get(size))) {
            if (size == m2679j) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    /* renamed from: P */
    public final C1494c7 m3040P() {
        return new C1494c7((String[]) this.f4838z.toArray(new String[0]));
    }

    /* renamed from: Q */
    public final void m3041Q(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4838z;
            if (i >= arrayList.size()) {
                return;
            }
            if (AbstractC1269Xn.m2594yF(str, (String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* renamed from: h */
    public final void m3042h(String str) {
        int m2572Fu = AbstractC1269Xn.m2572Fu(str, ':', 1, false, 4);
        if (m2572Fu != -1) {
            m3044v(str.substring(0, m2572Fu), str.substring(m2572Fu + 1));
            return;
        }
        if (str.charAt(0) == ':') {
            str = str.substring(1);
        }
        m3044v("", str);
    }

    /* renamed from: u */
    public final void m3043u(String str, String str2) {
        C1710g8.m3228W(str);
        C1710g8.m3221G(str2, str);
        m3041Q(str);
        m3044v(str, str2);
    }

    /* renamed from: v */
    public final void m3044v(String str, String str2) {
        ArrayList arrayList = this.f4838z;
        arrayList.add(str);
        arrayList.add(AbstractC1269Xn.m2580Uf(str2).toString());
    }

    /* renamed from: z */
    public final void m3045z(String str, String str2) {
        C1710g8.m3228W(str);
        C1710g8.m3221G(str2, str);
        m3044v(str, str2);
    }
}
