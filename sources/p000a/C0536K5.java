package p000a;

import android.net.Uri;

/* renamed from: a.K5 */
/* loaded from: classes.dex */
public final class C0536K5 {

    /* renamed from: h */
    public final Uri f1783h;

    /* renamed from: z */
    public final String f1784z;

    public C0536K5(Uri uri, String str) {
        this.f1784z = str;
        this.f1783h = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0536K5)) {
            return false;
        }
        C0536K5 c0536k5 = (C0536K5) obj;
        return AbstractC1292YB.m2695u(this.f1784z, c0536k5.f1784z) && AbstractC1292YB.m2695u(this.f1783h, c0536k5.f1783h);
    }

    public final int hashCode() {
        int hashCode = this.f1784z.hashCode() * 31;
        Uri uri = this.f1783h;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "FlashFragmentArgs(action=" + this.f1784z + ", additionalData=" + this.f1783h + ")";
    }
}
