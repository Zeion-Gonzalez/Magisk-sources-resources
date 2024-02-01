package p000a;

import android.app.Dialog;
import android.view.View;

/* renamed from: a.pO */
/* loaded from: classes.dex */
public final class C2197pO extends AbstractC2703z2 {

    /* renamed from: R */
    public final /* synthetic */ AbstractC2703z2 f6757R;

    /* renamed from: w */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0137Ce f6758w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197pO(DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce, C0973SG c0973sg) {
        super(3);
        this.f6758w = dialogInterfaceOnCancelListenerC0137Ce;
        this.f6757R = c0973sg;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: BX */
    public final boolean mo1965BX() {
        if (!this.f6757R.mo1965BX() && !this.f6758w.f466O4) {
            return false;
        }
        return true;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Ha */
    public final View mo1968Ha(int i) {
        AbstractC2703z2 abstractC2703z2 = this.f6757R;
        if (abstractC2703z2.mo1965BX()) {
            return abstractC2703z2.mo1968Ha(i);
        }
        Dialog dialog = this.f6758w.f463G5;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }
}
