package p000a;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: a.dz */
/* loaded from: classes.dex */
public final class C1592dz extends AbstractC0532K1 {

    /* renamed from: G */
    public final Matrix f4885G;

    /* renamed from: M */
    public final int f4886M;

    /* renamed from: N */
    public float f4887N;

    /* renamed from: P */
    public float f4888P;

    /* renamed from: Q */
    public float f4889Q;

    /* renamed from: V */
    public String f4890V;

    /* renamed from: W */
    public float f4891W;

    /* renamed from: h */
    public final ArrayList f4892h;

    /* renamed from: o */
    public float f4893o;

    /* renamed from: u */
    public float f4894u;

    /* renamed from: v */
    public float f4895v;

    /* renamed from: z */
    public final Matrix f4896z;

    public C1592dz() {
        this.f4896z = new Matrix();
        this.f4892h = new ArrayList();
        this.f4895v = 0.0f;
        this.f4888P = 0.0f;
        this.f4887N = 0.0f;
        this.f4889Q = 1.0f;
        this.f4894u = 1.0f;
        this.f4893o = 0.0f;
        this.f4891W = 0.0f;
        this.f4885G = new Matrix();
        this.f4890V = null;
    }

    public String getGroupName() {
        return this.f4890V;
    }

    public Matrix getLocalMatrix() {
        return this.f4885G;
    }

    public float getPivotX() {
        return this.f4888P;
    }

    public float getPivotY() {
        return this.f4887N;
    }

    public float getRotation() {
        return this.f4895v;
    }

    public float getScaleX() {
        return this.f4889Q;
    }

    public float getScaleY() {
        return this.f4894u;
    }

    public float getTranslateX() {
        return this.f4893o;
    }

    public float getTranslateY() {
        return this.f4891W;
    }

    @Override // p000a.AbstractC0532K1
    /* renamed from: h */
    public final boolean mo1247h(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f4892h;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((AbstractC0532K1) arrayList.get(i)).mo1247h(iArr);
            i++;
        }
    }

    public void setPivotX(float f) {
        if (f != this.f4888P) {
            this.f4888P = f;
            m3066v();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f4887N) {
            this.f4887N = f;
            m3066v();
        }
    }

    public void setRotation(float f) {
        if (f != this.f4895v) {
            this.f4895v = f;
            m3066v();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f4889Q) {
            this.f4889Q = f;
            m3066v();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f4894u) {
            this.f4894u = f;
            m3066v();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f4893o) {
            this.f4893o = f;
            m3066v();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f4891W) {
            this.f4891W = f;
            m3066v();
        }
    }

    /* renamed from: v */
    public final void m3066v() {
        Matrix matrix = this.f4885G;
        matrix.reset();
        matrix.postTranslate(-this.f4888P, -this.f4887N);
        matrix.postScale(this.f4889Q, this.f4894u);
        matrix.postRotate(this.f4895v, 0.0f, 0.0f);
        matrix.postTranslate(this.f4893o + this.f4888P, this.f4891W + this.f4887N);
    }

    @Override // p000a.AbstractC0532K1
    /* renamed from: z */
    public final boolean mo1248z() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4892h;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0532K1) arrayList.get(i)).mo1248z()) {
                return true;
            }
            i++;
        }
    }

    public C1592dz(C1592dz c1592dz, C1186WB c1186wb) {
        AbstractC1273Xr c0753o5;
        this.f4896z = new Matrix();
        this.f4892h = new ArrayList();
        this.f4895v = 0.0f;
        this.f4888P = 0.0f;
        this.f4887N = 0.0f;
        this.f4889Q = 1.0f;
        this.f4894u = 1.0f;
        this.f4893o = 0.0f;
        this.f4891W = 0.0f;
        Matrix matrix = new Matrix();
        this.f4885G = matrix;
        this.f4890V = null;
        this.f4895v = c1592dz.f4895v;
        this.f4888P = c1592dz.f4888P;
        this.f4887N = c1592dz.f4887N;
        this.f4889Q = c1592dz.f4889Q;
        this.f4894u = c1592dz.f4894u;
        this.f4893o = c1592dz.f4893o;
        this.f4891W = c1592dz.f4891W;
        String str = c1592dz.f4890V;
        this.f4890V = str;
        this.f4886M = c1592dz.f4886M;
        if (str != null) {
            c1186wb.put(str, this);
        }
        matrix.set(c1592dz.f4885G);
        ArrayList arrayList = c1592dz.f4892h;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C1592dz) {
                this.f4892h.add(new C1592dz((C1592dz) obj, c1186wb));
            } else {
                if (obj instanceof C1046Tc) {
                    c0753o5 = new C1046Tc((C1046Tc) obj);
                } else {
                    if (!(obj instanceof C0753O5)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c0753o5 = new C0753O5((C0753O5) obj);
                }
                this.f4892h.add(c0753o5);
                Object obj2 = c0753o5.f4095h;
                if (obj2 != null) {
                    c1186wb.put(obj2, c0753o5);
                }
            }
        }
    }
}
