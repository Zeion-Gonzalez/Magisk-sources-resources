package p000a;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: a.qX */
/* loaded from: classes.dex */
public final class C2259qX implements InterfaceC0733Nm {

    /* renamed from: I */
    public static final C0003A3 f6948I;

    /* renamed from: R */
    public final C2658y7 f6949R;

    /* renamed from: S */
    public final C0234ES f6950S;

    /* renamed from: w */
    public final boolean f6951w;

    static {
        Pattern pattern = C0003A3.f64P;
        f6948I = C1710g8.m3223I("application/dns-message");
    }

    public C2259qX(C0234ES c0234es, C2658y7 c2658y7, boolean z) {
        this.f6950S = c0234es;
        this.f6949R = c2658y7;
        this.f6951w = z;
    }

    /* renamed from: v */
    public static ArrayList m3899v(String str, C1429ap c1429ap) {
        if (c1429ap.f4475s == null && c1429ap.f4466R != EnumC1854ix.f5783q) {
            C0799Ov c0799Ov = C0799Ov.f2726z;
            C0799Ov.m1880G(C0799Ov.f2726z, "Incorrect protocol: " + c1429ap.f4466R, 5, 4);
        }
        try {
            if (c1429ap.m2858h()) {
                AbstractC1449bB abstractC1449bB = c1429ap.f4471g;
                if (abstractC1449bB.mo1579z() <= 65536) {
                    ArrayList m4064z = AbstractC2354sI.m4064z(str, abstractC1449bB.mo1577G().mo1631q());
                    AbstractC1292YB.m2659R(c1429ap, null);
                    return m4064z;
                }
                throw new IOException("response size exceeds limit (65536 bytes): " + abstractC1449bB.mo1579z() + " bytes");
            }
            throw new IOException("response: " + c1429ap.f4465I + ' ' + c1429ap.f4476w);
        } finally {
        }
    }

    @Override // p000a.InterfaceC0733Nm
    /* renamed from: h */
    public final List mo1688h(String str) {
        boolean z;
        boolean z2 = this.f6951w;
        if (!z2) {
            if (PublicSuffixDatabase.f9632u.m5144z(str) == null) {
                z = true;
            } else {
                z = false;
            }
            if (z && !z2) {
                throw new UnknownHostException("private hosts not resolved");
            }
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList(5);
        m3900z(str, arrayList, arrayList3, arrayList2, 1);
        m3900z(str, arrayList, arrayList3, arrayList2, 28);
        CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0523Jr) ((InterfaceC2381sm) it.next())).m1213N(new C2707z7(arrayList2, countDownLatch, this, str, arrayList3));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            arrayList2.add(e);
        }
        if ((!arrayList3.isEmpty()) != false) {
            return arrayList3;
        }
        if (!arrayList2.isEmpty()) {
            Exception exc = (Exception) arrayList2.get(0);
            if (!(exc instanceof UnknownHostException)) {
                UnknownHostException unknownHostException = new UnknownHostException(str);
                unknownHostException.initCause(exc);
                int size = arrayList2.size();
                for (int i = 1; i < size; i++) {
                    AbstractC1292YB.m2655N(unknownHostException, (Throwable) arrayList2.get(i));
                }
                throw unknownHostException;
            }
            throw exc;
        }
        throw new UnknownHostException(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x019a, code lost:
    
        if (r4.f4465I != 504) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Map] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3900z(java.lang.String r34, java.util.ArrayList r35, java.util.ArrayList r36, java.util.ArrayList r37, int r38) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2259qX.m3900z(java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }
}
