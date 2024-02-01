package p000a;

import android.content.Context;
import android.view.View;

/* renamed from: a.FI */
/* loaded from: classes.dex */
public final class C0278FI extends C0766OI {

    /* renamed from: R */
    public final /* synthetic */ C2192pI f958R;

    /* renamed from: S */
    public final /* synthetic */ int f959S = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0278FI(C2192pI c2192pI, Context context, C2189pE c2189pE, C2206pY c2206pY) {
        super(context, c2189pE, c2206pY, true);
        this.f958R = c2192pI;
        this.f2614u = 8388613;
        C1073U7 c1073u7 = c2192pI.f6727C;
        this.f2611W = c1073u7;
        AbstractC1153Va abstractC1153Va = this.f2605G;
        if (abstractC1153Va != null) {
            abstractC1153Va.mo223W(c1073u7);
        }
    }

    @Override // p000a.C0766OI
    /* renamed from: v */
    public final void mo577v() {
        int i = this.f959S;
        C2192pI c2192pI = this.f958R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                c2192pI.f6736X = null;
                c2192pI.f6744p = 0;
                super.mo577v();
                return;
            default:
                C2189pE c2189pE = c2192pI.f6748w;
                if (c2189pE != null) {
                    c2189pE.m3804v(true);
                }
                c2192pI.f6740e = null;
                super.mo577v();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0278FI(C2192pI c2192pI, Context context, SubMenuC1188WE subMenuC1188WE, View view) {
        super(context, subMenuC1188WE, view, false);
        this.f958R = c2192pI;
        if (!subMenuC1188WE.f3866J.m2301Q()) {
            View view2 = c2192pI.f6735U;
            this.f2609Q = view2 == null ? (View) c2192pI.f6749y : view2;
        }
        C1073U7 c1073u7 = c2192pI.f6727C;
        this.f2611W = c1073u7;
        AbstractC1153Va abstractC1153Va = this.f2605G;
        if (abstractC1153Va != null) {
            abstractC1153Va.mo223W(c1073u7);
        }
    }
}
