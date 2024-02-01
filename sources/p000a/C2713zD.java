package p000a;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: a.zD */
/* loaded from: classes.dex */
public final class C2713zD extends AbstractC1500cH {

    /* renamed from: h */
    public final ObjectAnimator f8540h;

    /* renamed from: v */
    public final boolean f8541v;

    public C2713zD(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int i;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        if (z) {
            i = numberOfFrames - 1;
        } else {
            i = 0;
        }
        int i2 = z ? 0 : numberOfFrames - 1;
        C2470uX c2470uX = new C2470uX(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        AbstractC1718gL.m3249z(ofInt, true);
        ofInt.setDuration(c2470uX.f7568v);
        ofInt.setInterpolator(c2470uX);
        this.f8541v = z2;
        this.f8540h = ofInt;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: F */
    public final void mo2155F() {
        this.f8540h.cancel();
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: e */
    public final void mo2156e() {
        this.f8540h.start();
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: f */
    public final void mo2911f() {
        this.f8540h.reverse();
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: v */
    public final boolean mo2920v() {
        return this.f8541v;
    }
}
