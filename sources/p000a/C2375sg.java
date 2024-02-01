package p000a;

import android.app.Notification;
import android.app.PendingIntent;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.core.download.DownloadService;

/* renamed from: a.sg */
/* loaded from: classes.dex */
public final class C2375sg extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ AbstractServiceC1020T7 f7301I;

    /* renamed from: R */
    public final /* synthetic */ int f7302R;

    /* renamed from: w */
    public final /* synthetic */ AbstractC0164DB f7303w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2375sg(AbstractC0164DB abstractC0164DB, DownloadService downloadService, int i) {
        super(1);
        this.f7302R = i;
        this.f7303w = abstractC0164DB;
        this.f7301I = downloadService;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f7302R) {
            case AbstractC0795Op.f2698E /* 0 */:
                m4096h((Notification.Builder) obj);
                return c0329gj;
            default:
                m4096h((Notification.Builder) obj);
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m4096h(Notification.Builder builder) {
        int i = this.f7302R;
        AbstractServiceC1020T7 abstractServiceC1020T7 = this.f7301I;
        AbstractC0164DB abstractC0164DB = this.f7303w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1112Up c1112Up = AbstractServiceC1020T7.f3413w;
                C1219Wm.m2516z(-2.0f, abstractC0164DB);
                builder.setContentText(abstractServiceC1020T7.getString(R.string.download_file_error)).setSmallIcon(17301624).setOngoing(false);
                return;
            default:
                C1112Up c1112Up2 = AbstractServiceC1020T7.f3413w;
                C1219Wm.m2516z(1.0f, abstractC0164DB);
                builder.setContentTitle(abstractC0164DB.mo38u()).setContentText(abstractServiceC1020T7.getString(R.string.download_complete)).setSmallIcon(17301634).setProgress(0, 0, false).setOngoing(false).setAutoCancel(true);
                PendingIntent mo35W = abstractC0164DB.mo35W(abstractServiceC1020T7);
                if (mo35W != null) {
                    builder.setContentIntent(mo35W);
                    return;
                }
                return;
        }
    }
}
