package p000a;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* renamed from: a.gG */
/* loaded from: classes.dex */
public final class C1716gG extends AbstractC0227EK {

    /* renamed from: N */
    public final /* synthetic */ LayoutInflaterFactory2C1392a6 f5392N;

    /* renamed from: P */
    public final /* synthetic */ int f5393P = 1;

    /* renamed from: Q */
    public final Object f5394Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1716gG(LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6, C1174Vy c1174Vy) {
        super(layoutInflaterFactory2C1392a6);
        this.f5392N = layoutInflaterFactory2C1392a6;
        this.f5394Q = c1174Vy;
    }

    @Override // p000a.AbstractC0227EK
    /* renamed from: M */
    public final void mo437M() {
        int i = this.f5393P;
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = this.f5392N;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                layoutInflaterFactory2C1392a6.m2787I(true, true);
                return;
            default:
                layoutInflaterFactory2C1392a6.m2787I(true, true);
                return;
        }
    }

    @Override // p000a.AbstractC0227EK
    /* renamed from: P */
    public final IntentFilter mo439P() {
        switch (this.f5393P) {
            case AbstractC0795Op.f2698E /* 0 */:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0107 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    @Override // p000a.AbstractC0227EK
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo444o() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1716gG.mo444o():int");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1716gG(LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6, Context context) {
        super(layoutInflaterFactory2C1392a6);
        this.f5392N = layoutInflaterFactory2C1392a6;
        this.f5394Q = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
