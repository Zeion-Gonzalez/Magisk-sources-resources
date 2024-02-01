package p000a;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* renamed from: a.zT */
/* loaded from: classes.dex */
public final class C2726zT extends C1094UW {

    /* renamed from: I */
    public final WindowInsetsController f8567I;

    /* renamed from: w */
    public final View f8568w;

    public C2726zT(View view) {
        super(view);
        this.f8568w = view;
    }

    @Override // p000a.C1094UW, p000a.C1665fK
    /* renamed from: r */
    public final void mo2267r() {
        int ime;
        View view = this.f8568w;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f8567I;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.mo2267r();
        } else {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
    }

    public C2726zT(WindowInsetsController windowInsetsController) {
        super(null);
        this.f8567I = windowInsetsController;
    }
}
