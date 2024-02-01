package p000a;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CompoundButton;
import androidx.activity.AbstractActivityC2754z;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.topjohnwu.magisk.R;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: a.wW */
/* loaded from: classes.dex */
public abstract class AbstractC2575wW {

    /* renamed from: E */
    public static boolean f7856E = false;

    /* renamed from: L */
    public static File f7862L = null;

    /* renamed from: N */
    public static Field f7864N = null;

    /* renamed from: O */
    public static long f7865O = 0;

    /* renamed from: P */
    public static boolean f7866P = false;

    /* renamed from: Q */
    public static boolean f7867Q = false;

    /* renamed from: U */
    public static final C0175DP f7870U;

    /* renamed from: Y */
    public static Field f7874Y = null;

    /* renamed from: f */
    public static Method f7879f = null;

    /* renamed from: h */
    public static boolean f7881h = false;

    /* renamed from: i */
    public static Method f7882i = null;

    /* renamed from: n */
    public static Method f7885n = null;

    /* renamed from: o */
    public static boolean f7886o = false;

    /* renamed from: r */
    public static boolean f7889r = false;

    /* renamed from: s */
    public static final C0175DP f7890s;

    /* renamed from: u */
    public static Field f7891u;

    /* renamed from: v */
    public static Class f7892v;

    /* renamed from: z */
    public static Field f7895z;

    /* renamed from: W */
    public static final float[][] f7872W = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: G */
    public static final float[][] f7858G = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: M */
    public static final float[] f7863M = {95.047f, 100.0f, 108.883f};

    /* renamed from: V */
    public static final float[][] f7871V = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: S */
    public static final C0944Rl f7869S = new C0944Rl();

    /* renamed from: R */
    public static final C0543KE f7868R = new C0543KE("list-item-type");

    /* renamed from: w */
    public static final C0543KE f7893w = new C0543KE("bullet-list-item-level");

    /* renamed from: I */
    public static final C0543KE f7860I = new C0543KE("ordered-list-item-number");

    /* renamed from: q */
    public static final C0543KE f7888q = new C0543KE("heading-level");

    /* renamed from: k */
    public static final C0543KE f7884k = new C0543KE("link-destination");

    /* renamed from: g */
    public static final C0543KE f7880g = new C0543KE("paragraph-is-in-tight-list");

    /* renamed from: y */
    public static final C0543KE f7894y = new C0543KE("code-block-info");

    /* renamed from: J */
    public static final int[] f7861J = {16842752, R.attr.theme};

    /* renamed from: c */
    public static final int[] f7876c = {R.attr.materialThemeOverlay};

    /* renamed from: H */
    public static final boolean[] f7859H = new boolean[3];

    /* renamed from: e */
    public static final byte[] f7878e = {48, 49, 53, 0};

    /* renamed from: X */
    public static final byte[] f7873X = {48, 49, 48, 0};

    /* renamed from: F */
    public static final byte[] f7857F = {48, 48, 57, 0};

    /* renamed from: Z */
    public static final byte[] f7875Z = {48, 48, 53, 0};

    /* renamed from: C */
    public static final byte[] f7855C = {48, 48, 49, 0};

    /* renamed from: p */
    public static final byte[] f7887p = {48, 48, 49, 0};

    /* renamed from: j */
    public static final byte[] f7883j = {48, 48, 50, 0};

    /* renamed from: d */
    public static final Type[] f7877d = new Type[0];

    static {
        int i = 1;
        f7890s = new C0175DP(i, "UNDEFINED");
        f7870U = new C0175DP(i, "REUSABLE_CLAIMED");
    }

