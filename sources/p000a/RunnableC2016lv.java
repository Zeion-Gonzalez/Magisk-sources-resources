package p000a;

import android.content.Intent;
import android.content.IntentSender;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: a.lv */
/* loaded from: classes.dex */
public final class RunnableC2016lv implements Runnable {

    /* renamed from: I */
    public final /* synthetic */ Object f6259I;

    /* renamed from: R */
    public final /* synthetic */ int f6260R;

    /* renamed from: S */
    public final /* synthetic */ int f6261S;

    /* renamed from: w */
    public final /* synthetic */ Object f6262w;

    public /* synthetic */ RunnableC2016lv(int i, int i2, Object obj, Object obj2) {
        this.f6261S = i2;
        this.f6262w = obj;
        this.f6259I = obj2;
        this.f6260R = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1468bb interfaceC1468bb;
        int i = this.f6261S;
        Object obj = this.f6262w;
        int i2 = this.f6260R;
        Object obj2 = this.f6259I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0966S8 c0966s8 = (C0966S8) obj;
                Object obj3 = ((C0042As) obj2).f186z;
                String str = (String) c0966s8.f8651z.get(Integer.valueOf(i2));
                if (str != null) {
                    C0801Ox c0801Ox = (C0801Ox) c0966s8.f8645N.get(str);
                    if (c0801Ox != null && (interfaceC1468bb = c0801Ox.f2738z) != null) {
                        if (c0966s8.f8646P.remove(str)) {
                            interfaceC1468bb.mo2259h(obj3);
                            return;
                        }
                        return;
                    } else {
                        c0966s8.f8649u.remove(str);
                        c0966s8.f8647Q.put(str, obj3);
                        return;
                    }
                }
                return;
            case 1:
                ((C0966S8) obj).m4690z(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                return;
            case 2:
            default:
                ((BottomSheetBehavior) obj).m5004C((View) obj2, i2, false);
                return;
            case 3:
                AbstractC2703z2 abstractC2703z2 = (AbstractC2703z2) ((C2196pM) obj2).f6755R;
                if (abstractC2703z2 != null) {
                    abstractC2703z2.mo92Pm(i2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC2016lv(C0966S8 c0966s8, int i, Object obj, int i2) {
        this.f6261S = i2;
        this.f6262w = c0966s8;
        this.f6260R = i;
        this.f6259I = obj;
    }
}
