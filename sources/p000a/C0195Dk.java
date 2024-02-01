package p000a;

import android.net.Uri;
import com.topjohnwu.magisk.R;

/* renamed from: a.Dk */
/* loaded from: classes.dex */
public final class C0195Dk implements InterfaceC1435aw {

    /* renamed from: R */
    public final Uri f595R;

    /* renamed from: S */
    public final C2744zq f596S;

    /* renamed from: w */
    public final String f597w;

    public C0195Dk(C2744zq c2744zq, Uri uri, String str) {
        this.f596S = c2744zq;
        this.f595R = uri;
        this.f597w = str;
    }

    @Override // p000a.InterfaceC1435aw
    /* renamed from: h */
    public final void mo363h(DialogC2727zU dialogC2727zU) {
        dialogC2727zU.setTitle(R.string.confirm_install_title);
        int i = 1;
        String string = dialogC2727zU.getContext().getString(R.string.confirm_install, this.f597w);
        C0978SM c0978sm = dialogC2727zU.f8569g;
        if (!AbstractC1292YB.m2695u(c0978sm.f3306w, string)) {
            c0978sm.f3306w = string;
            AbstractC0795Op.m1801B(c0978sm, 24);
        }
        dialogC2727zU.m4657W(EnumC1224Wr.f3992S, new C0429I7(this, i));
        dialogC2727zU.m4657W(EnumC1224Wr.f3993w, C1980lF.f6139p);
    }
}
