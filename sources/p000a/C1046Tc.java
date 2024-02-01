package p000a;

import android.graphics.Paint;

/* renamed from: a.Tc */
/* loaded from: classes.dex */
public final class C1046Tc extends AbstractC1273Xr {

    /* renamed from: G */
    public float f3457G;

    /* renamed from: M */
    public float f3458M;

    /* renamed from: N */
    public C2382so f3459N;

    /* renamed from: Q */
    public float f3460Q;

    /* renamed from: R */
    public Paint.Join f3461R;

    /* renamed from: S */
    public Paint.Cap f3462S;

    /* renamed from: V */
    public float f3463V;

    /* renamed from: W */
    public float f3464W;

    /* renamed from: o */
    public float f3465o;

    /* renamed from: u */
    public C2382so f3466u;

    /* renamed from: w */
    public float f3467w;

    public C1046Tc() {
        this.f3460Q = 0.0f;
        this.f3465o = 1.0f;
        this.f3464W = 1.0f;
        this.f3457G = 0.0f;
        this.f3458M = 1.0f;
        this.f3463V = 0.0f;
        this.f3462S = Paint.Cap.BUTT;
        this.f3461R = Paint.Join.MITER;
        this.f3467w = 4.0f;
    }

    public float getFillAlpha() {
        return this.f3464W;
    }

    public int getFillColor() {
        return this.f3466u.f7316z;
    }

    public float getStrokeAlpha() {
        return this.f3465o;
    }

    public int getStrokeColor() {
        return this.f3459N.f7316z;
    }

    public float getStrokeWidth() {
        return this.f3460Q;
    }

    public float getTrimPathEnd() {
        return this.f3458M;
    }

    public float getTrimPathOffset() {
        return this.f3463V;
    }

    public float getTrimPathStart() {
        return this.f3457G;
    }

    @Override // p000a.AbstractC0532K1
    /* renamed from: h */
    public final boolean mo1247h(int[] iArr) {
        return this.f3459N.m4108u(iArr) | this.f3466u.m4108u(iArr);
    }

    public void setFillAlpha(float f) {
        this.f3464W = f;
    }

    public void setFillColor(int i) {
        this.f3466u.f7316z = i;
    }

    public void setStrokeAlpha(float f) {
        this.f3465o = f;
    }

    public void setStrokeColor(int i) {
        this.f3459N.f7316z = i;
    }

    public void setStrokeWidth(float f) {
        this.f3460Q = f;
    }

    public void setTrimPathEnd(float f) {
        this.f3458M = f;
    }

    public void setTrimPathOffset(float f) {
        this.f3463V = f;
    }

    public void setTrimPathStart(float f) {
        this.f3457G = f;
    }

    @Override // p000a.AbstractC0532K1
    /* renamed from: z */
    public final boolean mo1248z() {
        return this.f3466u.m4102N() || this.f3459N.m4102N();
    }

    public C1046Tc(C1046Tc c1046Tc) {
        super(c1046Tc);
        this.f3460Q = 0.0f;
        this.f3465o = 1.0f;
        this.f3464W = 1.0f;
        this.f3457G = 0.0f;
        this.f3458M = 1.0f;
        this.f3463V = 0.0f;
        this.f3462S = Paint.Cap.BUTT;
        this.f3461R = Paint.Join.MITER;
        this.f3467w = 4.0f;
        this.f3459N = c1046Tc.f3459N;
        this.f3460Q = c1046Tc.f3460Q;
        this.f3465o = c1046Tc.f3465o;
        this.f3466u = c1046Tc.f3466u;
        this.f4096v = c1046Tc.f4096v;
        this.f3464W = c1046Tc.f3464W;
        this.f3457G = c1046Tc.f3457G;
        this.f3458M = c1046Tc.f3458M;
        this.f3463V = c1046Tc.f3463V;
        this.f3462S = c1046Tc.f3462S;
        this.f3461R = c1046Tc.f3461R;
        this.f3467w = c1046Tc.f3467w;
    }
}
