package p000a;

import java.util.Iterator;
import java.util.List;

/* renamed from: a.Z8 */
/* loaded from: classes.dex */
public abstract class AbstractC1342Z8 {

    /* renamed from: z */
    public static final AbstractC1577de f4236z;

    static {
        String str;
        Object next;
        int i = AbstractC2655y4.f8274z;
        AbstractC1577de abstractC1577de = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List m3879nB = AbstractC2239qC.m3879nB(AbstractC0873QM.m2011G5(AbstractC2441tz.m4198g()));
        Iterator it = m3879nB.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int mo2052z = ((InterfaceC1072U6) next).mo2052z();
                do {
                    Object next2 = it.next();
                    int mo2052z2 = ((InterfaceC1072U6) next2).mo2052z();
                    if (mo2052z < mo2052z2) {
                        next = next2;
                        mo2052z = mo2052z2;
                    }
                } while (it.hasNext());
            }
        }
        InterfaceC1072U6 interfaceC1072U6 = (InterfaceC1072U6) next;
        if (interfaceC1072U6 != null) {
            try {
                abstractC1577de = interfaceC1072U6.mo2051v(m3879nB);
            } catch (Throwable unused2) {
                interfaceC1072U6.mo2050h();
            }
            if (abstractC1577de != null) {
                f4236z = abstractC1577de;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
