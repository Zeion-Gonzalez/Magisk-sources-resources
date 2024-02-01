package p000a;

import android.text.Spannable;
import android.text.SpannableString;

/* renamed from: a.wE */
/* loaded from: classes.dex */
public final class C2560wE extends Spannable.Factory {

    /* renamed from: z */
    public static final /* synthetic */ int f7825z = 0;

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
    }
}
