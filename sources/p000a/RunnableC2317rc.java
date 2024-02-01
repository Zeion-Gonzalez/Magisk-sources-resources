package p000a;

import android.view.MenuItem;

/* renamed from: a.rc */
/* loaded from: classes.dex */
public final class RunnableC2317rc implements Runnable {

    /* renamed from: I */
    public final /* synthetic */ C2196pM f7140I;

    /* renamed from: R */
    public final /* synthetic */ MenuItem f7141R;

    /* renamed from: S */
    public final /* synthetic */ C0041Ar f7142S;

    /* renamed from: w */
    public final /* synthetic */ C2189pE f7143w;

    public RunnableC2317rc(C2196pM c2196pM, C0041Ar c0041Ar, C1117Uu c1117Uu, C2189pE c2189pE) {
        this.f7140I = c2196pM;
        this.f7142S = c0041Ar;
        this.f7141R = c1117Uu;
        this.f7143w = c2189pE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0041Ar c0041Ar = this.f7142S;
        if (c0041Ar != null) {
            C2196pM c2196pM = this.f7140I;
            ((ViewOnKeyListenerC0205Dw) c2196pM.f6755R).f635d = true;
            c0041Ar.f183h.m3804v(false);
            ((ViewOnKeyListenerC0205Dw) c2196pM.f6755R).f635d = false;
        }
        MenuItem menuItem = this.f7141R;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f7143w.m3801q(menuItem, null, 4);
        }
    }
}
