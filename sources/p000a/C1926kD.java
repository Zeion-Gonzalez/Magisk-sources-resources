package p000a;

import android.graphics.Typeface;

/* renamed from: a.kD */
/* loaded from: classes.dex */
public final class C1926kD extends AbstractC2703z2 {

    /* renamed from: I */
    public boolean f5989I;

    /* renamed from: R */
    public final Typeface f5990R;

    /* renamed from: w */
    public final C2196pM f5991w;

    public C1926kD(C2196pM c2196pM, Typeface typeface) {
        super(5);
        this.f5990R = typeface;
        this.f5991w = c2196pM;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: G5 */
    public final void mo91G5(Typeface typeface, boolean z) {
        if (!this.f5989I) {
            C0001A1 c0001a1 = (C0001A1) this.f5991w.f6755R;
            if (c0001a1.m3G(typeface)) {
                c0001a1.m10o(false);
            }
        }
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Pm */
    public final void mo92Pm(int i) {
        if (!this.f5989I) {
            C0001A1 c0001a1 = (C0001A1) this.f5991w.f6755R;
            if (c0001a1.m3G(this.f5990R)) {
                c0001a1.m10o(false);
            }
        }
    }
}
