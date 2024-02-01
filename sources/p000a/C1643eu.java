package p000a;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* renamed from: a.eu */
/* loaded from: classes.dex */
public final class C1643eu extends C2107ni {
    public C1643eu() {
        super(Build.VERSION.SDK_INT >= 24);
    }

    @Override // p000a.C2107ni
    /* renamed from: h */
    public final Object mo3120h(Method method, Class cls, Object obj, Object... objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.mo3120h(method, cls, obj, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }

    @Override // p000a.C2107ni
    /* renamed from: z */
    public final Executor mo3121z() {
        return new ExecutorC0044Au();
    }
}
