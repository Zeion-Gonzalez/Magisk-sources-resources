package p000a;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: a.ws */
/* loaded from: classes.dex */
public final class C2594ws {

    /* renamed from: N */
    public final C1447b9 f7968N;

    /* renamed from: P */
    public final List f7969P;

    /* renamed from: Q */
    public final boolean f7970Q;

    /* renamed from: h */
    public final C1496cB f7971h;

    /* renamed from: v */
    public final C2276qr f7972v;

    /* renamed from: z */
    public final TextView.BufferType f7973z;

    public C2594ws(TextView.BufferType bufferType, C1447b9 c1447b9, C1496cB c1496cB, C2276qr c2276qr, List list, boolean z) {
        this.f7973z = bufferType;
        this.f7968N = c1447b9;
        this.f7971h = c1496cB;
        this.f7972v = c2276qr;
        this.f7969P = list;
        this.f7970Q = z;
    }

    /* renamed from: h */
    public final SpannableStringBuilder m4469h(String str) {
        List list = this.f7969P;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC2154od) it.next()).getClass();
        }
        C1496cB c1496cB = this.f7971h;
        c1496cB.getClass();
        if (str != null) {
            C1858j0 c1858j0 = new C1858j0(c1496cB.f4644z, c1496cB.f4643v, c1496cB.f4642h);
            int i = 0;
            while (true) {
                int length = str.length();
                int i2 = i;
                while (true) {
                    if (i2 < length) {
                        char charAt = str.charAt(i2);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 == -1) {
                    break;
                }
                c1858j0.m3480W(str.substring(i, i2));
                i = i2 + 1;
                if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                    i = i2 + 2;
                }
            }
            if (str.length() > 0 && (i == 0 || i < str.length())) {
                c1858j0.m3480W(str.substring(i));
            }
            c1858j0.m3479Q(c1858j0.f5802R);
            C1624eZ c1624eZ = new C1624eZ(c1858j0.f5798M, 18, c1858j0.f5803S);
            c1858j0.f5797G.getClass();
            C2105nf c2105nf = new C2105nf(c1624eZ);
            Iterator it2 = c1858j0.f5810w.iterator();
            while (it2.hasNext()) {
                ((AbstractC2392t) it2.next()).mo40Q(c2105nf);
            }
            C2634xc c2634xc = (C2634xc) c1858j0.f5804V.f5841h;
            Iterator it3 = c1496cB.f4641P.iterator();
            if (!it3.hasNext()) {
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    ((AbstractC2154od) it4.next()).getClass();
                }
                C2276qr c2276qr = this.f7972v;
                C2276qr c2276qr2 = (C2276qr) c2276qr.f6998z;
                C1774hM c1774hM = c2276qr.f6997h;
                C2528vZ c2528vZ = new C2528vZ(4);
                C0054B3 c0054b3 = (C0054B3) c2276qr2.f6997h;
                if (c0054b3 == null) {
                    c0054b3 = new C0054B3();
                }
                C0240Ea c0240Ea = new C0240Ea(c1774hM, c2528vZ, new C1682fd(), Collections.unmodifiableMap((Map) c2276qr2.f6998z), c0054b3);
                c2634xc.mo60z(c0240Ea);
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    ((AbstractC2154od) it5.next()).getClass();
                }
                C1682fd c1682fd = c0240Ea.f825v;
                c1682fd.getClass();
                C0388HN c0388hn = new C0388HN(c1682fd.f5271S);
                Iterator it6 = c1682fd.f5270R.iterator();
                while (it6.hasNext()) {
                    C0560KX c0560kx = (C0560KX) it6.next();
                    c0388hn.setSpan(c0560kx.f1827z, c0560kx.f1825h, c0560kx.f1826v, c0560kx.f1824P);
                }
                if (TextUtils.isEmpty(c0388hn) && this.f7970Q && !TextUtils.isEmpty(str)) {
                    return new SpannableStringBuilder(str);
                }
                return c0388hn;
            }
            AbstractC2441tz.m4202q(it3.next());
            throw null;
        }
        throw new NullPointerException("input must not be null");
    }

    /* renamed from: z */
    public final void m4470z(TextView textView, Spanned spanned) {
        C2618xG[] c2618xGArr;
        List list = this.f7969P;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0856Py) ((AbstractC2154od) it.next())).getClass();
            if ((spanned instanceof Spanned) && (c2618xGArr = (C2618xG[]) spanned.getSpans(0, spanned.length(), C2618xG.class)) != null) {
                TextPaint paint = textView.getPaint();
                for (C2618xG c2618xG : c2618xGArr) {
                    c2618xG.f8094I = (int) (paint.measureText(c2618xG.f8095R) + 0.5f);
                }
            }
            if (spanned instanceof Spannable) {
                Spannable spannable = (Spannable) spanned;
                C0162D9[] c0162d9Arr = (C0162D9[]) spannable.getSpans(0, spannable.length(), C0162D9.class);
                if (c0162d9Arr != null) {
                    for (C0162D9 c0162d9 : c0162d9Arr) {
                        spannable.removeSpan(c0162d9);
                    }
                }
                spannable.setSpan(new C0162D9(textView), 0, spannable.length(), 18);
            }
        }
        C1447b9 c1447b9 = this.f7968N;
        TextView.BufferType bufferType = this.f7973z;
        if (c1447b9 != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            int i = C2560wE.f7825z;
            textView.setSpannableFactory(AbstractC1359ZQ.f4268z);
            textView.setText(spanned, bufferType);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((C0856Py) ((AbstractC2154od) it2.next())).getClass();
                if (textView.getMovementMethod() == null) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            return;
        }
        textView.setText(spanned, bufferType);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((C0856Py) ((AbstractC2154od) it3.next())).getClass();
            if (textView.getMovementMethod() == null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }
}
