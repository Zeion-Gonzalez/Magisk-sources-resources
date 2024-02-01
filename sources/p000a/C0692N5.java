package p000a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: a.N5 */
/* loaded from: classes.dex */
public final class C0692N5 extends C0660MU implements InterfaceC2481um {

    /* renamed from: T */
    public static final Method f2342T;

    /* renamed from: x */
    public InterfaceC2481um f2343x;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2342T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0692N5(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // p000a.InterfaceC2481um
    /* renamed from: V */
    public final void mo1606V(C2189pE c2189pE, MenuItem menuItem) {
        InterfaceC2481um interfaceC2481um = this.f2343x;
        if (interfaceC2481um != null) {
            interfaceC2481um.mo1606V(c2189pE, menuItem);
        }
    }

    @Override // p000a.InterfaceC2481um
    /* renamed from: o */
    public final void mo1607o(C2189pE c2189pE, C1117Uu c1117Uu) {
        InterfaceC2481um interfaceC2481um = this.f2343x;
        if (interfaceC2481um != null) {
            interfaceC2481um.mo1607o(c2189pE, c1117Uu);
        }
    }

    @Override // p000a.C0660MU
    /* renamed from: z */
    public final C2409tO mo1470z(Context context, boolean z) {
        C0263F2 c0263f2 = new C0263F2(context, z);
        c0263f2.f932c = this;
        return c0263f2;
    }
}
