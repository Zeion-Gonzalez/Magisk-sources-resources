package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.rb */
/* loaded from: classes.dex */
public final class C2316rb implements InterfaceC1435aw {

    /* renamed from: R */
    public final InterfaceC1459bP f7138R;

    /* renamed from: S */
    public final String f7139S;

    public C2316rb(String str, C0049Az c0049Az) {
        this.f7139S = str;
        this.f7138R = c0049Az;
    }

    @Override // p000a.InterfaceC1435aw
    /* renamed from: h */
    public final void mo363h(DialogC2727zU dialogC2727zU) {
        dialogC2727zU.setTitle(R.string.su_revoke_title);
        dialogC2727zU.m4656G(R.string.su_revoke_msg, this.f7139S);
        dialogC2727zU.m4657W(EnumC1224Wr.f3992S, new C0248Ek(this, 1));
        dialogC2727zU.m4657W(EnumC1224Wr.f3993w, C0741Nu.f2545w);
    }
}
