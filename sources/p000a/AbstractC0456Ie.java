package p000a;

import android.view.View;
import android.view.Window;

/* renamed from: a.Ie */
/* loaded from: classes.dex */
public abstract class AbstractC0456Ie {
    /* renamed from: z */
    public static void m1092z(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
