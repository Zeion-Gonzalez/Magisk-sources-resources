package p000a;

import android.os.Build;
import android.os.Bundle;
import com.topjohnwu.magisk.R;

/* renamed from: a.tj */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2427tj extends AbstractActivityC1957kp {

    /* renamed from: nP */
    public static boolean f7429nP;

    /* renamed from: b */
    public boolean f7430b;

    @Override // p000a.AbstractActivityC0819PG, p000a.AbstractActivityC0402He, p000a.AbstractActivityC0502JU, androidx.activity.AbstractActivityC2754z, p000a.AbstractActivityC1187WD, android.app.Activity
    public final void onCreate(Bundle bundle) {
        EnumC2349sC enumC2349sC;
        C0489JE c0489je;
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
        if (AbstractC0795Op.m1857n() && !f7429nP) {
            getTheme().applyStyle(R.style.StubSplashTheme, true);
        }
        super.onCreate(bundle);
        if (!AbstractC0795Op.m1857n()) {
            if (Build.VERSION.SDK_INT >= 31) {
                c0489je = new C0005A5(this);
            } else {
                c0489je = new C0489JE(this);
            }
            c0489je.mo25z();
            c0489je.mo24h(new C1447b9(5));
        }
        if (f7429nP) {
            m4175r(bundle);
        } else {
            AbstractC0795Op.m1830U(AbstractC0017AI.f108S, new C0351Gh(this, bundle));
        }
    }

    @Override // p000a.AbstractActivityC0819PG, p000a.AbstractActivityC0502JU, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f7430b) {
            m4175r(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x00b4  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4175r(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractActivityC2427tj.m4175r(android.os.Bundle):void");
    }
}
