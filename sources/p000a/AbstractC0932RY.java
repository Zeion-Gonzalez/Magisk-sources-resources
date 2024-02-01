package p000a;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: a.RY */
/* loaded from: classes.dex */
public abstract class AbstractC0932RY implements Closeable {

    /* renamed from: S */
    public int f3199S;

    /* renamed from: R */
    public int[] f3198R = new int[32];

    /* renamed from: w */
    public String[] f3200w = new String[32];

    /* renamed from: I */
    public int[] f3197I = new int[32];

    /* renamed from: BO */
    public abstract String mo2089BO();

    /* renamed from: C */
    public abstract double mo2090C();

    /* renamed from: G */
    public abstract void mo2091G();

    /* renamed from: Ha */
    public abstract void mo2092Ha();

    /* renamed from: Lq */
    public abstract void mo2093Lq();

    /* renamed from: Pm */
    public final void m2094Pm(String str) {
        throw new C1904jq(str + " at path " + m2101od());
    }

    /* renamed from: U8 */
    public abstract void mo2095U8();

    /* renamed from: V */
    public abstract void mo2096V();

    /* renamed from: ZH */
    public abstract int mo2097ZH(C1624eZ c1624eZ);

    /* renamed from: dx */
    public final void m2098dx(int i) {
        int i2 = this.f3199S;
        int[] iArr = this.f3198R;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new C1237X6("Nesting too deep at " + m2101od());
            }
            this.f3198R = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f3200w;
            this.f3200w = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f3197I;
            this.f3197I = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3198R;
        int i3 = this.f3199S;
        this.f3199S = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: h */
    public abstract void mo2099h();

    /* renamed from: he */
    public abstract int mo2100he();

    /* renamed from: od */
    public final String m2101od() {
        return AbstractC0795Op.m1804C(this.f3199S, this.f3198R, this.f3197I, this.f3200w);
    }

    /* renamed from: x */
    public abstract int mo2102x();

    /* renamed from: y */
    public abstract boolean mo2103y();

    /* renamed from: z */
    public abstract void mo2104z();
}
