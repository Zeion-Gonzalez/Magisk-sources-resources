package p000a;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* renamed from: a.vY */
/* loaded from: classes.dex */
public abstract class AbstractC2527vY extends AbstractC2370sb {

    /* renamed from: N */
    public boolean f7735N;

    /* renamed from: P */
    public OverScroller f7736P;

    /* renamed from: Q */
    public int f7737Q;

    /* renamed from: W */
    public VelocityTracker f7738W;

    /* renamed from: o */
    public int f7739o;

    /* renamed from: u */
    public int f7740u;

    /* renamed from: v */
    public RunnableC0729Nh f7741v;

    public AbstractC2527vY() {
        this.f7737Q = -1;
        this.f7739o = -1;
    }

    /* renamed from: E */
    public final void m4361E(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo4362U(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: U */
    public abstract int mo4362U(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // p000a.AbstractC1131VA
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2322k(androidx.coordinatorlayout.widget.CoordinatorLayout r22, android.view.View r23, android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2527vY.mo2322k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: s */
    public abstract int mo4363s();

    @Override // p000a.AbstractC1131VA
    /* renamed from: u */
    public final boolean mo2325u(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View view2;
        int findPointerIndex;
        if (this.f7739o < 0) {
            this.f7739o = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f7735N) {
            int i = this.f7737Q;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f7740u) > this.f7739o) {
                this.f7740u = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f7737Q = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f9183R;
            if (weakReference != null && ((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) {
                z = false;
            } else {
                z = true;
            }
            if (z && coordinatorLayout.m4777I(view, x, y2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f7735N = z2;
            if (z2) {
                this.f7740u = y2;
                this.f7737Q = motionEvent.getPointerId(0);
                if (this.f7738W == null) {
                    this.f7738W = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f7736P;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f7736P.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f7738W;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC2527vY(int i) {
        super(0);
        this.f7737Q = -1;
        this.f7739o = -1;
    }
}
