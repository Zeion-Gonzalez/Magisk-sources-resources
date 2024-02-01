package p000a;

import android.view.View;
import androidx.appcompat.widget.C2755N;
import androidx.appcompat.widget.Toolbar;

/* renamed from: a.BD */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0061BD implements View.OnClickListener {

    /* renamed from: S */
    public final /* synthetic */ Toolbar f256S;

    public ViewOnClickListenerC0061BD(Toolbar toolbar) {
        this.f256S = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1117Uu c1117Uu;
        C2755N c2755n = this.f256S.f8825HL;
        if (c2755n == null) {
            c1117Uu = null;
        } else {
            c1117Uu = c2755n.f8781R;
        }
        if (c1117Uu != null) {
            c1117Uu.collapseActionView();
        }
    }
}
