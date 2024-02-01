package p000a;

import java.lang.reflect.Array;
import java.util.Iterator;

/* renamed from: a.cw */
/* loaded from: classes.dex */
public final class C1534cw extends AbstractC1500cH {

    /* renamed from: h */
    public final /* synthetic */ int f4735h;

    /* renamed from: v */
    public final /* synthetic */ AbstractC1500cH f4736v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1534cw(AbstractC1500cH abstractC1500cH, int i) {
        super(12);
        this.f4735h = i;
        this.f4736v = abstractC1500cH;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: z */
    public final void mo332z(C1120Uy c1120Uy, Object obj) {
        int i = this.f4735h;
        AbstractC1500cH abstractC1500cH = this.f4736v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        abstractC1500cH.mo332z(c1120Uy, it.next());
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        abstractC1500cH.mo332z(c1120Uy, Array.get(obj, i2));
                    }
                    return;
                }
                return;
        }
    }
}
