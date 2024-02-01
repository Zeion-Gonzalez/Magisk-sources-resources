package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.jo */
/* loaded from: classes.dex */
public abstract class AbstractC1902jo extends AbstractC2394t3 implements InterfaceC1172Vw {

    /* renamed from: S */
    public final /* synthetic */ int f5940S;

    public /* synthetic */ AbstractC1902jo(int i) {
        this.f5940S = i;
    }

    @Override // p000a.AbstractC2394t3
    /* renamed from: M */
    public final int mo2524M() {
        switch (this.f5940S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return R.drawable.ic_paypal;
            case 1:
                return R.drawable.ic_twitter;
            default:
                return R.drawable.ic_github;
        }
    }

    @Override // p000a.AbstractC2394t3
    /* renamed from: V */
    public String mo1794V() {
        switch (this.f5940S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return AbstractC2441tz.m4200k("https://paypal.me/", mo330u());
            default:
                return AbstractC2441tz.m4200k("https://twitter.com/", mo330u());
        }
    }
}
