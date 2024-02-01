package p000a;

/* renamed from: a.zz */
/* loaded from: classes.dex */
public final class C2751zz {

    /* renamed from: P */
    public static C2751zz f8617P;

    /* renamed from: h */
    public long f8618h;

    /* renamed from: v */
    public int f8619v;

    /* renamed from: z */
    public long f8620z;

    /* renamed from: z */
    public final void m4681z(long j, double d, double d2) {
        double d3 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.f8619v = 1;
        } else if (sin3 <= -1.0d) {
            this.f8619v = 0;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f8620z = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f8618h = round;
            if (round >= j || this.f8620z <= j) {
                this.f8619v = 1;
                return;
            } else {
                this.f8619v = 0;
                return;
            }
        }
        this.f8620z = -1L;
        this.f8618h = -1L;
    }
}
