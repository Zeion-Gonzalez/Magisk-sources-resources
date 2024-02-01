package p000a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.core.data.SuLogDatabase;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: a.Op */
/* loaded from: classes.dex */
public abstract class AbstractC0795Op {

    /* renamed from: E */
    public static final /* synthetic */ int f2698E = 0;

    /* renamed from: G */
    public static final C0518Jl f2699G;

    /* renamed from: U */
    public static boolean f2707U = true;

    /* renamed from: h */
    public static boolean f2711h;

    /* renamed from: v */
    public static C1015T2 f2717v;

    /* renamed from: w */
    public static final C2424tg f2718w;

    /* renamed from: z */
    public static final C1996lX[] f2720z = new C1996lX[1];

    /* renamed from: P */
    public static final C0175DP f2703P = new C0175DP(1, "CLOSED");

    /* renamed from: N */
    public static final String[] f2702N = new String[0];

    /* renamed from: Q */
    public static final C0543KE f2704Q = new C0543KE("image-destination");

    /* renamed from: u */
    public static final C0543KE f2716u = new C0543KE("image-replacement-text-is-link");

    /* renamed from: o */
    public static final C0543KE f2713o = new C0543KE("image-size");

    /* renamed from: W */
    public static final C0175DP f2709W = new C0175DP(1, "CONDITION_FALSE");

    /* renamed from: M */
    public static final C2424tg f2701M = new C2424tg(1);

    /* renamed from: V */
    public static final C2424tg f2708V = new C2424tg(2);

    /* renamed from: S */
    public static final C2424tg f2706S = new C2424tg(3);

    /* renamed from: R */
    public static final C2424tg f2705R = new C2424tg(4);

    /* renamed from: I */
    public static final C2424tg f2700I = new C2424tg(6);

    /* renamed from: q */
    public static final C2424tg f2714q = new C2424tg(7);

    /* renamed from: k */
    public static final C2424tg f2712k = new C2424tg(8);

    /* renamed from: g */
    public static final C2424tg f2710g = new C2424tg(0);

    /* renamed from: y */
    public static final int[] f2719y = {R.attr.colorPrimary};

    /* renamed from: s */
    public static final int[] f2715s = {R.attr.colorPrimaryVariant};

    static {
        int i = 5;
        f2699G = new C0518Jl(i);
        f2718w = new C2424tg(i);
    }

    /* renamed from: B */
    public static void m1801B(InterfaceC2374sf interfaceC2374sf, int i) {
        C1336Z2 mo1714v;
        synchronized (interfaceC2374sf) {
            mo1714v = interfaceC2374sf.mo1714v();
        }
        if (mo1714v == null) {
            return;
        }
        mo1714v.mo920P(interfaceC2374sf, i, null);
    }

