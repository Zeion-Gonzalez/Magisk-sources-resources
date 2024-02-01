package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: a.a9 */
/* loaded from: classes.dex */
public final class C1395a9 extends C2196pM {

    /* renamed from: I */
    public static final Constructor f4395I;

    /* renamed from: k */
    public static final Method f4396k;

    /* renamed from: q */
    public static final Method f4397q;

    /* renamed from: w */
    public static final Class f4398w;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f4395I = constructor;
        f4398w = cls;
        f4397q = method2;
        f4396k = method;
    }

    public C1395a9() {
        super(6);
    }

    /* renamed from: f */
    public static boolean m2817f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f4397q.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // p000a.C2196pM
    /* renamed from: I */
    public final Typeface mo135I(Context context, C0980SO[] c0980soArr, int i) {
        Object obj;
        Typeface typeface;
        try {
            obj = f4395I.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C2698yx c2698yx = new C2698yx();
        for (C0980SO c0980so : c0980soArr) {
            Uri uri = c0980so.f3311z;
            ByteBuffer byteBuffer = (ByteBuffer) c2698yx.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = AbstractC2575wW.m4437l(context, uri);
                c2698yx.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !m2817f(obj, byteBuffer, c0980so.f3309h, c0980so.f3310v, c0980so.f3308P)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f4398w, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f4396k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }

    @Override // p000a.C2196pM
    /* renamed from: w */
    public final Typeface mo136w(Context context, C1084UI c1084ui, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f4395I.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C2474ub c2474ub : c1084ui.f3554z) {
            int i2 = c2474ub.f7577Q;
            File m4434i = AbstractC2575wW.m4434i(context);
            if (m4434i != null) {
                try {
                    if (AbstractC2575wW.m4415V(m4434i, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(m4434i);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !m2817f(obj, mappedByteBuffer, c2474ub.f7575N, c2474ub.f7578h, c2474ub.f7579v)) {
                            return null;
                        }
                    }
                } finally {
                    m4434i.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f4398w, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4396k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }
}
