package p000a;

import android.util.Log;
import android.view.View;

/* renamed from: a.vE */
/* loaded from: classes.dex */
public final class C2509vE implements InterfaceC0217E7 {

    /* renamed from: S */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0137Ce f7685S;

    public C2509vE(DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce) {
        this.f7685S = dialogInterfaceOnCancelListenerC0137Ce;
    }

    @Override // p000a.InterfaceC0217E7
    /* renamed from: z */
    public final void mo421z(Object obj) {
        if (((InterfaceC1546d7) obj) != null) {
            DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce = this.f7685S;
            if (dialogInterfaceOnCancelListenerC0137Ce.f465Lq) {
                View m4013n = dialogInterfaceOnCancelListenerC0137Ce.m4013n();
                if (m4013n.getParent() == null) {
                    if (dialogInterfaceOnCancelListenerC0137Ce.f463G5 != null) {
                        if (C0364Gx.m791p(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0137Ce.f463G5);
                        }
                        dialogInterfaceOnCancelListenerC0137Ce.f463G5.setContentView(m4013n);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
