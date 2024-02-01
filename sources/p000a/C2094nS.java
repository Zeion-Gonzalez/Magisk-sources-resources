package p000a;

import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: a.nS */
/* loaded from: classes.dex */
public final class C2094nS extends AbstractC1292YB {

    /* renamed from: R */
    public final /* synthetic */ int f6463R;

    /* renamed from: w */
    public final /* synthetic */ C2285r2 f6464w;

    public /* synthetic */ C2094nS(C2285r2 c2285r2, int i) {
        this.f6463R = i;
        this.f6464w = c2285r2;
    }

    @Override // p000a.InterfaceC0579Kq
    /* renamed from: z */
    public final void mo1311z() {
        View view;
        int i = this.f6463R;
        C2285r2 c2285r2 = this.f6464w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (c2285r2.f7045I && (view = c2285r2.f7059o) != null) {
                    view.setTranslationY(0.0f);
                    c2285r2.f7047N.setTranslationY(0.0f);
                }
                c2285r2.f7047N.setVisibility(8);
                ActionBarContainer actionBarContainer = c2285r2.f7047N;
                actionBarContainer.f8702S = false;
                actionBarContainer.setDescendantFocusability(262144);
                c2285r2.f7066y = null;
                InterfaceC2662yD interfaceC2662yD = c2285r2.f7053V;
                if (interfaceC2662yD != null) {
                    interfaceC2662yD.mo1232h(c2285r2.f7046M);
                    c2285r2.f7046M = null;
                    c2285r2.f7053V = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c2285r2.f7048P;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC1589dw.m3064v(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                c2285r2.f7066y = null;
                c2285r2.f7047N.requestLayout();
                return;
        }
    }
}
