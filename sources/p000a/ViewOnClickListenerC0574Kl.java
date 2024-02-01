package p000a;

import android.view.View;
import java.util.Calendar;

/* renamed from: a.Kl */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0574Kl implements View.OnClickListener {

    /* renamed from: R */
    public final int f1869R;

    /* renamed from: S */
    public final /* synthetic */ int f1870S;

    /* renamed from: w */
    public final Object f1871w;

    public /* synthetic */ ViewOnClickListenerC0574Kl(int i, int i2, Object obj) {
        this.f1870S = i2;
        this.f1871w = obj;
        this.f1869R = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1870S;
        int i2 = this.f1869R;
        Object obj = this.f1871w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1165Vo c1165Vo = (C1165Vo) obj;
                C0307Fr m651h = C0307Fr.m651h(i2, c1165Vo.f3793P.f7077BO.f1057R);
                C2292rA c2292rA = c1165Vo.f3793P;
                C2421tc c2421tc = c2292rA.f7083U8;
                C0307Fr c0307Fr = c2421tc.f7412S;
                Calendar calendar = c0307Fr.f1058S;
                Calendar calendar2 = m651h.f1058S;
                if (calendar2.compareTo(calendar) < 0) {
                    m651h = c0307Fr;
                } else {
                    C0307Fr c0307Fr2 = c2421tc.f7411R;
                    if (calendar2.compareTo(c0307Fr2.f1058S) > 0) {
                        m651h = c0307Fr2;
                    }
                }
                c2292rA.m3949K(m651h);
                c2292rA.m3948D(1);
                return;
            default:
                ((InterfaceC1221Wo) obj).mo18h(view, i2);
                return;
        }
    }
}
