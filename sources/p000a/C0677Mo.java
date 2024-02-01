package p000a;

import android.content.res.Resources;
import android.view.View;
import com.topjohnwu.magisk.R;

/* renamed from: a.Mo */
/* loaded from: classes.dex */
public final class C0677Mo extends AbstractC1881jR {

    /* renamed from: I */
    public static final C0677Mo f2230I = new C0677Mo();

    /* renamed from: q */
    public static final C0639M1 f2233q = new C0639M1(R.string.language);

    /* renamed from: k */
    public static String[] f2232k = new String[0];

    /* renamed from: g */
    public static String[] f2231g = new String[0];

    /* renamed from: y */
    public static int f2234y = -1;

    @Override // p000a.AbstractC1881jR
    /* renamed from: E */
    public final String[] mo1574E(Resources resources) {
        return f2232k;
    }

    @Override // p000a.AbstractC1881jR, p000a.AbstractC2207pZ
    /* renamed from: I */
    public final void mo1575I(View view, C0316G1 c0316g1) {
        if ((!(f2232k.length == 0)) == true) {
            super.mo1575I(view, c0316g1);
        }
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f2233q;
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: U */
    public final String[] mo1576U(Resources resources) {
        return f2232k;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        int intValue = ((Number) obj).intValue();
        f2234y = intValue;
        C1212We c1212We = C1212We.f3969z;
        String str = f2231g[intValue];
        c1212We.getClass();
        C1212We.f3951U.m2854nB(c1212We, C1212We.f3959h[17], str);
        AbstractC1685fh.m3178z();
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        return Integer.valueOf(f2234y);
    }
}
