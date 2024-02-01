package p000a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import android.widget.Toast;

/* renamed from: a.ah */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1421ah implements Runnable {

    /* renamed from: I */
    public final /* synthetic */ Object f4456I;

    /* renamed from: R */
    public final /* synthetic */ int f4457R;

    /* renamed from: S */
    public final /* synthetic */ int f4458S;

    /* renamed from: w */
    public final /* synthetic */ Object f4459w;

    public /* synthetic */ RunnableC1421ah(int i, int i2, Object obj, Object obj2) {
        this.f4458S = i2;
        this.f4456I = obj;
        this.f4457R = i;
        this.f4459w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4458S;
        Object obj = this.f4459w;
        int i2 = this.f4457R;
        Object obj2 = this.f4456I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C1665fK) ((C1825iN) obj2).f5713v).m3157y(i2, obj);
                return;
            case 1:
                ((C1665fK) ((InterfaceC0310Fv) obj2)).m3157y(i2, obj);
                return;
            case 2:
                Toast.makeText((Context) obj2, (CharSequence) obj, i2).show();
                return;
            default:
                BinderC2198pP binderC2198pP = (BinderC2198pP) obj2;
                IBinder iBinder = (IBinder) obj;
                SparseArray sparseArray = binderC2198pP.f6760R;
                if (sparseArray.get(i2) == null) {
                    try {
                        sparseArray.put(i2, new C1539d0(i2, iBinder, binderC2198pP));
                        AbstractC1110Un.f3614z.removeCallbacks(binderC2198pP);
                        return;
                    } catch (RemoteException e) {
                        AbstractC1292YB.m2644E("IPC", e);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC1421ah(Context context, String str) {
        this.f4458S = 2;
        this.f4456I = context;
        this.f4459w = str;
        this.f4457R = 0;
    }
}
