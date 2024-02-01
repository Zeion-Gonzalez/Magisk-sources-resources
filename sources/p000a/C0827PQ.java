package p000a;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: a.PQ */
/* loaded from: classes.dex */
public final class C0827PQ {

    /* renamed from: Q */
    public static final Class[] f2805Q = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: N */
    public final C0475Iy f2806N;

    /* renamed from: P */
    public final LinkedHashMap f2807P;

    /* renamed from: h */
    public final LinkedHashMap f2808h;

    /* renamed from: v */
    public final LinkedHashMap f2809v;

    /* renamed from: z */
    public final LinkedHashMap f2810z;

    public C0827PQ() {
        this.f2810z = new LinkedHashMap();
        this.f2808h = new LinkedHashMap();
        this.f2809v = new LinkedHashMap();
        this.f2807P = new LinkedHashMap();
        this.f2806N = new C0475Iy(this, 1);
    }

    /* renamed from: z */
    public static Bundle m1930z(C0827PQ c0827pq) {
        C1112Up c1112Up;
        Iterator it = AbstractC0873QM.m2013dG(c0827pq.f2808h).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = c0827pq.f2810z;
            boolean z = true;
            if (hasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Bundle mo1153z = ((InterfaceC0924RO) entry.getValue()).mo1153z();
                if (mo1153z != null) {
                    Class[] clsArr = f2805Q;
                    int i = 0;
                    while (true) {
                        if (i < 29) {
                            if (clsArr[i].isInstance(mo1153z)) {
                                break;
                            }
                            i++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (z) {
                    Object obj = c0827pq.f2809v.get(str);
                    if (obj instanceof C1112Up) {
                        c1112Up = (C1112Up) obj;
                    } else {
                        c1112Up = null;
                    }
                    if (c1112Up != null) {
                        c1112Up.mo2290G(mo1153z);
                    } else {
                        linkedHashMap.put(str, mo1153z);
                    }
                    InterfaceC0101Bz interfaceC0101Bz = (InterfaceC0101Bz) c0827pq.f2807P.get(str);
                    if (interfaceC0101Bz != null) {
                        ((C1277Xw) interfaceC0101Bz).m2607u(mo1153z);
                    }
                } else {
                    throw new IllegalArgumentException("Can't put value with type " + mo1153z.getClass() + " into saved state");
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str2 : keySet) {
                    arrayList.add(str2);
                    arrayList2.add(linkedHashMap.get(str2));
                }
                return AbstractC1843ih.m3422Q(new C0084Bc("keys", arrayList), new C0084Bc("values", arrayList2));
            }
        }
    }

    public C0827PQ(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2810z = linkedHashMap;
        this.f2808h = new LinkedHashMap();
        this.f2809v = new LinkedHashMap();
        this.f2807P = new LinkedHashMap();
        this.f2806N = new C0475Iy(this, 0);
        linkedHashMap.putAll(hashMap);
    }
}
