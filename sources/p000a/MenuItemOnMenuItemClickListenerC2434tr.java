package p000a;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: a.tr */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC2434tr implements MenuItem.OnMenuItemClickListener {

    /* renamed from: v */
    public static final Class[] f7460v = {MenuItem.class};

    /* renamed from: h */
    public final Method f7461h;

    /* renamed from: z */
    public final Object f7462z;

    public MenuItemOnMenuItemClickListenerC2434tr(String str, Object obj) {
        this.f7462z = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f7461h = cls.getMethod(str, f7460v);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f7461h;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f7462z;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
