package p000a;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: a.p3 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2179p3 implements View.OnApplyWindowInsetsListener {

    /* renamed from: h */
    public final /* synthetic */ View f6676h;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC0910R9 f6677v;

    /* renamed from: z */
    public C2621xJ f6678z = null;

    public ViewOnApplyWindowInsetsListenerC2179p3(View view, InterfaceC0910R9 interfaceC0910R9) {
        this.f6676h = view;
        this.f6677v = interfaceC0910R9;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C2621xJ m4514o = C2621xJ.m4514o(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0910R9 interfaceC0910R9 = this.f6677v;
        if (i < 30) {
            AbstractC1548d9.m3019z(windowInsets, this.f6676h);
            if (m4514o.equals(this.f6678z)) {
                return interfaceC0910R9.mo47P(view, m4514o).m4518u();
            }
        }
        this.f6678z = m4514o;
        C2621xJ mo47P = interfaceC0910R9.mo47P(view, m4514o);
        if (i >= 30) {
            return mo47P.m4518u();
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC1589dw.m3064v(view);
        return mo47P.m4518u();
    }
}
