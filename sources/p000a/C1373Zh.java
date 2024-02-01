package p000a;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: a.Zh */
/* loaded from: classes.dex */
public final class C1373Zh extends AbstractC0336GR implements InterfaceC1811i6 {

    /* renamed from: I */
    public final ActionBarContextView f4302I;

    /* renamed from: g */
    public boolean f4303g;

    /* renamed from: k */
    public WeakReference f4304k;

    /* renamed from: q */
    public final InterfaceC2662yD f4305q;

    /* renamed from: w */
    public final Context f4306w;

    /* renamed from: y */
    public final C2189pE f4307y;

    public C1373Zh(Context context, ActionBarContextView actionBarContextView, InterfaceC2662yD interfaceC2662yD) {
        this.f4306w = context;
        this.f4302I = actionBarContextView;
        this.f4305q = interfaceC2662yD;
        C2189pE c2189pE = new C2189pE(actionBarContextView.getContext());
        c2189pE.f6711V = 1;
        this.f4307y = c2189pE;
        c2189pE.f6705N = this;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: G */
    public final boolean mo732G() {
        return this.f4302I.f8709C;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: I */
    public final void mo733I(boolean z) {
        this.f1137R = z;
        ActionBarContextView actionBarContextView = this.f4302I;
        if (z != actionBarContextView.f8709C) {
            actionBarContextView.requestLayout();
        }
        actionBarContextView.f8709C = z;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: M */
    public final void mo734M(View view) {
        this.f4302I.m4703M(view);
        this.f4304k = view != null ? new WeakReference(view) : null;
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: N */
    public final boolean mo81N(C2189pE c2189pE, MenuItem menuItem) {
        return this.f4305q.mo1238v(this, menuItem);
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: P */
    public final MenuInflater mo735P() {
        return new C0290FV(this.f4302I.getContext());
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: Q */
    public final CharSequence mo736Q() {
        return this.f4302I.f8717U;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: R */
    public final void mo737R(int i) {
        mo744w(this.f4306w.getString(i));
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: S */
    public final void mo738S(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f4302I;
        actionBarContextView.f8717U = charSequence;
        actionBarContextView.m4705P();
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: V */
    public final void mo739V(int i) {
        mo738S(this.f4306w.getString(i));
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: W */
    public final void mo82W(C2189pE c2189pE) {
        mo741o();
        C2192pI c2192pI = this.f4302I.f8713I;
        if (c2192pI != null) {
            c2192pI.m3809w();
        }
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: h */
    public final View mo740h() {
        WeakReference weakReference = this.f4304k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: o */
    public final void mo741o() {
        this.f4305q.mo1241z(this, this.f4307y);
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: u */
    public final CharSequence mo742u() {
        return this.f4302I.f8726s;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: v */
    public final C2189pE mo743v() {
        return this.f4307y;
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: w */
    public final void mo744w(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f4302I;
        actionBarContextView.f8726s = charSequence;
        actionBarContextView.m4705P();
        AbstractC2446u3.m4220S(actionBarContextView, charSequence);
    }

    @Override // p000a.AbstractC0336GR
    /* renamed from: z */
    public final void mo745z() {
        if (this.f4303g) {
            return;
        }
        this.f4303g = true;
        this.f4305q.mo1232h(this);
    }
}
