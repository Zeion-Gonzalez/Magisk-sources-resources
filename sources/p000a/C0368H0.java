package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.H0 */
/* loaded from: classes.dex */
public final class C0368H0 {

    /* renamed from: Q */
    public static int f1268Q;

    /* renamed from: h */
    public final int f1271h;

    /* renamed from: v */
    public int f1272v;

    /* renamed from: z */
    public final ArrayList f1273z = new ArrayList();

    /* renamed from: P */
    public ArrayList f1270P = null;

    /* renamed from: N */
    public int f1269N = -1;

    public C0368H0(int i) {
        this.f1271h = -1;
        int i2 = f1268Q;
        f1268Q = i2 + 1;
        this.f1271h = i2;
        this.f1272v = i;
    }

    /* renamed from: h */
    public final int m846h(C0457If c0457If, int i) {
        int m1093w;
        C0287FS c0287fs;
        ArrayList arrayList = this.f1273z;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1535cx c1535cx = (C1535cx) ((C1628ed) arrayList.get(0)).f5020B;
        c0457If.m1109s();
        c1535cx.mo905v(c0457If, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C1628ed) arrayList.get(i2)).mo905v(c0457If, false);
        }
        if (i == 0 && c1535cx.f4756yF > 0) {
            AbstractC2575wW.m4432h(c1535cx, c0457If, arrayList, 0);
        }
        if (i == 1 && c1535cx.f4755tJ > 0) {
            AbstractC2575wW.m4432h(c1535cx, c0457If, arrayList, 1);
        }
        try {
            c0457If.m1108q();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f1270P = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f1270P.add(new C0847Pp(this, (C1628ed) arrayList.get(i3), c0457If, i));
        }
        if (i == 0) {
            m1093w = C0457If.m1093w(c1535cx.f5022C);
            c0287fs = c1535cx.f5064j;
        } else {
            m1093w = C0457If.m1093w(c1535cx.f5074p);
            c0287fs = c1535cx.f5034L;
        }
        int m1093w2 = C0457If.m1093w(c0287fs);
        c0457If.m1109s();
        return m1093w2 - m1093w;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f1272v;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f1271h);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f1273z.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C1628ed) it.next()).f5069n0;
        }
        return AbstractC2441tz.m4195W(sb2, " >");
    }

    /* renamed from: v */
    public final void m847v(int i, C0368H0 c0368h0) {
        Iterator it = this.f1273z.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i2 = c0368h0.f1271h;
            if (hasNext) {
                C1628ed c1628ed = (C1628ed) it.next();
                ArrayList arrayList = c0368h0.f1273z;
                if (!arrayList.contains(c1628ed)) {
                    arrayList.add(c1628ed);
                }
                if (i == 0) {
                    c1628ed.f5053ZH = i2;
                } else {
                    c1628ed.f5035Lq = i2;
                }
            } else {
                this.f1269N = i2;
                return;
            }
        }
    }

    /* renamed from: z */
    public final void m848z(ArrayList arrayList) {
        int size = this.f1273z.size();
        if (this.f1269N != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0368H0 c0368h0 = (C0368H0) arrayList.get(i);
                if (this.f1269N == c0368h0.f1271h) {
                    m847v(this.f1272v, c0368h0);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
