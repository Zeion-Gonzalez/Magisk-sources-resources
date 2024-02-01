package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: a.BL */
/* loaded from: classes.dex */
public abstract class AbstractC0068BL extends ViewGroup.MarginLayoutParams {

    /* renamed from: z */
    public int f298z;

    public AbstractC0068BL() {
        super(-2, -2);
        this.f298z = 8388627;
    }

    public AbstractC0068BL(AbstractC0068BL abstractC0068BL) {
        super((ViewGroup.MarginLayoutParams) abstractC0068BL);
        this.f298z = 0;
        this.f298z = abstractC0068BL.f298z;
    }

    public AbstractC0068BL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f298z = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0483J5.f1616h);
        this.f298z = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public AbstractC0068BL(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f298z = 0;
    }
}
