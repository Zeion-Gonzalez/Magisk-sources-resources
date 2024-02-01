package p000a;

import java.io.OutputStream;

/* renamed from: a.Ob */
/* loaded from: classes.dex */
public class C0784Ob extends C0175DP {
    public C0784Ob(OutputStream outputStream) {
        super(5, outputStream);
    }

    @Override // p000a.C0175DP
    /* renamed from: G */
    public void mo335G(InterfaceC0959S[] interfaceC0959SArr) {
        for (InterfaceC0959S interfaceC0959S : interfaceC0959SArr) {
            interfaceC0959S.mo302N().mo148g().mo144S(this, true);
        }
    }

    /* renamed from: I */
    public void mo516I(AbstractC1593e abstractC1593e) {
        abstractC1593e.mo148g().mo144S(this, true);
    }

    @Override // p000a.C0175DP
    /* renamed from: v */
    public final C0784Ob mo344v() {
        return this;
    }

    @Override // p000a.C0175DP
    /* renamed from: w */
    public void mo345w(AbstractC1593e[] abstractC1593eArr) {
        for (AbstractC1593e abstractC1593e : abstractC1593eArr) {
            abstractC1593e.mo148g().mo144S(this, true);
        }
    }
}
