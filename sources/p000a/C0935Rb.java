package p000a;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: a.Rb */
/* loaded from: classes.dex */
public final class C0935Rb {

    /* renamed from: z */
    public final C1665fK f3211z;

    public C0935Rb(Window window, View view) {
        C2196pM c2196pM = new C2196pM(view, 10);
        int i = Build.VERSION.SDK_INT;
        this.f3211z = i >= 30 ? new C2725zQ(window, c2196pM) : i >= 26 ? new C0077BU(window, c2196pM) : new C1160Vj(window, c2196pM);
    }

    public C0935Rb(WindowInsetsController windowInsetsController) {
        this.f3211z = new C2725zQ(windowInsetsController, new C2196pM(windowInsetsController));
    }
}
