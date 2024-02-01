package p000a;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: a.Va */
/* loaded from: classes.dex */
public abstract class AbstractC1153Va implements InterfaceC2298rH, InterfaceC2687yj, AdapterView.OnItemClickListener {

    /* renamed from: S */
    public Rect f3744S;

    /* renamed from: I */
    public static int m2364I(C2476uh c2476uh, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c2476uh.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c2476uh.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c2476uh.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: f */
    public static boolean m2365f(C2189pE c2189pE) {
        int size = c2189pE.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c2189pE.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public abstract void mo394E(int i);

    @Override // p000a.InterfaceC2687yj
    /* renamed from: G */
    public final void mo217G(Context context, C2189pE c2189pE) {
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: R */
    public final boolean mo220R(C1117Uu c1117Uu) {
        return false;
    }

    /* renamed from: U */
    public abstract void mo397U(boolean z);

    @Override // p000a.InterfaceC2687yj
    /* renamed from: V */
    public final boolean mo222V(C1117Uu c1117Uu) {
        return false;
    }

    /* renamed from: g */
    public abstract void mo398g(int i);

    /* renamed from: k */
    public abstract void mo400k(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2476uh c2476uh;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c2476uh = (C2476uh) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c2476uh = (C2476uh) listAdapter;
        }
        C2189pE c2189pE = c2476uh.f7586z;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if ((!(this instanceof ViewOnKeyListenerC0205Dw)) != false) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        c2189pE.m3801q(menuItem, this, i2);
    }

    /* renamed from: q */
    public abstract void mo401q(View view);

    /* renamed from: s */
    public abstract void mo403s(PopupWindow.OnDismissListener onDismissListener);

    @Override // p000a.InterfaceC2687yj
    /* renamed from: v */
    public final int mo226v() {
        return 0;
    }

    /* renamed from: w */
    public abstract void mo404w(C2189pE c2189pE);

    /* renamed from: y */
    public abstract void mo405y(int i);
}
