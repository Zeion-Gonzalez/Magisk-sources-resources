package p000a;

import android.text.Editable;

/* renamed from: a.eV */
/* loaded from: classes.dex */
public final class C1621eV extends Editable.Factory {

    /* renamed from: h */
    public static volatile C1621eV f5006h;

    /* renamed from: v */
    public static Class f5007v;

    /* renamed from: z */
    public static final Object f5008z = new Object();

    public C1621eV() {
        try {
            f5007v = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1621eV.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f5007v;
        if (cls != null) {
            return new C0648MA(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
