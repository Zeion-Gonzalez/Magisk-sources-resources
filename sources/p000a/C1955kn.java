package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.kn */
/* loaded from: classes.dex */
public final class C1955kn implements InterfaceC1435aw {

    /* renamed from: R */
    public final int f6054R;

    /* renamed from: S */
    public final C0471Iu f6055S;

    public C1955kn(C0471Iu c0471Iu, int i) {
        this.f6055S = c0471Iu;
        this.f6054R = i;
    }

    @Override // p000a.InterfaceC1435aw
    /* renamed from: h */
    public final void mo363h(DialogC2727zU dialogC2727zU) {
        dialogC2727zU.setTitle(R.string.env_fix_title);
        dialogC2727zU.m4656G(R.string.env_fix_msg, new Object[0]);
        EnumC1224Wr enumC1224Wr = EnumC1224Wr.f3992S;
        int i = 1;
        dialogC2727zU.m4657W(enumC1224Wr, new C1068U2(dialogC2727zU, i));
        dialogC2727zU.m4657W(EnumC1224Wr.f3993w, C1980lF.f6121C);
        if (this.f6054R == 2 || C1910jw.m3543z().f1385v != 26400 || !AbstractC1292YB.m2695u(C1910jw.m3543z().f1386z, "26.4")) {
            dialogC2727zU.m4656G(R.string.env_full_fix_msg, new Object[0]);
            dialogC2727zU.m4657W(enumC1224Wr, new C1993lU(this, dialogC2727zU, i));
        }
    }
}
