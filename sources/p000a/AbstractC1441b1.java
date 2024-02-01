package p000a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.AbstractC2760z;

/* renamed from: a.b1 */
/* loaded from: classes.dex */
public abstract class AbstractC1441b1 extends AbstractC2760z {

    /* renamed from: L */
    public final TextView f4514L;

    /* renamed from: d */
    public C0471Iu f4515d;

    /* renamed from: i */
    public final Barrier f4516i;

    /* renamed from: j */
    public final ImageView f4517j;

    public AbstractC1441b1(Object obj, View view, ImageView imageView, TextView textView, Barrier barrier) {
        super(1, view, obj);
        this.f4517j = imageView;
        this.f4514L = textView;
        this.f4516i = barrier;
    }

    /* renamed from: s */
    public abstract void mo66s(C0471Iu c0471Iu);
}
