package p000a;

/* renamed from: a.l5 */
/* loaded from: classes.dex */
public final class C1972l5 {

    /* renamed from: z */
    public int f6114z = 0;

    /* renamed from: h */
    public int f6110h = 0;

    /* renamed from: v */
    public int f6113v = Integer.MIN_VALUE;

    /* renamed from: P */
    public int f6108P = Integer.MIN_VALUE;

    /* renamed from: N */
    public int f6107N = 0;

    /* renamed from: Q */
    public int f6109Q = 0;

    /* renamed from: u */
    public boolean f6112u = false;

    /* renamed from: o */
    public boolean f6111o = false;

    /* renamed from: z */
    public final void m3585z(int i, int i2) {
        this.f6113v = i;
        this.f6108P = i2;
        this.f6111o = true;
        if (this.f6112u) {
            if (i2 != Integer.MIN_VALUE) {
                this.f6114z = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f6110h = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f6114z = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f6110h = i2;
        }
    }
}
