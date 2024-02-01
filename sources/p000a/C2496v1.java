package p000a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: a.v1 */
/* loaded from: classes.dex */
public final class C2496v1 implements Comparator {

    /* renamed from: z */
    public final /* synthetic */ int f7633z;

    public /* synthetic */ C2496v1(int i) {
        this.f7633z = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        switch (this.f7633z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m4327z((View) obj, (View) obj2);
            case 1:
                return ((C1595e1) obj).f4899z - ((C1595e1) obj2).f4899z;
            case 2:
                C1935kO c1935kO = (C1935kO) obj;
                C1935kO c1935kO2 = (C1935kO) obj2;
                RecyclerView recyclerView = c1935kO.f6005P;
                if (recyclerView == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (c1935kO2.f6005P == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    if (recyclerView != null) {
                        return -1;
                    }
                } else {
                    boolean z3 = c1935kO.f6008z;
                    if (z3 != c1935kO2.f6008z) {
                        if (z3) {
                            return -1;
                        }
                    } else {
                        int i = c1935kO2.f6006h - c1935kO.f6006h;
                        if (i == 0) {
                            int i2 = c1935kO.f6007v - c1935kO2.f6007v;
                            if (i2 == 0) {
                                return 0;
                            }
                            return i2;
                        }
                        return i;
                    }
                }
                return 1;
            case 3:
                return m4327z((View) obj, (View) obj2);
            case 4:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 5:
                String str = ((C1195WL) obj).f3897w;
                Locale locale = Locale.ROOT;
                return AbstractC1292YB.m2690q(str.toLowerCase(locale), ((C1195WL) obj2).f3897w.toLowerCase(locale));
            default:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                int min = Math.min(str2.length(), str3.length());
                int i3 = 4;
                while (true) {
                    if (i3 < min) {
                        char charAt = str2.charAt(i3);
                        char charAt2 = str3.charAt(i3);
                        if (charAt != charAt2) {
                            if (AbstractC1292YB.m2696w(charAt, charAt2) < 0) {
                                return -1;
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        int length = str2.length();
                        int length2 = str3.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    }
                }
                return 1;
        }
    }

    /* renamed from: z */
    public final int m4327z(View view, View view2) {
        switch (this.f7633z) {
            case AbstractC0795Op.f2698E /* 0 */:
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                float m3002S = AbstractC1548d9.m3002S(view);
                float m3002S2 = AbstractC1548d9.m3002S(view2);
                if (m3002S > m3002S2) {
                    return -1;
                }
                if (m3002S < m3002S2) {
                    return 1;
                }
                return 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }
}
