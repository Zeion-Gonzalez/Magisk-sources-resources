package p000a;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.topjohnwu.magisk.R;

/* renamed from: a.jU */
/* loaded from: classes.dex */
public final class C1884jU extends AbstractC0663MY {

    /* renamed from: G */
    public final ViewOnClickListenerC0435IF f5878G;

    /* renamed from: M */
    public final ViewOnFocusChangeListenerC1157Vf f5879M;

    /* renamed from: N */
    public final int f5880N;

    /* renamed from: Q */
    public final int f5881Q;

    /* renamed from: S */
    public ValueAnimator f5882S;

    /* renamed from: V */
    public AnimatorSet f5883V;

    /* renamed from: W */
    public EditText f5884W;

    /* renamed from: o */
    public final TimeInterpolator f5885o;

    /* renamed from: u */
    public final TimeInterpolator f5886u;

    public C1884jU(C1997lY c1997lY) {
        super(c1997lY);
        this.f5878G = new ViewOnClickListenerC0435IF(1, this);
        this.f5879M = new ViewOnFocusChangeListenerC1157Vf(this, 0);
        this.f5880N = AbstractC0795Op.m1831U8(c1997lY.getContext(), R.attr.motionDurationShort3, 100);
        this.f5881Q = AbstractC0795Op.m1831U8(c1997lY.getContext(), R.attr.motionDurationShort3, 150);
        this.f5886u = AbstractC0795Op.m1802BO(c1997lY.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1090US.f3564z);
        this.f5885o = AbstractC0795Op.m1802BO(c1997lY.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1090US.f3561P);
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: I */
    public final void mo1472I(boolean z) {
        if (this.f2150h.f6191J == null) {
            return;
        }
        m3505y(z);
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: N */
    public final View.OnFocusChangeListener mo1473N() {
        return this.f5879M;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: P */
    public final int mo618P() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: Q */
    public final View.OnClickListener mo619Q() {
        return this.f5878G;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: S */
    public final void mo620S(EditText editText) {
        this.f5884W = editText;
        this.f2152z.f9507w.m3619o(m3504s());
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: g */
    public final void mo622g() {
        EditText editText = this.f5884W;
        if (editText != null) {
            editText.post(new RunnableC0308Fs(12, this));
        }
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: k */
    public final void mo415k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f5885o);
        ofFloat.setDuration(this.f5881Q);
        final int i = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.Um

            /* renamed from: h */
            public final /* synthetic */ C1884jU f3611h;

            {
                this.f3611h = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                C1884jU c1884jU = this.f3611h;
                switch (i2) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        c1884jU.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1884jU.f2149P;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        c1884jU.getClass();
                        c1884jU.f2149P.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f5886u;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f5880N;
        ofFloat2.setDuration(i2);
        final int i3 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.Um

            /* renamed from: h */
            public final /* synthetic */ C1884jU f3611h;

            {
                this.f3611h = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                C1884jU c1884jU = this.f3611h;
                switch (i22) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        c1884jU.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1884jU.f2149P;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        c1884jU.getClass();
                        c1884jU.f2149P.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5883V = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f5883V.addListener(new C2455uG(this, i));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.Um

            /* renamed from: h */
            public final /* synthetic */ C1884jU f3611h;

            {
                this.f3611h = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                C1884jU c1884jU = this.f3611h;
                switch (i22) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        c1884jU.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1884jU.f2149P;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        c1884jU.getClass();
                        c1884jU.f2149P.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        this.f5882S = ofFloat3;
        ofFloat3.addListener(new C2455uG(this, i3));
    }

    /* renamed from: s */
    public final boolean m3504s() {
        EditText editText = this.f5884W;
        return editText != null && (editText.hasFocus() || this.f2149P.hasFocus()) && this.f5884W.getText().length() > 0;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: u */
    public final View.OnFocusChangeListener mo1478u() {
        return this.f5879M;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: v */
    public final int mo624v() {
        return R.string.clear_text_end_icon_content_description;
    }

    /* renamed from: y */
    public final void m3505y(boolean z) {
        boolean z2 = this.f2150h.m3613P() == z;
        if (z && !this.f5883V.isRunning()) {
            this.f5882S.cancel();
            this.f5883V.start();
            if (z2) {
                this.f5883V.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f5883V.cancel();
        this.f5882S.start();
        if (z2) {
            this.f5882S.end();
        }
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: z */
    public final void mo1480z() {
        if (this.f2150h.f6191J != null) {
            return;
        }
        m3505y(m3504s());
    }
}
