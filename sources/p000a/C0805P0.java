package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;

/* renamed from: a.P0 */
/* loaded from: classes.dex */
public final class C0805P0 extends AbstractC0231EP implements InterfaceC2030mD {

    /* renamed from: h */
    public final int f2743h;

    /* renamed from: v */
    public final InterfaceC2364sT f2744v;

    /* renamed from: z */
    public final AbstractC2222pt f2745z;

    public C0805P0(int i) {
        this(new C0639M1(i), -1, C0741Nu.f2542q);
    }

    @Override // p000a.InterfaceC2030mD
    /* renamed from: h */
    public final void mo557h(AbstractActivityC0819PG abstractActivityC0819PG) {
        ViewGroup viewGroup;
        boolean z;
        int i;
        ViewOnAttachStateChangeListenerC0215E5 viewOnAttachStateChangeListenerC0215E5;
        boolean z2;
        CharSequence mo1433z = this.f2745z.mo1433z(abstractActivityC0819PG.getResources());
        int i2 = this.f2743h;
        InterfaceC2364sT interfaceC2364sT = this.f2744v;
        View mo1921U = abstractActivityC0819PG.mo1921U();
        int[] iArr = C0485J8.f1629e;
        ViewGroup viewGroup2 = null;
        while (!(mo1921U instanceof CoordinatorLayout)) {
            if (mo1921U instanceof FrameLayout) {
                if (mo1921U.getId() == 16908290) {
                    break;
                } else {
                    viewGroup2 = (ViewGroup) mo1921U;
                }
            }
            if (mo1921U != null) {
                ViewParent parent = mo1921U.getParent();
                if (parent instanceof View) {
                    mo1921U = (View) parent;
                } else {
                    mo1921U = null;
                }
            }
            if (mo1921U == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        viewGroup = (ViewGroup) mo1921U;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0485J8.f1629e);
            boolean z3 = false;
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1 && resourceId2 != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = R.layout.mtrl_layout_snackbar_include;
            } else {
                i = R.layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i, viewGroup, false);
            C0485J8 c0485j8 = new C0485J8(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) c0485j8.f8402W.getChildAt(0)).f9429S.setText(mo1433z);
            c0485j8.f8394M = i2;
            View mo1925s = abstractActivityC0819PG.mo1925s();
            ViewOnAttachStateChangeListenerC0215E5 viewOnAttachStateChangeListenerC0215E52 = c0485j8.f8401V;
            if (viewOnAttachStateChangeListenerC0215E52 != null) {
                viewOnAttachStateChangeListenerC0215E52.m420z();
            }
            if (mo1925s == null) {
                viewOnAttachStateChangeListenerC0215E5 = null;
            } else {
                viewOnAttachStateChangeListenerC0215E5 = new ViewOnAttachStateChangeListenerC0215E5(c0485j8, mo1925s);
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                if (AbstractC1285Y3.m2633h(mo1925s)) {
                    mo1925s.getViewTreeObserver().addOnGlobalLayoutListener(viewOnAttachStateChangeListenerC0215E5);
                }
                mo1925s.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0215E5);
            }
            c0485j8.f8401V = viewOnAttachStateChangeListenerC0215E5;
            interfaceC2364sT.mo85W(c0485j8);
            C2671yR m4574h = C2671yR.m4574h();
            int i3 = c0485j8.f8394M;
            int i4 = -2;
            if (i3 != -2) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i3 = c0485j8.f1630H.getRecommendedTimeoutMillis(i3, 3);
                }
                i4 = i3;
            }
            C0506JZ c0506jz = c0485j8.f8400U;
            synchronized (m4574h.f8322z) {
                if (m4574h.m4579v(c0506jz)) {
                    C1848im c1848im = m4574h.f8321v;
                    c1848im.f5770h = i4;
                    m4574h.f8320h.removeCallbacksAndMessages(c1848im);
                    m4574h.m4577Q(m4574h.f8321v);
                } else {
                    C1848im c1848im2 = m4574h.f8319P;
                    if (c1848im2 != null) {
                        if (c0506jz != null && c1848im2.f5772z.get() == c0506jz) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        m4574h.f8319P.f5770h = i4;
                    } else {
                        m4574h.f8319P = new C1848im(i4, c0506jz);
                    }
                    C1848im c1848im3 = m4574h.f8321v;
                    if (c1848im3 == null || !m4574h.m4580z(c1848im3, 4)) {
                        m4574h.f8321v = null;
                        m4574h.m4578u();
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public /* synthetic */ C0805P0(C2049mc c2049mc) {
        this(c2049mc, -1, C0741Nu.f2524I);
    }

    public C0805P0(AbstractC2222pt abstractC2222pt, int i, InterfaceC2364sT interfaceC2364sT) {
        this.f2745z = abstractC2222pt;
        this.f2743h = i;
        this.f2744v = interfaceC2364sT;
    }

    public C0805P0(String str) {
        this(new C1961ku(str), -1, C0741Nu.f2539k);
    }
}
