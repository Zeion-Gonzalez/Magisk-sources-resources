package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: a.j0 */
/* loaded from: classes.dex */
public final class C1858j0 implements InterfaceC1036TR {

    /* renamed from: I */
    public static final LinkedHashSet f5795I = new LinkedHashSet(Arrays.asList(C1543d4.class, C0025AS.class, C1754gy.class, C0794Oo.class, C0802Oy.class, AbstractC0900Qy.class, C2379sk.class));

    /* renamed from: q */
    public static final Map f5796q;

    /* renamed from: G */
    public final C0175DP f5797G;

    /* renamed from: M */
    public final List f5798M;

    /* renamed from: P */
    public boolean f5800P;

    /* renamed from: R */
    public final ArrayList f5802R;

    /* renamed from: V */
    public final C1870jF f5804V;

    /* renamed from: W */
    public final List f5805W;

    /* renamed from: o */
    public boolean f5807o;

    /* renamed from: w */
    public final LinkedHashSet f5810w;

    /* renamed from: z */
    public CharSequence f5811z;

    /* renamed from: h */
    public int f5806h = 0;

    /* renamed from: v */
    public int f5809v = 0;

    /* renamed from: N */
    public int f5799N = 0;

    /* renamed from: Q */
    public int f5801Q = 0;

    /* renamed from: u */
    public int f5808u = 0;

    /* renamed from: S */
    public final LinkedHashMap f5803S = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(C1543d4.class, new C1732gc(3));
        hashMap.put(C0025AS.class, new C1732gc(0));
        hashMap.put(C1754gy.class, new C1732gc(4));
        hashMap.put(C0794Oo.class, new C1732gc(1));
        hashMap.put(C0802Oy.class, new C1732gc(6));
        hashMap.put(AbstractC0900Qy.class, new C1732gc(2));
        hashMap.put(C2379sk.class, new C1732gc(5));
        f5796q = Collections.unmodifiableMap(hashMap);
    }

    public C1858j0(ArrayList arrayList, C0175DP c0175dp, List list) {
        ArrayList arrayList2 = new ArrayList();
        this.f5802R = arrayList2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f5810w = linkedHashSet;
        this.f5805W = arrayList;
        this.f5797G = c0175dp;
        this.f5798M = list;
        C1870jF c1870jF = new C1870jF(1);
        this.f5804V = c1870jF;
        arrayList2.add(c1870jF);
        linkedHashSet.add(c1870jF);
    }

    /* renamed from: G */
    public final void m3475G(int i) {
        int i2;
        int i3 = this.f5801Q;
        if (i >= i3) {
            this.f5806h = this.f5799N;
            this.f5809v = i3;
        }
        int length = this.f5811z.length();
        while (true) {
            i2 = this.f5809v;
            if (i2 >= i || this.f5806h == length) {
                break;
            } else {
                m3478P();
            }
        }
        if (i2 <= i) {
            this.f5800P = false;
            return;
        }
        this.f5806h--;
        this.f5809v = i;
        this.f5800P = true;
    }

    /* renamed from: M */
    public final void m3476M(int i) {
        int i2 = this.f5799N;
        if (i >= i2) {
            this.f5806h = i2;
            this.f5809v = this.f5801Q;
        }
        int length = this.f5811z.length();
        while (true) {
            int i3 = this.f5806h;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m3478P();
            }
        }
        this.f5800P = false;
    }

    /* renamed from: N */
    public final void m3477N(AbstractC2392t abstractC2392t) {
        if (m3482o() == abstractC2392t) {
            this.f5802R.remove(r0.size() - 1);
        }
        if (abstractC2392t instanceof C1198WO) {
            m3481h((C1198WO) abstractC2392t);
        }
        abstractC2392t.mo42v();
    }

    /* renamed from: P */
    public final void m3478P() {
        if (this.f5811z.charAt(this.f5806h) == '\t') {
            this.f5806h++;
            int i = this.f5809v;
            this.f5809v = (4 - (i % 4)) + i;
        } else {
            this.f5806h++;
            this.f5809v++;
        }
    }

    /* renamed from: Q */
    public final void m3479Q(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                m3477N((AbstractC2392t) arrayList.get(size));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:553:0x0202, code lost:
    
        if (r4.length() == 0) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x040c, code lost:
    
        if (r11 != '\t') goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x04ed, code lost:
    
        if (r4.length() == 0) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0600, code lost:
    
        if ((r1 instanceof p000a.C1198WO) == false) goto L810;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x060f  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3480W(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1858j0.m3480W(java.lang.String):void");
    }

    /* renamed from: h */
    public final void m3481h(C1198WO c1198wo) {
        C1873jI c1873jI = c1198wo.f3901h;
        c1873jI.m3492z();
        Iterator it = c1873jI.f5855v.iterator();
        while (it.hasNext()) {
            C0665Mb c0665Mb = (C0665Mb) it.next();
            C0172DL c0172dl = c1198wo.f3902z;
            c0172dl.getClass();
            c0665Mb.m2874Q();
            AbstractC1462bT abstractC1462bT = c0172dl.f4554P;
            c0665Mb.f4554P = abstractC1462bT;
            if (abstractC1462bT != null) {
                abstractC1462bT.f4553N = c0665Mb;
            }
            c0665Mb.f4553N = c0172dl;
            c0172dl.f4554P = c0665Mb;
            AbstractC1462bT abstractC1462bT2 = c0172dl.f4557z;
            c0665Mb.f4557z = abstractC1462bT2;
            if (c0665Mb.f4554P == null) {
                abstractC1462bT2.f4555h = c0665Mb;
            }
            LinkedHashMap linkedHashMap = this.f5803S;
            String str = c0665Mb.f2155Q;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, c0665Mb);
            }
        }
    }

    /* renamed from: o */
    public final AbstractC2392t m3482o() {
        return (AbstractC2392t) this.f5802R.get(r0.size() - 1);
    }

    /* renamed from: u */
    public final void m3483u() {
        int i = this.f5806h;
        int i2 = this.f5809v;
        this.f5807o = true;
        int length = this.f5811z.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.f5811z.charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.f5807o = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f5799N = i;
        this.f5801Q = i2;
        this.f5808u = i2 - this.f5809v;
    }

    /* renamed from: v */
    public final void m3484v() {
        CharSequence subSequence;
        if (this.f5800P) {
            int i = this.f5806h + 1;
            CharSequence charSequence = this.f5811z;
            CharSequence subSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.f5809v % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f5811z;
            subSequence = charSequence2.subSequence(this.f5806h, charSequence2.length());
        }
        m3482o().mo43z(subSequence);
    }

    /* renamed from: z */
    public final void m3485z(AbstractC2392t abstractC2392t) {
        while (!m3482o().mo3491h(abstractC2392t.mo39P())) {
            m3477N(m3482o());
        }
        m3482o().mo39P().m2875h(abstractC2392t.mo39P());
        this.f5802R.add(abstractC2392t);
        this.f5810w.add(abstractC2392t);
    }
}
