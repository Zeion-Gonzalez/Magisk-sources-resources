package p000a;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: a.DI */
/* loaded from: classes.dex */
public final class C0170DI extends AbstractC1500cH {

    /* renamed from: N */
    public final InterfaceC2491ux f530N;

    /* renamed from: P */
    public final int f531P;

    /* renamed from: h */
    public final /* synthetic */ int f532h;

    /* renamed from: v */
    public final Method f533v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0170DI(Method method, int i, InterfaceC2491ux interfaceC2491ux, int i2) {
        super(12);
        this.f532h = i2;
        this.f533v = method;
        this.f531P = i;
        this.f530N = interfaceC2491ux;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: z */
    public final void mo332z(C1120Uy c1120Uy, Object obj) {
        int i = this.f532h;
        InterfaceC2491ux interfaceC2491ux = this.f530N;
        Method method = this.f533v;
        int i2 = this.f531P;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (obj != null) {
                    try {
                        c1120Uy.f3661M = (AbstractC1911jx) interfaceC2491ux.mo329P(obj);
                        return;
                    } catch (IOException e) {
                        throw AbstractC2575wW.m4449qn(method, e, i2, "Unable to convert " + obj + " to RequestBody", new Object[0]);
                    }
                }
                throw AbstractC2575wW.m4419Yd(method, i2, "Body parameter value must not be null.", new Object[0]);
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                c1120Uy.m2306h(str, (String) interfaceC2491ux.mo329P(value));
                            } else {
                                throw AbstractC2575wW.m4419Yd(method, i2, AbstractC2441tz.m4184G("Header map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw AbstractC2575wW.m4419Yd(method, i2, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw AbstractC2575wW.m4419Yd(method, i2, "Header map was null.", new Object[0]);
        }
    }
}
