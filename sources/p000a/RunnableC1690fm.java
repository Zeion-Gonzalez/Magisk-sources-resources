package p000a;

import android.app.Activity;
import android.app.ProgressDialog;
import com.topjohnwu.magisk.R;

/* renamed from: a.fm */
/* loaded from: classes.dex */
public final class RunnableC1690fm implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ ProgressDialog f5295R;

    /* renamed from: S */
    public final /* synthetic */ int f5296S;

    /* renamed from: w */
    public final /* synthetic */ Activity f5297w;

    public /* synthetic */ RunnableC1690fm(ProgressDialog progressDialog, Activity activity, int i) {
        this.f5296S = i;
        this.f5295R = progressDialog;
        this.f5297w = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5296S;
        Activity activity = this.f5297w;
        ProgressDialog progressDialog = this.f5295R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                progressDialog.dismiss();
                AbstractC0795Op.m1871tJ(activity, R.string.failure, 1);
                return;
            default:
                progressDialog.dismiss();
                AbstractC0795Op.m1871tJ(activity, R.string.failure, 1);
                return;
        }
    }
}
