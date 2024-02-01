package p000a;

import android.content.SharedPreferences;

/* renamed from: a.hx */
/* loaded from: classes.dex */
public final class C1803hx extends AbstractC2703z2 implements InterfaceC1576dd {

    /* renamed from: I */
    public final boolean f5665I;

    /* renamed from: R */
    public final String f5666R;

    /* renamed from: w */
    public final boolean f5667w;

    public C1803hx(String str, boolean z, boolean z2) {
        super(8);
        this.f5666R = str;
        this.f5667w = z;
        this.f5665I = z2;
    }

    /* renamed from: O4 */
    public final Boolean m3358O4(InterfaceC2101nb interfaceC2101nb, InterfaceC0609LP interfaceC0609LP) {
        String str = this.f5666R;
        if (AbstractC1269Xn.m2579T0(str)) {
            str = ((AbstractC2171ov) interfaceC0609LP).f6651I;
        }
        return Boolean.valueOf(((C1212We) interfaceC2101nb).m2501v().getBoolean(str, this.f5667w));
    }

    /* renamed from: nB */
    public final void m3359nB(InterfaceC2101nb interfaceC2101nb, InterfaceC0609LP interfaceC0609LP, boolean z) {
        String str = this.f5666R;
        if (AbstractC1269Xn.m2579T0(str)) {
            str = ((AbstractC2171ov) interfaceC0609LP).f6651I;
        }
        SharedPreferences.Editor edit = ((C1212We) interfaceC2101nb).m2501v().edit();
        edit.putBoolean(str, z);
        if (this.f5665I) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
