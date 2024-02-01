package p000a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: a.z7 */
/* loaded from: classes.dex */
public final class C2707z7 implements InterfaceC1007St {

    /* renamed from: N */
    public final /* synthetic */ List f8529N;

    /* renamed from: P */
    public final /* synthetic */ String f8530P;

    /* renamed from: h */
    public final /* synthetic */ CountDownLatch f8531h;

    /* renamed from: v */
    public final /* synthetic */ C2259qX f8532v;

    /* renamed from: z */
    public final /* synthetic */ List f8533z;

    public C2707z7(ArrayList arrayList, CountDownLatch countDownLatch, C2259qX c2259qX, String str, ArrayList arrayList2) {
        this.f8533z = arrayList;
        this.f8531h = countDownLatch;
        this.f8532v = c2259qX;
        this.f8530P = str;
        this.f8529N = arrayList2;
    }

    @Override // p000a.InterfaceC1007St
    /* renamed from: h */
    public final void mo718h(C1429ap c1429ap) {
        C2259qX c2259qX = this.f8532v;
        String str = this.f8530P;
        List list = this.f8529N;
        List list2 = this.f8533z;
        c2259qX.getClass();
        try {
            ArrayList m3899v = C2259qX.m3899v(str, c1429ap);
            synchronized (list) {
                list.addAll(m3899v);
            }
        } catch (Exception e) {
            synchronized (list2) {
                list2.add(e);
            }
        }
        this.f8531h.countDown();
    }

    @Override // p000a.InterfaceC1007St
    /* renamed from: z */
    public final void mo719z(IOException iOException) {
        List list = this.f8533z;
        synchronized (list) {
            list.add(iOException);
        }
        this.f8531h.countDown();
    }
}
