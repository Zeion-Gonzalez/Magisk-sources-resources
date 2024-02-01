package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: a.CM */
/* loaded from: classes.dex */
public final class C0123CM extends AnimatorListenerAdapter {

    /* renamed from: N */
    public final /* synthetic */ C0446IU f426N;

    /* renamed from: P */
    public final /* synthetic */ TextView f427P;

    /* renamed from: h */
    public final /* synthetic */ TextView f428h;

    /* renamed from: v */
    public final /* synthetic */ int f429v;

    /* renamed from: z */
    public final /* synthetic */ int f430z;

    public C0123CM(C0446IU c0446iu, int i, TextView textView, int i2, TextView textView2) {
        this.f426N = c0446iu;
        this.f430z = i;
        this.f428h = textView;
        this.f429v = i2;
        this.f427P = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0610LT c0610lt;
        int i = this.f430z;
        C0446IU c0446iu = this.f426N;
        c0446iu.f1497R = i;
        c0446iu.f1500V = null;
        TextView textView = this.f428h;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f429v == 1 && (c0610lt = c0446iu.f1506k) != null) {
                c0610lt.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f427P;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f427P;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
