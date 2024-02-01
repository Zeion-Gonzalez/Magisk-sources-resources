package p000a;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: a.nJ */
/* loaded from: classes.dex */
public final class C2088nJ extends Property {

    /* renamed from: z */
    public static final C2088nJ f6452z = new C2088nJ();

    public C2088nJ() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
