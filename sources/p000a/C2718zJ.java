package p000a;

import android.graphics.Insets;
import android.view.WindowInsets;

/* renamed from: a.zJ */
/* loaded from: classes.dex */
public class C2718zJ extends C2632xZ {

    /* renamed from: I */
    public C2739zj f8551I;

    /* renamed from: R */
    public C2739zj f8552R;

    /* renamed from: w */
    public C2739zj f8553w;

    public C2718zJ(C2621xJ c2621xJ, WindowInsets windowInsets) {
        super(c2621xJ, windowInsets);
        this.f8552R = null;
        this.f8553w = null;
        this.f8551I = null;
    }

    @Override // p000a.C2194pK
    /* renamed from: M */
    public C2739zj mo3810M() {
        Insets tappableElementInsets;
        if (this.f8551I == null) {
            tappableElementInsets = this.f6251v.getTappableElementInsets();
            this.f8551I = C2739zj.m4674v(tappableElementInsets);
        }
        return this.f8551I;
    }

    @Override // p000a.AbstractC2010lo, p000a.C2194pK
    /* renamed from: V */
    public C2621xJ mo3648V(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f6251v.inset(i, i2, i3, i4);
        return C2621xJ.m4514o(null, inset);
    }

    @Override // p000a.C2194pK
    /* renamed from: W */
    public C2739zj mo3812W() {
        Insets systemGestureInsets;
        if (this.f8552R == null) {
            systemGestureInsets = this.f6251v.getSystemGestureInsets();
            this.f8552R = C2739zj.m4674v(systemGestureInsets);
        }
        return this.f8552R;
    }

    @Override // p000a.C0452Ia, p000a.C2194pK
    /* renamed from: q */
    public void mo1090q(C2739zj c2739zj) {
    }

    @Override // p000a.C2194pK
    /* renamed from: u */
    public C2739zj mo3813u() {
        Insets mandatorySystemGestureInsets;
        if (this.f8553w == null) {
            mandatorySystemGestureInsets = this.f6251v.getMandatorySystemGestureInsets();
            this.f8553w = C2739zj.m4674v(mandatorySystemGestureInsets);
        }
        return this.f8553w;
    }
}
