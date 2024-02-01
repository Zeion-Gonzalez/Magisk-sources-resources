package p000a;

import android.view.View;
import java.util.ArrayList;

/* renamed from: a.C5 */
/* loaded from: classes.dex */
public final class C0107C5 extends AbstractC2262qa {

    /* renamed from: h */
    public final /* synthetic */ Object f397h;

    /* renamed from: v */
    public final /* synthetic */ Object f398v;

    /* renamed from: z */
    public final /* synthetic */ int f399z;

    public /* synthetic */ C0107C5(Object obj, int i, Object obj2) {
        this.f399z = i;
        this.f398v = obj;
        this.f397h = obj2;
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: P */
    public final void mo231P(AbstractC0614LY abstractC0614LY) {
        int i = this.f399z;
        Object obj = this.f397h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1331Yy c1331Yy = AbstractC0043At.f188z;
                c1331Yy.mo2166M((View) obj, 1.0f);
                c1331Yy.getClass();
                abstractC0614LY.mo1364J(this);
                return;
            case 1:
                ((ArrayList) ((C1186WB) obj).getOrDefault(((ViewTreeObserverOnPreDrawListenerC2015lu) this.f398v).f6257R, null)).remove(abstractC0614LY);
                abstractC0614LY.mo1364J(this);
                return;
            default:
                ((AbstractC0614LY) obj).mo1375e();
                abstractC0614LY.mo1364J(this);
                return;
        }
    }
}
