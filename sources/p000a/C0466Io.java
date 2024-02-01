package p000a;

import android.os.Bundle;

/* renamed from: a.Io */
/* loaded from: classes.dex */
public final class C0466Io implements InterfaceC2438tw {

    /* renamed from: h */
    public final Bundle f1559h = new Bundle();

    /* renamed from: z */
    public final int f1560z;

    public C0466Io(int i) {
        this.f1560z = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && AbstractC1292YB.m2695u(C0466Io.class, obj.getClass()) && this.f1560z == ((C0466Io) obj).f1560z;
    }

    @Override // p000a.InterfaceC2438tw
    /* renamed from: h */
    public final Bundle mo1128h() {
        return this.f1559h;
    }

    public final int hashCode() {
        return 31 + this.f1560z;
    }

    public final String toString() {
        return "ActionOnlyNavDirections(actionId=" + this.f1560z + ')';
    }

    @Override // p000a.InterfaceC2438tw
    /* renamed from: z */
    public final int mo1129z() {
        return this.f1560z;
    }
}
