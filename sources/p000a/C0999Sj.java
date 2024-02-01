package p000a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.topjohnwu.magisk.R;

/* renamed from: a.Sj */
/* loaded from: classes.dex */
public final class C0999Sj extends AbstractC2262qa {

    /* renamed from: P */
    public final /* synthetic */ C1142VM f3354P;

    /* renamed from: h */
    public final /* synthetic */ View f3355h;

    /* renamed from: v */
    public final /* synthetic */ View f3356v;

    /* renamed from: z */
    public final /* synthetic */ ViewGroup f3357z;

    public C0999Sj(C1142VM c1142vm, ViewGroup viewGroup, View view, View view2) {
        this.f3354P = c1142vm;
        this.f3357z = viewGroup;
        this.f3355h = view;
        this.f3356v = view2;
    }

    @Override // p000a.AbstractC2262qa, p000a.InterfaceC2728zV
    /* renamed from: N */
    public final void mo1083N() {
        View view = this.f3355h;
        if (view.getParent() == null) {
            ((ViewGroupOverlay) new C2196pM(this.f3357z).f6755R).add(view);
        } else {
            this.f3354P.cancel();
        }
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: P */
    public final void mo231P(AbstractC0614LY abstractC0614LY) {
        this.f3356v.setTag(R.id.save_overlay_view, null);
        ((ViewGroupOverlay) new C2196pM(this.f3357z).f6755R).remove(this.f3355h);
        abstractC0614LY.mo1364J(this);
    }

    @Override // p000a.AbstractC2262qa, p000a.InterfaceC2728zV
    /* renamed from: v */
    public final void mo1085v() {
        ((ViewGroupOverlay) new C2196pM(this.f3357z).f6755R).remove(this.f3355h);
    }
}
