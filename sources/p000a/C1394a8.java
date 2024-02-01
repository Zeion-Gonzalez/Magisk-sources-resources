package p000a;

import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* renamed from: a.a8 */
/* loaded from: classes.dex */
public final class C1394a8 implements InterfaceC2662yD {

    /* renamed from: h */
    public final /* synthetic */ LayoutInflaterFactory2C1392a6 f4393h;

    /* renamed from: z */
    public final InterfaceC2662yD f4394z;

    public C1394a8(LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6, C0525Ju c0525Ju) {
        this.f4393h = layoutInflaterFactory2C1392a6;
        this.f4394z = c0525Ju;
    }

    @Override // p000a.InterfaceC2662yD
    /* renamed from: P */
    public final boolean mo1225P(AbstractC0336GR abstractC0336GR, C2189pE c2189pE) {
        return this.f4394z.mo1225P(abstractC0336GR, c2189pE);
    }

    @Override // p000a.InterfaceC2662yD
    /* renamed from: h */
    public final void mo1232h(AbstractC0336GR abstractC0336GR) {
        this.f4394z.mo1232h(abstractC0336GR);
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = this.f4393h;
        if (layoutInflaterFactory2C1392a6.f4380p != null) {
            layoutInflaterFactory2C1392a6.f4368f.getDecorView().removeCallbacks(layoutInflaterFactory2C1392a6.f4371j);
        }
        if (layoutInflaterFactory2C1392a6.f4340C != null) {
            C0831PV c0831pv = layoutInflaterFactory2C1392a6.f4350L;
            if (c0831pv != null) {
                c0831pv.m1935h();
            }
            C0831PV m4227z = AbstractC2446u3.m4227z(layoutInflaterFactory2C1392a6.f4340C);
            m4227z.m1937z(0.0f);
            layoutInflaterFactory2C1392a6.f4350L = m4227z;
            m4227z.m1934P(new C1521cg(2, this));
        }
        InterfaceC1032TM interfaceC1032TM = layoutInflaterFactory2C1392a6.f4359Y;
        if (interfaceC1032TM != null) {
            interfaceC1032TM.mo1200Q();
        }
        layoutInflaterFactory2C1392a6.f4361Z = null;
        ViewGroup viewGroup = layoutInflaterFactory2C1392a6.f4365d;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC1589dw.m3064v(viewGroup);
        layoutInflaterFactory2C1392a6.m2803i();
    }

    @Override // p000a.InterfaceC2662yD
    /* renamed from: v */
    public final boolean mo1238v(AbstractC0336GR abstractC0336GR, MenuItem menuItem) {
        return this.f4394z.mo1238v(abstractC0336GR, menuItem);
    }

    @Override // p000a.InterfaceC2662yD
    /* renamed from: z */
    public final boolean mo1241z(AbstractC0336GR abstractC0336GR, C2189pE c2189pE) {
        ViewGroup viewGroup = this.f4393h.f4365d;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC1589dw.m3064v(viewGroup);
        return this.f4394z.mo1241z(abstractC0336GR, c2189pE);
    }
}
