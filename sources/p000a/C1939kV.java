package p000a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.kV */
/* loaded from: classes.dex */
public final class C1939kV implements Serializable {

    /* renamed from: S */
    public final Pattern f6022S;

    public C1939kV(String str) {
        this.f6022S = Pattern.compile(str);
    }

    public final String toString() {
        return this.f6022S.toString();
    }

    /* renamed from: z */
    public final List m3557z(int i, CharSequence charSequence) {
        AbstractC1269Xn.m2573KM(i);
        Matcher matcher = this.f6022S.matcher(charSequence);
        if (i != 1 && matcher.find()) {
            int i2 = 10;
            if (i > 0 && i <= 10) {
                i2 = i;
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = i - 1;
            int i4 = 0;
            do {
                arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
                i4 = matcher.end();
                if (i3 >= 0 && arrayList.size() == i3) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
            return arrayList;
        }
        return Collections.singletonList(charSequence.toString());
    }
}
