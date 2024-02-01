package p000a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: a.GU */
/* loaded from: classes.dex */
public final class C0339GU implements InterfaceC1865j8 {

    /* renamed from: v */
    public static final Locale[] f1146v = new Locale[0];

    /* renamed from: h */
    public final String f1147h;

    /* renamed from: z */
    public final Locale[] f1148z;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length == 1) {
                new Locale(split[0]);
                return;
            }
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public C0339GU(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f1148z = f1146v;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < localeArr.length; i++) {
                Locale locale = localeArr[i];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        sb2.append(locale2.getLanguage());
                        String country = locale2.getCountry();
                        if (country != null && !country.isEmpty()) {
                            sb2.append('-');
                            sb2.append(locale2.getCountry());
                        }
                        if (i < localeArr.length - 1) {
                            sb2.append(',');
                        }
                        hashSet.add(locale2);
                    }
                } else {
                    throw new NullPointerException(AbstractC2441tz.m4190Q("list[", i, "] is null"));
                }
            }
            this.f1148z = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f1147h = sb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0339GU)) {
            return false;
        }
        Locale[] localeArr = ((C0339GU) obj).f1148z;
        Locale[] localeArr2 = this.f1148z;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p000a.InterfaceC1865j8
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f1148z;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    @Override // p000a.InterfaceC1865j8
    /* renamed from: h */
    public final String mo160h() {
        return this.f1147h;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale locale : this.f1148z) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // p000a.InterfaceC1865j8
    public final boolean isEmpty() {
        return this.f1148z.length == 0;
    }

    @Override // p000a.InterfaceC1865j8
    public final int size() {
        return this.f1148z.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f1148z;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }

    @Override // p000a.InterfaceC1865j8
    /* renamed from: z */
    public final Object mo161z() {
        return null;
    }
}
