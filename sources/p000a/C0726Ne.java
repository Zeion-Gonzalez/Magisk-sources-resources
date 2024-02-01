package p000a;

import android.os.Handler;
import android.os.Message;

/* renamed from: a.Ne */
/* loaded from: classes.dex */
public final class C0726Ne implements Handler.Callback {

    /* renamed from: z */
    public final /* synthetic */ C2671yR f2453z;

    public C0726Ne(C2671yR c2671yR) {
        this.f2453z = c2671yR;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C2671yR c2671yR = this.f2453z;
        C1848im c1848im = (C1848im) message.obj;
        synchronized (c2671yR.f8322z) {
            if (c2671yR.f8321v == c1848im || c2671yR.f8319P == c1848im) {
                c2671yR.m4580z(c1848im, 2);
            }
        }
        return true;
    }
}
