package p000a;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: a.Ch */
/* loaded from: classes.dex */
public final class C0139Ch extends C0799Ov {

    /* renamed from: N */
    public static final boolean f482N;

    /* renamed from: P */
    public static final C2252qQ f483P;

    /* renamed from: v */
    public final ArrayList f484v;

    static {
        boolean z = false;
        z = false;
        f483P = new C2252qQ(9, z ? 1 : 0);
        if (C2252qQ.m3886R() && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        f482N = z;
    }

    public C0139Ch() {
        C2287r4 c2287r4;
        InterfaceC2391sz[] interfaceC2391szArr = new InterfaceC2391sz[4];
        if (C2287r4.f7071z.m3897w()) {
            c2287r4 = new C2287r4();
        } else {
            c2287r4 = null;
        }
        interfaceC2391szArr[0] = c2287r4;
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
        this.f484v = arrayList;
    }

    @Override // p000a.C0799Ov
    /* renamed from: P */
    public final void mo297P(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.f484v.iterator();
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
        Iterator it = this.f484v.iterator();
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
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }
}
