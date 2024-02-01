package p000a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: a.XM */
/* loaded from: classes.dex */
public abstract class AbstractC1250XM {

    /* renamed from: z */
    public static final Class[] f4058z = {Context.class, AttributeSet.class};

    /* renamed from: h */
    public static final String[] f4056h = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: v */
    public static final C2698yx f4057v = new C2698yx();

    /* renamed from: z */
    public static View m2555z(Context context, String str, AttributeSet attributeSet, String str2) {
        String concat;
        C2698yx c2698yx = f4057v;
        Constructor constructor = (Constructor) c2698yx.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4058z);
            c2698yx.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(context, attributeSet);
    }
}
