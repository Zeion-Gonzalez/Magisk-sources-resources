package p000a;

import android.content.ComponentName;

/* renamed from: a.fW */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1677fW implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ BinderC2198pP f5247R;

    /* renamed from: S */
    public final /* synthetic */ int f5248S;

    /* renamed from: w */
    public final /* synthetic */ ComponentName f5249w;

    public /* synthetic */ RunnableC1677fW(BinderC2198pP binderC2198pP, ComponentName componentName, int i) {
        this.f5248S = i;
        this.f5247R = binderC2198pP;
        this.f5249w = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5248S;
        ComponentName componentName = this.f5249w;
        BinderC2198pP binderC2198pP = this.f5247R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                binderC2198pP.getClass();
                componentName.getClassName();
                binderC2198pP.m3826p(-1, componentName);
                return;
            default:
                binderC2198pP.f6761S.remove(componentName);
                return;
        }
    }
}
