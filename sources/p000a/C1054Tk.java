package p000a;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: a.Tk */
/* loaded from: classes.dex */
public final class C1054Tk implements InterfaceC1722gQ {

    /* renamed from: z */
    public final float f3478z;

    public C1054Tk(float f) {
        this.f3478z = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1054Tk) && this.f3478z == ((C1054Tk) obj).f3478z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3478z)});
    }

    @Override // p000a.InterfaceC1722gQ
    /* renamed from: z */
    public final float mo2191z(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f3478z;
    }
}
