package p000a;

import android.view.View;

/* renamed from: a.Ue */
/* loaded from: classes.dex */
public final class C1101Ue implements InterfaceC0910R9 {

    /* renamed from: R */
    public final /* synthetic */ View f3587R;

    /* renamed from: S */
    public final /* synthetic */ int f3588S;

    /* renamed from: w */
    public final /* synthetic */ int f3589w;

    public C1101Ue(int i, View view, int i2) {
        this.f3588S = i;
        this.f3587R = view;
        this.f3589w = i2;
    }

    @Override // p000a.InterfaceC0910R9
    /* renamed from: P */
    public final C2621xJ mo47P(View view, C2621xJ c2621xJ) {
        int i = c2621xJ.m4520z(7).f8592h;
        View view2 = this.f3587R;
        int i2 = this.f3588S;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f3589w + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c2621xJ;
    }
}
