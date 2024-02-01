package androidx.appcompat.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2759z implements View.OnClickListener {

    /* renamed from: S */
    public final /* synthetic */ SearchView f8869S;

    public ViewOnClickListenerC2759z(SearchView searchView) {
        this.f8869S = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f8869S;
        ImageView imageView = searchView.f8809p;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f8790H;
        if (view == imageView) {
            searchView.m4726g(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.m4730z(true);
        } else {
            if (view == searchView.f8793L) {
                searchView.m4724R();
                return;
            }
            if (view == searchView.f8802j) {
                searchView.m4729w();
            } else if (view != searchView.f8801i && view == searchAutoComplete) {
                searchView.m4725S();
            }
        }
    }
}
