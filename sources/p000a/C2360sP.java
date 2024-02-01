package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.topjohnwu.magisk.R;

/* renamed from: a.sP */
/* loaded from: classes.dex */
public final class C2360sP extends AbstractC1378Zn {

    /* renamed from: I */
    public static final C2360sP f7255I = new C2360sP();

    /* renamed from: q */
    public static final C0639M1 f7258q = new C0639M1(R.string.settings_hide_app_title);

    /* renamed from: k */
    public static final C0639M1 f7257k = new C0639M1(R.string.settings_hide_app_summary);

    /* renamed from: g */
    public static String f7256g = "";

    /* renamed from: y */
    public static String f7259y = "Settings";

    public C2360sP() {
        super(0);
    }

    @Override // p000a.AbstractC1378Zn
    /* renamed from: E */
    public final View mo2773E(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        int i = AbstractC0188Dd.f579i;
        AbstractC0188Dd abstractC0188Dd = (AbstractC0188Dd) AbstractC2307rQ.m3967v(from, R.layout.dialog_settings_app_name, null, false);
        C0210E0 c0210e0 = (C0210E0) abstractC0188Dd;
        c0210e0.m4818g(0, this);
        c0210e0.f580L = this;
        synchronized (c0210e0) {
            c0210e0.f666n |= 1;
        }
        c0210e0.m2861Q(6);
        c0210e0.m4816I();
        return abstractC0188Dd.f8982k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        return f7257k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f7258q;
    }

    @Override // p000a.AbstractC1378Zn
    /* renamed from: U */
    public final String mo2775U() {
        boolean z;
        if (f7259y.length() <= 32 && !AbstractC1269Xn.m2579T0(f7259y)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        return f7259y;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        f7256g = (String) obj;
    }
}
