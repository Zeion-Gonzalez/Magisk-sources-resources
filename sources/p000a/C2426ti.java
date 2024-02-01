package p000a;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: a.ti */
/* loaded from: classes.dex */
public final class C2426ti extends View.AccessibilityDelegate {

    /* renamed from: z */
    public final /* synthetic */ C0446IU f7428z;

    public C2426ti(C0446IU c0446iu) {
        this.f7428z = c0446iu;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f7428z.f1507o.f9453I;
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
