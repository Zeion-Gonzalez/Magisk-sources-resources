package p000a;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.p001ui.MainActivity;
import com.topjohnwu.magisk.p001ui.flash.FlashFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.AD */
/* loaded from: classes.dex */
public final class C0012AD extends AbstractC0164DB {
    public static final Parcelable.Creator<C0012AD> CREATOR = new C2327rm(18);

    /* renamed from: I */
    public final C1146VR f98I = new C1146VR(new C1407aQ(7, this));

    /* renamed from: R */
    public final EnumC0340GV f99R;

    /* renamed from: S */
    public final C0907R6 f100S;

    /* renamed from: w */
    public final int f101w;

    public C0012AD(C0907R6 c0907r6, EnumC0340GV enumC0340GV, int i) {
        this.f100S = c0907r6;
        this.f99R = enumC0340GV;
        this.f101w = i;
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: N */
    public final int mo33N() {
        return this.f101w;
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: P */
    public final Uri mo34P() {
        return (Uri) this.f98I.getValue();
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: W */
    public final PendingIntent mo35W(ContextWrapper contextWrapper) {
        int i;
        int i2;
        int i3;
        int i4 = FlashFragment.f9600he;
        Uri mo34P = mo34P();
        C1203WU c1203wu = new C1203WU(contextWrapper);
        c1203wu.f3914v = new C0186Db(contextWrapper, new C1233X2()).m371h(R.navigation.main);
        c1203wu.m2486h();
        ComponentName m1728h = AbstractC0756O8.m1728h(MainActivity.class, contextWrapper.getPackageName());
        Intent intent = (Intent) c1203wu.f3913h;
        intent.setComponent(m1728h);
        List<C1606eE> list = (List) c1203wu.f3912P;
        list.clear();
        list.add(new C1606eE(null));
        if (((C1951kj) c1203wu.f3914v) != null) {
            c1203wu.m2486h();
        }
        Bundle bundle = new Bundle();
        bundle.putString("action", "flash");
        if (Parcelable.class.isAssignableFrom(Uri.class)) {
            bundle.putParcelable("additional_data", mo34P);
        } else if (Serializable.class.isAssignableFrom(Uri.class)) {
            bundle.putSerializable("additional_data", (Serializable) mo34P);
        }
        c1203wu.f3911N = bundle;
        intent.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        Bundle bundle2 = (Bundle) c1203wu.f3911N;
        if (bundle2 != null) {
            Iterator<String> it = bundle2.keySet().iterator();
            i = 0;
            while (it.hasNext()) {
                Object obj = bundle2.get(it.next());
                int i5 = i * 31;
                if (obj != null) {
                    i3 = obj.hashCode();
                } else {
                    i3 = 0;
                }
                i = i5 + i3;
            }
        } else {
            i = 0;
        }
        for (C1606eE c1606eE : list) {
            i = (i * 31) + c1606eE.f4925z;
            Bundle bundle3 = c1606eE.f4924h;
            if (bundle3 != null) {
                Iterator<String> it2 = bundle3.keySet().iterator();
                while (it2.hasNext()) {
                    Object obj2 = bundle3.get(it2.next());
                    int i6 = i * 31;
                    if (obj2 != null) {
                        i2 = obj2.hashCode();
                    } else {
                        i2 = 0;
                    }
                    i = i6 + i2;
                }
            }
        }
        if (((C1951kj) c1203wu.f3914v) != null) {
            if ((!list.isEmpty()) != false) {
                ArrayList arrayList = new ArrayList();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                Iterator it3 = list.iterator();
                C1420ag c1420ag = null;
                while (true) {
                    boolean hasNext = it3.hasNext();
                    Object obj3 = c1203wu.f3915z;
                    if (hasNext) {
                        C1606eE c1606eE2 = (C1606eE) it3.next();
                        int i7 = c1606eE2.f4925z;
                        C1420ag m2487z = c1203wu.m2487z(i7);
                        if (m2487z != null) {
                            for (int i8 : m2487z.m2847P(c1420ag)) {
                                arrayList.add(Integer.valueOf(i8));
                                arrayList2.add(c1606eE2.f4924h);
                            }
                            c1420ag = m2487z;
                        } else {
                            int i9 = C1420ag.f4446U;
                            throw new IllegalArgumentException("Navigation destination " + C1665fK.m3149V((Context) obj3, i7) + " cannot be found in the navigation graph " + ((C1951kj) c1203wu.f3914v));
                        }
                    } else {
                        intent.putExtra("android-support-nav:controller:deepLinkIds", AbstractC2486us.m4286W9(arrayList));
                        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                        Context context = (Context) obj3;
                        ArrayList arrayList3 = new ArrayList();
                        Intent intent2 = new Intent(intent);
                        ComponentName component = intent2.getComponent();
                        if (component == null) {
                            component = intent2.resolveActivity(context.getPackageManager());
                        }
                        if (component != null) {
                            int size = arrayList3.size();
                            while (true) {
                                try {
                                    Intent m3456p = AbstractC1843ih.m3456p(context, component);
                                    if (m3456p == null) {
                                        break;
                                    }
                                    arrayList3.add(size, m3456p);
                                    component = m3456p.getComponent();
                                } catch (PackageManager.NameNotFoundException e) {
                                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                    throw new IllegalArgumentException(e);
                                }
                            }
                        }
                        arrayList3.add(intent2);
                        int size2 = arrayList3.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            Intent intent3 = (Intent) arrayList3.get(i10);
                            if (intent3 != null) {
                                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            Intent[] intentArr = (Intent[]) arrayList3.toArray(new Intent[0]);
                            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                            return AbstractC0159D5.m323z(context, i, intentArr, 201326592, null);
                        }
                        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                    }
                }
            } else {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
            }
        } else {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: h */
    public final boolean mo36h() {
        return this.f99R == EnumC0340GV.f1150S;
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: o */
    public final String mo37o() {
        return this.f100S.f3112q;
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: u */
    public final String mo38u() {
        StringBuilder sb = new StringBuilder();
        C0907R6 c0907r6 = this.f100S;
        sb.append(c0907r6.f3109R);
        sb.append("-");
        sb.append(c0907r6.f3113w);
        sb.append("(");
        sb.append(c0907r6.f3108I);
        sb.append(").zip");
        return AbstractC1269Xn.m2588hs(AbstractC1269Xn.m2588hs(AbstractC1269Xn.m2588hs(AbstractC1269Xn.m2588hs(AbstractC1269Xn.m2588hs(AbstractC1269Xn.m2588hs(AbstractC1269Xn.m2588hs(AbstractC1269Xn.m2588hs(AbstractC1269Xn.m2588hs(AbstractC1269Xn.m2588hs(sb.toString(), " ", "_"), "'", ""), "\"", ""), "$", ""), "`", ""), "*", ""), "/", "_"), "#", ""), "@", ""), "\\", "_");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f100S.writeToParcel(parcel, i);
        parcel.writeString(this.f99R.name());
        parcel.writeInt(this.f101w);
    }
}
