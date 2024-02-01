package p000a;

import android.content.SharedPreferences;

/* renamed from: a.JX */
/* loaded from: classes.dex */
public final class C0504JX extends AbstractC2703z2 implements InterfaceC1576dd {

    /* renamed from: I */
    public final boolean f1683I;

    /* renamed from: R */
    public final String f1684R;

    /* renamed from: w */
    public final int f1685w;

    public C0504JX(int i, String str, boolean z) {
        super(8);
        this.f1684R = str;
        this.f1685w = i;
        this.f1683I = z;
    }

    /* renamed from: O4 */
    public final Integer m1196O4(InterfaceC2101nb interfaceC2101nb, InterfaceC0609LP interfaceC0609LP) {
        String str = this.f1684R;
        if (AbstractC1269Xn.m2579T0(str)) {
            str = ((AbstractC2171ov) interfaceC0609LP).f6651I;
        }
        return Integer.valueOf(((C1212We) interfaceC2101nb).m2501v().getInt(str, this.f1685w));
    }

    /* renamed from: nB */
    public final void m1197nB(InterfaceC2101nb interfaceC2101nb, InterfaceC0609LP interfaceC0609LP, int i) {
        String str = this.f1684R;
        if (AbstractC1269Xn.m2579T0(str)) {
            str = ((AbstractC2171ov) interfaceC0609LP).f6651I;
        }
        SharedPreferences.Editor edit = ((C1212We) interfaceC2101nb).m2501v().edit();
        edit.putInt(str, i);
        if (this.f1683I) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
