package p000a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* renamed from: a.lk */
/* loaded from: classes.dex */
public final class C2006lk extends AbstractC0209E implements InterfaceC1121V {

    /* renamed from: S */
    public final AbstractC1593e f6231S;

    public C2006lk(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C0588L) && !(abstractC1593e instanceof C1702g)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.f6231S = abstractC1593e;
    }

    /* renamed from: V */
    public static C2006lk m3636V(InterfaceC0959S interfaceC0959S) {
        if (interfaceC0959S == null || (interfaceC0959S instanceof C2006lk)) {
            return (C2006lk) interfaceC0959S;
        }
        if (interfaceC0959S instanceof C0588L) {
            return new C2006lk((C0588L) interfaceC0959S);
        }
        if (interfaceC0959S instanceof C1702g) {
            return new C2006lk((C1702g) interfaceC0959S);
        }
        throw new IllegalArgumentException("unknown object in factory: ".concat(interfaceC0959S.getClass().getName()));
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        return this.f6231S;
    }

    public final String toString() {
        String str;
        AbstractC1593e abstractC1593e = this.f6231S;
        if (abstractC1593e instanceof C0588L) {
            String m1316y = ((C0588L) abstractC1593e).m1316y();
            if (m1316y.charAt(0) < '5') {
                str = "20";
            } else {
                str = "19";
            }
            return str.concat(m1316y);
        }
        return ((C1702g) abstractC1593e).m3203E();
    }

    public C2006lk(Date date, Locale locale) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int parseInt = Integer.parseInt(str.substring(0, 4));
        this.f6231S = (parseInt < 1950 || parseInt > 2049) ? new C0862Q6(str) : new C0039An(str.substring(2));
    }
}
