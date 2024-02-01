package p000a;

import android.content.Context;
import android.view.SubMenu;

/* renamed from: a.QH */
/* loaded from: classes.dex */
public final class C0869QH extends C2189pE {

    /* renamed from: J */
    public final int f2955J;

    /* renamed from: Y */
    public final Class f2956Y;

    public C0869QH(Context context, Class cls) {
        super(context);
        this.f2956Y = cls;
        this.f2955J = 5;
    }

    @Override // p000a.C2189pE, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f2956Y.getSimpleName().concat(" does not support submenus"));
    }

    @Override // p000a.C2189pE
    /* renamed from: z */
    public final C1117Uu mo2002z(int i, int i2, int i3, CharSequence charSequence) {
        int size = size() + 1;
        int i4 = this.f2955J;
        if (size <= i4) {
            m3792E();
            C1117Uu mo2002z = super.mo2002z(i, i2, i3, charSequence);
            mo2002z.f3641f = (mo2002z.f3641f & (-5)) | 4;
            m3794U();
            return mo2002z;
        }
        String simpleName = this.f2956Y.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(AbstractC2441tz.m4187M(sb, simpleName, "#getMaxItemCount()"));
    }
}
