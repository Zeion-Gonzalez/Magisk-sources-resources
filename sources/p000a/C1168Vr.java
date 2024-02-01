package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a.Vr */
/* loaded from: classes.dex */
public final class C1168Vr extends ViewGroup.MarginLayoutParams {

    /* renamed from: G */
    public int f3802G;

    /* renamed from: I */
    public boolean f3803I;

    /* renamed from: M */
    public View f3804M;

    /* renamed from: N */
    public final int f3805N;

    /* renamed from: P */
    public int f3806P;

    /* renamed from: Q */
    public final int f3807Q;

    /* renamed from: R */
    public boolean f3808R;

    /* renamed from: S */
    public boolean f3809S;

    /* renamed from: V */
    public View f3810V;

    /* renamed from: W */
    public int f3811W;

    /* renamed from: h */
    public boolean f3812h;

    /* renamed from: o */
    public int f3813o;

    /* renamed from: q */
    public final Rect f3814q;

    /* renamed from: u */
    public int f3815u;

    /* renamed from: v */
    public final int f3816v;

    /* renamed from: w */
    public boolean f3817w;

    /* renamed from: z */
    public AbstractC1131VA f3818z;

    public C1168Vr() {
        super(-2, -2);
        this.f3812h = false;
        this.f3816v = 0;
        this.f3806P = 0;
        this.f3805N = -1;
        this.f3807Q = -1;
        this.f3815u = 0;
        this.f3813o = 0;
        this.f3814q = new Rect();
    }

    /* renamed from: h */
    public final void m2393h(AbstractC1131VA abstractC1131VA) {
        AbstractC1131VA abstractC1131VA2 = this.f3818z;
        if (abstractC1131VA2 != abstractC1131VA) {
            if (abstractC1131VA2 != null) {
                abstractC1131VA2.mo2317Q();
            }
            this.f3818z = abstractC1131VA;
            this.f3812h = true;
            if (abstractC1131VA != null) {
                abstractC1131VA.mo2326v(this);
            }
        }
    }

    /* renamed from: z */
    public final boolean m2394z(int i) {
        if (i == 0) {
            return this.f3808R;
        }
        if (i != 1) {
            return false;
        }
        return this.f3817w;
    }

    public C1168Vr(C1168Vr c1168Vr) {
        super((ViewGroup.MarginLayoutParams) c1168Vr);
        this.f3812h = false;
        this.f3816v = 0;
        this.f3806P = 0;
        this.f3805N = -1;
        this.f3807Q = -1;
        this.f3815u = 0;
        this.f3813o = 0;
        this.f3814q = new Rect();
    }

    public C1168Vr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC1131VA abstractC1131VA;
        this.f3812h = false;
        this.f3816v = 0;
        this.f3806P = 0;
        this.f3805N = -1;
        this.f3807Q = -1;
        this.f3815u = 0;
        this.f3813o = 0;
        this.f3814q = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1963kw.f6086h);
        this.f3816v = obtainStyledAttributes.getInteger(0, 0);
        this.f3807Q = obtainStyledAttributes.getResourceId(1, -1);
        this.f3806P = obtainStyledAttributes.getInteger(2, 0);
        this.f3805N = obtainStyledAttributes.getInteger(6, -1);
        this.f3815u = obtainStyledAttributes.getInt(5, 0);
        this.f3813o = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f3812h = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f8895p;
            if (TextUtils.isEmpty(string)) {
                abstractC1131VA = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f8895p;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f8891L;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f8894j);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC1131VA = (AbstractC1131VA) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC2441tz.m4200k("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f3818z = abstractC1131VA;
        }
        obtainStyledAttributes.recycle();
        AbstractC1131VA abstractC1131VA2 = this.f3818z;
        if (abstractC1131VA2 != null) {
            abstractC1131VA2.mo2326v(this);
        }
    }

    public C1168Vr(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3812h = false;
        this.f3816v = 0;
        this.f3806P = 0;
        this.f3805N = -1;
        this.f3807Q = -1;
        this.f3815u = 0;
        this.f3813o = 0;
        this.f3814q = new Rect();
    }

    public C1168Vr(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3812h = false;
        this.f3816v = 0;
        this.f3806P = 0;
        this.f3805N = -1;
        this.f3807Q = -1;
        this.f3815u = 0;
        this.f3813o = 0;
        this.f3814q = new Rect();
    }
}
