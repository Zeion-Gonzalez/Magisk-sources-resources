package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: a.E2 */
/* loaded from: classes.dex */
public final class C0212E2 extends Drawable.ConstantState {

    /* renamed from: G */
    public boolean f668G;

    /* renamed from: M */
    public boolean f669M;

    /* renamed from: N */
    public boolean f670N;

    /* renamed from: P */
    public PorterDuff.Mode f671P;

    /* renamed from: Q */
    public Bitmap f672Q;

    /* renamed from: V */
    public Paint f673V;

    /* renamed from: W */
    public int f674W;

    /* renamed from: h */
    public C1061Tu f675h;

    /* renamed from: o */
    public PorterDuff.Mode f676o;

    /* renamed from: u */
    public ColorStateList f677u;

    /* renamed from: v */
    public ColorStateList f678v;

    /* renamed from: z */
    public int f679z;

    public C0212E2() {
        this.f678v = null;
        this.f671P = C1430aq.f4478U;
        this.f675h = new C1061Tu();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f679z;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1430aq(this);
    }

    public C0212E2(C0212E2 c0212e2) {
        this.f678v = null;
        this.f671P = C1430aq.f4478U;
        if (c0212e2 != null) {
            this.f679z = c0212e2.f679z;
            C1061Tu c1061Tu = new C1061Tu(c0212e2.f675h);
            this.f675h = c1061Tu;
            if (c0212e2.f675h.f3488N != null) {
                c1061Tu.f3488N = new Paint(c0212e2.f675h.f3488N);
            }
            if (c0212e2.f675h.f3489P != null) {
                this.f675h.f3489P = new Paint(c0212e2.f675h.f3489P);
            }
            this.f678v = c0212e2.f678v;
            this.f671P = c0212e2.f671P;
            this.f670N = c0212e2.f670N;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1430aq(this);
    }
}
