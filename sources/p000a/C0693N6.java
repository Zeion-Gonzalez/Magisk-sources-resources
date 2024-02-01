package p000a;

import android.app.KeyguardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.AbstractActivityC2754z;

/* renamed from: a.N6 */
/* loaded from: classes.dex */
public final class C0693N6 extends AbstractC2575wW {

    /* renamed from: x */
    public final /* synthetic */ int f2344x;

    public /* synthetic */ C0693N6(int i) {
        this.f2344x = i;
    }

    /* renamed from: EQ */
    public final Intent m1608EQ(AbstractActivityC2754z abstractActivityC2754z) {
        switch (this.f2344x) {
            case 3:
                return ((KeyguardManager) abstractActivityC2754z.getSystemService(KeyguardManager.class)).createConfirmDeviceCredentialIntent(null, null);
            default:
                return new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES").setData(Uri.parse("package:" + abstractActivityC2754z.getPackageName()));
        }
    }

    /* renamed from: Fu */
    public final C0042As m1609Fu(AbstractActivityC2754z abstractActivityC2754z, String str) {
        boolean z;
        switch (this.f2344x) {
            case AbstractC0795Op.f2698E /* 0 */:
                return null;
            default:
                if (AbstractC0865QC.m2000z(abstractActivityC2754z, str) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return null;
                }
                return new C0042As(Boolean.TRUE);
        }
    }

    @Override // p000a.AbstractC2575wW
    /* renamed from: HL */
    public final Object mo1610HL(Intent intent, int i) {
        boolean z;
        switch (this.f2344x) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (i == -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 1:
                return m1612Rh(intent, i);
            case 2:
                return new C1440b0(intent, i);
            case 3:
                return m1612Rh(intent, i);
            default:
                return m1612Rh(intent, i);
        }
    }

    @Override // p000a.AbstractC2575wW
    /* renamed from: L */
    public final C0042As mo1611L(AbstractActivityC2754z abstractActivityC2754z, Object obj) {
        boolean canRequestPackageInstalls;
        switch (this.f2344x) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m1609Fu(abstractActivityC2754z, (String) obj);
            case 1:
                return m1609Fu(abstractActivityC2754z, (String) obj);
            case 2:
            case 3:
            default:
                return null;
            case 4:
                C0329GJ c0329gj = (C0329GJ) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    canRequestPackageInstalls = abstractActivityC2754z.getPackageManager().canRequestPackageInstalls();
                    if (!canRequestPackageInstalls) {
                        return null;
                    }
                    return new C0042As(Boolean.TRUE);
                }
                return new C0042As(Boolean.TRUE);
        }
    }

    /* renamed from: Rh */
    public final Boolean m1612Rh(Intent intent, int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        switch (this.f2344x) {
            case 1:
                if (intent != null && i == -1) {
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null) {
                        int length = intArrayExtra.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (intArrayExtra[i2] == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    z = true;
                                } else {
                                    i2++;
                                }
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            z3 = true;
                        }
                    }
                    return Boolean.valueOf(z3);
                }
                return Boolean.FALSE;
            case 2:
            default:
                if (i == -1) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 3:
                if (i == -1) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
        }
    }

    /* renamed from: Ry */
    public final Intent m1613Ry(String str) {
        switch (this.f2344x) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            default:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        }
    }

    @Override // p000a.AbstractC2575wW
    /* renamed from: w */
    public final Intent mo1614w(AbstractActivityC2754z abstractActivityC2754z, Object obj) {
        Bundle bundleExtra;
        switch (this.f2344x) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m1613Ry((String) obj);
            case 1:
                return m1613Ry((String) obj);
            case 2:
                C0244Ef c0244Ef = (C0244Ef) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0244Ef.f834R;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0244Ef = new C0244Ef(c0244Ef.f835S, null, c0244Ef.f836w, c0244Ef.f833I);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0244Ef);
                if (C0364Gx.m791p(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 3:
                C0329GJ c0329gj = (C0329GJ) obj;
                return m1608EQ(abstractActivityC2754z);
            default:
                C0329GJ c0329gj2 = (C0329GJ) obj;
                return m1608EQ(abstractActivityC2754z);
        }
    }
}
