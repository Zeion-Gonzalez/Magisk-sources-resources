package p000a;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: a.PV */
/* loaded from: classes.dex */
public final class C0831PV {

    /* renamed from: z */
    public final WeakReference f2816z;

    public C0831PV(View view) {
        this.f2816z = new WeakReference(view);
    }

    /* renamed from: N */
    public final void m1933N(float f) {
        View view = (View) this.f2816z.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* renamed from: P */
    public final void m1934P(InterfaceC0579Kq interfaceC0579Kq) {
        View view = (View) this.f2816z.get();
        if (view != null) {
            if (interfaceC0579Kq != null) {
                view.animate().setListener(new C2729zW(0, this, interfaceC0579Kq, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: h */
    public final void m1935h() {
        View view = (View) this.f2816z.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: v */
    public final void m1936v(long j) {
        View view = (View) this.f2816z.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* renamed from: z */
    public final void m1937z(float f) {
        View view = (View) this.f2816z.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }
}
