package p000a;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: a.NS */
/* loaded from: classes.dex */
public final class C0714NS extends AbstractC1911jx {

    /* renamed from: v */
    public static final C0003A3 f2405v;

    /* renamed from: h */
    public final List f2406h;

    /* renamed from: z */
    public final List f2407z;

    static {
        Pattern pattern = C0003A3.f64P;
        f2405v = C1710g8.m3223I("application/x-www-form-urlencoded");
    }

    public C0714NS(ArrayList arrayList, ArrayList arrayList2) {
        this.f2407z = AbstractC1181W6.m2428s(arrayList);
        this.f2406h = AbstractC1181W6.m2428s(arrayList2);
    }

    /* renamed from: P */
    public final long m1672P(InterfaceC1432as interfaceC1432as, boolean z) {
        C2361sQ mo947v;
        if (z) {
            mo947v = new C2361sQ();
        } else {
            mo947v = interfaceC1432as.mo947v();
        }
        List list = this.f2407z;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                mo947v.m4086nB(38);
            }
            mo947v.m4071Fu((String) list.get(i));
            mo947v.m4086nB(61);
            mo947v.m4071Fu((String) this.f2406h.get(i));
        }
        if (z) {
            long j = mo947v.f7260R;
            mo947v.m4091z();
            return j;
        }
        return 0L;
    }

    @Override // p000a.AbstractC1911jx
    /* renamed from: h */
    public final C0003A3 mo77h() {
        return f2405v;
    }

    @Override // p000a.AbstractC1911jx
    /* renamed from: v */
    public final void mo78v(InterfaceC1432as interfaceC1432as) {
        m1672P(interfaceC1432as, false);
    }

    @Override // p000a.AbstractC1911jx
    /* renamed from: z */
    public final long mo79z() {
        return m1672P(null, true);
    }
}
