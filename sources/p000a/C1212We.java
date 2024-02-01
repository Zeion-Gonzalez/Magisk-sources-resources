package p000a;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.topjohnwu.magisk.core.JobService;
import java.io.File;

/* renamed from: a.We */
/* loaded from: classes.dex */
public final class C1212We implements InterfaceC2101nb, InterfaceC0806P1 {

    /* renamed from: E */
    public static final C2106ng f3940E;

    /* renamed from: G */
    public static final C1158Vg f3941G;

    /* renamed from: H */
    public static final C1509cR f3942H;

    /* renamed from: I */
    public static final C0504JX f3943I;

    /* renamed from: J */
    public static final C1158Vg f3944J;

    /* renamed from: M */
    public static final C1158Vg f3945M;

    /* renamed from: N */
    public static boolean f3946N;

    /* renamed from: P */
    public static final int f3947P;

    /* renamed from: Q */
    public static boolean f3948Q;

    /* renamed from: R */
    public static final C1803hx f3949R;

    /* renamed from: S */
    public static final C1158Vg f3950S;

    /* renamed from: U */
    public static final C1424ak f3951U;

    /* renamed from: V */
    public static final C1158Vg f3952V;

    /* renamed from: W */
    public static final C1424ak f3953W;

    /* renamed from: Y */
    public static final C1158Vg f3954Y;

    /* renamed from: c */
    public static final C2676yY f3955c;

    /* renamed from: e */
    public static final C1509cR f3956e;

    /* renamed from: f */
    public static final C2106ng f3957f;

    /* renamed from: g */
    public static final C1803hx f3958g;

    /* renamed from: h */
    public static final /* synthetic */ InterfaceC0609LP[] f3959h;

    /* renamed from: k */
    public static final C1803hx f3960k;

    /* renamed from: o */
    public static final C1803hx f3961o;

    /* renamed from: q */
    public static final C1803hx f3962q;

    /* renamed from: r */
    public static final C2106ng f3963r;

    /* renamed from: s */
    public static final C1424ak f3964s;

    /* renamed from: u */
    public static boolean f3965u;

    /* renamed from: v */
    public static final File f3966v;

    /* renamed from: w */
    public static final C0504JX f3967w;

    /* renamed from: y */
    public static final C1803hx f3968y;

    /* renamed from: z */
    public static final C1212We f3969z;

