package p000a;

import android.content.res.Resources;
import com.topjohnwu.magisk.R;
import java.text.DateFormat;

/* renamed from: a.Wl */
/* loaded from: classes.dex */
public final class C1218Wl extends AbstractC2467uU implements InterfaceC0645M7 {

    /* renamed from: I */
    public boolean f3983I;

    /* renamed from: R */
    public final C0790Oi f3984R;

    /* renamed from: q */
    public boolean f3985q;

    /* renamed from: w */
    public final String f3986w;

    public C1218Wl(C0790Oi c0790Oi) {
        boolean z;
        boolean z2;
        String valueOf;
        this.f3984R = c0790Oi;
        Resources resources = AbstractC1743gn.m3275z().getResources();
        StringBuilder sb = new StringBuilder();
        String format = ((DateFormat) AbstractC2631xW.f8218h.getValue()).format(Long.valueOf(c0790Oi.f2681M));
        format = format == null ? "" : format;
        sb.append(format + "\n" + resources.getString(R.string.target_uid, Integer.valueOf(c0790Oi.f2687h)) + "  " + resources.getString(R.string.pid, Integer.valueOf(c0790Oi.f2690v)));
        int i = c0790Oi.f2688o;
        if (i != -1) {
            if (i == 0) {
                valueOf = "magiskd";
            } else {
                valueOf = String.valueOf(i);
            }
            sb.append("  ".concat(resources.getString(R.string.target_pid, valueOf)));
        }
        String str = c0790Oi.f2686W;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append("\n".concat(resources.getString(R.string.selinux_context, str)));
        }
        String str2 = c0790Oi.f2680G;
        if (str2.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            sb.append("\n".concat(resources.getString(R.string.supp_group, str2)));
        }
        sb.append("\n" + c0790Oi.f2684Q);
        this.f3986w = sb.toString();
    }

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public final int mo553G() {
        return R.layout.item_log_access_md2;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: N */
    public final boolean mo555N(InterfaceC0645M7 interfaceC0645M7) {
        return AbstractC1292YB.m2695u(this.f3984R.f2682N, ((C1218Wl) interfaceC0645M7).f3984R.f2682N);
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo556h(InterfaceC0645M7 interfaceC0645M7) {
        C1218Wl c1218Wl = (C1218Wl) interfaceC0645M7;
        return true;
    }
}
