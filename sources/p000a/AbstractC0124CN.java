package p000a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;

/* renamed from: a.CN */
/* loaded from: classes.dex */
public abstract class AbstractC0124CN extends AbstractC2370sb {

    /* renamed from: N */
    public int f431N;

    /* renamed from: P */
    public final Rect f432P;

    /* renamed from: Q */
    public int f433Q;

    /* renamed from: v */
    public final Rect f434v;

    public AbstractC0124CN() {
        this.f434v = new Rect();
        this.f432P = new Rect();
        this.f431N = 0;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: W */
    public final boolean mo248W(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout m4999U;
        int i4;
        C2621xJ c2621xJ;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (m4999U = AppBarLayout.ScrollingViewBehavior.m4999U(coordinatorLayout.m4778M(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                if (AbstractC2397t8.m4124h(m4999U) && (c2621xJ = coordinatorLayout.f8901J) != null) {
                    size += c2621xJ.m4517h() + c2621xJ.m4515N();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int m4990u = m4999U.m4990u() + size;
            int measuredHeight = m4999U.getMeasuredHeight();
            if (this instanceof SearchBar$ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                m4990u -= measuredHeight;
            }
            if (i5 == -1) {
                i4 = 1073741824;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            coordinatorLayout.m4783g(view, i, i2, View.MeasureSpec.makeMeasureSpec(m4990u, i4));
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final int m249s(View view) {
        int i;
        int i2;
        if (this.f433Q == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int m4990u = appBarLayout.m4990u();
            int m4991v = appBarLayout.m4991v();
            AbstractC1131VA abstractC1131VA = ((C1168Vr) appBarLayout.getLayoutParams()).f3818z;
            if (abstractC1131VA instanceof AppBarLayout.BaseBehavior) {
                i = ((AppBarLayout.BaseBehavior) abstractC1131VA).mo4363s();
            } else {
                i = 0;
            }
            if ((m4991v == 0 || m4990u + i > m4991v) && (i2 = m4990u - m4991v) != 0) {
                f = (i / i2) + 1.0f;
            }
        }
        int i3 = this.f433Q;
        return AbstractC2575wW.m4408Q((int) (f * i3), 0, i3);
    }

    @Override // p000a.AbstractC2370sb
    /* renamed from: y */
    public final void mo250y(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout m4999U = AppBarLayout.ScrollingViewBehavior.m4999U(coordinatorLayout.m4778M(view));
        if (m4999U != null) {
            C1168Vr c1168Vr = (C1168Vr) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1168Vr).leftMargin;
            int bottom = m4999U.getBottom() + ((ViewGroup.MarginLayoutParams) c1168Vr).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1168Vr).rightMargin;
            int bottom2 = ((m4999U.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1168Vr).bottomMargin;
            Rect rect = this.f434v;
            rect.set(paddingLeft, bottom, width, bottom2);
            C2621xJ c2621xJ = coordinatorLayout.f8901J;
            if (c2621xJ != null) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                if (AbstractC2397t8.m4124h(coordinatorLayout) && !AbstractC2397t8.m4124h(view)) {
                    rect.left = c2621xJ.m4519v() + rect.left;
                    rect.right -= c2621xJ.m4516P();
                }
            }
            Rect rect2 = this.f432P;
            int i2 = c1168Vr.f3816v;
            if (i2 == 0) {
                i2 = 8388659;
            }
            AbstractC0481J3.m1162h(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m249s = m249s(m4999U);
            view.layout(rect2.left, rect2.top - m249s, rect2.right, rect2.bottom - m249s);
            this.f431N = rect2.top - m4999U.getBottom();
            return;
        }
        coordinatorLayout.m4784k(view, i);
        this.f431N = 0;
    }

    public AbstractC0124CN(int i) {
        super(0);
        this.f434v = new Rect();
        this.f432P = new Rect();
        this.f431N = 0;
    }
}
