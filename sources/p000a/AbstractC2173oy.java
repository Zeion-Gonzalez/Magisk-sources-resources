package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: a.oy */
/* loaded from: classes.dex */
public abstract class AbstractC2173oy {

    /* renamed from: S */
    public static final ExecutorC0571Ki f6660S = new ExecutorC0571Ki(new ExecutorC2583wg(), 0);

    /* renamed from: R */
    public static int f6659R = -100;

    /* renamed from: w */
    public static C1523ck f6665w = null;

    /* renamed from: I */
    public static C1523ck f6658I = null;

    /* renamed from: q */
    public static Boolean f6663q = null;

    /* renamed from: k */
    public static boolean f6662k = false;

    /* renamed from: g */
    public static final C0894Qq f6661g = new C0894Qq();

    /* renamed from: y */
    public static final Object f6666y = new Object();

    /* renamed from: s */
    public static final Object f6664s = new Object();

    /* renamed from: G */
    public static void m3788G(AbstractC2173oy abstractC2173oy) {
        synchronized (f6666y) {
            Iterator it = f6661g.iterator();
            while (it.hasNext()) {
                AbstractC2173oy abstractC2173oy2 = (AbstractC2173oy) ((WeakReference) it.next()).get();
                if (abstractC2173oy2 == abstractC2173oy || abstractC2173oy2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: Q */
    public static boolean m3789Q(Context context) {
        int i;
        if (f6663q == null) {
            try {
                int i2 = AbstractServiceC2162om.f6632S;
                if (Build.VERSION.SDK_INT >= 24) {
                    i = AbstractC1463bU.m2876z() | 128;
                } else {
                    i = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, AbstractServiceC2162om.class), i).metaData;
                if (bundle != null) {
                    f6663q = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f6663q = Boolean.FALSE;
            }
        }
        return f6663q.booleanValue();
    }

    /* renamed from: M */
    public abstract boolean mo2790M(int i);

    /* renamed from: P */
    public abstract void mo2791P();

    /* renamed from: R */
    public abstract void mo2792R(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: S */
    public abstract void mo2793S(View view);

    /* renamed from: V */
    public abstract void mo2794V(int i);

    /* renamed from: h */
    public abstract View mo2802h(String str, Context context, AttributeSet attributeSet);

    /* renamed from: o */
    public abstract void mo2805o();

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return mo2802h(str, context, attributeSet);
    }

    /* renamed from: u */
    public abstract void mo2810u();

    /* renamed from: v */
    public abstract void mo2811v();

    /* renamed from: w */
    public abstract void mo2812w(CharSequence charSequence);

    /* renamed from: z */
    public abstract void mo2814z(View view, ViewGroup.LayoutParams layoutParams);
}
