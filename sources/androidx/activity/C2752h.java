package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p000a.AbstractC0356Gp;
import p000a.AbstractC0795Op;
import p000a.AbstractC2499v4;
import p000a.C0132CZ;
import p000a.C0326GG;
import p000a.C0364Gx;
import p000a.C0395HU;
import p000a.C1200WR;
import p000a.C1385Zw;
import p000a.C2053mh;
import p000a.C2418tY;
import p000a.C2541vq;
import p000a.EnumC1632eh;
import p000a.InterfaceC1546d7;

/* renamed from: androidx.activity.h */
/* loaded from: classes.dex */
public final class C2752h {

    /* renamed from: N */
    public OnBackInvokedDispatcher f8634N;

    /* renamed from: P */
    public final OnBackInvokedCallback f8635P;

    /* renamed from: Q */
    public boolean f8636Q;

    /* renamed from: h */
    public final C1200WR f8637h = new C1200WR();

    /* renamed from: u */
    public boolean f8638u;

    /* renamed from: v */
    public AbstractC0356Gp f8639v;

    /* renamed from: z */
    public final Runnable f8640z;

    public C2752h(Runnable runnable) {
        OnBackInvokedCallback m4172z;
        this.f8640z = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                int i2 = 0;
                int i3 = 1;
                m4172z = C2053mh.f6384z.m3685z(new C0132CZ(this, i2), new C0132CZ(this, i3), new C0395HU(this, i2), new C0395HU(this, i3));
            } else {
                m4172z = C2418tY.f7404z.m4172z(new C0395HU(this, 2));
            }
            this.f8635P = m4172z;
        }
    }

    /* renamed from: P */
    public final void m4682P() {
        boolean z;
        boolean z2 = this.f8638u;
        C1200WR c1200wr = this.f8637h;
        if (!(c1200wr instanceof Collection) || !c1200wr.isEmpty()) {
            Iterator it = c1200wr.iterator();
            while (it.hasNext()) {
                if (((AbstractC0356Gp) it.next()).f1205z) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.f8638u = z;
        if (z != z2 && Build.VERSION.SDK_INT >= 33) {
            m4684v(z);
        }
    }

    /* renamed from: h */
    public final void m4683h() {
        Object obj;
        C1200WR c1200wr = this.f8637h;
        ListIterator listIterator = c1200wr.listIterator(c1200wr.mo1150h());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((AbstractC0356Gp) obj).f1205z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC0356Gp abstractC0356Gp = (AbstractC0356Gp) obj;
        this.f8639v = null;
        if (abstractC0356Gp != null) {
            C1385Zw c1385Zw = (C1385Zw) abstractC0356Gp;
            int i = c1385Zw.f4320P;
            Object obj2 = c1385Zw.f4319N;
            switch (i) {
                case AbstractC0795Op.f2698E /* 0 */:
                    C0364Gx c0364Gx = (C0364Gx) obj2;
                    c0364Gx.m823f(true);
                    if (c0364Gx.f1256o.f1205z) {
                        c0364Gx.m838t();
                        return;
                    } else {
                        c0364Gx.f1261u.m4683h();
                        return;
                    }
                default:
                    AbstractC2499v4 abstractC2499v4 = (AbstractC2499v4) obj2;
                    if (!abstractC2499v4.f7661u.isEmpty() && abstractC2499v4.m4332M(abstractC2499v4.m4335Q().f4455y, true, false)) {
                        abstractC2499v4.m4340h();
                        return;
                    }
                    return;
            }
        }
        Runnable runnable = this.f8640z;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: v */
    public final void m4684v(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f8634N;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f8635P) == null) {
            return;
        }
        C2418tY c2418tY = C2418tY.f7404z;
        if (z && !this.f8636Q) {
            c2418tY.m4170h(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f8636Q = true;
        } else {
            if (z || !this.f8636Q) {
                return;
            }
            c2418tY.m4171v(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8636Q = false;
        }
    }

    /* renamed from: z */
    public final void m4685z(InterfaceC1546d7 interfaceC1546d7, C1385Zw c1385Zw) {
        C0326GG mo1354C = interfaceC1546d7.mo1354C();
        if (mo1354C.f1105P == EnumC1632eh.f5089S) {
            return;
        }
        c1385Zw.f1203h.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, mo1354C, c1385Zw));
        m4682P();
        c1385Zw.f1204v = new C2541vq(0, this);
    }
}
