package p000a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.topjohnwu.magisk.R;

/* renamed from: a.iC */
/* loaded from: classes.dex */
public abstract class AbstractC1815iC extends ImageButton {

    /* renamed from: S */
    public int f5681S;

    public AbstractC1815iC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.floatingActionButtonStyle);
        this.f5681S = getVisibility();
    }

    /* renamed from: v */
    public final void m3373v(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f5681S = i;
        }
    }
}
