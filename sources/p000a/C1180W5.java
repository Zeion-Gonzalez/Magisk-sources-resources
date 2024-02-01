package p000a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: a.W5 */
/* loaded from: classes.dex */
public final class C1180W5 extends Drawable {

    /* renamed from: z */
    public final ActionBarContainer f3853z;

    public C1180W5(ActionBarContainer actionBarContainer) {
        this.f3853z = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3853z;
        if (actionBarContainer.f8703g) {
            Drawable drawable = actionBarContainer.f8704k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f8700I;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f8705q;
        if (drawable3 == null || !actionBarContainer.f8708y) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f3853z;
        if (actionBarContainer.f8703g) {
            if (actionBarContainer.f8704k != null) {
                drawable = actionBarContainer.f8700I;
            } else {
                return;
            }
        } else {
            drawable = actionBarContainer.f8700I;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
