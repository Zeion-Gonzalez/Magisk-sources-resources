package p000a;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: a.Jm */
/* loaded from: classes.dex */
public class C0519Jm {

    /* renamed from: N */
    public int f1732N;

    /* renamed from: P */
    public int f1733P;

    /* renamed from: h */
    public int f1734h;

    /* renamed from: v */
    public final int f1735v;

    /* renamed from: z */
    public final LinkedHashMap f1736z;

    public C0519Jm(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1735v = i;
        this.f1736z = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: h */
    public final Object m1208h(Object obj, Object obj2) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1734h++;
            put = this.f1736z.put(obj, obj2);
            if (put != null) {
                this.f1734h--;
            }
        }
        m1209v(this.f1735v);
        return put;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f1733P;
        i2 = this.f1732N + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1735v), Integer.valueOf(this.f1733P), Integer.valueOf(this.f1732N), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0062, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1209v(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f1734h     // Catch: java.lang.Throwable -> L63
            if (r0 < 0) goto L44
            java.util.LinkedHashMap r0 = r2.f1736z     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L11
            int r0 = r2.f1734h     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L44
        L11:
            int r0 = r2.f1734h     // Catch: java.lang.Throwable -> L63
            if (r0 <= r3) goto L42
            java.util.LinkedHashMap r0 = r2.f1736z     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L1e
            goto L42
        L1e:
            java.util.LinkedHashMap r0 = r2.f1736z     // Catch: java.lang.Throwable -> L63
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L63
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L63
            r0.getValue()     // Catch: java.lang.Throwable -> L63
            java.util.LinkedHashMap r0 = r2.f1736z     // Catch: java.lang.Throwable -> L63
            r0.remove(r1)     // Catch: java.lang.Throwable -> L63
            int r0 = r2.f1734h     // Catch: java.lang.Throwable -> L63
            int r0 = r0 + (-1)
            r2.f1734h = r0     // Catch: java.lang.Throwable -> L63
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
            goto L0
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
            return
        L44:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L63
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L63
            throw r3     // Catch: java.lang.Throwable -> L63
        L63:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0519Jm.m1209v(int):void");
    }

    /* renamed from: z */
    public final Object m1210z(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.f1736z.get(obj);
            if (obj2 != null) {
                this.f1733P++;
                return obj2;
            }
            this.f1732N++;
            return null;
        }
    }
}
