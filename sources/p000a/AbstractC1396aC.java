package p000a;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: a.aC */
/* loaded from: classes.dex */
public abstract class AbstractC1396aC {

    /* renamed from: z */
    public static final Locale f4399z;

    static {
        Locale locale;
        new HashMap();
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            for (int i = 0; i != availableLocales.length; i++) {
                if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    locale = availableLocales[i];
                    break;
                }
            }
        }
        locale = Locale.getDefault();
        f4399z = locale;
    }
}
