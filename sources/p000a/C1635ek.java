package p000a;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.AbstractActivityC2754z;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a.ek */
/* loaded from: classes.dex */
public final /* synthetic */ class C1635ek implements InterfaceC0924RO {

    /* renamed from: h */
    public final /* synthetic */ Object f5093h;

    /* renamed from: z */
    public final /* synthetic */ int f5094z;

    public /* synthetic */ C1635ek(int i, Object obj) {
        this.f5094z = i;
        this.f5093h = obj;
    }

    @Override // p000a.InterfaceC0924RO
    /* renamed from: z */
    public final Bundle mo1153z() {
        Bundle bundle;
        int i = this.f5094z;
        Object obj = this.f5093h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractActivityC2754z abstractActivityC2754z = (AbstractActivityC2754z) obj;
                abstractActivityC2754z.getClass();
                Bundle bundle2 = new Bundle();
                C0966S8 c0966s8 = abstractActivityC2754z.f8652E;
                c0966s8.getClass();
                HashMap hashMap = c0966s8.f8648h;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0966s8.f8646P));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0966s8.f8649u.clone());
                return bundle2;
            case 1:
                AbstractActivityC0502JU abstractActivityC0502JU = (AbstractActivityC0502JU) obj;
                int i2 = AbstractActivityC0502JU.f1675j;
                do {
                } while (AbstractActivityC0502JU.m1193S(((C0852Pu) abstractActivityC0502JU.f1678X.f6382R).f2883q));
                abstractActivityC0502JU.f1677F.m721N(EnumC2241qF.ON_STOP);
                return new Bundle();
            case 2:
                return ((C0364Gx) obj).m827l();
            case 3:
                C0366Gz c0366Gz = (C0366Gz) obj;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle3 = new Bundle();
                for (Map.Entry entry : AbstractC0873QM.m2013dG(c0366Gz.f7660s.f5997z).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle mo3752o = ((AbstractC2719zK) entry.getValue()).mo3752o();
                    if (mo3752o != null) {
                        arrayList.add(str);
                        bundle3.putBundle(str, mo3752o);
                    }
                }
                if ((!arrayList.isEmpty()) != false) {
                    bundle = new Bundle();
                    bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle3);
                } else {
                    bundle = null;
                }
                C1200WR c1200wr = c0366Gz.f7661u;
                if ((!c1200wr.isEmpty()) != false) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[c1200wr.f3908w];
                    Iterator<E> it = c1200wr.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i3] = new C0359Gs((C1553dE) it.next());
                        i3++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                LinkedHashMap linkedHashMap = c0366Gz.f7649V;
                if ((!linkedHashMap.isEmpty()) != false) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i4 = 0;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i4] = intValue;
                        arrayList2.add(str2);
                        i4++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                LinkedHashMap linkedHashMap2 = c0366Gz.f7647S;
                if (true ^ linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        C1200WR c1200wr2 = (C1200WR) entry3.getValue();
                        arrayList3.add(str3);
                        Parcelable[] parcelableArr2 = new Parcelable[c1200wr2.f3908w];
                        Iterator it2 = c1200wr2.iterator();
                        int i5 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i6 = i5 + 1;
                            if (i5 >= 0) {
                                parcelableArr2[i5] = (C0359Gs) next;
                                i5 = i6;
                            } else {
                                AbstractC1292YB.m2699zx();
                                throw null;
                            }
                        }
                        bundle.putParcelableArray(AbstractC2441tz.m4200k("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (c0366Gz.f7645Q) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", c0366Gz.f7645Q);
                }
                if (bundle == null) {
                    return Bundle.EMPTY;
                }
                return bundle;
            default:
                int i7 = ((NavHostFragment) obj).f9029U8;
                if (i7 != 0) {
                    return AbstractC1843ih.m3422Q(new C0084Bc("android-support-nav:fragment:graphId", Integer.valueOf(i7)));
                }
                return Bundle.EMPTY;
        }
    }
}
