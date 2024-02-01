package p000a;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.z0 */
/* loaded from: classes.dex */
public final class C2702z0 implements Closeable {

    /* renamed from: I */
    public final /* synthetic */ C0437IH f8521I;

    /* renamed from: R */
    public final long f8522R;

    /* renamed from: S */
    public final String f8523S;

    /* renamed from: w */
    public final List f8524w;

    public C2702z0(C0437IH c0437ih, String str, long j, ArrayList arrayList) {
        this.f8521I = c0437ih;
        this.f8523S = str;
        this.f8522R = j;
        this.f8524w = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f8524w.iterator();
        while (it.hasNext()) {
            AbstractC1181W6.m2430v((InterfaceC0984SS) it.next());
        }
    }
}
