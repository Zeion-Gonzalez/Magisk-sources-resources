package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.AbstractActivityC0502JU;
import p000a.AbstractActivityC1187WD;
import p000a.AbstractC1836iZ;
import p000a.AbstractC1843ih;
import p000a.AbstractC2575wW;
import p000a.C0118CH;
import p000a.C0160D7;
import p000a.C0326GG;
import p000a.C0693N6;
import p000a.C0816PC;
import p000a.C0945Rm;
import p000a.C0966S8;
import p000a.C1174Vy;
import p000a.C1330Yx;
import p000a.C1635ek;
import p000a.C1665fK;
import p000a.C1710g8;
import p000a.C1925kC;
import p000a.C1934kN;
import p000a.C2055mj;
import p000a.C2145oS;
import p000a.C2195pL;
import p000a.C2246qK;
import p000a.C2300rJ;
import p000a.EnumC1632eh;
import p000a.EnumC2241qF;
import p000a.ExecutorC2110nm;
import p000a.InterfaceC0238EW;
import p000a.InterfaceC0277FG;
import p000a.InterfaceC0381HG;
import p000a.InterfaceC0568Kf;
import p000a.InterfaceC0670Mg;
import p000a.InterfaceC0699NC;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1303YO;
import p000a.InterfaceC1459bP;
import p000a.InterfaceC1503cL;
import p000a.InterfaceC1546d7;
import p000a.InterfaceC1609eH;
import p000a.InterfaceC1617eQ;
import p000a.InterfaceC2112no;
import p000a.InterfaceC2297rF;
import p000a.InterfaceC2335rw;
import p000a.RunnableC0308Fs;
import p000a.RunnableC1286Y5;

