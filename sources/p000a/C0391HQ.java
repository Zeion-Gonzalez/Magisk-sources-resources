package p000a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a.HQ */
/* loaded from: classes.dex */
public class C0391HQ extends C0067BK {

    /* renamed from: E */
    public final Method f1312E;

    /* renamed from: U */
    public final Method f1313U;

    /* renamed from: Y */
    public final Method f1314Y;

    /* renamed from: f */
    public final Method f1315f;

    /* renamed from: r */
    public final Method f1316r;

    /* renamed from: s */
    public final Constructor f1317s;

    /* renamed from: y */
    public final Class f1318y;

    public C0391HQ() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = m879e(cls);
            method3 = m878X(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = mo880F(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1318y = cls;
        this.f1317s = constructor;
        this.f1313U = method2;
        this.f1312E = method3;
        this.f1315f = method4;
        this.f1316r = method;
        this.f1314Y = method5;
    }

    /* renamed from: X */
    public static Method m878X(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: e */
    public static Method m879e(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: F */
    public Method mo880F(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: H */
    public final boolean m881H() {
        Method method = this.f1313U;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // p000a.C0067BK, p000a.C2196pM
    /* renamed from: I */
    public final Typeface mo135I(Context context, C0980SO[] c0980soArr, int i) {
        Object obj;
        Typeface mo882J;
        boolean z;
        if (c0980soArr.length < 1) {
            return null;
        }
        if (!m881H()) {
            C0980SO mo3821y = mo3821y(i, c0980soArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo3821y.f3311z, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo3821y.f3310v).setItalic(mo3821y.f3308P).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            HashMap hashMap = new HashMap();
            for (C0980SO c0980so : c0980soArr) {
                if (c0980so.f3307N == 0) {
                    Uri uri = c0980so.f3311z;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, AbstractC2575wW.m4437l(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f1317s.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = c0980soArr.length;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                Method method = this.f1316r;
                if (i2 < length) {
                    C0980SO c0980so2 = c0980soArr[i2];
                    ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0980so2.f3311z);
                    if (byteBuffer != null) {
                        try {
                            z = ((Boolean) this.f1312E.invoke(obj, byteBuffer, Integer.valueOf(c0980so2.f3309h), null, Integer.valueOf(c0980so2.f3310v), Integer.valueOf(c0980so2.f3308P ? 1 : 0))).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                            z = false;
                        }
                        if (!z) {
                            try {
                                method.invoke(obj, new Object[0]);
                                return null;
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                return null;
                            }
                        }
                        z2 = true;
                    }
                    i2++;
                    z2 = z2;
                } else {
                    if (!z2) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                            return null;
                        }
                    }
                    if (!m884c(obj) || (mo882J = mo882J(obj)) == null) {
                        return null;
                    }
                    return Typeface.create(mo882J, i);
                }
            }
        }
    }

    /* renamed from: J */
    public Typeface mo882J(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1318y, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1314Y.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: Y */
    public final boolean m883Y(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1313U.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m884c(Object obj) {
        try {
            return ((Boolean) this.f1315f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // p000a.C2196pM
    /* renamed from: k */
    public final Typeface mo885k(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (!m881H()) {
            return super.mo885k(context, resources, i, str, i2);
        }
        try {
            obj = this.f1317s.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!m883Y(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f1316r.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (!m884c(obj)) {
            return null;
        }
        return mo882J(obj);
    }

    @Override // p000a.C0067BK, p000a.C2196pM
    /* renamed from: w */
    public final Typeface mo136w(Context context, C1084UI c1084ui, Resources resources, int i) {
        Object obj;
        if (!m881H()) {
            return super.mo136w(context, c1084ui, resources, i);
        }
        try {
            obj = this.f1317s.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C2474ub c2474ub : c1084ui.f3554z) {
            if (!m883Y(context, obj, c2474ub.f7580z, c2474ub.f7575N, c2474ub.f7578h, c2474ub.f7579v ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c2474ub.f7576P))) {
                try {
                    this.f1316r.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!m884c(obj)) {
            return null;
        }
        return mo882J(obj);
    }
}
