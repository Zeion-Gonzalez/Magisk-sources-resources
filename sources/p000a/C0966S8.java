package p000a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.AbstractActivityC2754z;
import androidx.activity.result.AbstractC2753z;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: a.S8 */
/* loaded from: classes.dex */
public final class C0966S8 extends AbstractC2753z {

    /* renamed from: o */
    public final /* synthetic */ AbstractActivityC2754z f3282o;

    public C0966S8(AbstractActivityC0502JU abstractActivityC0502JU) {
        this.f3282o = abstractActivityC0502JU;
    }

    @Override // androidx.activity.result.AbstractC2753z
    /* renamed from: h */
    public final void mo2148h(int i, AbstractC2575wW abstractC2575wW, Object obj) {
        Bundle bundle;
        String[] strArr;
        AbstractActivityC2754z abstractActivityC2754z = this.f3282o;
        C0042As mo1611L = abstractC2575wW.mo1611L(abstractActivityC2754z, obj);
        int i2 = 0;
        if (mo1611L != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2016lv(this, i, mo1611L, i2));
            return;
        }
        Intent mo1614w = abstractC2575wW.mo1614w(abstractActivityC2754z, obj);
        if (mo1614w.getExtras() != null && mo1614w.getExtras().getClassLoader() == null) {
            mo1614w.setExtrasClassLoader(abstractActivityC2754z.getClassLoader());
        }
        if (mo1614w.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = mo1614w.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            mo1614w.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo1614w.getAction())) {
            String[] stringArrayExtra = mo1614w.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            Object obj2 = AbstractC0865QC.f2950z;
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i3])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                } else {
                    throw new IllegalArgumentException(AbstractC2441tz.m4187M(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size != stringArrayExtra.length) {
                    int i4 = 0;
                    while (i2 < stringArrayExtra.length) {
                        if (!hashSet.contains(Integer.valueOf(i2))) {
                            strArr[i4] = stringArrayExtra[i2];
                            i4++;
                        }
                        i2++;
                    }
                } else {
                    return;
                }
            }
            if (abstractActivityC2754z instanceof InterfaceC1348ZE) {
                ((InterfaceC1348ZE) abstractActivityC2754z).getClass();
            }
            AbstractC1159Vh.m2371h(abstractActivityC2754z, stringArrayExtra, i);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo1614w.getAction())) {
            C0244Ef c0244Ef = (C0244Ef) mo1614w.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = c0244Ef.f835S;
                Intent intent = c0244Ef.f834R;
                int i5 = c0244Ef.f836w;
                int i6 = c0244Ef.f833I;
                Object obj3 = AbstractC0865QC.f2950z;
                AbstractC0236EU.m483v(abstractActivityC2754z, intentSender, i, intent, i5, i6, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2016lv(this, i, e, 1));
                return;
            }
        }
        Object obj4 = AbstractC0865QC.f2950z;
        AbstractC0236EU.m482h(abstractActivityC2754z, mo1614w, i, bundle);
    }
}
