package p000a;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: a.va */
/* loaded from: classes.dex */
public final class C2529va extends C0799Ov {

    /* renamed from: N */
    public static final C2252qQ f7743N;

    /* renamed from: Q */
    public static final boolean f7744Q;

    /* renamed from: P */
    public final C2217pm f7745P;

    /* renamed from: v */
    public final ArrayList f7746v;

    static {
        boolean z = false;
        z = false;
        f7743N = new C2252qQ(10, z ? 1 : 0);
        if (C2252qQ.m3886R() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f7744Q = z;
    }

    public C2529va() {
        C1005Sq c1005Sq;
        Method method;
        Method method2;
        InterfaceC2391sz[] interfaceC2391szArr = new InterfaceC2391sz[4];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c1005Sq = new C1005Sq(cls);
        } catch (Exception e) {
            C0799Ov.f2726z.getClass();
            C0799Ov.m1881W(5, "unable to load android socket classes", e);
            c1005Sq = null;
        }
        interfaceC2391szArr[0] = c1005Sq;
        interfaceC2391szArr[1] = new C0484J6(C0943Rj.f3237Q);
        interfaceC2391szArr[2] = new C0484J6(C0514Jh.f1709z.m3896S());
        interfaceC2391szArr[3] = new C0484J6(C1820iH.f5690z.m3896S());
        ArrayList m3131Lq = AbstractC1658fB.m3131Lq(interfaceC2391szArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = m3131Lq.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC2391sz) next).mo1168v()) {
                arrayList.add(next);
            }
        }
        this.f7746v = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f7745P = new C2217pm(method3, method2, method);
    }

    @Override // p000a.C0799Ov
    /* renamed from: M */
    public final void mo1882M(String str, Object obj) {
        C2217pm c2217pm = this.f7745P;
        c2217pm.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                c2217pm.f6828v.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            C0799Ov.m1880G(this, str, 5, 4);
        }
    }

    @Override // p000a.C0799Ov
    /* renamed from: N */
    public final void mo1883N(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // p000a.C0799Ov
    /* renamed from: P */
    public final void mo297P(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.f7746v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((InterfaceC2391sz) obj).mo1169z(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC2391sz interfaceC2391sz = (InterfaceC2391sz) obj;
        if (interfaceC2391sz != null) {
            interfaceC2391sz.mo1166P(sSLSocket, str, list);
        }
    }

    @Override // p000a.C0799Ov
    /* renamed from: Q */
    public final String mo298Q(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f7746v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC2391sz) obj).mo1169z(sSLSocket)) {
                break;
            }
        }
        InterfaceC2391sz interfaceC2391sz = (InterfaceC2391sz) obj;
        if (interfaceC2391sz != null) {
            return interfaceC2391sz.mo1167h(sSLSocket);
        }
        return null;
    }

    @Override // p000a.C0799Ov
    /* renamed from: h */
    public final AbstractC0438II mo299h(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        C1232X1 c1232x1 = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            c1232x1 = new C1232X1(x509TrustManager, x509TrustManagerExtensions);
        }
        if (c1232x1 == null) {
            return super.mo299h(x509TrustManager);
        }
        return c1232x1;
    }

    @Override // p000a.C0799Ov
    /* renamed from: o */
    public final boolean mo300o(String str) {
        boolean isCleartextTrafficPermitted;
        if (Build.VERSION.SDK_INT < 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }

    @Override // p000a.C0799Ov
    /* renamed from: u */
    public final Object mo1887u() {
        C2217pm c2217pm = this.f7745P;
        Method method = c2217pm.f6829z;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            c2217pm.f6827h.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000a.C0799Ov
    /* renamed from: v */
    public final InterfaceC2288r5 mo1888v(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C0674Ml(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo1888v(x509TrustManager);
        }
    }
}
