package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* renamed from: a.S0 */
/* loaded from: classes.dex */
public final class C0960S0 extends ArrayAdapter {

    /* renamed from: h */
    public ColorStateList f3263h;

    /* renamed from: v */
    public final /* synthetic */ C1691fn f3264v;

    /* renamed from: z */
    public ColorStateList f3265z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0960S0(C1691fn c1691fn, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        boolean z3;
        this.f3264v = c1691fn;
        ColorStateList colorStateList2 = c1691fn.f5298E;
        if (colorStateList2 != null) {
            z = true;
        } else {
            z = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f3263h = colorStateList;
        if (c1691fn.f5299U != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ColorStateList colorStateList4 = c1691fn.f5298E;
            if (colorStateList4 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int[] iArr2 = {16843623, -16842919};
                int[] iArr3 = {16842913, -16842919};
                int colorForState = colorStateList4.getColorForState(iArr3, 0);
                int colorForState2 = c1691fn.f5298E.getColorForState(iArr2, 0);
                int i2 = c1691fn.f5299U;
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0106C4.m228h(colorForState, i2), AbstractC0106C4.m228h(colorForState2, i2), i2});
            }
        }
        this.f3265z = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C1691fn c1691fn = this.f3264v;
            RippleDrawable rippleDrawable = null;
            if (c1691fn.getText().toString().contentEquals(textView.getText())) {
                if (c1691fn.f5299U != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ColorDrawable colorDrawable = new ColorDrawable(c1691fn.f5299U);
                    if (this.f3263h != null) {
                        AbstractC0235ET.m478o(colorDrawable, this.f3265z);
                        rippleDrawable = new RippleDrawable(this.f3263h, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
            }
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4127q(textView, rippleDrawable);
        }
        return view2;
    }
}
