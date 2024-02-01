package p000a;

import android.content.res.Resources;

/* renamed from: a.lm */
/* loaded from: classes.dex */
public final class C2008lm {

    /* renamed from: h */
    public final Resources.Theme f6234h;

    /* renamed from: z */
    public final Resources f6235z;

    public C2008lm(Resources resources, Resources.Theme theme) {
        this.f6235z = resources;
        this.f6234h = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2008lm.class != obj.getClass()) {
            return false;
        }
        C2008lm c2008lm = (C2008lm) obj;
        if (this.f6235z.equals(c2008lm.f6235z) && AbstractC1451bD.m2871z(this.f6234h, c2008lm.f6234h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1451bD.m2870h(this.f6235z, this.f6234h);
    }
}
