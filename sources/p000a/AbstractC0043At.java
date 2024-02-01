package p000a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: a.At */
/* loaded from: classes.dex */
public abstract class AbstractC0043At {

    /* renamed from: h */
    public static final C0414Hq f187h;

    /* renamed from: z */
    public static final C1331Yy f188z;

    static {
        f188z = Build.VERSION.SDK_INT >= 29 ? new C0991Sb() : new C1331Yy();
        f187h = new C0414Hq(Float.class, "translationAlpha", 6);
        new C0414Hq(Rect.class, "clipBounds", 7);
    }

    /* renamed from: z */
    public static void m90z(View view, int i, int i2, int i3, int i4) {
        f188z.mo584R(view, i, i2, i3, i4);
    }
}
