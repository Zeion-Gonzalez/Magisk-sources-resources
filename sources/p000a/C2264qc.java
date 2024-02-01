package p000a;

import com.topjohnwu.magisk.p001ui.surequest.SuRequestActivity;

/* renamed from: a.qc */
/* loaded from: classes.dex */
public final class C2264qc extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ String f6960g;

    /* renamed from: k */
    public final /* synthetic */ SuRequestActivity f6961k;

    /* renamed from: q */
    public int f6962q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2264qc(SuRequestActivity suRequestActivity, String str, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6961k = suRequestActivity;
        this.f6960g = str;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2264qc(this.f6961k, this.f6960g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f6962q;
        SuRequestActivity suRequestActivity = this.f6961k;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            ExecutorC0094Bp executorC0094Bp = AbstractC0037Al.f178h;
            C0515Ji c0515Ji = new C0515Ji(suRequestActivity, this.f6960g, null);
            this.f6962q = 1;
            if (AbstractC0438II.m1021ZH(executorC0094Bp, c0515Ji, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        suRequestActivity.finish();
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2264qc) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
