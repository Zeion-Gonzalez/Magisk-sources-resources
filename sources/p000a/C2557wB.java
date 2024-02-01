package p000a;

import android.content.res.Resources;
import com.topjohnwu.magisk.R;
import java.util.Arrays;

/* renamed from: a.wB */
/* loaded from: classes.dex */
public final class C2557wB extends AbstractC1881jR {

    /* renamed from: I */
    public static final C2557wB f7809I = new C2557wB();

    /* renamed from: q */
    public static final C0639M1 f7811q = new C0639M1(R.string.settings_update_channel_title);

    /* renamed from: k */
    public static final int f7810k = R.array.update_channel;

    @Override // p000a.AbstractC1881jR
    /* renamed from: E */
    public final String[] mo1574E(Resources resources) {
        String[] mo1574E = super.mo1574E(resources);
        String str = AbstractC0598LC.f1921z;
        AbstractC1292YB.m2676g(3, mo1574E.length);
        return (String[]) Arrays.copyOfRange(mo1574E, 0, 3);
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f7811q;
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: r */
    public final int mo1461r() {
        return f7810k;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        int intValue = ((Number) obj).intValue();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3950S.mo2367P(c1212We, C1212We.f3959h[7], Integer.valueOf(intValue));
        C1910jw.f5956P = C1910jw.f5965v;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        return Integer.valueOf(C1212We.f3969z.m2496N());
    }
}
