package p000a;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: a.sW */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC2366sW implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0656MP {

    /* renamed from: R */
    public DialogInterfaceC0723Nb f7267R;

    /* renamed from: S */
    public final C2189pE f7268S;

    /* renamed from: w */
    public C0104C2 f7269w;

    public DialogInterfaceOnKeyListenerC2366sW(C2189pE c2189pE) {
        this.f7268S = c2189pE;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0104C2 c0104c2 = this.f7269w;
        if (c0104c2.f392k == null) {
            c0104c2.f392k = new C1533cv(c0104c2);
        }
        this.f7268S.m3801q(c0104c2.f392k.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f7269w.mo227z(this.f7268S, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C2189pE c2189pE = this.f7268S;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f7267R.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f7267R.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c2189pE.m3804v(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c2189pE.performShortcut(i, keyEvent, 0);
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: v */
    public final boolean mo1242v(C2189pE c2189pE) {
        return false;
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: z */
    public final void mo1243z(C2189pE c2189pE, boolean z) {
        DialogInterfaceC0723Nb dialogInterfaceC0723Nb;
        if ((z || c2189pE == this.f7268S) && (dialogInterfaceC0723Nb = this.f7267R) != null) {
            dialogInterfaceC0723Nb.dismiss();
        }
    }
}
