package p000a;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: a.Gp */
/* loaded from: classes.dex */
public abstract class AbstractC0356Gp {

    /* renamed from: v */
    public InterfaceC1459bP f1204v;

    /* renamed from: z */
    public boolean f1205z = false;

    /* renamed from: h */
    public final CopyOnWriteArrayList f1203h = new CopyOnWriteArrayList();

    /* renamed from: z */
    public final void m778z(boolean z) {
        this.f1205z = z;
        InterfaceC1459bP interfaceC1459bP = this.f1204v;
        if (interfaceC1459bP != null) {
            interfaceC1459bP.mo93z();
        }
    }
}
