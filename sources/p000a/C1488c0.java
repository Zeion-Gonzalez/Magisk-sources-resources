package p000a;

import android.view.MenuItem;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.p001ui.MainActivity;

/* renamed from: a.c0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1488c0 {

    /* renamed from: z */
    public final /* synthetic */ MainActivity f4625z;

    public /* synthetic */ C1488c0(MainActivity mainActivity) {
        this.f4625z = mainActivity;
    }

    /* renamed from: z */
    public final void m2890z(C1420ag c1420ag) {
        boolean z;
        int i = MainActivity.f9592nF;
        switch (c1420ag.f4455y) {
            case R.id.homeFragment /* 2131296524 */:
            case R.id.logFragment /* 2131296576 */:
            case R.id.modulesFragment /* 2131296638 */:
            case R.id.superuserFragment /* 2131296824 */:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        MainActivity mainActivity = this.f4625z;
        mainActivity.f9595od = z;
        mainActivity.m5135J(!z);
        MainActivity.m5134Y(mainActivity, !mainActivity.f9595od, false, 2);
        C0869QH c0869qh = ((AbstractC2437tv) mainActivity.m1924k()).f7464j.f6315S;
        int size = c0869qh.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = c0869qh.getItem(i2);
            if (item.getItemId() == c1420ag.f4455y) {
                item.setChecked(true);
            }
        }
    }
}
