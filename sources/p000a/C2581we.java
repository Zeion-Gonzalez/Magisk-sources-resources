package p000a;

/* renamed from: a.we */
/* loaded from: classes.dex */
public final class C2581we {

    /* renamed from: N */
    public static final String f7902N;

    /* renamed from: P */
    public static final String f7903P;

    /* renamed from: Q */
    public static final C2581we f7904Q;

    /* renamed from: u */
    public static final C2581we f7905u;

    /* renamed from: h */
    public final int f7906h;

    /* renamed from: v */
    public final AbstractC0394HT f7907v;

    /* renamed from: z */
    public final boolean f7908z;

    static {
        C0678Mp c0678Mp = AbstractC0690N3.f2334v;
        f7903P = Character.toString((char) 8206);
        f7902N = Character.toString((char) 8207);
        f7904Q = new C2581we(false, 2, c0678Mp);
        f7905u = new C2581we(true, 2, c0678Mp);
    }

    public C2581we(boolean z, int i, AbstractC0394HT abstractC0394HT) {
        this.f7908z = z;
        this.f7906h = i;
        this.f7907v = abstractC0394HT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0041, code lost:
    
        return 1;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4463h(java.lang.String r6) {
        /*
            a.ge r0 = new a.ge
            r0.<init>(r6)
            int r6 = r0.f5467h
            r0.f5468v = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f5468v
            if (r3 <= 0) goto L41
            byte r3 = r0.m3267z()
            if (r3 == 0) goto L39
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r1 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r1 != r2) goto L2f
            goto L34
        L2c:
            if (r1 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r6 = r4
            goto L41
        L36:
            if (r1 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r6 = -1
            goto L41
        L3d:
            if (r1 != 0) goto Lc
        L3f:
            r1 = r2
            goto Lb
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2581we.m4463h(java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x006e, code lost:
    
        if (r1 != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0071, code lost:
    
        if (r2 == 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0077, code lost:
    
        if (r0.f5468v <= 0) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x007d, code lost:
    
        switch(r0.m3267z()) {
            case 14: goto L220;
            case 15: goto L220;
            case 16: goto L219;
            case 17: goto L219;
            case 18: goto L218;
            default: goto L224;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0081, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0084, code lost:
    
        if (r1 != r3) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0088, code lost:
    
        if (r1 != r3) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x008c, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x008f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:?, code lost:
    
        return 0;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4464z(java.lang.String r9) {
        /*
            a.ge r0 = new a.ge
            r0.<init>(r9)
            r9 = 0
            r0.f5468v = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f5468v
            int r5 = r0.f5467h
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f5469z
            char r4 = r5.charAt(r4)
            r0.f5466P = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f5468v
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f5468v
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f5468v = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f5468v
            int r4 = r4 + r7
            r0.f5468v = r4
            char r4 = r0.f5466P
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = p000a.C1734ge.f5465N
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L86
        L69:
            if (r3 != 0) goto L6c
            goto L8a
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8f
        L71:
            if (r2 == 0) goto L75
            r9 = r2
            goto L8f
        L75:
            int r2 = r0.f5468v
            if (r2 <= 0) goto L8f
            byte r2 = r0.m3267z()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r3 = r3 + 1
            goto L75
        L84:
            if (r1 != r3) goto L8c
        L86:
            r9 = r7
            goto L8f
        L88:
            if (r1 != r3) goto L8c
        L8a:
            r9 = r6
            goto L8f
        L8c:
            int r3 = r3 + (-1)
            goto L75
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2581we.m4464z(java.lang.String):int");
    }
}
