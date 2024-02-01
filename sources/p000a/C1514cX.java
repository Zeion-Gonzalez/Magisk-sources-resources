package p000a;

/* renamed from: a.cX */
/* loaded from: classes.dex */
public final class C1514cX extends AbstractC2703z2 {
    public C1514cX() {
        super(11);
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: ZH */
    public final long mo2936ZH(long j, byte[] bArr) {
        int i = 0;
        EnumC2649xy.m4548z(bArr, 0, 100);
        long j2 = (j - 7046029288634856825L) - 4417276706812531889L;
        long j3 = j - 4417276706812531889L;
        long j4 = j + 0;
        long j5 = j - (-7046029288634856825L);
        do {
            j2 = Long.rotateLeft(j2 + (EnumC2649xy.m4545P(i, bArr) * (-4417276706812531889L)), 31) * (-7046029288634856825L);
            int i2 = i + 8;
            j3 = Long.rotateLeft((EnumC2649xy.m4545P(i2, bArr) * (-4417276706812531889L)) + j3, 31) * (-7046029288634856825L);
            int i3 = i2 + 8;
            j4 = Long.rotateLeft((EnumC2649xy.m4545P(i3, bArr) * (-4417276706812531889L)) + j4, 31) * (-7046029288634856825L);
            int i4 = i3 + 8;
            j5 = Long.rotateLeft((EnumC2649xy.m4545P(i4, bArr) * (-4417276706812531889L)) + j5, 31) * (-7046029288634856825L);
            i = i4 + 8;
        } while (i <= 68);
        long rotateLeft = (((((((((((((Long.rotateLeft(j2 * (-4417276706812531889L), 31) * (-7046029288634856825L)) ^ (Long.rotateLeft(j5, 18) + (Long.rotateLeft(j4, 12) + (Long.rotateLeft(j3, 7) + Long.rotateLeft(j2, 1))))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(j3 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(j4 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(j5 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) + 100;
        while (i <= 92) {
            rotateLeft = (Long.rotateLeft(rotateLeft ^ (Long.rotateLeft(EnumC2649xy.m4545P(i, bArr) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i += 8;
        }
        if (i <= 96) {
            rotateLeft = (Long.rotateLeft(rotateLeft ^ ((EnumC2649xy.m4547v(i, bArr) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i += 4;
        }
        while (i < 100) {
            rotateLeft = Long.rotateLeft(rotateLeft ^ ((bArr[i] & 255) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i++;
        }
        long j6 = ((rotateLeft >>> 33) ^ rotateLeft) * (-4417276706812531889L);
        long j7 = (j6 ^ (j6 >>> 29)) * 1609587929392839161L;
        return j7 ^ (j7 >>> 32);
    }
}
