package p000a;

import android.animation.Animator;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.topjohnwu.magisk.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* renamed from: a.Gh */
/* loaded from: classes.dex */
public final /* synthetic */ class C0351Gh implements InterfaceC2447u5, InterfaceC2487ut, InterfaceC0636Lz, InterfaceC1798hr {

    /* renamed from: R */
    public final /* synthetic */ Object f1182R;

    /* renamed from: S */
    public final /* synthetic */ Object f1183S;

    public /* synthetic */ C0351Gh(Object obj, Object obj2) {
        this.f1183S = obj;
        this.f1182R = obj2;
    }

    @Override // p000a.InterfaceC2487ut
    /* renamed from: h */
    public final void mo57h(AbstractC1823iK abstractC1823iK) {
        int i;
        int i2;
        ProgressDialog progressDialog = (ProgressDialog) this.f1183S;
        Context context = (Context) this.f1182R;
        progressDialog.dismiss();
        if (abstractC1823iK.m3380z()) {
            i = R.string.restore_done;
            i2 = 0;
        } else {
            i = R.string.restore_fail;
            i2 = 1;
        }
        AbstractC0795Op.m1871tJ(context, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (p000a.AbstractC1292YB.m2695u(r11, r4) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000a.InterfaceC0636Lz
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo765v(p000a.AbstractC0017AI r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0351Gh.mo765v(a.AI):void");
    }

    @Override // p000a.InterfaceC1798hr
    /* renamed from: x */
    public final void mo766x(C0529Jz c0529Jz, C0776OS c0776os, C0776OS c0776os2) {
        String str;
        String str2;
        String str3 = (String) this.f1183S;
        ComponentName componentName = (ComponentName) this.f1182R;
        Context m2646F = AbstractC1292YB.m2646F();
        if (Build.VERSION.SDK_INT >= 24) {
            m2646F = m2646F.createDeviceProtectedStorageContext();
        }
        File file = new File(m2646F.getCacheDir(), "main.jar");
        InputStream open = m2646F.getResources().getAssets().open("main.jar");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int read = open.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                fileOutputStream.close();
                open.close();
                str3.getClass();
                if (!str3.equals("daemon")) {
                    if (!str3.equals("start")) {
                        str = "";
                    } else {
                        str = String.format(Locale.ROOT, "--nice-name=%s:root:%d", m2646F.getPackageName(), Integer.valueOf(Process.myUid() / 100000));
                    }
                } else {
                    str = "--nice-name=" + m2646F.getPackageName() + ":root:daemon";
                }
                if (Process.is64Bit()) {
                    str2 = "64";
                } else {
                    str2 = "32";
                }
                c0529Jz.write(String.format(Locale.ROOT, "(%s CLASSPATH=%s %s %s /system/bin %s com.topjohnwu.superuser.internal.RootServerMain '%s' %d %s >/dev/null 2>&1)&", "", file, "/system/bin/app_process".concat(str2), "", str, componentName.flattenToString(), Integer.valueOf(Process.myUid()), str3).getBytes(StandardCharsets.UTF_8));
                c0529Jz.write(10);
                c0529Jz.flush();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // p000a.InterfaceC2447u5
    /* renamed from: z */
    public final void mo59z() {
        Animator animator = (Animator) this.f1183S;
        AbstractC0204Du abstractC0204Du = (AbstractC0204Du) this.f1182R;
        animator.end();
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Animator from operation " + abstractC0204Du + " has been canceled.");
        }
    }
}
