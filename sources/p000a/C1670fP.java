package p000a;

/* renamed from: a.fP */
/* loaded from: classes.dex */
public final class C1670fP extends AbstractC1500cH {
    public C1670fP() {
        super(8);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: W */
    public final int mo2907W(byte[] bArr, byte[] bArr2) {
        int i;
        byte b;
        int i2;
        byte b2;
        if (bArr.length > 0) {
            EnumC2649xy.m4548z(bArr2, 0, 20);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = bArr[i3] & 255;
                int i6 = i3 + 1;
                int i7 = i5 >>> 4;
                if (i7 == 15) {
                    while (true) {
                        i2 = i6 + 1;
                        b2 = bArr[i6];
                        if (b2 != -1) {
                            break;
                        }
                        i7 += 255;
                        i6 = i2;
                    }
                    i7 += b2 & 255;
                    i6 = i2;
                }
                int i8 = i4 + i7;
                if (i8 > 12) {
                    if (i8 == 20) {
                        System.arraycopy(bArr, i6, bArr2, i4, i7);
                        return (i6 + i7) - 0;
                    }
                    throw new C2389sx(AbstractC2441tz.m4188N("Malformed input at ", i6));
                }
                EnumC2450uA.m4230Q(i6, i4, i7, bArr, bArr2);
                int i9 = i6 + i7;
                int i10 = (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8);
                int i11 = i9 + 2;
                int i12 = i8 - i10;
                if (i12 >= 0) {
                    int i13 = i5 & 15;
                    if (i13 == 15) {
                        while (true) {
                            i = i11 + 1;
                            b = bArr[i11];
                            if (b != -1) {
                                break;
                            }
                            i13 += 255;
                            i11 = i;
                        }
                        i13 += b & 255;
                    } else {
                        i = i11;
                    }
                    int i14 = i13 + 4;
                    int i15 = i8 + i14;
                    if (i15 > 12) {
                        if (i15 <= 20) {
                            for (int i16 = 0; i16 < i14; i16++) {
                                bArr2[i8 + i16] = bArr2[i12 + i16];
                            }
                            i3 = i;
                            i4 = i15;
                        } else {
                            throw new C2389sx(AbstractC2441tz.m4188N("Malformed input at ", i));
                        }
                    }
                    do {
                        for (int i17 = 0; i17 < 8; i17++) {
                            bArr2[i8 + i17] = bArr2[i12 + i17];
                        }
                        i12 += 8;
                        i8 += 8;
                    } while (i8 < i15);
                    i3 = i;
                    i4 = i15;
                } else {
                    throw new C2389sx(AbstractC2441tz.m4188N("Malformed input at ", i11));
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(0);
        }
    }
}
