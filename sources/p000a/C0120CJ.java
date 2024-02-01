package p000a;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: a.CJ */
/* loaded from: classes.dex */
public final class C0120CJ extends Drawable.ConstantState {

    /* renamed from: P */
    public C1186WB f417P;

    /* renamed from: h */
    public AnimatorSet f418h;

    /* renamed from: v */
    public ArrayList f419v;

    /* renamed from: z */
    public C1430aq f420z;

    public C0120CJ(C0881QX c0881qx) {
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
