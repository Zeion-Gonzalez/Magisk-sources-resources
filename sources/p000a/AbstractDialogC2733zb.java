package p000a;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.zb */
/* loaded from: classes.dex */
public abstract class AbstractDialogC2733zb extends DialogC2096nV implements InterfaceC1032TM {

    /* renamed from: I */
    public LayoutInflaterFactory2C1392a6 f8578I;

    /* renamed from: q */
    public final C2225px f8579q;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.px] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractDialogC2733zb(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968972(0x7f04018c, float:1.7546613E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            a.px r2 = new a.px
            r2.<init>()
            r4.f8579q = r2
            a.oy r2 = r4.m4660u()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            a.a6 r5 = (p000a.LayoutInflaterFactory2C1392a6) r5
            r5.f4357UZ = r6
            r2.mo2810u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractDialogC2733zb.<init>(android.content.Context, int):void");
    }

    @Override // p000a.InterfaceC1032TM
    /* renamed from: N */
    public final void mo1199N() {
    }

    @Override // p000a.InterfaceC1032TM
    /* renamed from: Q */
    public final void mo1200Q() {
    }

    @Override // p000a.DialogC2096nV, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4660u().mo2814z(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m4660u().mo2805o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC2575wW.m4457y(this.f8579q, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) m4660u();
        layoutInflaterFactory2C1392a6.m2808r();
        return layoutInflaterFactory2C1392a6.f4368f.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m4660u().mo2791P();
    }

    /* renamed from: o */
    public final boolean m4659o(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p000a.DialogC2096nV, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m4660u().mo2811v();
        super.onCreate(bundle);
        m4660u().mo2810u();
    }

    @Override // p000a.DialogC2096nV, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) m4660u();
        layoutInflaterFactory2C1392a6.m2795X();
        AbstractC1500cH abstractC1500cH = layoutInflaterFactory2C1392a6.f4348J;
        if (abstractC1500cH != null) {
            abstractC1500cH.mo2909Y(false);
        }
    }

    @Override // p000a.DialogC2096nV, android.app.Dialog
    public void setContentView(int i) {
        m4660u().mo2794V(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m4660u().mo2812w(getContext().getString(i));
    }

    /* renamed from: u */
    public final AbstractC2173oy m4660u() {
        if (this.f8578I == null) {
            ExecutorC0571Ki executorC0571Ki = AbstractC2173oy.f6660S;
            this.f8578I = new LayoutInflaterFactory2C1392a6(getContext(), getWindow(), this, this);
        }
        return this.f8578I;
    }

    @Override // p000a.InterfaceC1032TM
    /* renamed from: v */
    public final void mo1202v() {
    }

    @Override // p000a.DialogC2096nV, android.app.Dialog
    public void setContentView(View view) {
        m4660u().mo2793S(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m4660u().mo2812w(charSequence);
    }

    @Override // p000a.DialogC2096nV, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4660u().mo2792R(view, layoutParams);
    }
}
