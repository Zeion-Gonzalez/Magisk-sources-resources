package p000a;

import java.util.Comparator;

/* renamed from: a.VS */
/* loaded from: classes.dex */
public final class C1147VS implements Comparator {

    /* renamed from: z */
    public static final C1147VS f3731z = new C1147VS();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C2348s9.f7236z;
    }
}
