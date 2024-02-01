package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.topjohnwu.magisk.R;

/* renamed from: a.tI */
/* loaded from: classes.dex */
public abstract class AbstractC2404tI extends FrameLayout {

    /* renamed from: k */
    public static final int[] f7343k = {16842801};

    /* renamed from: I */
    public final Rect f7344I;

    /* renamed from: R */
    public final boolean f7345R;

    /* renamed from: S */
    public final boolean f7346S;

    /* renamed from: q */
    public final C1624eZ f7347q;

    /* renamed from: w */
    public final Rect f7348w;

    static {
        new C1710g8();
    }

    public AbstractC2404tI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialCardViewStyle);
        Resources resources;
        int i;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f7348w = rect;
        this.f7344I = new Rect();
        C1624eZ c1624eZ = new C1624eZ(this);
        this.f7347q = c1624eZ;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2359sO.f7254z, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f7343k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i = R.color.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f7346S = obtainStyledAttributes.getBoolean(7, false);
        this.f7345R = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C1744go c1744go = new C1744go(dimension, valueOf);
        c1624eZ.f5013R = c1744go;
        ((AbstractC2404tI) c1624eZ.f5015w).setBackgroundDrawable(c1744go);
        AbstractC2404tI abstractC2404tI = (AbstractC2404tI) c1624eZ.f5015w;
        abstractC2404tI.setClipToOutline(true);
        abstractC2404tI.setElevation(dimension2);
        C1744go c1744go2 = (C1744go) ((Drawable) c1624eZ.f5013R);
        boolean z = ((AbstractC2404tI) c1624eZ.f5015w).f7346S;
        boolean m3080P = c1624eZ.m3080P();
        if (dimension3 != c1744go2.f5504N || c1744go2.f5506Q != z || c1744go2.f5510u != m3080P) {
            c1744go2.f5504N = dimension3;
            c1744go2.f5506Q = z;
            c1744go2.f5510u = m3080P;
            c1744go2.m3276h(null);
            c1744go2.invalidateSelf();
        }
        if (!((AbstractC2404tI) c1624eZ.f5015w).f7346S) {
            c1624eZ.m3079I(0, 0, 0, 0);
            return;
        }
        C1744go c1744go3 = (C1744go) ((Drawable) c1624eZ.f5013R);
        float f = c1744go3.f5504N;
        boolean m3080P2 = c1624eZ.m3080P();
        float f2 = c1744go3.f5512z;
        int ceil = (int) Math.ceil(AbstractC0745Ny.m1721z(f, f2, m3080P2));
        int ceil2 = (int) Math.ceil(AbstractC0745Ny.m1720h(f, f2, c1624eZ.m3080P()));
        c1624eZ.m3079I(ceil, ceil2, ceil, ceil2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public final void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
