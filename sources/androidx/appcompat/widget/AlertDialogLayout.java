package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0207Dy;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C2384ss;

/* loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC0207Dy {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: S */
    public static int m4721S(View view) {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        int m4117P = AbstractC2397t8.m4117P(view);
        if (m4117P > 0) {
            return m4117P;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m4721S(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0099  */
    @Override // p000a.AbstractC0207Dy, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.f658q
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L37
            r4 = 80
            if (r3 == r4) goto L2e
            int r12 = r9.getPaddingTop()
            goto L41
        L2e:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L41
        L37:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L41:
            android.graphics.drawable.Drawable r14 = r9.f648E
            r0 = 0
            if (r14 != 0) goto L48
            r14 = r0
            goto L4c
        L48:
            int r14 = r14.getIntrinsicHeight()
        L4c:
            if (r0 >= r1) goto Lab
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto La8
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto La8
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            a.ss r6 = (p000a.C2384ss) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L6f
            r7 = r2
        L6f:
            java.util.WeakHashMap r8 = p000a.AbstractC2446u3.f7488z
            int r8 = p000a.AbstractC0095Bq.m199P(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L88
            r8 = 5
            if (r7 == r8) goto L85
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L93
        L85:
            int r7 = r11 - r4
            goto L90
        L88:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
        L90:
            int r8 = r6.rightMargin
            int r7 = r7 - r8
        L93:
            boolean r8 = r9.m411V(r0)
            if (r8 == 0) goto L9a
            int r12 = r12 + r14
        L9a:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        La8:
            int r0 = r0 + 1
            goto L4c
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // p000a.AbstractC0207Dy, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                    break;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i4 = m4721S(view2);
            i5 = view2.getMeasuredHeight() - i4;
            paddingBottom += i4;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view3.measure(i, makeMeasureSpec);
            i6 = view3.getMeasuredHeight();
            paddingBottom += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - paddingBottom;
        if (view2 != null) {
            int i9 = paddingBottom - i4;
            int min = Math.min(i8, i5);
            if (min > 0) {
                i8 -= min;
                i4 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingBottom = i9 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i8 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
            paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i10, i, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    C2384ss c2384ss = (C2384ss) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c2384ss).width == -1) {
                        int i13 = ((LinearLayout.LayoutParams) c2384ss).height;
                        ((LinearLayout.LayoutParams) c2384ss).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i2, 0);
                        ((LinearLayout.LayoutParams) c2384ss).height = i13;
                    }
                }
            }
        }
        z = true;
        if (!z) {
            super.onMeasure(i, i2);
        }
    }
}
