package p000a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.topjohnwu.magisk.R;

/* renamed from: a.Zi */
/* loaded from: classes.dex */
public final class C1374Zi extends AbstractC0231EP implements InterfaceC1275Xu {

    /* renamed from: z */
    public final /* synthetic */ String f4308z;

    public C1374Zi(String str) {
        this.f4308z = str;
    }

    @Override // p000a.InterfaceC1275Xu
    /* renamed from: z */
    public final void mo2599z(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f4308z));
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            AbstractC0795Op.m1871tJ(context, R.string.open_link_failed_toast, 0);
        }
    }
}
