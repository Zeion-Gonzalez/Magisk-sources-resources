package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.hz */
/* loaded from: classes.dex */
public abstract class AbstractC1804hz implements Iterable {

    /* renamed from: S */
    public final ArrayList f5668S;

    public AbstractC1804hz(ArrayList arrayList) {
        this.f5668S = new ArrayList(arrayList);
    }

    /* renamed from: h */
    public final ArrayList m3360h() {
        return new ArrayList(this.f5668S);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return m3360h().iterator();
    }
}
