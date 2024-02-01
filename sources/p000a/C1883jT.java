package p000a;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: a.jT */
/* loaded from: classes.dex */
public final class C1883jT {

    /* renamed from: N */
    public int f5870N;

    /* renamed from: P */
    public int f5871P;

    /* renamed from: Q */
    public int f5872Q;

    /* renamed from: h */
    public final Paint f5873h;

    /* renamed from: o */
    public final Paint f5874o;

    /* renamed from: u */
    public final Path f5875u = new Path();

    /* renamed from: v */
    public final Paint f5876v;

    /* renamed from: z */
    public final Paint f5877z;

    /* renamed from: W */
    public static final int[] f5869W = new int[3];

    /* renamed from: G */
    public static final float[] f5866G = {0.0f, 0.5f, 1.0f};

    /* renamed from: M */
    public static final int[] f5867M = new int[4];

    /* renamed from: V */
    public static final float[] f5868V = {0.0f, 0.0f, 0.5f, 1.0f};

    public C1883jT() {
        Paint paint = new Paint();
        this.f5874o = paint;
        this.f5877z = new Paint();
        m3503z(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f5873h = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f5876v = new Paint(paint2);
    }

    /* renamed from: z */
    public final void m3503z(int i) {
        this.f5871P = AbstractC0106C4.m229v(i, 68);
        this.f5870N = AbstractC0106C4.m229v(i, 20);
        this.f5872Q = AbstractC0106C4.m229v(i, 0);
        this.f5877z.setColor(this.f5871P);
    }
}
