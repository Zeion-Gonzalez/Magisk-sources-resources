package p000a;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* renamed from: a.JD */
/* loaded from: classes.dex */
public abstract class AbstractC0488JD {
    /* renamed from: h */
    public static Icon m1182h(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    /* renamed from: z */
    public static Drawable m1183z(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }
}
