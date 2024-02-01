package p000a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: a.lS */
/* loaded from: classes.dex */
public final class C1991lS extends AbstractC2324rj {

    /* renamed from: L */
    public static final /* synthetic */ int f6168L = 0;

    /* renamed from: j */
    public C2616xE f6169j;

    /* renamed from: p */
    public C1276Xv f6170p;

    public C1991lS(C1991lS c1991lS, C0224EF c0224ef, Resources resources) {
        super(c1991lS, c0224ef, resources);
        C2616xE c2616xE;
        if (c1991lS != null) {
            this.f6170p = c1991lS.f6170p;
            c2616xE = c1991lS.f6169j;
        } else {
            this.f6170p = new C1276Xv();
            c2616xE = new C2616xE();
        }
        this.f6169j = c2616xE;
    }

    @Override // p000a.AbstractC2451uB
    /* renamed from: N */
    public final void mo3602N() {
        this.f6170p = this.f6170p.clone();
        this.f6169j = this.f6169j.clone();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0224EF(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0224EF(this, resources);
    }
}
