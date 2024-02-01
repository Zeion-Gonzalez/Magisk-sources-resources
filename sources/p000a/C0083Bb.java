package p000a;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* renamed from: a.Bb */
/* loaded from: classes.dex */
public final class C0083Bb extends Property {

    /* renamed from: h */
    public final Object f326h;

    /* renamed from: z */
    public final /* synthetic */ int f327z = 1;

    public C0083Bb() {
        super(Matrix.class, "imageMatrixProperty");
        this.f326h = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        int i = this.f327z;
        Object obj2 = this.f326h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((Drawable) obj).copyBounds((Rect) obj2);
                return new PointF(r1.left, r1.top);
            case 1:
                Matrix matrix = (Matrix) obj2;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
            default:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                float alpha = (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f9349K.getColorForState(extendedFloatingActionButton.getDrawableState(), ((AbstractC0081BY) obj2).f317h.f9349K.getDefaultColor()));
                LinearInterpolator linearInterpolator = AbstractC1090US.f3564z;
                return Float.valueOf((alpha * 1.0f) + 0.0f);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        int i = this.f327z;
        Object obj3 = this.f326h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Drawable drawable = (Drawable) obj;
                PointF pointF = (PointF) obj2;
                Rect rect = (Rect) obj3;
                drawable.copyBounds(rect);
                rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(rect);
                return;
            case 1:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                return;
            default:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f = (Float) obj2;
                int colorForState = extendedFloatingActionButton.f9349K.getColorForState(extendedFloatingActionButton.getDrawableState(), ((AbstractC0081BY) obj3).f317h.f9349K.getDefaultColor());
                float floatValue = f.floatValue();
                LinearInterpolator linearInterpolator = AbstractC1090US.f3564z;
                ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (((((Color.alpha(colorForState) / 255.0f) - 0.0f) * floatValue) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                if (f.floatValue() == 1.0f) {
                    extendedFloatingActionButton.m5052R(extendedFloatingActionButton.f9349K);
                    return;
                } else {
                    extendedFloatingActionButton.m5052R(valueOf);
                    return;
                }
        }
    }

    public C0083Bb(int i) {
        super(PointF.class, "boundsOrigin");
        this.f326h = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083Bb(AbstractC0081BY abstractC0081BY) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.f326h = abstractC0081BY;
    }
}
