package p000a;

import android.util.Log;
import java.util.List;

/* renamed from: a.yE */
/* loaded from: classes.dex */
public final class C2663yE extends AbstractC1021T9 implements InterfaceC1459bP {

    /* renamed from: I */
    public final /* synthetic */ Object f8302I;

    /* renamed from: R */
    public final /* synthetic */ int f8303R;

    /* renamed from: q */
    public final /* synthetic */ Object f8304q;

    /* renamed from: w */
    public final /* synthetic */ Object f8305w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2663yE(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.f8303R = i;
        this.f8305w = obj;
        this.f8302I = obj2;
        this.f8304q = obj3;
    }

    /* renamed from: h */
    public final List m4569h() {
        return ((C2216pl) this.f8305w).f6825h.mo1054R(((C2305rO) this.f8304q).f7113W.f8279P, ((C2254qS) this.f8302I).m3898z());
    }

    @Override // p000a.InterfaceC1459bP
    /* renamed from: z */
    public final Object mo93z() {
        switch (this.f8303R) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0904R3 c0904r3 = (C0904R3) this.f8302I;
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = (AbstractComponentCallbacksC2342s3) this.f8304q;
                for (C1553dE c1553dE : (Iterable) c0904r3.f3093Q.getValue()) {
                    if (C0364Gx.m791p(2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + c1553dE + " due to fragment " + abstractComponentCallbacksC2342s3 + " viewmodel being cleared");
                    }
                    c0904r3.m2057h(c1553dE);
                }
                return C0329GJ.f1115z;
            default:
                return m4569h();
        }
    }
}
