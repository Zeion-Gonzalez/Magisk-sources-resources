package p000a;

import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: a.rD */
/* loaded from: classes.dex */
public final class C2295rD extends AbstractC1500cH {

    /* renamed from: N */
    public final boolean f7091N;

    /* renamed from: P */
    public final int f7092P;

    /* renamed from: h */
    public final /* synthetic */ int f7093h;

    /* renamed from: v */
    public final Method f7094v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2295rD(Method method, int i, boolean z, int i2) {
        super(12);
        this.f7093h = i2;
        this.f7094v = method;
        this.f7092P = i;
        this.f7091N = z;
    }

    /* renamed from: Z */
    public final void m3954Z(C1120Uy c1120Uy, Map map) {
        int i = this.f7093h;
        boolean z = this.f7091N;
        Method method = this.f7094v;
        int i2 = this.f7092P;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String obj = value.toString();
                                if (obj != null) {
                                    c1120Uy.m2308z(str, obj, z);
                                } else {
                                    throw AbstractC2575wW.m4419Yd(method, i2, "Field map value '" + value + "' converted to null by " + C1710g8.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw AbstractC2575wW.m4419Yd(method, i2, AbstractC2441tz.m4184G("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw AbstractC2575wW.m4419Yd(method, i2, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw AbstractC2575wW.m4419Yd(method, i2, "Field map was null.", new Object[0]);
            default:
                if (map != null) {
                    for (Map.Entry entry2 : map.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                String obj2 = value2.toString();
                                if (obj2 != null) {
                                    c1120Uy.m2305P(str2, obj2, z);
                                } else {
                                    throw AbstractC2575wW.m4419Yd(method, i2, "Query map value '" + value2 + "' converted to null by " + C1710g8.class.getName() + " for key '" + str2 + "'.", new Object[0]);
                                }
                            } else {
                                throw AbstractC2575wW.m4419Yd(method, i2, AbstractC2441tz.m4184G("Query map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw AbstractC2575wW.m4419Yd(method, i2, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw AbstractC2575wW.m4419Yd(method, i2, "Query map was null", new Object[0]);
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ void mo332z(C1120Uy c1120Uy, Object obj) {
        switch (this.f7093h) {
            case AbstractC0795Op.f2698E /* 0 */:
                m3954Z(c1120Uy, (Map) obj);
                return;
            default:
                m3954Z(c1120Uy, (Map) obj);
                return;
        }
    }
}
