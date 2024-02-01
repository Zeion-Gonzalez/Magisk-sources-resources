package p000a;

import android.app.Application;
import android.content.Context;

/* renamed from: a.cF */
/* loaded from: classes.dex */
public final class C1498cF extends AbstractC1021T9 implements InterfaceC1459bP {

    /* renamed from: R */
    public final /* synthetic */ C1553dE f4648R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1498cF(C1553dE c1553dE) {
        super(0);
        this.f4648R = c1553dE;
    }

    @Override // p000a.InterfaceC1459bP
    /* renamed from: z */
    public final Object mo93z() {
        Context context;
        C1553dE c1553dE = this.f4648R;
        Context context2 = c1553dE.f4791S;
        Application application = null;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = (Application) context;
        }
        return new C2643xq(application, c1553dE, c1553dE.m3023v());
    }
}
