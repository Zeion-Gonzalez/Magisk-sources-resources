package p000a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: a.bd */
/* loaded from: classes.dex */
public abstract class AbstractC1470bd {
    /* renamed from: h */
    public static Drawable m2878h(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: v */
    public static File m2879v(Context context) {
        return context.getNoBackupFilesDir();
    }

    /* renamed from: z */
    public static File m2880z(Context context) {
        return context.getCodeCacheDir();
    }
}
