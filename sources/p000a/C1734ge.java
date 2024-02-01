package p000a;

/* renamed from: a.ge */
/* loaded from: classes.dex */
public final class C1734ge {

    /* renamed from: N */
    public static final byte[] f5465N = new byte[1792];

    /* renamed from: P */
    public char f5466P;

    /* renamed from: h */
    public final int f5467h;

    /* renamed from: v */
    public int f5468v;

    /* renamed from: z */
    public final CharSequence f5469z;

    static {
        for (int i = 0; i < 1792; i++) {
            f5465N[i] = Character.getDirectionality(i);
        }
    }

    public C1734ge(String str) {
        this.f5469z = str;
        this.f5467h = str.length();
    }

    /* renamed from: z */
    public final byte m3267z() {
        int i = this.f5468v - 1;
        CharSequence charSequence = this.f5469z;
        char charAt = charSequence.charAt(i);
        this.f5466P = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f5468v);
            this.f5468v -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f5468v--;
        char c = this.f5466P;
        if (c < 1792) {
            return f5465N[c];
        }
        return Character.getDirectionality(c);
    }
}