/* renamed from: androidx.activity.z */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2754z extends AbstractActivityC1187WD implements InterfaceC0670Mg, InterfaceC0699NC, InterfaceC0277FG, InterfaceC2112no, InterfaceC1303YO, InterfaceC0568Kf, InterfaceC0238EW, InterfaceC0381HG, InterfaceC1609eH, InterfaceC2335rw {

    /* renamed from: E */
    public final C0966S8 f8652E;

    /* renamed from: H */
    public boolean f8653H;

    /* renamed from: I */
    public final C0326GG f8654I;

    /* renamed from: J */
    public final CopyOnWriteArrayList f8655J;

    /* renamed from: R */
    public final C2246qK f8656R = new C2246qK();

    /* renamed from: U */
    public final AtomicInteger f8657U;

    /* renamed from: Y */
    public final CopyOnWriteArrayList f8658Y;

    /* renamed from: c */
    public final CopyOnWriteArrayList f8659c;

    /* renamed from: e */
    public boolean f8660e;

    /* renamed from: f */
    public final CopyOnWriteArrayList f8661f;

    /* renamed from: g */
    public C2752h f8662g;

    /* renamed from: k */
    public C2145oS f8663k;

    /* renamed from: q */
    public final C1330Yx f8664q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f8665r;

    /* renamed from: s */
    public final C0816PC f8666s;

    /* renamed from: w */
    public final C1174Vy f8667w;

    /* renamed from: y */
    public final ExecutorC2110nm f8668y;

    /* JADX WARN: Type inference failed for: r5v0, types: [a.nr] */
    public AbstractActivityC2754z() {
        int i = 0;
        this.f8667w = new C1174Vy((Runnable) new RunnableC0308Fs(i, this));
        C0326GG c0326gg = new C0326GG(this);
        this.f8654I = c0326gg;
        C1330Yx c1330Yx = new C1330Yx(this);
        this.f8664q = c1330Yx;
        this.f8662g = null;
        final AbstractActivityC0502JU abstractActivityC0502JU = (AbstractActivityC0502JU) this;
        this.f8668y = new ExecutorC2110nm(abstractActivityC0502JU);
        this.f8666s = new C0816PC(new InterfaceC1459bP() { // from class: a.nr
            @Override // p000a.InterfaceC1459bP
            /* renamed from: z */
            public final Object mo93z() {
                abstractActivityC0502JU.reportFullyDrawn();
                return null;
            }
        });
        this.f8657U = new AtomicInteger();
        this.f8652E = new C0966S8(abstractActivityC0502JU);
        this.f8661f = new CopyOnWriteArrayList();
        this.f8665r = new CopyOnWriteArrayList();
        this.f8658Y = new CopyOnWriteArrayList();
        this.f8655J = new CopyOnWriteArrayList();
        this.f8659c = new CopyOnWriteArrayList();
        this.f8653H = false;
        this.f8660e = false;
        int i2 = Build.VERSION.SDK_INT;
        c0326gg.mo728z(new InterfaceC1270Xo() { // from class: androidx.activity.ComponentActivity$2
            @Override // p000a.InterfaceC1270Xo
            /* renamed from: Q */
            public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
                View view;
                if (enumC2241qF == EnumC2241qF.ON_STOP) {
                    Window window = abstractActivityC0502JU.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0326gg.mo728z(new InterfaceC1270Xo() { // from class: androidx.activity.ComponentActivity$3
            @Override // p000a.InterfaceC1270Xo
            /* renamed from: Q */
            public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
                if (enumC2241qF == EnumC2241qF.ON_DESTROY) {
                    abstractActivityC0502JU.f8656R.f6909h = null;
                    if (!abstractActivityC0502JU.isChangingConfigurations()) {
                        abstractActivityC0502JU.mo1569G().m3763z();
                    }
                    ExecutorC2110nm executorC2110nm = abstractActivityC0502JU.f8668y;
                    AbstractActivityC2754z abstractActivityC2754z = executorC2110nm.f6512w;
                    abstractActivityC2754z.getWindow().getDecorView().removeCallbacks(executorC2110nm);
                    abstractActivityC2754z.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC2110nm);
                }
            }
        });
        c0326gg.mo728z(new InterfaceC1270Xo() { // from class: androidx.activity.ComponentActivity$4
            @Override // p000a.InterfaceC1270Xo
            /* renamed from: Q */
            public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
                AbstractActivityC2754z abstractActivityC2754z = abstractActivityC0502JU;
                if (abstractActivityC2754z.f8663k == null) {
                    C0118CH c0118ch = (C0118CH) abstractActivityC2754z.getLastNonConfigurationInstance();
                    if (c0118ch != null) {
                        abstractActivityC2754z.f8663k = c0118ch.f416z;
                    }
                    if (abstractActivityC2754z.f8663k == null) {
                        abstractActivityC2754z.f8663k = new C2145oS();
                    }
                }
                abstractActivityC2754z.f8654I.mo724h(this);
            }
        });
        c1330Yx.m2713z();
        AbstractC1843ih.m3402E(this);
        if (i2 <= 23) {
            c0326gg.mo728z(new ImmLeaksCleaner(abstractActivityC0502JU));
        }
        c1330Yx.f4218h.m3554v("android:support:activity-result", new C1635ek(i, this));
        m4694o(new C2195pL(abstractActivityC0502JU, i));
    }

    @Override // p000a.InterfaceC1546d7
    /* renamed from: C */
    public final C0326GG mo1354C() {
        return this.f8654I;
    }

    @Override // p000a.InterfaceC0670Mg
    /* renamed from: G */
    public final C2145oS mo1569G() {
        if (getApplication() != null) {
            if (this.f8663k == null) {
                C0118CH c0118ch = (C0118CH) getLastNonConfigurationInstance();
                if (c0118ch != null) {
                    this.f8663k = c0118ch.f416z;
                }
                if (this.f8663k == null) {
                    this.f8663k = new C2145oS();
                }
            }
            return this.f8663k;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: M */
    public final C2300rJ m4692M(C2055mj c2055mj, C0693N6 c0693n6) {
        return this.f8652E.m4687P("activity_rq#" + this.f8657U.getAndIncrement(), this, c0693n6, c2055mj);
    }

    /* renamed from: W */
    public final C2752h m4693W() {
        if (this.f8662g == null) {
            this.f8662g = new C2752h(new RunnableC1286Y5(0, this));
            this.f8654I.mo728z(new InterfaceC1270Xo() { // from class: androidx.activity.ComponentActivity$6
                @Override // p000a.InterfaceC1270Xo
                /* renamed from: Q */
                public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
                    if (enumC2241qF == EnumC2241qF.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        C2752h c2752h = AbstractActivityC2754z.this.f8662g;
                        c2752h.f8634N = AbstractC1836iZ.m3389z((AbstractActivityC2754z) interfaceC1546d7);
                        c2752h.m4684v(c2752h.f8638u);
                    }
                }
            });
        }
        return this.f8662g;
    }

    @Override // p000a.InterfaceC0277FG
    /* renamed from: h */
    public final C1934kN mo576h() {
        return this.f8664q.f4218h;
    }

    /* renamed from: o */
    public final void m4694o(InterfaceC2297rF interfaceC2297rF) {
        C2246qK c2246qK = this.f8656R;
        if (c2246qK.f6909h != null) {
            interfaceC2297rF.mo3769z();
        }
        c2246qK.f6910z.add(interfaceC2297rF);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f8652E.m4690z(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m4693W().m4683h();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f8661f.iterator();
        while (it.hasNext()) {
            ((InterfaceC1617eQ) it.next()).mo2146z(configuration);
        }
    }

    @Override // p000a.AbstractActivityC1187WD, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f8664q.m2711h(bundle);
        C2246qK c2246qK = this.f8656R;
        c2246qK.f6909h = this;
        Iterator it = c2246qK.f6910z.iterator();
        while (it.hasNext()) {
            ((InterfaceC2297rF) it.next()).mo3769z();
        }
        super.onCreate(bundle);
        C1665fK.m3152q(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.f8667w.f3830w).iterator();
            while (it.hasNext()) {
                ((InterfaceC1503cL) it.next()).mo2522v(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f8667w.m2400q(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f8653H) {
            return;
        }
        Iterator it = this.f8655J.iterator();
        while (it.hasNext()) {
            ((InterfaceC1617eQ) it.next()).mo2146z(new C1925kC(z));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f8658Y.iterator();
        while (it.hasNext()) {
            ((InterfaceC1617eQ) it.next()).mo2146z(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f8667w.f3830w).iterator();
        while (it.hasNext()) {
            ((InterfaceC1503cL) it.next()).mo2521Q(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f8660e) {
            return;
        }
        Iterator it = this.f8659c.iterator();
        while (it.hasNext()) {
            ((InterfaceC1617eQ) it.next()).mo2146z(new C0160D7(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.f8667w.f3830w).iterator();
            while (it.hasNext()) {
                ((InterfaceC1503cL) it.next()).mo2520P(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f8652E.m4690z(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0118CH c0118ch;
        C2145oS c2145oS = this.f8663k;
        if (c2145oS == null && (c0118ch = (C0118CH) getLastNonConfigurationInstance()) != null) {
            c2145oS = c0118ch.f416z;
        }
        if (c2145oS == null) {
            return null;
        }
        C0118CH c0118ch2 = new C0118CH();
        c0118ch2.f416z = c2145oS;
        return c0118ch2;
    }

    @Override // p000a.AbstractActivityC1187WD, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0326GG c0326gg = this.f8654I;
        if (c0326gg instanceof C0326GG) {
            c0326gg.m726u(EnumC1632eh.f5092w);
        }
        super.onSaveInstanceState(bundle);
        this.f8664q.m2712v(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f8665r.iterator();
        while (it.hasNext()) {
            ((InterfaceC1617eQ) it.next()).mo2146z(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC2575wW.m4452t()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f8666s.m1919z();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // p000a.InterfaceC0699NC
    /* renamed from: z */
    public final C0945Rm mo1635z() {
        C0945Rm c0945Rm = new C0945Rm(0);
        if (getApplication() != null) {
            c0945Rm.m2110h(C1710g8.f5383s, getApplication());
        }
        c0945Rm.m2110h(AbstractC1843ih.f5745I, this);
        c0945Rm.m2110h(AbstractC1843ih.f5757q, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c0945Rm.m2110h(AbstractC1843ih.f5755k, getIntent().getExtras());
        }
        return c0945Rm;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f8653H = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f8653H = false;
            Iterator it = this.f8655J.iterator();
            while (it.hasNext()) {
                ((InterfaceC1617eQ) it.next()).mo2146z(new C1925kC(z, 0));
            }
        } catch (Throwable th) {
            this.f8653H = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f8660e = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f8660e = false;
            Iterator it = this.f8659c.iterator();
            while (it.hasNext()) {
                ((InterfaceC1617eQ) it.next()).mo2146z(new C0160D7(z, 0));
            }
        } catch (Throwable th) {
            this.f8660e = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
