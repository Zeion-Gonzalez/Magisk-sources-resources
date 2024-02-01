package p000a;

import android.util.Property;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;

/* renamed from: a.cp */
/* loaded from: classes.dex */
public final class C1527cp extends Property {

    /* renamed from: z */
    public static final C1527cp f4719z = new C1527cp();

    public C1527cp() {
        super(C2716zG.class, "circularReveal");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return ((CircularRevealCardView) ((InterfaceC1944kb) obj)).m5050v();
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((CircularRevealCardView) ((InterfaceC1944kb) obj)).m5049P((C2716zG) obj2);
    }
}
