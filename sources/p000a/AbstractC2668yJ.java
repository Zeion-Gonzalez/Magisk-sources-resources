package p000a;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: a.yJ */
/* loaded from: classes.dex */
public abstract class AbstractC2668yJ {
    /* renamed from: h */
    public static ULocale m4570h(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: v */
    public static String m4571v(Object obj) {
        return ((ULocale) obj).getScript();
    }

    /* renamed from: z */
    public static ULocale m4572z(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }
}
