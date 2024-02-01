package p000a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: a.mV */
/* loaded from: classes.dex */
public final class C2043mV extends AbstractC0209E implements InterfaceC1121V {

    /* renamed from: k */
    public static final C0516Jj f6362k = C0516Jj.f1720qn;

    /* renamed from: I */
    public final C0440IL[] f6363I;

    /* renamed from: R */
    public int f6364R;

    /* renamed from: S */
    public boolean f6365S;

    /* renamed from: q */
    public final C1802hw f6366q;

    /* renamed from: w */
    public final AbstractC2575wW f6367w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2043mV() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2043mV.<init>():void");
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        return this.f6366q;
    }

    @Override // p000a.AbstractC0209E
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2043mV) && !(obj instanceof AbstractC1333Z)) {
            return false;
        }
        if (this.f6366q.m3068I(((InterfaceC0959S) obj).mo302N())) {
            return true;
        }
        try {
            AbstractC2575wW abstractC2575wW = this.f6367w;
            C2043mV c2043mV = new C2043mV(AbstractC1333Z.m2714U(((InterfaceC0959S) obj).mo302N()));
            abstractC2575wW.getClass();
            return AbstractC2575wW.m4455v(this, c2043mV);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p000a.AbstractC0209E
    public final int hashCode() {
        boolean z;
        if (this.f6365S) {
            return this.f6364R;
        }
        this.f6365S = true;
        this.f6367w.getClass();
        C0440IL[] c0440ilArr = (C0440IL[]) this.f6363I.clone();
        int i = 0;
        for (int i2 = 0; i2 != c0440ilArr.length; i2++) {
            C0440IL c0440il = c0440ilArr[i2];
            if (c0440il.f1473S.f388S.length > 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C2425th[] m1058S = c0440il.m1058S();
                for (int i3 = 0; i3 != m1058S.length; i3++) {
                    i = (i ^ m1058S[i3].f7427S.hashCode()) ^ AbstractC1843ih.m3453o(m1058S[i3].f7426R).hashCode();
                }
            } else {
                i = (i ^ c0440il.m1059V().f7427S.hashCode()) ^ AbstractC1843ih.m3453o(c0440ilArr[i2].m1059V().f7426R).hashCode();
            }
        }
        this.f6364R = i;
        return i;
    }

    public final String toString() {
        boolean z;
        C0516Jj c0516Jj = (C0516Jj) this.f6367w;
        c0516Jj.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        for (C0440IL c0440il : (C0440IL[]) this.f6363I.clone()) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append(',');
            }
            Hashtable hashtable = c0516Jj.f1722T;
            if (c0440il.f1473S.f388S.length > 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C2425th[] m1058S = c0440il.m1058S();
                boolean z3 = true;
                for (int i = 0; i != m1058S.length; i++) {
                    if (z3) {
                        z3 = false;
                    } else {
                        stringBuffer.append('+');
                    }
                    AbstractC1843ih.m3463v(stringBuffer, m1058S[i], hashtable);
                }
            } else if (c0440il.m1059V() != null) {
                AbstractC1843ih.m3463v(stringBuffer, c0440il.m1059V(), hashtable);
            }
        }
        return stringBuffer.toString();
    }

    public C2043mV(AbstractC1333Z abstractC1333Z) {
        C1802hw c1802hw;
        C0440IL c0440il;
        AbstractC0102C abstractC0102C;
        this.f6367w = f6362k;
        this.f6363I = new C0440IL[abstractC1333Z.size()];
        Enumeration mo147f = abstractC1333Z.mo147f();
        boolean z = true;
        int i = 0;
        while (mo147f.hasMoreElements()) {
            Object nextElement = mo147f.nextElement();
            if (nextElement instanceof C0440IL) {
                c0440il = (C0440IL) nextElement;
            } else if (nextElement != null) {
                C2120o c2120o = AbstractC0102C.f386w;
                if (nextElement instanceof AbstractC0102C) {
                    abstractC0102C = (AbstractC0102C) nextElement;
                } else if (nextElement instanceof InterfaceC0959S) {
                    AbstractC1593e mo302N = ((InterfaceC0959S) nextElement).mo302N();
                    if (!(mo302N instanceof AbstractC0102C)) {
                        throw new IllegalArgumentException("unknown object in getInstance: ".concat(nextElement.getClass().getName()));
                    }
                    abstractC0102C = (AbstractC0102C) mo302N;
                } else {
                    if (!(nextElement instanceof byte[])) {
                        throw new IllegalArgumentException("unknown object in getInstance: ".concat(nextElement.getClass().getName()));
                    }
                    try {
                        abstractC0102C = (AbstractC0102C) AbstractC0102C.f386w.m438N((byte[]) nextElement);
                    } catch (IOException e) {
                        throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
                    }
                }
                c0440il = new C0440IL(abstractC0102C);
            } else {
                c0440il = null;
            }
            z &= c0440il == nextElement;
            this.f6363I[i] = c0440il;
            i++;
        }
        if (z) {
            int i2 = C1802hw.f5663I;
            c1802hw = (C1802hw) abstractC1333Z.mo149k();
        } else {
            c1802hw = new C1802hw(this.f6363I);
        }
        this.f6366q = c1802hw;
    }

    public C2043mV(AbstractC2575wW abstractC2575wW, C0440IL[] c0440ilArr) {
        this.f6367w = abstractC2575wW;
        C0440IL[] c0440ilArr2 = (C0440IL[]) c0440ilArr.clone();
        this.f6363I = c0440ilArr2;
        this.f6366q = new C1802hw(c0440ilArr2);
    }
}
