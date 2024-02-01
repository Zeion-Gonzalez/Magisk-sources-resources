package p000a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: a.NB */
/* loaded from: classes.dex */
public final class C0698NB implements OnBackAnimationCallback {

    /* renamed from: P */
    public final /* synthetic */ InterfaceC1459bP f2353P;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2364sT f2354h;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC1459bP f2355v;

    /* renamed from: z */
    public final /* synthetic */ InterfaceC2364sT f2356z;

    public C0698NB(InterfaceC2364sT interfaceC2364sT, InterfaceC2364sT interfaceC2364sT2, InterfaceC1459bP interfaceC1459bP, InterfaceC1459bP interfaceC1459bP2) {
        this.f2356z = interfaceC2364sT;
        this.f2354h = interfaceC2364sT2;
        this.f2355v = interfaceC1459bP;
        this.f2353P = interfaceC1459bP2;
    }

    public final void onBackCancelled() {
        this.f2353P.mo93z();
    }

    public final void onBackInvoked() {
        this.f2355v.mo93z();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.f2354h.mo85W(new C1499cG(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f2356z.mo85W(new C1499cG(backEvent));
    }
}
