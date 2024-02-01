package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.P */
/* loaded from: classes.dex */
public final class RunnableC2756P implements Runnable {

    /* renamed from: S */
    public final /* synthetic */ SearchView.SearchAutoComplete f8784S;

    public RunnableC2756P(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f8784S = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f8784S;
        if (searchAutoComplete.f8814g) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f8814g = false;
        }
    }
}
