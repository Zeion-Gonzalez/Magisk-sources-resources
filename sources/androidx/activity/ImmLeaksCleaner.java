package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import p000a.AbstractActivityC0502JU;
import p000a.EnumC2241qF;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC1270Xo {

    /* renamed from: I */
    public static Field f8625I;

    /* renamed from: R */
    public static int f8626R;

    /* renamed from: q */
    public static Field f8627q;

    /* renamed from: w */
    public static Field f8628w;

    /* renamed from: S */
    public final Activity f8629S;

    public ImmLeaksCleaner(AbstractActivityC0502JU abstractActivityC0502JU) {
        this.f8629S = abstractActivityC0502JU;
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        if (enumC2241qF != EnumC2241qF.ON_DESTROY) {
            return;
        }
        if (f8626R == 0) {
            try {
                f8626R = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f8625I = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f8627q = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f8628w = declaredField3;
                declaredField3.setAccessible(true);
                f8626R = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f8626R == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f8629S.getSystemService("input_method");
            try {
                Object obj = f8628w.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f8625I.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f8627q.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
