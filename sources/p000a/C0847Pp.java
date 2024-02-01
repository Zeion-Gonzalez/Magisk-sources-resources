package p000a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;

/* renamed from: a.Pp */
/* loaded from: classes.dex */
public final class C0847Pp {

    /* renamed from: N */
    public int f2864N;

    /* renamed from: P */
    public int f2865P;

    /* renamed from: Q */
    public int f2866Q;

    /* renamed from: h */
    public int f2867h;

    /* renamed from: o */
    public final /* synthetic */ Object f2868o;

    /* renamed from: u */
    public final Object f2869u;

    /* renamed from: v */
    public int f2870v;

    /* renamed from: z */
    public int f2871z;

    public C0847Pp(C0368H0 c0368h0, C1628ed c1628ed, C0457If c0457If, int i) {
        this.f2868o = c0368h0;
        this.f2869u = new WeakReference(c1628ed);
        C0287FS c0287fs = c1628ed.f5022C;
        c0457If.getClass();
        this.f2871z = C0457If.m1093w(c0287fs);
        this.f2867h = C0457If.m1093w(c1628ed.f5074p);
        this.f2870v = C0457If.m1093w(c1628ed.f5064j);
        this.f2865P = C0457If.m1093w(c1628ed.f5034L);
        this.f2864N = C0457If.m1093w(c1628ed.f5063i);
        this.f2866Q = i;
    }

    /* renamed from: z */
    public static boolean m1961z(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:277:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01dd  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1962h(p000a.C1628ed r19, p000a.C0782OY r20) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0847Pp.m1962h(a.ed, a.OY):void");
    }

    public C0847Pp(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f2868o = constraintLayout;
        this.f2869u = constraintLayout2;
    }
}
