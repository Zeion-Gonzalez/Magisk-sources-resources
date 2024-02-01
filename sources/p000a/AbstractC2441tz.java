package p000a;

import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: a.tz */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2441tz {

    /* renamed from: z */
    public static final /* synthetic */ int[] f7466z = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    /* renamed from: E */
    public static /* synthetic */ String m4183E(int i) {
        return i == 1 ? "UNKNOWN" : i == 2 ? "HORIZONTAL_DIMENSION" : i == 3 ? "VERTICAL_DIMENSION" : i == 4 ? "LEFT" : i == 5 ? "RIGHT" : i == 6 ? "TOP" : i == 7 ? "BOTTOM" : i == 8 ? "BASELINE" : "null";
    }

    /* renamed from: G */
    public static String m4184G(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: I */
    public static /* synthetic */ void m4185I(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: J */
    public static /* synthetic */ int[] m4186J(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f7466z, 0, iArr, 0, i);
        return iArr;
    }

    /* renamed from: M */
    public static String m4187M(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: N */
    public static String m4188N(String str, int i) {
        return str + i;
    }

    /* renamed from: P */
    public static C1281Y m4189P(String str) {
        return new C1281Y(str).m2622E();
    }

    /* renamed from: Q */
    public static String m4190Q(String str, int i, String str2) {
        return str + i + str2;
    }

    /* renamed from: R */
    public static /* synthetic */ void m4191R(AbstractC2740zk abstractC2740zk) {
        if (abstractC2740zk != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: S */
    public static /* synthetic */ void m4192S() {
    }

    /* renamed from: U */
    public static /* synthetic */ String m4193U(int i) {
        return i == 1 ? "SUSPEND" : i == 2 ? "DROP_OLDEST" : i == 3 ? "DROP_LATEST" : "null";
    }

    /* renamed from: V */
    public static /* synthetic */ Iterator m4194V() {
        try {
            return Arrays.asList(new C1123V1()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* renamed from: W */
    public static String m4195W(String str, String str2) {
        return str + str2;
    }

    /* renamed from: Y */
    public static /* synthetic */ String m4196Y(int i) {
        return i == 1 ? "REMOVED" : i == 2 ? "VISIBLE" : i == 3 ? "GONE" : i == 4 ? "INVISIBLE" : "null";
    }

    /* renamed from: f */
    public static /* synthetic */ String m4197f(int i) {
        return i == 1 ? "BEGIN_ARRAY" : i == 2 ? "END_ARRAY" : i == 3 ? "BEGIN_OBJECT" : i == 4 ? "END_OBJECT" : i == 5 ? "NAME" : i == 6 ? "STRING" : i == 7 ? "NUMBER" : i == 8 ? "BOOLEAN" : i == 9 ? "NULL" : i == 10 ? "END_DOCUMENT" : "null";
    }

    /* renamed from: g */
    public static /* synthetic */ Iterator m4198g() {
        try {
            return Arrays.asList(new C0898Qv()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* renamed from: h */
    public static /* synthetic */ long m4199h(int i) {
        if (i == 1) {
            return 0L;
        }
        if (i == 2) {
            return 1L;
        }
        if (i == 3) {
            return 2L;
        }
        if (i == 4) {
            return 3L;
        }
        if (i == 5) {
            return 4L;
        }
        throw null;
    }

    /* renamed from: k */
    public static String m4200k(String str, String str2) {
        return str + str2;
    }

    /* renamed from: o */
    public static String m4201o(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: q */
    public static /* synthetic */ void m4202q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: r */
    public static /* synthetic */ String m4203r(int i) {
        return i == 1 ? "NONE" : i == 2 ? "ADDING" : i == 3 ? "REMOVING" : "null";
    }

    /* renamed from: s */
    public static /* synthetic */ int m4204s(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* renamed from: u */
    public static String m4205u(String str, long j) {
        return str + j;
    }

    /* renamed from: v */
    public static C1281Y m4206v(C1281Y c1281y, String str, C1281Y c1281y2, String str2) {
        new C1281Y(c1281y, str);
        return new C1281Y(c1281y2, str2);
    }

    /* renamed from: w */
    public static /* synthetic */ void m4207w(InterfaceC1088UM interfaceC1088UM) {
        if (interfaceC1088UM != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: y */
    public static /* synthetic */ void m4208y(Object obj) {
        throw new ClassCastException();
    }

    /* renamed from: z */
    public static final void m4209z(int i, View view) {
        int i2;
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (C0364Gx.m791p(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (C0364Gx.m791p(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            i2 = 0;
        } else if (i3 == 2) {
            if (C0364Gx.m791p(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            i2 = 8;
        } else {
            if (i3 != 3) {
                return;
            }
            if (C0364Gx.m791p(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            i2 = 4;
        }
        view.setVisibility(i2);
    }
}
