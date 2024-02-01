package p000a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;

/* renamed from: a.KS */
/* loaded from: classes.dex */
public final class RunnableC0555KS implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ AbstractC2691yn f1814R;

    /* renamed from: S */
    public final /* synthetic */ int f1815S;

    public /* synthetic */ RunnableC0555KS(AbstractC2691yn abstractC2691yn, int i) {
        this.f1815S = i;
        this.f1814R = abstractC2691yn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        WindowMetrics currentWindowMetrics;
        int i = this.f1815S;
        int i2 = 1;
        AbstractC2691yn abstractC2691yn = this.f1814R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (abstractC2691yn.f8402W != null && (context = abstractC2691yn.f8406o) != null) {
                    int i3 = AbstractC0795Op.f2698E;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    Snackbar$SnackbarLayout snackbar$SnackbarLayout = abstractC2691yn.f8402W;
                    snackbar$SnackbarLayout.getLocationOnScreen(iArr);
                    int height2 = (height - (snackbar$SnackbarLayout.getHeight() + iArr[1])) + ((int) snackbar$SnackbarLayout.getTranslationY());
                    int i4 = abstractC2691yn.f8405k;
                    if (height2 >= i4) {
                        abstractC2691yn.f8403g = i4;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = snackbar$SnackbarLayout.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(AbstractC2691yn.f8389c, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    int i5 = abstractC2691yn.f8405k;
                    abstractC2691yn.f8403g = i5;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (i5 - height2) + marginLayoutParams.bottomMargin;
                    snackbar$SnackbarLayout.requestLayout();
                    return;
                }
                return;
            case 1:
                abstractC2691yn.m4597v();
                return;
            default:
                Snackbar$SnackbarLayout snackbar$SnackbarLayout2 = abstractC2691yn.f8402W;
                if (snackbar$SnackbarLayout2 != null) {
                    ViewParent parent = snackbar$SnackbarLayout2.getParent();
                    int i6 = 0;
                    Snackbar$SnackbarLayout snackbar$SnackbarLayout3 = abstractC2691yn.f8402W;
                    if (parent != null) {
                        snackbar$SnackbarLayout3.setVisibility(0);
                    }
                    if (snackbar$SnackbarLayout3.f9425w == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(abstractC2691yn.f8396P);
                        ofFloat.addUpdateListener(new C0241Eb(abstractC2691yn, i6));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(abstractC2691yn.f8397Q);
                        ofFloat2.addUpdateListener(new C0241Eb(abstractC2691yn, i2));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(abstractC2691yn.f8413z);
                        animatorSet.addListener(new C2177p1(abstractC2691yn, i2));
                        animatorSet.start();
                        return;
                    }
                    int height3 = snackbar$SnackbarLayout3.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = snackbar$SnackbarLayout3.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    snackbar$SnackbarLayout3.setTranslationY(height3);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(height3, 0);
                    valueAnimator.setInterpolator(abstractC2691yn.f8395N);
                    valueAnimator.setDuration(abstractC2691yn.f8410v);
                    valueAnimator.addListener(new C2177p1(abstractC2691yn, i6));
                    valueAnimator.addUpdateListener(new C1558dJ(abstractC2691yn, height3));
                    valueAnimator.start();
                    return;
                }
                return;
        }
    }
}
