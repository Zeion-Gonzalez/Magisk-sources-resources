package p000a;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: a.O */
/* loaded from: classes.dex */
public final class C0747O implements InterfaceC0579Kq {

    /* renamed from: h */
    public int f2550h;

    /* renamed from: v */
    public final /* synthetic */ ActionBarContextView f2551v;

    /* renamed from: z */
    public boolean f2552z = false;

    public C0747O(ActionBarContextView actionBarContextView) {
        this.f2551v = actionBarContextView;
    }

    @Override // p000a.InterfaceC0579Kq
    /* renamed from: h */
    public final void mo1309h(View view) {
        this.f2552z = true;
    }

    @Override // p000a.InterfaceC0579Kq
    /* renamed from: v */
    public final void mo1310v() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f2552z = false;
    }

    @Override // p000a.InterfaceC0579Kq
    /* renamed from: z */
    public final void mo1311z() {
        if (this.f2552z) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2551v;
        actionBarContextView.f8722k = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f2550h);
    }
}
