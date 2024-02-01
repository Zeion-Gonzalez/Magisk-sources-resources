package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.Gf */
/* loaded from: classes.dex */
public final class C0349Gf {

    /* renamed from: P */
    public String f1174P;

    /* renamed from: Q */
    public final ArrayList f1175Q;

    /* renamed from: o */
    public String f1177o;

    /* renamed from: u */
    public ArrayList f1178u;

    /* renamed from: z */
    public String f1180z;

    /* renamed from: h */
    public String f1176h = "";

    /* renamed from: v */
    public String f1179v = "";

    /* renamed from: N */
    public int f1173N = -1;

    public C0349Gf() {
        ArrayList arrayList = new ArrayList();
        this.f1175Q = arrayList;
        arrayList.add("");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:380:0x0259
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:86)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    /* renamed from: N */
    public final void m760N(p000a.C2658y7 r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0349Gf.m760N(a.y7, java.lang.String):void");
    }

    /* renamed from: P */
    public final void m761P(String str) {
        this.f1178u = str != null ? C1710g8.m3230c(C1710g8.m3233o(str, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
    }

    /* renamed from: h */
    public final C2658y7 m762h() {
        ArrayList arrayList;
        String str = this.f1180z;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String m3229Y = C1710g8.m3229Y(this.f1176h, 0, 0, false, 7);
        String m3229Y2 = C1710g8.m3229Y(this.f1179v, 0, 0, false, 7);
        String str2 = this.f1174P;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int m763v = m763v();
        ArrayList arrayList2 = this.f1175Q;
        ArrayList arrayList3 = new ArrayList(AbstractC1658fB.m3134dx(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C1710g8.m3229Y((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f1178u;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC1658fB.m3134dx(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C1710g8.m3229Y(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f1177o;
        return new C2658y7(str, m3229Y, m3229Y2, str2, m763v, arrayList3, arrayList, str4 != null ? C1710g8.m3229Y(str4, 0, 0, false, 7) : null, toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0030, code lost:
    
        if (r1 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0095, code lost:
    
        if (r1 != r2) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.f1180z
            if (r1 == 0) goto Lf
            r0.append(r1)
            java.lang.String r1 = "://"
            goto L11
        Lf:
            java.lang.String r1 = "//"
        L11:
            r0.append(r1)
            java.lang.String r1 = r7.f1176h
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L20
            r1 = r2
            goto L21
        L20:
            r1 = r3
        L21:
            r4 = 58
            if (r1 != 0) goto L32
            java.lang.String r1 = r7.f1179v
            int r1 = r1.length()
            if (r1 <= 0) goto L2f
            r1 = r2
            goto L30
        L2f:
            r1 = r3
        L30:
            if (r1 == 0) goto L50
        L32:
            java.lang.String r1 = r7.f1176h
            r0.append(r1)
            java.lang.String r1 = r7.f1179v
            int r1 = r1.length()
            if (r1 <= 0) goto L40
            goto L41
        L40:
            r2 = r3
        L41:
            if (r2 == 0) goto L4b
            r0.append(r4)
            java.lang.String r1 = r7.f1179v
            r0.append(r1)
        L4b:
            r1 = 64
            r0.append(r1)
        L50:
            java.lang.String r1 = r7.f1174P
            if (r1 == 0) goto L6f
            boolean r1 = p000a.AbstractC1269Xn.m2582d3(r1, r4)
            if (r1 == 0) goto L6a
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r7.f1174P
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L6f
        L6a:
            java.lang.String r1 = r7.f1174P
            r0.append(r1)
        L6f:
            int r1 = r7.f1173N
            r2 = -1
            if (r1 != r2) goto L78
            java.lang.String r1 = r7.f1180z
            if (r1 == 0) goto L9d
        L78:
            int r1 = r7.m763v()
            java.lang.String r5 = r7.f1180z
            if (r5 == 0) goto L97
            java.lang.String r6 = "http"
            boolean r6 = p000a.AbstractC1292YB.m2695u(r5, r6)
            if (r6 == 0) goto L8b
            r2 = 80
            goto L95
        L8b:
            java.lang.String r6 = "https"
            boolean r5 = p000a.AbstractC1292YB.m2695u(r5, r6)
            if (r5 == 0) goto L95
            r2 = 443(0x1bb, float:6.21E-43)
        L95:
            if (r1 == r2) goto L9d
        L97:
            r0.append(r4)
            r0.append(r1)
        L9d:
            java.util.ArrayList r1 = r7.f1175Q
            int r2 = r1.size()
        La3:
            if (r3 >= r2) goto Lb6
            r4 = 47
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto La3
        Lb6:
            java.util.ArrayList r1 = r7.f1178u
            if (r1 == 0) goto Lc4
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r7.f1178u
            p000a.C1710g8.m3222H(r1, r0)
        Lc4:
            java.lang.String r1 = r7.f1177o
            if (r1 == 0) goto Ld2
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r7.f1177o
            r0.append(r1)
        Ld2:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0349Gf.toString():java.lang.String");
    }

    /* renamed from: v */
    public final int m763v() {
        int i = this.f1173N;
        if (i == -1) {
            String str = this.f1180z;
            if (AbstractC1292YB.m2695u(str, "http")) {
                return 80;
            }
            if (!AbstractC1292YB.m2695u(str, "https")) {
                return -1;
            }
            return 443;
        }
        return i;
    }

    /* renamed from: z */
    public final void m764z(String str, String str2) {
        if (this.f1178u == null) {
            this.f1178u = new ArrayList();
        }
        this.f1178u.add(C1710g8.m3233o(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        this.f1178u.add(str2 != null ? C1710g8.m3233o(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
    }
}
