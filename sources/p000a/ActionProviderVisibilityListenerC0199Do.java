package p000a;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: a.Do */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0199Do extends AbstractC0219EA implements ActionProvider.VisibilityListener {

    /* renamed from: v */
    public C2196pM f603v;

    @Override // p000a.AbstractC0219EA
    /* renamed from: P */
    public final void mo386P(C2196pM c2196pM) {
        this.f603v = c2196pM;
        this.f692z.setVisibilityListener(this);
    }

    @Override // p000a.AbstractC0219EA
    /* renamed from: h */
    public final View mo387h(MenuItem menuItem) {
        return this.f692z.onCreateActionView(menuItem);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C2196pM c2196pM = this.f603v;
        if (c2196pM != null) {
            C2189pE c2189pE = ((C1117Uu) c2196pM.f6755R).f3634R;
            c2189pE.f6717o = true;
            c2189pE.m3793I(true);
        }
    }

    @Override // p000a.AbstractC0219EA
    /* renamed from: v */
    public final boolean mo388v() {
        return this.f692z.overridesItemVisibility();
    }

    @Override // p000a.AbstractC0219EA
    /* renamed from: z */
    public final boolean mo389z() {
        return this.f692z.isVisible();
    }
}
