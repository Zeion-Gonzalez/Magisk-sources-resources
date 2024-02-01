package p000a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: a.fx */
/* loaded from: classes.dex */
public final class C1699fx extends AbstractC1021T9 implements InterfaceC1459bP {

    /* renamed from: I */
    public final /* synthetic */ C1608eG f5322I;

    /* renamed from: R */
    public final /* synthetic */ C1353ZK f5323R;

    /* renamed from: q */
    public final /* synthetic */ List f5324q;

    /* renamed from: w */
    public final /* synthetic */ boolean f5325w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1699fx(C1353ZK c1353zk, boolean z, C1608eG c1608eG, ArrayList arrayList) {
        super(0);
        this.f5323R = c1353zk;
        this.f5325w = z;
        this.f5322I = c1608eG;
        this.f5324q = arrayList;
    }

    @Override // p000a.InterfaceC1459bP
    /* renamed from: z */
    public final Object mo93z() {
        C1608eG c1608eG = this.f5322I;
        List list = this.f5324q;
        boolean z = this.f5325w;
        C1353ZK c1353zk = this.f5323R;
        AbstractC0438II.m994F(AbstractC2575wW.m4424d(c1353zk), null, new C2410tP(z, c1608eG, c1353zk, list, null), 3);
        return C0329GJ.f1115z;
    }
}
