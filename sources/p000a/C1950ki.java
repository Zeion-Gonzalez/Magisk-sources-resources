package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.ki */
/* loaded from: classes.dex */
public final class C1950ki extends AbstractC0769OL implements InterfaceC0645M7, InterfaceC1631eg {

    /* renamed from: R */
    public final int f6041R;

    /* renamed from: S */
    public final CharSequence f6042S;

    public C1950ki(int i, CharSequence charSequence) {
        this.f6042S = charSequence;
        this.f6041R = i;
    }

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public final int mo553G() {
        return R.layout.item_list_single_line;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: N */
    public final boolean mo555N(InterfaceC0645M7 interfaceC0645M7) {
        return AbstractC0795Op.m1875x(this, (C1950ki) interfaceC0645M7);
    }

    @Override // p000a.InterfaceC1631eg
    public final Object getItem() {
        return this.f6042S;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo556h(InterfaceC0645M7 interfaceC0645M7) {
        C1950ki c1950ki = (C1950ki) interfaceC0645M7;
        return true;
    }
}
