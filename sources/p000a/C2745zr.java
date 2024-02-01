package p000a;

import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: a.zr */
/* loaded from: classes.dex */
public final class C2745zr implements InterfaceC1636el {

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2363sS f8605h;

    /* renamed from: z */
    public final /* synthetic */ int f8606z;

    public /* synthetic */ C2745zr(C1525cm c1525cm, int i) {
        this.f8606z = i;
        this.f8605h = c1525cm;
    }

    @Override // p000a.InterfaceC1636el
    /* renamed from: h */
    public final void mo2754h(Throwable th) {
        int i = this.f8606z;
        InterfaceC2363sS interfaceC2363sS = this.f8605h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C1525cm) interfaceC2363sS).mo320u(new C1019T6(th));
                return;
            case 1:
                ((C1525cm) interfaceC2363sS).mo320u(new C1019T6(th));
                return;
            default:
                ((C1525cm) interfaceC2363sS).mo320u(new C1019T6(th));
                return;
        }
    }

    @Override // p000a.InterfaceC1636el
    /* renamed from: z */
    public final void mo2755z(InterfaceC0987SV interfaceC0987SV, C0870QJ c0870qj) {
        Object c1019t6;
        int i = this.f8606z;
        InterfaceC2363sS interfaceC2363sS = this.f8605h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (c0870qj.f2958z.m2858h()) {
                    c1019t6 = c0870qj.f2957h;
                    if (c1019t6 == null) {
                        C1794hl c1794hl = (C1794hl) C1794hl.class.cast(((Map) interfaceC0987SV.mo1685V().f4278Q).get(C1794hl.class));
                        StringBuilder sb = new StringBuilder("Response from ");
                        Method method = c1794hl.f5647z;
                        sb.append(method.getDeclaringClass().getName());
                        sb.append('.');
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        ((C1525cm) interfaceC2363sS).mo320u(new C1019T6(new C2021m0(sb.toString())));
                        return;
                    }
                } else {
                    c1019t6 = new C1019T6(new C0600LE(c0870qj));
                }
                ((C1525cm) interfaceC2363sS).mo320u(c1019t6);
                return;
            case 1:
                if (c0870qj.f2958z.m2858h()) {
                    ((C1525cm) interfaceC2363sS).mo320u(c0870qj.f2957h);
                    return;
                } else {
                    ((C1525cm) interfaceC2363sS).mo320u(new C1019T6(new C0600LE(c0870qj)));
                    return;
                }
            default:
                ((C1525cm) interfaceC2363sS).mo320u(c0870qj);
                return;
        }
    }
}
