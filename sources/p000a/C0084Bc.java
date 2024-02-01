package p000a;

import java.io.Serializable;

/* renamed from: a.Bc */
/* loaded from: classes.dex */
public final class C0084Bc implements Serializable {

    /* renamed from: R */
    public final Object f328R;

    /* renamed from: S */
    public final Object f329S;

    public C0084Bc(Object obj, Object obj2) {
        this.f329S = obj;
        this.f328R = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0084Bc)) {
            return false;
        }
        C0084Bc c0084Bc = (C0084Bc) obj;
        return AbstractC1292YB.m2695u(this.f329S, c0084Bc.f329S) && AbstractC1292YB.m2695u(this.f328R, c0084Bc.f328R);
    }

    public final int hashCode() {
        Object obj = this.f329S;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f328R;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f329S + ", " + this.f328R + ')';
    }
}
