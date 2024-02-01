package p000a;

/* renamed from: a.wM */
/* loaded from: classes.dex */
public class C2567wM implements InterfaceC2491ux, InterfaceC1428ao {

    /* renamed from: R */
    public static C2567wM f7845R;

    /* renamed from: S */
    public static final C2567wM f7846S = new C2567wM();

    /* renamed from: N */
    public AbstractC1952kk mo1121N(Class cls, C0945Rm c0945Rm) {
        return mo1123z(cls);
    }

    @Override // p000a.InterfaceC2491ux
    /* renamed from: P */
    public Object mo329P(Object obj) {
        return (AbstractC1911jx) obj;
    }

    /* renamed from: z */
    public AbstractC1952kk mo1123z(Class cls) {
        try {
            return (AbstractC1952kk) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
