package p000a;

import android.util.LruCache;
import java.io.File;

/* renamed from: a.hp */
/* loaded from: classes.dex */
public final class C1797hp extends LruCache {
    public C1797hp() {
        super(100);
    }

    @Override // android.util.LruCache
    public final Object create(Object obj) {
        return new File((String) obj);
    }
}
