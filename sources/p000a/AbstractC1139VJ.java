package p000a;

import java.util.ArrayList;

/* renamed from: a.VJ */
/* loaded from: classes.dex */
public abstract class AbstractC1139VJ extends C1628ed {

    /* renamed from: Pm */
    public ArrayList f3714Pm = new ArrayList();

    @Override // p000a.C1628ed
    /* renamed from: H */
    public final void mo2335H(C0525Ju c0525Ju) {
        super.mo2335H(c0525Ju);
        int size = this.f3714Pm.size();
        for (int i = 0; i < size; i++) {
            ((C1628ed) this.f3714Pm.get(i)).mo2335H(c0525Ju);
        }
    }

    @Override // p000a.C1628ed
    /* renamed from: Y */
    public void mo2336Y() {
        this.f3714Pm.clear();
        super.mo2336Y();
    }

    /* renamed from: i */
    public abstract void mo2337i();
}
