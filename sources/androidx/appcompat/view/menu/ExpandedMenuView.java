package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000a.C1117Uu;
import p000a.C2189pE;
import p000a.C2709z9;
import p000a.InterfaceC0108C6;
import p000a.InterfaceC0949Rq;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0949Rq, InterfaceC0108C6, AdapterView.OnItemClickListener {

    /* renamed from: R */
    public static final int[] f8681R = {16842964, 16843049};

    /* renamed from: S */
    public C2189pE f8682S;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C2709z9 c2709z9 = new C2709z9(context, context.obtainStyledAttributes(attributeSet, f8681R, 16842868, 0));
        if (c2709z9.m4645V(0)) {
            setBackgroundDrawable(c2709z9.m4642N(0));
        }
        if (c2709z9.m4645V(1)) {
            setDivider(c2709z9.m4642N(1));
        }
        c2709z9.m4651w();
    }

    @Override // p000a.InterfaceC0108C6
    /* renamed from: N */
    public final void mo232N(C2189pE c2189pE) {
        this.f8682S = c2189pE;
    }

    @Override // p000a.InterfaceC0949Rq
    /* renamed from: Q */
    public final boolean mo2112Q(C1117Uu c1117Uu) {
        return this.f8682S.m3801q(c1117Uu, null, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo2112Q((C1117Uu) getAdapter().getItem(i));
    }
}
