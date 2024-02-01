package p000a;

import android.content.Context;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import com.topjohnwu.magisk.R;
import java.io.File;

/* renamed from: a.fV */
/* loaded from: classes.dex */
public final class C1676fV extends AbstractC1378Zn {

    /* renamed from: k */
    public static String f5245k;

    /* renamed from: I */
    public static final C1676fV f5244I = new C1676fV();

    /* renamed from: q */
    public static final C0639M1 f5246q = new C0639M1(R.string.settings_download_path_title);

    static {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        f5245k = C1212We.f3953W.m2853O4(c1212We, C1212We.f3959h[2]);
    }

    public C1676fV() {
        super(0);
    }

    @Override // p000a.AbstractC1378Zn
    /* renamed from: E */
    public final View mo2773E(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        int i = AbstractC1479bq.f4592d;
        AbstractC1479bq abstractC1479bq = (AbstractC1479bq) AbstractC2307rQ.m3967v(from, R.layout.dialog_settings_download_path, null, false);
        abstractC1479bq.mo2887s(this);
        return abstractC1479bq.f8982k;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: M */
    public final AbstractC2222pt mo234M() {
        boolean z;
        String str;
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        String m2853O4 = C1212We.f3953W.m2853O4(c1212We, C1212We.f3959h[2]);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (m2853O4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = Environment.DIRECTORY_DOWNLOADS;
        } else {
            str = Environment.DIRECTORY_DOWNLOADS + File.separator + m2853O4;
        }
        return new C1961ku(new File(externalStorageDirectory, str).getCanonicalPath());
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f5246q;
    }

    @Override // p000a.AbstractC1378Zn
    /* renamed from: U */
    public final String mo2775U() {
        return f5245k;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[2];
        C1212We.f3953W.m2854nB(c1212We, interfaceC0609LP, (String) obj);
        AbstractC0795Op.m1801B(this, 8);
    }
}
