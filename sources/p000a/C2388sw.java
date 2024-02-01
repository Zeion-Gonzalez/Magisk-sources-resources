package p000a;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* renamed from: a.sw */
/* loaded from: classes.dex */
public final class C2388sw implements InterfaceC0416Hs {

    /* renamed from: R */
    public final /* synthetic */ ExtendedFloatingActionButton f7322R;

    /* renamed from: S */
    public final /* synthetic */ int f7323S;

    public /* synthetic */ C2388sw(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        this.f7323S = i;
        this.f7322R = extendedFloatingActionButton;
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: G */
    public final ViewGroup.LayoutParams mo931G() {
        switch (this.f7323S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new ViewGroup.LayoutParams(mo932N(), mo933Q());
            default:
                return new ViewGroup.LayoutParams(-2, -2);
        }
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: N */
    public final int mo932N() {
        int i = this.f7323S;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f7322R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return extendedFloatingActionButton.m5054V();
            default:
                return (extendedFloatingActionButton.getMeasuredWidth() - (((extendedFloatingActionButton.m5054V() - extendedFloatingActionButton.f9284E) / 2) * 2)) + extendedFloatingActionButton.f9357n + extendedFloatingActionButton.f9360x;
        }
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: Q */
    public final int mo933Q() {
        int i = this.f7323S;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f7322R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return extendedFloatingActionButton.m5054V();
            default:
                return extendedFloatingActionButton.getMeasuredHeight();
        }
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: W */
    public final int mo934W() {
        int i = this.f7323S;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f7322R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (extendedFloatingActionButton.m5054V() - extendedFloatingActionButton.f9284E) / 2;
            default:
                return extendedFloatingActionButton.f9357n;
        }
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: u */
    public final int mo935u() {
        int i = this.f7323S;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f7322R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (extendedFloatingActionButton.m5054V() - extendedFloatingActionButton.f9284E) / 2;
            default:
                return extendedFloatingActionButton.f9360x;
        }
    }
}
