package p000a;

/* renamed from: a.iV */
/* loaded from: classes.dex */
public final class C1833iV extends AbstractC0632Lt {

    /* renamed from: N */
    public final /* synthetic */ Object f5731N;

    /* renamed from: P */
    public final /* synthetic */ int f5732P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1833iV(int i, Object obj) {
        super(1);
        this.f5732P = i;
        this.f5731N = obj;
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: G */
    public final int mo1405G(Object obj) {
        int i = this.f5732P;
        Object obj2 = this.f5731N;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((C1186WB) obj2).m4627u(obj);
            default:
                return ((C0894Qq) obj2).indexOf(obj);
        }
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: M */
    public final void mo1406M(Object obj, Object obj2) {
        int i = this.f5732P;
        Object obj3 = this.f5731N;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C1186WB) obj3).put(obj, obj2);
                return;
            default:
                ((C0894Qq) obj3).add(obj);
                return;
        }
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: N */
    public final void mo1407N() {
        int i = this.f5732P;
        Object obj = this.f5731N;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C1186WB) obj).clear();
                return;
            default:
                ((C0894Qq) obj).clear();
                return;
        }
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: Q */
    public final Object mo1409Q(int i, int i2) {
        int i3 = this.f5732P;
        Object obj = this.f5731N;
        switch (i3) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((C1186WB) obj).f8515R[(i << 1) + i2];
            default:
                return ((C0894Qq) obj).f3075R[i];
        }
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: S */
    public final Object mo1410S(int i, Object obj) {
        switch (this.f5732P) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((C1186WB) this.f5731N).f8515R;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: V */
    public final void mo1412V(int i) {
        int i2 = this.f5732P;
        Object obj = this.f5731N;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C1186WB) obj).m4624W(i);
                return;
            default:
                ((C0894Qq) obj).m2044Q(i);
                return;
        }
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: W */
    public final int mo1413W(Object obj) {
        int i = this.f5732P;
        Object obj2 = this.f5731N;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((C1186WB) obj2).m4621N(obj);
            default:
                return ((C0894Qq) obj2).indexOf(obj);
        }
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: o */
    public final int mo1416o() {
        int i = this.f5732P;
        Object obj = this.f5731N;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((C1186WB) obj).f8517w;
            default:
                return ((C0894Qq) obj).f3077w;
        }
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: u */
    public final C1186WB mo1418u() {
        switch (this.f5732P) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (C1186WB) this.f5731N;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
