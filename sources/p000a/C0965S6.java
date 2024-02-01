package p000a;

import android.net.ConnectivityManager;
import android.net.Network;
import com.topjohnwu.magisk.core.utils.NetworkObserver;

/* renamed from: a.S6 */
/* loaded from: classes.dex */
public final class C0965S6 extends ConnectivityManager.NetworkCallback {

    /* renamed from: h */
    public final /* synthetic */ NetworkObserver f3280h;

    /* renamed from: z */
    public final C0894Qq f3281z = new C0894Qq();

    public C0965S6(NetworkObserver networkObserver) {
        this.f3280h = networkObserver;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f3281z.add(network);
        this.f3280h.getClass();
        NetworkObserver.m5132W(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C0894Qq c0894Qq = this.f3281z;
        c0894Qq.remove(network);
        boolean z = !c0894Qq.isEmpty();
        this.f3280h.getClass();
        NetworkObserver.m5132W(z);
    }
}
