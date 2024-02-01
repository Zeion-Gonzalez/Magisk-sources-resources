package p000a;

import android.os.Build;
import android.util.Log;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.fw */
/* loaded from: classes.dex */
public class C1698fw extends AbstractC0531K0 {

    /* renamed from: v */
    public static final Pattern f5320v = Pattern.compile("(\\$\\d+)+$");

    /* renamed from: h */
    public final List f5321h = AbstractC1292YB.m2661T(AbstractC1530cs.class.getName(), C0480J2.class.getName(), AbstractC0531K0.class.getName(), C1698fw.class.getName());

    @Override // p000a.AbstractC0531K0
    /* renamed from: N */
    public void mo1156N(int i, String str, String str2, Throwable th) {
        int min;
        if (str2.length() < 4000) {
            if (i == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i, str, str2);
                return;
            }
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int m2572Fu = AbstractC1269Xn.m2572Fu(str2, '\n', i2, false, 4);
            if (m2572Fu == -1) {
                m2572Fu = length;
            }
            while (true) {
                min = Math.min(m2572Fu, i2 + 4000);
                String substring = str2.substring(i2, min);
                if (i == 7) {
                    Log.wtf(str, substring);
                } else {
                    Log.println(i, str, substring);
                }
                if (min >= m2572Fu) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }

    @Override // p000a.AbstractC0531K0
    /* renamed from: P */
    public final String mo1245P() {
        String mo1245P = super.mo1245P();
        if (mo1245P == null) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                if ((!this.f5321h.contains(stackTraceElement.getClassName())) != false) {
                    String m2593vk = AbstractC1269Xn.m2593vk(stackTraceElement.getClassName(), '.');
                    Matcher matcher = f5320v.matcher(m2593vk);
                    if (matcher.find()) {
                        m2593vk = matcher.replaceAll("");
                    }
                    if (m2593vk.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        return m2593vk.substring(0, 23);
                    }
                    return m2593vk;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return mo1245P;
    }
}
