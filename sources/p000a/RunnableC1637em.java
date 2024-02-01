package p000a;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: a.em */
/* loaded from: classes.dex */
public final class RunnableC1637em implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ TextInputLayout f5095R;

    /* renamed from: S */
    public final /* synthetic */ int f5096S;

    public /* synthetic */ RunnableC1637em(TextInputLayout textInputLayout, int i) {
        this.f5096S = i;
        this.f5095R = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5096S;
        TextInputLayout textInputLayout = this.f5095R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                CheckableImageButton checkableImageButton = textInputLayout.f9507w.f6199k;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                textInputLayout.f9453I.requestLayout();
                return;
        }
    }
}
