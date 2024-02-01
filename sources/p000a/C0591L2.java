package p000a;

import android.view.DisplayCutout;

/* renamed from: a.L2 */
/* loaded from: classes.dex */
public final class C0591L2 {

    /* renamed from: z */
    public final DisplayCutout f1906z;

    public C0591L2(DisplayCutout displayCutout) {
        this.f1906z = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0591L2.class == obj.getClass()) {
            return AbstractC1451bD.m2871z(this.f1906z, ((C0591L2) obj).f1906z);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f1906z;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1906z + "}";
    }
}
