package p000a;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: a.G5 */
/* loaded from: classes.dex */
public final class C0318G5 extends ClickableSpan {

    /* renamed from: R */
    public final C1799hs f1080R;

    /* renamed from: S */
    public final int f1081S;

    /* renamed from: w */
    public final int f1082w;

    public C0318G5(int i, C1799hs c1799hs, int i2) {
        this.f1081S = i;
        this.f1080R = c1799hs;
        this.f1082w = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1081S);
        this.f1080R.f5654z.performAction(this.f1082w, bundle);
    }
}
