package p000a;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* renamed from: a.ni */
/* loaded from: classes.dex */
public class C2107ni {

    /* renamed from: v */
    public static final C2107ni f6506v;

    /* renamed from: h */
    public final Constructor f6507h;

    /* renamed from: z */
    public final boolean f6508z;

    static {
        C2107ni c2107ni;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            c2107ni = new C1643eu();
        } else {
            c2107ni = new C2107ni(true);
        }
        f6506v = c2107ni;
    }

    public C2107ni(boolean z) {
        this.f6508z = z;
        Constructor constructor = null;
        if (z) {
            try {
                constructor = AbstractC2494v.m4312c().getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f6507h = constructor;
    }

    /* renamed from: h */
    public Object mo3120h(Method method, Class cls, Object obj, Object... objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = this.f6507h;
        unreflectSpecial = (constructor != null ? AbstractC2494v.m4309V(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    /* renamed from: z */
    public Executor mo3121z() {
        return null;
    }
}
