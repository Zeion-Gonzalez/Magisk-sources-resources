package p000a;

import android.net.Uri;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.lifecycle.AbstractC2764h;
import com.google.android.material.card.MaterialCardView;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.p001ui.flash.FlashFragment;

/* renamed from: a.yS */
/* loaded from: classes.dex */
public final class C2672yS extends AbstractC0282FM implements InterfaceC1221Wo {

    /* renamed from: n0 */
    public static final SparseIntArray f8323n0;

    /* renamed from: B */
    public final Button f8324B;

    /* renamed from: D */
    public final CheckBox f8325D;

    /* renamed from: HL */
    public final C0478J0 f8326HL;

    /* renamed from: K */
    public final LinearLayout f8327K;

    /* renamed from: T */
    public final MaterialCardView f8328T;

    /* renamed from: UZ */
    public long f8329UZ;

    /* renamed from: Yd */
    public final ViewOnClickListenerC0574Kl f8330Yd;

    /* renamed from: b */
    public final ImageView f8331b;

    /* renamed from: l */
    public final CheckBox f8332l;

    /* renamed from: m */
    public final CheckBox f8333m;

    /* renamed from: n */
    public final MaterialCardView f8334n;

    /* renamed from: nF */
    public final C0478J0 f8335nF;

    /* renamed from: nP */
    public final Button f8336nP;

    /* renamed from: od */
    public final C0478J0 f8337od;

    /* renamed from: qn */
    public final ViewOnClickListenerC0574Kl f8338qn;

    /* renamed from: t */
    public final ImageView f8339t;

    /* renamed from: x */
    public final RadioGroup f8340x;

    /* renamed from: zx */
    public final C0478J0 f8341zx;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8323n0 = sparseIntArray;
        sparseIntArray.put(R.id.method_patch, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2672yS(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2672yS.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f8329UZ != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f8329UZ = 32L;
        }
        m4816I();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0166  */
    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15N() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2672yS.mo15N():void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            C1650f1 c1650f1 = (C1650f1) obj;
            return m4581s(i2);
        }
        AbstractC2764h abstractC2764h = (AbstractC2764h) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f8329UZ |= 1;
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        C0499JR c0499jr;
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                C1650f1 c1650f1 = (C1650f1) this.f983O;
                if (c1650f1 != null) {
                    z = true;
                }
                if (z) {
                    int i2 = c1650f1.f5117s;
                    C1112Up c1112Up = c1650f1.f8088q;
                    switch (i2) {
                        case R.id.method_direct /* 2131296622 */:
                            int i3 = FlashFragment.f9600he;
                            c0499jr = new C0499JR(null, "magisk");
                            break;
                        case R.id.method_inactive_slot /* 2131296623 */:
                            int i4 = FlashFragment.f9600he;
                            c0499jr = new C0499JR(null, "slot");
                            break;
                        case R.id.method_patch /* 2131296624 */:
                            int i5 = FlashFragment.f9600he;
                            c1112Up.m2291M(new C2191pH(new C0499JR((Uri) C1650f1.f5113E.m4844P(), "patch"), true));
                            return;
                        default:
                            throw new IllegalStateException("Unknown value".toString());
                    }
                    c1112Up.m2291M(new C2191pH(c0499jr, true));
                    return;
                }
                return;
            }
            return;
        }
        C1650f1 c1650f12 = (C1650f1) this.f983O;
        if (c1650f12 != null) {
            z = true;
        }
        if (z && c1650f12.f5118y != 1) {
            c1650f12.f5118y = 1;
            c1650f12.mo1709Q(38);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 == i) {
            C1650f1 c1650f1 = (C1650f1) obj;
            m4818g(1, c1650f1);
            this.f983O = c1650f1;
            synchronized (this) {
                this.f8329UZ |= 2;
            }
            m2861Q(43);
            m4816I();
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m4581s(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f8329UZ |= 2;
            }
            return true;
        }
        if (i == 38) {
            synchronized (this) {
                this.f8329UZ |= 4;
            }
            return true;
        }
        if (i == 25) {
            synchronized (this) {
                this.f8329UZ |= 8;
            }
            return true;
        }
        if (i != 26) {
            return false;
        }
        synchronized (this) {
            this.f8329UZ |= 16;
        }
        return true;
    }
}
