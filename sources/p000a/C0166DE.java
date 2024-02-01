package p000a;

import java.io.IOException;

/* renamed from: a.DE */
/* loaded from: classes.dex */
public final class C0166DE implements InterfaceC1459bP {

    /* renamed from: R */
    public final /* synthetic */ C0669Mf f523R;

    /* renamed from: S */
    public final C2167or f524S;

    public C0166DE(C0669Mf c0669Mf, C2167or c2167or) {
        this.f523R = c0669Mf;
        this.f524S = c2167or;
    }

    @Override // p000a.InterfaceC1459bP
    /* renamed from: z */
    public final Object mo93z() {
        Throwable th;
        EnumC0754O6 enumC0754O6;
        C0669Mf c0669Mf = this.f523R;
        C2167or c2167or = this.f524S;
        EnumC0754O6 enumC0754O62 = EnumC0754O6.f2558I;
        IOException e = null;
        try {
            c2167or.m3783h(this);
            do {
            } while (c2167or.m3786z(false, this));
            enumC0754O6 = EnumC0754O6.f2559R;
        } catch (IOException e2) {
            e = e2;
            enumC0754O6 = enumC0754O62;
        } catch (Throwable th2) {
            th = th2;
            enumC0754O6 = enumC0754O62;
            c0669Mf.m1568z(enumC0754O6, enumC0754O62, e);
            AbstractC1181W6.m2430v(c2167or);
            throw th;
        }
        try {
            try {
                c0669Mf.m1568z(enumC0754O6, EnumC0754O6.f2560g, null);
            } catch (Throwable th3) {
                th = th3;
                c0669Mf.m1568z(enumC0754O6, enumC0754O62, e);
                AbstractC1181W6.m2430v(c2167or);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            EnumC0754O6 enumC0754O63 = EnumC0754O6.f2563w;
            c0669Mf.m1568z(enumC0754O63, enumC0754O63, e);
            AbstractC1181W6.m2430v(c2167or);
            return C0329GJ.f1115z;
        }
        AbstractC1181W6.m2430v(c2167or);
        return C0329GJ.f1115z;
    }
}
