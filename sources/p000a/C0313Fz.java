package p000a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: a.Fz */
/* loaded from: classes.dex */
public final class C0313Fz {

    /* renamed from: N */
    public final List f1069N;

    /* renamed from: P */
    public Object f1070P;

    /* renamed from: Q */
    public final Object f1071Q;

    /* renamed from: h */
    public final Object f1072h;

    /* renamed from: u */
    public final Executor f1073u;

    /* renamed from: v */
    public final Object f1074v;

    /* renamed from: z */
    public boolean f1075z;

    public C0313Fz(InterfaceC0820PJ interfaceC0820PJ, C2658y7 c2658y7, List list, List list2, Executor executor) {
        this.f1072h = new ConcurrentHashMap();
        this.f1074v = interfaceC0820PJ;
        this.f1070P = c2658y7;
        this.f1069N = list;
        this.f1071Q = list2;
        this.f1073u = executor;
        this.f1075z = false;
    }

    /* renamed from: N */
    public final InterfaceC2491ux m684N(Type type, Annotation[] annotationArr) {
        List list = this.f1069N;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC2491ux mo1264h = ((AbstractC0772OO) list.get(i)).mo1264h(type, annotationArr, this);
            if (mo1264h != null) {
                return mo1264h;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0772OO) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: P */
    public final InterfaceC2491ux m685P(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        List list = this.f1069N;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC2491ux mo1265z = ((AbstractC0772OO) list.get(i)).mo1265z(type, annotationArr);
            if (mo1265z != null) {
                return mo1265z;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0772OO) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: Q */
    public final void m686Q() {
        List list = this.f1069N;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0772OO) list.get(i)).getClass();
        }
    }

    /* renamed from: h */
    public final Object m687h(Class cls) {
        boolean z;
        boolean isDefault;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f1075z) {
                C2107ni c2107ni = C2107ni.f6506v;
                for (Method method : cls.getDeclaredMethods()) {
                    if (c2107ni.f6508z) {
                        isDefault = method.isDefault();
                        if (isDefault) {
                            z = true;
                            if (!z && !Modifier.isStatic(method.getModifiers())) {
                                m688v(method);
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        m688v(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C2722zN(this, cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: v */
    public final AbstractC2219pq m688v(Method method) {
        AbstractC2219pq abstractC2219pq;
        AbstractC2219pq abstractC2219pq2 = (AbstractC2219pq) ((Map) this.f1072h).get(method);
        if (abstractC2219pq2 != null) {
            return abstractC2219pq2;
        }
        synchronized (((Map) this.f1072h)) {
            abstractC2219pq = (AbstractC2219pq) ((Map) this.f1072h).get(method);
            if (abstractC2219pq == null) {
                abstractC2219pq = AbstractC2219pq.m3857h(this, method);
                ((Map) this.f1072h).put(method, abstractC2219pq);
            }
        }
        return abstractC2219pq;
    }

    /* renamed from: z */
    public final InterfaceC0792Om m689z(Type type, Annotation[] annotationArr) {
        List list = (List) this.f1071Q;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC0792Om mo192z = ((AbstractC2054mi) list.get(i)).mo192z(type, annotationArr);
            if (mo192z != null) {
                return mo192z;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC2054mi) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public C0313Fz(C0175DP c0175dp, C1206WY c1206wy) {
        this.f1072h = new C1495c8();
        this.f1074v = c0175dp;
        this.f1071Q = c1206wy;
    }
}
