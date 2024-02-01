package p000a;

import androidx.databinding.AbstractC2760z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.k7 */
/* loaded from: classes.dex */
public final class C1921k7 extends AbstractC2467uU implements InterfaceC0645M7, InterfaceC1631eg, InterfaceC1163Vm {

    /* renamed from: R */
    public final String f5983R;

    public C1921k7(String str) {
        this.f5983R = str;
    }

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public final int mo553G() {
        return R.layout.item_log_textview;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: N */
    public final boolean mo555N(InterfaceC0645M7 interfaceC0645M7) {
        return AbstractC0795Op.m1875x(this, (C1921k7) interfaceC0645M7);
    }

    @Override // p000a.InterfaceC1163Vm
    /* renamed from: W */
    public final void mo1192W(AbstractC2760z abstractC2760z, RecyclerView recyclerView) {
        MaterialTextView materialTextView = (MaterialTextView) abstractC2760z.f8982k;
        materialTextView.measure(0, 0);
        int measuredWidth = materialTextView.getMeasuredWidth();
        materialTextView.getLayoutParams().width = measuredWidth;
        if (recyclerView.getWidth() < measuredWidth) {
            recyclerView.requestLayout();
        }
    }

    @Override // p000a.InterfaceC1631eg
    public final Object getItem() {
        return this.f5983R;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo556h(InterfaceC0645M7 interfaceC0645M7) {
        C1921k7 c1921k7 = (C1921k7) interfaceC0645M7;
        return true;
    }
}
