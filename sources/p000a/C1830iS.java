package p000a;

import java.io.IOException;

/* renamed from: a.iS */
/* loaded from: classes.dex */
public final class C1830iS implements InterfaceC2491ux {

    /* renamed from: S */
    public static final C1830iS f5724S = new C1830iS();

    @Override // p000a.InterfaceC2491ux
    /* renamed from: P */
    public final Object mo329P(Object obj) {
        String m2869V = ((AbstractC1449bB) obj).m2869V();
        if (m2869V.length() == 1) {
            return Character.valueOf(m2869V.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + m2869V.length());
    }
}
