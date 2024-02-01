package p000a;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: a.Ks */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0580Ks implements View.OnClickListener {

    /* renamed from: R */
    public final Object f1882R;

    /* renamed from: S */
    public final /* synthetic */ int f1883S = 1;

    /* renamed from: w */
    public final /* synthetic */ Object f1884w;

    public ViewOnClickListenerC0580Ks(C2444u1 c2444u1) {
        this.f1884w = c2444u1;
        this.f1882R = new C1959kr(c2444u1.f7482z.getContext(), c2444u1.f7478o);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1883S;
        Object obj = this.f1882R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((AbstractC0336GR) obj).mo745z();
                return;
            default:
                C2444u1 c2444u1 = (C2444u1) this.f1884w;
                Window.Callback callback = c2444u1.f7469M;
                if (callback != null && c2444u1.f7475V) {
                    callback.onMenuItemSelected(0, (C1959kr) obj);
                    return;
                }
                return;
        }
    }

    public ViewOnClickListenerC0580Ks(ActionBarContextView actionBarContextView, AbstractC0336GR abstractC0336GR) {
        this.f1884w = actionBarContextView;
        this.f1882R = abstractC0336GR;
    }
}
