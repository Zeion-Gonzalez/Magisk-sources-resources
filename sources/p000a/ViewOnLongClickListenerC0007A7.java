package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: a.A7 */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC0007A7 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: E */
    public static ViewOnLongClickListenerC0007A7 f74E;

    /* renamed from: f */
    public static ViewOnLongClickListenerC0007A7 f75f;

    /* renamed from: I */
    public final RunnableC2376sh f76I;

    /* renamed from: R */
    public final CharSequence f77R;

    /* renamed from: S */
    public final View f78S;

    /* renamed from: U */
    public boolean f79U;

    /* renamed from: g */
    public int f80g;

    /* renamed from: k */
    public int f81k;

    /* renamed from: q */
    public final RunnableC2376sh f82q;

    /* renamed from: s */
    public boolean f83s;

    /* renamed from: w */
    public final int f84w;

    /* renamed from: y */
    public C1774hM f85y;

    /* JADX WARN: Type inference failed for: r0v0, types: [a.sh] */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.sh] */
    public ViewOnLongClickListenerC0007A7(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        final int i = 0;
        this.f76I = new Runnable(this) { // from class: a.sh

            /* renamed from: R */
            public final /* synthetic */ ViewOnLongClickListenerC0007A7 f7304R;

            {
                this.f7304R = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i;
                ViewOnLongClickListenerC0007A7 viewOnLongClickListenerC0007A7 = this.f7304R;
                switch (i22) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        viewOnLongClickListenerC0007A7.m28v(false);
                        return;
                    default:
                        viewOnLongClickListenerC0007A7.m29z();
                        return;
                }
            }
        };
        final int i2 = 1;
        this.f82q = new Runnable(this) { // from class: a.sh

            /* renamed from: R */
            public final /* synthetic */ ViewOnLongClickListenerC0007A7 f7304R;

            {
                this.f7304R = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ViewOnLongClickListenerC0007A7 viewOnLongClickListenerC0007A7 = this.f7304R;
                switch (i22) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        viewOnLongClickListenerC0007A7.m28v(false);
                        return;
                    default:
                        viewOnLongClickListenerC0007A7.m29z();
                        return;
                }
            }
        };
        this.f78S = view;
        this.f77R = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC1995lW.f6177z;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = AbstractC1427an.m2857z(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f84w = scaledTouchSlop;
        this.f79U = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: h */
    public static void m27h(ViewOnLongClickListenerC0007A7 viewOnLongClickListenerC0007A7) {
        ViewOnLongClickListenerC0007A7 viewOnLongClickListenerC0007A72 = f74E;
        if (viewOnLongClickListenerC0007A72 != null) {
            viewOnLongClickListenerC0007A72.f78S.removeCallbacks(viewOnLongClickListenerC0007A72.f76I);
        }
        f74E = viewOnLongClickListenerC0007A7;
        if (viewOnLongClickListenerC0007A7 != null) {
            viewOnLongClickListenerC0007A7.f78S.postDelayed(viewOnLongClickListenerC0007A7.f76I, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            a.hM r5 = r4.f85y
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.f83s
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f78S
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.f79U = r3
            r4.m29z()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            a.hM r5 = r4.f85y
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.f79U
            if (r1 != 0) goto L69
            int r1 = r4.f81k
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.f84w
            if (r1 > r2) goto L69
            int r1 = r4.f80g
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = r0
            goto L6f
        L69:
            r4.f81k = r5
            r4.f80g = r6
            r4.f79U = r0
        L6f:
            if (r3 == 0) goto L74
            m27h(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ViewOnLongClickListenerC0007A7.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f81k = view.getWidth() / 2;
        this.f80g = view.getHeight() / 2;
        m28v(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m29z();
    }

    /* renamed from: v */
    public final void m28v(boolean z) {
        boolean z2;
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        boolean z3;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        View view = this.f78S;
        if (!AbstractC1285Y3.m2633h(view)) {
            return;
        }
        m27h(null);
        ViewOnLongClickListenerC0007A7 viewOnLongClickListenerC0007A7 = f75f;
        if (viewOnLongClickListenerC0007A7 != null) {
            viewOnLongClickListenerC0007A7.m29z();
        }
        f75f = this;
        this.f83s = z;
        C1774hM c1774hM = new C1774hM(view.getContext());
        this.f85y = c1774hM;
        int i4 = this.f81k;
        int i5 = this.f80g;
        boolean z4 = this.f83s;
        if (((View) c1774hM.f5591h).getParent() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (((View) c1774hM.f5591h).getParent() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                ((WindowManager) ((Context) c1774hM.f5594z).getSystemService("window")).removeView((View) c1774hM.f5591h);
            }
        }
        ((TextView) c1774hM.f5593v).setText(this.f77R);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c1774hM.f5589P;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = ((Context) c1774hM.f5594z).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = ((Context) c1774hM.f5594z).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i5 + dimensionPixelOffset2;
            i = i5 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = ((Context) c1774hM.f5594z).getResources();
        if (z4) {
            i2 = R.dimen.tooltip_y_offset_touch;
        } else {
            i2 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame((Rect) c1774hM.f5588N);
            Rect rect = (Rect) c1774hM.f5588N;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = ((Context) c1774hM.f5594z).getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i3 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i3 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                ((Rect) c1774hM.f5588N).set(0, i3, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen((int[]) c1774hM.f5592u);
            view.getLocationOnScreen((int[]) c1774hM.f5590Q);
            int[] iArr = (int[]) c1774hM.f5590Q;
            int i6 = iArr[0];
            int[] iArr2 = (int[]) c1774hM.f5592u;
            int i7 = i6 - iArr2[0];
            iArr[0] = i7;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i7 + i4) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ((View) c1774hM.f5591h).measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = ((View) c1774hM.f5591h).getMeasuredHeight();
            int i8 = ((int[]) c1774hM.f5590Q)[1];
            int i9 = ((i + i8) - dimensionPixelOffset3) - measuredHeight;
            int i10 = i8 + height + dimensionPixelOffset3;
            if (!z4 ? measuredHeight + i10 <= ((Rect) c1774hM.f5588N).height() : i9 < 0) {
                layoutParams.y = i10;
            } else {
                layoutParams.y = i9;
            }
        }
        ((WindowManager) ((Context) c1774hM.f5594z).getSystemService("window")).addView((View) c1774hM.f5591h, (WindowManager.LayoutParams) c1774hM.f5589P);
        view.addOnAttachStateChangeListener(this);
        if (this.f83s) {
            j2 = 2500;
        } else {
            if ((AbstractC2397t8.m4128u(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        RunnableC2376sh runnableC2376sh = this.f82q;
        view.removeCallbacks(runnableC2376sh);
        view.postDelayed(runnableC2376sh, j2);
    }

    /* renamed from: z */
    public final void m29z() {
        boolean z;
        ViewOnLongClickListenerC0007A7 viewOnLongClickListenerC0007A7 = f75f;
        View view = this.f78S;
        if (viewOnLongClickListenerC0007A7 == this) {
            f75f = null;
            C1774hM c1774hM = this.f85y;
            if (c1774hM != null) {
                if (((View) c1774hM.f5591h).getParent() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((WindowManager) ((Context) c1774hM.f5594z).getSystemService("window")).removeView((View) c1774hM.f5591h);
                }
                this.f85y = null;
                this.f79U = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f74E == this) {
            m27h(null);
        }
        view.removeCallbacks(this.f82q);
    }
}
