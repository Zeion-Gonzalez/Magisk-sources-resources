package p000a;

import java.util.HashMap;

/* renamed from: a.cP */
/* loaded from: classes.dex */
public final class C1507cP extends C1789hf {

    /* renamed from: q */
    public final HashMap f4660q = new HashMap();

    @Override // p000a.C1789hf
    /* renamed from: P */
    public final Object mo2922P(Object obj) {
        Object mo2922P = super.mo2922P(obj);
        this.f4660q.remove(obj);
        return mo2922P;
    }

    @Override // p000a.C1789hf
    /* renamed from: h */
    public final C0513Jg mo2923h(Object obj) {
        return (C0513Jg) this.f4660q.get(obj);
    }

    @Override // p000a.C1789hf
    /* renamed from: v */
    public final Object mo2924v(Object obj, Object obj2) {
        C0513Jg mo2923h = mo2923h(obj);
        if (mo2923h != null) {
            return mo2923h.f1705R;
        }
        HashMap hashMap = this.f4660q;
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
        hashMap.put(obj, c0513Jg);
        return null;
    }
}
