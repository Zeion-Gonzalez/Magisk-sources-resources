package p000a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.topjohnwu.magisk.R;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: a.yn */
/* loaded from: classes.dex */
public abstract class AbstractC2691yn {

    /* renamed from: G */
    public final InterfaceC1758h1 f8392G;

    /* renamed from: I */
    public int f8393I;

    /* renamed from: M */
    public int f8394M;

    /* renamed from: N */
    public final TimeInterpolator f8395N;

    /* renamed from: P */
    public final TimeInterpolator f8396P;

    /* renamed from: Q */
    public final TimeInterpolator f8397Q;

    /* renamed from: R */
    public int f8398R;

    /* renamed from: S */
    public final RunnableC0555KS f8399S = new RunnableC0555KS(this, 0);

    /* renamed from: U */
    public final C0506JZ f8400U = new C0506JZ(this);

    /* renamed from: V */
    public ViewOnAttachStateChangeListenerC0215E5 f8401V;

    /* renamed from: W */
    public final Snackbar$SnackbarLayout f8402W;

    /* renamed from: g */
    public int f8403g;

    /* renamed from: h */
    public final int f8404h;

    /* renamed from: k */
    public int f8405k;

    /* renamed from: o */
    public final Context f8406o;

    /* renamed from: q */
    public int f8407q;

    /* renamed from: s */
    public final AccessibilityManager f8408s;

    /* renamed from: u */
    public final ViewGroup f8409u;

    /* renamed from: v */
    public final int f8410v;

    /* renamed from: w */
    public int f8411w;

    /* renamed from: y */
    public boolean f8412y;

    /* renamed from: z */
    public final int f8413z;

    /* renamed from: E */
    public static final C2174oz f8386E = AbstractC1090US.f3562h;

    /* renamed from: f */
    public static final LinearInterpolator f8390f = AbstractC1090US.f3564z;

    /* renamed from: r */
    public static final C2121o1 f8391r = AbstractC1090US.f3561P;

    /* renamed from: J */
    public static final int[] f8387J = {R.attr.snackbarStyle};

    /* renamed from: c */
    public static final String f8389c = AbstractC2691yn.class.getSimpleName();

    /* renamed from: Y */
    public static final Handler f8388Y = new Handler(Looper.getMainLooper(), new C1301YM());

    public AbstractC2691yn(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        boolean z;
        int i;
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.f8409u = viewGroup;
                this.f8392G = snackbarContentLayout2;
                this.f8406o = context;
                AbstractC0795Op.m1834W(context, AbstractC0795Op.f2719y, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f8387J);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = R.layout.mtrl_layout_snackbar;
                } else {
                    i = R.layout.design_layout_snackbar;
                }
                Snackbar$SnackbarLayout snackbar$SnackbarLayout = (Snackbar$SnackbarLayout) from.inflate(i, viewGroup, false);
                this.f8402W = snackbar$SnackbarLayout;
                snackbar$SnackbarLayout.f9419S = this;
                float f = snackbar$SnackbarLayout.f9417I;
                if (f != 1.0f) {
                    snackbarContentLayout.f9428R.setTextColor(AbstractC0795Op.m1829T(AbstractC0795Op.m1816J(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f9428R.getCurrentTextColor(), f));
                }
                snackbarContentLayout.f9427I = snackbar$SnackbarLayout.f9422k;
                snackbar$SnackbarLayout.addView(snackbarContentLayout);
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                AbstractC1285Y3.m2632Q(snackbar$SnackbarLayout, 1);
                AbstractC2397t8.m4123g(snackbar$SnackbarLayout, 1);
                snackbar$SnackbarLayout.setFitsSystemWindows(true);
                int i2 = 3;
                AbstractC1548d9.m3014s(snackbar$SnackbarLayout, new C2052mg(i2, this));
                AbstractC2446u3.m4221V(snackbar$SnackbarLayout, new C2414tT(i2, this));
                this.f8408s = (AccessibilityManager) context.getSystemService("accessibility");
                this.f8410v = AbstractC0795Op.m1831U8(context, R.attr.motionDurationLong2, 250);
                this.f8413z = AbstractC0795Op.m1831U8(context, R.attr.motionDurationLong2, 150);
                this.f8404h = AbstractC0795Op.m1831U8(context, R.attr.motionDurationMedium1, 75);
                this.f8396P = AbstractC0795Op.m1802BO(context, R.attr.motionEasingEmphasizedInterpolator, f8390f);
                this.f8397Q = AbstractC0795Op.m1802BO(context, R.attr.motionEasingEmphasizedInterpolator, f8391r);
                this.f8395N = AbstractC0795Op.m1802BO(context, R.attr.motionEasingEmphasizedInterpolator, f8386E);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    /* renamed from: N */
    public final void m4593N() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.f8408s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        Snackbar$SnackbarLayout snackbar$SnackbarLayout = this.f8402W;
        if (z) {
            snackbar$SnackbarLayout.post(new RunnableC0555KS(this, 2));
            return;
        }
        if (snackbar$SnackbarLayout.getParent() != null) {
            snackbar$SnackbarLayout.setVisibility(0);
        }
        m4594P();
    }

