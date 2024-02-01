package p000a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: a.F2 */
/* loaded from: classes.dex */
public final class C0263F2 extends C2409tO {

    /* renamed from: H */
    public C1117Uu f930H;

    /* renamed from: J */
    public final int f931J;

    /* renamed from: c */
    public InterfaceC2481um f932c;

    /* renamed from: r */
    public final int f933r;

    public C0263F2(Context context, boolean z) {
        super(context, z);
        if (1 == AbstractC0193Di.m379z(context.getResources().getConfiguration())) {
            this.f933r = 21;
            this.f931J = 22;
        } else {
            this.f933r = 22;
            this.f931J = 21;
        }
    }

    @Override // p000a.C2409tO, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C2476uh c2476uh;
        int i;
        C1117Uu c1117Uu;
        int pointToPosition;
        int i2;
        if (this.f932c != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c2476uh = (C2476uh) headerViewListAdapter.getWrappedAdapter();
            } else {
                c2476uh = (C2476uh) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c2476uh.getCount()) {
                c1117Uu = c2476uh.getItem(i2);
            } else {
                c1117Uu = null;
            }
            C1117Uu c1117Uu2 = this.f930H;
            if (c1117Uu2 != c1117Uu) {
                C2189pE c2189pE = c2476uh.f7586z;
                if (c1117Uu2 != null) {
                    this.f932c.mo1606V(c2189pE, c1117Uu2);
                }
                this.f930H = c1117Uu;
                if (c1117Uu != null) {
                    this.f932c.mo1607o(c2189pE, c1117Uu);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f933r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.f8688S.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i == this.f931J) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C2476uh) adapter).f7586z.m3804v(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
