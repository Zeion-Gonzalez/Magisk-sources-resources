package p000a;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: a.of */
/* loaded from: classes.dex */
public final class C2156of implements InputFilter {

    /* renamed from: z */
    public final TextView f6619z;

    public C2156of(TextView textView) {
        this.f6619z = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f6619z.isInEditMode()) {
            return charSequence;
        }
        AbstractC2473ua.m4249z();
        throw null;
    }
}
