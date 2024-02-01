package p000a;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: a.Uy */
/* loaded from: classes.dex */
public final class C1120Uy {

    /* renamed from: G */
    public final C0918RI f3660G;

    /* renamed from: M */
    public AbstractC1911jx f3661M;

    /* renamed from: N */
    public final C2306rP f3662N = new C2306rP();

    /* renamed from: P */
    public C0349Gf f3663P;

    /* renamed from: Q */
    public final C1571dY f3664Q;

    /* renamed from: W */
    public final C1151VX f3665W;

    /* renamed from: h */
    public final C2658y7 f3666h;

    /* renamed from: o */
    public final boolean f3667o;

    /* renamed from: u */
    public C0003A3 f3668u;

    /* renamed from: v */
    public String f3669v;

    /* renamed from: z */
    public final String f3670z;

    /* renamed from: V */
    public static final char[] f3659V = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: S */
    public static final Pattern f3658S = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    public C1120Uy(String str, C2658y7 c2658y7, String str2, C1494c7 c1494c7, C0003A3 c0003a3, boolean z, boolean z2, boolean z3) {
        this.f3670z = str;
        this.f3666h = c2658y7;
        this.f3669v = str2;
        this.f3668u = c0003a3;
        this.f3667o = z;
        this.f3664Q = c1494c7 != null ? c1494c7.m2895P() : new C1571dY();
        if (z2) {
            this.f3660G = new C0918RI();
            return;
        }
        if (z3) {
            C1151VX c1151vx = new C1151VX();
            this.f3665W = c1151vx;
            C0003A3 c0003a32 = C2566wL.f7837Q;
            if (AbstractC1292YB.m2695u(c0003a32.f65h, "multipart")) {
                c1151vx.f3735h = c0003a32;
            } else {
                throw new IllegalArgumentException(("multipart != " + c0003a32).toString());
            }
        }
    }

    /* renamed from: P */
    public final void m2305P(String str, String str2, boolean z) {
        C0349Gf c0349Gf;
        String str3 = this.f3669v;
        String str4 = null;
        if (str3 != null) {
            C2658y7 c2658y7 = this.f3666h;
            c2658y7.getClass();
            try {
                c0349Gf = new C0349Gf();
                c0349Gf.m760N(c2658y7, str3);
            } catch (IllegalArgumentException unused) {
                c0349Gf = null;
            }
            this.f3663P = c0349Gf;
            if (c0349Gf != null) {
                this.f3669v = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + c2658y7 + ", Relative: " + this.f3669v);
            }
        }
        C0349Gf c0349Gf2 = this.f3663P;
        if (z) {
            if (c0349Gf2.f1178u == null) {
                c0349Gf2.f1178u = new ArrayList();
            }
            c0349Gf2.f1178u.add(C1710g8.m3233o(str, 0, 0, " \"'<>#&=", true, false, true, false, 211));
            ArrayList arrayList = c0349Gf2.f1178u;
            if (str2 != null) {
                str4 = C1710g8.m3233o(str2, 0, 0, " \"'<>#&=", true, false, true, false, 211);
            }
            arrayList.add(str4);
            return;
        }
        c0349Gf2.m764z(str, str2);
    }

    /* renamed from: h */
    public final void m2306h(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = C0003A3.f64P;
                this.f3668u = C1710g8.m3223I(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC2441tz.m4200k("Malformed content type: ", str2), e);
            }
        }
        this.f3664Q.m3045z(str, str2);
    }

    /* renamed from: v */
    public final void m2307v(C1494c7 c1494c7, AbstractC1911jx abstractC1911jx) {
        String str;
        boolean z;
        C1151VX c1151vx = this.f3665W;
        c1151vx.getClass();
        String str2 = null;
        if (c1494c7 != null) {
            str = c1494c7.m2897h("Content-Type");
        } else {
            str = null;
        }
        boolean z2 = true;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (c1494c7 != null) {
                str2 = c1494c7.m2897h("Content-Length");
            }
            if (str2 != null) {
                z2 = false;
            }
            if (z2) {
                c1151vx.f3736v.add(new C1360ZS(c1494c7, abstractC1911jx));
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }

    /* renamed from: z */
    public final void m2308z(String str, String str2, boolean z) {
        C0918RI c0918ri = this.f3660G;
        if (z) {
            c0918ri.f3162z.add(C1710g8.m3233o(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            c0918ri.f3161h.add(C1710g8.m3233o(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
        } else {
            c0918ri.f3162z.add(C1710g8.m3233o(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
            c0918ri.f3161h.add(C1710g8.m3233o(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
        }
    }
}
