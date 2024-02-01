package p000a;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: a.gu */
/* loaded from: classes.dex */
public final class C1750gu implements TextWatcher {

    /* renamed from: S */
    public final /* synthetic */ SearchView f5517S;

    public C1750gu(SearchView searchView) {
        this.f5517S = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.f5517S;
        TextUtils.isEmpty(searchView.f8790H.getText());
        searchView.f8802j.setVisibility(8);
        searchView.f8801i.setVisibility(8);
        searchView.m4723I();
        searchView.f8787C.setVisibility(8);
        if (searchView.f8804m != null && !TextUtils.equals(charSequence, searchView.f8791HL)) {
            C1182W7 c1182w7 = searchView.f8804m;
            String charSequence2 = charSequence.toString();
            C1164Vn c1164Vn = (C1164Vn) c1182w7.f3861z.f9599U8.getValue();
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            c1164Vn.f3791s = charSequence2;
            c1164Vn.m2381k(charSequence2);
        }
        searchView.f8791HL = charSequence.toString();
    }
}
