package p000a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: a.QD */
/* loaded from: classes.dex */
public final class C0866QD extends AbstractC0541KC {

    /* renamed from: R */
    public boolean f2951R;

    public C0866QD(Drawable drawable) {
        super(drawable);
        this.f2951R = true;
    }

    @Override // p000a.AbstractC0541KC, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f2951R) {
            super.draw(canvas);
        }
    }

    @Override // p000a.AbstractC0541KC, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f2951R) {
            super.setHotspot(f, f2);
        }
    }

    @Override // p000a.AbstractC0541KC, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f2951R) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // p000a.AbstractC0541KC, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f2951R) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // p000a.AbstractC0541KC, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f2951R) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
