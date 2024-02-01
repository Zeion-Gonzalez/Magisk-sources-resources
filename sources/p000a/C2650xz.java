package p000a;

import android.os.Bundle;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: a.xz */
/* loaded from: classes.dex */
public final class C2650xz extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ Object f8257I;

    /* renamed from: R */
    public final /* synthetic */ int f8258R;

    /* renamed from: k */
    public final /* synthetic */ Object f8259k;

    /* renamed from: q */
    public final /* synthetic */ Object f8260q;

    /* renamed from: w */
    public final /* synthetic */ Serializable f8261w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2650xz(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f8258R = i;
        this.f8261w = serializable;
        this.f8257I = obj;
        this.f8260q = obj2;
        this.f8259k = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f8258R;
        Object obj2 = this.f8259k;
        Object obj3 = this.f8260q;
        Object obj4 = this.f8257I;
        Serializable serializable = this.f8261w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C1216Wj) serializable).f3980S = true;
                ((AbstractC2499v4) obj4).m4348z((C1420ag) obj3, (Bundle) obj2, (C1553dE) obj, C1239X8.f4021S);
                return c0329gj;
            default:
                String[] strArr = (String[]) obj;
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    String str = strArr[i2];
                    if (AbstractC1269Xn.m2591nB(str, "com.topjohnwu.magisk", false)) {
                        strArr[i2] = AbstractC1269Xn.m2588hs(str, "com.topjohnwu.magisk", (String) serializable);
                    } else if (AbstractC1269Xn.m2591nB(str, "COMPONENT_PLACEHOLDER", false)) {
                        strArr[i2] = ((Iterator) obj4).next();
                    } else if (AbstractC1292YB.m2695u(str, (String) obj3)) {
                        strArr[i2] = ((CharSequence) obj2).toString();
                    }
                }
                return c0329gj;
        }
    }
}
