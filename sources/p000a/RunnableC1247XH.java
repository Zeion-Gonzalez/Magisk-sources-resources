package p000a;

import android.graphics.Rect;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: a.XH */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1247XH implements Runnable {

    /* renamed from: I */
    public final /* synthetic */ Object f4046I;

    /* renamed from: R */
    public final /* synthetic */ Object f4047R;

    /* renamed from: S */
    public final /* synthetic */ int f4048S;

    /* renamed from: w */
    public final /* synthetic */ Object f4049w;

    public /* synthetic */ RunnableC1247XH(int i, Object obj, Object obj2, Object obj3) {
        this.f4048S = i;
        this.f4047R = obj;
        this.f4049w = obj2;
        this.f4046I = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4048S;
        Object obj = this.f4046I;
        Object obj2 = this.f4049w;
        Object obj3 = this.f4047R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                List list = (List) obj3;
                AbstractC0204Du abstractC0204Du = (AbstractC0204Du) obj2;
                C0135Cc c0135Cc = (C0135Cc) obj;
                if (list.contains(abstractC0204Du)) {
                    list.remove(abstractC0204Du);
                    c0135Cc.getClass();
                    AbstractC2441tz.m4209z(abstractC0204Du.f621z, abstractC0204Du.f620v.f7222t);
                    return;
                }
                return;
            case 1:
                ((AbstractC0119CI) obj3).getClass();
                AbstractC0119CI.m247u((View) obj2, (Rect) obj);
                return;
            case 2:
                ((C0135Cc) obj).f459z.endViewTransition((View) obj3);
                ((C2478uj) obj2).m446v();
                return;
            case 3:
                Executor executor = (Executor) obj2;
                InterfaceC2487ut interfaceC2487ut = (InterfaceC2487ut) obj;
                ArrayList arrayList = C0434IE.f1415g;
                C0876QR m972d3 = ((C0434IE) obj3).m972d3();
                if (interfaceC2487ut != null) {
                    if (executor == null) {
                        interfaceC2487ut.mo57h(m972d3);
                        return;
                    } else {
                        executor.execute(new RunnableC1547d8(m972d3, 15, interfaceC2487ut));
                        return;
                    }
                }
                return;
            case 4:
                InterfaceC1636el interfaceC1636el = (InterfaceC1636el) obj2;
                C0870QJ c0870qj = (C0870QJ) obj;
                C0727Nf c0727Nf = (C0727Nf) ((C1361ZT) obj3).f4272v;
                if (c0727Nf.f2454R.mo1687y()) {
                    interfaceC1636el.mo2754h(new IOException("Canceled"));
                    return;
                } else {
                    interfaceC1636el.mo2755z(c0727Nf, c0870qj);
                    return;
                }
            default:
                Object obj4 = ((C1361ZT) obj3).f4272v;
                ((InterfaceC1636el) obj2).mo2754h((Throwable) obj);
                return;
        }
    }

    public /* synthetic */ RunnableC1247XH(C0135Cc c0135Cc, View view, C2478uj c2478uj) {
        this.f4048S = 2;
        this.f4046I = c0135Cc;
        this.f4047R = view;
        this.f4049w = c2478uj;
    }
}
