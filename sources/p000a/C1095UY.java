package p000a;

/* renamed from: a.UY */
/* loaded from: classes.dex */
public class C1095UY {

    /* renamed from: h */
    public final Object[] f3580h;

    /* renamed from: v */
    public int f3581v;

    /* renamed from: z */
    public final /* synthetic */ int f3582z;

    public C1095UY(int i, int i2) {
        this.f3582z = i2;
        if (i2 != 1) {
            if (i > 0) {
                this.f3580h = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        if (i > 0) {
            this.f3580h = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: h */
    public boolean mo1756h(Object obj) {
        int i;
        boolean z;
        int i2 = this.f3582z;
        Object[] objArr = this.f3580h;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i3 = this.f3581v;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.f3581v = i3 + 1;
                return true;
            default:
                int i4 = 0;
                while (true) {
                    i = this.f3581v;
                    if (i4 < i) {
                        if (objArr[i4] == obj) {
                            z = true;
                        } else {
                            i4++;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    if (i >= objArr.length) {
                        return false;
                    }
                    objArr[i] = obj;
                    this.f3581v = i + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }

    /* renamed from: z */
    public Object mo1757z() {
        int i = this.f3582z;
        Object[] objArr = this.f3580h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i2 = this.f3581v;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = i2 - 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.f3581v = i3;
                return obj;
            default:
                int i4 = this.f3581v;
                if (i4 <= 0) {
                    return null;
                }
                int i5 = i4 - 1;
                Object obj2 = objArr[i5];
                objArr[i5] = null;
                this.f3581v = i5;
                return obj2;
        }
    }
}
