package p000a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: a.vp */
/* loaded from: classes.dex */
public final class C2540vp implements InvocationHandler {

    /* renamed from: h */
    public boolean f7772h;

    /* renamed from: v */
    public String f7773v;

    /* renamed from: z */
    public final List f7774z;

    public C2540vp(ArrayList arrayList) {
        this.f7774z = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC1292YB.m2695u(name, "supports") && AbstractC1292YB.m2695u(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC1292YB.m2695u(name, "unsupported") && AbstractC1292YB.m2695u(Void.TYPE, returnType)) {
            this.f7772h = true;
            return null;
        }
        boolean m2695u = AbstractC1292YB.m2695u(name, "protocols");
        List list = this.f7774z;
        if (m2695u) {
            if (objArr.length == 0) {
                return list;
            }
        }
        if ((AbstractC1292YB.m2695u(name, "selectProtocol") || AbstractC1292YB.m2695u(name, "select")) && AbstractC1292YB.m2695u(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        String str = (String) list2.get(i);
                        if (!list.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f7773v = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.f7773v = str2;
                return str2;
            }
        }
        if ((!AbstractC1292YB.m2695u(name, "protocolSelected") && !AbstractC1292YB.m2695u(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        this.f7773v = (String) objArr[0];
        return null;
    }
}
