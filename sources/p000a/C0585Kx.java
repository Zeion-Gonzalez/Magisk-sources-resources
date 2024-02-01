package p000a;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* renamed from: a.Kx */
/* loaded from: classes.dex */
public final class C0585Kx implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: h */
    public final /* synthetic */ View f1900h;

    /* renamed from: v */
    public final /* synthetic */ Object f1901v;

    /* renamed from: z */
    public final /* synthetic */ int f1902z;

    public /* synthetic */ C0585Kx(int i, View view, Object obj) {
        this.f1902z = i;
        this.f1901v = obj;
        this.f1900h = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f1902z;
        View view = this.f1900h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) view;
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
                return;
            default:
                view.invalidate();
                return;
        }
    }
}
