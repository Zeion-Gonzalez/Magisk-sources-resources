package p000a;

import android.view.WindowInsets;

/* renamed from: a.Vl */
/* loaded from: classes.dex */
public class C1162Vl extends AbstractC1522cj {

    /* renamed from: v */
    public final WindowInsets.Builder f3786v;

    public C1162Vl() {
        this.f3786v = AbstractC0957Ry.m2137o();
    }

    @Override // p000a.AbstractC1522cj
    /* renamed from: N */
    public void mo2375N(C2739zj c2739zj) {
        this.f3786v.setStableInsets(c2739zj.m4676P());
    }

    @Override // p000a.AbstractC1522cj
    /* renamed from: P */
    public void mo2376P(C2739zj c2739zj) {
        this.f3786v.setMandatorySystemGestureInsets(c2739zj.m4676P());
    }

    @Override // p000a.AbstractC1522cj
    /* renamed from: Q */
    public void mo2377Q(C2739zj c2739zj) {
        this.f3786v.setSystemGestureInsets(c2739zj.m4676P());
    }

    @Override // p000a.AbstractC1522cj
    /* renamed from: h */
    public C2621xJ mo2378h() {
        WindowInsets build;
        m2946z();
        build = this.f3786v.build();
        C2621xJ m4514o = C2621xJ.m4514o(null, build);
        m4514o.f8107z.mo3650w(this.f4700h);
        return m4514o;
    }

    @Override // p000a.AbstractC1522cj
    /* renamed from: o */
    public void mo2379o(C2739zj c2739zj) {
        this.f3786v.setTappableElementInsets(c2739zj.m4676P());
    }

    @Override // p000a.AbstractC1522cj
    /* renamed from: u */
    public void mo2380u(C2739zj c2739zj) {
        this.f3786v.setSystemWindowInsets(c2739zj.m4676P());
    }

    public C1162Vl(C2621xJ c2621xJ) {
        super(c2621xJ);
        WindowInsets m4518u = c2621xJ.m4518u();
        this.f3786v = m4518u != null ? AbstractC2346s7.m4035v(m4518u) : AbstractC0957Ry.m2137o();
    }
}
