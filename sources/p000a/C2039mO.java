package p000a;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: a.mO */
/* loaded from: classes.dex */
public final class C2039mO extends AbstractC1796hn {

    /* renamed from: h */
    public final /* synthetic */ int f6357h;

    /* renamed from: v */
    public final /* synthetic */ CarouselLayoutManager f6358v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2039mO(int i, CarouselLayoutManager carouselLayoutManager, int i2) {
        super(i);
        this.f6357h = i2;
        this.f6358v = carouselLayoutManager;
    }

    /* renamed from: G */
    public final int m3676G() {
        switch (this.f6357h) {
            case AbstractC0795Op.f2698E /* 0 */:
                return 0;
            default:
                return this.f6358v.m1518X();
        }
    }

    /* renamed from: W */
    public final int m3677W() {
        int i = this.f6357h;
        CarouselLayoutManager carouselLayoutManager = this.f6358v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return carouselLayoutManager.f2165R - carouselLayoutManager.m1529e();
            default:
                return carouselLayoutManager.f2165R;
        }
    }

    /* renamed from: o */
    public final int m3678o() {
        switch (this.f6357h) {
            case AbstractC0795Op.f2698E /* 0 */:
                return this.f6358v.m1496H();
            default:
                return 0;
        }
    }

    /* renamed from: u */
    public final int m3679u() {
        int i = this.f6357h;
        CarouselLayoutManager carouselLayoutManager = this.f6358v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return carouselLayoutManager.f2173w;
            default:
                return carouselLayoutManager.f2173w - carouselLayoutManager.m1523c();
        }
    }
}
