package p000a;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: a.B3 */
/* loaded from: classes.dex */
public final class C0054B3 {
    public C0054B3(AbstractC2441tz abstractC2441tz) {
    }

    /* JADX WARN: Removed duplicated region for block: B:253:0x0043  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C1755gz m95N(p000a.C1494c7 r24) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0054B3.m95N(a.c7):a.gz");
    }

    /* renamed from: P */
    public static String m96P(C2658y7 c2658y7) {
        C1623eY c1623eY = C1623eY.f5009I;
        return C2252qQ.m3884M(c2658y7.f8281W).mo1988v("MD5").mo1979N();
    }

    /* renamed from: Q */
    public static int m97Q(C2323ri c2323ri) {
        try {
            long m3977h = c2323ri.m3977h();
            String mo1633t = c2323ri.mo1633t();
            if (m3977h >= 0 && m3977h <= 2147483647L) {
                if (!(mo1633t.length() > 0)) {
                    return (int) m3977h;
                }
            }
            throw new IOException("expected an int but was \"" + m3977h + mo1633t + '\"');
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: h */
    public static void m98h(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    /* renamed from: u */
    public static Set m99u(C1494c7 c1494c7) {
        int length = c1494c7.f4637S.length / 2;
        TreeSet treeSet = null;
        for (int i = 0; i < length; i++) {
            if (AbstractC1269Xn.m2594yF("Vary", c1494c7.m2898v(i))) {
                String m2894N = c1494c7.m2894N(i);
                if (treeSet == null) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                Iterator it = AbstractC1269Xn.m2571F3(m2894N, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC1269Xn.m2580Uf((String) it.next()).toString());
                }
            }
        }
        if (treeSet == null) {
            return C1460bR.f4549S;
        }
        return treeSet;
    }

    /* renamed from: v */
    public static void m100v(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    /* renamed from: z */
    public static void m101z(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public C0054B3(Object obj) {
    }
}
