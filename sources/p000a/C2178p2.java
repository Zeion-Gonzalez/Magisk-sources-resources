package p000a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.topjohnwu.magisk.R;

/* renamed from: a.p2 */
/* loaded from: classes.dex */
public final class C2178p2 extends C0660MU implements InterfaceC1037TS {

    /* renamed from: B */
    public int f6671B;

    /* renamed from: K */
    public final /* synthetic */ C2184p9 f6672K;

    /* renamed from: T */
    public ListAdapter f6673T;

    /* renamed from: t */
    public final Rect f6674t;

    /* renamed from: x */
    public CharSequence f6675x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2178p2(C2184p9 c2184p9, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f6672K = c2184p9;
        this.f6674t = new Rect();
        this.f2126J = c2184p9;
        this.f2127L = true;
        this.f2138i.setFocusable(true);
        this.f2134c = new C0200Dp(this, 1, c2184p9);
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: G */
    public final CharSequence mo2204G() {
        return this.f6675x;
    }

    @Override // p000a.C0660MU, p000a.InterfaceC1037TS
    /* renamed from: I */
    public final void mo1462I(ListAdapter listAdapter) {
        super.mo1462I(listAdapter);
        this.f6673T = listAdapter;
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: N */
    public final void mo2205N(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean mo399h = mo399h();
        m3790g();
        C1630ef c1630ef = this.f2138i;
        c1630ef.setInputMethodMode(2);
        mo396Q();
        C2409tO c2409tO = this.f2145w;
        int i3 = 1;
        c2409tO.setChoiceMode(1);
        AbstractC1263Xf.m2563P(c2409tO, i);
        AbstractC1263Xf.m2565v(c2409tO, i2);
        C2184p9 c2184p9 = this.f6672K;
        int selectedItemPosition = c2184p9.getSelectedItemPosition();
        C2409tO c2409tO2 = this.f2145w;
        if (mo399h() && c2409tO2 != null) {
            c2409tO2.f7365y = false;
            c2409tO2.setSelection(selectedItemPosition);
            if (c2409tO2.getChoiceMode() != 0) {
                c2409tO2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!mo399h && (viewTreeObserver = c2184p9.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1238X7 viewTreeObserverOnGlobalLayoutListenerC1238X7 = new ViewTreeObserverOnGlobalLayoutListenerC1238X7(i3, this);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1238X7);
            c1630ef.setOnDismissListener(new C0906R5(this, viewTreeObserverOnGlobalLayoutListenerC1238X7));
        }
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: S */
    public final void mo2208S(CharSequence charSequence) {
        this.f6675x = charSequence;
    }

    /* renamed from: g */
    public final void m3790g() {
        int i;
        int i2;
        Drawable m1465W = m1465W();
        C2184p9 c2184p9 = this.f6672K;
        if (m1465W != null) {
            m1465W.getPadding(c2184p9.f6691y);
            if (AbstractC1586ds.m3062z(c2184p9)) {
                i = c2184p9.f6691y.right;
            } else {
                i = -c2184p9.f6691y.left;
            }
        } else {
            Rect rect = c2184p9.f6691y;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = c2184p9.getPaddingLeft();
        int paddingRight = c2184p9.getPaddingRight();
        int width = c2184p9.getWidth();
        int i3 = c2184p9.f6687g;
        if (i3 == -2) {
            int m3791z = c2184p9.m3791z((SpinnerAdapter) this.f6673T, m1465W());
            int i4 = c2184p9.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = c2184p9.f6691y;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (m3791z > i5) {
                m3791z = i5;
            }
            i3 = Math.max(m3791z, (width - paddingLeft) - paddingRight);
        } else if (i3 == -1) {
            i3 = (width - paddingLeft) - paddingRight;
        }
        m1466k(i3);
        if (AbstractC1586ds.m3062z(c2184p9)) {
            i2 = (((width - paddingRight) - this.f2142q) - this.f6671B) + i;
        } else {
            i2 = paddingLeft + this.f6671B + i;
        }
        this.f2140k = i2;
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: q */
    public final void mo2211q(int i) {
        this.f6671B = i;
    }
}
