package p000a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;

/* renamed from: a.JT */
/* loaded from: classes.dex */
public final class C0501JT extends AbstractC0769OL implements InterfaceC1163Vm, InterfaceC0645M7, InterfaceC1631eg {

    /* renamed from: R */
    public int f1673R = -1;

    /* renamed from: S */
    public final String f1674S;

    public C0501JT(String str) {
        this.f1674S = str;
    }

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public final int mo553G() {
        return R.layout.item_console_md2;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: N */
    public final boolean mo555N(InterfaceC0645M7 interfaceC0645M7) {
        return AbstractC0795Op.m1875x(this, (C0501JT) interfaceC0645M7);
    }

    @Override // p000a.InterfaceC1163Vm
    /* renamed from: W */
    public final void mo1192W(AbstractC2760z abstractC2760z, RecyclerView recyclerView) {
        if (this.f1673R < 0) {
            this.f1673R = ((View) recyclerView.getParent()).getWidth();
        }
        TextView textView = (TextView) abstractC2760z.f8982k;
        textView.measure(0, 0);
        int max = Math.max(textView.getMeasuredWidth(), this.f1673R);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = max;
        textView.setLayoutParams(layoutParams);
        if (recyclerView.getWidth() < max) {
            recyclerView.requestLayout();
        }
    }

    @Override // p000a.InterfaceC1631eg
    public final Object getItem() {
        return this.f1674S;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo556h(InterfaceC0645M7 interfaceC0645M7) {
        C0501JT c0501jt = (C0501JT) interfaceC0645M7;
        return true;
    }
}
