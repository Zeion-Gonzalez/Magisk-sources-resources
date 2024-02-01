package com.topjohnwu.magisk.core;

import android.app.Application;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.core.utils.NetworkObserver;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p000a.AbstractC0017AI;
import p000a.AbstractC0037Al;
import p000a.AbstractC0154D;
import p000a.AbstractC0158D4;
import p000a.AbstractC0392HR;
import p000a.AbstractC0756O8;
import p000a.AbstractC0795Op;
import p000a.AbstractC1110Un;
import p000a.AbstractC1145VQ;
import p000a.AbstractC1292YB;
import p000a.AbstractC1530cs;
import p000a.AbstractC1685fh;
import p000a.AbstractC1743gn;
import p000a.AbstractC2494v;
import p000a.AbstractC2575wW;
import p000a.C0070BN;
import p000a.C0175DP;
import p000a.C0346Gc;
import p000a.C0382HH;
import p000a.C0612LW;
import p000a.C0730Ni;
import p000a.C0825PO;
import p000a.C0915RE;
import p000a.C0931RV;
import p000a.C1015T2;
import p000a.C1033TN;
import p000a.C1080UE;
import p000a.C1146VR;
import p000a.C1447b9;
import p000a.C1698fw;
import p000a.C1710g8;
import p000a.C1852is;
import p000a.C1910jw;
import p000a.C2034mH;
import p000a.C2136oH;
import p000a.C2562wG;
import p000a.EnumC2241qF;
import p000a.InterfaceC1255XS;
import p000a.InterfaceC1798hr;
import p000a.ServiceConnectionC2132oD;

/* loaded from: classes.dex */
public class App extends Application {

    /* renamed from: S */
    public static final /* synthetic */ int f9563S = 0;

    public App() {
        AbstractC1530cs.f4727z.m1158o(new C1698fw());
        Thread.setDefaultUncaughtExceptionHandler(new C2034mH());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v21, types: [android.app.Application, android.content.ContextWrapper] */
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        App app;
        if (context instanceof Application) {
            ?? r9 = (Application) context;
            Context baseContext = r9.getBaseContext();
            AbstractC0756O8.f2569z = AbstractC2575wW.m4448q(baseContext).getPath();
            app = r9;
            context = baseContext;
        } else {
            AbstractC0756O8.f2569z = context.getPackageResourcePath();
            app = this;
        }
        super.attachBaseContext(context);
        AbstractC1743gn.f5501z = context;
        app.registerActivityLifecycleCallbacks(C1852is.f5778z);
        C1015T2 c1015t2 = new C1015T2();
        int i = 2;
        c1015t2.f3394h = 2;
        c1015t2.f3395v = new C2562wG[1];
        try {
            Constructor declaredConstructor = C2562wG.class.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            c1015t2.f3395v[0] = (C2562wG) declaredConstructor.newInstance(new Object[0]);
        } catch (ClassCastException | ReflectiveOperationException e) {
            AbstractC1292YB.m2644E("LIBSU", e);
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        AbstractC1292YB.f4144v = context;
        c1015t2.f3396z = 2L;
        ExecutorService executorService = AbstractC0017AI.f108S;
        synchronized (AbstractC0795Op.class) {
            if (!AbstractC0795Op.f2711h && AbstractC0795Op.m1868r() == null) {
                AbstractC0795Op.f2717v = c1015t2;
            } else {
                throw new IllegalStateException("The main shell was already created");
            }
        }
        AbstractC0017AI.f108S = new C0730Ni(AbstractC0037Al.f178h);
        C0382HH c0382hh = C0346Gc.f1163P;
        InterfaceC1798hr m2351v = AbstractC1145VQ.m2351v(new Intent().setComponent(AbstractC0756O8.m1728h(C0346Gc.class, getPackageName())), AbstractC1110Un.f3613h, ServiceConnectionC2132oD.f6572S);
        c0382hh.getClass();
        C0346Gc.f1162N = m2351v;
        String str = null;
        AbstractC0795Op.m1830U(null, new C1447b9(i));
        AbstractC1685fh.m3178z();
        Resources resources = getResources();
        if (AbstractC0795Op.m1857n()) {
            String str2 = AbstractC0756O8.f2569z;
            if (str2 != null) {
                str = str2;
            }
            AbstractC0756O8.m1730z(resources, str);
        }
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(AbstractC1685fh.f5274z);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        C1146VR c1146vr = AbstractC0392HR.f1320z;
        Context m3275z = AbstractC1743gn.m3275z();
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2494v.m4307S();
            NotificationChannel m4323v = AbstractC2494v.m4323v(m3275z.getString(R.string.update_channel));
            AbstractC2494v.m4307S();
            NotificationChannel m4301J = AbstractC2494v.m4301J(m3275z.getString(R.string.progress_channel));
            AbstractC2494v.m4307S();
            AbstractC0392HR.m886z().createNotificationChannels(AbstractC1292YB.m2661T(m4323v, m4301J, AbstractC2494v.m4313e(m3275z.getString(R.string.updated_channel))));
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (getResources().getConfiguration().diff(configuration) != 0) {
            Resources resources = getResources();
            configuration.setLocale(AbstractC1685fh.f5274z);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        if (!AbstractC0795Op.m1857n()) {
            super.onConfigurationChanged(configuration);
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        int i;
        AbstractC0154D c0931rv;
        super.onCreate();
        if (!AbstractC0158D4.f517z.getAndSet(true)) {
            ((Application) getApplicationContext()).registerActivityLifecycleCallbacks(new C0825PO());
        }
        C0612LW c0612lw = C0612LW.f1981s;
        c0612lw.getClass();
        c0612lw.f1987q = new Handler();
        c0612lw.f1986k.m721N(EnumC2241qF.ON_CREATE);
        ((Application) getApplicationContext()).registerActivityLifecycleCallbacks(new C2136oH(c0612lw));
        new NetworkObserver(this).m5133o();
        if (!AbstractC0795Op.m1857n()) {
            InterfaceC1255XS interfaceC1255XS = AbstractC0037Al.f178h;
            C0915RE c0915re = new C0915RE(this, null);
            boolean z = true & true;
            InterfaceC1255XS interfaceC1255XS2 = C0070BN.f302S;
            if (z) {
                interfaceC1255XS = interfaceC1255XS2;
            }
            boolean z2 = false;
            if (true & true) {
                i = 1;
            } else {
                i = 0;
            }
            InterfaceC1255XS m2668Y = AbstractC1292YB.m2668Y(interfaceC1255XS2, interfaceC1255XS, true);
            C1080UE c1080ue = AbstractC0037Al.f179z;
            if (m2668Y != c1080ue && m2668Y.mo107y(C1710g8.f5377R) == null) {
                m2668Y = m2668Y.mo104G(c1080ue);
            }
            if (i != 0) {
                if (i == 2) {
                    z2 = true;
                }
                if (z2) {
                    c0931rv = new C1033TN(m2668Y, c0915re);
                } else {
                    c0931rv = new C0931RV(m2668Y, true);
                }
                c0931rv.m312D(i, c0931rv, c0915re);
                return;
            }
            throw null;
        }
    }

    public App(Object obj) {
        this();
        C0175DP c0175dp = new C0175DP(obj);
        Object obj2 = c0175dp.f541R;
        Object[] objArr = (Object[]) obj2;
        ((Map) ((Object[]) obj2)[1]).put(C0346Gc.class.getName(), ((Class) objArr[2]).getName());
        objArr[2] = C0346Gc.class;
        C1910jw.f5962h = c0175dp;
    }
}
