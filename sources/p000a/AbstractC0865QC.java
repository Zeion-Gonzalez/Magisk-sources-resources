package p000a;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;

/* renamed from: a.QC */
/* loaded from: classes.dex */
public abstract class AbstractC0865QC {

    /* renamed from: z */
    public static final Object f2950z = new Object();

    /* renamed from: h */
    public static ColorStateList m1999h(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1537cz c1537cz;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C2008lm c2008lm = new C2008lm(resources, theme);
        synchronized (AbstractC0985ST.f3318v) {
            SparseArray sparseArray = (SparseArray) AbstractC0985ST.f3317h.get(c2008lm);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (c1537cz = (C1537cz) sparseArray.get(i)) != null) {
                if (c1537cz.f4761h.equals(resources.getConfiguration()) && ((theme == null && c1537cz.f4762v == 0) || (theme != null && c1537cz.f4762v == theme.hashCode()))) {
                    colorStateList2 = c1537cz.f4763z;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal threadLocal = AbstractC0985ST.f3319z;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z = true;
            resources.getValue(i, typedValue, true);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                z = false;
            }
            if (!z) {
                try {
                    colorStateList = AbstractC0379HE.m869z(resources, resources.getXml(i), theme);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList != null) {
                AbstractC0985ST.m2161z(c2008lm, i, colorStateList, theme);
                return colorStateList;
            }
            return AbstractC0031Ad.m75h(resources, i, theme);
        }
        return colorStateList2;
    }

    /* renamed from: z */
    public static int m2000z(Context context, String str) {
        boolean z;
        if (str != null) {
            int i = Build.VERSION.SDK_INT;
            if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                C2193pJ c2193pJ = new C2193pJ(context);
                if (i >= 24) {
                    z = AbstractC1314Yc.m2709z(c2193pJ.f6750z);
                } else {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String packageName = context.getApplicationContext().getPackageName();
                    int i2 = applicationInfo.uid;
                    try {
                        Class<?> cls = Class.forName(AppOpsManager.class.getName());
                        Class<?> cls2 = Integer.TYPE;
                        if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() != 0) {
                            z = false;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                    }
                    z = true;
                }
                if (z) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }
}
