package p000a;

import android.app.Activity;
import android.content.DialogInterface;
import com.topjohnwu.magisk.R;

/* renamed from: a.Ta */
/* loaded from: classes.dex */
public final class C1044Ta extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ Activity f3450I;

    /* renamed from: R */
    public final /* synthetic */ int f3451R;

    /* renamed from: w */
    public final /* synthetic */ C1665fK f3452w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1044Ta(int i, Activity activity, C1665fK c1665fK) {
        super(1);
        this.f3451R = i;
        this.f3452w = c1665fK;
        this.f3450I = activity;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f3451R) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterface dialogInterface = (DialogInterface) obj;
                m2217v();
                return c0329gj;
            case 1:
                m2216h((C0738Nr) obj);
                return c0329gj;
            case 2:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                m2217v();
                return c0329gj;
            case 3:
                m2216h((C0738Nr) obj);
                return c0329gj;
            case 4:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                m2217v();
                return c0329gj;
            default:
                m2216h((C0738Nr) obj);
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m2216h(C0738Nr c0738Nr) {
        int i = this.f3451R;
        C1665fK c1665fK = this.f3452w;
        Activity activity = this.f3450I;
        switch (i) {
            case 1:
                c0738Nr.m1710W(Integer.valueOf((int) R.string.settings_dark_mode_light));
                c0738Nr.m1713u(R.drawable.ic_day);
                c0738Nr.f2515k = new C1044Ta(0, activity, c1665fK);
                return;
            case 2:
            default:
                c0738Nr.m1710W(Integer.valueOf((int) R.string.settings_dark_mode_dark));
                c0738Nr.m1713u(R.drawable.ic_night);
                c0738Nr.f2515k = new C1044Ta(4, activity, c1665fK);
                return;
            case 3:
                c0738Nr.m1710W(Integer.valueOf((int) R.string.settings_dark_mode_system));
                c0738Nr.m1713u(R.drawable.ic_day_night);
                c0738Nr.f2515k = new C1044Ta(2, activity, c1665fK);
                return;
        }
    }

    /* renamed from: v */
    public final void m2217v() {
        int i = this.f3451R;
        C1665fK c1665fK = this.f3452w;
        Activity activity = this.f3450I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1665fK.m3147P(1, activity, c1665fK);
                return;
            case 1:
            default:
                C1665fK.m3147P(2, activity, c1665fK);
                return;
            case 2:
                C1665fK.m3147P(-1, activity, c1665fK);
                return;
        }
    }
}
