package p000a;

import android.content.ClipData;
import android.view.ContentInfo;
import android.window.SplashScreenView;

/* renamed from: a.P */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0804P {
    /* renamed from: G */
    public static /* bridge */ /* synthetic */ SplashScreenView m1890G(Object obj) {
        return (SplashScreenView) obj;
    }

    /* renamed from: N */
    public static /* synthetic */ ContentInfo.Builder m1893N(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ boolean m1904q(Object obj) {
        return obj instanceof SplashScreenView;
    }

    /* renamed from: u */
    public static /* bridge */ /* synthetic */ ContentInfo m1905u(Object obj) {
        return (ContentInfo) obj;
    }
}
