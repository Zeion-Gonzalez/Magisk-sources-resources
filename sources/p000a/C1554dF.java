package p000a;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: a.dF */
/* loaded from: classes.dex */
public final class C1554dF implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: N */
    public final /* synthetic */ float f4799N;

    /* renamed from: P */
    public final /* synthetic */ float f4800P;

    /* renamed from: Q */
    public final /* synthetic */ float f4801Q;

    /* renamed from: W */
    public final /* synthetic */ AbstractC0251En f4802W;

    /* renamed from: h */
    public final /* synthetic */ float f4803h;

    /* renamed from: o */
    public final /* synthetic */ Matrix f4804o;

    /* renamed from: u */
    public final /* synthetic */ float f4805u;

    /* renamed from: v */
    public final /* synthetic */ float f4806v;

    /* renamed from: z */
    public final /* synthetic */ float f4807z;

    public C1554dF(AbstractC0251En abstractC0251En, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.f4802W = abstractC0251En;
        this.f4807z = f;
        this.f4803h = f2;
        this.f4806v = f3;
        this.f4800P = f4;
        this.f4799N = f5;
        this.f4801Q = f6;
        this.f4805u = f7;
        this.f4804o = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AbstractC0251En abstractC0251En = this.f4802W;
        abstractC0251En.f893k.setAlpha(AbstractC1090US.m2263z(this.f4807z, this.f4803h, 0.0f, 0.2f, floatValue));
        FloatingActionButton floatingActionButton = abstractC0251En.f893k;
        float f = this.f4800P;
        float f2 = this.f4806v;
        floatingActionButton.setScaleX(((f - f2) * floatValue) + f2);
        FloatingActionButton floatingActionButton2 = abstractC0251En.f893k;
        float f3 = this.f4799N;
        floatingActionButton2.setScaleY(((f - f3) * floatValue) + f3);
        float f4 = this.f4805u;
        float f5 = this.f4801Q;
        abstractC0251En.f899w = ((f4 - f5) * floatValue) + f5;
        float f6 = ((f4 - f5) * floatValue) + f5;
        Matrix matrix = this.f4804o;
        abstractC0251En.m548z(f6, matrix);
        abstractC0251En.f893k.setImageMatrix(matrix);
    }
}
