package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: a.RD */
/* loaded from: classes.dex */
public final class C0914RD extends LinearLayout.LayoutParams {

    /* renamed from: h */
    public C1624eZ f3140h;

    /* renamed from: v */
    public final Interpolator f3141v;

    /* renamed from: z */
    public final int f3142z;

    public C0914RD() {
        super(-1, -2);
        this.f3142z = 1;
    }

    public C0914RD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3142z = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2936h);
        this.f3142z = obtainStyledAttributes.getInt(1, 0);
        this.f3140h = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new C1624eZ();
        if (obtainStyledAttributes.hasValue(2)) {
            this.f3141v = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public C0914RD(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3142z = 1;
    }

    public C0914RD(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3142z = 1;
    }

    public C0914RD(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3142z = 1;
    }
}
