package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.topjohnwu.magisk.R;

/* renamed from: a.TL */
/* loaded from: classes.dex */
public final class C1031TL extends C0851Pt {

    /* renamed from: g */
    public static final int[][] f3436g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: k */
    public boolean f3437k;

    /* renamed from: q */
    public ColorStateList f3438q;

    public C1031TL(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.radioButtonStyle, 2131952711), attributeSet);
        Context context2 = getContext();
        TypedArray m1817K = AbstractC0795Op.m1817K(context2, attributeSet, AbstractC0863Q8.f2926U, R.attr.radioButtonStyle, 2131952711, new int[0]);
        if (m1817K.hasValue(0)) {
            AbstractC2293rB.m3952v(this, AbstractC0795Op.m1812H(context2, m1817K, 0));
        }
        this.f3437k = m1817K.getBoolean(1, false);
        m1817K.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3437k && AbstractC2293rB.m3953z(this) == null) {
            this.f3437k = true;
            if (this.f3438q == null) {
                int m1816J = AbstractC0795Op.m1816J(this, R.attr.colorControlActivated);
                int m1816J2 = AbstractC0795Op.m1816J(this, R.attr.colorOnSurface);
                int m1816J3 = AbstractC0795Op.m1816J(this, R.attr.colorSurface);
                this.f3438q = new ColorStateList(f3436g, new int[]{AbstractC0795Op.m1829T(m1816J3, m1816J, 1.0f), AbstractC0795Op.m1829T(m1816J3, m1816J2, 0.54f), AbstractC0795Op.m1829T(m1816J3, m1816J2, 0.38f), AbstractC0795Op.m1829T(m1816J3, m1816J2, 0.38f)});
            }
            AbstractC2293rB.m3952v(this, this.f3438q);
        }
    }
}
