package p000a;

import android.window.OnBackInvokedCallback;

/* renamed from: a.Ev */
/* loaded from: classes.dex */
public final /* synthetic */ class C0257Ev implements OnBackInvokedCallback {

    /* renamed from: h */
    public final /* synthetic */ Object f918h;

    /* renamed from: z */
    public final /* synthetic */ int f919z;

    public /* synthetic */ C0257Ev(int i, Object obj) {
        this.f919z = i;
        this.f918h = obj;
    }

    public final void onBackInvoked() {
        switch (this.f919z) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((InterfaceC1459bP) this.f918h).mo93z();
                return;
            default:
                ((Runnable) this.f918h).run();
                return;
        }
    }
}
