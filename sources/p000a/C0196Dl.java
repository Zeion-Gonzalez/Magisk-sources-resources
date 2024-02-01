package p000a;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.Dl */
/* loaded from: classes.dex */
public final class C0196Dl implements TextWatcher, SpanWatcher {

    /* renamed from: R */
    public final AtomicInteger f598R = new AtomicInteger(0);

    /* renamed from: S */
    public final Object f599S;

    public C0196Dl(Object obj) {
        this.f599S = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f599S).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f599S).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        this.f598R.get();
        ((SpanWatcher) this.f599S).onSpanAdded(spannable, obj, i, i2);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        this.f598R.get();
        if (Build.VERSION.SDK_INT < 28) {
            if (i > i2) {
                i = 0;
            }
            if (i3 > i4) {
                i5 = i;
                i6 = 0;
                ((SpanWatcher) this.f599S).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }
        i5 = i;
        i6 = i3;
        ((SpanWatcher) this.f599S).onSpanChanged(spannable, obj, i5, i2, i6, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        this.f598R.get();
        ((SpanWatcher) this.f599S).onSpanRemoved(spannable, obj, i, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f599S).onTextChanged(charSequence, i, i2, i3);
    }
}
