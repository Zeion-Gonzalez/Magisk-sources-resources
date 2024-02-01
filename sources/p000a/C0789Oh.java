package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.topjohnwu.magisk.R;

/* renamed from: a.Oh */
/* loaded from: classes.dex */
public final class C0789Oh {

    /* renamed from: E */
    public final HandlerC1384Zv f2656E;

    /* renamed from: I */
    public ListAdapter f2658I;

    /* renamed from: M */
    public Drawable f2659M;

    /* renamed from: N */
    public AlertController$RecycleListView f2660N;

    /* renamed from: P */
    public CharSequence f2661P;

    /* renamed from: Q */
    public Button f2662Q;

    /* renamed from: R */
    public TextView f2663R;

    /* renamed from: S */
    public TextView f2664S;

    /* renamed from: U */
    public final boolean f2665U;

    /* renamed from: V */
    public ImageView f2666V;

    /* renamed from: W */
    public NestedScrollView f2667W;

    /* renamed from: g */
    public final int f2669g;

    /* renamed from: h */
    public final AbstractDialogC2733zb f2670h;

    /* renamed from: k */
    public final int f2671k;

    /* renamed from: o */
    public Button f2672o;

    /* renamed from: s */
    public final int f2674s;

    /* renamed from: u */
    public Button f2675u;

    /* renamed from: v */
    public final Window f2676v;

    /* renamed from: w */
    public View f2677w;

    /* renamed from: y */
    public final int f2678y;

    /* renamed from: z */
    public final Context f2679z;

    /* renamed from: G */
    public int f2657G = 0;

    /* renamed from: q */
    public int f2673q = -1;

    /* renamed from: f */
    public final ViewOnClickListenerC2660yB f2668f = new ViewOnClickListenerC2660yB(0, this);

    public C0789Oh(Context context, AbstractDialogC2733zb abstractDialogC2733zb, Window window) {
        this.f2679z = context;
        this.f2670h = abstractDialogC2733zb;
        this.f2676v = window;
        this.f2656E = new HandlerC1384Zv(abstractDialogC2733zb);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0483J5.f1604N, R.attr.alertDialogStyle, 0);
        this.f2671k = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2669g = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2678y = obtainStyledAttributes.getResourceId(7, 0);
        this.f2674s = obtainStyledAttributes.getResourceId(3, 0);
        this.f2665U = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        abstractDialogC2733zb.m4660u().mo2790M(1);
    }

    /* renamed from: z */
    public static ViewGroup m1796z(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
