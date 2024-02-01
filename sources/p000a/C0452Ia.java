package p000a;

import android.view.WindowInsets;

/* renamed from: a.Ia */
/* loaded from: classes.dex */
public class C0452Ia extends AbstractC2010lo {

    /* renamed from: S */
    public C2739zj f1522S;

    public C0452Ia(C2621xJ c2621xJ, WindowInsets windowInsets) {
        super(c2621xJ, windowInsets);
        this.f1522S = null;
    }

    @Override // p000a.C2194pK
    /* renamed from: S */
    public boolean mo1087S() {
        return this.f6251v.isConsumed();
    }

    @Override // p000a.C2194pK
    /* renamed from: h */
    public C2621xJ mo1088h() {
        return C2621xJ.m4514o(null, this.f6251v.consumeStableInsets());
    }

    @Override // p000a.C2194pK
    /* renamed from: o */
    public final C2739zj mo1089o() {
        if (this.f1522S == null) {
            WindowInsets windowInsets = this.f6251v;
            this.f1522S = C2739zj.m4673h(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1522S;
    }

    @Override // p000a.C2194pK
    /* renamed from: q */
    public void mo1090q(C2739zj c2739zj) {
        this.f1522S = c2739zj;
    }

    @Override // p000a.C2194pK
    /* renamed from: v */
    public C2621xJ mo1091v() {
        return C2621xJ.m4514o(null, this.f6251v.consumeSystemWindowInsets());
    }
}
