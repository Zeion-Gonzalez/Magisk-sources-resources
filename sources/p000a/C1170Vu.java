package p000a;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: a.Vu */
/* loaded from: classes.dex */
public final class C1170Vu implements AdapterView.OnItemClickListener {

    /* renamed from: S */
    public final /* synthetic */ C1691fn f3822S;

    public C1170Vu(C1691fn c1691fn) {
        this.f3822S = c1691fn;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int selectedItemPosition;
        View view2 = null;
        C1691fn c1691fn = this.f3822S;
        if (i < 0) {
            C0660MU c0660mu = c1691fn.f5302q;
            if (!c0660mu.mo399h()) {
                item = null;
            } else {
                item = c0660mu.f2145w.getSelectedItem();
            }
        } else {
            item = c1691fn.getAdapter().getItem(i);
        }
        C1691fn.m3193z(c1691fn, item);
        AdapterView.OnItemClickListener onItemClickListener = c1691fn.getOnItemClickListener();
        C0660MU c0660mu2 = c1691fn.f5302q;
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                if (c0660mu2.mo399h()) {
                    view2 = c0660mu2.f2145w.getSelectedView();
                }
                view = view2;
                if (!c0660mu2.mo399h()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c0660mu2.f2145w.getSelectedItemPosition();
                }
                i = selectedItemPosition;
                if (!c0660mu2.mo399h()) {
                    j = Long.MIN_VALUE;
                } else {
                    j = c0660mu2.f2145w.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(c0660mu2.f2145w, view, i, j);
        }
        c0660mu2.dismiss();
    }
}
