package p000a;

import android.os.Bundle;
import androidx.activity.AbstractActivityC2754z;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: a.pL */
/* loaded from: classes.dex */
public final /* synthetic */ class C2195pL implements InterfaceC2297rF {

    /* renamed from: h */
    public final /* synthetic */ AbstractActivityC2754z f6753h;

    /* renamed from: z */
    public final /* synthetic */ int f6754z;

    public /* synthetic */ C2195pL(AbstractActivityC0502JU abstractActivityC0502JU, int i) {
        this.f6754z = i;
        this.f6753h = abstractActivityC0502JU;
    }

    @Override // p000a.InterfaceC2297rF
    /* renamed from: z */
    public final void mo3769z() {
        int i = this.f6754z;
        AbstractActivityC2754z abstractActivityC2754z = this.f6753h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Bundle m3555z = abstractActivityC2754z.f8664q.f4218h.m3555z("android:support:activity-result");
                if (m3555z != null) {
                    C0966S8 c0966s8 = abstractActivityC2754z.f8652E;
                    c0966s8.getClass();
                    ArrayList<Integer> integerArrayList = m3555z.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = m3555z.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0966s8.f8646P = m3555z.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = m3555z.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c0966s8.f8649u;
                        bundle2.putAll(bundle);
                        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                            String str = stringArrayList.get(i2);
                            HashMap hashMap = c0966s8.f8648h;
                            boolean containsKey = hashMap.containsKey(str);
                            HashMap hashMap2 = c0966s8.f8651z;
                            if (containsKey) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            int intValue = integerArrayList.get(i2).intValue();
                            String str2 = stringArrayList.get(i2);
                            hashMap2.put(Integer.valueOf(intValue), str2);
                            hashMap.put(str2, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C0852Pu c0852Pu = (C0852Pu) ((AbstractActivityC0502JU) abstractActivityC2754z).f1678X.f6382R;
                c0852Pu.f2883q.m825h(c0852Pu, c0852Pu, null);
                return;
        }
    }
}
