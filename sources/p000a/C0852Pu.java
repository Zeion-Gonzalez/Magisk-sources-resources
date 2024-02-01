package p000a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.C2752h;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: a.Pu */
/* loaded from: classes.dex */
public final class C0852Pu extends AbstractC2703z2 implements InterfaceC0568Kf, InterfaceC0238EW, InterfaceC0381HG, InterfaceC1609eH, InterfaceC0670Mg, InterfaceC2112no, InterfaceC1303YO, InterfaceC0277FG, InterfaceC0115CE, InterfaceC2335rw {

    /* renamed from: I */
    public final Handler f2880I;

    /* renamed from: R */
    public final Activity f2881R;

    /* renamed from: k */
    public final /* synthetic */ AbstractActivityC0502JU f2882k;

    /* renamed from: q */
    public final C0364Gx f2883q;

    /* renamed from: w */
    public final Context f2884w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0852Pu(AbstractActivityC0510Jd abstractActivityC0510Jd) {
        super(3);
        this.f2882k = abstractActivityC0510Jd;
        Handler handler = new Handler();
        this.f2883q = new C0364Gx();
        this.f2881R = abstractActivityC0510Jd;
        this.f2884w = abstractActivityC0510Jd;
        this.f2880I = handler;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: BX */
    public final boolean mo1965BX() {
        Window window = this.f2882k.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p000a.InterfaceC1546d7
    /* renamed from: C */
    public final C0326GG mo1354C() {
        return this.f2882k.f1677F;
    }

    /* renamed from: EQ */
    public final C2752h m1966EQ() {
        return this.f2882k.m4693W();
    }

    /* renamed from: Fu */
    public final void m1967Fu(C0958Rz c0958Rz) {
        this.f2882k.f8661f.remove(c0958Rz);
    }

    @Override // p000a.InterfaceC0670Mg
    /* renamed from: G */
    public final C2145oS mo1569G() {
        return this.f2882k.mo1569G();
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Ha */
    public final View mo1968Ha(int i) {
        return this.f2882k.findViewById(i);
    }

    /* renamed from: M6 */
    public final void m1969M6(C0958Rz c0958Rz) {
        this.f2882k.f8659c.remove(c0958Rz);
    }

    /* renamed from: O4 */
    public final void m1970O4(InterfaceC1503cL interfaceC1503cL) {
        C1174Vy c1174Vy = this.f2882k.f8667w;
        ((CopyOnWriteArrayList) c1174Vy.f3830w).add(interfaceC1503cL);
        ((Runnable) c1174Vy.f3828R).run();
    }

    /* renamed from: Rh */
    public final void m1971Rh(C0958Rz c0958Rz) {
        this.f2882k.f8655J.remove(c0958Rz);
    }

    /* renamed from: Ry */
    public final void m1972Ry(InterfaceC1503cL interfaceC1503cL) {
        this.f2882k.f8667w.m2399k(interfaceC1503cL);
    }

    /* renamed from: T0 */
    public final void m1973T0(C0958Rz c0958Rz) {
        this.f2882k.f8665r.remove(c0958Rz);
    }

    /* renamed from: d3 */
    public final void m1974d3(C0958Rz c0958Rz) {
        this.f2882k.f8655J.add(c0958Rz);
    }

    @Override // p000a.InterfaceC0277FG
    /* renamed from: h */
    public final C1934kN mo576h() {
        return this.f2882k.f8664q.f4218h;
    }

    /* renamed from: nB */
    public final void m1975nB(InterfaceC1617eQ interfaceC1617eQ) {
        this.f2882k.f8661f.add(interfaceC1617eQ);
    }

    /* renamed from: tJ */
    public final void m1976tJ(C0958Rz c0958Rz) {
        this.f2882k.f8665r.add(c0958Rz);
    }

    /* renamed from: yF */
    public final void m1977yF(C0958Rz c0958Rz) {
        this.f2882k.f8659c.add(c0958Rz);
    }

    @Override // p000a.InterfaceC0115CE
    /* renamed from: z */
    public final void mo238z(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        this.f2882k.getClass();
    }
}
