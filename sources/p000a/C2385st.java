package p000a;

import android.content.Intent;
import androidx.activity.AbstractActivityC2754z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: a.st */
/* loaded from: classes.dex */
public final class C2385st extends AbstractC2575wW {
    @Override // p000a.AbstractC2575wW
    /* renamed from: HL */
    public final Object mo1610HL(Intent intent, int i) {
        boolean z;
        C1202WT c1202wt = C1202WT.f3909S;
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                ArrayList m3131Lq = AbstractC1658fB.m3131Lq(stringArrayExtra);
                Iterator it = m3131Lq.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC1658fB.m3134dx(m3131Lq), AbstractC1658fB.m3134dx(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C0084Bc(it.next(), it2.next()));
                }
                return AbstractC0873QM.m2012d2(arrayList2);
            }
            return c1202wt;
        }
        return c1202wt;
    }

    @Override // p000a.AbstractC2575wW
    /* renamed from: L */
    public final C0042As mo1611L(AbstractActivityC2754z abstractActivityC2754z, Object obj) {
        boolean z;
        boolean z2;
        String[] strArr = (String[]) obj;
        boolean z3 = true;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C0042As(C1202WT.f3909S);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (AbstractC0865QC.m2000z(abstractActivityC2754z, strArr[i]) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
                break;
            }
            i++;
        }
        if (z3) {
            int m990C = AbstractC0438II.m990C(strArr.length);
            if (m990C < 16) {
                m990C = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(m990C);
            for (String str : strArr) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new C0042As(linkedHashMap);
        }
        return null;
    }

    @Override // p000a.AbstractC2575wW
    /* renamed from: w */
    public final Intent mo1614w(AbstractActivityC2754z abstractActivityC2754z, Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }
}
