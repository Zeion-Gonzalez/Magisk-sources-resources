package p000a;

import android.content.Context;
import android.os.Build;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.core.download.DownloadService;
import java.io.IOException;

/* renamed from: a.Zg */
/* loaded from: classes.dex */
public final class C1372Zg extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ Object f4299I;

    /* renamed from: R */
    public final /* synthetic */ int f4300R;

    /* renamed from: w */
    public final /* synthetic */ Object f4301w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1372Zg(Object obj, int i, Object obj2) {
        super(1);
        this.f4300R = i;
        this.f4301w = obj;
        this.f4299I = obj2;
    }

    /* renamed from: v */
    private void m2768v(Object obj) {
        IOException iOException = (IOException) obj;
        C0437IH c0437ih = (C0437IH) this.f4301w;
        C1570dX c1570dX = (C1570dX) this.f4299I;
        synchronized (c0437ih) {
            c1570dX.m3037v();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x00b0, code lost:
    
        if (r0 == false) goto L195;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00fe  */
    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo85W(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1372Zg.mo85W(java.lang.Object):java.lang.Object");
    }

    /* renamed from: h */
    public final void m2769h(boolean z) {
        int i = this.f4300R;
        Object obj = this.f4299I;
        Object obj2 = this.f4301w;
        switch (i) {
            case 4:
                Context applicationContext = ((AbstractActivityC0402He) obj2).getApplicationContext();
                if (Build.VERSION.SDK_INT >= 26) {
                    int i2 = DownloadService.f9570q;
                    applicationContext.startForegroundService(C1219Wm.m2510N(applicationContext, (AbstractC0164DB) obj));
                    return;
                } else {
                    int i3 = DownloadService.f9570q;
                    applicationContext.startService(C1219Wm.m2510N(applicationContext, (AbstractC0164DB) obj));
                    return;
                }
            case 5:
            default:
                if (!z) {
                    ((AbstractC2615xD) obj2).m4500S(new C0805P0((int) R.string.external_rw_permission_denied));
                    return;
                } else {
                    ((C2744zq) obj).m4500S(new C1003So("application/zip", new C2103nd()));
                    return;
                }
            case 6:
                if (!z) {
                    ((AbstractC2615xD) obj2).m4500S(new C0805P0((int) R.string.external_rw_permission_denied));
                    return;
                } else {
                    C2619xH c2619xH = (C2619xH) obj;
                    AbstractC0438II.m994F(AbstractC2575wW.m4424d(c2619xH), AbstractC0037Al.f178h, new C1879jO(c2619xH, null), 2);
                    return;
                }
            case 7:
                if (!z) {
                    ((AbstractC2615xD) obj2).m4500S(new C0805P0((int) R.string.external_rw_permission_denied));
                    return;
                } else {
                    C1688fk c1688fk = (C1688fk) obj;
                    AbstractC0438II.m994F(AbstractC2575wW.m4424d(c1688fk), AbstractC0037Al.f178h, new C1205WW(c1688fk, null), 2);
                    return;
                }
        }
    }
}
