package p000a;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: a.MQ */
/* loaded from: classes.dex */
public final class C0657MQ {

    /* renamed from: P */
    public static final ArrayList f2108P;

    /* renamed from: h */
    public final ThreadLocal f2109h = new ThreadLocal();

    /* renamed from: v */
    public final LinkedHashMap f2110v = new LinkedHashMap();

    /* renamed from: z */
    public final List f2111z;

    static {
        ArrayList arrayList = new ArrayList(5);
        f2108P = arrayList;
        arrayList.add(AbstractC0795Op.f2699G);
        arrayList.add(AbstractC1882jS.f5864h);
        arrayList.add(C2253qR.f6937v);
        arrayList.add(C0556KT.f1816v);
        arrayList.add(AbstractC1369Zd.f4286z);
        arrayList.add(C0577Ko.f1877P);
    }

    public C0657MQ(C1077UB c1077ub) {
        List list = c1077ub.f3544z;
        int size = list.size();
        ArrayList arrayList = f2108P;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        arrayList2.addAll(arrayList);
        this.f2111z = Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [a.X4] */
    /* renamed from: z */
    public final AbstractC1235X4 m1460z(Type type, Set set, String str) {
        Object asList;
        C2629xU c2629xU;
        if (type != null) {
            if (set != null) {
                Type m2392z = AbstractC1167Vq.m2392z(type);
                if (m2392z instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) m2392z;
                    if (wildcardType.getLowerBounds().length == 0) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        if (upperBounds.length == 1) {
                            m2392z = upperBounds[0];
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                if (set.isEmpty()) {
                    asList = m2392z;
                } else {
                    asList = Arrays.asList(m2392z, set);
                }
                synchronized (this.f2110v) {
                    AbstractC1235X4 abstractC1235X4 = (AbstractC1235X4) this.f2110v.get(asList);
                    if (abstractC1235X4 != null) {
                        return abstractC1235X4;
                    }
                    C0150Cw c0150Cw = (C0150Cw) this.f2109h.get();
                    if (c0150Cw == null) {
                        c0150Cw = new C0150Cw(this);
                        this.f2109h.set(c0150Cw);
                    }
                    ArrayList arrayList = c0150Cw.f508z;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        ArrayDeque arrayDeque = c0150Cw.f506h;
                        if (i < size) {
                            c2629xU = (C2629xU) arrayList.get(i);
                            if (c2629xU.f8216v.equals(asList)) {
                                arrayDeque.add(c2629xU);
                                ?? r13 = c2629xU.f8214P;
                                if (r13 != 0) {
                                    c2629xU = r13;
                                }
                            } else {
                                i++;
                            }
                        } else {
                            C2629xU c2629xU2 = new C2629xU(m2392z, str, asList);
                            arrayList.add(c2629xU2);
                            arrayDeque.add(c2629xU2);
                            c2629xU = null;
                            break;
                        }
                    }
                    try {
                        if (c2629xU != null) {
                            return c2629xU;
                        }
                        try {
                            int size2 = this.f2111z.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                AbstractC1235X4 m1207z = ((C0518Jl) ((InterfaceC0635Lx) this.f2111z.get(i2))).m1207z(m2392z, set, this);
                                if (m1207z != null) {
                                    ((C2629xU) c0150Cw.f506h.getLast()).f8214P = m1207z;
                                    c0150Cw.m307h(true);
                                    return m1207z;
                                }
                            }
                            throw new IllegalArgumentException("No JsonAdapter for " + AbstractC1167Vq.m2389o(m2392z, set));
                        } catch (IllegalArgumentException e) {
                            throw c0150Cw.m308z(e);
                        }
                    } finally {
                        c0150Cw.m307h(false);
                    }
                }
            }
            throw new NullPointerException("annotations == null");
        }
        throw new NullPointerException("type == null");
    }
}
