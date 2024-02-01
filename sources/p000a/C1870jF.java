package p000a;

/* renamed from: a.jF */
/* loaded from: classes.dex */
public final class C1870jF extends AbstractC2392t {

    /* renamed from: h */
    public final AbstractC0883Qb f5841h;

    /* renamed from: z */
    public final /* synthetic */ int f5842z;

    public C1870jF(int i) {
        this.f5842z = i;
        if (i != 1) {
            if (i != 2) {
                this.f5841h = new C1543d4();
                return;
            } else {
                this.f5841h = new C0802Oy();
                return;
            }
        }
        this.f5841h = new C2634xc();
    }

    /* renamed from: o */
    public static boolean m3489o(InterfaceC1036TR interfaceC1036TR, int i) {
        CharSequence charSequence = ((C1858j0) interfaceC1036TR).f5811z;
        if (((C1858j0) interfaceC1036TR).f5808u < 4 && i < charSequence.length() && charSequence.charAt(i) == '>') {
            return true;
        }
        return false;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: N */
    public final boolean mo3490N() {
        switch (this.f5842z) {
            case AbstractC0795Op.f2698E /* 0 */:
            case 1:
                return true;
            default:
                return this instanceof C2614xC;
        }
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: P */
    public final AbstractC0883Qb mo39P() {
        int i = this.f5842z;
        AbstractC0883Qb abstractC0883Qb = this.f5841h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (C1543d4) abstractC0883Qb;
            case 1:
                return (C2634xc) abstractC0883Qb;
            default:
                return (C0802Oy) abstractC0883Qb;
        }
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: h */
    public final boolean mo3491h(AbstractC0883Qb abstractC0883Qb) {
        switch (this.f5842z) {
            case AbstractC0795Op.f2698E /* 0 */:
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: u */
    public final C1253XQ mo41u(InterfaceC1036TR interfaceC1036TR) {
        char charAt;
        switch (this.f5842z) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i = ((C1858j0) interfaceC1036TR).f5799N;
                if (!m3489o(interfaceC1036TR, i)) {
                    return null;
                }
                C1858j0 c1858j0 = (C1858j0) interfaceC1036TR;
                boolean z = true;
                int i2 = c1858j0.f5809v + c1858j0.f5808u + 1;
                CharSequence charSequence = c1858j0.f5811z;
                int i3 = i + 1;
                if (i3 >= charSequence.length() || ((charAt = charSequence.charAt(i3)) != '\t' && charAt != ' ')) {
                    z = false;
                }
                if (z) {
                    i2++;
                }
                return new C1253XQ(-1, i2, false);
            case 1:
                return C1253XQ.m2558z(((C1858j0) interfaceC1036TR).f5806h);
            default:
                return null;
        }
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: z */
    public final void mo43z(CharSequence charSequence) {
    }
}
