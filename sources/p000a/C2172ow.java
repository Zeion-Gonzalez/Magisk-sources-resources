package p000a;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: a.ow */
/* loaded from: classes.dex */
public final class C2172ow implements InterfaceC1792hi {

    /* renamed from: S */
    public final ContentInfo.Builder f6657S;

    public C2172ow(ClipData clipData, int i) {
        this.f6657S = AbstractC0804P.m1893N(clipData, i);
    }

    @Override // p000a.InterfaceC1792hi
    /* renamed from: N */
    public final void mo3070N(Uri uri) {
        this.f6657S.setLinkUri(uri);
    }

    @Override // p000a.InterfaceC1792hi
    /* renamed from: h */
    public final C0671Mh mo3071h() {
        ContentInfo build;
        build = this.f6657S.build();
        return new C0671Mh(new C2196pM(build));
    }

    @Override // p000a.InterfaceC1792hi
    /* renamed from: o */
    public final void mo3072o(int i) {
        this.f6657S.setFlags(i);
    }

    @Override // p000a.InterfaceC1792hi
    /* renamed from: v */
    public final void mo3073v(Bundle bundle) {
        this.f6657S.setExtras(bundle);
    }
}
