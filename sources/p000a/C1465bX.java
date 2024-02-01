package p000a;

import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/* renamed from: a.bX */
/* loaded from: classes.dex */
public final class C1465bX {

    /* renamed from: z */
    public final Hashtable f4560z;

    public C1465bX() {
        this.f4560z = new Hashtable();
    }

    /* renamed from: z */
    public final C1465bX m2877z(Map map) {
        C1281Y m2621U;
        Hashtable hashtable = this.f4560z;
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        C1281Y c1281y = InterfaceC0443IP.f1481z;
        if (!hashtable2.containsKey(c1281y) && (m2621U = C1281Y.m2621U(map.get("contentType"))) != null) {
            hashtable2.put(c1281y, new C0545KG(c1281y, new C2420ta(m2621U)));
        }
        C1281Y c1281y2 = InterfaceC0443IP.f1480v;
        if (!hashtable2.containsKey(c1281y2)) {
            hashtable2.put(c1281y2, new C0545KG(c1281y2, new C2420ta(new C1760h3(new Date()))));
        }
        C1281Y c1281y3 = InterfaceC0443IP.f1479h;
        if (!hashtable2.containsKey(c1281y3)) {
            hashtable2.put(c1281y3, new C0545KG(c1281y3, new C2420ta(new C1745gp((byte[]) map.get("digest")))));
        }
        C1281Y c1281y4 = InterfaceC0443IP.f1478P;
        if (!hashtable2.contains(c1281y4)) {
            hashtable2.put(c1281y4, new C0545KG(c1281y4, new C2420ta(new C0144Cm((C2074n2) map.get("digestAlgID"), (C2074n2) map.get("signatureAlgID")))));
        }
        return new C1465bX(hashtable2);
    }

    public C1465bX(Hashtable hashtable) {
        this.f4560z = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        this.f4560z = hashtable2;
    }
}
