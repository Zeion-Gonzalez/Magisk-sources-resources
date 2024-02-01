package p000a;

import android.content.SharedPreferences;

/* renamed from: a.ak */
/* loaded from: classes.dex */
public final class C1424ak extends AbstractC2703z2 implements InterfaceC1576dd {

    /* renamed from: I */
    public final boolean f4461I;

    /* renamed from: R */
    public final String f4462R;

    /* renamed from: w */
    public final String f4463w;

    public C1424ak(String str, String str2, boolean z) {
        super(8);
        this.f4462R = str;
        this.f4463w = str2;
        this.f4461I = z;
    }

    /* renamed from: O4 */
    public final String m2853O4(InterfaceC2101nb interfaceC2101nb, InterfaceC0609LP interfaceC0609LP) {
        String str = this.f4462R;
        if (AbstractC1269Xn.m2579T0(str)) {
            str = ((AbstractC2171ov) interfaceC0609LP).f6651I;
        }
        SharedPreferences m2501v = ((C1212We) interfaceC2101nb).m2501v();
        String str2 = this.f4463w;
        String string = m2501v.getString(str, str2);
        if (string != null) {
            return string;
        }
        return str2;
    }

    /* renamed from: nB */
    public final void m2854nB(InterfaceC2101nb interfaceC2101nb, InterfaceC0609LP interfaceC0609LP, String str) {
        String str2 = this.f4462R;
        if (AbstractC1269Xn.m2579T0(str2)) {
            str2 = ((AbstractC2171ov) interfaceC0609LP).f6651I;
        }
        SharedPreferences.Editor edit = ((C1212We) interfaceC2101nb).m2501v().edit();
        edit.putString(str2, str);
        if (this.f4461I) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
