package p000a;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.kB */
/* loaded from: classes.dex */
public final class C1924kB {

    /* renamed from: P */
    public static final ArrayList f5984P = new ArrayList();

    /* renamed from: z */
    public WeakHashMap f5987z = null;

    /* renamed from: h */
    public SparseArray f5985h = null;

    /* renamed from: v */
    public WeakReference f5986v = null;

    /* renamed from: h */
    public static void m3548h(View view) {
        int size;
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return;
        }
        AbstractC2441tz.m4202q(arrayList.get(size));
        throw null;
    }

    /* renamed from: z */
    public final View m3549z(View view) {
        View m3549z;
        WeakHashMap weakHashMap = this.f5987z;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    m3549z = m3549z(viewGroup.getChildAt(childCount));
                }
            } while (m3549z == null);
            return m3549z;
        }
        m3548h(view);
        return null;
    }
}
