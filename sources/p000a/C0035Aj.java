package p000a;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: a.Aj */
/* loaded from: classes.dex */
public class C0035Aj implements InterfaceC1811i6 {

    /* renamed from: R */
    public final /* synthetic */ View f175R;

    /* renamed from: S */
    public final /* synthetic */ int f176S;

    public /* synthetic */ C0035Aj(View view, int i) {
        this.f176S = i;
        this.f175R = view;
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: N */
    public final boolean mo81N(C2189pE c2189pE, MenuItem menuItem) {
        boolean z;
        View view = this.f175R;
        if (((ActionMenuView) view).f8768x == null) {
            return false;
        }
        Toolbar toolbar = ((ActionMenuView) view).f8768x.f2778S;
        if (toolbar.f8848m.m2400q(menuItem)) {
            z = true;
        } else {
            C2236q9 c2236q9 = toolbar.f8838b;
            if (c2236q9 != null) {
                z = c2236q9.f6893S.f6227v.onMenuItemSelected(0, menuItem);
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: W */
    public final void mo82W(C2189pE c2189pE) {
        InterfaceC1811i6 interfaceC1811i6 = ((ActionMenuView) this.f175R).f8760L;
        if (interfaceC1811i6 != null) {
            interfaceC1811i6.mo82W(c2189pE);
        }
    }

    /* renamed from: h */
    public void mo83h(int i) {
    }

    /* renamed from: z */
    public void mo84z(int i) {
    }
}