    /* renamed from: P */
    public final void m4594P() {
        C2671yR m4574h = C2671yR.m4574h();
        C0506JZ c0506jz = this.f8400U;
        synchronized (m4574h.f8322z) {
            if (m4574h.m4579v(c0506jz)) {
                m4574h.m4577Q(m4574h.f8321v);
            }
        }
    }

    /* renamed from: Q */
    public final void m4595Q() {
        int i;
        boolean z;
        boolean z2;
        String str;
        Snackbar$SnackbarLayout snackbar$SnackbarLayout = this.f8402W;
        ViewGroup.LayoutParams layoutParams = snackbar$SnackbarLayout.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            str = "Unable to update margins because layout params are not MarginLayoutParams";
        } else if (snackbar$SnackbarLayout.f9424s == null) {
            str = "Unable to update margins because original view margins are not set";
        } else {
            if (snackbar$SnackbarLayout.getParent() == null) {
                return;
            }
            if (m4596h() != null) {
                i = this.f8407q;
            } else {
                i = this.f8398R;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = snackbar$SnackbarLayout.f9424s;
            int i2 = rect.bottom + i;
            int i3 = rect.left + this.f8411w;
            int i4 = rect.right + this.f8393I;
            int i5 = rect.top;
            boolean z3 = false;
            if (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                marginLayoutParams.bottomMargin = i2;
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = i4;
                marginLayoutParams.topMargin = i5;
                snackbar$SnackbarLayout.requestLayout();
            }
            if ((z || this.f8403g != this.f8405k) && Build.VERSION.SDK_INT >= 29) {
                if (this.f8405k > 0) {
                    ViewGroup.LayoutParams layoutParams2 = snackbar$SnackbarLayout.getLayoutParams();
                    if ((layoutParams2 instanceof C1168Vr) && (((C1168Vr) layoutParams2).f3818z instanceof SwipeDismissBehavior)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z3 = true;
                    }
                }
                if (z3) {
                    RunnableC0555KS runnableC0555KS = this.f8399S;
                    snackbar$SnackbarLayout.removeCallbacks(runnableC0555KS);
                    snackbar$SnackbarLayout.post(runnableC0555KS);
                    return;
                }
                return;
            }
            return;
        }
        Log.w(f8389c, str);
    }

    /* renamed from: h */
    public final View m4596h() {
        ViewOnAttachStateChangeListenerC0215E5 viewOnAttachStateChangeListenerC0215E5 = this.f8401V;
        if (viewOnAttachStateChangeListenerC0215E5 == null) {
            return null;
        }
        return (View) viewOnAttachStateChangeListenerC0215E5.f680R.get();
    }

    /* renamed from: v */
    public final void m4597v() {
        C2671yR m4574h = C2671yR.m4574h();
        C0506JZ c0506jz = this.f8400U;
        synchronized (m4574h.f8322z) {
            if (m4574h.m4579v(c0506jz)) {
                m4574h.f8321v = null;
                if (m4574h.f8319P != null) {
                    m4574h.m4578u();
                }
            }
        }
        ViewParent parent = this.f8402W.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f8402W);
        }
    }

    /* renamed from: z */
    public final void m4598z(int i) {
        C1848im c1848im;
        boolean z;
        C2671yR m4574h = C2671yR.m4574h();
        C0506JZ c0506jz = this.f8400U;
        synchronized (m4574h.f8322z) {
            if (m4574h.m4579v(c0506jz)) {
                c1848im = m4574h.f8321v;
            } else {
                C1848im c1848im2 = m4574h.f8319P;
                boolean z2 = false;
                if (c1848im2 != null) {
                    if (c0506jz != null && c1848im2.f5772z.get() == c0506jz) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    c1848im = m4574h.f8319P;
                }
            }
            m4574h.m4580z(c1848im, i);
        }
    }
}
