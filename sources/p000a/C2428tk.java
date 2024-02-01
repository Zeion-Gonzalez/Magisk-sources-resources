package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* renamed from: a.tk */
/* loaded from: classes.dex */
public final class C2428tk {

    /* renamed from: G */
    public ColorStateList f7431G;

    /* renamed from: M */
    public ColorStateList f7433M;

    /* renamed from: N */
    public int f7434N;

    /* renamed from: P */
    public int f7435P;

    /* renamed from: Q */
    public int f7436Q;

    /* renamed from: V */
    public C2281qz f7439V;

    /* renamed from: W */
    public ColorStateList f7440W;

    /* renamed from: h */
    public C0099Bw f7441h;

    /* renamed from: k */
    public int f7442k;

    /* renamed from: o */
    public PorterDuff.Mode f7443o;

    /* renamed from: q */
    public RippleDrawable f7444q;

    /* renamed from: u */
    public int f7445u;

    /* renamed from: v */
    public int f7446v;

    /* renamed from: w */
    public boolean f7447w;

    /* renamed from: z */
    public final MaterialButton f7448z;

    /* renamed from: S */
    public boolean f7438S = false;

    /* renamed from: R */
    public boolean f7437R = false;

    /* renamed from: I */
    public boolean f7432I = true;

    public C2428tk(MaterialButton materialButton, C0099Bw c0099Bw) {
        this.f7448z = materialButton;
        this.f7441h = c0099Bw;
    }

    /* renamed from: h */
    public final C2281qz m4176h(boolean z) {
        RippleDrawable rippleDrawable = this.f7444q;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C2281qz) ((LayerDrawable) ((InsetDrawable) this.f7444q.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: v */
    public final void m4177v(C0099Bw c0099Bw) {
        this.f7441h = c0099Bw;
        if (m4176h(false) != null) {
            m4176h(false).mo3137h(c0099Bw);
        }
        if (m4176h(true) != null) {
            m4176h(true).mo3137h(c0099Bw);
        }
        if (m4178z() != null) {
            m4178z().mo3137h(c0099Bw);
        }
    }

    /* renamed from: z */
    public final InterfaceC1661fF m4178z() {
        RippleDrawable rippleDrawable = this.f7444q;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (InterfaceC1661fF) (this.f7444q.getNumberOfLayers() > 2 ? this.f7444q.getDrawable(2) : this.f7444q.getDrawable(1));
    }
}
