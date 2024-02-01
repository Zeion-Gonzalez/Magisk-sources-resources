package p000a;

import java.net.UnknownHostException;
import java.util.List;

/* renamed from: a.wh */
/* loaded from: classes.dex */
public final class C2584wh implements InterfaceC0733Nm {

    /* renamed from: R */
    public final List f7909R;

    /* renamed from: S */
    public final String f7910S;

    public C2584wh(String str, List list) {
        this.f7910S = str;
        this.f7909R = list;
    }

    @Override // p000a.InterfaceC0733Nm
    /* renamed from: h */
    public final List mo1688h(String str) {
        String str2 = this.f7910S;
        if (AbstractC1292YB.m2695u(str2, str)) {
            return this.f7909R;
        }
        throw new UnknownHostException("BootstrapDns called for " + str + " instead of " + str2);
    }
}
