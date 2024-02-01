package p000a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: a.WB */
/* loaded from: classes.dex */
public final class C1186WB extends C2698yx implements Map {

    /* renamed from: y */
    public C1833iV f3864y;

    public C1186WB(C1186WB c1186wb) {
        if (c1186wb != null) {
            int i = c1186wb.f8517w;
            m4625h(this.f8517w + i);
            if (this.f8517w == 0) {
                if (i > 0) {
                    System.arraycopy(c1186wb.f8516S, 0, this.f8516S, 0, i);
                    System.arraycopy(c1186wb.f8515R, 0, this.f8515R, 0, i << 1);
                    this.f8517w = i;
                    return;
                }
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                put(c1186wb.m4626o(i2), c1186wb.m4620G(i2));
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i = 0;
        if (this.f3864y == null) {
            this.f3864y = new C1833iV(i, this);
        }
        C1833iV c1833iV = this.f3864y;
        if (((C1391a5) c1833iV.f2047z) == null) {
            c1833iV.f2047z = new C1391a5(c1833iV, i);
        }
        return (C1391a5) c1833iV.f2047z;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3864y == null) {
            this.f3864y = new C1833iV(0, this);
        }
        C1833iV c1833iV = this.f3864y;
        if (((C1391a5) c1833iV.f2045h) == null) {
            c1833iV.f2045h = new C1391a5(c1833iV, 1);
        }
        return (C1391a5) c1833iV.f2045h;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m4625h(map.size() + this.f8517w);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3864y == null) {
            this.f3864y = new C1833iV(0, this);
        }
        C1833iV c1833iV = this.f3864y;
        if (((C2460uM) c1833iV.f2046v) == null) {
            c1833iV.f2046v = new C2460uM(c1833iV);
        }
        return (C2460uM) c1833iV.f2046v;
    }
}
