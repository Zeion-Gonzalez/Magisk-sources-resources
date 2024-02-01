package p000a;

import android.util.Property;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;

/* renamed from: a.sj */
/* loaded from: classes.dex */
public final class C2378sj extends Property {

    /* renamed from: z */
    public static final C2378sj f7308z = new C2378sj();

    public C2378sj() {
        super(Integer.class, "circularRevealScrimColor");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((CircularRevealCardView) ((InterfaceC1944kb) obj)).f9334f.f3278v.getColor());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        C0964S5 c0964s5 = ((CircularRevealCardView) ((InterfaceC1944kb) obj)).f9334f;
        c0964s5.f3278v.setColor(intValue);
        c0964s5.f3277h.invalidate();
    }
}
