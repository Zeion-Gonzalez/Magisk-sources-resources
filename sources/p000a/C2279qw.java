package p000a;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: a.qw */
/* loaded from: classes.dex */
public final class C2279qw extends AbstractC2626xP {

    /* renamed from: s */
    public static final String[] f7009s = new String[128];

    /* renamed from: g */
    public final InterfaceC1432as f7010g;

    /* renamed from: y */
    public String f7011y;

    static {
        for (int i = 0; i <= 31; i++) {
            f7009s[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f7009s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C2279qw(C2361sQ c2361sQ) {
        this.f7010g = c2361sQ;
        int[] iArr = this.f8143R;
        int i = this.f8144S;
        this.f8144S = i + 1;
        iArr[i] = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x002b  */
    /* renamed from: ZH */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3916ZH(p000a.InterfaceC1432as r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = p000a.C2279qw.f7009s
            r1 = 34
            r7.mo945qn(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.mo942c(r4, r3, r8)
        L2e:
            r7.mo938K(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.mo942c(r4, r2, r8)
        L3b:
            r7.mo945qn(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2279qw.m3916ZH(a.as, java.lang.String):void");
    }

    /* renamed from: BO */
    public final void m3917BO() {
        int m4523C = m4523C();
        int i = 2;
        if (m4523C != 1) {
            InterfaceC1432as interfaceC1432as = this.f7010g;
            if (m4523C != 2) {
                if (m4523C != 4) {
                    if (m4523C != 9) {
                        i = 7;
                        if (m4523C != 6) {
                            if (m4523C == 7) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                            throw new IllegalStateException("Nesting problem.");
                        }
                    } else {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                } else {
                    interfaceC1432as.mo938K(":");
                    i = 5;
                }
            } else {
                interfaceC1432as.mo945qn(44);
            }
        }
        this.f8143R[this.f8144S - 1] = i;
    }

    @Override // p000a.AbstractC2626xP
    /* renamed from: G */
    public final C2279qw mo3918G() {
        this.f8146q = false;
        m3924he('}', 3, 5);
        return this;
    }

    /* renamed from: Lq */
    public final void m3919Lq() {
        if (this.f7011y != null) {
            int m4523C = m4523C();
            InterfaceC1432as interfaceC1432as = this.f7010g;
            if (m4523C == 5) {
                interfaceC1432as.mo945qn(44);
            } else if (m4523C != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f8143R[this.f8144S - 1] = 4;
            m3916ZH(interfaceC1432as, this.f7011y);
            this.f7011y = null;
        }
    }

    @Override // p000a.AbstractC2626xP
    /* renamed from: U8 */
    public final C2279qw mo3920U8(String str) {
        if (str == null) {
            mo3926y();
            return this;
        }
        if (this.f8146q) {
            this.f8146q = false;
            mo3921V(str);
            return this;
        }
        m3919Lq();
        m3917BO();
        m3916ZH(this.f7010g, str);
        int[] iArr = this.f8142I;
        int i = this.f8144S - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p000a.AbstractC2626xP
    /* renamed from: V */
    public final C2279qw mo3921V(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f8144S == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int m4523C = m4523C();
        if ((m4523C != 3 && m4523C != 5) || this.f7011y != null || this.f8146q) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f7011y = str;
        this.f8147w[this.f8144S - 1] = str;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7010g.close();
        int i = this.f8144S;
        if (i > 1 || (i == 1 && this.f8143R[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f8144S = 0;
    }

    /* renamed from: dx */
    public final void m3922dx(char c, int i, int i2) {
        int i3;
        int i4 = this.f8144S;
        int i5 = this.f8145k;
        if (i4 == i5 && ((i3 = this.f8143R[i4 - 1]) == i || i3 == i2)) {
            this.f8145k = ~i5;
            return;
        }
        m3917BO();
        int i6 = this.f8144S;
        int[] iArr = this.f8143R;
        if (i6 == iArr.length) {
            if (i6 != 256) {
                this.f8143R = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f8147w;
                this.f8147w = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f8142I;
                this.f8142I = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C1237X6("Nesting too deep at " + m4524od() + ": circular reference?");
            }
        }
        int[] iArr3 = this.f8143R;
        int i7 = this.f8144S;
        int i8 = i7 + 1;
        this.f8144S = i8;
        iArr3[i7] = i;
        this.f8142I[i8 - 1] = 0;
        this.f7010g.mo945qn(c);
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f8144S == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f7010g.flush();
    }

    @Override // p000a.AbstractC2626xP
    /* renamed from: h */
    public final C2279qw mo3923h() {
        if (this.f8146q) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m4524od());
        }
        m3919Lq();
        m3922dx('{', 3, 5);
        return this;
    }

    /* renamed from: he */
    public final void m3924he(char c, int i, int i2) {
        int m4523C = m4523C();
        if (m4523C != i2 && m4523C != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f7011y != null) {
            throw new IllegalStateException("Dangling name: " + this.f7011y);
        }
        int i3 = this.f8144S;
        int i4 = ~this.f8145k;
        if (i3 == i4) {
            this.f8145k = i4;
            return;
        }
        int i5 = i3 - 1;
        this.f8144S = i5;
        this.f8147w[i5] = null;
        int[] iArr = this.f8142I;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.f7010g.mo945qn(c);
    }

    @Override // p000a.AbstractC2626xP
    /* renamed from: x */
    public final C2279qw mo3925x(long j) {
        if (this.f8146q) {
            this.f8146q = false;
            mo3921V(Long.toString(j));
            return this;
        }
        m3919Lq();
        m3917BO();
        this.f7010g.mo938K(Long.toString(j));
        int[] iArr = this.f8142I;
        int i = this.f8144S - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p000a.AbstractC2626xP
    /* renamed from: y */
    public final C2279qw mo3926y() {
        if (this.f8146q) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m4524od());
        }
        if (this.f7011y != null) {
            this.f7011y = null;
            return this;
        }
        m3917BO();
        this.f7010g.mo938K("null");
        int[] iArr = this.f8142I;
        int i = this.f8144S - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p000a.AbstractC2626xP
    /* renamed from: z */
    public final C2279qw mo3927z() {
        if (this.f8146q) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m4524od());
        }
        m3919Lq();
        m3922dx('[', 1, 2);
        return this;
    }
}
