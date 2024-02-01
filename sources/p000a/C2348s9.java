package p000a;

import java.util.Comparator;

/* renamed from: a.s9 */
/* loaded from: classes.dex */
public final class C2348s9 implements Comparator {

    /* renamed from: z */
    public static final C2348s9 f7236z = new C2348s9();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj2).compareTo((Comparable) obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C1147VS.f3731z;
    }
}
