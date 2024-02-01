package p000a;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* renamed from: a.qN */
/* loaded from: classes.dex */
public final class C2249qN implements InterfaceC2491ux {

    /* renamed from: S */
    public static final C2249qN f6916S = new C2249qN();

    /* renamed from: R */
    public static final C0003A3 f6915R = C1710g8.m3223I("text/plain; charset=UTF-8");

    @Override // p000a.InterfaceC2491ux
    /* renamed from: P */
    public final Object mo329P(Object obj) {
        String valueOf = String.valueOf(obj);
        Charset charset = AbstractC2047ma.f6374z;
        C0003A3 c0003a3 = f6915R;
        if (c0003a3 != null) {
            Pattern pattern = C0003A3.f64P;
            Charset m21z = c0003a3.m21z(null);
            if (m21z == null) {
                try {
                    c0003a3 = C1710g8.m3223I(c0003a3 + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    c0003a3 = null;
                }
            } else {
                charset = m21z;
            }
        }
        byte[] bytes = valueOf.getBytes(charset);
        int length = bytes.length;
        AbstractC1181W6.m2424h(bytes.length, 0, length);
        return new C0032Ae(c0003a3, bytes, length, 0);
    }
}
