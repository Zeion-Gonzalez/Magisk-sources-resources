package p000a;

import android.view.ContentInfo;
import android.view.View;

/* renamed from: a.Y1 */
/* loaded from: classes.dex */
public abstract class AbstractC1283Y1 {
    /* renamed from: h */
    public static C0671Mh m2625h(View view, C0671Mh c0671Mh) {
        ContentInfo m1905u = AbstractC0804P.m1905u(c0671Mh.f2212z.mo1117Q());
        ContentInfo performReceiveContent = view.performReceiveContent(m1905u);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == m1905u) {
            return c0671Mh;
        }
        return new C0671Mh(new C2196pM(performReceiveContent));
    }

    /* renamed from: v */
    public static void m2626v(View view, String[] strArr, InterfaceC0076BT interfaceC0076BT) {
        if (interfaceC0076BT == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC1729gZ(interfaceC0076BT));
        }
    }

    /* renamed from: z */
    public static String[] m2627z(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
