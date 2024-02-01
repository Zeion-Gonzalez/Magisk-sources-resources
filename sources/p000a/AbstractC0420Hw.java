package p000a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.topjohnwu.magisk.R;

/* renamed from: a.Hw */
/* loaded from: classes.dex */
public abstract class AbstractC0420Hw extends AbstractC2029mC {
    public AbstractC0420Hw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2709z9 m1805D = AbstractC0795Op.m1805D(getContext(), attributeSet, AbstractC0863Q8.f2922P, R.attr.bottomNavigationStyle, 2131952492, new int[0]);
        boolean m4652z = m1805D.m4652z(2, true);
        C1106Uj c1106Uj = this.f6314R;
        if (c1106Uj.f3602nP != m4652z) {
            c1106Uj.f3602nP = m4652z;
            this.f6318w.mo221S(false);
        }
        if (m1805D.m4645V(0)) {
            setMinimumHeight(m1805D.m4643P(0, 0));
        }
        m1805D.m4652z(1, true);
        m1805D.m4651w();
        AbstractC0795Op.m1866q(this, new C2196pM(19, this));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
