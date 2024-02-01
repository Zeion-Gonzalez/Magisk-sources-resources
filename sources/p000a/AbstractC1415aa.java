package p000a;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: a.aa */
/* loaded from: classes.dex */
public abstract class AbstractC1415aa {
    /* renamed from: h */
    public static void m2842h(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    /* renamed from: z */
    public static LocaleList m2843z(String str) {
        return LocaleList.forLanguageTags(str);
    }
}
