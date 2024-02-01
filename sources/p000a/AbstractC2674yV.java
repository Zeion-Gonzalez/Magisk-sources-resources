package p000a;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a.yV */
/* loaded from: classes.dex */
public abstract class AbstractC2674yV {

    /* renamed from: z */
    public static final AtomicReference f8346z = new AtomicReference();

    /* renamed from: P */
    public static Calendar m4585P(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* renamed from: h */
    public static Calendar m4586h(Calendar calendar) {
        Calendar m4585P = m4585P(calendar);
        Calendar m4585P2 = m4585P(null);
        m4585P2.set(m4585P.get(1), m4585P.get(2), m4585P.get(5));
        return m4585P2;
    }

    /* renamed from: v */
    public static Calendar m4587v() {
        AbstractC2190pG abstractC2190pG = (AbstractC2190pG) f8346z.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: z */
    public static DateFormat m4588z(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        android.icu.util.TimeZone timeZone;
        DisplayContext displayContext;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        timeZone = android.icu.util.TimeZone.getTimeZone("UTC");
        instanceForSkeleton.setTimeZone(timeZone);
        displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
        instanceForSkeleton.setContext(displayContext);
        return instanceForSkeleton;
    }
}
