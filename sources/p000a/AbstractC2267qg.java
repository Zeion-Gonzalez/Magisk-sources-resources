package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.qg */
/* loaded from: classes.dex */
public abstract class AbstractC2267qg {

    /* renamed from: h */
    public final C1186WB f6971h;

    /* renamed from: v */
    public final C1186WB f6972v;

    /* renamed from: z */
    public final C1186WB f6973z;

    public AbstractC2267qg(C1186WB c1186wb, C1186WB c1186wb2, C1186WB c1186wb3) {
        this.f6973z = c1186wb;
        this.f6971h = c1186wb2;
        this.f6972v = c1186wb3;
    }

    /* renamed from: G */
    public final void m3902G(InterfaceC1125V3 interfaceC1125V3) {
        if (interfaceC1125V3 == null) {
            ((C0593L6) this).f1909N.writeString(null);
            return;
        }
        try {
            ((C0593L6) this).f1909N.writeString(m3905h(interfaceC1125V3.getClass()).getName());
            C0593L6 mo1321z = mo1321z();
            try {
                m3903P(interfaceC1125V3.getClass()).invoke(null, interfaceC1125V3, mo1321z);
                int i = mo1321z.f1912W;
                if (i >= 0) {
                    int i2 = mo1321z.f1910P.get(i);
                    Parcel parcel = mo1321z.f1909N;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC1125V3.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* renamed from: N */
    public abstract boolean mo1319N(int i);

    /* renamed from: P */
    public final Method m3903P(Class cls) {
        String name = cls.getName();
        C1186WB c1186wb = this.f6971h;
        Method method = (Method) c1186wb.getOrDefault(name, null);
        if (method == null) {
            Class m3905h = m3905h(cls);
            System.currentTimeMillis();
            Method declaredMethod = m3905h.getDeclaredMethod("write", cls, AbstractC2267qg.class);
            c1186wb.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: Q */
    public final int m3904Q(int i, int i2) {
        if (!mo1319N(i2)) {
            return i;
        }
        return ((C0593L6) this).f1909N.readInt();
    }

    /* renamed from: W */
    public abstract void mo1320W(int i);

    /* renamed from: h */
    public final Class m3905h(Class cls) {
        String name = cls.getName();
        C1186WB c1186wb = this.f6972v;
        Class cls2 = (Class) c1186wb.getOrDefault(name, null);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            c1186wb.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: o */
    public final InterfaceC1125V3 m3906o() {
        String readString = ((C0593L6) this).f1909N.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC1125V3) m3908v(readString).invoke(null, mo1321z());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: u */
    public final Parcelable m3907u(Parcelable parcelable, int i) {
        if (!mo1319N(i)) {
            return parcelable;
        }
        return ((C0593L6) this).f1909N.readParcelable(C0593L6.class.getClassLoader());
    }

    /* renamed from: v */
    public final Method m3908v(String str) {
        C1186WB c1186wb = this.f6973z;
        Method method = (Method) c1186wb.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC2267qg.class.getClassLoader()).getDeclaredMethod("read", AbstractC2267qg.class);
            c1186wb.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: z */
    public abstract C0593L6 mo1321z();
}
