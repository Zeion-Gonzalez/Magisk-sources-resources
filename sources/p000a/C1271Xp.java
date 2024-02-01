package p000a;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* renamed from: a.Xp */
/* loaded from: classes.dex */
public final class C1271Xp implements InterfaceC0699NC, InterfaceC0277FG, InterfaceC0670Mg {

    /* renamed from: R */
    public final C2145oS f4089R;

    /* renamed from: S */
    public final AbstractComponentCallbacksC2342s3 f4090S;

    /* renamed from: w */
    public final Runnable f4092w;

    /* renamed from: I */
    public C0326GG f4088I = null;

    /* renamed from: q */
    public C1330Yx f4091q = null;

    public C1271Xp(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3, C2145oS c2145oS, RunnableC0308Fs runnableC0308Fs) {
        this.f4090S = abstractComponentCallbacksC2342s3;
        this.f4089R = c2145oS;
        this.f4092w = runnableC0308Fs;
    }

    @Override // p000a.InterfaceC1546d7
    /* renamed from: C */
    public final C0326GG mo1354C() {
        m2597P();
        return this.f4088I;
    }

    @Override // p000a.InterfaceC0670Mg
    /* renamed from: G */
    public final C2145oS mo1569G() {
        m2597P();
        return this.f4089R;
    }

    /* renamed from: P */
    public final void m2597P() {
        if (this.f4088I == null) {
            this.f4088I = new C0326GG(this);
            C1330Yx c1330Yx = new C1330Yx(this);
            this.f4091q = c1330Yx;
            c1330Yx.m2713z();
            this.f4092w.run();
        }
    }

    @Override // p000a.InterfaceC0277FG
    /* renamed from: h */
    public final C1934kN mo576h() {
        m2597P();
        return this.f4091q.f4218h;
    }

    /* renamed from: v */
    public final void m2598v(EnumC2241qF enumC2241qF) {
        this.f4088I.m721N(enumC2241qF);
    }

    @Override // p000a.InterfaceC0699NC
    /* renamed from: z */
    public final C0945Rm mo1635z() {
        Application application;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f4090S;
        Context applicationContext = abstractComponentCallbacksC2342s3.m4004O().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C0945Rm c0945Rm = new C0945Rm(0);
        if (application != null) {
            c0945Rm.m2110h(C1710g8.f5383s, application);
        }
        c0945Rm.m2110h(AbstractC1843ih.f5745I, abstractComponentCallbacksC2342s3);
        c0945Rm.m2110h(AbstractC1843ih.f5757q, this);
        Bundle bundle = abstractComponentCallbacksC2342s3.f7210k;
        if (bundle != null) {
            c0945Rm.m2110h(AbstractC1843ih.f5755k, bundle);
        }
        return c0945Rm;
    }
}
