package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* renamed from: a.z9 */
/* loaded from: classes.dex */
public final class C2709z9 {

    /* renamed from: h */
    public final Object f8534h;

    /* renamed from: v */
    public Object f8535v;

    /* renamed from: z */
    public final Object f8536z;

    public C2709z9() {
        this.f8536z = null;
        this.f8534h = null;
        this.f8535v = null;
        m4638R();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f8536z = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f8534h = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f8535v = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* renamed from: R */
    public static void m4638R() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* renamed from: S */
    public static C2709z9 m4639S(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C2709z9(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* renamed from: G */
    public final String m4640G(int i) {
        return ((TypedArray) this.f8534h).getString(i);
    }

    /* renamed from: M */
    public final CharSequence m4641M(int i) {
        return ((TypedArray) this.f8534h).getText(i);
    }

    /* renamed from: N */
    public final Drawable m4642N(int i) {
        int resourceId;
        Object obj = this.f8534h;
        return (!((TypedArray) obj).hasValue(i) || (resourceId = ((TypedArray) obj).getResourceId(i, 0)) == 0) ? ((TypedArray) obj).getDrawable(i) : AbstractC1843ih.m3431X((Context) this.f8536z, resourceId);
    }

    /* renamed from: P */
    public final int m4643P(int i, int i2) {
        return ((TypedArray) this.f8534h).getDimensionPixelSize(i, i2);
    }

    /* renamed from: Q */
    public final Drawable m4644Q(int i) {
        int resourceId;
        Drawable m1769u;
        if (((TypedArray) this.f8534h).hasValue(i) && (resourceId = ((TypedArray) this.f8534h).getResourceId(i, 0)) != 0) {
            C1982lH m3597z = C1982lH.m3597z();
            Context context = (Context) this.f8536z;
            synchronized (m3597z) {
                m1769u = m3597z.f6151z.m1769u(context, resourceId, true);
            }
            return m1769u;
        }
        return null;
    }

    /* renamed from: V */
    public final boolean m4645V(int i) {
        return ((TypedArray) this.f8534h).hasValue(i);
    }

    /* renamed from: W */
    public final int m4646W(int i, int i2) {
        return ((TypedArray) this.f8534h).getResourceId(i, i2);
    }

    /* renamed from: h */
    public final ColorStateList m4647h(int i) {
        int resourceId;
        ColorStateList m1999h;
        Object obj = this.f8534h;
        if (((TypedArray) obj).hasValue(i) && (resourceId = ((TypedArray) obj).getResourceId(i, 0)) != 0 && (m1999h = AbstractC0865QC.m1999h((Context) this.f8536z, resourceId)) != null) {
            return m1999h;
        }
        return ((TypedArray) obj).getColorStateList(i);
    }

    /* renamed from: o */
    public final int m4648o(int i, int i2) {
        return ((TypedArray) this.f8534h).getInt(i, i2);
    }

    /* renamed from: u */
    public final Typeface m4649u(int i, int i2, C0355Go c0355Go) {
        int resourceId = ((TypedArray) this.f8534h).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f8535v) == null) {
            this.f8535v = new TypedValue();
        }
        Context context = (Context) this.f8536z;
        TypedValue typedValue = (TypedValue) this.f8535v;
        ThreadLocal threadLocal = AbstractC0985ST.f3319z;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0985ST.m2160v(context, resourceId, typedValue, i2, c0355Go, true, false);
    }

    /* renamed from: v */
    public final int m4650v(int i, int i2) {
        return ((TypedArray) this.f8534h).getDimensionPixelOffset(i, i2);
    }

    /* renamed from: w */
    public final void m4651w() {
        ((TypedArray) this.f8534h).recycle();
    }

    /* renamed from: z */
    public final boolean m4652z(int i, boolean z) {
        return ((TypedArray) this.f8534h).getBoolean(i, z);
    }

    public C2709z9(Context context, TypedArray typedArray) {
        this.f8536z = context;
        this.f8534h = typedArray;
    }
}
