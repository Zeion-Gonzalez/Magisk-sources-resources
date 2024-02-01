package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.c7 */
/* loaded from: classes.dex */
public final class C1494c7 implements Iterable, InterfaceC1564dP {

    /* renamed from: S */
    public final String[] f4637S;

    public C1494c7(String[] strArr) {
        this.f4637S = strArr;
    }

    /* renamed from: N */
    public final String m2894N(int i) {
        return this.f4637S[(i * 2) + 1];
    }

    /* renamed from: P */
    public final C1571dY m2895P() {
        C1571dY c1571dY = new C1571dY();
        c1571dY.f4838z.addAll(Arrays.asList(this.f4637S));
        return c1571dY;
    }

    /* renamed from: Q */
    public final List m2896Q(String str) {
        int length = this.f4637S.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (AbstractC1269Xn.m2594yF(str, m2898v(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m2894N(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return C1239X8.f4021S;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1494c7) {
            if (Arrays.equals(this.f4637S, ((C1494c7) obj).f4637S)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final String m2897h(String str) {
        String[] strArr = this.f4637S;
        int length = strArr.length - 2;
        int m2679j = AbstractC1292YB.m2679j(length, 0, -2);
        if (m2679j <= length) {
            while (!AbstractC1269Xn.m2594yF(str, strArr[length])) {
                if (length != m2679j) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4637S);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int length = this.f4637S.length / 2;
        C0084Bc[] c0084BcArr = new C0084Bc[length];
        for (int i = 0; i < length; i++) {
            c0084BcArr[i] = new C0084Bc(m2898v(i), m2894N(i));
        }
        return new C2098nX(c0084BcArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f4637S.length / 2;
        for (int i = 0; i < length; i++) {
            String m2898v = m2898v(i);
            String m2894N = m2894N(i);
            sb.append(m2898v);
            sb.append(": ");
            if (AbstractC1181W6.m2431w(m2898v)) {
                m2894N = "██";
            }
            sb.append(m2894N);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: v */
    public final String m2898v(int i) {
        return this.f4637S[i * 2];
    }
}
