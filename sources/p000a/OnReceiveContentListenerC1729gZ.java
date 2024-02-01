package p000a;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* renamed from: a.gZ */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC1729gZ implements OnReceiveContentListener {

    /* renamed from: z */
    public final InterfaceC0076BT f5450z;

    public OnReceiveContentListenerC1729gZ(InterfaceC0076BT interfaceC0076BT) {
        this.f5450z = interfaceC0076BT;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0671Mh c0671Mh = new C0671Mh(new C2196pM(contentInfo));
        C0671Mh m4020z = ((C2344s5) this.f5450z).m4020z(view, c0671Mh);
        if (m4020z == null) {
            return null;
        }
        if (m4020z == c0671Mh) {
            return contentInfo;
        }
        return AbstractC0804P.m1905u(m4020z.f2212z.mo1117Q());
    }
}
