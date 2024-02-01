package p000a;

import android.graphics.Rect;
import android.view.View;

/* renamed from: a.F4 */
/* loaded from: classes.dex */
public abstract class AbstractC0265F4 {

    /* renamed from: h */
    public int f934h = Integer.MIN_VALUE;

    /* renamed from: v */
    public final Rect f935v = new Rect();

    /* renamed from: z */
    public final AbstractC0667Md f936z;

    public AbstractC0265F4(AbstractC0667Md abstractC0667Md) {
        this.f936z = abstractC0667Md;
    }

    /* renamed from: z */
    public static C2064mt m562z(AbstractC0667Md abstractC0667Md, int i) {
        if (i != 0) {
            int i2 = 1;
            if (i == 1) {
                return new C2064mt(abstractC0667Md, i2);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C2064mt(abstractC0667Md, 0);
    }

    /* renamed from: G */
    public abstract int mo563G(View view);

    /* renamed from: M */
    public abstract int mo564M(View view);

    /* renamed from: N */
    public abstract int mo565N();

    /* renamed from: P */
    public abstract int mo566P(View view);

    /* renamed from: Q */
    public abstract int mo567Q();

    /* renamed from: V */
    public abstract void mo568V(int i);

    /* renamed from: W */
    public abstract int mo569W();

    /* renamed from: h */
    public abstract int mo570h(View view);

    /* renamed from: o */
    public abstract int mo571o();

    /* renamed from: u */
    public abstract int mo572u();

    /* renamed from: v */
    public abstract int mo573v(View view);
}
