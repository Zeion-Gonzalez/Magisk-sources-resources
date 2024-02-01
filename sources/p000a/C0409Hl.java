package p000a;

import java.util.ArrayList;

/* renamed from: a.Hl */
/* loaded from: classes.dex */
public class C0409Hl implements Cloneable {

    /* renamed from: I */
    public int f1377I;

    /* renamed from: q */
    public final AbstractC1500cH f1380q;

    /* renamed from: w */
    public long[] f1381w;

    /* renamed from: S */
    public ArrayList f1379S = new ArrayList();

    /* renamed from: R */
    public long f1378R = 0;

    public C0409Hl(C0587Kz c0587Kz) {
        this.f1380q = c0587Kz;
    }

    /* renamed from: N */
    public final void m919N(Object obj, int i, Object obj2, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f1380q.mo1315y(i, this.f1379S.get(i2), obj, obj2);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: P */
    public synchronized void mo920P(Object obj, int i, Object obj2) {
        this.f1377I++;
        int size = this.f1379S.size();
        long[] jArr = this.f1381w;
        int length = jArr == null ? -1 : jArr.length - 1;
        m921Q(i, length, obj, obj2);
        m919N(obj, i, obj2, (length + 2) * 64, size, 0L);
        int i2 = this.f1377I - 1;
        this.f1377I = i2;
        if (i2 == 0) {
            long[] jArr2 = this.f1381w;
            long j = Long.MIN_VALUE;
            if (jArr2 != null) {
                for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                    long j2 = this.f1381w[length2];
                    if (j2 != 0) {
                        int i3 = (length2 + 1) * 64;
                        long j3 = Long.MIN_VALUE;
                        for (int i4 = (i3 + 64) - 1; i4 >= i3; i4--) {
                            if ((j2 & j3) != 0) {
                                this.f1379S.remove(i4);
                            }
                            j3 >>>= 1;
                        }
                        this.f1381w[length2] = 0;
                    }
                }
            }
            long j4 = this.f1378R;
            if (j4 != 0) {
                for (int i5 = 63; i5 >= 0; i5--) {
                    if ((j4 & j) != 0) {
                        this.f1379S.remove(i5);
                    }
                    j >>>= 1;
                }
                this.f1378R = 0L;
            }
        }
    }

    /* renamed from: Q */
    public final void m921Q(int i, int i2, Object obj, Object obj2) {
        if (i2 < 0) {
            m919N(obj, i, obj2, 0, Math.min(64, this.f1379S.size()), this.f1378R);
            return;
        }
        long j = this.f1381w[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f1379S.size(), i3 + 64);
        m921Q(i, i2 - 1, obj, obj2);
        m919N(obj, i, obj2, i3, min, j);
    }

    public final Object clone() {
        C0409Hl c0409Hl;
        CloneNotSupportedException e;
        synchronized (this) {
            try {
                c0409Hl = (C0409Hl) super.clone();
            } catch (CloneNotSupportedException e2) {
                c0409Hl = null;
                e = e2;
            }
            try {
                c0409Hl.f1378R = 0L;
                c0409Hl.f1381w = null;
                c0409Hl.f1377I = 0;
                c0409Hl.f1379S = new ArrayList();
                int size = this.f1379S.size();
                for (int i = 0; i < size; i++) {
                    if (!m924v(i)) {
                        c0409Hl.f1379S.add(this.f1379S.get(i));
                    }
                }
            } catch (CloneNotSupportedException e3) {
                e = e3;
                e.printStackTrace();
                return c0409Hl;
            }
        }
        return c0409Hl;
    }

    /* renamed from: o */
    public final void m922o(int i) {
        if (i < 64) {
            this.f1378R = (1 << i) | this.f1378R;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f1381w;
        if (jArr == null) {
            this.f1381w = new long[this.f1379S.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.f1379S.size() / 64];
            long[] jArr3 = this.f1381w;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f1381w = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f1381w;
        jArr4[i2] = j | jArr4[i2];
    }

    /* renamed from: u */
    public final synchronized void m923u(Object obj) {
        if (this.f1377I == 0) {
            this.f1379S.remove(obj);
        } else {
            int lastIndexOf = this.f1379S.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                m922o(lastIndexOf);
            }
        }
    }

    /* renamed from: v */
    public final boolean m924v(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.f1378R) != 0;
        }
        long[] jArr = this.f1381w;
        if (jArr != null && (i2 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    /* renamed from: z */
    public final synchronized void m925z(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        int lastIndexOf = this.f1379S.lastIndexOf(obj);
        if (lastIndexOf < 0 || m924v(lastIndexOf)) {
            this.f1379S.add(obj);
        }
    }
}
