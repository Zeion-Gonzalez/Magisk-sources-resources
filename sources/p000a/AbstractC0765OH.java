package p000a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* renamed from: a.OH */
/* loaded from: classes.dex */
public abstract class AbstractC0765OH extends AbstractC2760z {

    /* renamed from: B */
    public InterfaceC2374sf f2595B;

    /* renamed from: L */
    public final TextView f2596L;

    /* renamed from: O */
    public final Button f2597O;

    /* renamed from: T */
    public final TextView f2598T;

    /* renamed from: d */
    public final LinearLayout f2599d;

    /* renamed from: i */
    public final Button f2600i;

    /* renamed from: j */
    public final ImageView f2601j;

    /* renamed from: n */
    public final TextView f2602n;

    /* renamed from: t */
    public final View f2603t;

    /* renamed from: x */
    public final View f2604x;

    public AbstractC0765OH(Object obj, View view, ImageView imageView, TextView textView, Button button, Button button2, TextView textView2, TextView textView3, LinearLayout linearLayout, Spinner spinner, TextView textView4) {
        super(1, view, obj);
        this.f2601j = imageView;
        this.f2596L = textView;
        this.f2600i = button;
        this.f2597O = button2;
        this.f2602n = textView2;
        this.f2604x = textView3;
        this.f2599d = linearLayout;
        this.f2603t = spinner;
        this.f2598T = textView4;
    }

    public AbstractC0765OH(Object obj, View view, MaterialCardView materialCardView, ImageView imageView, TextView textView, Button button, LinearLayout linearLayout, SwitchMaterial switchMaterial, Button button2, Button button3, TextView textView2) {
        super(1, view, obj);
        this.f2604x = materialCardView;
        this.f2601j = imageView;
        this.f2596L = textView;
        this.f2600i = button;
        this.f2599d = linearLayout;
        this.f2598T = switchMaterial;
        this.f2597O = button2;
        this.f2603t = button3;
        this.f2602n = textView2;
    }
}
