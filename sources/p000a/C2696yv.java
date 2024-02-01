package p000a;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Vector;

/* renamed from: a.yv */
/* loaded from: classes.dex */
public final class C2696yv {

    /* renamed from: N */
    public final C1174Vy f8501N;

    /* renamed from: P */
    public final InterfaceC1056Tn f8502P;

    /* renamed from: Q */
    public final C2074n2 f8503Q;

    /* renamed from: h */
    public final C1465bX f8504h;

    /* renamed from: o */
    public byte[] f8505o;

    /* renamed from: u */
    public final InterfaceC1828iQ f8506u;

    /* renamed from: v */
    public final C1465bX f8507v;

    /* renamed from: z */
    public final C1130V9 f8508z;

    public C2696yv(C1130V9 c1130v9, C0525Ju c0525Ju, C1174Vy c1174Vy, InterfaceC1828iQ interfaceC1828iQ, C1465bX c1465bX, C1465bX c1465bX2) {
        this.f8505o = null;
        this.f8508z = c1130v9;
        this.f8502P = c0525Ju;
        this.f8503Q = (C2074n2) c1174Vy.f3828R;
        this.f8501N = c1174Vy;
        this.f8504h = c1465bX;
        this.f8507v = c1465bX2;
        this.f8506u = interfaceC1828iQ;
    }

    /* renamed from: h */
    public static HashMap m4615h(C1281Y c1281y, C2074n2 c2074n2, C2074n2 c2074n22, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (c1281y != null) {
            hashMap.put("contentType", c1281y);
        }
        hashMap.put("digestAlgID", c2074n2);
        hashMap.put("signatureAlgID", c2074n22);
        hashMap.put("digest", AbstractC0438II.m1049w(bArr));
        return hashMap;
    }

    /* renamed from: z */
    public static C2420ta m4616z(C1465bX c1465bX) {
        C0545KG c0545kg;
        C2551w c2551w = new C2551w();
        Enumeration elements = c1465bX.f4560z.elements();
        while (elements.hasMoreElements()) {
            Object nextElement = elements.nextElement();
            C0545KG c0545kg2 = null;
            if (nextElement instanceof Vector) {
                Enumeration elements2 = ((Vector) nextElement).elements();
                while (elements2.hasMoreElements()) {
                    Object nextElement2 = elements2.nextElement();
                    if (nextElement2 instanceof C0545KG) {
                        c0545kg = (C0545KG) nextElement2;
                    } else if (nextElement2 != null) {
                        c0545kg = new C0545KG(AbstractC1333Z.m2714U(nextElement2));
                    } else {
                        c0545kg = null;
                    }
                    c2551w.m4371z(c0545kg);
                }
            } else {
                if (nextElement instanceof C0545KG) {
                    c0545kg2 = (C0545KG) nextElement;
                } else if (nextElement != null) {
                    c0545kg2 = new C0545KG(AbstractC1333Z.m2714U(nextElement));
                }
                c2551w.m4371z(c0545kg2);
            }
        }
        return new C2420ta(c2551w);
    }

    public C2696yv(C1130V9 c1130v9, C0525Ju c0525Ju, C2074n2 c2074n2, InterfaceC1828iQ interfaceC1828iQ) {
        this.f8505o = null;
        this.f8508z = c1130v9;
        this.f8502P = c0525Ju;
        this.f8503Q = c2074n2;
        this.f8501N = null;
        this.f8504h = null;
        this.f8507v = null;
        this.f8506u = interfaceC1828iQ;
    }
}
