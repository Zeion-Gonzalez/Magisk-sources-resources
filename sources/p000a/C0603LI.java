package p000a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.LI */
/* loaded from: classes.dex */
public final class C0603LI extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ C1909jv f1960I;

    /* renamed from: R */
    public final /* synthetic */ C1216Wj f1961R;

    /* renamed from: k */
    public final /* synthetic */ Bundle f1962k;

    /* renamed from: q */
    public final /* synthetic */ AbstractC2499v4 f1963q;

    /* renamed from: w */
    public final /* synthetic */ List f1964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0603LI(C1216Wj c1216Wj, ArrayList arrayList, C1909jv c1909jv, AbstractC2499v4 abstractC2499v4, Bundle bundle) {
        super(1);
        this.f1961R = c1216Wj;
        this.f1964w = arrayList;
        this.f1960I = c1909jv;
        this.f1963q = abstractC2499v4;
        this.f1962k = bundle;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        List list;
        C1553dE c1553dE = (C1553dE) obj;
        this.f1961R.f3980S = true;
        List list2 = this.f1964w;
        int indexOf = list2.indexOf(c1553dE);
        if (indexOf != -1) {
            C1909jv c1909jv = this.f1960I;
            int i = indexOf + 1;
            list = list2.subList(c1909jv.f5951S, i);
            c1909jv.f5951S = i;
        } else {
            list = C1239X8.f4021S;
        }
        this.f1963q.m4348z(c1553dE.f4790R, this.f1962k, c1553dE, list);
        return C0329GJ.f1115z;
    }
}
