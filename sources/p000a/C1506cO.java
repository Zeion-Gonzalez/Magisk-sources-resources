package p000a;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: a.cO */
/* loaded from: classes.dex */
public final class C1506cO implements InterfaceC1722gQ {

    /* renamed from: h */
    public final float f4658h;

    /* renamed from: z */
    public final InterfaceC1722gQ f4659z;

    public C1506cO(float f, InterfaceC1722gQ interfaceC1722gQ) {
        while (interfaceC1722gQ instanceof C1506cO) {
            interfaceC1722gQ = ((C1506cO) interfaceC1722gQ).f4659z;
            f += ((C1506cO) interfaceC1722gQ).f4658h;
        }
        this.f4659z = interfaceC1722gQ;
        this.f4658h = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1506cO)) {
            return false;
        }
        C1506cO c1506cO = (C1506cO) obj;
        return this.f4659z.equals(c1506cO.f4659z) && this.f4658h == c1506cO.f4658h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4659z, Float.valueOf(this.f4658h)});
    }

    @Override // p000a.InterfaceC1722gQ
    /* renamed from: z */
    public final float mo2191z(RectF rectF) {
        return Math.max(0.0f, this.f4659z.mo2191z(rectF) + this.f4658h);
    }
}
