package p000a;

/* renamed from: a.w */
/* loaded from: classes.dex */
public final class C2551w {

    /* renamed from: P */
    public static final InterfaceC0959S[] f7795P = new InterfaceC0959S[0];

    /* renamed from: h */
    public int f7796h;

    /* renamed from: v */
    public boolean f7797v;

    /* renamed from: z */
    public InterfaceC0959S[] f7798z;

    public C2551w() {
        this(10);
    }

    /* renamed from: h */
    public static InterfaceC0959S[] m4368h(InterfaceC0959S[] interfaceC0959SArr) {
        return interfaceC0959SArr.length < 1 ? f7795P : (InterfaceC0959S[]) interfaceC0959SArr.clone();
    }

    /* renamed from: P */
    public final InterfaceC0959S[] m4369P() {
        int i = this.f7796h;
        if (i == 0) {
            return f7795P;
        }
        InterfaceC0959S[] interfaceC0959SArr = this.f7798z;
        if (interfaceC0959SArr.length == i) {
            this.f7797v = true;
            return interfaceC0959SArr;
        }
        InterfaceC0959S[] interfaceC0959SArr2 = new InterfaceC0959S[i];
        System.arraycopy(interfaceC0959SArr, 0, interfaceC0959SArr2, 0, i);
        return interfaceC0959SArr2;
    }

    /* renamed from: v */
    public final InterfaceC0959S m4370v(int i) {
        if (i < this.f7796h) {
            return this.f7798z[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.f7796h);
    }

    /* renamed from: z */
    public final void m4371z(InterfaceC0959S interfaceC0959S) {
        if (interfaceC0959S != null) {
            InterfaceC0959S[] interfaceC0959SArr = this.f7798z;
            int length = interfaceC0959SArr.length;
            boolean z = true;
            int i = this.f7796h + 1;
            if (i <= length) {
                z = false;
            }
            if (this.f7797v | z) {
                InterfaceC0959S[] interfaceC0959SArr2 = new InterfaceC0959S[Math.max(interfaceC0959SArr.length, (i >> 1) + i)];
                System.arraycopy(this.f7798z, 0, interfaceC0959SArr2, 0, this.f7796h);
                this.f7798z = interfaceC0959SArr2;
                this.f7797v = false;
            }
            this.f7798z[this.f7796h] = interfaceC0959S;
            this.f7796h = i;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    public C2551w(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f7798z = i == 0 ? f7795P : new InterfaceC0959S[i];
        this.f7796h = 0;
        this.f7797v = false;
    }
}
