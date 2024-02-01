package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.Db */
/* loaded from: classes.dex */
public final class C0186Db {

    /* renamed from: v */
    public static final ThreadLocal f574v = new ThreadLocal();

    /* renamed from: h */
    public final C1931kK f575h;

    /* renamed from: z */
    public final Context f576z;

    public C0186Db(Context context, C1931kK c1931kK) {
        this.f576z = context;
        this.f575h = c1931kK;
    }

    /* renamed from: v */
    public static C2419tZ m370v(TypedArray typedArray, Resources resources, int i) {
        AbstractC0929RT abstractC0929RT;
        TypedValue typedValue;
        AbstractC0929RT abstractC0929RT2;
        AbstractC0929RT abstractC0929RT3;
        AbstractC0929RT abstractC0929RT4;
        AbstractC0929RT abstractC0929RT5;
        Object obj;
        AbstractC0929RT abstractC0929RT6;
        AbstractC0929RT m3148Q;
        float f;
        AbstractC0929RT m3148Q2;
        int dimension;
        boolean z;
        boolean z2;
        String str;
        boolean z3 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f574v;
        TypedValue typedValue2 = (TypedValue) threadLocal.get();
        if (typedValue2 == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        String string = typedArray.getString(2);
        AbstractC0929RT abstractC0929RT7 = AbstractC0929RT.f3192o;
        AbstractC0929RT abstractC0929RT8 = AbstractC0929RT.f3189V;
        AbstractC0929RT abstractC0929RT9 = AbstractC0929RT.f3184G;
        AbstractC0929RT abstractC0929RT10 = AbstractC0929RT.f3188Q;
        AbstractC0929RT abstractC0929RT11 = AbstractC0929RT.f3194v;
        AbstractC0929RT abstractC0929RT12 = AbstractC0929RT.f3187P;
        AbstractC0929RT abstractC0929RT13 = AbstractC0929RT.f3186N;
        C0930RU c0930ru = AbstractC0929RT.f3190W;
        AbstractC0929RT abstractC0929RT14 = AbstractC0929RT.f3185M;
        C0930RU c0930ru2 = AbstractC0929RT.f3193u;
        C0930RU c0930ru3 = AbstractC0929RT.f3191h;
        AbstractC0929RT abstractC0929RT15 = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            TypedValue typedValue3 = typedValue2;
            if (AbstractC1292YB.m2695u(c0930ru3.mo1954h(), string)) {
                abstractC0929RT3 = c0930ru3;
            } else {
                if (AbstractC1292YB.m2695u(abstractC0929RT12.mo1954h(), string)) {
                    abstractC0929RT = abstractC0929RT7;
                    abstractC0929RT3 = abstractC0929RT12;
                } else if (AbstractC1292YB.m2695u(abstractC0929RT13.mo1954h(), string)) {
                    abstractC0929RT = abstractC0929RT7;
                    abstractC0929RT3 = abstractC0929RT13;
                } else if (AbstractC1292YB.m2695u(abstractC0929RT10.mo1954h(), string)) {
                    abstractC0929RT = abstractC0929RT7;
                    abstractC0929RT3 = abstractC0929RT10;
                } else if (AbstractC1292YB.m2695u(c0930ru.mo1954h(), string)) {
                    abstractC0929RT = abstractC0929RT7;
                    abstractC0929RT3 = c0930ru;
                } else if (AbstractC1292YB.m2695u(abstractC0929RT9.mo1954h(), string)) {
                    abstractC0929RT = abstractC0929RT7;
                    abstractC0929RT3 = abstractC0929RT9;
                } else {
                    if (!AbstractC1292YB.m2695u(abstractC0929RT14.mo1954h(), string)) {
                        if (AbstractC1292YB.m2695u(abstractC0929RT8.mo1954h(), string)) {
                            abstractC0929RT3 = abstractC0929RT8;
                        } else if (AbstractC1292YB.m2695u(c0930ru2.mo1954h(), string)) {
                            abstractC0929RT3 = c0930ru2;
                        } else if (AbstractC1292YB.m2695u(abstractC0929RT7.mo1954h(), string)) {
                            abstractC0929RT3 = abstractC0929RT7;
                        } else if (AbstractC1292YB.m2695u(abstractC0929RT11.mo1954h(), string)) {
                            abstractC0929RT3 = abstractC0929RT11;
                        } else {
                            if (string.length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                try {
                                    if (string.startsWith(".") && resourcePackageName != null) {
                                        str = resourcePackageName.concat(string);
                                    } else {
                                        str = string;
                                    }
                                    if (string.endsWith("[]")) {
                                        abstractC0929RT = abstractC0929RT7;
                                        str = str.substring(0, str.length() - 2);
                                        Class<?> cls = Class.forName(str);
                                        if (Parcelable.class.isAssignableFrom(cls)) {
                                            abstractC0929RT3 = new C0839Pe(cls);
                                        } else {
                                            if (Serializable.class.isAssignableFrom(cls)) {
                                                abstractC0929RT3 = new C1196WM(cls);
                                            }
                                            throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                        }
                                    } else {
                                        abstractC0929RT = abstractC0929RT7;
                                        Class<?> cls2 = Class.forName(str);
                                        if (Parcelable.class.isAssignableFrom(cls2)) {
                                            abstractC0929RT3 = new C1562dN(cls2);
                                        } else if (Enum.class.isAssignableFrom(cls2)) {
                                            abstractC0929RT3 = new C0971SE(cls2);
                                        } else {
                                            if (Serializable.class.isAssignableFrom(cls2)) {
                                                abstractC0929RT3 = new C1028TI(cls2);
                                            }
                                            throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                        }
                                    }
                                } catch (ClassNotFoundException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                    abstractC0929RT = abstractC0929RT7;
                    abstractC0929RT3 = abstractC0929RT14;
                }
                abstractC0929RT2 = abstractC0929RT8;
                typedValue = typedValue3;
            }
            abstractC0929RT = abstractC0929RT7;
            abstractC0929RT2 = abstractC0929RT8;
            typedValue = typedValue3;
        } else {
            abstractC0929RT = abstractC0929RT7;
            typedValue = typedValue2;
            abstractC0929RT2 = abstractC0929RT8;
            abstractC0929RT3 = null;
        }
        boolean z4 = true;
        if (typedArray.getValue(1, typedValue)) {
            abstractC0929RT4 = abstractC0929RT9;
            abstractC0929RT5 = abstractC0929RT10;
            if (abstractC0929RT3 == abstractC0929RT11) {
                dimension = typedValue.resourceId;
                if (dimension != 0) {
                    abstractC0929RT11 = abstractC0929RT3;
                    z4 = true;
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    abstractC0929RT11 = abstractC0929RT3;
                    z4 = true;
                    dimension = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC0929RT3.mo1954h() + ". Must be a reference to a resource.");
                }
            } else {
                int i2 = typedValue.resourceId;
                if (i2 != 0) {
                    if (abstractC0929RT3 == null) {
                        obj = Integer.valueOf(i2);
                        z4 = true;
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC0929RT3.mo1954h() + ". You must use a \"" + abstractC0929RT11.mo1954h() + "\" type to reference other resources.");
                    }
                } else {
                    z4 = true;
                    if (abstractC0929RT3 == abstractC0929RT14) {
                        abstractC0929RT11 = abstractC0929RT3;
                        obj = typedArray.getString(1);
                    } else {
                        int i3 = typedValue.type;
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    if (i3 != 18) {
                                        if (i3 >= 16 && i3 <= 31) {
                                            if (abstractC0929RT3 == c0930ru2) {
                                                m3148Q = C1665fK.m3148Q(typedValue, abstractC0929RT3, c0930ru2, string, "float");
                                                f = typedValue.data;
                                            } else {
                                                m3148Q2 = C1665fK.m3148Q(typedValue, abstractC0929RT3, c0930ru3, string, "integer");
                                                dimension = typedValue.data;
                                            }
                                        } else {
                                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                        }
                                    } else {
                                        abstractC0929RT11 = C1665fK.m3148Q(typedValue, abstractC0929RT3, c0930ru, string, "boolean");
                                        if (typedValue.data != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        obj = Boolean.valueOf(z);
                                    }
                                } else {
                                    m3148Q2 = C1665fK.m3148Q(typedValue, abstractC0929RT3, c0930ru3, string, "dimension");
                                    dimension = (int) typedValue.getDimension(resources.getDisplayMetrics());
                                }
                                abstractC0929RT11 = m3148Q2;
                            } else {
                                m3148Q = C1665fK.m3148Q(typedValue, abstractC0929RT3, c0930ru2, string, "float");
                                f = typedValue.getFloat();
                            }
                            abstractC0929RT11 = m3148Q;
                            obj = Float.valueOf(f);
                        } else {
                            String obj2 = typedValue.string.toString();
                            if (abstractC0929RT3 == null) {
                                try {
                                    try {
                                        try {
                                            try {
                                                c0930ru3.mo1955v(obj2);
                                                abstractC0929RT3 = c0930ru3;
                                            } catch (IllegalArgumentException unused) {
                                                c0930ru.mo1955v(obj2);
                                                abstractC0929RT3 = c0930ru;
                                            }
                                        } catch (IllegalArgumentException unused2) {
                                            abstractC0929RT13.mo1955v(obj2);
                                            abstractC0929RT3 = abstractC0929RT13;
                                        }
                                    } catch (IllegalArgumentException unused3) {
                                        abstractC0929RT3 = abstractC0929RT14;
                                    }
                                } catch (IllegalArgumentException unused4) {
                                    c0930ru2.mo1955v(obj2);
                                    abstractC0929RT3 = c0930ru2;
                                }
                            }
                            abstractC0929RT11 = abstractC0929RT3;
                            obj = abstractC0929RT11.mo1955v(obj2);
                        }
                    }
                }
            }
            obj = Integer.valueOf(dimension);
        } else {
            abstractC0929RT4 = abstractC0929RT9;
            abstractC0929RT5 = abstractC0929RT10;
            abstractC0929RT11 = abstractC0929RT3;
            obj = null;
        }
        if (obj == null) {
            obj = null;
            z4 = false;
        }
        if (abstractC0929RT11 != null) {
            abstractC0929RT15 = abstractC0929RT11;
        }
        if (abstractC0929RT15 == null) {
            if (obj instanceof Integer) {
                abstractC0929RT6 = c0930ru3;
            } else if (obj instanceof int[]) {
                abstractC0929RT6 = abstractC0929RT12;
            } else if (obj instanceof Long) {
                abstractC0929RT6 = abstractC0929RT13;
            } else if (obj instanceof long[]) {
                abstractC0929RT6 = abstractC0929RT5;
            } else {
                AbstractC0929RT abstractC0929RT16 = c0930ru2;
                if (!(obj instanceof Float)) {
                    if (obj instanceof float[]) {
                        abstractC0929RT6 = abstractC0929RT;
                    } else if (obj instanceof Boolean) {
                        abstractC0929RT6 = c0930ru;
                    } else if (obj instanceof boolean[]) {
                        abstractC0929RT6 = abstractC0929RT4;
                    } else if (!(obj instanceof String) && obj != null) {
                        if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                            abstractC0929RT6 = abstractC0929RT2;
                        } else if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                            abstractC0929RT16 = new C0839Pe(obj.getClass().getComponentType());
                        } else if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                            abstractC0929RT16 = new C1196WM(obj.getClass().getComponentType());
                        } else if (obj instanceof Parcelable) {
                            abstractC0929RT16 = new C1562dN(obj.getClass());
                        } else if (obj instanceof Enum) {
                            abstractC0929RT16 = new C0971SE(obj.getClass());
                        } else if (obj instanceof Serializable) {
                            abstractC0929RT16 = new C1028TI(obj.getClass());
                        } else {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                    } else {
                        abstractC0929RT6 = abstractC0929RT14;
                    }
                }
                abstractC0929RT6 = abstractC0929RT16;
            }
        } else {
            abstractC0929RT6 = abstractC0929RT15;
        }
        return new C2419tZ(abstractC0929RT6, z3, obj, z4);
    }

    /* renamed from: h */
    public final C1951kj m371h(int i) {
        int next;
        Resources resources = this.f576z.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        C1420ag m372z = m372z(resources, xml, asAttributeSet, i);
        if (m372z instanceof C1951kj) {
            return (C1951kj) m372z;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0243, code lost:
    
        return r4;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C1420ag m372z(android.content.res.Resources r27, android.content.res.XmlResourceParser r28, android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0186Db.m372z(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):a.ag");
    }
}
