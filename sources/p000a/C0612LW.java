package p000a;

import android.os.Handler;

/* renamed from: a.LW */
/* loaded from: classes.dex */
public final class C0612LW implements InterfaceC1546d7 {

    /* renamed from: s */
    public static final C0612LW f1981s = new C0612LW();

    /* renamed from: R */
    public int f1983R;

    /* renamed from: S */
    public int f1984S;

    /* renamed from: q */
    public Handler f1987q;

    /* renamed from: w */
    public boolean f1988w = true;

    /* renamed from: I */
    public boolean f1982I = true;

    /* renamed from: k */
    public final C0326GG f1986k = new C0326GG(this);

    /* renamed from: g */
    public final RunnableC0308Fs f1985g = new RunnableC0308Fs(8, this);

    /* renamed from: y */
    public final C0110C8 f1989y = new C0110C8(this);

    @Override // p000a.InterfaceC1546d7
    /* renamed from: C */
    public final C0326GG mo1354C() {
        return this.f1986k;
    }

    /* renamed from: z */
    public final void m1355z() {
        int i = this.f1983R + 1;
        this.f1983R = i;
        if (i == 1) {
            if (!this.f1988w) {
                this.f1987q.removeCallbacks(this.f1985g);
            } else {
                this.f1986k.m721N(EnumC2241qF.ON_RESUME);
                this.f1988w = false;
            }
        }
    }
}
