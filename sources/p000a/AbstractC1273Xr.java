package p000a;

/* renamed from: a.Xr */
/* loaded from: classes.dex */
public abstract class AbstractC1273Xr extends AbstractC0532K1 {

    /* renamed from: P */
    public final int f4094P;

    /* renamed from: h */
    public String f4095h;

    /* renamed from: v */
    public int f4096v;

    /* renamed from: z */
    public C1992lT[] f4097z;

    public AbstractC1273Xr() {
        this.f4097z = null;
        this.f4096v = 0;
    }

    public C1992lT[] getPathData() {
        return this.f4097z;
    }

    public String getPathName() {
        return this.f4095h;
    }

    public void setPathData(C1992lT[] c1992lTArr) {
        if (!AbstractC1843ih.m3462u(this.f4097z, c1992lTArr)) {
            this.f4097z = AbstractC1843ih.m3459s(c1992lTArr);
            return;
        }
        C1992lT[] c1992lTArr2 = this.f4097z;
        for (int i = 0; i < c1992lTArr.length; i++) {
            c1992lTArr2[i].f6172z = c1992lTArr[i].f6172z;
            int i2 = 0;
            while (true) {
                float[] fArr = c1992lTArr[i].f6171h;
                if (i2 < fArr.length) {
                    c1992lTArr2[i].f6171h[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC1273Xr(AbstractC1273Xr abstractC1273Xr) {
        this.f4097z = null;
        this.f4096v = 0;
        this.f4095h = abstractC1273Xr.f4095h;
        this.f4094P = abstractC1273Xr.f4094P;
        this.f4097z = AbstractC1843ih.m3459s(abstractC1273Xr.f4097z);
    }
}
