package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: a.ST */
/* loaded from: classes.dex */
public abstract class AbstractC0985ST {

    /* renamed from: z */
    public static final ThreadLocal f3319z = new ThreadLocal();

    /* renamed from: h */
    public static final WeakHashMap f3317h = new WeakHashMap(0);

    /* renamed from: v */
    public static final Object f3318v = new Object();

    /* renamed from: h */
    public static Typeface m2159h(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m2160v(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        if (r19 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r19 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        r19.m4630U8(-3);
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m2160v(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, p000a.AbstractC2703z2 r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0985ST.m2160v(android.content.Context, int, android.util.TypedValue, int, a.z2, boolean, boolean):android.graphics.Typeface");
    }

    /* renamed from: z */
    public static void m2161z(C2008lm c2008lm, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3318v) {
            WeakHashMap weakHashMap = f3317h;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(c2008lm);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(c2008lm, sparseArray);
            }
            sparseArray.append(i, new C1537cz(colorStateList, c2008lm.f6235z.getConfiguration(), theme));
        }
    }
}
