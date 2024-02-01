package p000a;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: a.p7 */
/* loaded from: classes.dex */
public final class C2183p7 extends ViewOutlineProvider {

    /* renamed from: z */
    public final /* synthetic */ Chip f6682z;

    public C2183p7(Chip chip) {
        this.f6682z = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C2694yr c2694yr = this.f6682z.f9330q;
        if (c2694yr != null) {
            c2694yr.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
