package p000a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: a.hl */
/* loaded from: classes.dex */
public final class C1794hl {

    /* renamed from: h */
    public final List f5646h;

    /* renamed from: z */
    public final Method f5647z;

    public C1794hl(Method method, ArrayList arrayList) {
        this.f5647z = method;
        this.f5646h = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f5647z;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f5646h);
    }
}
