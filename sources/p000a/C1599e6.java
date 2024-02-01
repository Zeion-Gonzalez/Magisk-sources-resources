package p000a;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: a.e6 */
/* loaded from: classes.dex */
public final class C1599e6 extends AbstractC1500cH {

    /* renamed from: N */
    public final InterfaceC2491ux f4909N;

    /* renamed from: P */
    public final int f4910P;

    /* renamed from: Q */
    public final Object f4911Q;

    /* renamed from: h */
    public final /* synthetic */ int f4912h = 0;

    /* renamed from: v */
    public final Method f4913v;

    public C1599e6(Method method, int i, InterfaceC2491ux interfaceC2491ux, String str) {
        super(12);
        this.f4913v = method;
        this.f4910P = i;
        this.f4909N = interfaceC2491ux;
        this.f4911Q = str;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: z */
    public final void mo332z(C1120Uy c1120Uy, Object obj) {
        int i = this.f4912h;
        Object obj2 = this.f4911Q;
        int i2 = this.f4910P;
        Method method = this.f4913v;
        InterfaceC2491ux interfaceC2491ux = this.f4909N;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (obj != null) {
                    try {
                        c1120Uy.m2307v((C1494c7) obj2, (AbstractC1911jx) interfaceC2491ux.mo329P(obj));
                        return;
                    } catch (IOException e) {
                        throw AbstractC2575wW.m4419Yd(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                    }
                }
                return;
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                c1120Uy.m2307v(C1710g8.m3226U("Content-Disposition", AbstractC2441tz.m4184G("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (AbstractC1911jx) interfaceC2491ux.mo329P(value));
                            } else {
                                throw AbstractC2575wW.m4419Yd(method, i2, AbstractC2441tz.m4184G("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw AbstractC2575wW.m4419Yd(method, i2, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw AbstractC2575wW.m4419Yd(method, i2, "Part map was null.", new Object[0]);
        }
    }

    public C1599e6(Method method, int i, C1494c7 c1494c7, InterfaceC2491ux interfaceC2491ux) {
        super(12);
        this.f4913v = method;
        this.f4910P = i;
        this.f4911Q = c1494c7;
        this.f4909N = interfaceC2491ux;
    }
}
