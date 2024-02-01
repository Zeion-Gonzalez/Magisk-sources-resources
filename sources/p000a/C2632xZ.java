package p000a;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: a.xZ */
/* loaded from: classes.dex */
public class C2632xZ extends C0452Ia {
    public C2632xZ(C2621xJ c2621xJ, WindowInsets windowInsets) {
        super(c2621xJ, windowInsets);
    }

    @Override // p000a.C2194pK
    /* renamed from: N */
    public C0591L2 mo3811N() {
        DisplayCutout displayCutout;
        displayCutout = this.f6251v.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0591L2(displayCutout);
    }

    @Override // p000a.AbstractC2010lo, p000a.C2194pK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2632xZ)) {
            return false;
        }
        C2632xZ c2632xZ = (C2632xZ) obj;
        return Objects.equals(this.f6251v, c2632xZ.f6251v) && Objects.equals(this.f6250u, c2632xZ.f6250u);
    }

    @Override // p000a.C2194pK
    public int hashCode() {
        return this.f6251v.hashCode();
    }

    @Override // p000a.C2194pK
    /* renamed from: z */
    public C2621xJ mo3814z() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f6251v.consumeDisplayCutout();
        return C2621xJ.m4514o(null, consumeDisplayCutout);
    }
}
