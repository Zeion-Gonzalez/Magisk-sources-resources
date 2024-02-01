package p000a;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: a.LA */
/* loaded from: classes.dex */
public final class C0596LA extends FrameLayout implements InterfaceC1748gs {

    /* renamed from: S */
    public final CollapsibleActionView f1919S;

    public C0596LA(View view) {
        super(view.getContext());
        this.f1919S = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p000a.InterfaceC1748gs
    /* renamed from: P */
    public final void mo1323P() {
        this.f1919S.onActionViewCollapsed();
    }

    @Override // p000a.InterfaceC1748gs
    /* renamed from: h */
    public final void mo1324h() {
        this.f1919S.onActionViewExpanded();
    }
}
