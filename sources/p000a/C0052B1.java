package p000a;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* renamed from: a.B1 */
/* loaded from: classes.dex */
public final class C0052B1 extends AbstractC0990Sa {
    @Override // p000a.C2281qz
    /* renamed from: o */
    public final void mo94o(Canvas canvas) {
        if (this.f3335j.f4860U.isEmpty()) {
            super.mo94o(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f3335j.f4860U);
        } else {
            canvas.clipRect(this.f3335j.f4860U, Region.Op.DIFFERENCE);
        }
        super.mo94o(canvas);
        canvas.restore();
    }
}
