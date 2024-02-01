package p000a;

/* renamed from: a.FD */
/* loaded from: classes.dex */
public abstract class AbstractC0274FD {

    /* renamed from: z */
    public static final C1880jQ f956z;

    static {
        C1880jQ c1880jQ = null;
        try {
            c1880jQ = (C1880jQ) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c1880jQ == null) {
            c1880jQ = new C1880jQ();
        }
        f956z = c1880jQ;
    }

    /* renamed from: z */
    public static C0697NA m575z(Class cls) {
        f956z.getClass();
        return new C0697NA(cls);
    }
}
