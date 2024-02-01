package p000a;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: a.DP */
/* loaded from: classes.dex */
public class C0175DP implements InterfaceC2491ux {

    /* renamed from: R */
    public final Object f541R;

    /* renamed from: S */
    public final /* synthetic */ int f542S;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0175DP(int i) {
        this(TimeUnit.MINUTES);
        this.f542S = i;
        if (i == 4) {
            this.f541R = new LinkedHashSet();
            return;
        }
        if (i == 6) {
            this.f541R = new C1665fK();
            this.f541R = new C1665fK();
        } else {
            if (i == 8) {
                this.f541R = new ThreadLocal();
                return;
            }
            if (i == 10) {
                this.f541R = new C1078UC(new C1665fK(2));
            } else if (i != 11) {
            } else {
                this.f541R = new ByteArrayOutputStream();
            }
        }
    }

    /* renamed from: N */
    public static int m333N(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: Q */
    public static int m334Q(int i, boolean z) {
        return m333N(i) + (z ? 1 : 0) + i;
    }

    /* renamed from: G */
    public void mo335G(InterfaceC0959S[] interfaceC0959SArr) {
        for (InterfaceC0959S interfaceC0959S : interfaceC0959SArr) {
            interfaceC0959S.mo302N().mo144S(this, true);
        }
    }

    /* renamed from: M */
    public final void m336M(int i, boolean z, byte[] bArr) {
        m337R(i, z);
        m340W(bArr.length);
        m342o(bArr, 0, bArr.length);
    }

    @Override // p000a.InterfaceC2491ux
    /* renamed from: P */
    public final Object mo329P(Object obj) {
        Optional ofNullable;
        ofNullable = Optional.ofNullable(((InterfaceC2491ux) this.f541R).mo329P((AbstractC1449bB) obj));
        return ofNullable;
    }

    /* renamed from: R */
    public final void m337R(int i, boolean z) {
        if (z) {
            m343u(i);
        }
    }

    /* renamed from: S */
    public final void m338S(int i, int i2) {
        if (i2 < 31) {
            m343u(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        m342o(bArr, i4, 6 - i4);
    }

    /* renamed from: V */
    public final void m339V(boolean z, int i, InterfaceC0959S[] interfaceC0959SArr) {
        m337R(i, z);
        m343u(128);
        mo335G(interfaceC0959SArr);
        m343u(0);
        m343u(0);
    }

    /* renamed from: W */
    public final void m340W(int i) {
        if (i < 128) {
            m343u(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        do {
            i2--;
            bArr[i2] = (byte) i;
            i >>>= 8;
        } while (i != 0);
        int i3 = 5 - i2;
        int i4 = i2 - 1;
        bArr[i4] = (byte) (i3 | 128);
        m342o(bArr, i4, i3 + 1);
    }

    /* renamed from: h */
    public C0242Ec mo341h() {
        return new C0242Ec((OutputStream) this.f541R);
    }

    /* renamed from: o */
    public final void m342o(byte[] bArr, int i, int i2) {
        ((OutputStream) this.f541R).write(bArr, i, i2);
    }

    public final String toString() {
        switch (this.f542S) {
            case 1:
                return "<" + ((String) this.f541R) + '>';
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public final void m343u(int i) {
        ((OutputStream) this.f541R).write(i);
    }

    /* renamed from: v */
    public C0784Ob mo344v() {
        return new C0784Ob((OutputStream) this.f541R);
    }

    /* renamed from: w */
    public void mo345w(AbstractC1593e[] abstractC1593eArr) {
        for (AbstractC1593e abstractC1593e : abstractC1593eArr) {
            abstractC1593e.mo144S(this, true);
        }
    }

    /* renamed from: z */
    public final synchronized void m346z(C1946ke c1946ke) {
        ((Set) this.f541R).remove(c1946ke);
    }

    public /* synthetic */ C0175DP(int i, Object obj) {
        this.f542S = i;
        this.f541R = obj;
    }

    public C0175DP(C0711NP c0711np) {
        this.f542S = 3;
        this.f541R = c0711np;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0175DP(C0175DP c0175dp) {
        this(c0175dp, new C1206WY());
        this.f542S = 7;
    }

    public C0175DP(C0175DP c0175dp, C1206WY c1206wy) {
        this.f542S = 7;
        this.f541R = new C0313Fz(c0175dp, c1206wy);
    }

    public C0175DP(Object obj) {
        this.f542S = 0;
        this.f541R = (Object[]) obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0175DP(TimeUnit timeUnit) {
        this(new C0711NP(C0634Lw.f2051o, timeUnit));
        this.f542S = 3;
    }
}
