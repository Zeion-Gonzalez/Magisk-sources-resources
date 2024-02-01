package p000a;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: a.lE */
/* loaded from: classes.dex */
public final class C1979lE implements InterfaceC0369H1 {

    /* renamed from: S */
    public final InputContentInfo f6120S;

    public C1979lE(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f6120S = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: M */
    public final Object mo849M() {
        return this.f6120S;
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: V */
    public final Uri mo850V() {
        return this.f6120S.getContentUri();
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: o */
    public final ClipDescription mo851o() {
        return this.f6120S.getDescription();
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: v */
    public final Uri mo852v() {
        return this.f6120S.getLinkUri();
    }

    @Override // p000a.InterfaceC0369H1
    /* renamed from: z */
    public final void mo853z() {
        this.f6120S.requestPermission();
    }

    public C1979lE(Object obj) {
        this.f6120S = (InputContentInfo) obj;
    }
}
