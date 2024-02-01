package p000a;

import android.view.View;

/* renamed from: a.Ms */
/* loaded from: classes.dex */
public final class C0681Ms extends AbstractViewOnTouchListenerC0233ER {

    /* renamed from: E */
    public final /* synthetic */ Object f2242E;

    /* renamed from: U */
    public final /* synthetic */ int f2243U;

    /* renamed from: f */
    public final /* synthetic */ View f2244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0681Ms(View view, View view2, Object obj, int i) {
        super(view2);
        this.f2243U = i;
        this.f2244f = view;
        this.f2242E = obj;
    }

    @Override // p000a.AbstractViewOnTouchListenerC0233ER
    /* renamed from: P */
    public final boolean mo469P() {
        switch (this.f2243U) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2192pI c2192pI = ((C2206pY) this.f2244f).f6779I;
                if (c2192pI.f6729F != null) {
                    return false;
                }
                c2192pI.m3807Q();
                return true;
            default:
                super.mo469P();
                return true;
        }
    }

    @Override // p000a.AbstractViewOnTouchListenerC0233ER
    /* renamed from: h */
    public final InterfaceC2298rH mo470h() {
        switch (this.f2243U) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0278FI c0278fi = ((C2206pY) this.f2244f).f6779I.f6740e;
                if (c0278fi == null) {
                    return null;
                }
                return c0278fi.m1774z();
            default:
                return (C2178p2) this.f2242E;
        }
    }

    @Override // p000a.AbstractViewOnTouchListenerC0233ER
    /* renamed from: v */
    public final boolean mo471v() {
        int i = this.f2243U;
        View view = this.f2244f;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C2206pY) view).f6779I.m3809w();
                return true;
            default:
                C2184p9 c2184p9 = (C2184p9) view;
                if (!c2184p9.f6688k.mo2210h()) {
                    c2184p9.f6688k.mo2205N(AbstractC1263Xf.m2564h(c2184p9), AbstractC1263Xf.m2566z(c2184p9));
                }
                return true;
        }
    }
}
