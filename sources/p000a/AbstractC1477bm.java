package p000a;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: a.bm */
/* loaded from: classes.dex */
public abstract class AbstractC1477bm {
    /* renamed from: z */
    public static void m2886z(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (!AbstractC1451bD.m2871z(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
