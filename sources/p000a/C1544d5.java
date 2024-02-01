package p000a;

import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: a.d5 */
/* loaded from: classes.dex */
public final class C1544d5 implements InterfaceC2386su, InterfaceC1622eX {

    /* renamed from: s */
    public static final TreeMap f4769s = new TreeMap();

    /* renamed from: R */
    public volatile String f4771R;

    /* renamed from: y */
    public int f4777y;

    /* renamed from: S */
    public final int f4772S = 0;

    /* renamed from: g */
    public final int[] f4773g = new int[1];

    /* renamed from: w */
    public final long[] f4776w = new long[1];

    /* renamed from: I */
    public final double[] f4770I = new double[1];

    /* renamed from: q */
    public final String[] f4775q = new String[1];

    /* renamed from: k */
    public final byte[][] f4774k = new byte[1];

    @Override // p000a.InterfaceC2386su
    /* renamed from: G */
    public final void mo324G(C2554w5 c2554w5) {
        int i = this.f4777y;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = this.f4773g[i2];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                    byte[] bArr = this.f4774k[i2];
                                    if (bArr != null) {
                                        c2554w5.m4374z(i2, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.f4775q[i2];
                                if (str != null) {
                                    c2554w5.mo2992f(i2, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            c2554w5.m4373h(i2, this.f4770I[i2]);
                        }
                    } else {
                        c2554w5.mo2991Y(i2, this.f4776w[i2]);
                    }
                } else {
                    c2554w5.mo2990T(i2);
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // p000a.InterfaceC1622eX
    /* renamed from: T */
    public final void mo2990T(int i) {
        this.f4773g[i] = 1;
    }

    @Override // p000a.InterfaceC2386su
    /* renamed from: V */
    public final String mo325V() {
        String str = this.f4771R;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // p000a.InterfaceC1622eX
    /* renamed from: Y */
    public final void mo2991Y(int i, long j) {
        this.f4773g[i] = 2;
        this.f4776w[i] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000a.InterfaceC1622eX
    /* renamed from: f */
    public final void mo2992f(int i, String str) {
        this.f4773g[i] = 4;
        this.f4775q[i] = str;
    }

    /* renamed from: z */
    public final void m2993z() {
        TreeMap treeMap = f4769s;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f4772S), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
