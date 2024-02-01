package p000a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: a.nR */
/* loaded from: classes.dex */
public final class C2093nR {

    /* renamed from: P */
    public Object f6459P;

    /* renamed from: h */
    public int f6460h;

    /* renamed from: v */
    public int f6461v;

    /* renamed from: z */
    public int f6462z;

    /* renamed from: h */
    public final void m3718h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f6461v * 2;
        Object obj = this.f6459P;
        if (((int[]) obj) == null) {
            int[] iArr = new int[4];
            this.f6459P = iArr;
            Arrays.fill(iArr, -1);
        } else if (i3 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int[] iArr3 = new int[i3 * 2];
            this.f6459P = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        }
        Object obj2 = this.f6459P;
        ((int[]) obj2)[i3] = i;
        ((int[]) obj2)[i3 + 1] = i2;
        this.f6461v++;
    }

    /* renamed from: v */
    public final void m3719v(RecyclerView recyclerView, boolean z) {
        boolean z2 = false;
        this.f6461v = 0;
        int[] iArr = (int[]) this.f6459P;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0667Md abstractC0667Md = recyclerView.f9077J;
        if (recyclerView.f9124r != null && abstractC0667Md != null && abstractC0667Md.f2168W) {
            if (z) {
                if (!recyclerView.f9122q.m2618u()) {
                    abstractC0667Md.mo1517W(recyclerView.f9124r.mo918z(), this);
                }
            } else {
                if (!recyclerView.f9109j || recyclerView.f9126t || recyclerView.f9122q.m2618u()) {
                    z2 = true;
                }
                if (!z2) {
                    abstractC0667Md.mo1543o(this.f6462z, this.f6460h, recyclerView.f9064BX, this);
                }
            }
            int i = this.f6461v;
            if (i > abstractC0667Md.f2160G) {
                abstractC0667Md.f2160G = i;
                abstractC0667Md.f2161M = z;
                recyclerView.f9128w.m3051R();
            }
        }
    }

    /* renamed from: z */
    public final void m3720z(C0821PK c0821pk) {
        c0821pk.f2790w = null;
        c0821pk.f2785S = null;
        c0821pk.f2784R = null;
        c0821pk.f2789s = 1;
        int i = this.f6462z;
        if (i > 0) {
            int i2 = this.f6461v;
            if ((i2 & 1) == 0) {
                this.f6461v = i2 + 1;
                this.f6462z = i - 1;
                this.f6460h++;
            }
        }
        c0821pk.f2785S = (C0821PK) this.f6459P;
        this.f6459P = c0821pk;
        int i3 = this.f6461v + 1;
        this.f6461v = i3;
        int i4 = this.f6462z;
        if (i4 > 0 && (i3 & 1) == 0) {
            this.f6461v = i3 + 1;
            this.f6462z = i4 - 1;
            this.f6460h++;
        }
        int i5 = 4;
        while (true) {
            int i6 = i5 - 1;
            if ((this.f6461v & i6) != i6) {
                return;
            }
            int i7 = this.f6460h;
            if (i7 == 0) {
                C0821PK c0821pk2 = (C0821PK) this.f6459P;
                C0821PK c0821pk3 = c0821pk2.f2785S;
                C0821PK c0821pk4 = c0821pk3.f2785S;
                c0821pk3.f2785S = c0821pk4.f2785S;
                this.f6459P = c0821pk3;
                c0821pk3.f2784R = c0821pk4;
                c0821pk3.f2790w = c0821pk2;
                c0821pk3.f2789s = c0821pk2.f2789s + 1;
                c0821pk4.f2785S = c0821pk3;
                c0821pk2.f2785S = c0821pk3;
            } else {
                if (i7 == 1) {
                    C0821PK c0821pk5 = (C0821PK) this.f6459P;
                    C0821PK c0821pk6 = c0821pk5.f2785S;
                    this.f6459P = c0821pk6;
                    c0821pk6.f2790w = c0821pk5;
                    c0821pk6.f2789s = c0821pk5.f2789s + 1;
                    c0821pk5.f2785S = c0821pk6;
                } else if (i7 != 2) {
                }
                this.f6460h = 0;
            }
            i5 *= 2;
        }
    }
}
