package p000a;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a.h5 */
/* loaded from: classes.dex */
public abstract class AbstractC1761h5 {

    /* renamed from: h */
    public static final Map f5556h;

    /* renamed from: z */
    public static final C0668Me[] f5557z;

    static {
        C0668Me c0668Me = new C0668Me("", C0668Me.f2178W);
        C1623eY c1623eY = C0668Me.f2177Q;
        C1623eY c1623eY2 = C0668Me.f2180u;
        C1623eY c1623eY3 = C0668Me.f2179o;
        C1623eY c1623eY4 = C0668Me.f2175N;
        C0668Me[] c0668MeArr = {c0668Me, new C0668Me("GET", c1623eY), new C0668Me("POST", c1623eY), new C0668Me("/", c1623eY2), new C0668Me("/index.html", c1623eY2), new C0668Me("http", c1623eY3), new C0668Me("https", c1623eY3), new C0668Me("200", c1623eY4), new C0668Me("204", c1623eY4), new C0668Me("206", c1623eY4), new C0668Me("304", c1623eY4), new C0668Me("400", c1623eY4), new C0668Me("404", c1623eY4), new C0668Me("500", c1623eY4), new C0668Me("accept-charset", ""), new C0668Me("accept-encoding", "gzip, deflate"), new C0668Me("accept-language", ""), new C0668Me("accept-ranges", ""), new C0668Me("accept", ""), new C0668Me("access-control-allow-origin", ""), new C0668Me("age", ""), new C0668Me("allow", ""), new C0668Me("authorization", ""), new C0668Me("cache-control", ""), new C0668Me("content-disposition", ""), new C0668Me("content-encoding", ""), new C0668Me("content-language", ""), new C0668Me("content-length", ""), new C0668Me("content-location", ""), new C0668Me("content-range", ""), new C0668Me("content-type", ""), new C0668Me("cookie", ""), new C0668Me("date", ""), new C0668Me("etag", ""), new C0668Me("expect", ""), new C0668Me("expires", ""), new C0668Me("from", ""), new C0668Me("host", ""), new C0668Me("if-match", ""), new C0668Me("if-modified-since", ""), new C0668Me("if-none-match", ""), new C0668Me("if-range", ""), new C0668Me("if-unmodified-since", ""), new C0668Me("last-modified", ""), new C0668Me("link", ""), new C0668Me("location", ""), new C0668Me("max-forwards", ""), new C0668Me("proxy-authenticate", ""), new C0668Me("proxy-authorization", ""), new C0668Me("range", ""), new C0668Me("referer", ""), new C0668Me("refresh", ""), new C0668Me("retry-after", ""), new C0668Me("server", ""), new C0668Me("set-cookie", ""), new C0668Me("strict-transport-security", ""), new C0668Me("transfer-encoding", ""), new C0668Me("user-agent", ""), new C0668Me("vary", ""), new C0668Me("via", ""), new C0668Me("www-authenticate", "")};
        f5557z = c0668MeArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0668MeArr[i].f2183z)) {
                linkedHashMap.put(c0668MeArr[i].f2183z, Integer.valueOf(i));
            }
        }
        f5556h = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: z */
    public static void m3291z(C1623eY c1623eY) {
        boolean z;
        int mo1980P = c1623eY.mo1980P();
        for (int i = 0; i < mo1980P; i++) {
            byte mo1987u = c1623eY.mo1987u(i);
            if (65 <= mo1987u && mo1987u < 91) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c1623eY.m3077M()));
            }
        }
    }
}
