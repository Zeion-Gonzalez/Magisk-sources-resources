package p000a;

import android.graphics.drawable.Animatable;

/* renamed from: a.SJ */
/* loaded from: classes.dex */
public final class C0976SJ extends AbstractC1500cH {

    /* renamed from: h */
    public final /* synthetic */ int f3296h;

    /* renamed from: v */
    public final Animatable f3297v;

    public /* synthetic */ C0976SJ(Animatable animatable, int i) {
        this.f3296h = i;
        this.f3297v = animatable;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: F */
    public final void mo2155F() {
        int i = this.f3296h;
        Animatable animatable = this.f3297v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                animatable.stop();
                return;
            default:
                ((C1152VY) animatable).stop();
                return;
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: e */
    public final void mo2156e() {
        int i = this.f3296h;
        Animatable animatable = this.f3297v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                animatable.start();
                return;
            default:
                ((C1152VY) animatable).start();
                return;
        }
    }
}
