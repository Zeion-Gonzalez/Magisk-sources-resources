package p000a;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* renamed from: a.fo */
/* loaded from: classes.dex */
public final class C1692fo extends ThreadLocal {

    /* renamed from: z */
    public final /* synthetic */ int f5305z;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f5305z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC1181W6.f3854N);
                return simpleDateFormat;
        }
    }
}
