package p000a;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a.hf */
/* loaded from: classes.dex */
public class C1789hf implements Iterable {

    /* renamed from: R */
    public C0513Jg f5619R;

    /* renamed from: S */
    public C0513Jg f5620S;

    /* renamed from: w */
    public final WeakHashMap f5621w = new WeakHashMap();

    /* renamed from: I */
    public int f5618I = 0;

    /* renamed from: P */
    public Object mo2922P(Object obj) {
        C0513Jg mo2923h = mo2923h(obj);
        if (mo2923h == null) {
            return null;
        }
        this.f5618I--;
        WeakHashMap weakHashMap = this.f5621w;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2569wP) it.next()).mo3031z(mo2923h);
            }
        }
        C0513Jg c0513Jg = mo2923h.f1704I;
        C0513Jg c0513Jg2 = mo2923h.f1707w;
        if (c0513Jg != null) {
            c0513Jg.f1707w = c0513Jg2;
        } else {
            this.f5620S = c0513Jg2;
        }
        C0513Jg c0513Jg3 = mo2923h.f1707w;
        if (c0513Jg3 != null) {
            c0513Jg3.f1704I = c0513Jg;
        } else {
            this.f5619R = c0513Jg;
        }
        mo2923h.f1707w = null;
        mo2923h.f1704I = null;
        return mo2923h.f1705R;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0050, code lost:
    
        if (((p000a.AbstractC1712gB) r7).hasNext() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p000a.C1789hf
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.hf r7 = (p000a.C1789hf) r7
            int r1 = r6.f5618I
            int r3 = r7.f5618I
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            a.gB r3 = (p000a.AbstractC1712gB) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            a.gB r4 = (p000a.AbstractC1712gB) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            a.gB r7 = (p000a.AbstractC1712gB) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1789hf.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public C0513Jg mo2923h(Object obj) {
        C0513Jg c0513Jg = this.f5620S;
        while (c0513Jg != null && !c0513Jg.f1706S.equals(obj)) {
            c0513Jg = c0513Jg.f1707w;
        }
        return c0513Jg;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            AbstractC1712gB abstractC1712gB = (AbstractC1712gB) it;
            if (!abstractC1712gB.hasNext()) {
                return i;
            }
            i += ((Map.Entry) abstractC1712gB.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0901R0 c0901r0 = new C0901R0(this.f5620S, this.f5619R, 0);
        this.f5621w.put(c0901r0, Boolean.FALSE);
        return c0901r0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            AbstractC1712gB abstractC1712gB = (AbstractC1712gB) it;
            if (!abstractC1712gB.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) abstractC1712gB.next()).toString());
            if (abstractC1712gB.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* renamed from: v */
    public Object mo2924v(Object obj, Object obj2) {
        C0513Jg mo2923h = mo2923h(obj);
        if (mo2923h != null) {
            return mo2923h.f1705R;
        }
        C0513Jg c0513Jg = new C0513Jg(obj, obj2);
        this.f5618I++;
        C0513Jg c0513Jg2 = this.f5619R;
        if (c0513Jg2 == null) {
            this.f5620S = c0513Jg;
        } else {
            c0513Jg2.f1707w = c0513Jg;
            c0513Jg.f1704I = c0513Jg2;
        }
        this.f5619R = c0513Jg;
        return null;
    }
}
