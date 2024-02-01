package p000a;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: a.WK */
/* loaded from: classes.dex */
public final class C1194WK {

    /* renamed from: z */
    public final /* synthetic */ C1997lY f3882z;

    public C1194WK(C1997lY c1997lY) {
        this.f3882z = c1997lY;
    }

    /* renamed from: z */
    public final void m2473z(TextInputLayout textInputLayout) {
        C1997lY c1997lY = this.f3882z;
        EditText editText = c1997lY.f6196e;
        if (editText == textInputLayout.f9453I) {
            return;
        }
        C1652f3 c1652f3 = c1997lY.f6200p;
        if (editText != null) {
            editText.removeTextChangedListener(c1652f3);
            if (c1997lY.f6196e.getOnFocusChangeListener() == c1997lY.m3618h().mo1473N()) {
                c1997lY.f6196e.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.f9453I;
        c1997lY.f6196e = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c1652f3);
        }
        c1997lY.m3618h().mo620S(c1997lY.f6196e);
        c1997lY.m3617W(c1997lY.m3618h());
    }
}
