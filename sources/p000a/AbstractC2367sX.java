package p000a;

/* renamed from: a.sX */
/* loaded from: classes.dex */
public abstract class AbstractC2367sX {

    /* renamed from: P */
    public static final String[] f7270P;

    /* renamed from: h */
    public static final String[] f7271h;

    /* renamed from: v */
    public static final String[] f7272v;

    /* renamed from: z */
    public static final C1623eY f7273z;

    static {
        C1623eY c1623eY = C1623eY.f5009I;
        f7273z = C2252qQ.m3884M("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f7271h = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f7272v = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = AbstractC1181W6.m2429u("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f7270P = strArr;
        String[] strArr2 = f7272v;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC2441tz.m4187M(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f7272v;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC2441tz.m4187M(sb, strArr3[i4], "|PADDED");
        }
        int length = f7272v.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f7272v;
            if (strArr4[i7] == null) {
                strArr4[i7] = f7270P[i7];
            }
        }
    }

    /* renamed from: z */
    public static String m4092z(int i, int i2, int i3, int i4, boolean z) {
        String m2429u;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] strArr = f7271h;
        if (i3 < strArr.length) {
            m2429u = strArr[i3];
        } else {
            m2429u = AbstractC1181W6.m2429u("0x%02x", Integer.valueOf(i3));
        }
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr2 = f7270P;
            if (i3 != 2 && i3 != 3) {
                if (i3 != 4 && i3 != 6) {
                    if (i3 != 7 && i3 != 8) {
                        String[] strArr3 = f7272v;
                        if (i4 < strArr3.length) {
                            str2 = strArr3[i4];
                        } else {
                            str2 = strArr2[i4];
                        }
                        if (i3 == 5 && (i4 & 4) != 0) {
                            str3 = "HEADERS";
                            str4 = "PUSH_PROMISE";
                        } else if (i3 == 0 && (i4 & 32) != 0) {
                            str3 = "PRIORITY";
                            str4 = "COMPRESSED";
                        } else {
                            str = str2;
                        }
                        str = AbstractC1269Xn.m2588hs(str2, str3, str4);
                    }
                } else if (i4 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i4];
                }
            }
            str = strArr2[i4];
        }
        if (z) {
            str5 = "<<";
        } else {
            str5 = ">>";
        }
        return AbstractC1181W6.m2429u("%s 0x%08x %5d %-13s %s", str5, Integer.valueOf(i), Integer.valueOf(i2), m2429u, str);
    }
}
