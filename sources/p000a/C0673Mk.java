package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: a.Mk */
/* loaded from: classes.dex */
public final class C0673Mk {

    /* renamed from: N */
    public static final C0673Mk f2219N;

    /* renamed from: Q */
    public static final C0673Mk f2220Q;

    /* renamed from: P */
    public final String[] f2221P;

    /* renamed from: h */
    public final boolean f2222h;

    /* renamed from: v */
    public final String[] f2223v;

    /* renamed from: z */
    public final boolean f2224z;

    static {
        C0280FK c0280fk = C0280FK.f974k;
        C0280FK c0280fk2 = C0280FK.f972g;
        C0280FK c0280fk3 = C0280FK.f980y;
        C0280FK c0280fk4 = C0280FK.f970V;
        C0280FK c0280fk5 = C0280FK.f968R;
        C0280FK c0280fk6 = C0280FK.f969S;
        C0280FK c0280fk7 = C0280FK.f979w;
        C0280FK c0280fk8 = C0280FK.f976q;
        C0280FK c0280fk9 = C0280FK.f963I;
        C0280FK[] c0280fkArr = {c0280fk, c0280fk2, c0280fk3, c0280fk4, c0280fk5, c0280fk6, c0280fk7, c0280fk8, c0280fk9};
        C0280FK[] c0280fkArr2 = {c0280fk, c0280fk2, c0280fk3, c0280fk4, c0280fk5, c0280fk6, c0280fk7, c0280fk8, c0280fk9, C0280FK.f962G, C0280FK.f964M, C0280FK.f975o, C0280FK.f971W, C0280FK.f967Q, C0280FK.f977u, C0280FK.f965N};
        C1512cU c1512cU = new C1512cU();
        c1512cU.m2933h((C0280FK[]) Arrays.copyOf(c0280fkArr, 9));
        EnumC1213Wf enumC1213Wf = EnumC1213Wf.f3971R;
        EnumC1213Wf enumC1213Wf2 = EnumC1213Wf.f3974w;
        c1512cU.m2930N(enumC1213Wf, enumC1213Wf2);
        c1512cU.m2931P();
        c1512cU.m2935z();
        C1512cU c1512cU2 = new C1512cU();
        c1512cU2.m2933h((C0280FK[]) Arrays.copyOf(c0280fkArr2, 16));
        c1512cU2.m2930N(enumC1213Wf, enumC1213Wf2);
        c1512cU2.m2931P();
        f2219N = c1512cU2.m2935z();
        C1512cU c1512cU3 = new C1512cU();
        c1512cU3.m2933h((C0280FK[]) Arrays.copyOf(c0280fkArr2, 16));
        c1512cU3.m2930N(enumC1213Wf, enumC1213Wf2, EnumC1213Wf.f3970I, EnumC1213Wf.f3973q);
        c1512cU3.m2931P();
        c1512cU3.m2935z();
        f2220Q = new C0673Mk(false, false, null, null);
    }

    public C0673Mk(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f2224z = z;
        this.f2222h = z2;
        this.f2223v = strArr;
        this.f2221P = strArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0673Mk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0673Mk c0673Mk = (C0673Mk) obj;
        boolean z = c0673Mk.f2224z;
        boolean z2 = this.f2224z;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.f2223v, c0673Mk.f2223v) && Arrays.equals(this.f2221P, c0673Mk.f2221P) && this.f2222h == c0673Mk.f2222h);
    }

    /* renamed from: h */
    public final boolean m1570h(SSLSocket sSLSocket) {
        if (!this.f2224z) {
            return false;
        }
        String[] strArr = this.f2221P;
        if (strArr != null && !AbstractC1181W6.m2426o(strArr, sSLSocket.getEnabledProtocols(), C1147VS.f3731z)) {
            return false;
        }
        String[] strArr2 = this.f2223v;
        return strArr2 == null || AbstractC1181W6.m2426o(strArr2, sSLSocket.getEnabledCipherSuites(), C0280FK.f978v);
    }

    public final int hashCode() {
        if (!this.f2224z) {
            return 17;
        }
        String[] strArr = this.f2223v;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f2221P;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2222h ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2224z) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m1572z(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m1571v(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2222h + ')';
    }

    /* renamed from: v */
    public final List m1571v() {
        String[] strArr = this.f2221P;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1710g8.m3225R(str));
        }
        return AbstractC2486us.m4284S3(arrayList);
    }

    /* renamed from: z */
    public final List m1572z() {
        String[] strArr = this.f2223v;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0280FK.f973h.m3242S(str));
        }
        return AbstractC2486us.m4284S3(arrayList);
    }
}
