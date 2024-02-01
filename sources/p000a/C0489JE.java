package p000a;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.topjohnwu.magisk.R;

/* renamed from: a.JE */
/* loaded from: classes.dex */
public class C0489JE {

    /* renamed from: h */
    public InterfaceC1371Zf f1640h = new C1447b9(0);

    /* renamed from: z */
    public final Activity f1641z;

    public C0489JE(Activity activity) {
        this.f1641z = activity;
    }

    /* renamed from: h */
    public void mo24h(C1447b9 c1447b9) {
        this.f1640h = c1447b9;
        View findViewById = this.f1641z.findViewById(16908290);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2585wi(this, findViewById, 0));
    }

    /* renamed from: z */
    public void mo25z() {
        int i;
        TypedValue typedValue = new TypedValue();
        Activity activity = this.f1641z;
        Resources.Theme theme = activity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            activity.setTheme(i);
        }
    }
}
