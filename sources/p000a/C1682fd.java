package p000a;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.fd */
/* loaded from: classes.dex */
public final class C1682fd implements Appendable, CharSequence {

    /* renamed from: R */
    public final ArrayDeque f5270R = new ArrayDeque(8);

    /* renamed from: S */
    public final StringBuilder f5271S = new StringBuilder((CharSequence) "");

    public C1682fd() {
        m3175h(0, "");
    }

    /* renamed from: v */
    public static void m3174v(C1682fd c1682fd, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    m3174v(c1682fd, obj2, i, i2);
                }
                return;
            }
            c1682fd.f5270R.push(new C0560KX(obj, i, i2, 33));
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f5271S.append(c);
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f5271S.charAt(i);
    }

    /* renamed from: h */
    public final void m3175h(int i, CharSequence charSequence) {
        int i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof C0388HN;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                i2 = spans.length;
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                ArrayDeque arrayDeque = this.f5270R;
                if (!z) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        Object obj = spans[i3];
                        arrayDeque.push(new C0560KX(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                while (true) {
                    i2--;
                    if (i2 >= 0) {
                        Object obj2 = spans[i2];
                        arrayDeque.push(new C0560KX(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2)));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5271S.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        boolean z;
        ArrayList arrayList;
        int i3;
        List<C0560KX> unmodifiableList;
        int length = length();
        if (i2 > i && i >= 0 && i2 <= length) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            unmodifiableList = Collections.emptyList();
        } else {
            ArrayDeque arrayDeque = this.f5270R;
            if (i == 0 && length == i2) {
                arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
            } else {
                arrayList = new ArrayList(0);
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    C0560KX c0560kx = (C0560KX) descendingIterator.next();
                    int i4 = c0560kx.f1825h;
                    if ((i4 >= i && i4 < i2) || (((i3 = c0560kx.f1826v) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList.add(c0560kx);
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        boolean isEmpty = unmodifiableList.isEmpty();
        StringBuilder sb = this.f5271S;
        if (isEmpty) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (C0560KX c0560kx2 : unmodifiableList) {
            int max = Math.max(0, c0560kx2.f1825h - i);
            spannableStringBuilder.setSpan(c0560kx2.f1827z, max, Math.min(length2, (c0560kx2.f1826v - c0560kx2.f1825h) + max), c0560kx2.f1824P);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5271S.toString();
    }

    /* renamed from: z */
    public final void m3176z(char c) {
        this.f5271S.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        m3175h(length(), charSequence);
        this.f5271S.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        m3175h(length(), subSequence);
        this.f5271S.append(subSequence);
        return this;
    }
}
