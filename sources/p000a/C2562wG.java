package p000a;

import android.content.Context;
import android.os.Build;
import com.topjohnwu.magisk.R;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* renamed from: a.wG */
/* loaded from: classes.dex */
public final class C2562wG {
    /* renamed from: P */
    private static final String m4380P(AbstractC0017AI abstractC0017AI, String str) {
        return m4381h(abstractC0017AI, AbstractC2441tz.m4200k("echo $", str));
    }

    /* renamed from: h */
    private static final String m4381h(AbstractC0017AI abstractC0017AI, String str) {
        return AbstractC1292YB.m2692r(abstractC0017AI, str);
    }

    /* renamed from: v */
    private static final boolean m4382v(AbstractC0017AI abstractC0017AI, String str) {
        return Boolean.parseBoolean(m4380P(abstractC0017AI, str));
    }

    /* renamed from: z */
    public boolean m4383z(Context context, AbstractC0017AI abstractC0017AI) {
        File file;
        InputStream open;
        Context context2;
        InterfaceC1798hr interfaceC1798hr;
        int i = 1;
        if (abstractC0017AI.m45G()) {
            C1910jw.f5958R = true;
            C0346Gc.f1163P.getClass();
            interfaceC1798hr = C0346Gc.f1162N;
            if (interfaceC1798hr != null) {
                abstractC0017AI.mo46h(interfaceC1798hr);
            }
            C0346Gc.f1162N = null;
        }
        C1996lX c1996lX = (C1996lX) abstractC0017AI;
        C0434IE c0434ie = new C0434IE(c1996lX);
        c0434ie.m971O4("export ASH_STANDALONE=1");
        if (AbstractC0795Op.m1857n()) {
            if (!abstractC0017AI.m45G()) {
                return true;
            }
            JarFile jarFile = new JarFile(AbstractC2575wW.m4448q(context));
            String str = AbstractC0598LC.f1921z;
            JarEntry jarEntry = jarFile.getJarEntry("lib/" + Build.SUPPORTED_ABIS[0] + "/libbusybox.so");
            if (Build.VERSION.SDK_INT >= 24) {
                context2 = context.createDeviceProtectedStorageContext();
            } else {
                context2 = context;
            }
            file = new File(context2.getCacheDir(), "busybox");
            file.delete();
            AbstractC2631xW.m4526h(file, jarFile.getInputStream(jarEntry));
            file.setExecutable(true);
        } else {
            file = new File(context.getApplicationInfo().nativeLibraryDir, "libbusybox.so");
        }
        if (abstractC0017AI.m45G()) {
            c0434ie.m971O4("export MAGISKTMP=$(magisk --path)");
            C1910jw c1910jw = C1910jw.f5967z;
            C0434IE c0434ie2 = new C0434IE(c1996lX);
            c0434ie2.m971O4(file + " sh -c \"" + file + " true\"");
            C1910jw.f5959S = c0434ie2.m972d3().m3380z() ^ true;
        }
        if (C1910jw.f5959S) {
            c0434ie.m971O4("if [ -x $MAGISKTMP/.magisk/busybox/busybox ]; then", "  cp -af " + file + " $MAGISKTMP/.magisk/busybox/busybox", "  exec $MAGISKTMP/.magisk/busybox/busybox sh", "else", "  cp -af " + file + " /dev/busybox", "  exec /dev/busybox sh", "fi");
        } else {
            c0434ie.m971O4("exec " + file + " sh");
        }
        InputStream openRawResource = context.getResources().openRawResource(R.raw.manager);
        ArrayList arrayList = c0434ie.f1419R;
        if (openRawResource != null) {
            arrayList.add(new C0939Rf(i, openRawResource));
        }
        if (abstractC0017AI.m45G() && (open = context.getAssets().open("util_functions.sh")) != null) {
            arrayList.add(new C0939Rf(i, open));
        }
        c0434ie.m971O4("app_init");
        c0434ie.m972d3();
        C1910jw.f5957Q = m4382v(abstractC0017AI, "SYSTEM_AS_ROOT");
        C1910jw.f5952G = m4382v(abstractC0017AI, "RAMDISKEXIST");
        C1910jw.f5963o = m4382v(abstractC0017AI, "ISAB");
        C1910jw.f5960V = m4380P(abstractC0017AI, "CRYPTOTYPE");
        C1910jw.f5954M = m4382v(abstractC0017AI, "PATCHVBMETAFLAG");
        C1910jw.f5964u = m4382v(abstractC0017AI, "LEGACYSAR");
        C1212We c1212We = C1212We.f3969z;
        C1212We.f3965u = m4382v(abstractC0017AI, "RECOVERYMODE");
        C1212We.f3946N = m4382v(abstractC0017AI, "KEEPVERITY");
        C1212We.f3948Q = m4382v(abstractC0017AI, "KEEPFORCEENCRYPT");
        return true;
    }
}
