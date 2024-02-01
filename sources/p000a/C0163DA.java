package p000a;

import javax.net.ssl.SSLSocket;

/* renamed from: a.DA */
/* loaded from: classes.dex */
public final class C0163DA implements InterfaceC0343GZ, InterfaceC2386su {

    /* renamed from: S */
    public final String f521S;

    public C0163DA() {
        this.f521S = "com.google.android.gms.org.conscrypt";
    }

    @Override // p000a.InterfaceC2386su
    /* renamed from: G */
    public void mo324G(C2554w5 c2554w5) {
    }

    @Override // p000a.InterfaceC2386su
    /* renamed from: V */
    public String mo325V() {
        return this.f521S;
    }

    @Override // p000a.InterfaceC0343GZ
    /* renamed from: h */
    public InterfaceC2391sz mo326h(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!AbstractC1292YB.m2695u(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C0943Rj(cls2);
    }

    @Override // p000a.InterfaceC0343GZ
    /* renamed from: z */
    public boolean mo327z(SSLSocket sSLSocket) {
        return sSLSocket.getClass().getName().startsWith(this.f521S + '.');
    }

    public C0163DA(String str) {
        this.f521S = str;
    }
}
