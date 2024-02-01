package p000a;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.lang.ref.WeakReference;

/* renamed from: a.Sg */
/* loaded from: classes.dex */
public final class C0996Sg extends AbstractC0336GR implements InterfaceC1811i6 {

    /* renamed from: I */
    public final C2189pE f3342I;

    /* renamed from: g */
    public final /* synthetic */ C2285r2 f3343g;

    /* renamed from: k */
    public WeakReference f3344k;

    /* renamed from: q */
    public InterfaceC2662yD f3345q;

    /* renamed from: w */
    public final Context f3346w;

    public C0996Sg(C2285r2 c2285r2, Context context, C1394a8 c1394a8) {
        this.f3343g = c2285r2;
        this.f3346w = context;
        this.f3345q = c1394a8;
        C2189pE c2189pE = new C2189pE(context);
        c2189pE.f6711V = 1;
        this.f3342I = c2189pE;
        c2189pE.f6705N = this;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: G */
    public final boolean mo732G() {
        return this.f3343g.f7063u.f8709C;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: I */
    public final void mo733I(boolean z) {
        this.f1137R = z;
        ActionBarContextView actionBarContextView = this.f3343g.f7063u;
        if (z != actionBarContextView.f8709C) {
            actionBarContextView.requestLayout();
        }
        actionBarContextView.f8709C = z;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: M */
    public final void mo734M(View view) {
        this.f3343g.f7063u.m4703M(view);
        this.f3344k = new WeakReference(view);
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: N */
    public final boolean mo81N(C2189pE c2189pE, MenuItem menuItem) {
        InterfaceC2662yD interfaceC2662yD = this.f3345q;
        if (interfaceC2662yD != null) {
            return interfaceC2662yD.mo1238v(this, menuItem);
        }
        return false;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: P */
    public final MenuInflater mo735P() {
        return new C0290FV(this.f3346w);
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: Q */
    public final CharSequence mo736Q() {
        return this.f3343g.f7063u.f8717U;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: R */
    public final void mo737R(int i) {
        mo744w(this.f3343g.f7057h.getResources().getString(i));
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: S */
    public final void mo738S(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f3343g.f7063u;
        actionBarContextView.f8717U = charSequence;
        actionBarContextView.m4705P();
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: V */
    public final void mo739V(int i) {
        mo738S(this.f3343g.f7057h.getResources().getString(i));
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: W */
    public final void mo82W(C2189pE c2189pE) {
        if (this.f3345q == null) {
            return;
        }
        mo741o();
        C2192pI c2192pI = this.f3343g.f7063u.f8713I;
        if (c2192pI != null) {
            c2192pI.m3809w();
        }
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: h */
    public final View mo740h() {
        WeakReference weakReference = this.f3344k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: o */
    public final void mo741o() {
        if (this.f3343g.f7044G != this) {
            return;
        }
        C2189pE c2189pE = this.f3342I;
        c2189pE.m3792E();
        try {
            this.f3345q.mo1241z(this, c2189pE);
        } finally {
            c2189pE.m3794U();
        }
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: u */
    public final CharSequence mo742u() {
        return this.f3343g.f7063u.f8726s;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: v */
    public final C2189pE mo743v() {
        return this.f3342I;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: w */
    public final void mo744w(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f3343g.f7063u;
        actionBarContextView.f8726s = charSequence;
        actionBarContextView.m4705P();
        AbstractC2446u3.m4220S(actionBarContextView, charSequence);
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: z */
    public final void mo745z() {
        C2285r2 c2285r2 = this.f3343g;
        if (c2285r2.f7044G != this) {
            return;
        }
        if ((!c2285r2.f7060q) == false) {
            c2285r2.f7046M = this;
            c2285r2.f7053V = this.f3345q;
        } else {
            this.f3345q.mo1232h(this);
        }
        this.f3345q = null;
        c2285r2.m3944Z(false);
        ActionBarContextView actionBarContextView = c2285r2.f7063u;
        if (actionBarContextView.f8710E == null) {
            actionBarContextView.m4704N();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = c2285r2.f7048P;
        boolean z = c2285r2.f7052U;
        if (z != actionBarOverlayLayout.f8740U) {
            actionBarOverlayLayout.f8740U = z;
            if (!z) {
                actionBarOverlayLayout.m4717o();
                actionBarOverlayLayout.m4717o();
                actionBarOverlayLayout.f8734I.setTranslationY(-Math.max(0, Math.min(0, actionBarOverlayLayout.f8734I.getHeight())));
            }
        }
        c2285r2.f7044G = null;
    }
}
