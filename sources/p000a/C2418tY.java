package p000a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: a.tY */
/* loaded from: classes.dex */
public final class C2418tY {

    /* renamed from: z */
    public static final C2418tY f7404z = new C2418tY();

    /* renamed from: h */
    public final void m4170h(Object obj, int i, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: v */
    public final void m4171v(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* renamed from: z */
    public final OnBackInvokedCallback m4172z(InterfaceC1459bP interfaceC1459bP) {
        return new C0257Ev(0, interfaceC1459bP);
    }
}
