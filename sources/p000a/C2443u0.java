package p000a;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* renamed from: a.u0 */
/* loaded from: classes.dex */
public final class C2443u0 implements InterfaceC0733Nm {

    /* renamed from: S */
    public final C1146VR f7467S;

    public C2443u0(C0234ES c0234es) {
        this.f7467S = new C1146VR(new C1407aQ(6, c0234es));
    }

    @Override // p000a.InterfaceC0733Nm
    /* renamed from: h */
    public final List mo1688h(String str) {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        if (C1212We.f3968y.m3358O4(c1212We, C1212We.f3959h[14]).booleanValue()) {
            try {
                return ((C2259qX) this.f7467S.getValue()).mo1688h(str);
            } catch (UnknownHostException unused) {
            }
        }
        try {
            return AbstractC1658fB.m3132Pm(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
