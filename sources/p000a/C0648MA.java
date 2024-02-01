package p000a;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: a.MA */
/* loaded from: classes.dex */
public final class C0648MA extends SpannableStringBuilder {

    /* renamed from: R */
    public final ArrayList f2085R;

    /* renamed from: S */
    public final Class f2086S;

    public C0648MA(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2085R = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f2086S = cls;
    }

    /* renamed from: P */
    public final void m1451P() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2085R;
            if (i < arrayList.size()) {
                ((C0196Dl) arrayList.get(i)).f598R.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0196Dl m1452h;
        if (m1453v(obj) && (m1452h = m1452h(obj)) != null) {
            obj = m1452h;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0196Dl m1452h;
        if (m1453v(obj) && (m1452h = m1452h(obj)) != null) {
            obj = m1452h;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0196Dl m1452h;
        if (m1453v(obj) && (m1452h = m1452h(obj)) != null) {
            obj = m1452h;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        boolean z;
        if (this.f2086S == cls) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0196Dl[] c0196DlArr = (C0196Dl[]) super.getSpans(i, i2, C0196Dl.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, c0196DlArr.length);
            for (int i3 = 0; i3 < c0196DlArr.length; i3++) {
                objArr[i3] = c0196DlArr[i3].f599S;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    /* renamed from: h */
    public final C0196Dl m1452h(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2085R;
            if (i >= arrayList.size()) {
                return null;
            }
            C0196Dl c0196Dl = (C0196Dl) arrayList.get(i);
            if (c0196Dl.f599S == obj) {
                return c0196Dl;
            }
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0009, code lost:
    
        if (r0 != false) goto L30;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class r0 = r1.f2086S
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<a.Dl> r4 = p000a.C0196Dl.class
        Ld:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0648MA.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0196Dl c0196Dl;
        if (m1453v(obj)) {
            c0196Dl = m1452h(obj);
            if (c0196Dl != null) {
                obj = c0196Dl;
            }
        } else {
            c0196Dl = null;
        }
        super.removeSpan(obj);
        if (c0196Dl != null) {
            this.f2085R.remove(c0196Dl);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m1453v(obj)) {
            C0196Dl c0196Dl = new C0196Dl(obj);
            this.f2085R.add(c0196Dl);
            obj = c0196Dl;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C0648MA(this.f2086S, this, i, i2);
    }

    /* renamed from: v */
    public final boolean m1453v(Object obj) {
        boolean z;
        if (obj == null) {
            return false;
        }
        if (this.f2086S == obj.getClass()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final void m1454z() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2085R;
            if (i < arrayList.size()) {
                ((C0196Dl) arrayList.get(i)).f598R.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public C0648MA(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f2085R = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f2086S = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m1454z();
        super.replace(i, i2, charSequence);
        m1451P();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m1454z();
        super.replace(i, i2, charSequence, i3, i4);
        m1451P();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }
}
