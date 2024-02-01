package p000a;

import java.util.ArrayList;

/* renamed from: a.xu */
/* loaded from: classes.dex */
public final class C2646xu implements InterfaceC0675Mm {

    /* renamed from: P */
    public final /* synthetic */ C0364Gx f8251P;

    /* renamed from: h */
    public final int f8252h;

    /* renamed from: v */
    public final int f8253v = 1;

    /* renamed from: z */
    public final String f8254z;

    public C2646xu(C0364Gx c0364Gx, String str, int i) {
        this.f8251P = c0364Gx;
        this.f8254z = str;
        this.f8252h = i;
    }

    @Override // p000a.InterfaceC0675Mm
    /* renamed from: z */
    public final boolean mo303z(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f8251P.f1250f;
        if (abstractComponentCallbacksC2342s3 == null || this.f8252h >= 0 || this.f8254z != null || !abstractComponentCallbacksC2342s3.m4008W().m838t()) {
            return this.f8251P.m792B(arrayList, arrayList2, this.f8254z, this.f8252h, this.f8253v);
        }
        return false;
    }
}
