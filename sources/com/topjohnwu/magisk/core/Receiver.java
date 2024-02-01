package com.topjohnwu.magisk.core;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import com.topjohnwu.magisk.R;
import p000a.AbstractC0017AI;
import p000a.AbstractC0037Al;
import p000a.AbstractC0154D;
import p000a.AbstractC0392HR;
import p000a.AbstractC0756O8;
import p000a.AbstractC0795Op;
import p000a.AbstractC1292YB;
import p000a.AbstractC1743gn;
import p000a.AbstractC2494v;
import p000a.AbstractC2575wW;
import p000a.C0070BN;
import p000a.C0931RV;
import p000a.C1033TN;
import p000a.C1080UE;
import p000a.C1146VR;
import p000a.C1212We;
import p000a.C1565dQ;
import p000a.C1710g8;
import p000a.InterfaceC1255XS;

/* loaded from: classes.dex */
public class Receiver extends BroadcastReceiver {

    /* renamed from: z */
    public static final /* synthetic */ int f9567z = 0;

    /* renamed from: h */
    public static final void m5126h(Receiver receiver, int i) {
        C0070BN c0070bn;
        int i2;
        AbstractC0154D c0931rv;
        C1565dQ c1565dQ = new C1565dQ(receiver, i, null);
        boolean z = true & true;
        C0070BN c0070bn2 = C0070BN.f302S;
        if (z) {
            c0070bn = c0070bn2;
        } else {
            c0070bn = null;
        }
        boolean z2 = false;
        if (true & true) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        InterfaceC1255XS m2668Y = AbstractC1292YB.m2668Y(c0070bn2, c0070bn, true);
        C1080UE c1080ue = AbstractC0037Al.f179z;
        if (m2668Y != c1080ue && m2668Y.mo107y(C1710g8.f5377R) == null) {
            m2668Y = m2668Y.mo104G(c1080ue);
        }
        if (i2 != 0) {
            if (i2 == 2) {
                z2 = true;
            }
            if (z2) {
                c0931rv = new C1033TN(m2668Y, c1565dQ);
            } else {
                c0931rv = new C0931RV(m2668Y, true);
            }
            c0931rv.m312D(i2, c0931rv, c1565dQ);
            return;
        }
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Notification.Builder smallIcon;
        if (intent == null) {
            return;
        }
        m5127z(context, intent);
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        Integer num = null;
        switch (action.hashCode()) {
            case -1749672628:
                if (action.equals("android.intent.action.UID_REMOVED")) {
                    int intExtra = intent.getIntExtra("android.intent.extra.UID", -1);
                    if (intExtra != -1) {
                        num = Integer.valueOf(intExtra);
                    }
                    if (num == null) {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case -810471698:
                if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                    C1212We c1212We = C1212We.f3969z;
                    c1212We.getClass();
                    if (C1212We.f3962q.m3358O4(c1212We, C1212We.f3959h[11]).booleanValue()) {
                        int intExtra2 = intent.getIntExtra("android.intent.extra.UID", -1);
                        if (intExtra2 != -1) {
                            num = Integer.valueOf(intExtra2);
                        }
                        if (num == null) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case -19011148:
                if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                    AbstractC2575wW.m4445oI(context);
                    return;
                }
                return;
            case 1580442797:
                if (action.equals("android.intent.action.PACKAGE_FULLY_REMOVED")) {
                    String stringExtra = intent.getStringExtra("android.intent.extra.PACKAGE_NAME");
                    if (stringExtra == null) {
                        Uri data = intent.getData();
                        if (data != null) {
                            stringExtra = data.getSchemeSpecificPart();
                        } else {
                            stringExtra = null;
                        }
                    }
                    if (stringExtra != null) {
                        AbstractC0017AI.m44z("magisk --denylist rm ".concat(stringExtra)).m4631d2(null);
                        return;
                    }
                    return;
                }
                return;
            case 1737074039:
                if (action.equals("android.intent.action.MY_PACKAGE_REPLACED") && AbstractC1292YB.m2695u(context.getPackageManager().getInstallerPackageName(context.getPackageName()), context.getPackageName())) {
                    C1146VR c1146vr = AbstractC0392HR.f1320z;
                    Context m3275z = AbstractC1743gn.m3275z();
                    Intent launchIntentForPackage = m3275z.getPackageManager().getLaunchIntentForPackage(m3275z.getPackageName());
                    launchIntentForPackage.addFlags(268468224);
                    PendingIntent activity = PendingIntent.getActivity(m3275z, 0, launchIntentForPackage, 201326592);
                    if (Build.VERSION.SDK_INT >= 26) {
                        smallIcon = AbstractC2494v.m4311Y(m3275z).setSmallIcon(Icon.createWithBitmap(AbstractC0795Op.m1848f(m3275z, R.drawable.ic_magisk_outline)));
                    } else {
                        smallIcon = new Notification.Builder(m3275z).setPriority(1).setSmallIcon(R.drawable.ic_magisk_outline);
                    }
                    AbstractC0392HR.m886z().notify(4, smallIcon.setContentIntent(activity).setContentTitle(m3275z.getText(R.string.updated_title)).setContentText(m3275z.getText(R.string.updated_text)).setAutoCancel(true).build());
                    return;
                }
                return;
            default:
                return;
        }
        m5126h(this, num.intValue());
    }

    /* renamed from: z */
    public final void m5127z(Context context, Intent intent) {
        AbstractC0756O8.m1729v(context);
    }
}
