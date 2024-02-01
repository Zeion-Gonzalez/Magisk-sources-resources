package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* renamed from: a.Dy */
/* loaded from: classes.dex */
public abstract class AbstractC0207Dy extends ViewGroup {

    /* renamed from: E */
    public Drawable f648E;

    /* renamed from: I */
    public int f649I;

    /* renamed from: J */
    public final int f650J;

    /* renamed from: R */
    public final int f651R;

    /* renamed from: S */
    public boolean f652S;

    /* renamed from: U */
    public int[] f653U;

    /* renamed from: c */
    public final int f654c;

    /* renamed from: f */
    public int f655f;

    /* renamed from: g */
    public final float f656g;

    /* renamed from: k */
    public int f657k;

    /* renamed from: q */
    public int f658q;

    /* renamed from: r */
    public int f659r;

    /* renamed from: s */
    public int[] f660s;

    /* renamed from: w */
    public int f661w;

    /* renamed from: y */
    public final boolean f662y;

    public AbstractC0207Dy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f652S = true;
        this.f651R = -1;
        this.f661w = 0;
        this.f658q = 8388659;
        int[] iArr = AbstractC0483J5.f1607R;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C2709z9 c2709z9 = new C2709z9(context, obtainStyledAttributes);
        AbstractC2446u3.m4215M(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        int m4648o = c2709z9.m4648o(1, -1);
        if (m4648o >= 0 && this.f649I != m4648o) {
            this.f649I = m4648o;
            requestLayout();
        }
        int m4648o2 = c2709z9.m4648o(0, -1);
        if (m4648o2 >= 0 && this.f658q != m4648o2) {
            m4648o2 = (8388615 & m4648o2) == 0 ? m4648o2 | 8388611 : m4648o2;
            this.f658q = (m4648o2 & 112) == 0 ? m4648o2 | 48 : m4648o2;
            requestLayout();
        }
        boolean m4652z = c2709z9.m4652z(2, true);
        if (!m4652z) {
            this.f652S = m4652z;
        }
        this.f656g = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f651R = c2709z9.m4648o(3, -1);
        this.f662y = c2709z9.m4652z(7, false);
        Drawable m4642N = c2709z9.m4642N(5);
        if (m4642N != this.f648E) {
            this.f648E = m4642N;
            if (m4642N != null) {
                this.f655f = m4642N.getIntrinsicWidth();
                this.f659r = m4642N.getIntrinsicHeight();
            } else {
                this.f655f = 0;
                this.f659r = 0;
            }
            setWillNotDraw(m4642N == null);
            requestLayout();
        }
        this.f650J = c2709z9.m4648o(8, 0);
        this.f654c = c2709z9.m4643P(6, 0);
        c2709z9.m4651w();
    }

    @Override // android.view.ViewGroup
    /* renamed from: G */
    public C2384ss generateLayoutParams(AttributeSet attributeSet) {
        return new C2384ss(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: M */
    public C2384ss generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2384ss(layoutParams);
    }

    /* renamed from: V */
    public final boolean m411V(int i) {
        int i2 = this.f650J;
        if (i == 0) {
            return (i2 & 1) != 0;
        }
        if (i == getChildCount()) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) == 0) {
            return false;
        }
        for (int i3 = i - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: W */
    public C2384ss generateDefaultLayoutParams() {
        int i = this.f649I;
        if (i == 0) {
            return new C2384ss(-2);
        }
        if (i == 1) {
            return new C2384ss(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2384ss;
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        int i2 = this.f651R;
        if (i2 < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (i2 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f661w;
        if (this.f649I == 1 && (i = this.f658q & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f657k) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f657k;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((C2384ss) childAt.getLayoutParams())).topMargin + baseline;
    }

    /* renamed from: o */
    public final void m413o(Canvas canvas, int i) {
        Drawable drawable = this.f648E;
        int paddingTop = getPaddingTop();
        int i2 = this.f654c;
        drawable.setBounds(i, paddingTop + i2, this.f655f + i, (getHeight() - getPaddingBottom()) - i2);
        this.f648E.draw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.f648E == null) {
            return;
        }
        int i2 = 0;
        if (this.f649I == 1) {
            int childCount = getChildCount();
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m411V(i2)) {
                    m414u(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C2384ss) childAt.getLayoutParams())).topMargin) - this.f659r);
                }
                i2++;
            }
            if (m411V(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f659r;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C2384ss) childAt2.getLayoutParams())).bottomMargin;
                }
                m414u(canvas, bottom);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean m3062z = AbstractC1586ds.m3062z(this);
        while (i2 < childCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m411V(i2)) {
                C2384ss c2384ss = (C2384ss) childAt3.getLayoutParams();
                if (m3062z) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) c2384ss).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) c2384ss).leftMargin) - this.f655f;
                }
                m413o(canvas, left2);
            }
            i2++;
        }
        if (m411V(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 == null) {
                if (m3062z) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    i = getPaddingRight();
                    right = (left - i) - this.f655f;
                }
            } else {
                C2384ss c2384ss2 = (C2384ss) childAt4.getLayoutParams();
                if (m3062z) {
                    left = childAt4.getLeft();
                    i = ((LinearLayout.LayoutParams) c2384ss2).leftMargin;
                    right = (left - i) - this.f655f;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c2384ss2).rightMargin;
                }
            }
            m413o(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0207Dy.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:782:0x0712, code lost:
    
        if (r7 < 0) goto L783;
     */
    /* JADX WARN: Removed duplicated region for block: B:592:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:885:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 2217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0207Dy.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: u */
    public final void m414u(Canvas canvas, int i) {
        Drawable drawable = this.f648E;
        int paddingLeft = getPaddingLeft();
        int i2 = this.f654c;
        drawable.setBounds(paddingLeft + i2, i, (getWidth() - getPaddingRight()) - i2, this.f659r + i);
        this.f648E.draw(canvas);
    }
}
