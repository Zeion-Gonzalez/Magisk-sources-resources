package p000a;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: a.PD */
/* loaded from: classes.dex */
public final class C0817PD implements InterfaceC1811i6 {

    /* renamed from: S */
    public final /* synthetic */ Toolbar f2778S;

    public /* synthetic */ C0817PD(Toolbar toolbar) {
        this.f2778S = toolbar;
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: N */
    public final boolean mo81N(C2189pE c2189pE, MenuItem menuItem) {
        InterfaceC1811i6 interfaceC1811i6 = this.f2778S.f8851nF;
        return interfaceC1811i6 != null && interfaceC1811i6.mo81N(c2189pE, menuItem);
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: W */
    public final void mo82W(C2189pE c2189pE) {
        boolean z;
        Toolbar toolbar = this.f2778S;
        C2192pI c2192pI = toolbar.f8832S.f8767p;
        if (c2192pI != null && c2192pI.m3806M()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f8848m.f3830w).iterator();
            while (it.hasNext()) {
                ((InterfaceC1503cL) it.next()).mo2520P(c2189pE);
            }
        }
        InterfaceC1811i6 interfaceC1811i6 = toolbar.f8851nF;
        if (interfaceC1811i6 != null) {
            interfaceC1811i6.mo82W(c2189pE);
        }
    }
}
