package p000a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: a.Fk */
/* loaded from: classes.dex */
public abstract class AbstractC0301Fk {

    /* renamed from: h */
    public static final Map f1042h;

    /* renamed from: z */
    public static final CopyOnWriteArraySet f1043z = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C0234ES.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C0234ES.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC2367sX.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C0634Lw.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f1042h = AbstractC0873QM.m2013dG(linkedHashMap);
    }
}
