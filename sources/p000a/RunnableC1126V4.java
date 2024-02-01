package p000a;

import android.view.ViewGroup;

/* renamed from: a.V4 */
/* loaded from: classes.dex */
public final class RunnableC1126V4 implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ AbstractComponentCallbacksC2342s3 f3675R;

    /* renamed from: S */
    public final /* synthetic */ int f3676S;

    public /* synthetic */ RunnableC1126V4(int i, AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        this.f3676S = i;
        this.f3675R = abstractComponentCallbacksC2342s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        C0364Gx c0364Gx;
        int i = this.f3676S;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f3675R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (abstractComponentCallbacksC2342s3.f7184D != null) {
                    abstractComponentCallbacksC2342s3.m4014o().getClass();
                    return;
                }
                return;
            default:
                if (abstractComponentCallbacksC2342s3.f7222t != null && (viewGroup = abstractComponentCallbacksC2342s3.f7196T) != null && (c0364Gx = abstractComponentCallbacksC2342s3.f7198X) != null) {
                    C0135Cc m266o = C0135Cc.m266o(viewGroup, c0364Gx);
                    m266o.m271W();
                    m266o.m269P();
                    return;
                }
                return;
        }
    }
}
