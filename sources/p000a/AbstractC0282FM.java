package p000a;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;

/* renamed from: a.FM */
/* loaded from: classes.dex */
public abstract class AbstractC0282FM extends AbstractC2760z {

    /* renamed from: L */
    public final TextView f982L;

    /* renamed from: O */
    public AbstractC2615xD f983O;

    /* renamed from: d */
    public Object f984d;

    /* renamed from: i */
    public final Object f985i;

    /* renamed from: j */
    public final TextView f986j;

    public AbstractC0282FM(Object obj, View view, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, TextView textView) {
        super(2, view, obj);
        this.f982L = radioButton;
        this.f985i = radioButton2;
        this.f984d = radioButton3;
        this.f986j = textView;
    }

    public AbstractC0282FM(Object obj, View view, TextView textView, TextView textView2, AbstractC0353Gl abstractC0353Gl) {
        super(3, view, obj);
        this.f986j = textView;
        this.f982L = textView2;
        this.f985i = abstractC0353Gl;
    }
}
