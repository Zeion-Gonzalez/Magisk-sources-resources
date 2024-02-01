package p000a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.Nc */
/* loaded from: classes.dex */
public final class C0724Nc {

    /* renamed from: f */
    public static final Pattern f2428f = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: r */
    public static final Pattern f2429r = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: E */
    public boolean f2430E;

    /* renamed from: G */
    public boolean f2431G;

    /* renamed from: I */
    public boolean f2432I;

    /* renamed from: M */
    public boolean f2433M;

    /* renamed from: N */
    public final Type[] f2434N;

    /* renamed from: P */
    public final Annotation[][] f2435P;

    /* renamed from: Q */
    public boolean f2436Q;

    /* renamed from: R */
    public String f2437R;

    /* renamed from: S */
    public boolean f2438S;

    /* renamed from: U */
    public AbstractC1500cH[] f2439U;

    /* renamed from: V */
    public boolean f2440V;

    /* renamed from: W */
    public boolean f2441W;

    /* renamed from: g */
    public C1494c7 f2442g;

    /* renamed from: h */
    public final Method f2443h;

    /* renamed from: k */
    public String f2444k;

    /* renamed from: o */
    public boolean f2445o;

    /* renamed from: q */
    public boolean f2446q;

    /* renamed from: s */
    public LinkedHashSet f2447s;

    /* renamed from: u */
    public boolean f2448u;

    /* renamed from: v */
    public final Annotation[] f2449v;

    /* renamed from: w */
    public boolean f2450w;

    /* renamed from: y */
    public C0003A3 f2451y;

    /* renamed from: z */
    public final C0313Fz f2452z;

    public C0724Nc(C0313Fz c0313Fz, Method method) {
        this.f2452z = c0313Fz;
        this.f2443h = method;
        this.f2449v = method.getAnnotations();
        this.f2434N = method.getGenericParameterTypes();
        this.f2435P = method.getParameterAnnotations();
    }

    /* renamed from: z */
    public static Class m1681z(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* renamed from: h */
    public final void m1682h(String str, String str2, boolean z) {
        String str3 = this.f2437R;
        Method method = this.f2443h;
        if (str3 == null) {
            this.f2437R = str;
            this.f2450w = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = f2428f;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw AbstractC2575wW.m4390D(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f2444k = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f2447s = linkedHashSet;
            return;
        }
        throw AbstractC2575wW.m4390D(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    /* renamed from: v */
    public final void m1683v(int i, Type type) {
        if (AbstractC2575wW.m4439n(type)) {
            throw AbstractC2575wW.m4419Yd(this.f2443h, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
