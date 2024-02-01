package p000a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.topjohnwu.magisk.R;
import java.lang.reflect.Constructor;

/* renamed from: a.up */
/* loaded from: classes.dex */
public class C2484up {

    /* renamed from: z */
    public final Object[] f7617z = new Object[2];

    /* renamed from: h */
    public static final Class[] f7613h = {Context.class, AttributeSet.class};

    /* renamed from: v */
    public static final int[] f7616v = {16843375};

    /* renamed from: P */
    public static final int[] f7611P = {16844160};

    /* renamed from: N */
    public static final int[] f7610N = {16844156};

    /* renamed from: Q */
    public static final int[] f7612Q = {16844148};

    /* renamed from: u */
    public static final String[] f7615u = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: o */
    public static final C2698yx f7614o = new C2698yx();

    /* renamed from: N */
    public C0610LT mo4270N(Context context, AttributeSet attributeSet) {
        return new C0610LT(context, attributeSet);
    }

    /* renamed from: P */
    public C0851Pt mo4271P(Context context, AttributeSet attributeSet) {
        return new C0851Pt(context, attributeSet);
    }

    /* renamed from: Q */
    public final View m4272Q(Context context, String str, String str2) {
        String concat;
        C2698yx c2698yx = f7614o;
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f7613h);
            c2698yx.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f7617z);
    }

    /* renamed from: h */
    public C2413tS mo4273h(Context context, AttributeSet attributeSet) {
        return new C2413tS(context, attributeSet, R.attr.buttonStyle);
    }

    /* renamed from: v */
    public C1707g5 mo4274v(Context context, AttributeSet attributeSet) {
        return new C1707g5(context, attributeSet, R.attr.checkboxStyle);
    }

    /* renamed from: z */
    public C2492uy mo4275z(Context context, AttributeSet attributeSet) {
        return new C2492uy(context, attributeSet);
    }
}
