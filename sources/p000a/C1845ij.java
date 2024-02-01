package p000a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;

/* renamed from: a.ij */
/* loaded from: classes.dex */
public final class C1845ij extends BroadcastReceiver {

    /* renamed from: h */
    public final /* synthetic */ C2024m6 f5765h;

    /* renamed from: z */
    public final Messenger f5766z;

    public C1845ij(C2024m6 c2024m6) {
        this.f5765h = c2024m6;
        this.f5766z = new Messenger(new Handler(Looper.getMainLooper(), c2024m6));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        IBinder binder;
        InterfaceC2625xN c1296yg;
        boolean z;
        C2024m6 c2024m6 = this.f5765h;
        Bundle bundleExtra = intent.getBundleExtra("extra.bundle");
        if (bundleExtra == null || (binder = bundleExtra.getBinder("binder")) == null) {
            return;
        }
        BinderC2198pP binderC2198pP = BinderC2198pP.f6759I;
        IInterface queryLocalInterface = binder.queryLocalInterface("com.topjohnwu.superuser.internal.IRootServiceManager");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2625xN)) {
            c1296yg = (InterfaceC2625xN) queryLocalInterface;
        } else {
            c1296yg = new C1296YG(binder);
        }
        try {
            c1296yg.mo2702w(this.f5766z.getBinder());
            C1178W3 c1178w3 = new C1178W3(c2024m6, c1296yg);
            if (intent.getBooleanExtra("extra.daemon", false)) {
                c2024m6.f6285h = c1178w3;
                c2024m6.f6286v &= -3;
            } else {
                c2024m6.f6287z = c1178w3;
                c2024m6.f6286v &= -2;
            }
            for (int size = c2024m6.f6283P.size() - 1; size >= 0; size--) {
                ArrayList arrayList = c2024m6.f6283P;
                C1958kq c1958kq = (C1958kq) arrayList.get(size);
                if (c1958kq.f6066z.m3660z(c1958kq.f6064h, c1958kq.f6065v, c1958kq.f6063P) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.remove(size);
                }
            }
        } catch (RemoteException e) {
            AbstractC1292YB.m2644E("IPC", e);
        }
    }
}
