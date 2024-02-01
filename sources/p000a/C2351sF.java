package p000a;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: a.sF */
/* loaded from: classes.dex */
public final class C2351sF extends AbstractC2703z2 {

    /* renamed from: R */
    public final /* synthetic */ int f7242R;

    /* renamed from: w */
    public final SideSheetBehavior f7243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2351sF(SideSheetBehavior sideSheetBehavior, int i) {
        super(6);
        this.f7242R = i;
        this.f7243w = sideSheetBehavior;
    }

    /* renamed from: EQ */
    public final int m4038EQ(CoordinatorLayout coordinatorLayout) {
        switch (this.f7242R) {
            case AbstractC0795Op.f2698E /* 0 */:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    /* renamed from: Fu */
    public final boolean m4039Fu(float f) {
        switch (this.f7242R) {
            case AbstractC0795Op.f2698E /* 0 */:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    /* renamed from: M6 */
    public final boolean m4040M6(float f, float f2) {
        boolean z;
        boolean z2;
        int i = this.f7242R;
        SideSheetBehavior sideSheetBehavior = this.f7243w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (Math.abs(f) > Math.abs(f2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    float abs = Math.abs(f);
                    sideSheetBehavior.getClass();
                    if (abs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    float abs2 = Math.abs(f);
                    sideSheetBehavior.getClass();
                    if (abs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    /* renamed from: O4 */
    public final int m4041O4(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f7242R) {
            case AbstractC0795Op.f2698E /* 0 */:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    /* renamed from: Rh */
    public final boolean m4042Rh(View view) {
        switch (this.f7242R) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (view.getRight() < (m4045d3() - m4048yF()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (m4045d3() + m4048yF()) / 2) {
                    return true;
                }
                return false;
        }
    }

    /* renamed from: Ry */
    public final int m4043Ry() {
        switch (this.f7242R) {
            case AbstractC0795Op.f2698E /* 0 */:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: T0 */
    public final boolean m4044T0(View view, float f) {
        int i = this.f7242R;
        SideSheetBehavior sideSheetBehavior = this.f7243w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (Math.abs((f * sideSheetBehavior.f9395M) + view.getLeft()) > 0.5f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs((f * sideSheetBehavior.f9395M) + view.getRight()) > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    /* renamed from: d3 */
    public final int m4045d3() {
        int i = this.f7242R;
        SideSheetBehavior sideSheetBehavior = this.f7243w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return Math.max(0, sideSheetBehavior.f9399R + sideSheetBehavior.f9412w);
            default:
                return Math.max(0, (m4048yF() - sideSheetBehavior.f9402V) - sideSheetBehavior.f9412w);
        }
    }

    /* renamed from: nB */
    public final float m4046nB(int i) {
        switch (this.f7242R) {
            case AbstractC0795Op.f2698E /* 0 */:
                float m4048yF = m4048yF();
                return (i - m4048yF) / (m4045d3() - m4048yF);
            default:
                float m4048yF2 = m4048yF();
                return (m4048yF2 - i) / (m4048yF2 - m4045d3());
        }
    }

    /* renamed from: tJ */
    public final int m4047tJ(View view) {
        int i = this.f7242R;
        SideSheetBehavior sideSheetBehavior = this.f7243w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return view.getRight() + sideSheetBehavior.f9412w;
            default:
                return view.getLeft() - sideSheetBehavior.f9412w;
        }
    }

    /* renamed from: yF */
    public final int m4048yF() {
        int i = this.f7242R;
        SideSheetBehavior sideSheetBehavior = this.f7243w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (-sideSheetBehavior.f9402V) - sideSheetBehavior.f9412w;
            default:
                return sideSheetBehavior.f9400S;
        }
    }
}
