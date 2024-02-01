package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.Uj */
/* loaded from: classes.dex */
public final class C1106Uj extends AbstractC1706g4 {

    /* renamed from: D */
    public final int f3597D;

    /* renamed from: Yd */
    public final ArrayList f3598Yd;

    /* renamed from: b */
    public final int f3599b;

    /* renamed from: l */
    public final int f3600l;

    /* renamed from: m */
    public final int f3601m;

    /* renamed from: nP */
    public boolean f3602nP;

    public C1106Uj(Context context) {
        super(context);
        this.f3598Yd = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f3597D = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f3601m = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f3600l = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f3599b = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                if (AbstractC0095Bq.m199P(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        C2189pE c2189pE = this.f5364t;
        int size = View.MeasureSpec.getSize(i);
        int size2 = c2189pE.m3795V().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f3598Yd;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i6 = this.f5361q;
        int i7 = 1;
        if (i6 != -1 ? i6 == 0 : size2 > 3) {
            z = true;
        } else {
            z = false;
        }
        int i8 = this.f3600l;
        if (z && this.f3602nP) {
            View childAt = getChildAt(this.f5367y);
            int visibility = childAt.getVisibility();
            int i9 = this.f3599b;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i10 = size2 - i4;
            int min = Math.min(size - (this.f3601m * i10), Math.min(i9, i8));
            int i11 = size - min;
            if (i10 != 0) {
                i7 = i10;
            }
            int min2 = Math.min(i11 / i7, this.f3597D);
            int i12 = i11 - (i10 * min2);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    if (i13 == this.f5367y) {
                        i5 = min;
                    } else {
                        i5 = min2;
                    }
                    if (i12 > 0) {
                        i5++;
                        i12--;
                    }
                } else {
                    i5 = 0;
                }
                arrayList.add(Integer.valueOf(i5));
            }
        } else {
            if (size2 != 0) {
                i7 = size2;
            }
            int min3 = Math.min(size / i7, i8);
            int i14 = size - (size2 * min3);
            for (int i15 = 0; i15 < childCount; i15++) {
                if (getChildAt(i15).getVisibility() != 8) {
                    if (i14 > 0) {
                        i3 = min3 + 1;
                        i14--;
                    } else {
                        i3 = min3;
                    }
                } else {
                    i3 = 0;
                }
                arrayList.add(Integer.valueOf(i3));
            }
        }
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i17)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i16 = childAt2.getMeasuredWidth() + i16;
            }
        }
        setMeasuredDimension(i16, size3);
    }
}
