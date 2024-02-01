package p000a;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.nG */
/* loaded from: classes.dex */
public final class C2085nG {

    /* renamed from: z */
    public final SparseArray f6449z = new SparseArray();

    /* renamed from: h */
    public final SparseArray f6448h = new SparseArray();

    public C2085nG(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C0378HD c0378hd = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c != 2) {
                                if (c != 3) {
                                    if (c == 4) {
                                        m3715z(context, xml);
                                    }
                                } else {
                                    C0337GS c0337gs = new C0337GS(context, xml);
                                    if (c0378hd != null) {
                                        ((ArrayList) c0378hd.f1294v).add(c0337gs);
                                    }
                                }
                            } else {
                                C0378HD c0378hd2 = new C0378HD(context, xml);
                                this.f6449z.put(c0378hd2.f1295z, c0378hd2);
                                c0378hd = c0378hd2;
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0226, code lost:
    
        continue;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3715z(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2085nG.m3715z(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
