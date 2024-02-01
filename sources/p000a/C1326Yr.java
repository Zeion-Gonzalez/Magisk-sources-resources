package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@InterfaceC2240qD("activity")
/* renamed from: a.Yr */
/* loaded from: classes.dex */
public class C1326Yr extends AbstractC2719zK {

    /* renamed from: P */
    public final Activity f4204P;

    /* renamed from: v */
    public final Context f4205v;

    public C1326Yr(Context context) {
        Object obj;
        this.f4205v = context;
        Iterator it = AbstractC0873QM.m2010BX(context, C1980lF.f6138k).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f4204P = (Activity) obj;
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: G */
    public final boolean mo634G() {
        Activity activity = this.f4204P;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: v */
    public final C1420ag mo635v(C1420ag c1420ag, Bundle bundle, C0815PB c0815pb) {
        Intent intent;
        int intExtra;
        boolean z;
        C2158oi c2158oi = (C2158oi) c1420ag;
        if (c2158oi.f6623E != null) {
            Intent intent2 = new Intent(c2158oi.f6623E);
            int i = 0;
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = c2158oi.f6624f;
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            Activity activity = this.f4204P;
            if (activity == null) {
                intent2.addFlags(268435456);
            }
            if (c0815pb != null && c0815pb.f2774z) {
                intent2.addFlags(536870912);
            }
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", c2158oi.f4455y);
            Context context = this.f4205v;
            Resources resources = context.getResources();
            if (c0815pb != null) {
                int i2 = c0815pb.f2771o;
                int i3 = c0815pb.f2769W;
                if ((i2 > 0 && AbstractC1292YB.m2695u(resources.getResourceTypeName(i2), "animator")) || (i3 > 0 && AbstractC1292YB.m2695u(resources.getResourceTypeName(i3), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i2) + " and popExit resource " + resources.getResourceName(i3) + " when launching " + c2158oi);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i2);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i3);
                }
            }
            context.startActivity(intent2);
            if (c0815pb != null && activity != null) {
                int i4 = c0815pb.f2768Q;
                int i5 = c0815pb.f2772u;
                if ((i4 > 0 && AbstractC1292YB.m2695u(resources.getResourceTypeName(i4), "animator")) || (i5 > 0 && AbstractC1292YB.m2695u(resources.getResourceTypeName(i5), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i4) + " and exit resource " + resources.getResourceName(i5) + "when launching " + c2158oi);
                    return null;
                }
                if (i4 >= 0 || i5 >= 0) {
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i5 >= 0) {
                        i = i5;
                    }
                    activity.overridePendingTransition(i4, i);
                    return null;
                }
                return null;
            }
            return null;
        }
        throw new IllegalStateException(("Destination " + c2158oi.f4455y + " does not have an Intent set.").toString());
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: z */
    public final C1420ag mo636z() {
        return new C2158oi(this);
    }
}
