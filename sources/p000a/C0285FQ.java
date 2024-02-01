package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.FQ */
/* loaded from: classes.dex */
public final class C0285FQ implements Iterable {

    /* renamed from: R */
    public final Context f989R;

    /* renamed from: S */
    public final ArrayList f990S = new ArrayList();

    public C0285FQ(Context context) {
        this.f989R = context;
    }

    /* renamed from: h */
    public final void m582h(ComponentName componentName) {
        Context context = this.f989R;
        ArrayList arrayList = this.f990S;
        int size = arrayList.size();
        while (true) {
            try {
                Intent m3456p = AbstractC1843ih.m3456p(context, componentName);
                if (m3456p == null) {
                    return;
                }
                arrayList.add(size, m3456p);
                componentName = m3456p.getComponent();
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f990S.iterator();
    }

    /* renamed from: v */
    public final void m583v() {
        ArrayList arrayList = this.f990S;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = AbstractC0865QC.f2950z;
            AbstractC2458uK.m4240z(this.f989R, intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
