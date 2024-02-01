package p000a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: a.YM */
/* loaded from: classes.dex */
public final class C1301YM implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        int i2 = 0;
        int i3 = 1;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            AbstractC2691yn abstractC2691yn = (AbstractC2691yn) message.obj;
            int i4 = message.arg1;
            AccessibilityManager accessibilityManager = abstractC2691yn.f8408s;
            if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Snackbar$SnackbarLayout snackbar$SnackbarLayout = abstractC2691yn.f8402W;
                if (snackbar$SnackbarLayout.getVisibility() == 0) {
                    if (snackbar$SnackbarLayout.f9425w == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setInterpolator(abstractC2691yn.f8396P);
                        ofFloat.addUpdateListener(new C0241Eb(abstractC2691yn, i2));
                        ofFloat.setDuration(abstractC2691yn.f8404h);
                        ofFloat.addListener(new C1457bM(abstractC2691yn, i4, i2));
                        ofFloat.start();
                    } else {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int height = snackbar$SnackbarLayout.getHeight();
                        ViewGroup.LayoutParams layoutParams = snackbar$SnackbarLayout.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        valueAnimator.setIntValues(0, height);
                        valueAnimator.setInterpolator(abstractC2691yn.f8395N);
                        valueAnimator.setDuration(abstractC2691yn.f8410v);
                        valueAnimator.addListener(new C1457bM(abstractC2691yn, i4, i3));
                        valueAnimator.addUpdateListener(new C0127CS(abstractC2691yn));
                        valueAnimator.start();
                    }
                    return true;
                }
            }
            abstractC2691yn.m4597v();
            return true;
        }
        AbstractC2691yn abstractC2691yn2 = (AbstractC2691yn) message.obj;
        Snackbar$SnackbarLayout snackbar$SnackbarLayout2 = abstractC2691yn2.f8402W;
        if (snackbar$SnackbarLayout2.getParent() == null) {
            ViewGroup.LayoutParams layoutParams2 = snackbar$SnackbarLayout2.getLayoutParams();
            if (layoutParams2 instanceof C1168Vr) {
                C1168Vr c1168Vr = (C1168Vr) layoutParams2;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                C2196pM c2196pM = baseTransientBottomBar$Behavior.f9415G;
                c2196pM.getClass();
                c2196pM.f6755R = abstractC2691yn2.f8400U;
                baseTransientBottomBar$Behavior.f9221h = new C2196pM(27, abstractC2691yn2);
                c1168Vr.m2393h(baseTransientBottomBar$Behavior);
                if (abstractC2691yn2.m4596h() == null) {
                    c1168Vr.f3815u = 80;
                }
            }
            snackbar$SnackbarLayout2.f9420U = true;
            ViewGroup viewGroup = abstractC2691yn2.f8409u;
            viewGroup.addView(snackbar$SnackbarLayout2);
            snackbar$SnackbarLayout2.f9420U = false;
            if (abstractC2691yn2.m4596h() != null) {
                int[] iArr = new int[2];
                abstractC2691yn2.m4596h().getLocationOnScreen(iArr);
                int i5 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                i2 = (viewGroup.getHeight() + iArr2[1]) - i5;
            }
            abstractC2691yn2.f8407q = i2;
            abstractC2691yn2.m4595Q();
            snackbar$SnackbarLayout2.setVisibility(4);
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC1285Y3.m2635v(snackbar$SnackbarLayout2)) {
            abstractC2691yn2.m4593N();
        } else {
            abstractC2691yn2.f8412y = true;
        }
        return true;
    }
}
