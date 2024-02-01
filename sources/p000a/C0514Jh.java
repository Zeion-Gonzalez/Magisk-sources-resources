package p000a;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: a.Jh */
/* loaded from: classes.dex */
public final class C0514Jh implements InterfaceC2391sz {

    /* renamed from: z */
    public static final C2252qQ f1709z = new C2252qQ(21, 0);

    /* renamed from: h */
    public static final C0647M9 f1708h = new C0647M9();

    @Override // p000a.InterfaceC2391sz
    /* renamed from: P */
    public final void mo1166P(SSLSocket sSLSocket, String str, List list) {
        if (mo1169z(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C0799Ov c0799Ov = C0799Ov.f2726z;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C2252qQ.m3894v(list).toArray(new String[0]));
        }
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: h */
    public final String mo1167h(SSLSocket sSLSocket) {
        if (mo1169z(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: v */
    public final boolean mo1168v() {
        boolean z = C1809i4.f5674P;
        return C1809i4.f5674P;
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: z */
    public final boolean mo1169z(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }
}
