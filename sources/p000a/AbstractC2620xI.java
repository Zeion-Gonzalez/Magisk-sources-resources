package p000a;

import java.util.Locale;

/* renamed from: a.xI */
/* loaded from: classes.dex */
public abstract class AbstractC2620xI {

    /* renamed from: z */
    public static final Locale[] f8105z = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* renamed from: h */
    public static boolean m4511h(Locale locale, Locale locale2) {
        boolean z;
        boolean z2;
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f8105z;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (localeArr[i].equals(locale)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            int length2 = localeArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    if (localeArr[i2].equals(locale2)) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                String m1143z = AbstractC0473Iw.m1143z(locale);
                if (m1143z.isEmpty()) {
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
                return m1143z.equals(AbstractC0473Iw.m1143z(locale2));
            }
        }
        return false;
    }

    /* renamed from: z */
    public static Locale m4512z(String str) {
        return Locale.forLanguageTag(str);
    }
}
