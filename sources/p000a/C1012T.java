package p000a;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: a.T */
/* loaded from: classes.dex */
public final class C1012T implements InterfaceC1722gQ {

    /* renamed from: z */
    public final float f3390z;

    public C1012T(float f) {
        this.f3390z = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1012T) && this.f3390z == ((C1012T) obj).f3390z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3390z)});
    }

    @Override // p000a.InterfaceC1722gQ
    /* renamed from: z */
    public final float mo2191z(RectF rectF) {
        return this.f3390z;
    }
}
