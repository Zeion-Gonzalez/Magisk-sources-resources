package p000a;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.qB */
/* loaded from: classes.dex */
public final class C2238qB extends AbstractC1290Y9 implements InterfaceC0559KW {

    /* renamed from: I */
    public /* synthetic */ Object f6894I;

    /* renamed from: q */
    public final /* synthetic */ View f6895q;

    /* renamed from: w */
    public int f6896w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2238qB(View view, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6895q = view;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C2238qB c2238qB = new C2238qB(this.f6895q, interfaceC1171Vv);
        c2238qB.f6894I = obj;
        return c2238qB;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f6896w;
        int i2 = 3;
        View view = this.f6895q;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC1292YB.m2664UZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C1116Ut c1116Ut = (C1116Ut) this.f6894I;
                AbstractC1292YB.m2664UZ(obj);
                if (view instanceof ViewGroup) {
                    C1228Wy c1228Wy = new C1228Wy(i2, new C0517Jk((ViewGroup) view, null));
                    this.f6894I = null;
                    this.f6896w = 2;
                    if (c1116Ut.m2296h(c1228Wy, this) == enumC0464Im) {
                        return enumC0464Im;
                    }
                }
            }
            return C0329GJ.f1115z;
        }
        AbstractC1292YB.m2664UZ(obj);
        C1116Ut c1116Ut2 = (C1116Ut) this.f6894I;
        this.f6894I = c1116Ut2;
        this.f6896w = 1;
        c1116Ut2.f3622R = view;
        c1116Ut2.f3623S = 3;
        c1116Ut2.f3621I = this;
        return enumC0464Im;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2238qB) mo49G((C1116Ut) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
