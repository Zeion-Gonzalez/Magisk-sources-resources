package p000a;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: a.vN */
/* loaded from: classes.dex */
public final class C2518vN implements AdapterView.OnItemSelectedListener {

    /* renamed from: h */
    public final /* synthetic */ Object f7711h;

    /* renamed from: z */
    public final /* synthetic */ int f7712z;

    public /* synthetic */ C2518vN(int i, Object obj) {
        this.f7712z = i;
        this.f7711h = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C2409tO c2409tO;
        int i2 = this.f7712z;
        Object obj = this.f7711h;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (i != -1 && (c2409tO = ((C0660MU) obj).f2145w) != null) {
                    c2409tO.f7365y = false;
                    return;
                }
                return;
            default:
                ((SearchView) obj).f8790H.getText();
                throw null;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
