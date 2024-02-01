package p000a;

/* renamed from: a.pd */
/* loaded from: classes.dex */
public final class C2210pd {

    /* renamed from: N */
    public long f6787N;

    /* renamed from: Q */
    public long f6789Q;

    /* renamed from: h */
    public int f6792h;

    /* renamed from: u */
    public byte f6794u;

    /* renamed from: W */
    public StringBuilder f6791W = new StringBuilder("ustar  ");

    /* renamed from: z */
    public StringBuilder f6796z = new StringBuilder();

    /* renamed from: o */
    public StringBuilder f6793o = new StringBuilder();

    /* renamed from: v */
    public int f6795v = 0;

    /* renamed from: P */
    public int f6788P = 0;

    /* renamed from: G */
    public StringBuilder f6785G = new StringBuilder();

    /* renamed from: M */
    public StringBuilder f6786M = new StringBuilder();

    /* renamed from: V */
    public StringBuilder f6790V = new StringBuilder();

    /* renamed from: h */
    public static StringBuilder m3851h(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2);
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 0) {
                break;
            }
            sb.append((char) b);
            i++;
        }
        return sb;
    }

    /* renamed from: z */
    public static int m3852z(StringBuilder sb, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2 && i3 < sb.length()) {
            bArr[i + i3] = (byte) sb.charAt(i3);
            i3++;
        }
        while (i3 < i2) {
            bArr[i + i3] = 0;
            i3++;
        }
        return i + i2;
    }
}
