package p000a;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;

/* renamed from: a.fh */
/* loaded from: classes.dex */
public abstract class AbstractC1685fh {

    /* renamed from: v */
    public static C0084Bc f5273v;

    /* renamed from: z */
    public static Locale f5274z = Locale.getDefault();

    /* renamed from: h */
    public static final Locale f5272h = Locale.getDefault();

    /* renamed from: z */
    public static final void m3178z() {
        boolean z;
        Locale forLanguageTag;
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        String m2853O4 = C1212We.f3951U.m2853O4(c1212We, C1212We.f3959h[17]);
        if (m2853O4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            forLanguageTag = f5272h;
        } else {
            forLanguageTag = Locale.forLanguageTag(m2853O4);
        }
        f5274z = forLanguageTag;
        Locale.setDefault(forLanguageTag);
        Resources resources = AbstractC1743gn.m3275z().getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(f5274z);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        C1852is c1852is = C1852is.f5778z;
        Activity activity = (Activity) C1852is.f5777h.get();
        if (activity != null) {
            activity.recreate();
        }
    }
}
