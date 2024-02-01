package p000a;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: a.cz */
/* loaded from: classes.dex */
public final class C1537cz {

    /* renamed from: h */
    public final Configuration f4761h;

    /* renamed from: v */
    public final int f4762v;

    /* renamed from: z */
    public final ColorStateList f4763z;

    public C1537cz(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f4763z = colorStateList;
        this.f4761h = configuration;
        this.f4762v = theme == null ? 0 : theme.hashCode();
    }
}
