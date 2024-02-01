package p000a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;

/* renamed from: a.cv */
/* loaded from: classes.dex */
public final class C1533cv extends BaseAdapter {

    /* renamed from: h */
    public final /* synthetic */ C0104C2 f4733h;

    /* renamed from: z */
    public int f4734z = -1;

    public C1533cv(C0104C2 c0104c2) {
        this.f4733h = c0104c2;
        m2975z();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0104C2 c0104c2 = this.f4733h;
        C2189pE c2189pE = c0104c2.f394w;
        c2189pE.m3796W();
        int size = c2189pE.f6702G.size();
        c0104c2.getClass();
        int i = size + 0;
        if (this.f4734z < 0) {
            return i;
        }
        return i - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4733h.f390R.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0157D3) view).mo131z(getItem(i));
        return view;
    }

    @Override // android.widget.Adapter
    /* renamed from: h */
    public final C1117Uu getItem(int i) {
        C0104C2 c0104c2 = this.f4733h;
        C2189pE c2189pE = c0104c2.f394w;
        c2189pE.m3796W();
        ArrayList arrayList = c2189pE.f6702G;
        c0104c2.getClass();
        int i2 = i + 0;
        int i3 = this.f4734z;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C1117Uu) arrayList.get(i2);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2975z();
        super.notifyDataSetChanged();
    }

    /* renamed from: z */
    public final void m2975z() {
        C2189pE c2189pE = this.f4733h.f394w;
        C1117Uu c1117Uu = c2189pE.f6710U;
        if (c1117Uu != null) {
            c2189pE.m3796W();
            ArrayList arrayList = c2189pE.f6702G;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1117Uu) arrayList.get(i)) == c1117Uu) {
                    this.f4734z = i;
                    return;
                }
            }
        }
        this.f4734z = -1;
    }
}
