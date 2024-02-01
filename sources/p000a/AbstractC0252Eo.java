package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* renamed from: a.Eo */
/* loaded from: classes.dex */
public abstract class AbstractC0252Eo {
    /* renamed from: h */
    public static PointerIcon m549h(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    /* renamed from: v */
    public static PointerIcon m550v(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }

    /* renamed from: z */
    public static PointerIcon m551z(Bitmap bitmap, float f, float f2) {
        return PointerIcon.create(bitmap, f, f2);
    }
}
