package p000a;

import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: a.qT */
/* loaded from: classes.dex */
public final class C2255qT extends AbstractViewOnTouchListenerC0233ER {

    /* renamed from: U */
    public final /* synthetic */ ActionMenuItemView f6944U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2255qT(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f6944U = actionMenuItemView;
    }

    @Override // p000a.AbstractViewOnTouchListenerC0233ER
    /* renamed from: h */
    public final InterfaceC2298rH mo470h() {
        C0278FI c0278fi;
        C1073U7 c1073u7 = this.f6944U.f8676f;
        if (c1073u7 == null || (c0278fi = c1073u7.f3540S.f6736X) == null) {
            return null;
        }
        return c0278fi.m1774z();
    }

    @Override // p000a.AbstractViewOnTouchListenerC0233ER
    /* renamed from: v */
    public final boolean mo471v() {
        InterfaceC2298rH mo470h;
        ActionMenuItemView actionMenuItemView = this.f6944U;
        InterfaceC0949Rq interfaceC0949Rq = actionMenuItemView.f8674U;
        return interfaceC0949Rq != null && interfaceC0949Rq.mo2112Q(actionMenuItemView.f8677g) && (mo470h = mo470h()) != null && mo470h.mo399h();
    }
}
