package p000a;

import java.util.concurrent.TimeUnit;

/* renamed from: a.gz */
/* loaded from: classes.dex */
public final class C1755gz {

    /* renamed from: R */
    public static final /* synthetic */ int f5531R = 0;

    /* renamed from: G */
    public final boolean f5532G;

    /* renamed from: M */
    public final boolean f5533M;

    /* renamed from: N */
    public final boolean f5534N;

    /* renamed from: P */
    public final int f5535P;

    /* renamed from: Q */
    public final boolean f5536Q;

    /* renamed from: S */
    public String f5537S;

    /* renamed from: V */
    public final boolean f5538V;

    /* renamed from: W */
    public final int f5539W;

    /* renamed from: h */
    public final boolean f5540h;

    /* renamed from: o */
    public final int f5541o;

    /* renamed from: u */
    public final boolean f5542u;

    /* renamed from: v */
    public final int f5543v;

    /* renamed from: z */
    public final boolean f5544z;

    static {
        TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
    }

    public C1755gz(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f5544z = z;
        this.f5540h = z2;
        this.f5543v = i;
        this.f5535P = i2;
        this.f5534N = z3;
        this.f5536Q = z4;
        this.f5542u = z5;
        this.f5541o = i3;
        this.f5539W = i4;
        this.f5532G = z6;
        this.f5533M = z7;
        this.f5538V = z8;
        this.f5537S = str;
    }

    public final String toString() {
        String str = this.f5537S;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5544z) {
            sb.append("no-cache, ");
        }
        if (this.f5540h) {
            sb.append("no-store, ");
        }
        int i = this.f5543v;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f5535P;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f5534N) {
            sb.append("private, ");
        }
        if (this.f5536Q) {
            sb.append("public, ");
        }
        if (this.f5542u) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f5541o;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f5539W;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f5532G) {
            sb.append("only-if-cached, ");
        }
        if (this.f5533M) {
            sb.append("no-transform, ");
        }
        if (this.f5538V) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        this.f5537S = sb2;
        return sb2;
    }
}
