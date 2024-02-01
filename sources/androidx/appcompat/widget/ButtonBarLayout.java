package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0483J5;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: R */
    public boolean f8770R;

    /* renamed from: S */
    public final boolean f8771S;

    /* renamed from: w */
    public int f8772w;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8772w = -1;
        int[] iArr = AbstractC0483J5.f1603M;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC2446u3.m4215M(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        this.f8771S = z;
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            m4722z(z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int paddingBottom;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        boolean z3 = this.f8771S;
        if (z3) {
            if (size > this.f8772w && this.f8770R) {
                m4722z(false);
            }
            this.f8772w = size;
        }
        if (!this.f8770R && View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        if (z3 && !this.f8770R) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                m4722z(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 < childCount) {
                if (getChildAt(i6).getVisibility() == 0) {
                    break;
                } else {
                    i6++;
                }
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i5 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f8770R) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    }
                    i7++;
                }
                if (i4 >= 0) {
                    paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i5 += paddingBottom;
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC2397t8.m4117P(this) != i5) {
            setMinimumHeight(i5);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    /* renamed from: z */
    public final void m4722z(boolean z) {
        if (this.f8770R != z) {
            if (!z || this.f8771S) {
                this.f8770R = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }
}
