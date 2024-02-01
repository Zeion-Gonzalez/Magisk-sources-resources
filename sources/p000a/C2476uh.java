package p000a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: a.uh */
/* loaded from: classes.dex */
public final class C2476uh extends BaseAdapter {

    /* renamed from: N */
    public final LayoutInflater f7581N;

    /* renamed from: P */
    public final boolean f7582P;

    /* renamed from: Q */
    public final int f7583Q;

    /* renamed from: h */
    public int f7584h = -1;

    /* renamed from: v */
    public boolean f7585v;

    /* renamed from: z */
    public final C2189pE f7586z;

    public C2476uh(C2189pE c2189pE, LayoutInflater layoutInflater, boolean z, int i) {
        this.f7582P = z;
        this.f7581N = layoutInflater;
        this.f7586z = c2189pE;
        this.f7583Q = i;
        m4251z();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList m3795V;
        boolean z = this.f7582P;
        C2189pE c2189pE = this.f7586z;
        if (z) {
            c2189pE.m3796W();
            m3795V = c2189pE.f6702G;
        } else {
            m3795V = c2189pE.m3795V();
        }
        int i = this.f7584h;
        int size = m3795V.size();
        if (i < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        int i3 = 0;
        if (view == null) {
            view = this.f7581N.inflate(this.f7583Q, viewGroup, false);
        }
        int i4 = getItem(i).f3643h;
        int i5 = i - 1;
        if (i5 >= 0) {
            i2 = getItem(i5).f3643h;
        } else {
            i2 = i4;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f7586z.mo2456S() && i4 != i2) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = listMenuItemView.f8699y;
        if (imageView != null) {
            if (listMenuItemView.f8690c || !z) {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
        InterfaceC0157D3 interfaceC0157D3 = (InterfaceC0157D3) view;
        if (this.f7585v) {
            listMenuItemView.f8691e = true;
            listMenuItemView.f8696r = true;
        }
        interfaceC0157D3.mo131z(getItem(i));
        return view;
    }

    @Override // android.widget.Adapter
    /* renamed from: h */
    public final C1117Uu getItem(int i) {
        ArrayList m3795V;
        boolean z = this.f7582P;
        C2189pE c2189pE = this.f7586z;
        if (z) {
            c2189pE.m3796W();
            m3795V = c2189pE.f6702G;
        } else {
            m3795V = c2189pE.m3795V();
        }
        int i2 = this.f7584h;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1117Uu) m3795V.get(i);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4251z();
        super.notifyDataSetChanged();
    }

    /* renamed from: z */
    public final void m4251z() {
        C2189pE c2189pE = this.f7586z;
        C1117Uu c1117Uu = c2189pE.f6710U;
        if (c1117Uu != null) {
            c2189pE.m3796W();
            ArrayList arrayList = c2189pE.f6702G;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1117Uu) arrayList.get(i)) == c1117Uu) {
                    this.f7584h = i;
                    return;
                }
            }
        }
        this.f7584h = -1;
    }
}
