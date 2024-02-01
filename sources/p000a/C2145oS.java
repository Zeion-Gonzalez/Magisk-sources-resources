package p000a;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: a.oS */
/* loaded from: classes.dex */
public final class C2145oS {

    /* renamed from: z */
    public final LinkedHashMap f6600z = new LinkedHashMap();

    /* renamed from: z */
    public final void m3763z() {
        for (AbstractC1952kk abstractC1952kk : this.f6600z.values()) {
            abstractC1952kk.f6050w = true;
            HashMap hashMap = abstractC1952kk.f6049S;
            if (hashMap != null) {
                synchronized (hashMap) {
                    Iterator it = abstractC1952kk.f6049S.values().iterator();
                    while (it.hasNext()) {
                        AbstractC1952kk.m3573h(it.next());
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC1952kk.f6048R;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    Iterator it2 = abstractC1952kk.f6048R.iterator();
                    while (it2.hasNext()) {
                        AbstractC1952kk.m3573h((Closeable) it2.next());
                    }
                }
            }
            abstractC1952kk.mo898N();
        }
        this.f6600z.clear();
    }
}
