package p000a;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: a.LZ */
/* loaded from: classes.dex */
public abstract class AbstractC0615LZ {

    /* renamed from: P */
    public static final boolean f2016P;

    /* renamed from: h */
    public static final Method f2017h;

    /* renamed from: v */
    public static final Method f2018v;

    /* renamed from: z */
    public static final Method f2019z;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f2019z = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f2017h = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f2018v = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f2016P = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
