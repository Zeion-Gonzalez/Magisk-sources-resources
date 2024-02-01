package p000a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.C2773v;
import java.util.Calendar;

/* renamed from: a.R8 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0909R8 implements View.OnClickListener {

    /* renamed from: R */
    public final /* synthetic */ C2773v f3116R;

    /* renamed from: S */
    public final /* synthetic */ int f3117S;

    /* renamed from: w */
    public final /* synthetic */ C2292rA f3118w;

    public /* synthetic */ ViewOnClickListenerC0909R8(C2292rA c2292rA, C2773v c2773v, int i) {
        this.f3117S = i;
        this.f3118w = c2292rA;
        this.f3116R = c2773v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3117S;
        C2773v c2773v = this.f3116R;
        C2292rA c2292rA = this.f3118w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int m4873S3 = ((LinearLayoutManager) c2292rA.f7081Lq.f9077J).m4873S3() - 1;
                if (m4873S3 >= 0) {
                    Calendar m4586h = AbstractC2674yV.m4586h(c2773v.f9339P.f7412S.f1058S);
                    m4586h.add(2, m4873S3);
                    c2292rA.m3949K(new C0307Fr(m4586h));
                    return;
                }
                return;
            default:
                int m4877W9 = ((LinearLayoutManager) c2292rA.f7081Lq.f9077J).m4877W9() + 1;
                if (m4877W9 < c2292rA.f7081Lq.f9124r.mo918z()) {
                    Calendar m4586h2 = AbstractC2674yV.m4586h(c2773v.f9339P.f7412S.f1058S);
                    m4586h2.add(2, m4877W9);
                    c2292rA.m3949K(new C0307Fr(m4586h2));
                    return;
                }
                return;
        }
    }
}
