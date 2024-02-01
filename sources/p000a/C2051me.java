package p000a;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: a.me */
/* loaded from: classes.dex */
public final class C2051me extends AbstractC0209E {

    /* renamed from: S */
    public final Hashtable f6381S = new Hashtable();

    /* renamed from: R */
    public final Vector f6380R = new Vector();

    public C2051me(AbstractC1333Z abstractC1333Z) {
        Enumeration mo147f = abstractC1333Z.mo147f();
        while (mo147f.hasMoreElements()) {
            Object nextElement = mo147f.nextElement();
            C1281Y c1281y = C1767hE.f5563I;
            C1767hE c1767hE = nextElement instanceof C1767hE ? (C1767hE) nextElement : nextElement != null ? new C1767hE(AbstractC1333Z.m2714U(nextElement)) : null;
            boolean containsKey = this.f6381S.containsKey(c1767hE.f5568S);
            C1281Y c1281y2 = c1767hE.f5568S;
            if (containsKey && !AbstractC1642et.m3118h("org.bouncycastle.x509.ignore_repeated_extensions")) {
                throw new IllegalArgumentException("repeated extension found: " + c1281y2);
            }
            this.f6381S.put(c1281y2, c1767hE);
            this.f6380R.addElement(c1281y2);
        }
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        Vector vector = this.f6380R;
        C2551w c2551w = new C2551w(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            c2551w.m4371z((C1767hE) this.f6381S.get((C1281Y) elements.nextElement()));
        }
        return new C1802hw(c2551w);
    }

    public C2051me(C1767hE[] c1767hEArr) {
        for (int i = 0; i != c1767hEArr.length; i++) {
            C1767hE c1767hE = c1767hEArr[i];
            this.f6380R.addElement(c1767hE.f5568S);
            this.f6381S.put(c1767hE.f5568S, c1767hE);
        }
    }
}
