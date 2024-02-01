package androidx.lifecycle;

import p000a.AbstractC0048Ay;
import p000a.EnumC2241qF;
import p000a.InterfaceC0630Lr;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1270Xo {

    /* renamed from: R */
    public final InterfaceC1270Xo f8999R;

    /* renamed from: S */
    public final InterfaceC0630Lr f9000S;

    public DefaultLifecycleObserverAdapter(InterfaceC0630Lr interfaceC0630Lr, InterfaceC1270Xo interfaceC1270Xo) {
        this.f9000S = interfaceC0630Lr;
        this.f8999R = interfaceC1270Xo;
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        int i = AbstractC0048Ay.f201z[enumC2241qF.ordinal()];
        InterfaceC0630Lr interfaceC0630Lr = this.f9000S;
        switch (i) {
            case 1:
                interfaceC0630Lr.mo1401z();
                break;
            case 2:
                interfaceC0630Lr.mo1400v();
                break;
            case 3:
                interfaceC0630Lr.mo1398h();
                break;
            case 4:
                interfaceC0630Lr.mo1396N();
                break;
            case 5:
                interfaceC0630Lr.mo1397P();
                break;
            case 6:
                interfaceC0630Lr.mo1399u();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1270Xo interfaceC1270Xo = this.f8999R;
        if (interfaceC1270Xo != null) {
            interfaceC1270Xo.mo2596Q(interfaceC1546d7, enumC2241qF);
        }
    }
}
