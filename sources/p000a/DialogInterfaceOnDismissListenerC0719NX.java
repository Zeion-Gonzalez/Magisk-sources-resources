package p000a;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: a.NX */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0719NX implements DialogInterface.OnDismissListener {

    /* renamed from: S */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0137Ce f2417S;

    public DialogInterfaceOnDismissListenerC0719NX(DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce) {
        this.f2417S = dialogInterfaceOnCancelListenerC0137Ce;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce = this.f2417S;
        Dialog dialog = dialogInterfaceOnCancelListenerC0137Ce.f463G5;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0137Ce.onDismiss(dialog);
        }
    }
}
