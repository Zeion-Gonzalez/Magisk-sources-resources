package p000a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* renamed from: a.h3 */
/* loaded from: classes.dex */
public final class C1760h3 extends AbstractC0209E implements InterfaceC1121V {

    /* renamed from: S */
    public final AbstractC1593e f5555S;

    public C1760h3(Date date) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", AbstractC1396aC.f4399z);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int parseInt = Integer.parseInt(str.substring(0, 4));
        this.f5555S = (parseInt < 1950 || parseInt > 2049) ? new C0862Q6(str) : new C0039An(str.substring(2));
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        return this.f5555S;
    }
}