    /* renamed from: BO */
    public static TimeInterpolator m1802BO(Context context, int i, Interpolator interpolator) {
        boolean z;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!m1822O(valueOf, "cubic-bezier") && !m1822O(valueOf, "path")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (m1822O(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        return AbstractC0463Il.m1124h(m1809F(0, split), m1809F(1, split), m1809F(2, split), m1809F(3, split));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                }
                if (m1822O(valueOf, "path")) {
                    return AbstractC0463Il.m1125v(AbstractC1843ih.m3448k(valueOf.substring(5, valueOf.length() - 1)));
                }
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    /* renamed from: BX */
    public static final void m1803BX(RecyclerView recyclerView) {
        C0329GJ c0329gj;
        AbstractC0408Hk abstractC0408Hk = recyclerView.f9124r;
        if (abstractC0408Hk != null) {
            C0641M3 c0641m3 = new C0641M3(recyclerView, 1);
            abstractC0408Hk.f1376z.registerObserver(c0641m3);
            recyclerView.setTag(R.id.recyclerScrollListener, c0641m3);
            c0329gj = C0329GJ.f1115z;
        } else {
            c0329gj = null;
        }
        if (c0329gj == null) {
            AbstractC1110Un.f3614z.postDelayed(new RunnableC0308Fs(15, new C1407aQ(8, recyclerView)), 1000L);
        }
    }

    /* renamed from: C */
    public static String m1804C(int i, int[] iArr, int[] iArr2, String[] strArr) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: D */
    public static C2709z9 m1805D(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m1826Q(context, attributeSet, i, i2);
        m1862o(context, attributeSet, iArr, i, i2, iArr2);
        return new C2709z9(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: E */
    public static final Activity m1806E(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        throw new IllegalStateException("View is not attached to activity".toString());
    }

    /* renamed from: EC */
    public static boolean m1807EC(Context context, int i, boolean z) {
        TypedValue m1858n0 = m1858n0(context, i);
        return (m1858n0 == null || m1858n0.type != 18) ? z : m1858n0.data != 0;
    }

    /* renamed from: EQ */
    public static final void m1808EQ(BufferedInputStream bufferedInputStream, File file) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return;
                }
                if (nextEntry.getName().startsWith("META-INF/com/google/android") && !nextEntry.isDirectory()) {
                    File file2 = new File(file, nextEntry.getName().substring(AbstractC1269Xn.m2589j5(nextEntry.getName(), '/', 0, 6) + 1));
                    File parentFile = file2.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        AbstractC0438II.m999I(zipInputStream, fileOutputStream);
                        AbstractC1292YB.m2659R(fileOutputStream, null);
                    } finally {
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: F */
    public static float m1809F(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: G */
    public static Type m1810G(Type type) {
        if (Collection.class.isAssignableFrom(Collection.class)) {
            Type m2386Q = AbstractC1167Vq.m2386Q(type, Collection.class, AbstractC1167Vq.m2391v(type, Collection.class, Collection.class), new LinkedHashSet());
            if (m2386Q instanceof WildcardType) {
                m2386Q = ((WildcardType) m2386Q).getUpperBounds()[0];
            }
            if (m2386Q instanceof ParameterizedType) {
                return ((ParameterizedType) m2386Q).getActualTypeArguments()[0];
            }
            return Object.class;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: G5 */
    public static void m1811G5(View view, C2281qz c2281qz) {
        boolean z;
        C1445b5 c1445b5 = c2281qz.f7021S.f4607h;
        if (c1445b5 != null && c1445b5.f4525z) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                f += AbstractC1548d9.m3005W((View) parent);
            }
            C1480br c1480br = c2281qz.f7021S;
            if (c1480br.f4603S != f) {
                c1480br.f4603S = f;
                c2281qz.m3938k();
            }
        }
    }

    /* renamed from: H */
    public static ColorStateList m1812H(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList m1999h;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (m1999h = AbstractC0865QC.m1999h(context, resourceId)) != null) {
            return m1999h;
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: HL */
    public static int m1813HL(AbstractC0932RY abstractC0932RY, String str, int i, int i2) {
        int mo2102x = abstractC0932RY.mo2102x();
        if (mo2102x < i || mo2102x > i2) {
            throw new C1237X6(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(mo2102x), abstractC0932RY.m2101od()));
        }
        return mo2102x;
    }

    /* renamed from: Ha */
    public static final void m1814Ha(View view, boolean z) {
        m1819Lq(view, !z);
    }

    /* renamed from: I */
    public static float m1815I(float f, float f2, float f3, float f4) {
        double d = 0.0f - f;
        double d2 = 0.0f - f2;
        float hypot = (float) Math.hypot(d, d2);
        double d3 = f3 - f;
        float hypot2 = (float) Math.hypot(d3, d2);
        double d4 = f4 - f2;
        float hypot3 = (float) Math.hypot(d3, d4);
        float hypot4 = (float) Math.hypot(d, d4);
        if (hypot <= hypot2 || hypot <= hypot3 || hypot <= hypot4) {
            if (hypot2 > hypot3 && hypot2 > hypot4) {
                return hypot2;
            }
            if (hypot3 > hypot4) {
                return hypot3;
            }
            return hypot4;
        }
        return hypot;
    }

    /* renamed from: J */
    public static int m1816J(View view, int i) {
        Context context = view.getContext();
        TypedValue m1851he = m1851he(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = m1851he.resourceId;
        if (i2 != 0) {
            Object obj = AbstractC0865QC.f2950z;
            return AbstractC1375Zj.m2772z(context, i2);
        }
        return m1851he.data;
    }

    /* renamed from: K */
    public static TypedArray m1817K(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m1826Q(context, attributeSet, i, i2);
        m1862o(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: L */
    public static boolean m1818L(int i) {
        boolean z;
        double pow;
        double pow2;
        double pow3;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC0106C4.f396z;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d = red / 255.0d;
                if (d < 0.04045d) {
                    pow = d / 12.92d;
                } else {
                    pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
                }
                double d2 = green / 255.0d;
                if (d2 < 0.04045d) {
                    pow2 = d2 / 12.92d;
                } else {
                    pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = blue / 255.0d;
                if (d3 < 0.04045d) {
                    pow3 = d3 / 12.92d;
                } else {
                    pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                z = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d4;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d4 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: Lq */
    public static final void m1819Lq(View view, boolean z) {
        view.setVisibility(z ? 8 : 0);
    }

    /* renamed from: M */
    public static ImageView.ScaleType m1820M(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: N */
    public static final void m1821N(View view) {
        Iterator it = new C1228Wy(3, new C2238qB(view, null)).iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            C0787Of c0787Of = (C0787Of) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c0787Of == null) {
                c0787Of = new C0787Of();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c0787Of);
            }
            ArrayList arrayList = c0787Of.f2653z;
            int m2642C = AbstractC1292YB.m2642C(arrayList);
            if (-1 < m2642C) {
                AbstractC2441tz.m4202q(arrayList.get(m2642C));
                throw null;
            }
        }
    }

    /* renamed from: O */
    public static boolean m1822O(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: O4 */
    public static final void m1823O4(TextView textView, AbstractC2222pt abstractC2222pt) {
        textView.setText(abstractC2222pt.mo1433z(textView.getContext().getResources()));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002f  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1824P(p000a.C0434IE r5, p000a.InterfaceC1171Vv r6) {
        /*
            boolean r0 = r6 instanceof p000a.C1024TC
            if (r0 == 0) goto L13
            r0 = r6
            a.TC r0 = (p000a.C1024TC) r0
            int r1 = r0.f3425q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3425q = r1
            goto L18
        L13:
            a.TC r0 = new a.TC
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3424I
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f3425q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000a.AbstractC1292YB.m2664UZ(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p000a.AbstractC1292YB.m2664UZ(r6)
            a.Bp r6 = p000a.AbstractC0037Al.f178h
            a.eT r2 = new a.eT
            r4 = 0
            r2.<init>(r5, r4)
            r0.f3425q = r3
            java.lang.Object r6 = p000a.AbstractC0438II.m1021ZH(r6, r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0795Op.m1824P(a.IE, a.Vv):java.lang.Object");
    }

    /* renamed from: Pm */
    public static void m1825Pm(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        boolean m257z = AbstractC0129CU.m257z(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (m257z || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(m257z);
        checkableImageButton.f9381k = m257z;
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        AbstractC2397t8.m4123g(checkableImageButton, i);
    }

    /* renamed from: Q */
    public static void m1826Q(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2937i, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m1834W(context, f2715s, "Theme.MaterialComponents");
            }
        }
        m1834W(context, f2719y, "Theme.AppCompat");
    }

    /* renamed from: R */
    public static C1665fK m1827R() {
        return new C1665fK(0);
    }

    /* renamed from: S */
    public static AbstractC1500cH m1828S(int i) {
        if (i != 0) {
            if (i != 1) {
                return new C2073n1();
            }
            return new C2284r1();
        }
        return new C2073n1();
    }

    /* renamed from: T */
    public static int m1829T(int i, int i2, float f) {
        return AbstractC0106C4.m228h(AbstractC0106C4.m229v(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* renamed from: U */
    public static void m1830U(ExecutorService executorService, InterfaceC0636Lz interfaceC0636Lz) {
        C1996lX m1868r = m1868r();
        if (m1868r != null) {
            if (executorService == null) {
                interfaceC0636Lz.mo765v(m1868r);
                return;
            } else {
                executorService.execute(new RunnableC1547d8(interfaceC0636Lz, 14, m1868r));
                return;
            }
        }
        AbstractC0017AI.f108S.execute(new RunnableC1547d8(executorService, 13, interfaceC0636Lz));
    }

    /* renamed from: U8 */
    public static int m1831U8(Context context, int i, int i2) {
        TypedValue m1858n0 = m1858n0(context, i);
        if (m1858n0 != null && m1858n0.type == 16) {
            return m1858n0.data;
        }
        return i2;
    }

    /* renamed from: UZ */
    public static void m1832UZ(InterfaceC2374sf interfaceC2374sf, AbstractC1965ky abstractC1965ky) {
        C1336Z2 mo1714v;
        synchronized (interfaceC2374sf) {
            mo1714v = interfaceC2374sf.mo1714v();
        }
        if (mo1714v == null) {
            return;
        }
        mo1714v.m923u(abstractC1965ky);
    }

    /* renamed from: V */
    public static AnimatorSet m1833V(InterfaceC1944kb interfaceC1944kb, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC1944kb, C1527cp.f4719z, C1867jA.f5836h, new C2716zG(f, f2, f3));
        CircularRevealCardView circularRevealCardView = (CircularRevealCardView) interfaceC1944kb;
        C2716zG m5050v = circularRevealCardView.m5050v();
        if (m5050v == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(circularRevealCardView, (int) f, (int) f2, m5050v.f8547v, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    /* renamed from: W */
    public static void m1834W(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i++;
            } else {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            }
        }
        if (z) {
        } else {
            throw new IllegalArgumentException(AbstractC2441tz.m4184G("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* renamed from: X */
    public static final String m1835X(ApplicationInfo applicationInfo, PackageManager packageManager) {
        try {
            if (applicationInfo.labelRes > 0) {
                Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
                Configuration configuration = new Configuration();
                configuration.setLocale(AbstractC1685fh.f5274z);
                resourcesForApplication.updateConfiguration(configuration, resourcesForApplication.getDisplayMetrics());
                return resourcesForApplication.getString(applicationInfo.labelRes);
            }
        } catch (Throwable unused) {
        }
        return applicationInfo.loadLabel(packageManager).toString();
    }

    /* renamed from: Y */
    public static int m1836Y(Context context, int i, int i2) {
        TypedValue m1858n0 = m1858n0(context, i);
        if (m1858n0 != null) {
            int i3 = m1858n0.resourceId;
            if (i3 != 0) {
                Object obj = AbstractC0865QC.f2950z;
                return AbstractC1375Zj.m2772z(context, i3);
            }
            return m1858n0.data;
        }
        return i2;
    }

    /* renamed from: Yd */
    public static C1424ak m1837Yd(C1212We c1212We, String str) {
        return new C1424ak(str, "", false);
    }

    /* renamed from: Z */
    public static final PackageInfo m1838Z(PackageManager packageManager, int i, int i2) {
        String str;
        InterfaceC0431IA interfaceC0431IA;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid != null) {
            if (packagesForUid.length > 1) {
                if (i2 <= 0) {
                    return null;
                }
                C0346Gc.f1163P.getClass();
                ServiceConnectionC2132oD.f6572S.m3756z();
                interfaceC0431IA = C0346Gc.f1165u;
                if (interfaceC0431IA != null) {
                    runningAppProcessInfo = interfaceC0431IA.mo969f(i2);
                } else {
                    runningAppProcessInfo = null;
                }
                if (runningAppProcessInfo == null) {
                    if (i == 2000) {
                        str = "com.android.shell";
                    }
                    return null;
                }
                if (i == runningAppProcessInfo.uid) {
                    str = runningAppProcessInfo.pkgList[0];
                }
                return null;
            }
            if (packagesForUid.length == 1) {
                str = packagesForUid[0];
            } else {
                throw new PackageManager.NameNotFoundException();
            }
            return packageManager.getPackageInfo(str, 8192);
        }
        throw new PackageManager.NameNotFoundException();
    }

    /* renamed from: ZH */
    public static synchronized void m1839ZH(C1996lX c1996lX) {
        synchronized (AbstractC0795Op.class) {
            if (f2711h) {
                C1996lX[] c1996lXArr = f2720z;
                synchronized (c1996lXArr) {
                    c1996lXArr[0] = c1996lX;
                }
            }
        }
    }

    /* renamed from: b */
    public static C1803hx m1840b(C1212We c1212We, String str, boolean z) {
        return new C1803hx(str, z, false);
    }

    /* renamed from: c */
    public static ColorStateList m1841c(Context context, C2709z9 c2709z9, int i) {
        int m4646W;
        ColorStateList m1999h;
        if (c2709z9.m4645V(i) && (m4646W = c2709z9.m4646W(i, 0)) != 0 && (m1999h = AbstractC0865QC.m1999h(context, m4646W)) != null) {
            return m1999h;
        }
        return c2709z9.m4647h(i);
    }

    /* renamed from: d */
    public static boolean m1842d(View view) {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC0095Bq.m199P(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d2 */
    public static final void m1843d2(TextView textView, boolean z) {
        textView.setPaintFlags(z ? textView.getPaintFlags() | 16 : textView.getPaintFlags() & (-17));
    }

    /* renamed from: d3 */
    public static void m1844d3(InterfaceC2068mx interfaceC2068mx) {
        interfaceC2068mx.mo3692y().f8088q.m4843N(interfaceC2068mx, new C1104Uh(2, new C0036Ak(0, interfaceC2068mx)));
        C1910jw c1910jw = C1910jw.f5967z;
        C1910jw.f5953I.m4843N(interfaceC2068mx, new C1104Uh(2, new C0036Ak(1, interfaceC2068mx.mo3692y())));
    }

    /* renamed from: dG */
    public static void m1845dG(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: dx */
    public static final void m1846dx(RecyclerView recyclerView, List list, SparseArray sparseArray) {
        C2371sc c2371sc;
        if (list != null) {
            AbstractC0408Hk abstractC0408Hk = recyclerView.f9124r;
            if (abstractC0408Hk instanceof C2371sc) {
                c2371sc = (C2371sc) abstractC0408Hk;
            } else {
                c2371sc = null;
            }
            if (c2371sc == null || c2371sc.f7290P != list || c2371sc.f7289N != sparseArray) {
                recyclerView.m4939n0(new C2371sc(list, sparseArray));
            }
        }
    }

    /* renamed from: e */
    public static Drawable m1847e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m3431X;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m3431X = AbstractC1843ih.m3431X(context, resourceId)) == null) ? typedArray.getDrawable(i) : m3431X;
    }

    /* renamed from: f */
    public static final Bitmap m1848f(Context context, int i) {
        Drawable background;
        Drawable foreground;
        Drawable m3431X = AbstractC1843ih.m3431X(context, i);
        if (m3431X instanceof BitmapDrawable) {
            return ((BitmapDrawable) m3431X).getBitmap();
        }
        if (Build.VERSION.SDK_INT >= 26 && AbstractC1354ZL.m2745u(m3431X)) {
            background = AbstractC1354ZL.m2747z(m3431X).getBackground();
            foreground = AbstractC1354ZL.m2747z(m3431X).getForeground();
            m3431X = new LayerDrawable(new Drawable[]{background, foreground});
        }
        Bitmap createBitmap = Bitmap.createBitmap(m3431X.getIntrinsicWidth(), m3431X.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        m3431X.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        m3431X.draw(canvas);
        return createBitmap;
    }

    /* renamed from: g */
    public static final Object m1849g(SuLogDatabase suLogDatabase, Callable callable, InterfaceC1171Vv interfaceC1171Vv) {
        if (suLogDatabase.m3186V() && suLogDatabase.m3187W()) {
            return callable.call();
        }
        AbstractC2441tz.m4207w(interfaceC1171Vv.mo315N().mo107y(AbstractC1059Ts.f3482S));
        Map map = suLogDatabase.f5276M;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            ExecutorC0571Ki executorC0571Ki = suLogDatabase.f5285v;
            if (executorC0571Ki == null) {
                executorC0571Ki = null;
            }
            obj = new C1343Z9(executorC0571Ki);
            map.put("TransactionDispatcher", obj);
        }
        return AbstractC0438II.m1021ZH((AbstractC1859j1) obj, new C1038TU(callable, null), interfaceC1171Vv);
    }

    /* renamed from: h */
    public static void m1850h(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                AbstractC0235ET.m478o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                AbstractC0235ET.m478o(drawable, colorStateList);
            }
            if (mode != null) {
                AbstractC0235ET.m476W(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: he */
    public static TypedValue m1851he(Context context, int i, String str) {
        TypedValue m1858n0 = m1858n0(context, i);
        if (m1858n0 != null) {
            return m1858n0;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: i */
    public static boolean m1852i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: j */
    public static Class m1853j(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m1853j(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m1853j(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: k */
    public static boolean m1854k(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m1854k(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m1854k(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C0047Ax ? ((C0047Ax) parameterizedType).f199v : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C0047Ax ? ((C0047Ax) parameterizedType2).f199v : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m1854k(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m1854k(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: l */
    public static void m1855l(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    /* renamed from: m */
    public static PorterDuff.Mode m1856m(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: n */
    public static final boolean m1857n() {
        C1910jw c1910jw = C1910jw.f5967z;
        if (C1910jw.f5962h != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public static TypedValue m1858n0(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: nB */
    public static final void m1859nB(ViewGroup viewGroup) {
        C0597LB c0597lb = new C0597LB();
        c0597lb.mo1373Z(new C2174oz());
        c0597lb.mo1371X(400L);
        c0597lb.mo1381q();
        AbstractC2299rI.m3956z(viewGroup, c0597lb);
    }

    /* renamed from: nP */
    public static C0504JX m1861nP(C1212We c1212We, String str, int i) {
        return new C0504JX(i, str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x001a, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L44;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m1862o(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = p000a.AbstractC0863Q8.f2937i
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r9.length
            r3 = -1
            if (r1 != 0) goto L1d
            int r4 = r0.getResourceId(r2, r3)
            if (r4 == r3) goto L38
            goto L37
        L1d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L23:
            if (r6 >= r5) goto L34
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r3)
            if (r7 != r3) goto L31
            r4.recycle()
            goto L38
        L31:
            int r6 = r6 + 1
            goto L23
        L34:
            r4.recycle()
        L37:
            r2 = 1
        L38:
            r0.recycle()
            if (r2 == 0) goto L3e
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0795Op.m1862o(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: oI */
    public static final void m1863oI(Button button, int i) {
        Drawable drawable;
        MaterialButton materialButton = (MaterialButton) button;
        if (i != 0) {
            drawable = AbstractC1843ih.m3431X(materialButton.getContext(), i);
        } else {
            drawable = null;
        }
        if (materialButton.f9296s != drawable) {
            materialButton.f9296s = drawable;
            materialButton.m5023G(true);
            materialButton.m5024M(materialButton.getMeasuredWidth(), materialButton.getMeasuredHeight());
        }
    }

    /* renamed from: od */
    public static final void m1864od(String str) {
        if (AbstractC1292YB.m2695u(str, "recovery")) {
            AbstractC0017AI.m44z("/system/bin/input keyevent 26").m4631d2(null);
        }
        AbstractC0017AI.m44z("/system/bin/svc power reboot " + str + " || /system/bin/reboot " + str).m4631d2(null);
    }

    /* renamed from: p */
    public static final String m1865p(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "0");
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: q */
    public static void m1866q(View view, InterfaceC0148Cs interfaceC0148Cs) {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC1548d9.m3014s(view, new C2062mr(interfaceC0148Cs, new C2402tF(AbstractC0095Bq.m200Q(view), view.getPaddingTop(), AbstractC0095Bq.m198N(view), view.getPaddingBottom())));
        if (AbstractC1285Y3.m2633h(view)) {
            AbstractC1589dw.m3064v(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0544KF(1));
        }
    }

    /* renamed from: qn */
    public static C1158Vg m1867qn(C1212We c1212We, String str, int i) {
        return new C1158Vg(i, str, false);
    }

    /* renamed from: r */
    public static C1996lX m1868r() {
        C1996lX c1996lX;
        C1996lX[] c1996lXArr = f2720z;
        synchronized (c1996lXArr) {
            c1996lX = c1996lXArr[0];
            if (c1996lX != null && c1996lX.f6179R < 0) {
                c1996lXArr[0] = null;
            }
        }
        return c1996lX;
    }

    /* renamed from: s */
    public static synchronized C1996lX m1869s() {
        C1996lX m1868r;
        synchronized (AbstractC0795Op.class) {
            m1868r = m1868r();
            if (m1868r == null) {
                f2711h = true;
                if (f2717v == null) {
                    f2717v = new C1015T2();
                }
                m1868r = f2717v.m2195z();
                f2711h = false;
            }
        }
        return m1868r;
    }

    /* renamed from: t */
    public static Typeface m1870t(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, AbstractC2575wW.m4408Q(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    /* renamed from: tJ */
    public static final void m1871tJ(final Context context, final int i, final int i2) {
        AbstractC1110Un.m2289z(new Runnable() { // from class: a.I9
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(context, i, i2).show();
            }
        });
    }

    /* renamed from: u */
    public static final void m1872u(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: v */
    public static void m1873v(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: w */
    public static C2716zG m1874w(CircularRevealCardView circularRevealCardView, boolean z) {
        float measuredWidth = circularRevealCardView.getMeasuredWidth() / 2.0f;
        float measuredHeight = (circularRevealCardView.getMeasuredHeight() / 2.0f) - circularRevealCardView.getPaddingBottom();
        return new C2716zG(measuredWidth, measuredHeight, z ? (float) Math.hypot(measuredWidth, measuredHeight) : 0.0f);
    }

    /* renamed from: x */
    public static boolean m1875x(InterfaceC0645M7 interfaceC0645M7, Object obj) {
        InterfaceC0645M7 interfaceC0645M72;
        if (interfaceC0645M7 == obj) {
            return true;
        }
        if (interfaceC0645M7 instanceof InterfaceC1631eg) {
            Object item = ((InterfaceC1631eg) interfaceC0645M7).getItem();
            obj = ((InterfaceC1631eg) obj).getItem();
            interfaceC0645M72 = item;
        } else {
            boolean z = interfaceC0645M7 instanceof Comparable;
            interfaceC0645M72 = interfaceC0645M7;
            if (z) {
                return AbstractC1292YB.m2690q((Comparable) interfaceC0645M7, (Comparable) obj) == 0;
            }
        }
        return AbstractC1292YB.m2695u(interfaceC0645M72, obj);
    }

    /* renamed from: y */
    public static final Object m1876y(AbstractC2025m7 abstractC2025m7, long j, InterfaceC0559KW interfaceC0559KW) {
        boolean z;
        while (true) {
            if (abstractC2025m7.f6289w >= j && !abstractC2025m7.mo3386v()) {
                return abstractC2025m7;
            }
            Object obj = AbstractC1834iX.f5734S.get(abstractC2025m7);
            C0175DP c0175dp = f2703P;
            if (obj == c0175dp) {
                return c0175dp;
            }
            AbstractC2025m7 abstractC2025m72 = (AbstractC2025m7) ((AbstractC1834iX) obj);
            if (abstractC2025m72 == null) {
                abstractC2025m72 = (AbstractC2025m7) interfaceC0559KW.mo51o(Long.valueOf(abstractC2025m7.f6289w + 1), abstractC2025m7);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC1834iX.f5734S;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2025m7, null, abstractC2025m72)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(abstractC2025m7) != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    if (abstractC2025m7.mo3386v()) {
                        abstractC2025m7.m3384P();
                    }
                }
            }
            abstractC2025m7 = abstractC2025m72;
        }
    }

    /* renamed from: yF */
    public static void m1877yF(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f2707U) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f2707U = false;
            }
        }
    }

    /* renamed from: z */
    public static void m1878z(InterfaceC2374sf interfaceC2374sf, AbstractC1965ky abstractC1965ky) {
        C1336Z2 mo1714v;
        synchronized (interfaceC2374sf) {
            mo1714v = interfaceC2374sf.mo1714v();
            if (mo1714v == null) {
                mo1714v = new C1336Z2();
                interfaceC2374sf.mo1712o(mo1714v);
            }
        }
        mo1714v.m925z(abstractC1965ky);
    }

    /* renamed from: zx */
    public static void m1879zx(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            AbstractC0235ET.m478o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }
}
