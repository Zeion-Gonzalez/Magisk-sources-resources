package p000a;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: a.Yj */
/* loaded from: classes.dex */
public final class C1319Yj {

    /* renamed from: G */
    public int f4181G = -1;

    /* renamed from: N */
    public View f4182N;

    /* renamed from: P */
    public CharSequence f4183P;

    /* renamed from: Q */
    public DialogInterface.OnKeyListener f4184Q;

    /* renamed from: W */
    public boolean f4185W;

    /* renamed from: h */
    public final LayoutInflater f4186h;

    /* renamed from: o */
    public DialogInterface.OnClickListener f4187o;

    /* renamed from: u */
    public ListAdapter f4188u;

    /* renamed from: v */
    public Drawable f4189v;

    /* renamed from: z */
    public final Context f4190z;

    public C1319Yj(ContextThemeWrapper contextThemeWrapper) {
        this.f4190z = contextThemeWrapper;
        this.f4186h = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
