package p000a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;

/* renamed from: a.OI */
/* loaded from: classes.dex */
public class C0766OI {

    /* renamed from: G */
    public AbstractC1153Va f2605G;

    /* renamed from: M */
    public PopupWindow.OnDismissListener f2606M;

    /* renamed from: N */
    public final int f2607N;

    /* renamed from: P */
    public final int f2608P;

    /* renamed from: Q */
    public View f2609Q;

    /* renamed from: V */
    public final C1666fL f2610V;

    /* renamed from: W */
    public InterfaceC0656MP f2611W;

    /* renamed from: h */
    public final C2189pE f2612h;

    /* renamed from: o */
    public boolean f2613o;

    /* renamed from: u */
    public int f2614u;

    /* renamed from: v */
    public final boolean f2615v;

    /* renamed from: z */
    public final Context f2616z;

    public C0766OI(int i, int i2, Context context, View view, C2189pE c2189pE, boolean z) {
        this.f2614u = 8388611;
        this.f2610V = new C1666fL(this);
        this.f2616z = context;
        this.f2612h = c2189pE;
        this.f2609Q = view;
        this.f2615v = z;
        this.f2608P = i;
        this.f2607N = i2;
    }

    /* renamed from: P */
    public final void m1772P(int i, int i2, boolean z, boolean z2) {
        AbstractC1153Va m1774z = m1774z();
        m1774z.mo397U(z2);
        if (z) {
            int i3 = this.f2614u;
            View view = this.f2609Q;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if ((Gravity.getAbsoluteGravity(i3, AbstractC0095Bq.m199P(view)) & 7) == 5) {
                i -= this.f2609Q.getWidth();
            }
            m1774z.mo405y(i);
            m1774z.mo394E(i2);
            int i4 = (int) ((this.f2616z.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m1774z.f3744S = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        m1774z.mo396Q();
    }

    /* renamed from: h */
    public final boolean m1773h() {
        AbstractC1153Va abstractC1153Va = this.f2605G;
        return abstractC1153Va != null && abstractC1153Va.mo399h();
    }

    /* renamed from: v */
    public void mo577v() {
        this.f2605G = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2606M;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: z */
    public final AbstractC1153Va m1774z() {
        boolean z;
        AbstractC1153Va viewOnKeyListenerC2229q1;
        if (this.f2605G == null) {
            Context context = this.f2616z;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC2263qb.m3901z(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                viewOnKeyListenerC2229q1 = new ViewOnKeyListenerC0205Dw(this.f2616z, this.f2609Q, this.f2608P, this.f2607N, this.f2615v);
            } else {
                Context context2 = this.f2616z;
                C2189pE c2189pE = this.f2612h;
                viewOnKeyListenerC2229q1 = new ViewOnKeyListenerC2229q1(this.f2608P, this.f2607N, context2, this.f2609Q, c2189pE, this.f2615v);
            }
            viewOnKeyListenerC2229q1.mo404w(this.f2612h);
            viewOnKeyListenerC2229q1.mo403s(this.f2610V);
            viewOnKeyListenerC2229q1.mo401q(this.f2609Q);
            viewOnKeyListenerC2229q1.mo223W(this.f2611W);
            viewOnKeyListenerC2229q1.mo400k(this.f2613o);
            viewOnKeyListenerC2229q1.mo398g(this.f2614u);
            this.f2605G = viewOnKeyListenerC2229q1;
        }
        return this.f2605G;
    }

    public C0766OI(Context context, C2189pE c2189pE, View view, boolean z) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, c2189pE, z);
    }
}
