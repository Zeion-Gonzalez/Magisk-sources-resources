package p000a;

import android.os.IBinder;
import android.os.Messenger;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a.d0 */
/* loaded from: classes.dex */
public final class C1539d0 extends AbstractC1693fp {

    /* renamed from: P */
    public final /* synthetic */ BinderC2198pP f4766P;

    /* renamed from: h */
    public final Messenger f4767h;

    /* renamed from: v */
    public final int f4768v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539d0(int i, IBinder iBinder, BinderC2198pP binderC2198pP) {
        super(iBinder);
        this.f4766P = binderC2198pP;
        this.f4767h = new Messenger(iBinder);
        this.f4768v = i;
    }

    @Override // p000a.AbstractC1693fp
    /* renamed from: z */
    public final void mo2408z() {
        BinderC2198pP binderC2198pP = this.f4766P;
        SparseArray sparseArray = binderC2198pP.f6760R;
        int i = this.f4768v;
        sparseArray.remove(i);
        Iterator it = binderC2198pP.f6761S.entrySet().iterator();
        while (it.hasNext()) {
            C2452uC c2452uC = (C2452uC) ((Map.Entry) it.next()).getValue();
            if (i < 0) {
                c2452uC.f7526h.clear();
            }
            binderC2198pP.m3822C(c2452uC, i, new RunnableC0308Fs(17, it));
        }
    }
}
