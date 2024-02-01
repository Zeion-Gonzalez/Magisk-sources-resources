package p000a;

import android.os.Bundle;
import android.text.Spanned;
import android.text.SpannedString;

/* renamed from: a.f1 */
/* loaded from: classes.dex */
public final class C1650f1 extends AbstractC2615xD {

    /* renamed from: E */
    public static final C1112Up f5113E = new C1112Up();

    /* renamed from: U */
    public Spanned f5114U;

    /* renamed from: g */
    public final boolean f5115g;

    /* renamed from: k */
    public final boolean f5116k;

    /* renamed from: s */
    public int f5117s;

    /* renamed from: y */
    public int f5118y;

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public C1650f1(C2640xk c2640xk, C2594ws c2594ws) {
        ?? r3;
        boolean z = C1910jw.f5966w;
        if (!z && (!C1910jw.f5957Q || AbstractC1292YB.m2695u(C1910jw.f5960V, "block") || !C1910jw.f5952G)) {
            r3 = 0;
        } else {
            r3 = 1;
        }
        this.f5116k = r3;
        this.f5115g = (C1910jw.f5958R && C1910jw.f5963o && !z) ? false : true;
        this.f5118y = r3;
        this.f5117s = -1;
        this.f5114U = new SpannedString("");
        AbstractC0438II.m994F(AbstractC2575wW.m4424d(this), AbstractC0037Al.f178h, new C2123o3(c2640xk, c2594ws, this, null), 2);
    }

    @Override // p000a.AbstractC2615xD
    /* renamed from: M */
    public final void mo3122M(Bundle bundle) {
        C0962S2 c0962s2 = (C0962S2) bundle.getParcelable("install_state");
        if (c0962s2 != null) {
            this.f5117s = c0962s2.f3271S;
            int i = this.f5118y;
            int i2 = c0962s2.f3270R;
            if (i != i2) {
                this.f5118y = i2;
                mo1709Q(38);
            }
            C1212We c1212We = C1212We.f3969z;
            C1212We.f3946N = c0962s2.f3273w;
            C1212We.f3948Q = c0962s2.f3269I;
            C1212We.f3965u = c0962s2.f3272q;
        }
    }

    @Override // p000a.AbstractC2615xD
    /* renamed from: V */
    public final void mo3123V(Bundle bundle) {
        bundle.putParcelable("install_state", new C0962S2(this.f5117s, this.f5118y, C1212We.f3946N, C1212We.f3948Q, C1212We.f3965u));
    }
}
