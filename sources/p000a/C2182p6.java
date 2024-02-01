package p000a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.p6 */
/* loaded from: classes.dex */
public final class C2182p6 extends AbstractC1476bl {

    /* renamed from: P */
    public final /* synthetic */ Matrix f6680P;

    /* renamed from: v */
    public final /* synthetic */ List f6681v;

    public C2182p6(ArrayList arrayList, Matrix matrix) {
        this.f6681v = arrayList;
        this.f6680P = matrix;
    }

    @Override // p000a.AbstractC1476bl
    /* renamed from: z */
    public final void mo1798z(Matrix matrix, C1883jT c1883jT, int i, Canvas canvas) {
        Iterator it = this.f6681v.iterator();
        while (it.hasNext()) {
            ((AbstractC1476bl) it.next()).mo1798z(this.f6680P, c1883jT, i, canvas);
        }
    }
}
