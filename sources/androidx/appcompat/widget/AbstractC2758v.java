package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public abstract class AbstractC2758v {
    /* renamed from: h */
    public static void m4760h(SearchView.SearchAutoComplete searchAutoComplete, int i) {
        searchAutoComplete.setInputMethodMode(i);
    }

    /* renamed from: z */
    public static void m4761z(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }
}
