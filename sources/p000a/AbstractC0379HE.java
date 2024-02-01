package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.HE */
/* loaded from: classes.dex */
public abstract class AbstractC0379HE {

    /* renamed from: z */
    public static final ThreadLocal f1296z = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0344  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList m868h(android.content.res.Resources r36, android.content.res.XmlResourceParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0379HE.m868h(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: z */
    public static ColorStateList m869z(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m868h(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
