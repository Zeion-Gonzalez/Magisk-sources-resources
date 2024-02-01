package p000a;

import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: a.vZ */
/* loaded from: classes.dex */
public final class C2528vZ {

    /* renamed from: z */
    public final Map f7742z;

    public C2528vZ(int i) {
        if (i == 1) {
            this.f7742z = new LinkedHashMap();
            return;
        }
        if (i == 2) {
            this.f7742z = new HashMap(3);
        } else if (i != 4) {
            this.f7742z = new HashMap();
        } else {
            this.f7742z = new HashMap(3);
        }
    }

    /* renamed from: h */
    public final void m4364h(Class cls, C1011Sz c1011Sz) {
        this.f7742z.put(cls, c1011Sz);
    }

    /* renamed from: z */
    public final void m4365z(C2526vX... c2526vXArr) {
        for (C2526vX c2526vX : c2526vXArr) {
            c2526vX.getClass();
            Map map = this.f7742z;
            Object obj = map.get(1);
            if (obj == null) {
                obj = new TreeMap();
                map.put(1, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(2)) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(2) + " with " + c2526vX);
            }
            treeMap.put(2, c2526vX);
        }
    }

    public C2528vZ(Map map) {
        this.f7742z = map;
    }
}