    static {
        C2548vx c2548vx = new C2548vx("bootId", "getBootId()Ljava/lang/String;");
        AbstractC0274FD.f956z.getClass();
        f3959h = new InterfaceC0609LP[]{c2548vx, new C2548vx("askedHome", "getAskedHome()Z"), new C2548vx("downloadDir", "getDownloadDir()Ljava/lang/String;"), new C2548vx("repoOrder", "getRepoOrder()I"), new C2548vx("suDefaultTimeout", "getSuDefaultTimeout()I"), new C2548vx("suAutoResponse", "getSuAutoResponse()I"), new C2548vx("suNotification", "getSuNotification()I"), new C2548vx("updateChannel", "getUpdateChannel()I"), new C2548vx("safetyNotice", "getSafetyNotice()Z"), new C2548vx("darkTheme", "getDarkTheme()I"), new C2548vx("themeOrdinal", "getThemeOrdinal()I"), new C2548vx("suReAuth", "getSuReAuth()Z"), new C2548vx("suTapjack", "getSuTapjack()Z"), new C2548vx("checkUpdatePrefs", "getCheckUpdatePrefs()Z"), new C2548vx("doh", "getDoh()Z"), new C2548vx("showSystemApp", "getShowSystemApp()Z"), new C2548vx("customChannelUrl", "getCustomChannelUrl()Ljava/lang/String;"), new C2548vx("localePrefs", "getLocalePrefs()Ljava/lang/String;"), new C2548vx("rootMode", "getRootMode()I"), new C2548vx("suMntNamespaceMode", "getSuMntNamespaceMode()I"), new C2548vx("suMultiuserMode", "getSuMultiuserMode()I"), new C2548vx("suBiometric", "getSuBiometric()Z"), new C2548vx("zygisk", "getZygisk()Z"), new C2548vx("denyList", "getDenyList()Z"), new C2548vx("suManager", "getSuManager()Ljava/lang/String;"), new C2548vx("keyStoreRaw", "getKeyStoreRaw()Ljava/lang/String;")};
        C1212We c1212We = new C1212We();
        f3969z = c1212We;
        f3966v = new File(AbstractC2441tz.m4195W(AbstractC1743gn.m3273h().getFilesDir().getParent(), "/shared_prefs"), AbstractC2441tz.m4195W(AbstractC2441tz.m4195W(c1212We.m2499h().getPackageName(), "_preferences"), ".xml"));
        String str = AbstractC0598LC.f1921z;
        f3947P = -1;
        f3961o = AbstractC0795Op.m1840b(c1212We, "asked_home", false);
        f3953W = AbstractC0795Op.m1837Yd(c1212We, "download_dir");
        f3941G = AbstractC0795Op.m1867qn(c1212We, "su_request_timeout", 10);
        f3945M = AbstractC0795Op.m1867qn(c1212We, "su_auto_response", 0);
        f3952V = AbstractC0795Op.m1867qn(c1212We, "su_notification", 1);
        f3950S = AbstractC0795Op.m1867qn(c1212We, "update_channel", -1);
        f3949R = AbstractC0795Op.m1840b(c1212We, "safety_notice", true);
        f3967w = AbstractC0795Op.m1861nP(c1212We, "dark_theme_extended", -1);
        C0054B3 c0054b3 = EnumC2349sC.f7239w;
        f3943I = AbstractC0795Op.m1861nP(c1212We, "theme_ordinal", 0);
        f3962q = AbstractC0795Op.m1840b(c1212We, "su_reauth", false);
        f3960k = AbstractC0795Op.m1840b(c1212We, "su_tapjack", true);
        f3958g = AbstractC0795Op.m1840b(c1212We, "check_update", true);
        f3968y = AbstractC0795Op.m1840b(c1212We, "doh", false);
        f3964s = AbstractC0795Op.m1837Yd(c1212We, "custom_channel");
        f3951U = AbstractC0795Op.m1837Yd(c1212We, "locale");
        f3940E = new C2106ng(3, "root_access");
        f3957f = new C2106ng(1, "mnt_ns");
        f3963r = new C2106ng(0, "multiuser_mode");
        f3954Y = new C1158Vg("su_biometric");
        f3944J = new C1158Vg("zygisk");
        f3955c = new C2676yY();
        f3942H = new C1509cR("requester");
        f3956e = new C1509cR("keystore");
    }

    /* renamed from: N */
    public final int m2496N() {
        return ((Number) f3950S.m2368h(this, f3959h[7])).intValue();
    }

    /* renamed from: P */
    public final boolean m2497P() {
        return f3960k.m3358O4(this, f3959h[12]).booleanValue();
    }

    /* renamed from: Q */
    public final boolean m2498Q() {
        C1910jw c1910jw = C1910jw.f5967z;
        if (((KeyguardManager) AbstractC1743gn.m3275z().getSystemService(KeyguardManager.class)).isDeviceSecure()) {
            if (f3954Y.m2370z(this, f3959h[21]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final Context m2499h() {
        return AbstractC1743gn.m3273h();
    }

    /* renamed from: u */
    public final void m2500u(boolean z) {
        if (m2502z() != z) {
            f3958g.m3359nB(this, f3959h[13], z);
            int i = JobService.f9564R;
            C1219Wm.m2514u(AbstractC1743gn.m3275z());
        }
    }

    /* renamed from: v */
    public final SharedPreferences m2501v() {
        return AbstractC1743gn.m3273h().getSharedPreferences(m2499h().getPackageName() + "_preferences", 0);
    }

    /* renamed from: z */
    public final boolean m2502z() {
        return f3958g.m3358O4(this, f3959h[13]).booleanValue();
    }
}
