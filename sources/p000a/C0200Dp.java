package p000a;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: a.Dp */
/* loaded from: classes.dex */
public final class C0200Dp implements AdapterView.OnItemClickListener {

    /* renamed from: R */
    public final /* synthetic */ Object f604R;

    /* renamed from: S */
    public final /* synthetic */ int f605S;

    /* renamed from: w */
    public final /* synthetic */ Object f606w;

    public /* synthetic */ C0200Dp(Object obj, int i, Object obj2) {
        this.f605S = i;
        this.f606w = obj;
        this.f604R = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.f605S;
        Object obj = this.f606w;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1319Yj c1319Yj = (C1319Yj) obj;
                DialogInterface.OnClickListener onClickListener = c1319Yj.f4187o;
                C0789Oh c0789Oh = (C0789Oh) this.f604R;
                onClickListener.onClick(c0789Oh.f2670h, i);
                if (!c1319Yj.f4185W) {
                    c0789Oh.f2670h.dismiss();
                    return;
                }
                return;
            default:
                C2178p2 c2178p2 = (C2178p2) obj;
                c2178p2.f6672K.setSelection(i);
                C2184p9 c2184p9 = c2178p2.f6672K;
                if (c2184p9.getOnItemClickListener() != null) {
                    c2184p9.performItemClick(view, i, c2178p2.f6673T.getItemId(i));
                }
                c2178p2.dismiss();
                return;
        }
    }
}
