package p000a;

/* renamed from: a.Bo */
/* loaded from: classes.dex */
public final class C0093Bo {

    /* renamed from: P */
    public int f350P;

    /* renamed from: h */
    public int f351h;

    /* renamed from: v */
    public Object f352v;

    /* renamed from: z */
    public int f353z;

    public C0093Bo(Object obj, int i, int i2, int i3) {
        this.f353z = i;
        this.f351h = i2;
        this.f350P = i3;
        this.f352v = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0093Bo)) {
            return false;
        }
        C0093Bo c0093Bo = (C0093Bo) obj;
        int i = this.f353z;
        if (i != c0093Bo.f353z) {
            return false;
        }
        if (i == 8 && Math.abs(this.f350P - this.f351h) == 1 && this.f350P == c0093Bo.f351h && this.f351h == c0093Bo.f350P) {
            return true;
        }
        if (this.f350P != c0093Bo.f350P || this.f351h != c0093Bo.f351h) {
            return false;
        }
        Object obj2 = this.f352v;
        Object obj3 = c0093Bo.f352v;
        if (obj2 != null) {
            if (!obj2.equals(obj3)) {
                return false;
            }
        } else if (obj3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f353z * 31) + this.f351h) * 31) + this.f350P;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f353z;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f351h);
        sb.append("c:");
        sb.append(this.f350P);
        sb.append(",p:");
        sb.append(this.f352v);
        sb.append("]");
        return sb.toString();
    }
}
