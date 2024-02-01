package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.rd */
/* loaded from: classes.dex */
public final class C2318rd extends AbstractC2467uU implements InterfaceC0645M7 {

    /* renamed from: R */
    public final C1071U5 f7144R;

    /* renamed from: w */
    public final String f7145w;

    public C2318rd(C1071U5 c1071u5) {
        this.f7144R = c1071u5;
        String str = c1071u5.f3539z;
        this.f7145w = c1071u5.f3536P ? AbstractC2441tz.m4200k("(isolated) ", str) : str;
    }

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public final int mo553G() {
        return R.layout.item_hide_process_md2;
    }

    /* renamed from: M */
    public final void m3975M(boolean z) {
        String str;
        C1071U5 c1071u5 = this.f7144R;
        if (c1071u5.f3538v != z) {
            c1071u5.f3538v = z;
            AbstractC0795Op.m1801B(this, 9);
            if (z) {
                str = "add";
            } else {
                str = "rm";
            }
            AbstractC0017AI.m44z("magisk --denylist " + str + " " + c1071u5.f3537h + " '" + c1071u5.f3539z + "'").m4631d2(null);
        }
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: N */
    public final boolean mo555N(InterfaceC0645M7 interfaceC0645M7) {
        C1071U5 c1071u5 = this.f7144R;
        String str = c1071u5.f3539z;
        C1071U5 c1071u52 = ((C2318rd) interfaceC0645M7).f7144R;
        if (AbstractC1292YB.m2695u(str, c1071u52.f3539z) && AbstractC1292YB.m2695u(c1071u5.f3537h, c1071u52.f3537h)) {
            return true;
        }
        return false;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: h */
    public final boolean mo556h(InterfaceC0645M7 interfaceC0645M7) {
        if (this.f7144R.f3538v == ((C2318rd) interfaceC0645M7).f7144R.f3538v) {
            return true;
        }
        return false;
    }
}
