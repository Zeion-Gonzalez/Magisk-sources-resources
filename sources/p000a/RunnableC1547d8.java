package p000a;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.TextView;
import com.topjohnwu.magisk.core.Provider;
import com.topjohnwu.magisk.p001ui.home.HomeFragment;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: a.d8 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1547d8 implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ Object f4779R;

    /* renamed from: S */
    public final /* synthetic */ int f4780S;

    /* renamed from: w */
    public final /* synthetic */ Object f4781w;

    public /* synthetic */ RunnableC1547d8(ExecutorC0571Ki executorC0571Ki, Runnable runnable) {
        this.f4780S = 7;
        this.f4781w = runnable;
        this.f4779R = executorC0571Ki;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorC0571Ki executorC0571Ki;
        boolean z = true;
        switch (this.f4780S) {
            case AbstractC0795Op.f2698E /* 0 */:
                executorC0571Ki = (ExecutorC0571Ki) this.f4779R;
                Runnable runnable = (Runnable) this.f4781w;
                executorC0571Ki.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 1:
                ((AbstractC2703z2) this.f4779R).mo777oI((Typeface) this.f4781w);
                return;
            case 2:
            case 4:
            case 5:
            default:
                C0312Fx c0312Fx = (C0312Fx) this.f4779R;
                ServiceConnection serviceConnection = (ServiceConnection) this.f4781w;
                int i = C0312Fx.f1068z;
                serviceConnection.onServiceDisconnected((ComponentName) ((Pair) ((C0803Oz) ((Pair) c0312Fx).first).f2742z).first);
                return;
            case 3:
                C1536cy c1536cy = (C1536cy) this.f4779R;
                AbstractC0204Du abstractC0204Du = (AbstractC0204Du) this.f4781w;
                c1536cy.m446v();
                if (C0364Gx.m791p(2)) {
                    Log.v("FragmentManager", "Transition for operation " + abstractC0204Du + " has completed");
                    return;
                }
                return;
            case 6:
                AbstractC1292YB abstractC1292YB = (AbstractC1292YB) this.f4779R;
                String[] strArr = (String[]) this.f4781w;
                int i2 = AbstractBinderC0702NG.f2360S;
                abstractC1292YB.getClass();
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                throw null;
            case 7:
                Runnable runnable2 = (Runnable) this.f4781w;
                executorC0571Ki = (ExecutorC0571Ki) this.f4779R;
                try {
                    runnable2.run();
                    return;
                } finally {
                }
            case 8:
                Activity activity = (Activity) this.f4779R;
                String str = (String) this.f4781w;
                Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(str);
                if (launchIntentForPackage != null) {
                    String packageName = activity.getPackageName();
                    int i3 = Provider.f9566S;
                    activity.grantUriPermission(str, C1219Wm.m2512Q(packageName), 1);
                    launchIntentForPackage.putExtra("prev_pkg", packageName);
                    activity.startActivity(launchIntentForPackage);
                    activity.finish();
                    return;
                }
                return;
            case 9:
                Activity activity2 = (Activity) this.f4779R;
                ProgressDialog progressDialog = (ProgressDialog) this.f4781w;
                Intent launchIntentForPackage2 = activity2.getPackageManager().getLaunchIntentForPackage("com.topjohnwu.magisk");
                if (launchIntentForPackage2 != null) {
                    String packageName2 = activity2.getPackageName();
                    int i4 = Provider.f9566S;
                    activity2.grantUriPermission("com.topjohnwu.magisk", C1219Wm.m2512Q(packageName2), 1);
                    launchIntentForPackage2.putExtra("prev_pkg", packageName2);
                    activity2.startActivity(launchIntentForPackage2);
                    activity2.finish();
                }
                progressDialog.dismiss();
                return;
            case 10:
                AbstractActivityC2427tj abstractActivityC2427tj = (AbstractActivityC2427tj) this.f4779R;
                Bundle bundle = (Bundle) this.f4781w;
                AbstractActivityC2427tj.f7429nP = true;
                if (AbstractC0795Op.m1857n()) {
                    abstractActivityC2427tj.startActivity(new Intent(abstractActivityC2427tj.getIntent()).setFlags(0));
                    abstractActivityC2427tj.finish();
                    return;
                } else if (abstractActivityC2427tj.f8654I.f1105P.m3117z(EnumC1632eh.f5087I)) {
                    abstractActivityC2427tj.m4175r(bundle);
                    return;
                } else {
                    abstractActivityC2427tj.f7430b = true;
                    return;
                }
            case 11:
                TextView textView = (TextView) this.f4779R;
                ImageView imageView = (ImageView) this.f4781w;
                int i5 = HomeFragment.f9604BO;
                Layout layout = textView.getLayout();
                if (layout == null || layout.getEllipsisCount(0) != 0) {
                    z = false;
                }
                if (!z) {
                    imageView.getLayoutParams().width = 0;
                    imageView.getLayoutParams().height = 0;
                    imageView.requestLayout();
                    return;
                }
                return;
            case 12:
                C2735zf c2735zf = (C2735zf) this.f4779R;
                int i6 = C2735zf.f8580w;
                c2735zf.getClass();
                String str2 = (String) this.f4781w;
                if (str2 != null) {
                    C2619xH c2619xH = c2735zf.f8581R;
                    c2619xH.f8103s.add(new C0501JT(str2));
                    c2619xH.f8098E.add(str2);
                    return;
                }
                return;
            case 13:
                Executor executor = (Executor) this.f4779R;
                InterfaceC0636Lz interfaceC0636Lz = (InterfaceC0636Lz) this.f4781w;
                try {
                    C1996lX m1869s = AbstractC0795Op.m1869s();
                    if (executor == null) {
                        interfaceC0636Lz.mo765v(m1869s);
                    } else {
                        executor.execute(new RunnableC1547d8(interfaceC0636Lz, 14, m1869s));
                    }
                    return;
                } catch (C0861Q4 unused) {
                    return;
                }
            case 14:
                ((InterfaceC0636Lz) this.f4779R).mo765v((AbstractC0017AI) this.f4781w);
                return;
            case 15:
                C0876QR c0876qr = (C0876QR) this.f4779R;
                InterfaceC2487ut interfaceC2487ut = (InterfaceC2487ut) this.f4781w;
                c0876qr.getClass();
                interfaceC2487ut.mo57h(c0876qr);
                return;
            case 16:
                ((ServiceConnection) this.f4779R).onNullBinding((ComponentName) ((Pair) ((C2036mK) this.f4781w)).first);
                return;
        }
    }

    public /* synthetic */ RunnableC1547d8(Object obj, int i, Object obj2) {
        this.f4780S = i;
        this.f4779R = obj;
        this.f4781w = obj2;
    }
}
