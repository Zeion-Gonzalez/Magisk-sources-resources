package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.ir */
/* loaded from: classes.dex */
public final class C1851ir extends AbstractC0769OL implements InterfaceC0645M7, InterfaceC1631eg {

    /* renamed from: S */
    public final int f5776S;

    public C1851ir(int i) {
        this.f5776S = i;
    }

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public final int mo553G() {
        return R.layout.item_text;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: N */
    public final boolean mo555N(InterfaceC0645M7 interfaceC0645M7) {
        return AbstractC0795Op.m1875x(this, (C1851ir) interfaceC0645M7);
    }

    @Override // p000a.InterfaceC1631eg
    public final Object getItem() {
        return Integer.valueOf(this.f5776S);
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo556h(InterfaceC0645M7 interfaceC0645M7) {
        C1851ir c1851ir = (C1851ir) interfaceC0645M7;
        return true;
    }
}
