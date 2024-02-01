package p000a;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* renamed from: a.sI */
/* loaded from: classes.dex */
public abstract class AbstractC2354sI {

    /* renamed from: z */
    public static final /* synthetic */ int f7246z = 0;

    static {
        Charset charset = StandardCharsets.US_ASCII;
    }

    /* renamed from: z */
    public static ArrayList m4064z(String str, C1623eY c1623eY) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        C2361sQ c2361sQ = new C2361sQ();
        c1623eY.mo1983V(c2361sQ, c1623eY.mo1980P());
        c2361sQ.mo1619J();
        int mo1619J = c2361sQ.mo1619J() & 65535;
        if ((mo1619J >> 15) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = mo1619J & 15;
            if (i != 2) {
                if (i != 3) {
                    int mo1619J2 = c2361sQ.mo1619J() & 65535;
                    int mo1619J3 = c2361sQ.mo1619J() & 65535;
                    c2361sQ.mo1619J();
                    c2361sQ.mo1619J();
                    for (int i2 = 0; i2 < mo1619J2; i2++) {
                        byte mo1616EC = c2361sQ.mo1616EC();
                        if (mo1616EC < 0) {
                            c2361sQ.mo1632r(1L);
                        } else {
                            while (mo1616EC > 0) {
                                c2361sQ.mo1632r(mo1616EC);
                                mo1616EC = c2361sQ.mo1616EC();
                            }
                        }
                        c2361sQ.mo1619J();
                        c2361sQ.mo1619J();
                    }
                    for (int i3 = 0; i3 < mo1619J3; i3++) {
                        byte mo1616EC2 = c2361sQ.mo1616EC();
                        if (mo1616EC2 < 0) {
                            c2361sQ.mo1632r(1L);
                        } else {
                            while (mo1616EC2 > 0) {
                                c2361sQ.mo1632r(mo1616EC2);
                                mo1616EC2 = c2361sQ.mo1616EC();
                            }
                        }
                        int mo1619J4 = c2361sQ.mo1619J() & 65535;
                        c2361sQ.mo1619J();
                        c2361sQ.mo1620L();
                        int mo1619J5 = c2361sQ.mo1619J() & 65535;
                        if (mo1619J4 != 1 && mo1619J4 != 28) {
                            c2361sQ.mo1632r(mo1619J5);
                        } else {
                            byte[] bArr = new byte[mo1619J5];
                            c2361sQ.m4080ZH(bArr, 0, mo1619J5);
                            arrayList.add(InetAddress.getByAddress(bArr));
                        }
                    }
                    return arrayList;
                }
                throw new UnknownHostException(str.concat(": NXDOMAIN"));
            }
            throw new UnknownHostException(str.concat(": SERVFAIL"));
        }
        throw new IllegalArgumentException("not a response".toString());
    }
}
