package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.topjohnwu.magisk.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.l4 */
/* loaded from: classes.dex */
public final class C1971l4 {

    /* renamed from: G */
    public final int f6096G;

    /* renamed from: M */
    public final int f6097M;

    /* renamed from: N */
    public final float f6098N;

    /* renamed from: P */
    public final float f6099P;

    /* renamed from: Q */
    public final float f6100Q;

    /* renamed from: W */
    public final int f6101W;

    /* renamed from: h */
    public final C0053B2 f6102h = new C0053B2();

    /* renamed from: o */
    public final float f6103o;

    /* renamed from: u */
    public final float f6104u;

    /* renamed from: v */
    public final float f6105v;

    /* renamed from: z */
    public final C0053B2 f6106z;

    public C1971l4(Context context, C0053B2 c0053b2) {
        AttributeSet attributeSet;
        int i;
        int i2;
        boolean z;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        int intValue15;
        int intValue16;
        boolean booleanValue;
        Locale locale;
        Locale.Category category;
        int next;
        int i3 = c0053b2.f215S;
        if (i3 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i3);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        i = asAttributeSet.getStyleAttribute();
                        attributeSet = asAttributeSet;
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        if (i == 0) {
            i2 = 2131952677;
        } else {
            i2 = i;
        }
        TypedArray m1817K = AbstractC0795Op.m1817K(context, attributeSet, AbstractC0863Q8.f2946v, R.attr.badgeStyle, i2, new int[0]);
        Resources resources = context.getResources();
        this.f6105v = m1817K.getDimensionPixelSize(4, -1);
        this.f6101W = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f6096G = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f6099P = m1817K.getDimensionPixelSize(14, -1);
        this.f6098N = m1817K.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f6104u = m1817K.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f6100Q = m1817K.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f6103o = m1817K.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f6097M = m1817K.getInt(24, 1);
        C0053B2 c0053b22 = this.f6102h;
        int i4 = c0053b2.f232s;
        c0053b22.f232s = i4 == -2 ? 255 : i4;
        int i5 = c0053b2.f207E;
        if (i5 != -2) {
            c0053b22.f207E = i5;
        } else if (m1817K.hasValue(23)) {
            this.f6102h.f207E = m1817K.getInt(23, 0);
        } else {
            this.f6102h.f207E = -1;
        }
        String str = c0053b2.f216U;
        if (str != null) {
            this.f6102h.f216U = str;
        } else if (m1817K.hasValue(7)) {
            this.f6102h.f216U = m1817K.getString(7);
        }
        C0053B2 c0053b23 = this.f6102h;
        c0053b23.f211J = c0053b2.f211J;
        CharSequence charSequence = c0053b2.f220c;
        c0053b23.f220c = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C0053B2 c0053b24 = this.f6102h;
        int i6 = c0053b2.f209H;
        c0053b24.f209H = i6 == 0 ? R.plurals.mtrl_badge_content_description : i6;
        int i7 = c0053b2.f222e;
        c0053b24.f222e = i7 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i7;
        Boolean bool = c0053b2.f208F;
        if (bool != null && !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        c0053b24.f208F = Boolean.valueOf(z);
        C0053B2 c0053b25 = this.f6102h;
        int i8 = c0053b2.f223f;
        c0053b25.f223f = i8 == -2 ? m1817K.getInt(21, -2) : i8;
        C0053B2 c0053b26 = this.f6102h;
        int i9 = c0053b2.f231r;
        c0053b26.f231r = i9 == -2 ? m1817K.getInt(22, -2) : i9;
        C0053B2 c0053b27 = this.f6102h;
        Integer num = c0053b2.f230q;
        if (num == null) {
            intValue = m1817K.getResourceId(5, 2131952006);
        } else {
            intValue = num.intValue();
        }
        c0053b27.f230q = Integer.valueOf(intValue);
        C0053B2 c0053b28 = this.f6102h;
        Integer num2 = c0053b2.f227k;
        if (num2 == null) {
            intValue2 = m1817K.getResourceId(6, 0);
        } else {
            intValue2 = num2.intValue();
        }
        c0053b28.f227k = Integer.valueOf(intValue2);
        C0053B2 c0053b29 = this.f6102h;
        Integer num3 = c0053b2.f224g;
        if (num3 == null) {
            intValue3 = m1817K.getResourceId(15, 2131952006);
        } else {
            intValue3 = num3.intValue();
        }
        c0053b29.f224g = Integer.valueOf(intValue3);
        C0053B2 c0053b210 = this.f6102h;
        Integer num4 = c0053b2.f235y;
        if (num4 == null) {
            intValue4 = m1817K.getResourceId(16, 0);
        } else {
            intValue4 = num4.intValue();
        }
        c0053b210.f235y = Integer.valueOf(intValue4);
        C0053B2 c0053b211 = this.f6102h;
        Integer num5 = c0053b2.f214R;
        if (num5 == null) {
            intValue5 = AbstractC0795Op.m1812H(context, m1817K, 1).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        c0053b211.f214R = Integer.valueOf(intValue5);
        C0053B2 c0053b212 = this.f6102h;
        Integer num6 = c0053b2.f210I;
        if (num6 == null) {
            intValue6 = m1817K.getResourceId(8, 2131952150);
        } else {
            intValue6 = num6.intValue();
        }
        c0053b212.f210I = Integer.valueOf(intValue6);
        Integer num7 = c0053b2.f233w;
        if (num7 != null) {
            this.f6102h.f233w = num7;
        } else if (m1817K.hasValue(9)) {
            this.f6102h.f233w = Integer.valueOf(AbstractC0795Op.m1812H(context, m1817K, 9).getDefaultColor());
        } else {
            int intValue17 = this.f6102h.f210I.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue17, AbstractC0863Q8.f2941p);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList m1812H = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 3);
            AbstractC0795Op.m1812H(context, obtainStyledAttributes, 4);
            AbstractC0795Op.m1812H(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i10, 0);
            obtainStyledAttributes.getString(i10);
            obtainStyledAttributes.getBoolean(14, false);
            AbstractC0795Op.m1812H(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue17, AbstractC0863Q8.f2934f);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f6102h.f233w = Integer.valueOf(m1812H.getDefaultColor());
        }
        C0053B2 c0053b213 = this.f6102h;
        Integer num8 = c0053b2.f217X;
        if (num8 == null) {
            intValue7 = m1817K.getInt(2, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        c0053b213.f217X = Integer.valueOf(intValue7);
        C0053B2 c0053b214 = this.f6102h;
        Integer num9 = c0053b2.f219Z;
        if (num9 == null) {
            intValue8 = m1817K.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = num9.intValue();
        }
        c0053b214.f219Z = Integer.valueOf(intValue8);
        C0053B2 c0053b215 = this.f6102h;
        Integer num10 = c0053b2.f206C;
        if (num10 == null) {
            intValue9 = m1817K.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = num10.intValue();
        }
        c0053b215.f206C = Integer.valueOf(intValue9);
        C0053B2 c0053b216 = this.f6102h;
        Integer num11 = c0053b2.f229p;
        if (num11 == null) {
            intValue10 = m1817K.getDimensionPixelOffset(18, 0);
        } else {
            intValue10 = num11.intValue();
        }
        c0053b216.f229p = Integer.valueOf(intValue10);
        C0053B2 c0053b217 = this.f6102h;
        Integer num12 = c0053b2.f226j;
        if (num12 == null) {
            intValue11 = m1817K.getDimensionPixelOffset(25, 0);
        } else {
            intValue11 = num12.intValue();
        }
        c0053b217.f226j = Integer.valueOf(intValue11);
        C0053B2 c0053b218 = this.f6102h;
        Integer num13 = c0053b2.f212L;
        if (num13 == null) {
            intValue12 = m1817K.getDimensionPixelOffset(19, c0053b218.f229p.intValue());
        } else {
            intValue12 = num13.intValue();
        }
        c0053b218.f212L = Integer.valueOf(intValue12);
        C0053B2 c0053b219 = this.f6102h;
        Integer num14 = c0053b2.f225i;
        if (num14 == null) {
            intValue13 = m1817K.getDimensionPixelOffset(26, c0053b219.f226j.intValue());
        } else {
            intValue13 = num14.intValue();
        }
        c0053b219.f225i = Integer.valueOf(intValue13);
        C0053B2 c0053b220 = this.f6102h;
        Integer num15 = c0053b2.f228n;
        if (num15 == null) {
            intValue14 = m1817K.getDimensionPixelOffset(20, 0);
        } else {
            intValue14 = num15.intValue();
        }
        c0053b220.f228n = Integer.valueOf(intValue14);
        C0053B2 c0053b221 = this.f6102h;
        Integer num16 = c0053b2.f221d;
        if (num16 == null) {
            intValue15 = 0;
        } else {
            intValue15 = num16.intValue();
        }
        c0053b221.f221d = Integer.valueOf(intValue15);
        C0053B2 c0053b222 = this.f6102h;
        Integer num17 = c0053b2.f213O;
        if (num17 == null) {
            intValue16 = 0;
        } else {
            intValue16 = num17.intValue();
        }
        c0053b222.f213O = Integer.valueOf(intValue16);
        C0053B2 c0053b223 = this.f6102h;
        Boolean bool2 = c0053b2.f234x;
        if (bool2 == null) {
            booleanValue = m1817K.getBoolean(0, false);
        } else {
            booleanValue = bool2.booleanValue();
        }
        c0053b223.f234x = Boolean.valueOf(booleanValue);
        m1817K.recycle();
        Locale locale2 = c0053b2.f218Y;
        if (locale2 == null) {
            C0053B2 c0053b224 = this.f6102h;
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            c0053b224.f218Y = locale;
        } else {
            this.f6102h.f218Y = locale2;
        }
        this.f6106z = c0053b2;
    }
}
