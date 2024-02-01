package p000a;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: a.Ik */
/* loaded from: classes.dex */
public final class C0462Ik extends C2567wM {

    /* renamed from: I */
    public static C0462Ik f1555I;

    /* renamed from: w */
    public final Application f1556w;

    public C0462Ik(Application application) {
        this.f1556w = application;
    }

    @Override // p000a.C2567wM, p000a.InterfaceC1428ao
    /* renamed from: N */
    public final AbstractC1952kk mo1121N(Class cls, C0945Rm c0945Rm) {
        if (this.f1556w != null) {
            return mo1123z(cls);
        }
        Application application = (Application) c0945Rm.m2111z(C1710g8.f5383s);
        if (application != null) {
            return m1122h(cls, application);
        }
        if (AbstractC2552w1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.mo1123z(cls);
    }

    /* renamed from: h */
    public final AbstractC1952kk m1122h(Class cls, Application application) {
        if (!AbstractC2552w1.class.isAssignableFrom(cls)) {
            return super.mo1123z(cls);
        }
        try {
            return (AbstractC1952kk) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    @Override // p000a.C2567wM, p000a.InterfaceC1428ao
    /* renamed from: z */
    public final AbstractC1952kk mo1123z(Class cls) {
        Application application = this.f1556w;
        if (application != null) {
            return m1122h(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
