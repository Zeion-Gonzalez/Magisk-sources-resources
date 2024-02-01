package p000a;

/* renamed from: a.kG */
/* loaded from: classes.dex */
public final class RunnableC1927kG implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ Object f5992R;

    /* renamed from: S */
    public final /* synthetic */ int f5993S;

    public /* synthetic */ RunnableC1927kG(int i, Object obj) {
        this.f5993S = i;
        this.f5992R = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5993S;
        Object obj = this.f5992R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce = (DialogInterfaceOnCancelListenerC0137Ce) obj;
                dialogInterfaceOnCancelListenerC0137Ce.f460BO.onDismiss(dialogInterfaceOnCancelListenerC0137Ce.f463G5);
                return;
            default:
                ((C0364Gx) obj).m823f(true);
                return;
        }
    }
}
