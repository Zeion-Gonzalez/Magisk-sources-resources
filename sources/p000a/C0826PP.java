package p000a;

import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: a.PP */
/* loaded from: classes.dex */
public final class C0826PP implements Comparable {

    /* renamed from: k */
    public static final C0823PM f2799k = AbstractC1292YB.m2650I(C0741Nu.f2543r, C0741Nu.f2530Y);

    /* renamed from: I */
    public final Drawable f2800I;

    /* renamed from: R */
    public final ArrayList f2801R;

    /* renamed from: S */
    public final ApplicationInfo f2802S;

    /* renamed from: q */
    public final Collection f2803q;

    /* renamed from: w */
    public final String f2804w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.AbstractCollection, java.util.TreeSet] */
    public C0826PP(ApplicationInfo applicationInfo, PackageManager packageManager, List list) {
        Object c1019t6;
        PackageInfo packageArchiveInfo;
        C1239X8 c1239x8;
        boolean z;
        String m1927h;
        C1071U5 c1071u5;
        boolean z2;
        String m1927h2;
        this.f2802S = applicationInfo;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C1242XB c1242xb = (C1242XB) next;
            if (!AbstractC1292YB.m2695u(c1242xb.f4033z, this.f2802S.packageName) && !AbstractC1292YB.m2695u(c1242xb.f4033z, "isolated")) {
                z3 = false;
            }
            if (z3) {
                arrayList.add(next);
            }
        }
        this.f2801R = arrayList;
        this.f2804w = AbstractC0795Op.m1835X(this.f2802S, packageManager);
        try {
            c1019t6 = this.f2802S.loadIcon(packageManager);
        } catch (Throwable th) {
            c1019t6 = new C1019T6(th);
        }
        this.f2800I = (Drawable) (c1019t6 instanceof C1019T6 ? packageManager.getDefaultActivityIcon() : c1019t6);
        ApplicationInfo applicationInfo2 = this.f2802S;
        try {
            packageArchiveInfo = packageManager.getPackageInfo(applicationInfo2.packageName, 8719);
        } catch (Exception unused) {
            packageArchiveInfo = packageManager.getPackageArchiveInfo(applicationInfo2.sourceDir, 8719);
            c1239x8 = packageArchiveInfo == null ? C1239X8.f4021S : c1239x8;
        }
        ?? treeSet = new TreeSet(AbstractC1292YB.m2650I(C0741Nu.f2525J, C0741Nu.f2532c));
        AbstractC2708z8.m4637oI(m1928v(packageArchiveInfo.activities), treeSet);
        ServiceInfo[] serviceInfoArr = packageArchiveInfo.services;
        serviceInfoArr = serviceInfoArr == null ? new ServiceInfo[0] : serviceInfoArr;
        ArrayList arrayList2 = new ArrayList(serviceInfoArr.length);
        for (ServiceInfo serviceInfo : serviceInfoArr) {
            int i = serviceInfo.flags;
            if ((i & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if ((i & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    String str = applicationInfo2.processName;
                    m1927h = AbstractC2441tz.m4195W(str == null ? applicationInfo2.packageName : str, "_zygote");
                } else {
                    if (Build.VERSION.SDK_INT >= 29) {
                        m1927h2 = m1927h(serviceInfo) + ":" + serviceInfo.name;
                    } else {
                        m1927h2 = m1927h(serviceInfo);
                    }
                    c1071u5 = m1929z(m1927h2, "isolated");
                    arrayList2.add(c1071u5);
                }
            } else {
                m1927h = m1927h(serviceInfo);
            }
            c1071u5 = m1929z(m1927h, this.f2802S.packageName);
            arrayList2.add(c1071u5);
        }
        AbstractC2708z8.m4637oI(arrayList2, treeSet);
        AbstractC2708z8.m4637oI(m1928v(packageArchiveInfo.receivers), treeSet);
        AbstractC2708z8.m4637oI(m1928v(packageArchiveInfo.providers), treeSet);
        c1239x8 = treeSet;
        this.f2803q = c1239x8;
    }

    /* renamed from: h */
    public static String m1927h(ComponentInfo componentInfo) {
        String str = componentInfo.processName;
        if (str == null) {
            str = componentInfo.applicationInfo.processName;
        }
        return str == null ? componentInfo.applicationInfo.packageName : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f2799k.compare(this, (C0826PP) obj);
    }

    /* renamed from: v */
    public final ArrayList m1928v(ComponentInfo[] componentInfoArr) {
        if (componentInfoArr == null) {
            componentInfoArr = new ComponentInfo[0];
        }
        ArrayList arrayList = new ArrayList(componentInfoArr.length);
        for (ComponentInfo componentInfo : componentInfoArr) {
            arrayList.add(m1929z(m1927h(componentInfo), this.f2802S.packageName));
        }
        return arrayList;
    }

    /* renamed from: z */
    public final C1071U5 m1929z(String str, String str2) {
        boolean z;
        ArrayList arrayList = this.f2801R;
        boolean z2 = false;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1242XB c1242xb = (C1242XB) it.next();
                if (AbstractC1292YB.m2695u(c1242xb.f4032h, str) && AbstractC1292YB.m2695u(c1242xb.f4033z, str2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        return new C1071U5(str, str2, z2);
    }
}
