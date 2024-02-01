package p000a;

import java.util.Locale;

/* renamed from: a.rt */
/* loaded from: classes.dex */
public final class C2332rt extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public int f7170q;

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2332rt(interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f7170q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            this.f7170q = 1;
            obj = AbstractC1685fh.f5273v;
            if (obj == null) {
                obj = AbstractC0438II.m1021ZH(AbstractC0037Al.f179z, new C1466bY(null), this);
            }
            if (obj == enumC0464Im) {
                return enumC0464Im;
            }
        }
        C0084Bc c0084Bc = (C0084Bc) obj;
        String[] strArr = (String[]) c0084Bc.f329S;
        String[] strArr2 = (String[]) c0084Bc.f328R;
        C0677Mo.f2232k = strArr;
        C0677Mo.f2231g = strArr2;
        Locale locale = AbstractC1685fh.f5274z;
        String displayName = locale.getDisplayName(locale);
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                if (AbstractC1292YB.m2695u(strArr[i3], displayName)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            i2 = i3;
        }
        C0677Mo.f2234y = i2;
        C0677Mo c0677Mo = C0677Mo.f2230I;
        c0677Mo.getClass();
        AbstractC0795Op.m1801B(c0677Mo, 8);
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        InterfaceC1725gU interfaceC1725gU = (InterfaceC1725gU) obj;
        return new C2332rt((InterfaceC1171Vv) obj2).mo50V(C0329GJ.f1115z);
    }
}
