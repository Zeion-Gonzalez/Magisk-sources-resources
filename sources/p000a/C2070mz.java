package p000a;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: a.mz */
/* loaded from: classes.dex */
public final class C2070mz implements TextView.OnEditorActionListener {

    /* renamed from: z */
    public final /* synthetic */ SearchView f6424z;

    public C2070mz(SearchView searchView) {
        this.f6424z = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f6424z.m4729w();
        return true;
    }
}
