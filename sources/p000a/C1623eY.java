package p000a;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: a.eY */
/* loaded from: classes.dex */
public class C1623eY implements Serializable, Comparable {

    /* renamed from: I */
    public static final C1623eY f5009I;

    /* renamed from: R */
    public transient int f5010R;

    /* renamed from: S */
    public final byte[] f5011S;

    /* renamed from: w */
    public transient String f5012w;

    static {
        new C2252qQ(27, 0);
        f5009I = new C1623eY(new byte[0]);
    }

    public C1623eY(byte[] bArr) {
        this.f5011S = bArr;
    }

    /* renamed from: G */
    public C1623eY mo1978G() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f5011S;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C1623eY(copyOf);
            }
            i++;
        }
    }

    /* renamed from: M */
    public final String m3077M() {
        String str = this.f5012w;
        if (str == null) {
            String str2 = new String(mo1981Q(), AbstractC2047ma.f6374z);
            this.f5012w = str2;
            return str2;
        }
        return str;
    }

    /* renamed from: N */
    public String mo1979N() {
        byte[] bArr = this.f5011S;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC1843ih.f5761z;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: P */
    public int mo1980P() {
        return this.f5011S.length;
    }

    /* renamed from: Q */
    public byte[] mo1981Q() {
        return this.f5011S;
    }

    /* renamed from: V */
    public void mo1983V(C2361sQ c2361sQ, int i) {
        c2361sQ.m4083dG(this.f5011S, 0, i);
    }

    /* renamed from: W */
    public boolean mo1984W(C1623eY c1623eY, int i) {
        return c1623eY.mo1986o(0, 0, i, this.f5011S);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002d A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            a.eY r8 = (p000a.C1623eY) r8
            int r0 = r7.mo1980P()
            int r1 = r8.mo1980P()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L26
            byte r5 = r7.mo1987u(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.mo1987u(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L23
            int r4 = r4 + 1
            goto L10
        L23:
            if (r5 >= r6) goto L2d
            goto L2b
        L26:
            if (r0 != r1) goto L29
            goto L2e
        L29:
            if (r0 >= r1) goto L2d
        L2b:
            r3 = -1
            goto L2e
        L2d:
            r3 = 1
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1623eY.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1623eY) {
            C1623eY c1623eY = (C1623eY) obj;
            int mo1980P = c1623eY.mo1980P();
            byte[] bArr = this.f5011S;
            if (mo1980P == bArr.length && c1623eY.mo1986o(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public String mo1985h() {
        return AbstractC2701z.m4628z(this.f5011S, AbstractC2701z.f8519h);
    }

    public int hashCode() {
        int i = this.f5010R;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f5011S);
            this.f5010R = hashCode;
            return hashCode;
        }
        return i;
    }

    /* renamed from: o */
    public boolean mo1986o(int i, int i2, int i3, byte[] bArr) {
        boolean z;
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f5011S;
        if (i > bArr2.length - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = 0;
        while (true) {
            if (i4 < i3) {
                if (bArr2[i4 + i] != bArr[i4 + i2]) {
                    z = false;
                    break;
                }
                i4++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:707:0x009b, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x00aa, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x00b5, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x00fd, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x010e, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x011d, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x012f, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x013c, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0183, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0194, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x01a5, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x01b4, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x01ca, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x01d7, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x01de, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x021d, code lost:
    
        if (r6 == 64) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0220, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:909:0x0220 A[EDGE_INSN: B:909:0x0220->B:884:0x0220 BREAK  A[LOOP:0: B:645:0x0014->B:945:0x0014, LOOP_LABEL: LOOP:0: B:645:0x0014->B:945:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:914:0x0220 A[EDGE_INSN: B:914:0x0220->B:884:0x0220 BREAK  A[LOOP:0: B:645:0x0014->B:945:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:919:0x0220 A[EDGE_INSN: B:919:0x0220->B:884:0x0220 BREAK  A[LOOP:0: B:645:0x0014->B:945:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:925:0x0220 A[EDGE_INSN: B:925:0x0220->B:884:0x0220 BREAK  A[LOOP:0: B:645:0x0014->B:945:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:932:0x0220 A[EDGE_INSN: B:932:0x0220->B:884:0x0220 BREAK  A[LOOP:0: B:645:0x0014->B:945:0x0014], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1623eY.toString():java.lang.String");
    }

    /* renamed from: u */
    public byte mo1987u(int i) {
        return this.f5011S[i];
    }

    /* renamed from: v */
    public C1623eY mo1988v(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f5011S, 0, mo1980P());
        return new C1623eY(messageDigest.digest());
    }

    /* renamed from: z */
    public String mo1989z() {
        return AbstractC2701z.m4628z(this.f5011S, AbstractC2701z.f8520z);
    }
}