    /* renamed from: B */
    public static float m4386B(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: BO */
    public static int m4387BO(InputStream inputStream) {
        return (int) m4413U8(inputStream, 2);
    }

    /* renamed from: BX */
    public static void m4388BX(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: C */
    public static Type m4389C(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: D */
    public static IllegalArgumentException m4390D(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    /* renamed from: E */
    public static void m4391E(Object obj) {
        LongSparseArray longSparseArray;
        if (!f7866P) {
            try {
                f7892v = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f7866P = true;
        }
        Class cls = f7892v;
        if (cls == null) {
            return;
        }
        if (!f7867Q) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f7864N = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f7867Q = true;
        }
        Field field = f7864N;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            AbstractC1362ZU.m2756z(longSparseArray);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0039, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0040, code lost:
    
        if (r3 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0042, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x004d, code lost:
    
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0054, code lost:
    
        if (r2.isEmpty() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0056, code lost:
    
        android.util.Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0060, code lost:
    
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0063, code lost:
    
        return r2;
     */
    /* renamed from: EC */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m4392EC(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            r7 = 1
            if (r6 == r7) goto L40
            r7 = 3
            if (r6 != r7) goto L27
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r8 <= r5) goto L40
        L27:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L2d
            goto L17
        L2d:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L40:
            if (r3 == 0) goto L50
        L42:
            r3.close()     // Catch: java.io.IOException -> L50
            goto L50
        L46:
            r9 = move-exception
            goto L64
        L48:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L50
            goto L42
        L50:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L60
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L63
        L60:
            r9.deleteFile(r0)
        L63:
            return r2
        L64:
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.io.IOException -> L69
        L69:
            throw r9
        L6a:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2575wW.m4392EC(android.content.Context):java.lang.String");
    }

    /* renamed from: F */
    public static String m4393F(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (m4404O(xmlResourceParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: G */
    public static int m4394G(C0496JN c0496jn, AbstractC0265F4 abstractC0265F4, View view, View view2, AbstractC0667Md abstractC0667Md, boolean z, boolean z2) {
        if (abstractC0667Md.m1513U() == 0 || c0496jn.m1190h() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c0496jn.m1190h() - Math.max(AbstractC0667Md.m1483F(view), AbstractC0667Md.m1483F(view2))) - 1) : Math.max(0, Math.min(AbstractC0667Md.m1483F(view), AbstractC0667Md.m1483F(view2)));
        if (z) {
            return Math.round((max * (Math.abs(abstractC0265F4.mo570h(view2) - abstractC0265F4.mo566P(view)) / (Math.abs(AbstractC0667Md.m1483F(view) - AbstractC0667Md.m1483F(view2)) + 1))) + (abstractC0265F4.mo571o() - abstractC0265F4.mo566P(view)));
        }
        return max;
    }

    /* renamed from: G5 */
    public static AbstractC1593e m4395G5(C1281Y c1281y, String str) {
        if (str.length() != 0 && str.charAt(0) == '#') {
            try {
                int length = (str.length() - 1) / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i != length; i++) {
                    int i2 = (i * 2) + 1;
                    char charAt = str.charAt(i2);
                    bArr[i] = (byte) (AbstractC1843ih.m3464w(str.charAt(i2 + 1)) | (AbstractC1843ih.m3464w(charAt) << 4));
                }
                return AbstractC1593e.m3067q(bArr);
            } catch (IOException unused) {
                throw new C0367H("can't recode value for oid " + c1281y.f4116S);
            }
        }
        if (str.length() != 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        if (!c1281y.m3068I(C0516Jj.f1717l) && !c1281y.m3068I(C0516Jj.f1716b)) {
            if (c1281y.m3068I(C0516Jj.f1713D)) {
                return new C1702g(str);
            }
            if (!c1281y.m3068I(C0516Jj.f1721t) && !c1281y.m3068I(C0516Jj.f1712B) && !c1281y.m3068I(C0516Jj.f1714K) && !c1281y.m3068I(C0516Jj.f1718m)) {
                return new C2303rM(str);
            }
            return new C0194Dj(str);
        }
        return new C2732zZ(str);
    }

    /* renamed from: H */
    public static C2382so m4396H(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C2382so c2382so;
        if (m4404O(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C2382so((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c2382so = C2382so.m4101z(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c2382so = null;
            }
            if (c2382so != null) {
                return c2382so;
            }
        }
        return new C2382so((Shader) null, (ColorStateList) null, 0);
    }

    /* renamed from: Ha */
    public static void m4397Ha(CompoundButton compoundButton, C0590L1 c0590l1, InterfaceC0432IC interfaceC0432IC) {
        if (interfaceC0432IC == null) {
            compoundButton.setOnCheckedChangeListener(c0590l1);
        } else {
            compoundButton.setOnCheckedChangeListener(new C0338GT(c0590l1, interfaceC0432IC));
        }
    }

    /* renamed from: I */
    public static Keyframe m4398I(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: J */
    public static Icon m4399J(Context context, int i) {
        Icon createWithAdaptiveBitmap;
        if (!AbstractC0795Op.m1857n()) {
            return Icon.createWithResource(context, i);
        }
        int i2 = Build.VERSION.SDK_INT;
        Bitmap m1848f = AbstractC0795Op.m1848f(context, i);
        if (i2 < 26) {
            return Icon.createWithBitmap(m1848f);
        }
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(m1848f);
        return createWithAdaptiveBitmap;
    }

    /* renamed from: K */
    public static ValueAnimator m4400K(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        TypedArray m4422b = m4422b(resources, theme, attributeSet, AbstractC1843ih.f5756o);
        TypedArray m4422b2 = m4422b(resources, theme, attributeSet, AbstractC1843ih.f5752V);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long m4417X = m4417X(m4422b, xmlResourceParser, "duration", 1, 300);
        int i = 0;
        long m4417X2 = m4417X(m4422b, xmlResourceParser, "startOffset", 2, 0);
        int m4417X3 = m4417X(m4422b, xmlResourceParser, "valueType", 7, 4);
        if (m4404O(xmlResourceParser, "valueFrom") && m4404O(xmlResourceParser, "valueTo")) {
            if (m4417X3 == 4) {
                TypedValue peekValue = m4422b.peekValue(5);
                boolean z = peekValue != null;
                int i2 = z ? peekValue.type : 0;
                TypedValue peekValue2 = m4422b.peekValue(6);
                boolean z2 = peekValue2 != null;
                m4417X3 = ((z && m4411T(i2)) || (z2 && m4411T(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder m4420Z = m4420Z(m4422b, m4417X3, 5, 6, "");
            if (m4420Z != null) {
                valueAnimator3.setValues(m4420Z);
            }
        }
        valueAnimator3.setDuration(m4417X);
        valueAnimator3.setStartDelay(m4417X2);
        valueAnimator3.setRepeatCount(m4417X(m4422b, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator3.setRepeatMode(m4417X(m4422b, xmlResourceParser, "repeatMode", 4, 1));
        if (m4422b2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String m4393F = m4393F(m4422b2, xmlResourceParser, "pathData", 1);
            if (m4393F != null) {
                String m4393F2 = m4393F(m4422b2, xmlResourceParser, "propertyXName", 2);
                String m4393F3 = m4393F(m4422b2, xmlResourceParser, "propertyYName", 3);
                if (m4393F2 == null && m4393F3 == null) {
                    throw new InflateException(m4422b2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path m3448k = AbstractC1843ih.m3448k(m4393F);
                PathMeasure pathMeasure = new PathMeasure(m3448k, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f = 0.0f;
                do {
                    f += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(m3448k, false);
                int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f2 = f / ((float) (min - 1));
                valueAnimator = valueAnimator3;
                typedArray = m4422b;
                int i3 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int i4 = min;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f3 += f2;
                    int i5 = i3 + 1;
                    if (i5 < arrayList.size() && f3 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i3 = i5;
                    }
                    i++;
                    min = i4;
                }
                PropertyValuesHolder ofFloat = m4393F2 != null ? PropertyValuesHolder.ofFloat(m4393F2, fArr) : null;
                PropertyValuesHolder ofFloat2 = m4393F3 != null ? PropertyValuesHolder.ofFloat(m4393F3, fArr2) : null;
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator2.setValues(ofFloat2);
                } else {
                    i = 0;
                    if (ofFloat2 == null) {
                        objectAnimator2.setValues(ofFloat);
                    } else {
                        objectAnimator2.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = m4422b;
                objectAnimator2.setPropertyName(m4393F(m4422b2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = m4422b;
        }
        if (m4404O(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            i = typedArray2.getResourceId(i, i);
        } else {
            typedArray2 = typedArray;
        }
        if (i > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, i));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (m4422b2 != null) {
            m4422b2.recycle();
        }
        return valueAnimator2;
    }

    /* renamed from: Lq */
    public static void m4401Lq(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    /* renamed from: M */
    public static int m4402M(C0496JN c0496jn, AbstractC0265F4 abstractC0265F4, View view, View view2, AbstractC0667Md abstractC0667Md, boolean z) {
        if (abstractC0667Md.m1513U() == 0 || c0496jn.m1190h() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0496jn.m1190h();
        }
        return (int) (((abstractC0265F4.mo570h(view2) - abstractC0265F4.mo566P(view)) / (Math.abs(AbstractC0667Md.m1483F(view) - AbstractC0667Md.m1483F(view2)) + 1)) * c0496jn.m1190h());
    }

    /* renamed from: N */
    public static void m4403N(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: O */
    public static boolean m4404O(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: O4 */
    public static String m4405O4(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: P */
    public static void m4406P(C1535cx c1535cx, C0457If c0457If, C1628ed c1628ed) {
        c1628ed.f5041R = -1;
        c1628ed.f5082w = -1;
        int i = c1535cx.f5030Ha[0];
        int[] iArr = c1628ed.f5030Ha;
        if (i != 2 && iArr[0] == 4) {
            C0287FS c0287fs = c1628ed.f5022C;
            int i2 = c0287fs.f998u;
            int m3098R = c1535cx.m3098R();
            C0287FS c0287fs2 = c1628ed.f5064j;
            int i3 = m3098R - c0287fs2.f998u;
            c0287fs.f995W = c0457If.m1102V(c0287fs);
            c0287fs2.f995W = c0457If.m1102V(c0287fs2);
            c0457If.m1098P(c0287fs.f995W, i2);
            c0457If.m1098P(c0287fs2.f995W, i3);
            c1628ed.f5041R = 2;
            c1628ed.f5054b = i2;
            int i4 = i3 - i2;
            c1628ed.f5033K = i4;
            int i5 = c1628ed.f5076qn;
            if (i4 < i5) {
                c1628ed.f5033K = i5;
            }
        }
        if (c1535cx.f5030Ha[1] != 2 && iArr[1] == 4) {
            C0287FS c0287fs3 = c1628ed.f5074p;
            int i6 = c0287fs3.f998u;
            int m3101V = c1535cx.m3101V();
            C0287FS c0287fs4 = c1628ed.f5034L;
            int i7 = m3101V - c0287fs4.f998u;
            c0287fs3.f995W = c0457If.m1102V(c0287fs3);
            c0287fs4.f995W = c0457If.m1102V(c0287fs4);
            c0457If.m1098P(c0287fs3.f995W, i6);
            c0457If.m1098P(c0287fs4.f995W, i7);
            if (c1628ed.f5051Yd > 0 || c1628ed.f5046UZ == 8) {
                C0287FS c0287fs5 = c1628ed.f5063i;
                C2598ww m1102V = c0457If.m1102V(c0287fs5);
                c0287fs5.f995W = m1102V;
                c0457If.m1098P(m1102V, c1628ed.f5051Yd + i6);
            }
            c1628ed.f5082w = 2;
            c1628ed.f5071nP = i6;
            int i8 = i7 - i6;
            c1628ed.f5023D = i8;
            int i9 = c1628ed.f5029HL;
            if (i8 < i9) {
                c1628ed.f5023D = i9;
            }
        }
    }

    /* renamed from: Pm */
    public static void m4407Pm(View view, ViewOnClickListenerC0574Kl viewOnClickListenerC0574Kl, boolean z) {
        view.setOnClickListener(viewOnClickListenerC0574Kl);
        view.setClickable(z);
    }

    /* renamed from: Q */
    public static int m4408Q(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:372:0x033a, code lost:
    
        if (r32 == null) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x033c, code lost:
    
        if (r13 == null) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x033e, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x034d, code lost:
    
        if (r2.hasNext() == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x034f, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x035b, code lost:
    
        if (r33 != 0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x035d, code lost:
    
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0361, code lost:
    
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0364, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0313  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator m4409R(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2575wW.m4409R(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* renamed from: S */
    public static boolean m4410S(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            m4454u(fileOutputStream);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m4454u(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m4454u(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* renamed from: T */
    public static boolean m4411T(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: U */
    public static boolean m4412U(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m4412U(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: U8 */
    public static long m4413U8(InputStream inputStream, int i) {
        byte[] m4414UZ = m4414UZ(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (m4414UZ[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: UZ */
    public static byte[] m4414UZ(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(AbstractC2441tz.m4188N("Not enough bytes to read: ", i));
            }
        }
        return bArr;
    }

    /* renamed from: V */
    public static boolean m4415V(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m4410S = m4410S(file, inputStream);
            m4454u(inputStream);
            return m4410S;
        } catch (Throwable th2) {
            th = th2;
            m4454u(inputStream);
            throw th;
        }
    }

    /* renamed from: W */
    public static int m4416W(C0496JN c0496jn, AbstractC0265F4 abstractC0265F4, View view, View view2, AbstractC0667Md abstractC0667Md, boolean z) {
        if (abstractC0667Md.m1513U() == 0 || c0496jn.m1190h() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC0667Md.m1483F(view) - AbstractC0667Md.m1483F(view2)) + 1;
        }
        return Math.min(abstractC0265F4.mo569W(), abstractC0265F4.mo570h(view2) - abstractC0265F4.mo566P(view));
    }

    /* renamed from: X */
    public static int m4417X(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m4404O(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: Y */
    public static final String m4418Y(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: Yd */
    public static IllegalArgumentException m4419Yd(Method method, int i, String str, Object... objArr) {
        return m4390D(method, null, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* renamed from: Z */
    public static PropertyValuesHolder m4420Z(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        int i4 = 1;
        boolean z = peekValue != null;
        int i5 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i6 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m4411T(i5)) || (z2 && m4411T(i6))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C1908ju c1908ju = i == 3 ? C1908ju.f5950z : null;
            if (z3) {
                if (z) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z) {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m4411T(i5) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m4411T(i6) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m4411T(i6) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder == null || c1908ju == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(c1908ju);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C1992lT[] m3457q = AbstractC1843ih.m3457q(string);
        C1992lT[] m3457q2 = AbstractC1843ih.m3457q(string2);
        if (m3457q == null && m3457q2 == null) {
            return null;
        }
        if (m3457q == null) {
            if (m3457q2 != null) {
                return PropertyValuesHolder.ofObject(str, new C2534vg(i4), m3457q2);
            }
            return null;
        }
        C2534vg c2534vg = new C2534vg(i4);
        if (m3457q2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, c2534vg, m3457q);
        } else {
            if (!AbstractC1843ih.m3462u(m3457q, m3457q2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, c2534vg, m3457q, m3457q2);
        }
        return ofObject;
    }

    /* renamed from: b */
    public static TypedArray m4422b(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: c */
    public static final LifecycleCoroutineScopeImpl m4423c(InterfaceC1546d7 interfaceC1546d7) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z;
        C0326GG mo1354C = interfaceC1546d7.mo1354C();
        while (true) {
            AtomicReference atomicReference = mo1354C.f2652z;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                break;
            }
            C2514vJ c2514vJ = new C2514vJ(null);
            C1080UE c1080ue = AbstractC0037Al.f179z;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(mo1354C, AbstractC0438II.m1002L(c2514vJ, ((C1557dI) AbstractC1342Z8.f4236z).f4814k));
            while (true) {
                if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                C1080UE c1080ue2 = AbstractC0037Al.f179z;
                AbstractC0438II.m994F(lifecycleCoroutineScopeImpl, ((C1557dI) AbstractC1342Z8.f4236z).f4814k, new C0701NE(lifecycleCoroutineScopeImpl, null), 2);
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    /* renamed from: d */
    public static final InterfaceC1725gU m4424d(AbstractC1952kk abstractC1952kk) {
        Object obj;
        HashMap hashMap = abstractC1952kk.f6049S;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = abstractC1952kk.f6049S.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        InterfaceC1725gU interfaceC1725gU = (InterfaceC1725gU) obj;
        if (interfaceC1725gU != null) {
            return interfaceC1725gU;
        }
        C2514vJ c2514vJ = new C2514vJ(null);
        C1080UE c1080ue = AbstractC0037Al.f179z;
        return (InterfaceC1725gU) abstractC1952kk.m3574u("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C2325rk(AbstractC0438II.m1002L(c2514vJ, ((C1557dI) AbstractC1342Z8.f4236z).f4814k)));
    }

    /* renamed from: d2 */
    public static final String m4425d2(InterfaceC1171Vv interfaceC1171Vv) {
        Object c1019t6;
        if (interfaceC1171Vv instanceof C2266qf) {
            return interfaceC1171Vv.toString();
        }
        try {
            c1019t6 = interfaceC1171Vv + '@' + m4418Y(interfaceC1171Vv);
        } catch (Throwable th) {
            c1019t6 = new C1019T6(th);
        }
        if (AbstractC2740zk.m4677z(c1019t6) != null) {
            c1019t6 = interfaceC1171Vv.getClass().getName() + '@' + m4418Y(interfaceC1171Vv);
        }
        return (String) c1019t6;
    }

    /* renamed from: d3 */
    public static void m4426d3(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: dG */
    public static final File m4427dG(Uri uri) {
        if (!AbstractC1292YB.m2695u(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: dx */
    public static final void m4428dx(InterfaceC1171Vv interfaceC1171Vv, Object obj, InterfaceC2364sT interfaceC2364sT) {
        Object c1663fI;
        boolean z;
        C1654f6 c1654f6;
        if (interfaceC1171Vv instanceof C2266qf) {
            C2266qf c2266qf = (C2266qf) interfaceC1171Vv;
            Throwable m4677z = AbstractC2740zk.m4677z(obj);
            boolean z2 = false;
            if (m4677z == null) {
                if (interfaceC2364sT != null) {
                    c1663fI = new C0372H6(obj, interfaceC2364sT);
                } else {
                    c1663fI = obj;
                }
            } else {
                c1663fI = new C1663fI(m4677z, false);
            }
            InterfaceC1171Vv interfaceC1171Vv2 = c2266qf.f6970q;
            c2266qf.mo315N();
            AbstractC1859j1 abstractC1859j1 = c2266qf.f6967I;
            if (abstractC1859j1.mo3030U8()) {
                c2266qf.f6969k = c1663fI;
                c2266qf.f2384w = 1;
                abstractC1859j1.mo195C(c2266qf.mo315N(), c2266qf);
                return;
            }
            AbstractC2738zi m2311z = AbstractC1129V8.m2311z();
            if (m2311z.f8589w >= 4294967296L) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c2266qf.f6969k = c1663fI;
                c2266qf.f2384w = 1;
                C1200WR c1200wr = m2311z.f8588q;
                if (c1200wr == null) {
                    c1200wr = new C1200WR();
                    m2311z.f8588q = c1200wr;
                }
                c1200wr.m2478N(c2266qf);
                return;
            }
            m2311z.m4672dx(true);
            try {
                InterfaceC1265Xh interfaceC1265Xh = (InterfaceC1265Xh) c2266qf.mo315N().mo107y(C1710g8.f5381k);
                if (interfaceC1265Xh != null && !interfaceC1265Xh.mo317h()) {
                    CancellationException m1741U = ((C0757O9) interfaceC1265Xh).m1741U();
                    c2266qf.mo1646h(c1663fI, m1741U);
                    c2266qf.mo320u(new C1019T6(m1741U));
                    z2 = true;
                }
                if (!z2) {
                    Object obj2 = c2266qf.f6968g;
                    InterfaceC1255XS mo315N = interfaceC1171Vv2.mo315N();
                    Object m2663U8 = AbstractC1292YB.m2663U8(mo315N, obj2);
                    if (m2663U8 != AbstractC1292YB.f4138S) {
                        c1654f6 = AbstractC1292YB.m2641BO(interfaceC1171Vv2, mo315N, m2663U8);
                    } else {
                        c1654f6 = null;
                    }
                    try {
                        interfaceC1171Vv2.mo320u(obj);
                        if (c1654f6 == null || c1654f6.m3127m()) {
                            AbstractC1292YB.m2682m(mo315N, m2663U8);
                        }
                    } catch (Throwable th) {
                        if (c1654f6 == null || c1654f6.m3127m()) {
                            AbstractC1292YB.m2682m(mo315N, m2663U8);
                        }
                        throw th;
                    }
                }
                do {
                } while (m2311z.m4671Lq());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC1171Vv.mo320u(obj);
    }

    /* renamed from: e */
    public static float m4429e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m4404O(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: f */
    public static File m4430f(ApplicationInfo applicationInfo) {
        if (f7862L == null) {
            File file = new File(Build.VERSION.SDK_INT >= 24 ? applicationInfo.deviceProtectedDataDir : applicationInfo.dataDir, "dyn");
            f7862L = file;
            file.mkdirs();
        }
        return f7862L;
    }

    /* renamed from: g */
    public static boolean m4431g(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        int indexOfKey;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C1924kB.f5984P;
            C1924kB c1924kB = (C1924kB) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (c1924kB == null) {
                c1924kB = new C1924kB();
                view.setTag(R.id.tag_unhandled_key_event_manager, c1924kB);
            }
            WeakReference weakReference2 = c1924kB.f5986v;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                c1924kB.f5986v = new WeakReference(keyEvent);
                if (c1924kB.f5985h == null) {
                    c1924kB.f5985h = new SparseArray();
                }
                SparseArray sparseArray = c1924kB.f5985h;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                } else {
                    weakReference = null;
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !AbstractC1285Y3.m2633h(view2)) {
                        return true;
                    }
                    C1924kB.m3548h(view2);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:509:0x00f1, code lost:
    
        if (r4.f993P == r13) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0271, code lost:
    
        if (r2.f993P == r8) goto L623;
     */
    /* JADX WARN: Removed duplicated region for block: B:503:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x0512 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:765:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:850:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:854:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x00fb A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m4432h(p000a.C1535cx r36, p000a.C0457If r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2575wW.m4432h(a.cx, a.If, java.util.ArrayList, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0043 A[LOOP:0: B:91:0x0000->B:113:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0042 A[SYNTHETIC] */
    /* renamed from: he */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m4433he(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2575wW.m4433he(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: i */
    public static File m4434i(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static Type m4435j(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m4433he(type, cls, m4450r(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public static boolean m4436k(Editable editable, KeyEvent keyEvent, boolean z) {
        boolean z2;
        AbstractC2435ts[] abstractC2435tsArr;
        if ((!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) != false) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && (abstractC2435tsArr = (AbstractC2435ts[]) editable.getSpans(selectionStart, selectionEnd, AbstractC2435ts.class)) != null && abstractC2435tsArr.length > 0) {
            for (AbstractC2435ts abstractC2435ts : abstractC2435tsArr) {
                int spanStart = editable.getSpanStart(null);
                int spanEnd = editable.getSpanEnd(null);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static MappedByteBuffer m4437l(Context context, Uri uri) {
        try {
            ParcelFileDescriptor m2458z = AbstractC1190WG.m2458z(context.getContentResolver(), uri, "r", null);
            if (m2458z == null) {
                if (m2458z != null) {
                    m2458z.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(m2458z.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    m2458z.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static final ArrayList m4438m(Map map, InterfaceC2364sT interfaceC2364sT) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C2419tZ c2419tZ = (C2419tZ) entry.getValue();
            if ((c2419tZ == null || c2419tZ.f7406h || c2419tZ.f7407v) ? false : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) interfaceC2364sT.mo85W((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static boolean m4439n(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m4439n(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m4439n(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x005b, code lost:
    
        if (r0.finished() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m4440n0(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L88
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L88
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L88
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L88
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L55:
            if (r4 != r9) goto L69
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            r8.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2575wW.m4440n0(java.io.FileInputStream, int, int):byte[]");
    }

    /* renamed from: nB */
    public static Context m4441nB(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7876c, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof C1143VN) && ((C1143VN) context).f3726z == resourceId) {
            z = true;
        } else {
            z = false;
        }
        if (resourceId != 0 && !z) {
            C1143VN c1143vn = new C1143VN(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f7861J);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                c1143vn.getTheme().applyStyle(resourceId2, true);
            }
            return c1143vn;
        }
        return context;
    }

    /* renamed from: nF */
    public static void m4442nF(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    /* renamed from: nP */
    public static void m4443nP(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* renamed from: o */
    public static byte[] m4444o(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: oI */
    public static void m4445oI(Context context) {
        List list;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intent;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder rank;
        ShortcutInfo build;
        ShortcutInfo.Builder shortLabel2;
        ShortcutInfo.Builder intent2;
        ShortcutInfo.Builder icon2;
        ShortcutInfo.Builder rank2;
        ShortcutInfo build2;
        if (Build.VERSION.SDK_INT >= 25) {
            Class m1584M = AbstractC0685My.m1584M();
            Object obj = AbstractC0865QC.f2950z;
            ShortcutManager m1582G = AbstractC0685My.m1582G(AbstractC1375Zj.m2770h(context, m1584M));
            if (m1582G == null) {
                return;
            }
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                list = C1239X8.f4021S;
            } else {
                ArrayList arrayList = new ArrayList();
                C1910jw c1910jw = C1910jw.f5967z;
                if (C1910jw.m3542v()) {
                    shortLabel2 = AbstractC0685My.m1603z(context).setShortLabel(context.getString(R.string.superuser));
                    intent2 = shortLabel2.setIntent(new Intent(launchIntentForPackage).putExtra("section", "superuser"));
                    icon2 = intent2.setIcon(m4399J(context, R.drawable.sc_superuser));
                    rank2 = icon2.setRank(0);
                    build2 = rank2.build();
                    arrayList.add(build2);
                }
                if (C1910jw.m3543z().f1382N) {
                    shortLabel = AbstractC0685My.m1593g(context).setShortLabel(context.getString(R.string.modules));
                    intent = shortLabel.setIntent(new Intent(launchIntentForPackage).putExtra("section", "modules"));
                    icon = intent.setIcon(m4399J(context, R.drawable.sc_extension));
                    rank = icon.setRank(1);
                    build = rank.build();
                    arrayList.add(build);
                }
                list = arrayList;
            }
            m1582G.setDynamicShortcuts(list);
        }
    }

    /* renamed from: od */
    public static final boolean m4446od(String str) {
        return (AbstractC1292YB.m2695u(str, "GET") || AbstractC1292YB.m2695u(str, "HEAD")) ? false : true;
    }

    /* renamed from: p */
    public static Class m4447p(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m4447p(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m4447p(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: q */
    public static File m4448q(Context context) {
        return new File(m4430f(context.getApplicationInfo()), "current.apk");
    }

    /* renamed from: qn */
    public static IllegalArgumentException m4449qn(Method method, Exception exc, int i, String str, Object... objArr) {
        return m4390D(method, exc, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* renamed from: r */
    public static Type m4450r(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m4450r(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m4450r(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: s */
    public static final boolean m4451s(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: t */
    public static boolean m4452t() {
        boolean isEnabled;
        try {
            if (f7885n == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f7885n == null) {
                f7865O = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f7885n = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f7885n.invoke(null, Long.valueOf(f7865O))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
            return false;
        }
    }

    /* renamed from: tJ */
    public static float m4453tJ() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* renamed from: u */
    public static void m4454u(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: v */
    public static boolean m4455v(C2043mV c2043mV, C2043mV c2043mV2) {
        boolean z;
        C0440IL[] c0440ilArr = (C0440IL[]) c2043mV.f6363I.clone();
        C0440IL[] c0440ilArr2 = (C0440IL[]) c2043mV2.f6363I.clone();
        if (c0440ilArr.length != c0440ilArr2.length) {
            return false;
        }
        boolean z2 = (c0440ilArr[0].m1059V() != null && c0440ilArr2[0].m1059V() != null) ? !c0440ilArr[0].m1059V().f7427S.m3068I(c0440ilArr2[0].m1059V().f7427S) : false;
        for (int i = 0; i != c0440ilArr.length; i++) {
            C0440IL c0440il = c0440ilArr[i];
            if (z2) {
                for (int length = c0440ilArr2.length - 1; length >= 0; length--) {
                    C0440IL c0440il2 = c0440ilArr2[length];
                    if (c0440il2 != null && m4460zx(c0440il, c0440il2)) {
                        c0440ilArr2[length] = null;
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                for (int i2 = 0; i2 != c0440ilArr2.length; i2++) {
                    C0440IL c0440il3 = c0440ilArr2[i2];
                    if (c0440il3 != null && m4460zx(c0440il, c0440il3)) {
                        c0440ilArr2[i2] = null;
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public static boolean m4456x(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m4457y(p000a.InterfaceC2680yc r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.mo2449P(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L64
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L64
            if (r8 == 0) goto L64
            boolean r1 = p000a.AbstractC2575wW.f7856E
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            p000a.AbstractC2575wW.f7879f = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            p000a.AbstractC2575wW.f7856E = r3
        L4c:
            java.lang.reflect.Method r1 = p000a.AbstractC2575wW.f7879f
            if (r1 == 0) goto L61
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L61
            r4[r0] = r10     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L5b
            goto L61
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L61
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r0 == 0) goto L64
            goto L80
        L64:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = p000a.AbstractC2446u3.m4223h(r7, r10)
            if (r8 == 0) goto L76
            goto L80
        L76:
            if (r7 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L80:
            return r3
        L81:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = p000a.AbstractC2575wW.f7889r
            if (r7 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L98
            p000a.AbstractC2575wW.f7874Y = r7     // Catch: java.lang.NoSuchFieldException -> L98
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            p000a.AbstractC2575wW.f7889r = r3
        L9a:
            java.lang.reflect.Field r7 = p000a.AbstractC2575wW.f7874Y
            if (r7 == 0) goto La5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r7 = r2
        La6:
            if (r7 == 0) goto Lb3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = p000a.AbstractC2446u3.m4223h(r7, r10)
            if (r8 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r7 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lcf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld3:
            return r3
        Ld4:
            if (r8 == 0) goto Ldc
            boolean r8 = p000a.AbstractC2446u3.m4223h(r8, r10)
            if (r8 != 0) goto Le2
        Ldc:
            boolean r7 = r7.mo2449P(r10)
            if (r7 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2575wW.m4457y(a.yc, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    /* renamed from: yF */
    public static void m4458yF(ByteArrayOutputStream byteArrayOutputStream, int i) {
        m4426d3(byteArrayOutputStream, i, 2);
    }

    /* renamed from: z */
    public static void m4459z(Context context) {
        IconCompat iconCompat;
        Parcelable parcelable;
        Object obj;
        Resources resources;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        String string = context.getString(R.string.magisk);
        Intent[] intentArr = {launchIntentForPackage};
        if (AbstractC0795Op.m1857n()) {
            Bitmap m1848f = AbstractC0795Op.m1848f(context, R.drawable.ic_launcher);
            if (Build.VERSION.SDK_INT >= 26) {
                iconCompat = new IconCompat(5);
                iconCompat.f8927h = m1848f;
            } else {
                iconCompat = new IconCompat(1);
                iconCompat.f8927h = m1848f;
            }
        } else {
            PorterDuff.Mode mode = IconCompat.f8921M;
            Resources resources2 = context.getResources();
            String packageName = context.getPackageName();
            packageName.getClass();
            IconCompat iconCompat2 = new IconCompat(2);
            iconCompat2.f8923N = R.drawable.ic_launcher;
            if (resources2 != null) {
                try {
                    iconCompat2.f8927h = resources2.getResourceName(R.drawable.ic_launcher);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat2.f8927h = packageName;
            }
            iconCompat2.f8922G = packageName;
            iconCompat = iconCompat2;
        }
        if (!TextUtils.isEmpty(string)) {
            if (intentArr.length != 0) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    ShortcutManager m1582G = AbstractC0685My.m1582G(context.getSystemService(AbstractC0685My.m1584M()));
                    AbstractC0685My.m1591V();
                    shortLabel = AbstractC0685My.m1594h(context, "home").setShortLabel(string);
                    intents = shortLabel.setIntents(intentArr);
                    intents.setIcon(AbstractC1540d1.m2986v(iconCompat, context));
                    if (!TextUtils.isEmpty(null)) {
                        intents.setLongLabel(null);
                    }
                    if (!TextUtils.isEmpty(null)) {
                        intents.setDisabledMessage(null);
                    }
                    intents.setRank(0);
                    if (i >= 29) {
                        intents.setLongLived(false);
                    } else {
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putBoolean("extraLongLived", false);
                        intents.setExtras(persistableBundle);
                    }
                    if (i >= 33) {
                        AbstractC2440ty.m4182z(intents);
                    }
                    build = intents.build();
                    m1582G.requestPinShortcut(build, null);
                    return;
                }
                if (AbstractC0438II.m1017X(context)) {
                    Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", string.toString());
                    if (iconCompat.f8931z == 2 && (obj = iconCompat.f8927h) != null) {
                        String str = (String) obj;
                        if (str.contains(":")) {
                            String str2 = str.split(":", -1)[1];
                            String str3 = str2.split("/", -1)[0];
                            String str4 = str2.split("/", -1)[1];
                            String str5 = str.split(":", -1)[0];
                            if ("0_resource_name_obfuscated".equals(str4)) {
                                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                            } else {
                                String m4790h = iconCompat.m4790h();
                                if ("android".equals(m4790h)) {
                                    resources = Resources.getSystem();
                                } else {
                                    PackageManager packageManager = context.getPackageManager();
                                    try {
                                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(m4790h, 8192);
                                        if (applicationInfo != null) {
                                            resources = packageManager.getResourcesForApplication(applicationInfo);
                                        }
                                    } catch (PackageManager.NameNotFoundException e) {
                                        Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", m4790h), e);
                                    }
                                    resources = null;
                                }
                                int identifier = resources.getIdentifier(str4, str3, str5);
                                if (iconCompat.f8923N != identifier) {
                                    Log.i("IconCompat", "Id has changed for " + m4790h + " " + str);
                                    iconCompat.f8923N = identifier;
                                }
                            }
                        }
                    }
                    int i2 = iconCompat.f8931z;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 5) {
                                parcelable = IconCompat.m4789z((Bitmap) iconCompat.f8927h, true);
                            } else {
                                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                            }
                        } else {
                            try {
                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context.createPackageContext(iconCompat.m4790h(), 0), iconCompat.f8923N));
                                context.sendBroadcast(intent);
                                return;
                            } catch (PackageManager.NameNotFoundException e2) {
                                throw new IllegalArgumentException("Can't find package " + iconCompat.f8927h, e2);
                            }
                        }
                    } else {
                        parcelable = (Bitmap) iconCompat.f8927h;
                    }
                    intent.putExtra("android.intent.extra.shortcut.ICON", parcelable);
                    context.sendBroadcast(intent);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }

    /* renamed from: zx */
    public static boolean m4460zx(C0440IL c0440il, C0440IL c0440il2) {
        if (c0440il.f1473S.f388S.length != c0440il2.f1473S.f388S.length) {
            return false;
        }
        C2425th[] m1058S = c0440il.m1058S();
        C2425th[] m1058S2 = c0440il2.m1058S();
        if (m1058S.length != m1058S2.length) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i == m1058S.length) {
                return true;
            }
            C2425th c2425th = m1058S[i];
            C2425th c2425th2 = m1058S2[i];
            if (c2425th != c2425th2 && (c2425th == null || c2425th2 == null || !c2425th.f7427S.m3068I(c2425th2.f7427S) || !AbstractC1843ih.m3453o(c2425th.f7426R).equals(AbstractC1843ih.m3453o(c2425th2.f7426R)))) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: HL */
    public abstract Object mo1610HL(Intent intent, int i);

    /* renamed from: L */
    public C0042As mo1611L(AbstractActivityC2754z abstractActivityC2754z, Object obj) {
        return null;
    }

    /* renamed from: w */
    public abstract Intent mo1614w(AbstractActivityC2754z abstractActivityC2754z, Object obj);
}
