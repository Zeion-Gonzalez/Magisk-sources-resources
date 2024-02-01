package p000a;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: a.Kt */
/* loaded from: classes.dex */
public final class C0581Kt extends ActionMode {

    /* renamed from: h */
    public final AbstractC0336GR f1885h;

    /* renamed from: z */
    public final Context f1886z;

    public C0581Kt(Context context, AbstractC0336GR abstractC0336GR) {
        this.f1886z = context;
        this.f1885h = abstractC0336GR;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f1885h.mo745z();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f1885h.mo740h();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1552dD(this.f1886z, this.f1885h.mo743v());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f1885h.mo735P();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f1885h.mo736Q();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f1885h.f1138S;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f1885h.mo742u();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f1885h.f1137R;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f1885h.mo741o();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f1885h.mo732G();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f1885h.mo734M(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f1885h.mo739V(i);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f1885h.f1138S = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f1885h.mo737R(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f1885h.mo733I(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f1885h.mo738S(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f1885h.mo744w(charSequence);
    }
}
