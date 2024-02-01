package p000a;

import android.content.ComponentName;

/* renamed from: a.pb */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2208pb implements Runnable {

    /* renamed from: I */
    public final /* synthetic */ int f6781I;

    /* renamed from: R */
    public final /* synthetic */ BinderC2198pP f6782R;

    /* renamed from: S */
    public final /* synthetic */ int f6783S;

    /* renamed from: w */
    public final /* synthetic */ ComponentName f6784w;

    public /* synthetic */ RunnableC2208pb(BinderC2198pP binderC2198pP, ComponentName componentName, int i, int i2) {
        this.f6783S = i2;
        this.f6782R = binderC2198pP;
        this.f6784w = componentName;
        this.f6781I = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6783S;
        int i2 = this.f6781I;
        ComponentName componentName = this.f6784w;
        BinderC2198pP binderC2198pP = this.f6782R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                binderC2198pP.getClass();
                componentName.getClassName();
                binderC2198pP.m3826p(i2, componentName);
                return;
            default:
                binderC2198pP.getClass();
                componentName.getClassName();
                binderC2198pP.m3826p(-1, componentName);
                binderC2198pP.m3823F(i2);
                return;
        }
    }
}
