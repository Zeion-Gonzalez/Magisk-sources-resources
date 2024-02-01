package p000a;

import android.content.Intent;
import com.topjohnwu.magisk.R;

/* renamed from: a.wj */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2586wj implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ AbstractActivityC2427tj f7914R;

    /* renamed from: S */
    public final /* synthetic */ int f7915S;

    public /* synthetic */ RunnableC2586wj(AbstractActivityC2427tj abstractActivityC2427tj, int i) {
        this.f7915S = i;
        this.f7914R = abstractActivityC2427tj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7915S;
        AbstractActivityC2427tj abstractActivityC2427tj = this.f7914R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogC2727zU dialogC2727zU = new DialogC2727zU(abstractActivityC2427tj);
                dialogC2727zU.setTitle(R.string.unsupport_nonroot_stub_title);
                dialogC2727zU.m4656G(R.string.unsupport_nonroot_stub_msg, new Object[0]);
                dialogC2727zU.m4657W(EnumC1224Wr.f3992S, new C1812i8(abstractActivityC2427tj, dialogC2727zU, 2));
                dialogC2727zU.setCancelable(false);
                dialogC2727zU.show();
                return;
            default:
                Intent launchIntentForPackage = abstractActivityC2427tj.getPackageManager().getLaunchIntentForPackage(abstractActivityC2427tj.getPackageName());
                abstractActivityC2427tj.finishAffinity();
                abstractActivityC2427tj.startActivity(launchIntentForPackage);
                Runtime.getRuntime().exit(0);
                return;
        }
    }
}
