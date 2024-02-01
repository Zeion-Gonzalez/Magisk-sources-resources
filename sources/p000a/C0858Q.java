package p000a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: a.Q */
/* loaded from: classes.dex */
public final class C0858Q extends BroadcastReceiver implements InterfaceC2442u {

    /* renamed from: h */
    public final Runnable f2901h;

    /* renamed from: v */
    public final Runnable f2902v;

    /* renamed from: z */
    public final String f2903z;

    /* renamed from: P */
    public final CountDownLatch f2899P = new CountDownLatch(1);

    /* renamed from: N */
    public Intent f2898N = null;

    /* renamed from: Q */
    public final String f2900Q = UUID.randomUUID().toString();

    public C0858Q(String str, RunnableC1547d8 runnableC1547d8, Runnable runnable) {
        this.f2903z = str;
        this.f2901h = runnableC1547d8;
        this.f2902v = runnable;
    }

    /* renamed from: h */
    public final C0687N m1991h(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(this.f2900Q).setPackage(context.getPackageName()), 167772160);
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        if (Build.VERSION.SDK_INT >= 31) {
            sessionParams.setRequireUserAction(2);
        }
        PackageInstaller.Session openSession = packageInstaller.openSession(packageInstaller.createSession(sessionParams));
        return new C0687N(openSession.openWrite(this.f2900Q, 0L, -1L), openSession, broadcast);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean equals = "android.intent.action.PACKAGE_ADDED".equals(intent.getAction());
        Runnable runnable = this.f2901h;
        String str = this.f2903z;
        if (equals) {
            Uri data = intent.getData();
            if (data != null && data.getSchemeSpecificPart().equals(str)) {
                if (runnable != null) {
                    runnable.run();
                }
                context.getApplicationContext().unregisterReceiver(this);
                return;
            }
            return;
        }
        if (this.f2900Q.equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 4);
            if (intExtra != -1) {
                if (intExtra != 0) {
                    try {
                        context.getPackageManager().getPackageInstaller().abandonSession(intent.getIntExtra("android.content.pm.extra.SESSION_ID", 0));
                    } catch (SecurityException unused) {
                    }
                    Runnable runnable2 = this.f2902v;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    context.getApplicationContext().unregisterReceiver(this);
                } else if (str == null) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    context.getApplicationContext().unregisterReceiver(this);
                }
            } else {
                this.f2898N = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            }
            this.f2899P.countDown();
        }
    }

    /* renamed from: v */
    public final Intent m1992v() {
        try {
            this.f2899P.await(5L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
        return this.f2898N;
    }

    /* renamed from: z */
    public final void m1993z(Activity activity, File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C0687N m1991h = m1991h(activity);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 8192);
                    if (read >= 0) {
                        m1991h.write(bArr, 0, read);
                    } else {
                        m1991h.close();
                        fileInputStream.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
