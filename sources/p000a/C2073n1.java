package p000a;

/* renamed from: a.n1 */
/* loaded from: classes.dex */
public final class C2073n1 extends AbstractC1500cH {
    public C2073n1() {
        super(7);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: M */
    public final void mo2904M(float f, float f2, C0116CF c0116cf) {
        c0116cf.m239P(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C1257XW c1257xw = new C1257XW(0.0f, 0.0f, f3, f3);
        c1257xw.f4076Q = 180.0f;
        c1257xw.f4078u = 90.0f;
        c0116cf.f412u.add(c1257xw);
        C1620eU c1620eU = new C1620eU(c1257xw);
        c0116cf.m242z(180.0f);
        c0116cf.f411o.add(c1620eU);
        c0116cf.f407N = 270.0f;
        float f4 = (f3 + 0.0f) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c0116cf.f413v = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        c0116cf.f408P = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
