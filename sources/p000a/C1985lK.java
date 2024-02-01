package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.topjohnwu.magisk.R;

/* renamed from: a.lK */
/* loaded from: classes.dex */
public final class C1985lK extends AbstractC1378Zn {

    /* renamed from: k */
    public static String f6154k;

    /* renamed from: I */
    public static final C1985lK f6153I = new C1985lK();

    /* renamed from: q */
    public static final C0639M1 f6155q = new C0639M1(R.string.settings_update_custom);

    static {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        f6154k = C1212We.f3964s.m2853O4(c1212We, C1212We.f3959h[16]);
    }

    public C1985lK() {
        super(0);
    }

    @Override // p000a.AbstractC1378Zn
    /* renamed from: E */
    public final View mo2773E(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        int i = AbstractC2004lh.f6228i;
        AbstractC2004lh abstractC2004lh = (AbstractC2004lh) AbstractC2307rQ.m3967v(from, R.layout.dialog_settings_update_channel, null, false);
        C2336rx c2336rx = (C2336rx) abstractC2004lh;
        c2336rx.m4818g(0, this);
        c2336rx.f6229L = this;
        synchronized (c2336rx) {
            c2336rx.f7174O |= 1;
        }
        c2336rx.m2861Q(6);
        c2336rx.m4816I();
        return abstractC2004lh.f8982k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        return new C1961ku(C1212We.f3964s.m2853O4(c1212We, C1212We.f3959h[16]));
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f6155q;
    }

    @Override // p000a.AbstractC1378Zn
    /* renamed from: U */
    public final String mo2775U() {
        return f6154k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: k */
    public final void mo2844k() {
        boolean z;
        C2557wB.f7809I.getClass();
        if (Integer.valueOf(C1212We.f3969z.m2496N()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        m3848g(z);
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[16];
        C1212We.f3964s.m2854nB(c1212We, interfaceC0609LP, (String) obj);
        C1910jw.f5956P = C1910jw.f5965v;
        AbstractC0795Op.m1801B(this, 8);
    }
}
