package p000a;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.topjohnwu.magisk.R;

/* renamed from: a.J8 */
/* loaded from: classes.dex */
public final class C0485J8 extends AbstractC2691yn {

    /* renamed from: e */
    public static final int[] f1629e = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: H */
    public final AccessibilityManager f1630H;

    public C0485J8(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f1630H = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}
