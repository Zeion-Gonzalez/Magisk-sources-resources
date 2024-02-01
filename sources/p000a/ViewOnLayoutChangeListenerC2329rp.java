package p000a;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.topjohnwu.magisk.R;

/* renamed from: a.rp */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2329rp implements View.OnLayoutChangeListener {

    /* renamed from: z */
    public final /* synthetic */ SearchView f7169z;

    public ViewOnLayoutChangeListenerC2329rp(SearchView searchView) {
        this.f7169z = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        SearchView searchView = this.f7169z;
        View view2 = searchView.f8799d;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f8789F.getPaddingLeft();
            Rect rect = new Rect();
            boolean m3062z = AbstractC1586ds.m3062z(searchView);
            if (searchView.f8803l) {
                i9 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            } else {
                i9 = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f8790H;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            if (m3062z) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + i9);
            }
            searchAutoComplete.setDropDownHorizontalOffset(i10);
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
        }
    }
}
