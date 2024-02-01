package p000a;

import java.util.Arrays;

/* renamed from: a.Ze */
/* loaded from: classes.dex */
public final class C1370Ze {

    /* renamed from: z */
    public int[] f4298z = new int[10];

    /* renamed from: h */
    public int[] f4294h = new int[10];

    /* renamed from: v */
    public int f4297v = 0;

    /* renamed from: P */
    public int[] f4290P = new int[10];

    /* renamed from: N */
    public float[] f4289N = new float[10];

    /* renamed from: Q */
    public int f4291Q = 0;

    /* renamed from: u */
    public int[] f4296u = new int[5];

    /* renamed from: o */
    public String[] f4295o = new String[5];

    /* renamed from: W */
    public int f4293W = 0;

    /* renamed from: G */
    public int[] f4287G = new int[4];

    /* renamed from: M */
    public boolean[] f4288M = new boolean[4];

    /* renamed from: V */
    public int f4292V = 0;

    /* renamed from: P */
    public final void m2764P(int i, boolean z) {
        int i2 = this.f4292V;
        int[] iArr = this.f4287G;
        if (i2 >= iArr.length) {
            this.f4287G = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4288M;
            this.f4288M = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4287G;
        int i3 = this.f4292V;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4288M;
        this.f4292V = i3 + 1;
        zArr2[i3] = z;
    }

    /* renamed from: h */
    public final void m2765h(int i, int i2) {
        int i3 = this.f4297v;
        int[] iArr = this.f4298z;
        if (i3 >= iArr.length) {
            this.f4298z = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4294h;
            this.f4294h = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4298z;
        int i4 = this.f4297v;
        iArr3[i4] = i;
        int[] iArr4 = this.f4294h;
        this.f4297v = i4 + 1;
        iArr4[i4] = i2;
    }

    /* renamed from: v */
    public final void m2766v(int i, String str) {
        int i2 = this.f4293W;
        int[] iArr = this.f4296u;
        if (i2 >= iArr.length) {
            this.f4296u = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4295o;
            this.f4295o = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4296u;
        int i3 = this.f4293W;
        iArr2[i3] = i;
        String[] strArr2 = this.f4295o;
        this.f4293W = i3 + 1;
        strArr2[i3] = str;
    }

    /* renamed from: z */
    public final void m2767z(int i, float f) {
        int i2 = this.f4291Q;
        int[] iArr = this.f4290P;
        if (i2 >= iArr.length) {
            this.f4290P = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4289N;
            this.f4289N = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4290P;
        int i3 = this.f4291Q;
        iArr2[i3] = i;
        float[] fArr2 = this.f4289N;
        this.f4291Q = i3 + 1;
        fArr2[i3] = f;
    }
}
