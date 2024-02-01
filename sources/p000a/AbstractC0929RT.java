package p000a;

import android.os.Bundle;

/* renamed from: a.RT */
/* loaded from: classes.dex */
public abstract class AbstractC0929RT {

    /* renamed from: G */
    public static final C0930RU f3184G;

    /* renamed from: N */
    public static final C0930RU f3186N;

    /* renamed from: W */
    public static final C0930RU f3190W;

    /* renamed from: h */
    public static final C0930RU f3191h;

    /* renamed from: u */
    public static final C0930RU f3193u;

    /* renamed from: v */
    public static final C0930RU f3194v;

    /* renamed from: z */
    public final boolean f3195z;

    /* renamed from: P */
    public static final C0930RU f3187P = new C0930RU(4);

    /* renamed from: Q */
    public static final C0930RU f3188Q = new C0930RU(6);

    /* renamed from: o */
    public static final C0930RU f3192o = new C0930RU(2);

    /* renamed from: M */
    public static final C0930RU f3185M = new C0930RU(10);

    /* renamed from: V */
    public static final C0930RU f3189V = new C0930RU(9);

    static {
        int i = 0;
        f3191h = new C0930RU(5, i);
        f3194v = new C0930RU(8, i);
        f3186N = new C0930RU(7, i);
        f3193u = new C0930RU(3, i);
        f3190W = new C0930RU(1, i);
        f3184G = new C0930RU(i);
    }

    public AbstractC0929RT(boolean z) {
        this.f3195z = z;
    }

    /* renamed from: N */
    public abstract void mo1953N(Bundle bundle, String str, Object obj);

    /* renamed from: P */
    public Object mo2083P(String str, Object obj) {
        return mo1955v(str);
    }

    /* renamed from: h */
    public abstract String mo1954h();

    public final String toString() {
        return mo1954h();
    }

    /* renamed from: v */
    public abstract Object mo1955v(String str);

    /* renamed from: z */
    public abstract Object mo1956z(String str, Bundle bundle);
}
