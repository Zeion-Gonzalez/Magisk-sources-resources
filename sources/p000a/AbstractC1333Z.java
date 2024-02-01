package p000a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: a.Z */
/* loaded from: classes.dex */
public abstract class AbstractC1333Z extends AbstractC1593e implements Iterable {

    /* renamed from: R */
    public static final C2120o f4223R = new C2120o(16, 17, AbstractC1333Z.class);

    /* renamed from: S */
    public InterfaceC0959S[] f4224S;

    public AbstractC1333Z() {
        this.f4224S = C2551w.f7795P;
    }

    /* renamed from: U */
    public static AbstractC1333Z m2714U(Object obj) {
        if (obj == null || (obj instanceof AbstractC1333Z)) {
            return (AbstractC1333Z) obj;
        }
        if (obj instanceof InterfaceC0959S) {
            AbstractC1593e mo302N = ((InterfaceC0959S) obj).mo302N();
            if (mo302N instanceof AbstractC1333Z) {
                return (AbstractC1333Z) mo302N;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC1333Z) f4223R.m438N((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(obj.getClass().getName()));
    }

    /* renamed from: E */
    public InterfaceC0959S mo142E(int i) {
        return this.f4224S[i];
    }

    /* renamed from: J */
    public abstract AbstractC0102C mo143J();

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return true;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof AbstractC1333Z)) {
            return false;
        }
        AbstractC1333Z abstractC1333Z = (AbstractC1333Z) abstractC1593e;
        int size = size();
        if (abstractC1333Z.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            AbstractC1593e mo302N = this.f4224S[i].mo302N();
            AbstractC1593e mo302N2 = abstractC1333Z.f4224S[i].mo302N();
            if (mo302N != mo302N2 && !mo302N.mo216V(mo302N2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y */
    public abstract AbstractC0477J mo145Y();

    /* renamed from: f */
    public Enumeration mo147f() {
        return new C0261F(0, this);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: g */
    public AbstractC1593e mo148g() {
        return new C0423I1(this.f4224S);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public int hashCode() {
        int length = this.f4224S.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.f4224S[length].mo302N().hashCode();
        }
    }

    public Iterator iterator() {
        return new C1626eb(this.f4224S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: k */
    public AbstractC1593e mo149k() {
        return new C1802hw(this.f4224S, 0);
    }

    /* renamed from: r */
    public abstract AbstractC1176W mo150r();

    /* renamed from: s */
    public final AbstractC0477J[] m2715s() {
        int size = size();
        AbstractC0477J[] abstractC0477JArr = new AbstractC0477J[size];
        for (int i = 0; i < size; i++) {
            abstractC0477JArr[i] = AbstractC0477J.m1154y(this.f4224S[i]);
        }
        return abstractC0477JArr;
    }

    public int size() {
        return this.f4224S.length;
    }

    public final String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.f4224S[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    /* renamed from: y */
    public final AbstractC1176W[] m2716y() {
        int size = size();
        AbstractC1176W[] abstractC1176WArr = new AbstractC1176W[size];
        for (int i = 0; i < size; i++) {
            abstractC1176WArr[i] = AbstractC1176W.m2404s(this.f4224S[i]);
        }
        return abstractC1176WArr;
    }

    public AbstractC1333Z(InterfaceC0959S interfaceC0959S) {
        if (interfaceC0959S == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f4224S = new InterfaceC0959S[]{interfaceC0959S};
    }

    public AbstractC1333Z(C2551w c2551w) {
        if (c2551w == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f4224S = c2551w.m4369P();
    }

    public AbstractC1333Z(InterfaceC0959S[] interfaceC0959SArr) {
        boolean z = true;
        if (interfaceC0959SArr != null) {
            int length = interfaceC0959SArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (interfaceC0959SArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        this.f4224S = C2551w.m4368h(interfaceC0959SArr);
    }

    public AbstractC1333Z(InterfaceC0959S[] interfaceC0959SArr, int i) {
        this.f4224S = interfaceC0959SArr;
    }
}
