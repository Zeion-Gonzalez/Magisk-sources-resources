package p000a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.topjohnwu.magisk.R;

/* renamed from: a.gS */
/* loaded from: classes.dex */
public final class C1724gS {

    /* renamed from: Y */
    public static final ColorDrawable f5407Y;

    /* renamed from: r */
    public static final double f5408r = Math.cos(Math.toRadians(45.0d));

    /* renamed from: E */
    public final int f5409E;

    /* renamed from: G */
    public Drawable f5410G;

    /* renamed from: I */
    public LayerDrawable f5411I;

    /* renamed from: M */
    public ColorStateList f5412M;

    /* renamed from: N */
    public int f5413N;

    /* renamed from: P */
    public final C2281qz f5414P;

    /* renamed from: Q */
    public int f5415Q;

    /* renamed from: R */
    public ColorStateList f5416R;

    /* renamed from: S */
    public C0099Bw f5417S;

    /* renamed from: U */
    public final int f5418U;

    /* renamed from: V */
    public ColorStateList f5419V;

    /* renamed from: W */
    public Drawable f5420W;

    /* renamed from: g */
    public boolean f5422g;

    /* renamed from: o */
    public int f5425o;

    /* renamed from: q */
    public C2281qz f5426q;

    /* renamed from: s */
    public final TimeInterpolator f5427s;

    /* renamed from: u */
    public int f5428u;

    /* renamed from: v */
    public final C2281qz f5429v;

    /* renamed from: w */
    public RippleDrawable f5430w;

    /* renamed from: y */
    public ValueAnimator f5431y;

    /* renamed from: z */
    public final MaterialCardView f5432z;

    /* renamed from: h */
    public final Rect f5423h = new Rect();

    /* renamed from: k */
    public boolean f5424k = false;

    /* renamed from: f */
    public float f5421f = 0.0f;

    static {
        f5407Y = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C1724gS(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f5432z = materialCardView;
        C2281qz c2281qz = new C2281qz(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, 2131952698);
        this.f5429v = c2281qz;
        c2281qz.m3930M(materialCardView.getContext());
        c2281qz.m3942w();
        C0099Bw c0099Bw = c2281qz.f7021S.f4616z;
        c0099Bw.getClass();
        C0021AO c0021ao = new C0021AO(c0099Bw);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2923Q, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            c0021ao.f130N = new C1012T(dimension);
            c0021ao.f132Q = new C1012T(dimension);
            c0021ao.f137u = new C1012T(dimension);
            c0021ao.f136o = new C1012T(dimension);
        }
        this.f5414P = new C2281qz();
        m3253Q(new C0099Bw(c0021ao));
        this.f5427s = AbstractC0795Op.m1802BO(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1090US.f3564z);
        this.f5418U = AbstractC0795Op.m1831U8(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f5409E = AbstractC0795Op.m1831U8(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    public static float m3250h(AbstractC1500cH abstractC1500cH, float f) {
        if (abstractC1500cH instanceof C2073n1) {
            return (float) ((1.0d - f5408r) * f);
        }
        if (abstractC1500cH instanceof C2284r1) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: N */
    public final void m3251N(boolean z, boolean z2) {
        float f;
        int i;
        Drawable drawable = this.f5410G;
        if (drawable != null) {
            int i2 = 0;
            float f2 = 0.0f;
            if (z2) {
                if (z) {
                    f2 = 1.0f;
                }
                if (z) {
                    f = 1.0f - this.f5421f;
                } else {
                    f = this.f5421f;
                }
                ValueAnimator valueAnimator = this.f5431y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f5431y = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5421f, f2);
                this.f5431y = ofFloat;
                ofFloat.addUpdateListener(new C2079n7(i2, this));
                this.f5431y.setInterpolator(this.f5427s);
                ValueAnimator valueAnimator2 = this.f5431y;
                if (z) {
                    i = this.f5418U;
                } else {
                    i = this.f5409E;
                }
                valueAnimator2.setDuration(i * f);
                this.f5431y.start();
                return;
            }
            if (z) {
                i2 = 255;
            }
            drawable.setAlpha(i2);
            if (z) {
                f2 = 1.0f;
            }
            this.f5421f = f2;
        }
    }

    /* renamed from: P */
    public final C0156D1 m3252P(Drawable drawable) {
        int i;
        int i2;
        float f;
        MaterialCardView materialCardView = this.f5432z;
        if (materialCardView.f7346S) {
            float f2 = ((C1744go) ((Drawable) materialCardView.f7347q.f5013R)).f5504N * 1.5f;
            float f3 = 0.0f;
            if (m3254u()) {
                f = m3256z();
            } else {
                f = 0.0f;
            }
            int ceil = (int) Math.ceil(f2 + f);
            float f4 = ((C1744go) ((Drawable) materialCardView.f7347q.f5013R)).f5504N;
            if (m3254u()) {
                f3 = m3256z();
            }
            i = (int) Math.ceil(f4 + f3);
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new C0156D1(drawable, i, i2, i, i2);
    }

    /* renamed from: Q */
    public final void m3253Q(C0099Bw c0099Bw) {
        this.f5417S = c0099Bw;
        C2281qz c2281qz = this.f5429v;
        c2281qz.mo3137h(c0099Bw);
        c2281qz.f7014C = !c2281qz.m3936V();
        C2281qz c2281qz2 = this.f5414P;
        if (c2281qz2 != null) {
            c2281qz2.mo3137h(c0099Bw);
        }
        C2281qz c2281qz3 = this.f5426q;
        if (c2281qz3 != null) {
            c2281qz3.mo3137h(c0099Bw);
        }
    }

    /* renamed from: u */
    public final boolean m3254u() {
        MaterialCardView materialCardView = this.f5432z;
        if (materialCardView.f7345R && this.f5429v.m3936V() && materialCardView.f7346S) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final LayerDrawable m3255v() {
        if (this.f5430w == null) {
            int[] iArr = AbstractC0567Ke.f1845z;
            this.f5426q = new C2281qz(this.f5417S);
            this.f5430w = new RippleDrawable(this.f5412M, null, this.f5426q);
        }
        if (this.f5411I == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f5430w, this.f5414P, this.f5410G});
            this.f5411I = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f5411I;
    }

    /* renamed from: z */
    public final float m3256z() {
        AbstractC1500cH abstractC1500cH = this.f5417S.f381z;
        C2281qz c2281qz = this.f5429v;
        return Math.max(Math.max(m3250h(abstractC1500cH, c2281qz.m3928G()), m3250h(this.f5417S.f377h, c2281qz.f7021S.f4616z.f374Q.mo2191z(c2281qz.m3937W()))), Math.max(m3250h(this.f5417S.f380v, c2281qz.f7021S.f4616z.f379u.mo2191z(c2281qz.m3937W())), m3250h(this.f5417S.f373P, c2281qz.f7021S.f4616z.f378o.mo2191z(c2281qz.m3937W()))));
    }
}
