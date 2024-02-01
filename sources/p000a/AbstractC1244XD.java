package p000a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.system.ErrnoException;
import android.system.Int64Ref;
import android.system.Os;
import android.system.OsConstants;
import android.util.MutableLong;
import java.io.FileDescriptor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.XD */
/* loaded from: classes.dex */
public abstract class AbstractC1244XD {

    /* renamed from: P */
    public static AccessibleObject f4037P;

    /* renamed from: h */
    public static Method f4038h;

    /* renamed from: v */
    public static Method f4039v;

    /* renamed from: z */
    public static Object f4040z;

    /* renamed from: P */
    public static long m2551P(FileDescriptor fileDescriptor, Int64Ref int64Ref, FileDescriptor fileDescriptor2, Int64Ref int64Ref2, long j) {
        try {
            if (f4038h == null) {
                f4038h = Os.class.getMethod("splice", FileDescriptor.class, AbstractC0232EQ.m452G(), FileDescriptor.class, AbstractC0232EQ.m452G(), Long.TYPE, Integer.TYPE);
            }
            return ((Long) f4038h.invoke(null, fileDescriptor, int64Ref, fileDescriptor2, int64Ref2, Long.valueOf(j), 0)).longValue();
        } catch (InvocationTargetException e) {
            throw ((ErrnoException) e.getTargetException());
        } catch (ReflectiveOperationException unused) {
            throw new ErrnoException("splice", OsConstants.ENOSYS);
        }
    }

    /* renamed from: h */
    public static FileDescriptor m2552h(int i) {
        if (f4037P == null) {
            try {
                try {
                    f4037P = FileDescriptor.class.getDeclaredConstructor(Integer.TYPE);
                } catch (NoSuchMethodException unused) {
                    f4037P = FileDescriptor.class.getDeclaredMethod("setInt$", Integer.TYPE);
                }
            } catch (NoSuchMethodException unused2) {
            }
            f4037P.setAccessible(true);
        }
        try {
            AccessibleObject accessibleObject = f4037P;
            if (accessibleObject instanceof Constructor) {
                return (FileDescriptor) ((Constructor) accessibleObject).newInstance(Integer.valueOf(i));
            }
            FileDescriptor fileDescriptor = new FileDescriptor();
            ((Method) f4037P).invoke(fileDescriptor, Integer.valueOf(i));
            return fileDescriptor;
        } catch (ReflectiveOperationException unused3) {
            return null;
        }
    }

    /* renamed from: v */
    public static long m2553v(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, MutableLong mutableLong, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            Int64Ref int64Ref = mutableLong != null ? new Int64Ref(mutableLong.value) : null;
            long sendfile = Os.sendfile(fileDescriptor, fileDescriptor2, int64Ref, j);
            if (int64Ref != null) {
                mutableLong.value = int64Ref.value;
            }
            return sendfile;
        }
        try {
            if (f4040z == null) {
                f4040z = Class.forName("libcore.io.Libcore").getField("os").get(null);
            }
            if (f4039v == null) {
                f4039v = f4040z.getClass().getMethod("sendfile", FileDescriptor.class, FileDescriptor.class, MutableLong.class, Long.TYPE);
            }
            return ((Long) f4039v.invoke(f4040z, fileDescriptor, fileDescriptor2, mutableLong, Long.valueOf(j))).longValue();
        } catch (InvocationTargetException e) {
            throw ((ErrnoException) e.getTargetException());
        } catch (ReflectiveOperationException unused) {
            throw new ErrnoException("sendfile", OsConstants.ENOSYS);
        }
    }

    /* renamed from: z */
    public static Handler m2554z(Looper looper) {
        return Handler.createAsync(looper);
    }
}
