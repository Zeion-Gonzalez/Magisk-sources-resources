package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.topjohnwu.magisk.R;
import java.util.Arrays;

/* renamed from: a.zU */
/* loaded from: classes.dex */
public final class DialogC2727zU extends AbstractDialogC2733zb {

    /* renamed from: g */
    public final C0978SM f8569g;

    /* renamed from: k */
    public final AbstractC0362Gv f8570k;

    public DialogC2727zU(Activity activity) {
        super(activity, 0);
        LayoutInflater from = LayoutInflater.from(activity);
        int i = AbstractC0362Gv.f1217t;
        AbstractC0362Gv abstractC0362Gv = (AbstractC0362Gv) AbstractC2307rQ.m3967v(from, R.layout.dialog_magisk_base, null, false);
        this.f8570k = abstractC0362Gv;
        C0978SM c0978sm = new C0978SM(this);
        this.f8569g = c0978sm;
        abstractC0362Gv.mo19k(6, c0978sm);
        setCancelable(true);
        setOwnerActivity(activity);
    }

    /* renamed from: G */
    public final void m4656G(int i, Object... objArr) {
        String string = getContext().getString(i, Arrays.copyOf(objArr, objArr.length));
        C0978SM c0978sm = this.f8569g;
        if (!AbstractC1292YB.m2695u(c0978sm.f3306w, string)) {
            c0978sm.f3306w = string;
            AbstractC0795Op.m1801B(c0978sm, 24);
        }
    }

    /* renamed from: W */
    public final void m4657W(EnumC1224Wr enumC1224Wr, InterfaceC2364sT interfaceC2364sT) {
        C0738Nr c0738Nr;
        int ordinal = enumC1224Wr.ordinal();
        C0978SM c0978sm = this.f8569g;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    c0738Nr = c0978sm.f3304k;
                } else {
                    throw new C0993Sd();
                }
            } else {
                c0738Nr = c0978sm.f3305q;
            }
        } else {
            c0738Nr = c0978sm.f3301I;
        }
        interfaceC2364sT.mo85W(c0738Nr);
    }

    @Override // p000a.AbstractDialogC2733zb, p000a.DialogC2096nV, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        super.setContentView(this.f8570k.f8982k);
        Context context = getContext();
        TypedValue m1851he = AbstractC0795Op.m1851he(context, R.attr.colorSurface, DialogC2727zU.class.getCanonicalName());
        int i2 = m1851he.resourceId;
        if (i2 != 0) {
            Object obj = AbstractC0865QC.f2950z;
            i = AbstractC1375Zj.m2772z(context, i2);
        } else {
            i = m1851he.data;
        }
        int m1836Y = AbstractC0795Op.m1836Y(getContext(), R.attr.colorSurfaceSurfaceVariant, i);
        C2281qz c2281qz = new C2281qz(getContext(), null, R.attr.alertDialogStyle, 2131951945);
        c2281qz.m3930M(getContext());
        c2281qz.m3934R(ColorStateList.valueOf(m1836Y));
        c2281qz.m3935S(getContext().getResources().getDimension(R.dimen.margin_generic));
        float dimension = getContext().getResources().getDimension(R.dimen.l_50);
        C0099Bw c0099Bw = c2281qz.f7021S.f4616z;
        c0099Bw.getClass();
        C0021AO c0021ao = new C0021AO(c0099Bw);
        c0021ao.f130N = new C1012T(dimension);
        c0021ao.f132Q = new C1012T(dimension);
        c0021ao.f137u = new C1012T(dimension);
        c0021ao.f136o = new C1012T(dimension);
        c2281qz.mo3137h(new C0099Bw(c0021ao));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.appcompat_dialog_background_inset);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new InsetDrawable((Drawable) c2281qz, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize));
            window.setLayout(-1, -2);
        }
    }

    @Override // p000a.AbstractDialogC2733zb, p000a.DialogC2096nV, android.app.Dialog
    public final void setContentView(int i) {
    }

    @Override // p000a.AbstractDialogC2733zb, android.app.Dialog
    public final void setTitle(int i) {
        String string = getContext().getString(i);
        C0978SM c0978sm = this.f8569g;
        if (AbstractC1292YB.m2695u(c0978sm.f3302R, string)) {
            return;
        }
        c0978sm.f3302R = string;
        AbstractC0795Op.m1801B(c0978sm, 40);
    }

    @Override // p000a.AbstractDialogC2733zb, p000a.DialogC2096nV, android.app.Dialog
    public final void setContentView(View view) {
    }

    @Override // p000a.AbstractDialogC2733zb, p000a.DialogC2096nV, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // p000a.AbstractDialogC2733zb, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        C0978SM c0978sm = this.f8569g;
        if (AbstractC1292YB.m2695u(c0978sm.f3302R, charSequence)) {
            return;
        }
        c0978sm.f3302R = charSequence;
        AbstractC0795Op.m1801B(c0978sm, 40);
    }
}
