package p000a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: a.yR */
/* loaded from: classes.dex */
public final class C2671yR {

    /* renamed from: N */
    public static C2671yR f8318N;

    /* renamed from: P */
    public C1848im f8319P;

    /* renamed from: v */
    public C1848im f8321v;

    /* renamed from: z */
    public final Object f8322z = new Object();

    /* renamed from: h */
    public final Handler f8320h = new Handler(Looper.getMainLooper(), new C0726Ne(this));

    /* renamed from: h */
    public static C2671yR m4574h() {
        if (f8318N == null) {
            f8318N = new C2671yR();
        }
        return f8318N;
    }

    /* renamed from: N */
    public final void m4575N(C0506JZ c0506jz) {
        synchronized (this.f8322z) {
            if (m4579v(c0506jz)) {
                C1848im c1848im = this.f8321v;
                if (c1848im.f5771v) {
                    c1848im.f5771v = false;
                    m4577Q(c1848im);
                }
            }
        }
    }

    /* renamed from: P */
    public final void m4576P(C0506JZ c0506jz) {
        synchronized (this.f8322z) {
            if (m4579v(c0506jz)) {
                C1848im c1848im = this.f8321v;
                if (!c1848im.f5771v) {
                    c1848im.f5771v = true;
                    this.f8320h.removeCallbacksAndMessages(c1848im);
                }
            }
        }
    }

    /* renamed from: Q */
    public final void m4577Q(C1848im c1848im) {
        int i = c1848im.f5770h;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.f8320h;
        handler.removeCallbacksAndMessages(c1848im);
        handler.sendMessageDelayed(Message.obtain(handler, 0, c1848im), i);
    }

    /* renamed from: u */
    public final void m4578u() {
        C1848im c1848im = this.f8319P;
        if (c1848im != null) {
            this.f8321v = c1848im;
            this.f8319P = null;
            C0506JZ c0506jz = (C0506JZ) c1848im.f5772z.get();
            if (c0506jz != null) {
                Handler handler = AbstractC2691yn.f8388Y;
                handler.sendMessage(handler.obtainMessage(0, c0506jz.f1686z));
            } else {
                this.f8321v = null;
            }
        }
    }

    /* renamed from: v */
    public final boolean m4579v(C0506JZ c0506jz) {
        boolean z;
        C1848im c1848im = this.f8321v;
        if (c1848im == null) {
            return false;
        }
        if (c0506jz != null && c1848im.f5772z.get() == c0506jz) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m4580z(C1848im c1848im, int i) {
        C0506JZ c0506jz = (C0506JZ) c1848im.f5772z.get();
        if (c0506jz == null) {
            return false;
        }
        this.f8320h.removeCallbacksAndMessages(c1848im);
        Handler handler = AbstractC2691yn.f8388Y;
        handler.sendMessage(handler.obtainMessage(1, i, 0, c0506jz.f1686z));
        return true;
    }
}
