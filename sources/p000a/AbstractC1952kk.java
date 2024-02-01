package p000a;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: a.kk */
/* loaded from: classes.dex */
public abstract class AbstractC1952kk {

    /* renamed from: S */
    public final HashMap f6049S = new HashMap();

    /* renamed from: R */
    public final LinkedHashSet f6048R = new LinkedHashSet();

    /* renamed from: w */
    public volatile boolean f6050w = false;

    /* renamed from: h */
    public static void m3573h(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: N */
    public void mo898N() {
    }

    /* renamed from: u */
    public final Object m3574u(String str, Object obj) {
        Object obj2;
        synchronized (this.f6049S) {
            obj2 = this.f6049S.get(str);
            if (obj2 == null) {
                this.f6049S.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f6050w) {
            m3573h(obj);
        }
        return obj;
    }
}
