package p000a;

import android.app.Activity;
import android.app.PendingIntent;
import com.topjohnwu.magisk.core.download.DownloadService;

/* renamed from: a.aR */
/* loaded from: classes.dex */
public final class C1408aR extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ DownloadService f4422g;

    /* renamed from: k */
    public int f4423k;

    /* renamed from: q */
    public DownloadService f4424q;

    /* renamed from: y */
    public final /* synthetic */ AbstractC0164DB f4425y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408aR(DownloadService downloadService, AbstractC0164DB abstractC0164DB, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4422g = downloadService;
        this.f4425y = abstractC0164DB;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1408aR(this.f4422g, this.f4425y, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        DownloadService downloadService;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f4423k;
        DownloadService downloadService2 = this.f4422g;
        AbstractC0164DB abstractC0164DB = this.f4425y;
        int i2 = 1;
        try {
            if (i != 0) {
                if (i == 1) {
                    DownloadService downloadService3 = this.f4424q;
                    AbstractC1292YB.m2664UZ(obj);
                    downloadService = downloadService3;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1292YB.m2664UZ(obj);
                downloadService2.getClass();
                C2640xk m3274v = AbstractC1743gn.m3274v();
                String mo37o = abstractC0164DB.mo37o();
                this.f4424q = downloadService2;
                this.f4423k = 1;
                obj = m3274v.m4543z(mo37o, this);
                if (obj == enumC0464Im) {
                    return enumC0464Im;
                }
                downloadService = downloadService2;
            }
            AbstractC1449bB abstractC1449bB = (AbstractC1449bB) obj;
            downloadService.getClass();
            long mo1579z = abstractC1449bB.mo1579z();
            int mo33N = abstractC0164DB.mo33N();
            downloadService.m2198v(mo33N, new C2670yQ(5, abstractC0164DB));
            C2232q4 c2232q4 = new C2232q4(abstractC1449bB.mo1577G().mo1629n0(), new C1207WZ(downloadService, mo33N, mo1579z, ((float) mo1579z) / 1048576, abstractC0164DB));
            if (abstractC0164DB instanceof C2642xo) {
                DownloadService.m5130P(downloadService2, c2232q4, (C2642xo) abstractC0164DB);
            } else if (abstractC0164DB instanceof C0012AD) {
                DownloadService.m5129N(downloadService2, c2232q4, abstractC0164DB.mo34P());
            }
            C1852is c1852is = C1852is.f5778z;
            Activity activity = (Activity) C1852is.f5777h.get();
            if (activity != null && abstractC0164DB.mo36h()) {
                downloadService2.m2197h(abstractC0164DB.mo33N());
                PendingIntent mo35W = abstractC0164DB.mo35W(activity);
                if (mo35W != null) {
                    mo35W.send();
                }
            } else {
                downloadService2.getClass();
                downloadService2.m2199z(abstractC0164DB.mo33N(), new C2375sg(abstractC0164DB, downloadService2, i2));
            }
            InterfaceC1459bP mo328Q = abstractC0164DB.mo328Q();
            if (mo328Q != null) {
                mo328Q.mo93z();
            }
            if ((!downloadService2.f3415S.isEmpty()) == false) {
                downloadService2.stopSelf();
            }
        } catch (Exception e) {
            AbstractC1530cs.f4727z.mo1160v(e);
            downloadService2.getClass();
            downloadService2.m2199z(abstractC0164DB.mo33N(), new C2375sg(abstractC0164DB, downloadService2, 0));
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1408aR) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
