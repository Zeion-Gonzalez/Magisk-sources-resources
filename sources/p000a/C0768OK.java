package p000a;

/* renamed from: a.OK */
/* loaded from: classes.dex */
public final class C0768OK extends AbstractC0845Pm {
    @Override // p000a.AbstractC0845Pm
    /* renamed from: G */
    public final void mo1775G(byte[] bArr, int i) {
        int i2;
        EnumC2649xy.m4548z(bArr, 0, i);
        this.f2852g += i;
        int i3 = this.f2853k;
        int i4 = i3 + i;
        byte[] bArr2 = this.f2856y;
        if (i4 < 16) {
            System.arraycopy(bArr, 0, bArr2, i3, i);
            this.f2853k += i;
            return;
        }
        int i5 = i + 0;
        if (i3 > 0) {
            System.arraycopy(bArr, 0, bArr2, i3, 16 - i3);
            int m4547v = (EnumC2649xy.m4547v(0, bArr2) * (-2048144777)) + this.f2850R;
            this.f2850R = m4547v;
            this.f2850R = Integer.rotateLeft(m4547v, 13) * (-1640531535);
            int m4547v2 = (EnumC2649xy.m4547v(4, bArr2) * (-2048144777)) + this.f2855w;
            this.f2855w = m4547v2;
            this.f2855w = Integer.rotateLeft(m4547v2, 13) * (-1640531535);
            int m4547v3 = (EnumC2649xy.m4547v(8, bArr2) * (-2048144777)) + this.f2849I;
            this.f2849I = m4547v3;
            this.f2849I = Integer.rotateLeft(m4547v3, 13) * (-1640531535);
            int m4547v4 = (EnumC2649xy.m4547v(12, bArr2) * (-2048144777)) + this.f2854q;
            this.f2854q = m4547v4;
            this.f2854q = Integer.rotateLeft(m4547v4, 13) * (-1640531535);
            i2 = (16 - this.f2853k) + 0;
            this.f2853k = 0;
        } else {
            i2 = 0;
        }
        int i6 = i5 - 16;
        int i7 = this.f2850R;
        int i8 = this.f2855w;
        int i9 = this.f2849I;
        int i10 = this.f2854q;
        while (i2 <= i6) {
            i7 = Integer.rotateLeft((EnumC2649xy.m4547v(i2, bArr) * (-2048144777)) + i7, 13) * (-1640531535);
            int i11 = i2 + 4;
            i8 = Integer.rotateLeft((EnumC2649xy.m4547v(i11, bArr) * (-2048144777)) + i8, 13) * (-1640531535);
            int i12 = i11 + 4;
            i9 = Integer.rotateLeft((EnumC2649xy.m4547v(i12, bArr) * (-2048144777)) + i9, 13) * (-1640531535);
            int i13 = i12 + 4;
            i10 = Integer.rotateLeft((EnumC2649xy.m4547v(i13, bArr) * (-2048144777)) + i10, 13) * (-1640531535);
            i2 = i13 + 4;
        }
        this.f2850R = i7;
        this.f2855w = i8;
        this.f2849I = i9;
        this.f2854q = i10;
        if (i2 < i5) {
            int i14 = i5 - i2;
            System.arraycopy(bArr, i2, bArr2, 0, i14);
            this.f2853k = i14;
        }
    }

    @Override // p000a.AbstractC0845Pm
    /* renamed from: z */
    public final int mo1776z() {
        int i;
        byte[] bArr;
        if (this.f2852g >= 16) {
            i = Integer.rotateLeft(this.f2854q, 18) + Integer.rotateLeft(this.f2849I, 12) + Integer.rotateLeft(this.f2855w, 7) + Integer.rotateLeft(this.f2850R, 1);
        } else {
            i = this.f2851S + 374761393;
        }
        int i2 = (int) (i + this.f2852g);
        int i3 = 0;
        while (true) {
            int i4 = this.f2853k - 4;
            bArr = this.f2856y;
            if (i3 > i4) {
                break;
            }
            i2 = Integer.rotateLeft((EnumC2649xy.m4547v(i3, bArr) * (-1028477379)) + i2, 17) * 668265263;
            i3 += 4;
        }
        while (i3 < this.f2853k) {
            i2 = Integer.rotateLeft(((bArr[i3] & 255) * 374761393) + i2, 11) * (-1640531535);
            i3++;
        }
        int i5 = (i2 ^ (i2 >>> 15)) * (-2048144777);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477379);
        return i6 ^ (i6 >>> 16);
    }
}
