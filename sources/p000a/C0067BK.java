package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.BK */
/* loaded from: classes.dex */
public class C0067BK extends C2196pM {

    /* renamed from: I */
    public static Constructor f293I = null;

    /* renamed from: g */
    public static boolean f294g = false;

    /* renamed from: k */
    public static Method f295k;

    /* renamed from: q */
    public static Method f296q;

    /* renamed from: w */
    public static Class f297w;

    public C0067BK() {
        super(6);
    }

    /* renamed from: f */
    public static boolean m133f(int i, Object obj, String str, boolean z) {
        m134r();
        try {
            return ((Boolean) f296q.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: r */
    public static void m134r() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f294g) {
            return;
        }
        f294g = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f293I = constructor;
        f297w = cls;
        f296q = method2;
        f295k = method;
    }

    @Override // p000a.C2196pM
    /* renamed from: I */
    public Typeface mo135I(Context context, C0980SO[] c0980soArr, int i) {
        File file;
        String readlink;
        if (c0980soArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo3821y(i, c0980soArr).f3311z, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface mo3819q = mo3819q(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return mo3819q;
                }
                Typeface mo3819q2 = mo3819q(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return mo3819q2;
            } finally {
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }

    @Override // p000a.C2196pM
    /* renamed from: w */
    public Typeface mo136w(Context context, C1084UI c1084ui, Resources resources, int i) {
        m134r();
        try {
            Object newInstance = f293I.newInstance(new Object[0]);
            for (C2474ub c2474ub : c1084ui.f3554z) {
                File m4434i = AbstractC2575wW.m4434i(context);
                if (m4434i == null) {
                    return null;
                }
                try {
                    if (!AbstractC2575wW.m4415V(m4434i, resources, c2474ub.f7577Q)) {
                        return null;
                    }
                    if (!m133f(c2474ub.f7578h, newInstance, m4434i.getPath(), c2474ub.f7579v)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    m4434i.delete();
                }
            }
            m134r();
            try {
                Object newInstance2 = Array.newInstance(f297w, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f295k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
