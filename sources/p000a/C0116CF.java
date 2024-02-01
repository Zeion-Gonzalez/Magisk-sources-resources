package p000a;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: a.CF */
/* loaded from: classes.dex */
public final class C0116CF {

    /* renamed from: N */
    public float f407N;

    /* renamed from: P */
    public float f408P;

    /* renamed from: Q */
    public float f409Q;

    /* renamed from: h */
    public float f410h;

    /* renamed from: v */
    public float f413v;

    /* renamed from: z */
    public float f414z;

    /* renamed from: u */
    public final ArrayList f412u = new ArrayList();

    /* renamed from: o */
    public final ArrayList f411o = new ArrayList();

    public C0116CF() {
        m239P(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: P */
    public final void m239P(float f, float f2, float f3) {
        this.f414z = 0.0f;
        this.f410h = f;
        this.f413v = 0.0f;
        this.f408P = f;
        this.f407N = f2;
        this.f409Q = (f2 + f3) % 360.0f;
        this.f412u.clear();
        this.f411o.clear();
    }

    /* renamed from: h */
    public final void m240h(Matrix matrix, Path path) {
        ArrayList arrayList = this.f412u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2500v5) arrayList.get(i)).mo2151z(matrix, path);
        }
    }

    /* renamed from: v */
    public final void m241v(float f, float f2) {
        C0968SA c0968sa = new C0968SA();
        c0968sa.f3283h = f;
        c0968sa.f3284v = f2;
        this.f412u.add(c0968sa);
        C0791Ol c0791Ol = new C0791Ol(c0968sa, this.f413v, this.f408P);
        float m1797h = c0791Ol.m1797h() + 270.0f;
        float m1797h2 = c0791Ol.m1797h() + 270.0f;
        m242z(m1797h);
        this.f411o.add(c0791Ol);
        this.f407N = m1797h2;
        this.f413v = f;
        this.f408P = f2;
    }

    /* renamed from: z */
    public final void m242z(float f) {
        float f2 = this.f407N;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f413v;
        float f5 = this.f408P;
        C1257XW c1257xw = new C1257XW(f4, f5, f4, f5);
        c1257xw.f4076Q = this.f407N;
        c1257xw.f4078u = f3;
        this.f411o.add(new C1620eU(c1257xw));
        this.f407N = f;
    }
}
