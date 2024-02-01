package p000a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.ok */
/* loaded from: classes.dex */
public abstract class AbstractC2160ok {
    /* renamed from: h */
    public static int m3772h(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    /* renamed from: v */
    public static void m3773v(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: z */
    public static Drawable m3774z(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }
}
