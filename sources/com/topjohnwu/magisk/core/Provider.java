package com.topjohnwu.magisk.core;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.ExecutorService;
import p000a.AbstractC0017AI;
import p000a.AbstractC0438II;
import p000a.AbstractC0493JJ;
import p000a.AbstractC0795Op;
import p000a.AbstractC1292YB;
import p000a.AbstractC1843ih;
import p000a.AbstractC2740zk;
import p000a.C0140Ci;
import p000a.C0344Ga;
import p000a.C1019T6;
import p000a.C1212We;
import p000a.C1453bH;
import p000a.C1910jw;
import p000a.ServiceConnectionC2132oD;

/* loaded from: classes.dex */
public final class Provider extends AbstractC0493JJ {

    /* renamed from: S */
    public static final /* synthetic */ int f9566S = 0;

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        boolean m2695u;
        Object c1019t6;
        boolean z;
        String str3;
        boolean z2 = true;
        if (AbstractC1292YB.m2695u(str, "log")) {
            m2695u = true;
        } else {
            m2695u = AbstractC1292YB.m2695u(str, "notify");
        }
        if (m2695u) {
            AbstractC1843ih.m3451n0(getContext(), str, bundle);
            return Bundle.EMPTY;
        }
        Bundle bundle2 = new Bundle();
        try {
            if (AbstractC1292YB.m2695u(str, "setup")) {
                z = ((Boolean) AbstractC0438II.m1032l(new C0344Ga(C1453bH.m2872h(), null))).booleanValue();
            } else if (AbstractC1292YB.m2695u(str, "test")) {
                if (!C1910jw.f5961W) {
                    str3 = "zygisk not enabled";
                } else {
                    ExecutorService executorService = AbstractC0017AI.f108S;
                    if (!AbstractC0795Op.m1869s().m45G()) {
                        str3 = "shell not root";
                    } else {
                        ServiceConnectionC2132oD.f6572S.m3756z();
                        AbstractC0438II.m1032l(new C0140Ci(null));
                        z = z2;
                    }
                }
                bundle2.putString("reason", str3);
                z2 = false;
                z = z2;
            } else {
                bundle2.putString("reason", "unknown method");
                z = false;
            }
            c1019t6 = Boolean.valueOf(z);
        } catch (Throwable th) {
            c1019t6 = new C1019T6(th);
        }
        Throwable m4677z = AbstractC2740zk.m4677z(c1019t6);
        if (m4677z != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            m4677z.printStackTrace(printWriter);
            printWriter.flush();
            bundle2.putString("reason", stringWriter.toString());
            c1019t6 = Boolean.FALSE;
        }
        bundle2.putBoolean("result", ((Boolean) c1019t6).booleanValue());
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null) {
            return null;
        }
        if (encodedPath.hashCode() == 366086938 && encodedPath.equals("/prefs_file")) {
            C1212We.f3969z.m2501v().edit().remove("asked_home").commit();
            return ParcelFileDescriptor.open(C1212We.f3966v, 268435456);
        }
        return super.openFile(uri, str);
    }
}
