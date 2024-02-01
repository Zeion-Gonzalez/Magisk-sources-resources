package p000a;

import java.lang.reflect.Method;

/* renamed from: a.Y8 */
/* loaded from: classes.dex */
public final class C1289Y8 extends AbstractC1500cH {

    /* renamed from: P */
    public final int f4129P;

    /* renamed from: h */
    public final /* synthetic */ int f4130h;

    /* renamed from: v */
    public final Method f4131v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1289Y8(Method method, int i, int i2) {
        super(12);
        this.f4130h = i2;
        this.f4131v = method;
        this.f4129P = i;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: z */
    public final void mo332z(C1120Uy c1120Uy, Object obj) {
        int i = this.f4130h;
        int i2 = this.f4129P;
        Method method = this.f4131v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1494c7 c1494c7 = (C1494c7) obj;
                if (c1494c7 != null) {
                    C1571dY c1571dY = c1120Uy.f3664Q;
                    c1571dY.getClass();
                    int length = c1494c7.f4637S.length / 2;
                    for (int i3 = 0; i3 < length; i3++) {
                        c1571dY.m3044v(c1494c7.m2898v(i3), c1494c7.m2894N(i3));
                    }
                    return;
                }
                throw AbstractC2575wW.m4419Yd(method, i2, "Headers parameter must not be null.", new Object[0]);
            default:
                if (obj != null) {
                    c1120Uy.f3669v = obj.toString();
                    return;
                }
                throw AbstractC2575wW.m4419Yd(method, i2, "@Url parameter is null.", new Object[0]);
        }
    }
}
