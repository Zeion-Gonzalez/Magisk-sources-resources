package p000a;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: a.k4 */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC1918k4 implements DialogInterface.OnCancelListener {

    /* renamed from: S */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0137Ce f5978S;

    public DialogInterfaceOnCancelListenerC1918k4(DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce) {
        this.f5978S = dialogInterfaceOnCancelListenerC0137Ce;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce = this.f5978S;
        Dialog dialog = dialogInterfaceOnCancelListenerC0137Ce.f463G5;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0137Ce.onCancel(dialog);
        }
    }
}
