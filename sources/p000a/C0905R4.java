package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* renamed from: a.R4 */
/* loaded from: classes.dex */
public final class C0905R4 {

    /* renamed from: N */
    public String f3099N;

    /* renamed from: P */
    public float f3100P;

    /* renamed from: Q */
    public boolean f3101Q;

    /* renamed from: h */
    public final int f3102h;

    /* renamed from: u */
    public int f3103u;

    /* renamed from: v */
    public int f3104v;

    /* renamed from: z */
    public final boolean f3105z;

    public C0905R4(C0905R4 c0905r4, Object obj) {
        this.f3105z = false;
        c0905r4.getClass();
        this.f3102h = c0905r4.f3102h;
        m2063h(obj);
    }

    /* renamed from: z */
    public static void m2062z(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        int resourceId;
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0917RG.f3153P);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index != 3) {
                    i4 = 4;
                    if (index != 2) {
                        if (index == 7) {
                            dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                        } else if (index == 4) {
                            dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                        } else if (index == 5) {
                            obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                            i = 2;
                        } else {
                            if (index == 6) {
                                resourceId = obtainStyledAttributes.getInteger(index, -1);
                            } else if (index == 9) {
                                obj = obtainStyledAttributes.getString(index);
                                i = 5;
                            } else {
                                i3 = 8;
                                if (index == 8) {
                                    resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                    if (resourceId == -1) {
                                        resourceId = obtainStyledAttributes.getInt(index, -1);
                                    }
                                }
                            }
                            obj = Integer.valueOf(resourceId);
                            i = i3;
                        }
                        obj = Float.valueOf(dimension);
                        i = 7;
                    }
                }
                i3 = i4;
                resourceId = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(resourceId);
                i = i3;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C0905R4(str, i, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    public final void m2063h(Object obj) {
        switch (AbstractC2441tz.m4204s(this.f3102h)) {
            case AbstractC0795Op.f2698E /* 0 */:
            case 7:
                this.f3104v = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f3100P = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f3103u = ((Integer) obj).intValue();
                return;
            case 4:
                this.f3099N = (String) obj;
                return;
            case 5:
                this.f3101Q = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }

    public C0905R4(String str, int i, Object obj, boolean z) {
        this.f3105z = false;
        this.f3102h = i;
        this.f3105z = z;
        m2063h(obj);
    }
}
