package p000a;

import androidx.lifecycle.AbstractC2764h;

/* renamed from: a.yU */
/* loaded from: classes.dex */
public abstract class AbstractC2673yU {

    /* renamed from: I */
    public final /* synthetic */ AbstractC2764h f8342I;

    /* renamed from: R */
    public boolean f8343R;

    /* renamed from: S */
    public final InterfaceC0217E7 f8344S;

    /* renamed from: w */
    public int f8345w = -1;

    public AbstractC2673yU(AbstractC2764h abstractC2764h, InterfaceC0217E7 interfaceC0217E7) {
        this.f8342I = abstractC2764h;
        this.f8344S = interfaceC0217E7;
    }

    /* renamed from: G */
    public boolean mo4582G(InterfaceC1546d7 interfaceC1546d7) {
        return false;
    }

    /* renamed from: M */
    public abstract boolean mo3546M();

    /* renamed from: W */
    public void mo4583W() {
    }

    /* renamed from: o */
    public final void m4584o(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        if (z == this.f8343R) {
            return;
        }
        this.f8343R = z;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        AbstractC2764h abstractC2764h = this.f8342I;
        int i2 = abstractC2764h.f9022v;
        abstractC2764h.f9022v = i + i2;
        if (!abstractC2764h.f9016P) {
            abstractC2764h.f9016P = true;
            while (true) {
                try {
                    int i3 = abstractC2764h.f9022v;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 == 0 && i3 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i2 > 0 && i3 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                        abstractC2764h.mo1308u();
                    } else if (z3) {
                        abstractC2764h.mo1307o();
                    }
                    i2 = i3;
                } finally {
                    abstractC2764h.f9016P = false;
                }
            }
        }
        if (this.f8343R) {
            abstractC2764h.m4848v(this);
        }
    }
}
