package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: a.VO */
/* loaded from: classes.dex */
public abstract class AbstractC1144VO {
    /* renamed from: P */
    public static void m2343P(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }

    /* renamed from: h */
    public static PorterDuff.Mode m2344h(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* renamed from: v */
    public static void m2345v(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* renamed from: z */
    public static ColorStateList m2346z(ImageView imageView) {
        return imageView.getImageTintList();
    }
}
