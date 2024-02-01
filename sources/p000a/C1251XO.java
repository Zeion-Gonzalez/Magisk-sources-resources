package p000a;

/* renamed from: a.XO */
/* loaded from: classes.dex */
public final class C1251XO {

    /* renamed from: h */
    public InterfaceC2447u5 f4059h;

    /* renamed from: v */
    public boolean f4060v;

    /* renamed from: z */
    public boolean f4061z;

    /* renamed from: h */
    public final void m2556h(InterfaceC2447u5 interfaceC2447u5) {
        synchronized (this) {
            while (this.f4060v) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f4059h == interfaceC2447u5) {
                return;
            }
            this.f4059h = interfaceC2447u5;
            if (this.f4061z) {
                interfaceC2447u5.mo59z();
            }
        }
    }

    /* renamed from: z */
    public final void m2557z() {
        synchronized (this) {
            if (this.f4061z) {
                return;
            }
            this.f4061z = true;
            this.f4060v = true;
            InterfaceC2447u5 interfaceC2447u5 = this.f4059h;
            if (interfaceC2447u5 != null) {
                try {
                    interfaceC2447u5.mo59z();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f4060v = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f4060v = false;
                notifyAll();
            }
        }
    }
}
