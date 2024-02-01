package p000a;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: a.BC */
/* loaded from: classes.dex */
public final class C0060BC {

    /* renamed from: N */
    public final String f247N;

    /* renamed from: P */
    public final String f248P;

    /* renamed from: Q */
    public final boolean f249Q;

    /* renamed from: W */
    public final boolean f250W;

    /* renamed from: h */
    public final String f251h;

    /* renamed from: o */
    public final boolean f252o;

    /* renamed from: u */
    public final boolean f253u;

    /* renamed from: v */
    public final long f254v;

    /* renamed from: z */
    public final String f255z;

    /* renamed from: G */
    public static final Pattern f243G = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: M */
    public static final Pattern f244M = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: V */
    public static final Pattern f246V = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: S */
    public static final Pattern f245S = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C0060BC(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f255z = str;
        this.f251h = str2;
        this.f254v = j;
        this.f248P = str3;
        this.f247N = str4;
        this.f249Q = z;
        this.f253u = z2;
        this.f252o = z3;
        this.f250W = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0060BC) {
            C0060BC c0060bc = (C0060BC) obj;
            if (AbstractC1292YB.m2695u(c0060bc.f255z, this.f255z) && AbstractC1292YB.m2695u(c0060bc.f251h, this.f251h) && c0060bc.f254v == this.f254v && AbstractC1292YB.m2695u(c0060bc.f248P, this.f248P) && AbstractC1292YB.m2695u(c0060bc.f247N, this.f247N) && c0060bc.f249Q == this.f249Q && c0060bc.f253u == this.f253u && c0060bc.f252o == this.f252o && c0060bc.f250W == this.f250W) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f251h.hashCode() + ((this.f255z.hashCode() + 527) * 31)) * 31;
        long j = this.f254v;
        return ((((((((this.f247N.hashCode() + ((this.f248P.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31) + (this.f249Q ? 1231 : 1237)) * 31) + (this.f253u ? 1231 : 1237)) * 31) + (this.f252o ? 1231 : 1237)) * 31) + (this.f250W ? 1231 : 1237);
    }

    public final String toString() {
        String format;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f255z);
        sb.append('=');
        sb.append(this.f251h);
        if (this.f252o) {
            long j = this.f254v;
            if (j == Long.MIN_VALUE) {
                format = "; max-age=0";
            } else {
                sb.append("; expires=");
                format = ((DateFormat) AbstractC0441IM.f1476z.get()).format(new Date(j));
            }
            sb.append(format);
        }
        if (!this.f250W) {
            sb.append("; domain=");
            sb.append(this.f248P);
        }
        sb.append("; path=");
        sb.append(this.f247N);
        if (this.f249Q) {
            sb.append("; secure");
        }
        if (this.f253u) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
