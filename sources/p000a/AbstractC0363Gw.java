package p000a;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: a.Gw */
/* loaded from: classes.dex */
public abstract class AbstractC0363Gw {
    /* renamed from: h */
    public static void m785h(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    /* renamed from: z */
    public static LocaleList m786z(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
