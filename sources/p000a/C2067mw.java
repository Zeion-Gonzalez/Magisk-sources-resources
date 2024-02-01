package p000a;

/* renamed from: a.mw */
/* loaded from: classes.dex */
public final class C2067mw {

    /* renamed from: P */
    public final StringBuffer f6419P = new StringBuffer();

    /* renamed from: h */
    public int f6420h = -1;

    /* renamed from: v */
    public final char f6421v;

    /* renamed from: z */
    public final String f6422z;

    public C2067mw(String str, char c) {
        this.f6422z = str;
        this.f6421v = c;
    }

    /* renamed from: h */
    public final String m3690h() {
        int i = this.f6420h;
        String str = this.f6422z;
        if (i == str.length()) {
            return null;
        }
        int i2 = this.f6420h + 1;
        StringBuffer stringBuffer = this.f6419P;
        stringBuffer.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i2 != str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == '\"') {
                if (!z) {
                    z2 = !z2;
                }
            } else if (!z && !z2) {
                if (charAt == '\\') {
                    stringBuffer.append(charAt);
                    z = true;
                } else {
                    if (charAt == this.f6421v) {
                        break;
                    }
                    stringBuffer.append(charAt);
                }
                i2++;
            }
            stringBuffer.append(charAt);
            z = false;
            i2++;
        }
        this.f6420h = i2;
        return stringBuffer.toString();
    }

    /* renamed from: z */
    public final boolean m3691z() {
        return this.f6420h != this.f6422z.length();
    }
}
