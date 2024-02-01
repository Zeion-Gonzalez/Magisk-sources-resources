package p000a;

import java.util.List;

/* renamed from: a.fT */
/* loaded from: classes.dex */
public final class C1674fT extends AbstractCallableC0624Lj {

    /* renamed from: w */
    public final /* synthetic */ int f5238w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1674fT(C0776OS c0776os, List list, int i) {
        super(c0776os, list);
        this.f5238w = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int parseInt;
        switch (this.f5238w) {
            case AbstractC0795Op.f2698E /* 0 */:
                m1390z(false);
                return null;
            default:
                String m1390z = m1390z(true);
                if (m1390z == null) {
                    parseInt = 1;
                } else {
                    try {
                        parseInt = Integer.parseInt(m1390z);
                    } catch (NumberFormatException unused) {
                        return 1;
                    }
                }
                return Integer.valueOf(parseInt);
        }
    }
}
