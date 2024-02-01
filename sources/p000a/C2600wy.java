package p000a;

import android.view.View;
import java.util.List;

/* renamed from: a.wy */
/* loaded from: classes.dex */
public final class C2600wy {

    /* renamed from: G */
    public int f8005G;

    /* renamed from: N */
    public int f8007N;

    /* renamed from: P */
    public int f8008P;

    /* renamed from: Q */
    public int f8009Q;

    /* renamed from: V */
    public boolean f8010V;

    /* renamed from: h */
    public int f8012h;

    /* renamed from: u */
    public int f8014u;

    /* renamed from: v */
    public int f8015v;

    /* renamed from: z */
    public boolean f8016z = true;

    /* renamed from: o */
    public int f8013o = 0;

    /* renamed from: W */
    public int f8011W = 0;

    /* renamed from: M */
    public List f8006M = null;

    /* renamed from: h */
    public final View m4482h(C1578df c1578df) {
        List list = this.f8006M;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((AbstractC0249El) this.f8006M.get(i)).f866z;
                C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
                if (!c0419Hv.m949v() && this.f8008P == c0419Hv.m950z()) {
                    m4483z(view);
                    return view;
                }
            }
            return null;
        }
        View m3049P = c1578df.m3049P(this.f8008P);
        this.f8008P += this.f8007N;
        return m3049P;
    }

    /* renamed from: z */
    public final void m4483z(View view) {
        int m950z;
        int m950z2;
        int size = this.f8006M.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC0249El) this.f8006M.get(i2)).f866z;
            C0419Hv c0419Hv = (C0419Hv) view3.getLayoutParams();
            if (view3 != view && !c0419Hv.m949v() && (m950z2 = (c0419Hv.m950z() - this.f8008P) * this.f8007N) >= 0 && m950z2 < i) {
                view2 = view3;
                if (m950z2 == 0) {
                    break;
                } else {
                    i = m950z2;
                }
            }
        }
        if (view2 == null) {
            m950z = -1;
        } else {
            m950z = ((C0419Hv) view2.getLayoutParams()).m950z();
        }
        this.f8008P = m950z;
    }
}
