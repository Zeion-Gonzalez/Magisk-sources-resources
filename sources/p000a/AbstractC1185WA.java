package p000a;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: a.WA */
/* loaded from: classes.dex */
public abstract class AbstractC1185WA {
    /* renamed from: P */
    public static void m2445P(Configuration configuration, C1523ck c1523ck) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(c1523ck.f4703z.mo160h());
        configuration.setLocales(forLanguageTags);
    }

    /* renamed from: h */
    public static C1523ck m2446h(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return C1523ck.m2947h(languageTags);
    }

    /* renamed from: v */
    public static void m2447v(C1523ck c1523ck) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(c1523ck.f4703z.mo160h());
        LocaleList.setDefault(forLanguageTags);
    }

    /* renamed from: z */
    public static void m2448z(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (equals) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }
}
