package com.topjohnwu.magisk.p001ui.surequest;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.topjohnwu.magisk.R;
import p000a.AbstractActivityC0819PG;
import p000a.AbstractC0037Al;
import p000a.AbstractC0438II;
import p000a.AbstractC1292YB;
import p000a.AbstractC2575wW;
import p000a.AbstractC2615xD;
import p000a.C0908R7;
import p000a.C1001Sm;
import p000a.C1212We;
import p000a.C1885jV;
import p000a.C2264qc;
import p000a.EnumC0511Je;
import p000a.EnumC2349sC;
import p000a.InterfaceC1841if;

/* loaded from: classes.dex */
public class SuRequestActivity extends AbstractActivityC0819PG {

    /* renamed from: b */
    public final InterfaceC1841if f9620b;

    /* renamed from: l */
    public final int f9621l = R.layout.activity_request;

    public SuRequestActivity() {
        int i = EnumC0511Je.f1697S;
        this.f9620b = AbstractC0438II.m1020Z(new C0908R7(this, 9));
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finishAndRemoveTask();
    }

    @Override // p000a.AbstractActivityC0819PG
    /* renamed from: g */
    public final int mo1923g() {
        return this.f9621l;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = super.getTheme();
        theme.applyStyle(2131951933, true);
        return theme;
    }

    @Override // androidx.activity.AbstractActivityC2754z, android.app.Activity
    public final void onBackPressed() {
        ((C1885jV) this.f9620b.getValue()).m3506I(1);
    }

    @Override // p000a.AbstractActivityC0819PG, p000a.AbstractActivityC0402He, p000a.AbstractActivityC0502JU, androidx.activity.AbstractActivityC2754z, p000a.AbstractActivityC1187WD, android.app.Activity
    public final void onCreate(Bundle bundle) {
        EnumC2349sC enumC2349sC;
        m1201R().mo2790M(1);
        setRequestedOrientation(14);
        getWindow().addFlags(128);
        getWindow().addFlags(3);
        if (Build.VERSION.SDK_INT >= 31) {
            getWindow().setHideOverlayWindows(true);
        }
        EnumC2349sC.f7239w.getClass();
        EnumC2349sC[] enumC2349sCArr = (EnumC2349sC[]) EnumC2349sC.f7238q.clone();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        int intValue = C1212We.f3943I.m1196O4(c1212We, C1212We.f3959h[10]).intValue();
        if (intValue >= 0 && intValue <= enumC2349sCArr.length - 1) {
            enumC2349sC = enumC2349sCArr[intValue];
        } else {
            enumC2349sC = null;
        }
        if (enumC2349sC == null) {
            enumC2349sC = EnumC2349sC.f7237I;
        }
        setTheme(enumC2349sC.f7240R);
        super.onCreate(bundle);
        if (AbstractC1292YB.m2695u(getIntent().getAction(), "android.intent.action.VIEW")) {
            String stringExtra = getIntent().getStringExtra("action");
            if (AbstractC1292YB.m2695u(stringExtra, "request")) {
                C1885jV c1885jV = (C1885jV) this.f9620b.getValue();
                Intent intent = getIntent();
                c1885jV.getClass();
                AbstractC0438II.m994F(AbstractC2575wW.m4424d(c1885jV), AbstractC0037Al.f179z, new C1001Sm(c1885jV, intent, null), 2);
                return;
            }
            AbstractC0438II.m994F(AbstractC2575wW.m4423c(this), null, new C2264qc(this, stringExtra, null), 3);
            return;
        }
        finish();
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C1885jV) this.f9620b.getValue();
    }
}
