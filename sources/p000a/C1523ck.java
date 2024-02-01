package p000a;

import android.os.Build;
import java.util.Locale;

/* renamed from: a.ck */
/* loaded from: classes.dex */
public final class C1523ck {

    /* renamed from: h */
    public static final C1523ck f4702h = m2948z(new Locale[0]);

    /* renamed from: z */
    public final InterfaceC1865j8 f4703z;

    public C1523ck(InterfaceC1865j8 interfaceC1865j8) {
        this.f4703z = interfaceC1865j8;
    }

    /* renamed from: h */
    public static C1523ck m2947h(String str) {
        if (str == null || str.isEmpty()) {
            return f4702h;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = AbstractC2620xI.m4512z(split[i]);
        }
        return m2948z(localeArr);
    }

    /* renamed from: z */
    public static C1523ck m2948z(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1523ck(new C0078BV(AbstractC2390sy.m4112z(localeArr)));
        }
        return new C1523ck(new C0339GU(localeArr));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1523ck) {
            if (this.f4703z.equals(((C1523ck) obj).f4703z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4703z.hashCode();
    }

    public final String toString() {
        return this.f4703z.toString();
    }

    /* renamed from: v */
    public final Locale m2949v(int i) {
        return this.f4703z.get(i);
    }
}
