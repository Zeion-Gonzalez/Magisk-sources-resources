package p000a;

import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.io.IOException;

/* renamed from: a.B4 */
/* loaded from: classes.dex */
public final class C0055B4 extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ AbstractC0438II f236g;

    /* renamed from: k */
    public final /* synthetic */ TextView f237k;

    /* renamed from: q */
    public int f238q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055B4(TextView textView, AbstractC0438II abstractC0438II, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f237k = textView;
        this.f236g = abstractC0438II;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0055B4(this.f237k, this.f236g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f238q;
        TextView textView = this.f237k;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC1292YB.m2664UZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1292YB.m2664UZ(obj);
                ExecutorC0094Bp executorC0094Bp = AbstractC0037Al.f178h;
                C0751O3 c0751o3 = new C0751O3(this.f236g, null);
                this.f238q = 1;
                obj = AbstractC0438II.m1021ZH(executorC0094Bp, c0751o3, this);
                if (obj == enumC0464Im) {
                    return enumC0464Im;
                }
            }
            C2594ws c2594ws = (C2594ws) AbstractC1743gn.f5491M.getValue();
            c2594ws.m4470z(textView, c2594ws.m4469h((String) obj));
        } catch (IOException e) {
            AbstractC1530cs.f4727z.mo1160v(e);
            textView.setText(R.string.download_file_error);
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0055B4) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
